import { useForm } from '@hilla/react-form';
import FromBuilderRC from 'Frontend/components/ho_master/from/FromBuilderRC';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import ItemDto from 'Frontend/generated/com/itbd/application/db/dto/items/ItemDto';
import ItemDtoModel from 'Frontend/generated/com/itbd/application/db/dto/items/ItemDtoModel';
import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { DocFieldDtoCrudService, ItemDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

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

function ItemView() {
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);
  //
  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);
  const { itemId } = useParams();
  //
  const [selectedUserItems, setSelectedUserItems] = useState<ItemDto[]>([]);
  //
  const [users, setUsers] = useState<ItemDto[]>([]);
  const [selectedUserIds, setSelectedUserIds] = useState<string[]>([]);
  //
  const [modules, setModules] = useState<ModuleDefDto[]>([]);
  const [selectedModuleIds, setSelectedModuleIds] = useState<string[]>([]);

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
    onSubmit: async (role) => {
      console.log('role', role);
      // await RoleDtoCrudService.save(role)
      //   .then((result) => {
      //     clear();
      //     setSuccessNotification(true);
      //     setIsOpen(false);
      //   })
      //   .catch((error) => {
      //     setFailureNotification(true);
      //   });
    },
  });

  useEffect(() => {
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'Item')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  useEffect(() => {
    ItemDtoCrudService.list(pagination, filterGenerator('and', 'name', itemId)).then((result) => {
      setUsers(result);
      read(result[0]);
      const roleIds: string[] = result
        .map((role) => role.name)
        .filter((it) => it !== undefined) as string[];
      setSelectedUserIds(roleIds);
    });
  }, [itemId, uiField, read]);

  return (
    <div className="w-full md:px-10 sm:px-0 ">
      <div className="flex flex-col p-2 items-end">
        <button
          type="button"
          className="bg-gray-50 hover:bg-gray-200 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
          onClick={() => submit()}
        >
          Save
        </button>
      </div>
      <div className="rounded-xl p-3 shadow-xl">
        <div className="flex flex-col p-2">
          <FromBuilderRC uiField={uiField} field={field} model={model} />
        </div>
      </div>
      <div className="h-8" />
    </div>
  );
}

export default ItemView;
