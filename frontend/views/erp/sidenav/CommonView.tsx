import ViewLink from 'Frontend/components/ho_master/view/ViewLink';
import ViewShortcut from 'Frontend/components/ho_master/view/ViewShortcut';
import WorkspaceLinkDto from 'Frontend/generated/com/itbd/application/db/dto/workspace/WorkspaceLinkDto';
import WorkspaceShortcutDto from 'Frontend/generated/com/itbd/application/db/dto/workspace/WorkspaceShortcutDto';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import {
  WorkspaceLinkDtoCrudService,
  WorkspaceShortcutDtoCrudService,
} from 'Frontend/generated/endpoints';
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

function CommonView() {
  const { workspace } = useParams();
  const [workspaceShortcut, setWorkspaceShortcut] = useState<WorkspaceShortcutDto[]>([]);
  const [workspaceLink, setWorkspaceLink] = useState<WorkspaceLinkDto[]>([]);

  useEffect(() => {
    WorkspaceShortcutDtoCrudService.list(
      pagination,
      filterGenerator('and', 'parent', workspace)
    ).then((result) => {
      setWorkspaceShortcut(result);
    });
  }, [workspace]);

  useEffect(() => {
    WorkspaceLinkDtoCrudService.list(pagination, filterGenerator('and', 'parent', workspace)).then(
      (result) => {
        setWorkspaceLink(result);
      }
    );
  }, [workspace]);
  return (
    <>
      <h1 className="font-bold text-lg">Your Shortcuts</h1>
      <div className="grid grid-cols-3 gap-4 mx-2">
        {workspaceShortcut.map((data) => (
          <ViewShortcut
            key={data.name}
            to={`/m/${data?.label?.toLowerCase().replace(' ', '-')}` ?? ''}
            title={data.label ?? ''}
            description={data.parentField ?? ''}
          />
        ))}
      </div>
      <h1 className="font-bold text-lg">Report Master</h1>
      <div className="grid grid-cols-1 md:grid-cols-3 lg:grid-cols-6 gap-4 mx-2">
        {workspaceLink.map((data) => (
          <ViewLink
            key={data.name}
            to={`/m/${data?.label?.toLowerCase().replace(' ', '-')}` ?? ''}
            title={data.label ?? ''}
            description={data.parentField ?? ''}
          />
        ))}
      </div>
    </>
  );
}

export default CommonView;
