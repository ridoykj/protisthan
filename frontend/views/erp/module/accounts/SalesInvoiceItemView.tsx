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
import SalesInvoiceItemDto from 'Frontend/generated/com/itbd/application/db/dto/sales/SalesInvoiceItemDto';
import SalesInvoiceItemDtoModel from 'Frontend/generated/com/itbd/application/db/dto/sales/SalesInvoiceItemDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  DocFieldDtoCrudService,
  SalesInvoiceItemDtoCrudService,
} from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';
import { FaSortAmountDown, FaTrash, FaUserPlus } from 'react-icons/fa';
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

function SalesInvoiceItemView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<SalesInvoiceItemDto>({} as SalesInvoiceItemDto);
  const [selectedUserItems, setSelectedUserItems] = useState<SalesInvoiceItemDto[]>([]);
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
  } = useForm(SalesInvoiceItemDtoModel, {
    onSubmit: async (userE) => {
      await SalesInvoiceItemDtoCrudService.save(userE)
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
    DocFieldDtoCrudService.list(
      pagination,
      filterGenerator('and', 'parent', 'Sales Invoice Item')
    ).then((result) => {
      setUiField(result);
    });
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
      name: 'Add Account',
      icon: <FaUserPlus />,
      onClick: () => {
        clear();
        setUser({} as SalesInvoiceItemDto);
        setSelectedUserItems([]);
        setIsOpen(true);
      },
    },
  ];

  function ChildRedirect({ item }: { item: SalesInvoiceItemDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline"
        onClick={(e) => {
          setUser(item);
          read(item);
          navigate(`/m/sales-invoice-item/${name}`);
        }}
      >
        {name}
      </button>
    );
  }

  function DeleteRander({ item }: { item: SalesInvoiceItemDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-red-500 hover:underline"
        title="Delete"
        onClick={(e) => {
          SalesInvoiceItemDtoCrudService.delete(name).then((result) => {
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
              service={SalesInvoiceItemDtoCrudService}
              model={SalesInvoiceItemDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={[
                'name',
                'itemCode',
                'itemName',
                'customerItemCode',
                'itemGroup',
                'brand',
                'qty',
                'rate',
                'amount',
                'pricingRules',
                'isFixedAsset',
                'warehouse',
                'targetWarehouse',
                'itemTaxRate',
                'soDetail',
                'dnDetail',
                'idx',
              ]}
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
                itemCode: {
                  header: 'Item',
                  resizable: true,
                },
                itemName: {
                  header: 'Item Name',
                  resizable: true,
                },
                customerItemCode: {
                  header: "Customer's Item Code",
                  resizable: true,
                },
                itemGroup: {
                  header: 'Item Group',
                  resizable: true,
                },
                brand: {
                  header: 'Brand Name',
                  resizable: true,
                },
                qty: {
                  header: 'Quantity',
                  resizable: true,
                },
                rate: {
                  header: 'Rate',
                  resizable: true,
                },
                amount: {
                  header: 'Amount',
                  resizable: true,
                },
                pricingRules: {
                  header: 'Pricing Rules',
                  resizable: true,
                },
                isFixedAsset: {
                  header: 'Is Fixed Asset',
                  resizable: true,
                },
                warehouse: {
                  header: 'Warehouse',
                  resizable: true,
                },
                targetWarehouse: {
                  header: 'Target Warehouse',
                  resizable: true,
                },
                itemTaxRate: {
                  header: 'Item Tax Rate',
                  resizable: true,
                },
                soDetail: {
                  header: 'Sales Order Item',
                  resizable: true,
                },
                dnDetail: {
                  header: 'Delivery Note Item',
                  resizable: true,
                },
                idx: {
                  header: 'Action',
                  filterable: false,
                  sortable: false,
                  resizable: true,
                  renderer: DeleteRander,
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
              // {...field(model.comments)}
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
          navigate(`/m/sales-invoice-item/_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          {/* <TextField label="Customer Name" {...{ colspan: 1 }} {...field(model.accountName)} />
          <TextField label="Customer Type" {...{ colspan: 1 }} {...field(model.parentAccount)} />
          <TextField label="Email Id" {...{ colspan: 1 }} {...field(model.accountType)} />
          <Checkbox label="Mobile Number" {...{ colspan: 1 }} {...field(model.isGroup)} /> */}
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default SalesInvoiceItemView;
