import { FormLayout } from '@hilla/react-components/FormLayout';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import SpeedDialRC from 'Frontend/components/fab/SpeedDialRC';
import { AutoGrid, AutoGridRef } from 'Frontend/components/grid/autogrid';
import ButtonRC from 'Frontend/components/ho_master/button/ButtonRC';
import ActionTopBtnRC from 'Frontend/components/ho_master/from/ActionTopBtnRC';
import DialogFromRC from 'Frontend/components/ho_master/from/DialogFromRC';
import FromBuilderRC from 'Frontend/components/ho_master/from/FromBuilderRC';
import CouponCodeDto from 'Frontend/generated/com/itbd/application/db/dto/CouponCodeDto';
import CouponCodeDtoModel from 'Frontend/generated/com/itbd/application/db/dto/CouponCodeDtoModel';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import UomDto from 'Frontend/generated/com/itbd/application/db/dto/uoms/UomDto';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  CouponCodeDtoCrudService,
  DocFieldDtoCrudService,
  UomDtoCrudService,
} from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';
import { FaCarrot, FaSortAmountDown, FaTrash } from 'react-icons/fa';
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

function CouponCodeView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<CouponCodeDto>({} as CouponCodeDto);
  const [selectedCouponCodes, setSelectedCouponCodes] = useState<CouponCodeDto[]>([]);
  const [selectUom, setSelectUom] = useState<UomDto[]>([]);
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
  } = useForm(CouponCodeDtoModel, {
    onSubmit: async (itemE) => {
      await CouponCodeDtoCrudService.save(itemE)
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
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'Coupon Code')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  useEffect(() => {
    UomDtoCrudService.list(pagination, undefined).then((uomE) => {
      setSelectUom(uomE);
    });
  }, []);

  const actionBtn = [
    {
      children: <FaArrowsRotate size={15} />,
      onClick: () => {
        setSelectedCouponCodes([]);
      },
    },
    {
      title: 'Filter',
      children: <FaFilter size={15} />,
      onClick: () => {
        setSelectedCouponCodes([]);
      },
    },
    {
      title: 'Sort',
      children: <FaSortAmountDown size={15} />,
      onClick: () => {
        setSelectedCouponCodes([]);
      },
    },
  ];

  const speedDial = [
    // {
    //   name: 'Import',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    // {
    //   name: 'User Permissions',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    // {
    //   name: 'Role Permissions Manager',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    // {
    //   name: 'Customize',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    // {
    //   name: 'Toggle Sidebar',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    // {
    //   name: 'List Settings',
    //   icon: <FaLaptopCode />,
    //   onClick: () => {
    //     setSelectedUserCouponCodes([]);
    //   },
    // },
    {
      name: 'Add CouponCode',
      icon: <FaCarrot />,
      onClick: () => {
        clear();
        setUser({} as CouponCodeDto);
        setSelectedCouponCodes([]);
        setIsOpen(true);
      },
    },
  ];

  function ChildRedirect({ item }: { item: CouponCodeDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-blue-500 hover:underline"
        onClick={(e) => {
          setUser(item);
          read(item);
          navigate(`/m/coupon-code/${name}`);
        }}
      >
        {name}
      </button>
    );
  }

  function deleteRander({ item }: { item: CouponCodeDto }) {
    const { name } = item;
    return (
      <button
        type="button"
        className="text-red-500 hover:underline"
        title="Delete"
        onClick={(e) => {
          CouponCodeDtoCrudService.delete(item.name).then((result) => {
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
              service={CouponCodeDtoCrudService}
              model={CouponCodeDtoModel}
              ref={autoGridRef}
              className="h-full w-full overflow-auto bg-white/40"
              visibleColumns={[
                'name',
                'couponName',
                'couponType',
                'couponCode',
                'validFrom',
                'creation',
                'idx',
              ]}
              selectedItems={selectedCouponCodes}
              theme="row-stripes"
              // rowNumbers
              multiSelect
              columnOptions={{
                name: {
                  header: 'ID',
                  resizable: true,
                  renderer: ChildRedirect,
                },
                couponName: {
                  header: 'Coupon Name',
                  resizable: true,
                },
                couponType: {
                  header: 'Coupon Name',
                  resizable: true,
                },
                couponCode: {
                  header: 'Coupon Name',
                  resizable: true,
                },
                validFrom: {
                  header: 'Coupon Name',
                  resizable: true,
                },
                creation: {
                  header: 'Created At',
                  resizable: true,
                  filterable: false,
                },
                idx: {
                  header: 'Action',
                  filterable: false,
                  sortable: false,
                  resizable: true,
                  renderer: deleteRander,
                },
              }}
              onActiveItemChanged={(e) => {
                const item = e.detail.value;
                setSelectedCouponCodes(item ? [item] : []);
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
        header="Add CouponCode"
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
          navigate(`/m/coupon-code/_`);
          // navigate(`_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          {/* <TextField
            label="CouponCode Code"
            required
            {...{ colspan: 1 }}
            {...field(model.itemCode)}
          />
          <TextField
            label="CouponCode Group"
            required
            {...{ colspan: 1 }}
            {...field(model.itemGroup)}
          />
          <ComboBox
            label="Default Unit of Measure"
            required
            items={selectUom.map((e) => e.name)}
            {...{ colspan: 1 }}
            {...field(model.salesUom)}
          />
          <Checkbox
            label="Maintain Stock"
            {...{ colspan: 1 }}
            {...field(model.isStockCouponCode)}
          />
          <Checkbox label="Is Fixed Asset" {...{ colspan: 1 }} {...field(model.isFixedAsset)} /> */}
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default CouponCodeView;