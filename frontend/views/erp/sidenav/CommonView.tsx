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

type LinkGroup = {
  key: string;
  name: string;
  links: WorkspaceLinkDto[];
};

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
  const [workspaceLink, setWorkspaceLink] = useState<LinkGroup[]>([]);

  useEffect(() => {
    WorkspaceShortcutDtoCrudService.list(
      pagination,
      filterGenerator('and', 'parent', workspace)
    ).then((result) => {
      setWorkspaceShortcut(result);
    });

    WorkspaceLinkDtoCrudService.list(pagination, filterGenerator('and', 'parent', workspace)).then(
      (result) => {
        const group: LinkGroup[] = result.reduce((acc: LinkGroup[], curr: WorkspaceLinkDto) => {
          if (curr.type === 'Card Break') {
            acc.push({ key: curr.name ?? '', name: curr.label ?? '', links: [] });
          } else {
            acc[acc.length - 1].links.push(curr);
          }
          return acc;
        }, []);
        setWorkspaceLink(group);
      }
    );
  }, [workspace]);

  return (
    <div className="flex flex-col space-y-4">
      {workspaceShortcut.length > 0 && (
        <fieldset className="border border-gray-300 p-4 rounded-lg mx-2 md:mx-4 md:mt-4">
          <legend className="font-bold text-lg text-gray-800">Workspace Shortcuts</legend>
          <div className="grid grid-cols-2 md:grid-cols-3 gap-4 mx-2">
            {workspaceShortcut.map((data) => (
              <ViewShortcut
                key={data.name}
                to={`/m/${data?.linkTo?.toLowerCase().replace(' ', '-')}` ?? ''}
                title={data.label ?? ''}
                description={data.parentField ?? ''}
              />
            ))}
          </div>
        </fieldset>
      )}
      {workspaceLink.length > 0 && (
        <fieldset className="border border-gray-300 p-4 rounded-lg m-2 md:m-4">
          <legend className="font-bold text-lg text-gray-800">Redirect Module</legend>
          <div className="grid grid-cols-1 md:grid-cols-3 xl:grid-cols-4  gap-4 mx-2">
            {workspaceLink.map((linkGroup) => (
              <div
                key={linkGroup.key}
                className="flex flex-col gap-3 border rounded-lg p-2 shadow-sm"
              >
                <span>{linkGroup.name}</span>
                {linkGroup.links.map((data) => (
                  <ViewLink
                    key={data.name}
                    to={`/m/${data?.linkTo?.toLowerCase().replace(' ', '-')}` ?? ''}
                    title={data.label ?? ''}
                    description={data.parentField ?? ''}
                  />
                ))}
              </div>
            ))}
          </div>
        </fieldset>
      )}
    </div>
  );
}

export default CommonView;
