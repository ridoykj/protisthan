import { Avatar } from '@hilla/react-components/Avatar';
import { FormLayout } from '@hilla/react-components/FormLayout';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import SpeedDialRC from 'Frontend/components/fab/SpeedDialRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import ButtonRC from 'Frontend/components/ho_master/button/ButtonRC';
import ActionTopBtnRC from 'Frontend/components/ho_master/from/ActionTopBtnRC';
import DialogFromRC from 'Frontend/components/ho_master/from/DialogFromRC';
import FromBuilderRC from 'Frontend/components/ho_master/from/FromBuilderRC';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import UomDto from 'Frontend/generated/com/itbd/application/db/dto/uoms/UomDto';
import UomDtoModel from 'Frontend/generated/com/itbd/application/db/dto/uoms/UomDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  CustomerDtoCrudService,
  DocFieldDtoCrudService,
  UomDtoCrudService,
} from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';
import { FaSortAmountDown, FaTrash, FaUserPlus } from 'react-icons/fa';
import { FaArrowsRotate, FaFilter } from 'react-icons/fa6';
import { useNavigate, useParams } from 'react-router-dom';

const responsiveSteps = [
  { minWidth: '0', columns: 1 },
  { minWidth: '500px', columns: 2 },
];

const pagination: Pageable = {
  pageNumber: 0,
  pageSize: 1000,
  sort: {
    orders: [{ property: 'idx', direction: Direction.ASC, ignoreCase: false }],
  },
};
function filterGenerator(type: string, property: string, filter: string | undefined) {
  const filters: Filter = {
    '@type': type,
    children: [
      {
        '@type': 'propertyString',
        propertyId: property,
        filterValue: filter,
        matcher: Matcher.EQUALS,
      },
    ],
  };
  return filters;
}

function UomView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<UomDto>({} as UomDto);
  const [selectedUserItems, setSelectedUserItems] = useState<UomDto[]>([]);

  const [tabChange, setTabChange] = useState<number>(0);
  const [gridRefresh, setGridRefresh] = useState<boolean>(false);

  const {
    model,
    field,
    value,
    read,
    submit,
    clear,
    reset,
    visited,
    dirty,
    invalid,
    submitting,
    validate,
    addValidator,
  } = useForm(UomDtoModel, {
    onSubmit: async (userE) => {
      await UomDtoCrudService.save(userE)
        .then((result) => {
          clear();
          setSuccessNotification(true);
          setIsOpen(false);
          setGridRefresh(!gridRefresh);
        })
        .catch((error) => {
          setFailureNotification(true);
        });
    },
  });

  useEffect(() => {
    autoGridRef.current?.refresh();
  }, [gridRefresh]);
  useEffect(() => {
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'uom')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  const actionBtn = [
    {
      children: <FaArrowsRotate size={15} />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      title: 'Filter',
      children: <FaFilter size={15} />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      title: 'Sort',
      children: <FaSortAmountDown size={15} />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
  ];

  const speedDial = [
    {
      name: 'Add Customer',
      icon: <FaUserPlus />,
      onClick: () => {
        clear();
        setUser({} as UomDto);
        setSelectedUserItems([]);
        setIsOpen(true);
      },
    },
  ];

  function ChildRedirect({ item }: { item: UomDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline inline-flex items-center gap-2"
        onClick={(e) => {
          setUser(item);
          read(item);
          navigate(`/m/uom/${name}`);
        }}
      >
        {name}
      </button>
    );
  }

  function deleteRander({ item }: { item: UomDto }) {
    return (
      <button
        type="button"
        className="text-red-500 hover:underline"
        title="Delete"
        onClick={(e) => {
          CustomerDtoCrudService.delete(item.name).then((result) => {
            setGridRefresh(!gridRefresh);
          });
        }}
      >
        <FaTrash />
      </button>
    );
  }

  function parentComponent() {
    return (
      <>
        <div className="flex flex-col h-full items-stretch ">
          <ActionTopBtnRC actions={actionBtn} />
          <div className="h-full mx-2 mb-2 bg-white p-3 rounded-xl border">
            <AutoGrid
              service={UomDtoCrudService}
              model={UomDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={['name', 'enabled', 'uomName', 'idx']}
              selectedItems={selectedUserItems}
              theme="row-stripes"
              // rowNumbers
              multiSelect
              columnOptions={{
                name: {
                  header: 'ID',
                  resizable: true,
                  renderer: ChildRedirect,
                },
                enabled: {
                  header: 'Status',
                  resizable: true,
                },
                uomName: {
                  header: 'UOM Name',
                  resizable: true,
                },
                idx: {
                  header: 'Action',
                  filterable: false,
                  sortable: false,
                  resizable: true,
                  renderer: deleteRander,
                },
              }}
              onSelectedItemsChanged={(e) => {
                const items = e.detail.value;
                setSelectedUserItems(items);
              }}
              onActiveItemChanged={(e) => {
                const item = e.detail.value;
                setSelectedUserItems(item ? [item] : []);
              }}
            />
          </div>
        </div>
        <SpeedDialRC children={speedDial} />
      </>
    );
  }

  useEffect(() => {
    read(value);
  }, [tabChange]);
  function childComponent() {
    return (
      <div className="w-full md:px-10 sm:px-0 ">
        <div className="flex flex-col p-2 items-end">
          <ButtonRC title="Save" onClick={() => submit()} />
        </div>
        <div className="rounded-xl px-3">
          <div className="flex flex-col p-2 border rounded-xl shadow-sm">
            <FromBuilderRC
              uiField={uiField}
              field={field}
              model={model}
              tabChange={(tabE) => {
                setTabChange(tabE);
              }}
            />
          </div>
        </div>

        <div className="flex flex-col m-2">
          <span className="font-bold text-lg">Comments</span>
          <div className="inline-flex space-x-4 p-2 items-center">
            <Avatar />
            <TextField
              placeholder="Type a reply / comment"
              {...field(model.comments)}
              className="w-full"
            />
          </div>
          <span className="font-bold text-lg">Activity</span>
        </div>
        <div className="h-8" />
      </div>
    );
  }

  function switchComponent() {
    if ((value.name !== undefined && queryId !== undefined) || queryId === '_') {
      return childComponent();
    }
    return parentComponent();
  }

  return (
    <>
      {switchComponent()}
      <DialogFromRC
        header="Add User"
        opened={isOpen}
        submitDisabled={!dirty || invalid || submitting}
        submit={submit}
        update={value.name != null}
        onOpenedChanged={(event) => {
          setIsOpen(event);
          clear();
        }}
        onNavigate={() => {
          setIsOpen(false);
          clear();
          navigate(`/m/uom/_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          <TextField label="Warehouse Name" required {...{ colspan: 1 }} {...field(model.name)} />
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default UomView;