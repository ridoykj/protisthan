import CheckboxList from 'Frontend/components/checkbox/CheckboxListRC';
import { AutoGridRef } from 'Frontend/components/grid/autogrid';
import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { ModuleDefDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';

interface ModuleProps {
  value: string[];
  setSelectedModule: (value: string[]) => void;
}

function ModulesTable({ value, setSelectedModule: setSelectedRole }: ModuleProps) {
  const [isOpen, setIsOpen] = useState<boolean>(false);

  const [modules, setModules] = useState<ModuleDefDto[]>([]);
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

    ModuleDefDtoCrudService.list(pagination, undefined).then((result) => {
      setModules(result);
    });
  }, []);

  // function refreshGrid() {
  //   autoGridRef.current?.refresh();
  // }
  return (
    <>
      <CheckboxList
        items={modules.map((it) => it.name).filter((it) => it !== undefined) as string[]}
        value={value}
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
      <span className="sr-only">d</span>
    </>
  );
}

export default ModulesTable;
