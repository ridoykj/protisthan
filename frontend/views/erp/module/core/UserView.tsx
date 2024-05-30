import { Avatar } from '@hilla/react-components/Avatar';
import {
  ComboBox,
  ComboBoxDataProviderCallback,
  ComboBoxDataProviderParams,
} from '@hilla/react-components/ComboBox.js';
import { FormLayout } from '@hilla/react-components/FormLayout';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import SpeedDialRC from 'Frontend/components/fab/SpeedDialRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import ButtonRC from 'Frontend/components/ho_master/button/ButtonRC';
import ActionTopBtnRC from 'Frontend/components/ho_master/from/ActionTopBtnRC';
import DialogFromRC from 'Frontend/components/ho_master/from/DialogFromRC';
import FromBuilderRC from 'Frontend/components/ho_master/from/FromBuilderRC';
import HasRoleDto from 'Frontend/generated/com/itbd/application/db/dto/HasRoleDto';
import RoleProfileDtoModel from 'Frontend/generated/com/itbd/application/db/dto/RoleProfileDtoModel';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
import ModuleProfileDtoModel from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleProfileDtoModel';
import UserDto from 'Frontend/generated/com/itbd/application/db/dto/users/UserDto';
import UserDtoModel from 'Frontend/generated/com/itbd/application/db/dto/users/UserDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  BlockModuleDtoCrudService,
  DocFieldDtoCrudService,
  HasRoleDtoCrudService,
  ModuleDefDtoCrudService,
  ModuleProfileDtoCrudService,
  RoleProfileDtoCrudService,
  UserDtoCrudService,
} from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import ModulesTable from 'Frontend/tables/ModulesTable';
import RolesTable from 'Frontend/tables/RolesTable';
import React, { useEffect, useMemo, useState } from 'react';
import { FaSortAmountDown, FaTrash, FaUserPlus } from 'react-icons/fa';
import { FaArrowsRotate, FaFilter, FaLaptopCode } from 'react-icons/fa6';
import { useNavigate, useParams } from 'react-router-dom';

const responsiveSteps = [
  { minWidth: '0', columns: 1 },
  { minWidth: '500px', columns: 2 },
];

interface AlterItem {
  new: string[];
  delete: string[];
}

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

function UserView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const [roleAssigned, setRoleAssigned] = useState<HasRoleDto[]>([]);
  const [roleSelected, setRoleSelected] = useState<string[]>([]);
  const [roleAssignedAlter, setRoleAssignedAlter] = useState<AlterItem>({
    new: [],
    delete: [],
  });
  //
  const [modules, setModules] = useState<ModuleDefDto[]>([]);
  const [selectedModuleIds, setSelectedModuleIds] = useState<string[]>([]);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<UserDto>({} as UserDto);
  const [selectedUserItems, setSelectedUserItems] = useState<UserDto[]>([]);
  const [selectedUserIds, setSelectedUserIds] = useState<string[]>([]);
  const [tabChange, setTabChange] = useState<number>(0);

  const [gridRefresh, setGridRefresh] = useState<boolean>(false);

  const [roleProfile, setRoleProfile] = useState<string>('');
  const [moduleProfile, setModuleProfile] = useState<string>('');

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
  } = useForm(UserDtoModel, {
    onSubmit: async (userE) => {
      console.log(roleAssignedAlter);
      await UserDtoCrudService.save(userE)
        .then((result) => {
          // clear();
          setSuccessNotification(true);
          setIsOpen(false);
          setGridRefresh(!gridRefresh);

          HasRoleDtoCrudService.deleteWithNames(roleAssignedAlter.delete).then((deleteItems) => {
            HasRoleDtoCrudService.saveAll(
              roleAssignedAlter.new.map((it) => ({
                parent: userE.name,
                role: it,
                parentType: 'User',
                parentfield: 'roles',
                idx: 0,
              }))
            );
          });
        })
        .catch((error) => {
          setFailureNotification(true);
        });
    },
  });

  useEffect(() => {
    autoGridRef.current?.refresh();
  }, [gridRefresh]);

  function ChildRedirect({ item }: { item: UserDto }) {
    const { fullName, name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline inline-flex items-center gap-2"
        onClick={(e) => {
          setUser(item);
          read(item);
          navigate(`/m/user/${name}`);
        }}
      >
        <img
          src={`images/profile/${name === 'ridoykj@gmail.com' ? 'profile.jpg' : 'default_profile.png'}`}
          className="w-8 h-8 rounded-full"
          alt="not_found"
        />
        {fullName}
      </button>
    );
  }

  function deleteRander({ item }: { item: UserDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-red-500 hover:underline"
        title="Delete"
        onClick={(e) => {
          UserDtoCrudService.delete(item.name).then((result) => {
            setGridRefresh(!gridRefresh);
          });
        }}
      >
        <FaTrash />
      </button>
    );
  }

  useEffect(() => {
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'User')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  const roleProfileProvider = useMemo(
    () =>
      async (
        params: ComboBoxDataProviderParams,
        callback: ComboBoxDataProviderCallback<RoleProfileDtoModel>
      ) => {
        const { page, pageSize, filter } = params;

        const paginationE: Pageable = {
          pageNumber: page,
          pageSize: 7,
          // pageSize,
          sort: {
            orders: [{ property: 'idx', direction: Direction.ASC, ignoreCase: false }],
          },
        };

        const filters: Filter = {
          '@type': 'and',
          children: [
            {
              '@type': 'propertyString',
              propertyId: 'name',
              filterValue: filter,
              matcher: Matcher.CONTAINS,
            },
          ],
        };

        RoleProfileDtoCrudService.list(paginationE, filters).then((result: any) => {
          callback(result, result.length);
        });
      },
    []
  );

  const moduleProfileProvider = useMemo(
    () =>
      async (
        params: ComboBoxDataProviderParams,
        callback: ComboBoxDataProviderCallback<ModuleProfileDtoModel>
      ) => {
        const { page, pageSize, filter } = params;

        const paginationE: Pageable = {
          pageNumber: page,
          pageSize: 7,
          // pageSize,
          sort: {
            orders: [{ property: 'idx', direction: Direction.ASC, ignoreCase: false }],
          },
        };

        const filters: Filter = {
          '@type': 'and',
          children: [
            {
              '@type': 'propertyString',
              propertyId: 'name',
              filterValue: filter,
              matcher: Matcher.CONTAINS,
            },
          ],
        };

        ModuleProfileDtoCrudService.list(paginationE, filters).then((result: any) => {
          callback(result, result.length);
        });
      },
    []
  );

  useEffect(() => {
    if (queryId !== undefined)
      HasRoleDtoCrudService.list(
        pagination,
        filterGenerator('and', 'parent', roleProfile && roleProfile !== '' ? roleProfile : queryId)
      ).then((result) => {
        const roleIds: string[] = result
          .map((role) => role.role)
          .filter((it) => it !== undefined) as string[];
        setRoleSelected(roleIds);
        setRoleAssigned(result);
      });
  }, [queryId, roleProfile]);

  useEffect(() => {
    let blockModuleE: string[] = [];
    if (queryId !== undefined)
      BlockModuleDtoCrudService.list(
        pagination,
        filterGenerator(
          'and',
          'parent',
          moduleProfile && moduleProfile !== '' ? moduleProfile : queryId
        )
      ).then((result) => {
        blockModuleE = result.map((role) => role.name).filter((it) => it !== undefined) as string[];
      });
    ModuleDefDtoCrudService.list(pagination, undefined).then((result) => {
      setModules(result);
      const modulesIds: string[] = result
        .map((role) => role.name)
        .filter((it) => it !== undefined && !blockModuleE.includes(it)) as string[];
      setSelectedModuleIds(modulesIds);
    });
  }, [queryId, moduleProfile]);

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
        setUser({} as UserDto);
        setSelectedUserItems([]);
        setIsOpen(true);
      },
    },
  ];

  function RoleComponent() {
    return (
      <div className="w-full">
        <div className="flex flex-col space-y-2">
          <ComboBox
            dataProvider={roleProfileProvider}
            {...field(model.roleProfileName)}
            label="Role Profile"
            itemLabelPath="name"
            itemValuePath="name"
            className="md:w-1/2 sm:w-full"
            clearButtonVisible
            onValueChanged={(e) => {
              console.info('newCheckedItems', e.detail.value);
              setRoleProfile(e.detail.value);
            }}
          />
          <div className="inline-flex space-x-2">
            <button
              type="button"
              className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
            >
              Sellect All
            </button>
            <button
              type="button"
              className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
            >
              Unsellect All
            </button>
          </div>
        </div>
        <RolesTable
          value={roleSelected}
          setSelectedRole={(itemE) => {
            // console.info('newCheckedItems', itemE);
            setRoleAssignedAlter({
              new: itemE.filter((it) => !roleAssigned.map((itE) => itE.role).includes(it)),
              delete: roleAssigned
                .filter((itE) => itE.role && !itemE.includes(itE.role))
                .map((it) => it.name as string),
            });
            setRoleSelected(itemE);
          }}
        />
      </div>
    );
  }

  function ModuleComponent() {
    return (
      <div>
        <div className="flex flex-col space-y-2">
          <ComboBox
            dataProvider={moduleProfileProvider}
            itemLabelPath="name"
            itemValuePath="name"
            label="Module Profile"
            className="md:w-1/2 sm:w-full"
            clearButtonVisible
            onValueChanged={(e) => {
              setModuleProfile(e.detail.value);
            }}
          />
          <div className="inline-flex space-x-2">
            <button
              type="button"
              className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
            >
              Sellect All
            </button>
            <button
              type="button"
              className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
            >
              Unsellect All
            </button>
          </div>
        </div>
        <ModulesTable
          // value={roleSelected}
          value={selectedModuleIds}
          setSelectedModule={(itemE) => {
            // console.info('newCheckedItems', itemE);
            // setRoleAssignedAlter({
            //   new: itemE.filter((it) => !roleAssigned.map((itE) => itE.role).includes(it)),
            //   delete: roleAssigned
            //     .filter((itE) => itE.role && !itemE.includes(itE.role))
            //     .map((it) => it.name as string),
            // });
            // setRoleSelected(itemE);
          }}
        />
      </div>
    );
  }

  function parentComponent() {
    return (
      <>
        <div className="flex flex-col h-full items-stretch ">
          <ActionTopBtnRC actions={actionBtn} />
          <div className="h-full mx-2 mb-2 bg-white p-3 rounded-xl border">
            <AutoGrid
              service={UserDtoCrudService}
              model={UserDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={[
                'fullName',
                'username',
                'email',
                'unsubscribed',
                'roleProfileName',
                'mobileNo',
                'userType',
                'creation',
                'idx',
              ]}
              selectedItems={selectedUserItems}
              theme="row-stripes"
              // rowNumbers
              multiSelect // Fix: Cast girdField to ColumnOptions
              columnOptions={{
                fullName: {
                  header: 'Full Name',
                  resizable: true,
                  renderer: ChildRedirect,
                },
                username: {
                  header: 'Username',
                  resizable: true,
                },
                email: {
                  header: 'Unsubscribed',
                  resizable: true,
                },
                unsubscribed: {
                  header: 'Unsubscribed',
                  resizable: true,
                },
                roleProfileName: {
                  header: 'Role Profile',
                  resizable: true,
                },
                mobileNo: {
                  header: 'Mobile No',
                  resizable: true,
                },
                userType: {
                  header: 'User Type',
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
                // setUser(item);
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
      <div className="w-full md:px-10 sm:px-0">
        <div className="flex flex-col p-2 items-end">
          <ButtonRC title="Save" onClick={() => submit()} />
        </div>
        <div className="rounded-xl px-3">
          <div className="flex flex-col border rounded-xl shadow-sm">
            <FromBuilderRC
              uiField={uiField}
              field={field}
              model={model}
              tabChange={(tabE) => {
                setTabChange(tabE);
              }}
              custom={{
                roles: RoleComponent(),
                role_profile_name: null,
                block_modules: ModuleComponent(),
                module_profile: null,
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
          navigate(`/m/user/_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          <TextField label="Email" {...{ colspan: 1 }} {...field(model.email)} />
          <TextField label="First Name" {...{ colspan: 1 }} {...field(model.firstName)} />
          <TextField label="Role Profile" {...{ colspan: 1 }} {...field(model.roleProfileName)} />
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default UserView;
