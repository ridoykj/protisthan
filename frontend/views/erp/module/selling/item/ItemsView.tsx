import { Button } from '@hilla/react-components/Button';
import { Dialog } from '@hilla/react-components/Dialog';
import { FormLayout } from '@hilla/react-components/FormLayout';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import SpeedDialRC from 'Frontend/components/fab/SpeedDialRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import ItemDto from 'Frontend/generated/com/itbd/application/db/dto/items/ItemDto';
import ItemDtoModel from 'Frontend/generated/com/itbd/application/db/dto/items/ItemDtoModel';
import { ItemDtoCrudService } from 'Frontend/generated/endpoints';
import React, { useState } from 'react';
import { FaSalesforce, FaSortAmountDown } from 'react-icons/fa';
import { FaArrowsRotate, FaFilter, FaLaptopCode, FaX } from 'react-icons/fa6';
import { NavLink } from 'react-router-dom';

const responsiveSteps = [
  { minWidth: '0', columns: 1 },
  { minWidth: '500px', columns: 2 },
];

function ItemsView() {
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [selectedUserItems, setSelectedUserItems] = useState<ItemDto[]>([]);

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
  } = useForm(ItemDtoModel, {
    onSubmit: async (user) => {
      await ItemDtoCrudService.save(user)
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

  function UserRedirect({ item }: { item: ItemDto }) {
    const { itemName, name } = item;
    return <NavLink to={`${name}`}>{itemName}</NavLink>;
  }

  return (
    <>
      <div className="flex flex-col h-full items-stretch ">
        <div className="inline-flex justify-end space-x-2 w-full p-2 text-sm">
          <button
            type="button"
            className="bg-gray-100 hover:bg-gray-50 text-gray-800 font-semibold rounded-xl py-2 px-4 shadow-md inline-flex items-center"
            title="Refresh"
          >
            <FaArrowsRotate className="fill-current w-4 h-4" />
          </button>
          <button
            type="button"
            className="bg-gray-100 hover:bg-gray-50 text-gray-800 font-semibold rounded-xl py-2 px-4 shadow-md inline-flex items-center"
          >
            <FaFilter className="fill-current w-4 h-4 mr-2" />
            <span>Filter</span>
          </button>
          <button
            type="button"
            className="bg-gray-100 hover:bg-gray-50 text-gray-800 font-semibold rounded-xl py-2 px-4 shadow-md inline-flex items-center"
          >
            <FaSortAmountDown className="fill-current w-4 h-4 mr-2" />
            <span>Sort</span>
          </button>
        </div>
        <div className="h-full">
          <AutoGrid
            service={ItemDtoCrudService}
            model={ItemDtoModel}
            ref={autoGridRef}
            className="h-full w-full overflow-auto bg-white/40"
            visibleColumns={[
              'itemName',
              'disabled',
              'itemCode',
              'itemGroup',
              'stockUom',
              'creation',
              'idx',
            ]}
            selectedItems={selectedUserItems}
            theme="row-stripes"
            // rowNumbers
            multiSelect
            columnOptions={{
              itemName: {
                header: 'Item Name',
                resizable: true,
                renderer: UserRedirect,
              },
              disabled: {
                header: 'Status',
                resizable: true,
              },
              itemCode: {
                header: 'Item Code',
                resizable: true,
              },
              itemGroup: {
                header: 'Item Group',
                resizable: true,
              },
              stockUom: {
                header: 'StockUom',
                resizable: true,
              },
              creation: {
                header: 'Created At',
                resizable: true,
                filterable: false,
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
            onActiveItemChanged={(e) => {
              const item = e.detail.value;
              console.log('item', item);
              setSelectedUserItems(item ? [item] : []);
              // read(item);
              // setShowSidebar(item?.id !== undefined);
            }}
          />
        </div>
      </div>
      <Dialog
        modeless
        draggable
        resizable
        opened={isOpen}
        overlayClass="w-1/2"
        onOpenedChanged={(event) => {
          setIsOpen(event.detail.value);
        }}
        headerRenderer={() => (
          <>
            <h2 className="draggable flex-1 cursor-move margin-0 font-bold text-2xl padding-m-0">
              New User
            </h2>
            <button
              type="button"
              className="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
              onClick={() => {
                setIsOpen(false);
                clear();
              }}
            >
              <FaX /> <span className="sr-only">Close</span>
            </button>
          </>
        )}
        footerRenderer={() => (
          <>
            <NavLink
              to="/item/_"
              className="right-5 top-5 content-end px-4 py-1 hover:no-underline rounded-full border-2 border-gray-500 text-gray-500 hover:bg-gray-500 hover:text-white"
              onClick={() => {
                setIsOpen(false);
                // clear();
              }}
            >
              Edit Full From
            </NavLink>

            {/* <Button className="border-2 border-gray-500 text-gray-500 hover:bg-gray-500 hover:text-white" onClick={() => {
              setIsOpen(false);
              // clear();
            }}>Cancel</Button> */}

            {/* {value.name && <Button className="border-2 border-red-500 text-red-500 hover:bg-red-500 hover:text-white"
              onClick={() => {
                UserDtoCrudService.delete(value.name).then((result) => {
                  setGridRefresh(!gridRefresh);
                  setIsOpen(false);
                  clear();
                });
              }}>Delete</Button>
            } */}
            <Button
              className={`text-white disabled:opacity-75 ${dirty && !invalid ? 'bg-blue-500 hover:bg-blue-700' : 'bg-gray-300'}`}
              disabled={!dirty || invalid}
              onClick={(e) => submit()}
            >
              {value.name != null ? 'Update' : 'Add'}
            </Button>
          </>
        )}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          <TextField label="Email" {...{ colspan: 1 }} {...field(model.itemCode)} />
          <TextField label="First Name" {...{ colspan: 1 }} {...field(model.itemGroup)} />
          <TextField label="Role Profile" {...{ colspan: 1 }} {...field(model.stockUom)} />
        </FormLayout>
      </Dialog>
      <SpeedDialRC
        children={[
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
            name: 'Add Item',
            icon: <FaSalesforce />,
            onClick: () => {
              clear();
              setSelectedUserItems([]);
              setIsOpen(true);
            },
          },
        ]}
      />
    </>
  );
}

export default ItemsView;
