import { AbstractModel } from '@hilla/form';
import { FieldDirective } from '@hilla/react-form';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';

import { Tab } from '@headlessui/react';
import RippleDivRC from 'Frontend/components/effects/ripple/div/RippleDivRC';
import FieldDataFormatter from './FieldFormatterRC';
import FieldRC from './FieldRC';

function classNames(...classes: string[]) {
  return classes.filter(Boolean).join(' ');
}

export interface FromBuilderRCProps {
  uiField: DocFieldDto[];
  field: FieldDirective;
  model: AbstractModel;
  tabChange?: (index: number) => void;
}

function TabHeader({ title }: { title: string }) {
  return (
    <RippleDivRC className="w-full rounded-lg">
      <Tab
        className={({ selected }) =>
          classNames(
            'w-full h-full rounded-lg py-2.5 text-sm font-semibold leading-5',
            'ring-white/60 ring-offset-2 ring-offset-indigo-400 focus:outline-none focus:ring-2',
            selected
              ? 'bg-white text-indigo-700 shadow'
              : 'text-indigo-100 hover:bg-white/[0.12] hover:text-white'
          )
        }
      >
        {title}
      </Tab>
    </RippleDivRC>
  );
}

function TabPaneE({ children }: { children?: React.ReactNode }) {
  return (
    <Tab.Panel className={classNames('rounded-xl bg-white p-3', 'ring-white/60 ring-offset-')}>
      {children}
    </Tab.Panel>
  );
}

function FromBuilderRC({ uiField, field, model, tabChange }: FromBuilderRCProps) {
  if (uiField.length !== 0) {
    const fieldContent = FieldDataFormatter({ fieldData: uiField });
    const header = () => {
      return (
        <>
          {fieldContent.map((tabE, index) => {
            let title = '';
            if (tabE.name.length !== 0) {
              title = tabE.name;
            } else if (fieldContent.length > 1) {
              title = 'Details';
            }
            return (
              <TabHeader
                key={tabE.name.length > 0 ? tabE.name.length : `tabH-${index}`}
                title={title}
              />
            );
          })}
        </>
      );
    };
    const body = () => {
      return (
        <>
          {fieldContent.map((tab, tIndex) => {
            return (
              <TabPaneE key={tab.name.length === 0 ? `tab-${tIndex}` : tab.name}>
                {tab.sections.map((section, sIndex) => {
                  return (
                    <fieldset
                      key={section.name.length === 0 ? `section-${sIndex}` : section.name}
                      className="flex flex-col border border-gray-300 p-2 rounded-lg m-2"
                    >
                      <legend
                        className={`${section.name.length > 0 ? 'font-bold text-lg text-gray-800' : 'hidden'}`}
                      >
                        {section.name}
                      </legend>
                      <div className="grid grid-rows-1 md:grid-cols-2 lg:grid-cols-4 gap-4">
                        {section.columns.map((column, cIndex) => {
                          return (
                            <div
                              key={column.name.length === 0 ? `column-${cIndex}` : column.name}
                              className="flex flex-col"
                            >
                              {column.items.map((item) => {
                                return (
                                  <FieldRC
                                    key={item.field.fieldName}
                                    className="w-full"
                                    item={item.field}
                                    field={field}
                                    model={model}
                                  />
                                );
                              })}
                            </div>
                          );
                        })}
                      </div>
                    </fieldset>
                  );
                })}
              </TabPaneE>
            );
          })}
          {/* {onChange && onChange()} */}
        </>
      );
    };
    return (
      <div>
        <Tab.Group onChange={tabChange}>
          {/* <Tab.Group> */}
          <Tab.List
            className={`flex space-x-1 rounded-xl bg-indigo-700 p-1 ${fieldContent.length <= 1 ? 'hidden' : ''}`}
          >
            {header}
          </Tab.List>
          <Tab.Panels className="mt-2">{body}</Tab.Panels>
        </Tab.Group>
      </div>
    );
  }
  return null;
}

export default FromBuilderRC;
