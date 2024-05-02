import { Avatar } from '@hilla/react-components/Avatar';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import CheckboxList from 'Frontend/components/checkbox/CheckboxListRC';
import SpeedDialRC from 'Frontend/components/fab/SpeedDialRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import ButtonRC from 'Frontend/components/ho_master/button/ButtonRC';
import ActionTopBtnRC from 'Frontend/components/ho_master/from/ActionTopBtnRC';
import DialogFromRC from 'Frontend/components/ho_master/from/DialogFromRC';
import FromBuilderRC from 'Frontend/components/ho_master/from/FromBuilderRC';
import RoleDto from 'Frontend/generated/com/itbd/application/db/dto/RoleDto';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
import UserDto from 'Frontend/generated/com/itbd/application/db/dto/users/UserDto';
import UserTypeDto from 'Frontend/generated/com/itbd/application/db/dto/users/UserTypeDto';
import UserTypeDtoModel from 'Frontend/generated/com/itbd/application/db/dto/users/UserTypeDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  BlockModuleDtoCrudService,
  DocFieldDtoCrudService,
  HasRoleDtoCrudService,
  ModuleDefDtoCrudService,
  RoleDtoCrudService,
  UserTypeDtoCrudService,
} from 'Frontend/generated/endpoints';
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

function UserTypeView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  //
  const [roles, setRoles] = useState<RoleDto[]>([]);
  const [selectedRoleIds, setSelectedRoleIds] = useState<string[]>([]);
  //
  const [modules, setModules] = useState<ModuleDefDto[]>([]);
  const [selectedModuleIds, setSelectedModuleIds] = useState<string[]>([]);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<UserDto>({} as UserDto);
  const [selectedUserItems, setSelectedUserItems] = useState<UserDto[]>([]);
  const [selectedUserIds, setSelectedUserIds] = useState<string[]>([]);
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
  } = useForm(UserTypeDtoModel, {
    onSubmit: async (userE) => {
      await UserTypeDtoCrudService.save(userE)
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
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'User Type')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  useEffect(() => {
    if (queryId !== undefined)
      HasRoleDtoCrudService.list(pagination, filterGenerator('and', 'parent', queryId)).then(
        (result) => {
          const roleIds: string[] = result
            .map((role) => role.role)
            .filter((it) => it !== undefined) as string[];
          setSelectedRoleIds(roleIds);
        }
      );
    RoleDtoCrudService.list(pagination, undefined).then((result) => {
      setRoles(result);
    });
  }, [queryId]);

  useEffect(() => {
    let blockModule: string[] = [];
    if (queryId !== undefined)
      BlockModuleDtoCrudService.list(pagination, filterGenerator('and', 'parent', queryId)).then(
        (result) => {
          blockModule = result
            .map((role) => role.name)
            .filter((it) => it !== undefined) as string[];
        }
      );
    ModuleDefDtoCrudService.list(pagination, undefined).then((result) => {
      setModules(result);
      const modulesIds: string[] = result
        .map((role) => role.name)
        .filter((it) => it !== undefined && !blockModule.includes(it)) as string[];
      setSelectedModuleIds(modulesIds);
    });
  }, [queryId]);

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
      name: 'Add User',
      icon: <FaUserPlus />,
      onClick: () => {
        clear();
        setSelectedUserItems([]);
        setIsOpen(true);
      },
    },
  ];

  function ChildRedirect({ item }: { item: UserTypeDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline"
        onClick={(e) => {
          setUser(item);
          read(item);
          navigate(`/m/user-type/${name}`);
        }}
      >
        {name}
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
              service={UserTypeDtoCrudService}
              model={UserTypeDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={['name', 'isStandard', 'role']}
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
                isStandard: {
                  header: 'Status',
                  resizable: true,
                },
                role: {
                  header: 'Role',
                  resizable: true,
                },

                // 'floor.name': {
                //   header: 'Floor',
                //   resizable: true,
                //   externalValue: placeFilter.floorFilter != null ? placeFilter.floorFilter.name : ''
                // },
                // 'floor.building.name': {
                //   header: 'Building',
                //   resizable: true,
                //   externalValue: placeFilter.buildingFilter != null ? placeFilter.buildingFilter.name : ''
                // },
              }}
              onSelectedItemsChanged={(e) => {
                const items = e.detail.value;
                setSelectedUserItems(items);
              }}
              onActiveItemChanged={(e) => {
                const item = e.detail.value;
                setSelectedUserItems(item ? [item] : []);
                // read(item);
                // const roleIds: string[] = result
                //   .map((role) => role.name)
                //   .filter((it) => it !== undefined) as string[];
                // setShowSidebar(item?.id !== undefined);
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

  function roleSelect() {
    return (
      <>
        <div />
        <CheckboxList
          items={roles.map((it) => it.name).filter((it) => it !== undefined) as string[]}
          value={selectedRoleIds}
          className="w-full p-2"
          onValueChange={(values) => {
            console.info('newCheckedItems', values);
            setSelectedRoleIds(values);
          }}
        />
      </>
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
          navigate(`/m/user/_`);
        }}
      >
        <div />
      </DialogFromRC>
    </>
  );
}

export default UserTypeView;
