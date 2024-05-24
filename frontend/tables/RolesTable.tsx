import { Dialog } from '@hilla/react-components/Dialog.js';
import CheckboxList from 'Frontend/components/checkbox/CheckboxListRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import RoleDto from 'Frontend/generated/com/itbd/application/db/dto/RoleDto';
import DocPermDtoModel from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocPermDtoModel';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { DocPermDtoCrudService, RoleDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';

import React, { useEffect, useState } from 'react';
import { FaX } from 'react-icons/fa6';

interface RoleProps {
  value: string[];
  setSelectedRole: (value: string[]) => void;
}

function RolesTable({ value, setSelectedRole }: RoleProps) {
  const [isOpen, setIsOpen] = useState<boolean>(false);

  const [roles, setRoles] = useState<RoleDto[]>([]);
  const [lableClick, setLableClick] = useState<string>();

  const autoGridRef = React.useRef<AutoGridRef>(null);

  useEffect(() => {
    const pagination: Pageable = {
      pageNumber: 0,
      pageSize: 1000,
      sort: {
        orders: [{ property: 'name', direction: Direction.ASC, ignoreCase: false }],
      },
    };

    RoleDtoCrudService.list(pagination, undefined).then((result) => {
      setRoles(result);
    });
  }, []);

  // function refreshGrid() {
  //   autoGridRef.current?.refresh();
  // }
  return (
    <>
      <CheckboxList
        items={roles.map((it) => it.name).filter((it) => it !== undefined) as string[]}
        value={value}
        lableClick
        className="w-full p-2"
        onValueChange={(values) => {
          setSelectedRole(values);
        }}
        onLabelClick={(item) => {
          console.log(item);
          setLableClick(item);
          setIsOpen(true);
        }}
      />

      <Dialog
        modeless
        draggable
        resizable
        opened={isOpen}
        onOpenedChanged={(event) => setIsOpen(event.detail.value)}
        headerRenderer={() => (
          <>
            <h2 className="draggable flex-1 cursor-move margin-0 font-bold text-2xl padding-m-0 w-full">
              {lableClick}
            </h2>
            <button
              type="button"
              className="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
              onClick={() => {
                setIsOpen(false);
              }}
            >
              <FaX /> <span className="sr-only">Close</span>
            </button>
          </>
        )}
      >
        <div className="flex flex-row min-w-[50rem] w-full min-h-[40rem] h-full ">
          <AutoGrid
            service={DocPermDtoCrudService}
            model={DocPermDtoModel}
            ref={autoGridRef}
            className="h-full"
            visibleColumns={[
              'parent',
              'role',
              'permLevel',
              'ifOwner',
              'select',
              'read',
              'write',
              'create',
              'delete',
              'submit',
              'cancel',
              'amend',
              'report',
              'imports',
              'export',
              'print',
              'email',
              'share',
            ]}
            theme="row-stripes"
            columnOptions={{
              parent: {
                header: 'Document',
                frozen: true,
                resizable: true,
                filterable: false,
                sortable: false,
              },
              role: {
                header: 'Role',
                resizable: true,
                externalValue: lableClick != null ? lableClick : '',
              },
              permLevel: {
                filterable: false,
                sortable: false,
              },
              ifOwner: {
                filterable: false,
                sortable: false,
              },
              select: {
                filterable: false,
                sortable: false,
              },
              read: {
                filterable: false,
                sortable: false,
              },
              write: {
                filterable: false,
                sortable: false,
              },
              create: {
                filterable: false,
                sortable: false,
              },
              delete: {
                filterable: false,
                sortable: false,
              },
              submit: {
                filterable: false,
                sortable: false,
              },
              cancel: {
                filterable: false,
                sortable: false,
              },
              amend: {
                filterable: false,
                sortable: false,
              },
              report: {
                filterable: false,
                sortable: false,
              },
              imports: {
                filterable: false,
                sortable: false,
              },
              export: {
                filterable: false,
                sortable: false,
              },
              print: {
                filterable: false,
                sortable: false,
              },
              email: {
                filterable: false,
                sortable: false,
              },
              share: {
                filterable: false,
                sortable: false,
              },
            }}
          />
        </div>
      </Dialog>
    </>
  );
}

export default RolesTable;
