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
import ModuleProfileDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleProfileDto';
import ModuleProfileDtoModel from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleProfileDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { DocFieldDtoCrudService, ModuleProfileDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';
import { FaSortAmountDown, FaUserPlus } from 'react-icons/fa';
import { FaArrowsRotate, FaFilter, FaLaptopCode } from 'react-icons/fa6';
import { useNavigate, useParams } from 'react-router-dom';

const responsiveSteps = [
  { minWidth: '0', columns: 1 },
  { minWidth: '500px', columns: 2 },
];

const pagination: Pageable = {
  pageNumber: 0,
  pageSize: 50,
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

function ModuleProfileView() {
  const { queryId } = useParams();
  const navigate = useNavigate();

  const [gridRefresh, setGridRefresh] = useState<boolean>(false);

  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [selectedUserItems, setSelectedUserItems] = useState<ModuleProfileDto[]>([]);

  const [selectedRole, setSelectedRole] = useState<ModuleProfileDto>({} as ModuleProfileDto);
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);

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
  } = useForm(ModuleProfileDtoModel, {
    onSubmit: async (roleE) => {
      await ModuleProfileDtoCrudService.save(roleE)
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
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'Role Profile')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  function ChildRedirect({ item }: { item: ModuleProfileDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline"
        onClick={(e) => {
          setSelectedRole(item);
          read(item);
          navigate(`/m/role-profile/${name}`);
        }}
      >
        {name}
      </button>
    );
  }

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
      name: 'Import',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'User Permissions',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'Role Permissions Manager',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'Customize',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'Toggle Sidebar',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'List Settings',
      icon: <FaLaptopCode />,
      onClick: () => {
        setSelectedUserItems([]);
      },
    },
    {
      name: 'Add Role',
      icon: <FaUserPlus />,
      onClick: () => {
        clear();
        setSelectedUserItems([]);
        setIsOpen(true);
      },
    },
  ];

  function parentComponent() {
    return (
      <>
        <div className="flex flex-col h-full items-stretch ">
          <ActionTopBtnRC actions={actionBtn} />
          <div className="h-full mx-2 mb-2 bg-white p-3 rounded-xl border">
            <AutoGrid
              service={ModuleProfileDtoCrudService}
              model={ModuleProfileDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={['name', 'roleProfile']}
              selectedItems={selectedUserItems}
              theme="row-stripes"
              // rowNumbers
              multiSelect
              columnOptions={{
                roleProfile: {
                  header: 'Role Name',
                  resizable: true,
                },
                name: {
                  header: 'ID',
                  resizable: true,
                  renderer: ChildRedirect,
                },
                isCustom: {
                  header: 'Is Custom',
                  resizable: true,
                },
                creation: {
                  header: 'Created At',
                  resizable: true,
                  filterable: false,
                },
              }}
              onActiveItemChanged={(e) => {
                const item = e.detail.value;
                // console.log('item', item);
                setSelectedUserItems(item ? [item] : []);
                // read(item);
                // setShowSidebar(item?.id !== undefined);
              }}
            />
          </div>
        </div>
        <SpeedDialRC children={speedDial} />
      </>
    );
  }

  function childComponent() {
    return (
      <div className="w-full md:px-10 sm:px-0 ">
        <div className="flex flex-col p-2 items-end">
          <ButtonRC title="Save" onClick={() => submit()} />
        </div>
        <div className="rounded-xl px-3">
          <div className="flex flex-col p-2 border rounded-xl shadow-sm">
            <FromBuilderRC uiField={uiField} field={field} model={model} />
          </div>
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
          navigate(`/m/role/_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          <TextField label="Email" {...{ colspan: 1 }} {...field(model.name)} />
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default ModuleProfileView;
