import { AbstractModel } from '@hilla/form';
import { FieldDirective } from '@hilla/react-form';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';

import { Tab } from '@headlessui/react';
import FieldDataFormatter from './FieldFormatterRC';
import FieldRC from './FieldRC';

function classNames(...classes: string[]) {
  return classes.filter(Boolean).join(' ');
}

export interface FromBuilderRCProps {
  uiField: DocFieldDto[];
  field: FieldDirective;
  model: AbstractModel;
}

function TabHeader({ title }: { title: string }) {
  return (
    <Tab
      className={({ selected }) =>
        classNames(
          'w-full rounded-lg py-2.5 text-sm font-semibold leading-5',
          'ring-white/60 ring-offset-2 ring-offset-indigo-400 focus:outline-none focus:ring-2',
          selected
            ? 'bg-white text-indigo-700 shadow'
            : 'text-indigo-100 hover:bg-white/[0.12] hover:text-white'
        )
      }
    >
      {title}
    </Tab>
  );
}

function TabPaneE({ children }: { children?: React.ReactNode }) {
  return (
    <Tab.Panel
      className={classNames(
        'rounded-xl bg-white p-3',
        'ring-white/60 ring-offset-2 ring-offset-blue-400 focus:outline-none focus:ring-2'
      )}
    >
      {children}
    </Tab.Panel>
  );
}

function FromBuilderRC({ uiField, field, model }: FromBuilderRCProps) {
  if (uiField.length !== 0) {
    const fieldContent = FieldDataFormatter({ fieldData: uiField });
    return (
      <div>
        <Tab.Group>
          <Tab.List
            className={`flex space-x-1 rounded-xl bg-indigo-700 p-1 ${fieldContent.length <= 1 ? 'hidden' : ''}`}
          >
            {fieldContent.map((category) => (
              <TabHeader key={category.name} title={category.name} />
            ))}
          </Tab.List>
          <Tab.Panels className="mt-2">
            {fieldContent.map((tab, tIndex) => {
              return (
                <TabPaneE key={tab.name.length === 0 ? `tab-${tIndex}` : tab.name}>
                  {tab.sections.map((section) => {
                    return (
                      <div key={section.name} className="flex flex-col divide-y-2">
                        {section.name.length > 0 ? (
                          <span className="font-semibold text-sm pt-4">{section.name}</span>
                        ) : null}
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
                                      formController={{ uiField, field, model }}
                                    />
                                  );
                                })}
                              </div>
                            );
                          })}
                        </div>
                      </div>
                    );
                  })}
                </TabPaneE>
              );
            })}
          </Tab.Panels>
        </Tab.Group>
      </div>
    );
  }
  return null;
}

export default FromBuilderRC;
