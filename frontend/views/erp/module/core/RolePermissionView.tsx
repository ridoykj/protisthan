import {
  ComboBox,
  ComboBoxDataProviderCallback,
  ComboBoxDataProviderParams,
} from '@hilla/react-components/ComboBox.js';
import {
  Grid,
  GridDataProviderCallback,
  GridDataProviderParams,
} from '@hilla/react-components/Grid.js';
import { GridSortColumn } from '@hilla/react-components/GridSortColumn.js';
import { AutoGridRef } from 'Frontend/components/grid/autogrid';
import RoleProfileDtoModel from 'Frontend/generated/com/itbd/application/db/dto/RoleProfileDtoModel';
import DocPermDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocPermDto';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { DocPermDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';

import React, { useEffect, useMemo, useState } from 'react';
import { FaTrash } from 'react-icons/fa';

interface PermissionState {
  name: string;
  select: boolean;
  read: boolean;
  write: boolean;
  create: boolean;
  delete: boolean;
  print: boolean;
  email: boolean;
  report: boolean;
  import: boolean;
  export: boolean;
  share: boolean;
}

function RolePermissionView() {
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [gridRefresh, setGridRefresh] = useState<boolean>(false);
  const [docPermSelect, setDocPermSelect] = useState<DocPermDto>({} as DocPermDto);

  const [documentType, setDocumentType] = useState<string>('');
  const [roleProfile, setRoleProfile] = useState<string>('');
  useEffect(() => {
    autoGridRef.current?.refresh();
  }, [gridRefresh]);

  function queryFilter(params: ComboBoxDataProviderParams, fieldName: string): [Pageable, Filter] {
    const { page, pageSize, filter: filterE } = params;

    const pagination: Pageable = {
      pageNumber: page,
      pageSize,
      sort: {
        orders: [{ property: 'idx', direction: Direction.ASC, ignoreCase: false }],
      },
    };

    const filter: Filter = {
      '@type': 'and',
      children: [
        {
          '@type': 'propertyString',
          propertyId: fieldName,
          filterValue: filterE,
          matcher: Matcher.CONTAINS,
        },
      ],
    };
    return [pagination, filter];
  }

  function lazyCount(params: ComboBoxDataProviderParams, count: number) {
    const size = (params.page + (count < params.pageSize ? 0 : 1)) * params.pageSize;
    return size + count;
  }

  const documentTypeProvider = useMemo(
    () =>
      async (
        params: ComboBoxDataProviderParams,
        callback: ComboBoxDataProviderCallback<RoleProfileDtoModel>
      ) => {
        const [pagination, filter] = queryFilter(params, 'parent');
        DocPermDtoCrudService.docType(pagination, params.filter).then((result: any) => {
          callback(result, lazyCount(params, result.length));
        });
      },
    []
  );
  const roleProfileProvider = useMemo(
    () =>
      async (
        params: ComboBoxDataProviderParams,
        callback: ComboBoxDataProviderCallback<RoleProfileDtoModel>
      ) => {
        const [pagination, filter] = queryFilter(params, 'role');
        DocPermDtoCrudService.roleProfile(pagination, params.filter).then((result: any) => {
          callback(result, lazyCount(params, result.length));
        });
      },
    []
  );

  const gridDataProvider = useMemo(
    () =>
      async (
        params: GridDataProviderParams<RoleProfileDtoModel>,
        callback: GridDataProviderCallback<RoleProfileDtoModel>
      ) => {
        const { page, pageSize, sortOrders } = params;

        const pagination: Pageable = {
          pageNumber: page,
          pageSize,
          sort: {
            orders: sortOrders.map((sortOrder) => ({
              property: sortOrder.path,
              direction: sortOrder.direction as Direction, // Cast the direction to type 'Direction'
              ignoreCase: false,
            })),
          },
        };

        const filter: Filter = {
          '@type': roleProfile !== '' && documentType !== '' ? 'and' : 'or',
          children: [
            {
              '@type': 'propertyString',
              propertyId: 'parent',
              filterValue: documentType,
              matcher: Matcher.EQUALS,
            },
            {
              '@type': 'propertyString',
              propertyId: 'role',
              filterValue: roleProfile,
              matcher: Matcher.EQUALS,
            },
          ],
        };

        DocPermDtoCrudService.list(pagination, filter).then((result: any) => {
          const size = (params.page + (result.length < params.pageSize ? 0 : 1)) * params.pageSize;
          callback(result, size + result.length);
        });
      },
    [roleProfile, documentType]
  );

  function OwnerCheckRender({ item }: { item: DocPermDto }) {
    const { name, role, ifOwner } = item;
    const [ifOwnerValue, setIfOwnerValue] = useState<boolean>(ifOwner ?? false);
    return (
      <div className="flex flex-col gap-2">
        <span>{role}</span>
        <label htmlFor={`checkbox-${name}`} className="cursor-pointer label space-x-2">
          <input
            type="checkbox"
            className="accent-indigo-500 cursor-pointer"
            id={`checkbox-${name}`}
            checked={ifOwnerValue}
            onChange={() => {
              setIfOwnerValue(!ifOwnerValue);
              console.log('clicked');
            }}
          />
          <span className="label-text">Only If Creator</span>
        </label>
      </div>
    );
  }

  function PermissonCheckBox({ item }: { item: DocPermDto }) {
    const { name } = item;
    const [permissions, setPermissions] = useState<PermissionState>({
      name: item.name ?? '',
      select: item.select ?? false,
      read: item.read ?? false,
      write: item.write ?? false,
      create: item.create ?? false,
      delete: item.delete ?? false,
      print: item.print ?? false,
      email: item.email ?? false,
      report: item.report ?? false,
      import: item.imports ?? false,
      export: item.export ?? false,
      share: item.share ?? false,
    });

    useEffect(() => {
      DocPermDtoCrudService.save({ ...item, ...permissions }).then((result) => {
        // setGridRefresh(!gridRefresh);
        console.log('permissions', permissions);
      });
    }, [permissions]);
    return (
      <ul className="grid grid-cols-1 md:grid-cols-3 gap-2 w-full">
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-select`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-select`}
              name={`checkbox-${item.name}`}
              checked={permissions.select}
              onChange={() => {
                setPermissions({ ...permissions, select: !permissions.select });
                console.log('clicked');
              }}
            />
            <span className="label-text">Select</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-read`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-read`}
              name={`checkbox-${item.name}`}
              checked={permissions.read}
              onChange={() => {
                setPermissions({ ...permissions, read: !permissions.read });
                console.log('clicked');
              }}
            />
            <span className="label-text">Read</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-write`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-write`}
              name={`checkbox-${item.name}`}
              checked={permissions.write}
              onChange={() => {
                setPermissions({ ...permissions, write: !permissions.write });
                console.log('clicked');
              }}
            />
            <span className="label-text">Write</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-create`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-create`}
              name={`checkbox-${item.name}`}
              checked={permissions.create}
              onChange={() => {
                setPermissions({ ...permissions, create: !permissions.create });
                console.log('clicked');
              }}
            />
            <span className="label-text">Create</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-delete`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-delete`}
              name={`checkbox-${item.name}`}
              checked={permissions.delete}
              onChange={() => {
                setPermissions({ ...permissions, delete: !permissions.delete });
                console.log('clicked');
              }}
            />
            <span className="label-text">Delete</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-print`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-print`}
              name={`checkbox-${item.name}`}
              checked={permissions.print}
              onChange={() => {
                setPermissions({ ...permissions, print: !permissions.print });
                console.log('clicked');
              }}
            />
            <span className="label-text">Print</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-email`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-email`}
              name={`checkbox-${item.name}`}
              checked={permissions.email}
              onChange={() => {
                setPermissions({ ...permissions, email: !permissions.email });
                console.log('clicked');
              }}
            />
            <span className="label-text">Email</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-report`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-report`}
              name={`checkbox-${item.name}`}
              checked={permissions.report}
              onChange={() => {
                setPermissions({ ...permissions, report: !permissions.report });
                console.log('clicked');
              }}
            />
            <span className="label-text">Report</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-import`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-import`}
              name={`checkbox-${item.name}`}
              checked={permissions.import}
              onChange={() => {
                setPermissions({ ...permissions, import: !permissions.import });
                console.log('clicked');
              }}
            />
            <span className="label-text">Import</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-export`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-export`}
              name={`checkbox-${item.name}`}
              checked={permissions.export}
              onChange={() => {
                setPermissions({ ...permissions, export: !permissions.export });
                console.log('clicked');
              }}
            />
            <span className="label-text">Export</span>
          </label>
        </li>
        <li className="flex items-center me-4">
          <label htmlFor={`checkbox-${name}-share`} className="cursor-pointer label space-x-1">
            <input
              type="checkbox"
              className="accent-indigo-500 cursor-pointer"
              id={`checkbox-${name}-share`}
              name={`checkbox-${item.name}`}
              checked={permissions.share}
              onChange={() => {
                setPermissions({ ...permissions, share: !permissions.share });
                console.log('clicked');
              }}
            />
            <span className="label-text">Share</span>
          </label>
        </li>
      </ul>
    );
  }

  function PermissionRender({ item }: { item: DocPermDto }) {
    const { name } = item;
    return (
      <div className="flex flex-row gap-2 items-center w-full">
        <div className="p-2 grow ">
          <PermissonCheckBox item={item} />
        </div>
        <button
          type="button"
          className="text-red-500 hover:underline rounded-full p-2 bg-red-100 hover:bg-red-200 hover:text-red-600 hover:shadow-lg hover:ring-2 ring-red-200 ring-opacity-50"
          title="Delete"
          onClick={(e) => {
            // DocPermDtoCrudService.delete(item.name).then((result) => {
            //   setGridRefresh(!gridRefresh);
            // });
          }}
        >
          <FaTrash />
        </button>
      </div>
    );
  }

  return (
    <div className="flex flex-col w-full h-full px-4">
      <div className="flex flex-row gap-4">
        <ComboBox
          dataProvider={documentTypeProvider}
          label="Document Type"
          itemLabelPath="parent"
          itemValuePath="parent"
          className="w-full md:w-80"
          // className="md:w-1/2 sm:w-full"
          clearButtonVisible
          onValueChanged={(e) => {
            console.info('newCheckedItems', e.detail.value);
            // setRoleProfile(e.detail.value);
            setDocumentType(e.detail.value);
          }}
        />
        <ComboBox
          dataProvider={roleProfileProvider}
          label="Role Profile"
          itemLabelPath="role"
          itemValuePath="role"
          className="w-full md:w-80"
          clearButtonVisible
          onValueChanged={(e) => {
            console.info('newCheckedItems', e.detail.value);
            // setRoleProfile(e.detail.value);
            setRoleProfile(e.detail.value);
          }}
        />
      </div>
      <Grid
        dataProvider={gridDataProvider}
        className="w-full h-full bg-white/40 rounded-lg"
        theme="row-stripes"
      >
        <GridSortColumn path="parent" header="Document Type" />
        <GridSortColumn
          path="role"
          header="Role Profile"
          renderer={(item) => OwnerCheckRender(item)}
        />
        <GridSortColumn
          path="permLevel"
          header="Level"
          flexGrow={0}
          renderer={(item) => {
            const { permLevel } = item.item;
            return <span className="font-bold">{permLevel}</span>;
          }}
        />
        <GridSortColumn
          path="idx"
          header="Permission"
          flexGrow={1}
          renderer={(item) => PermissionRender(item)}
        />
      </Grid>
    </div>
  );
}

export default RolePermissionView;
