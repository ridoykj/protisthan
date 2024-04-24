import RNavItemRC from 'Frontend/components/sidebar/NavItemRC';
import NavIcons from 'Frontend/constants/NavIcon';
import WorkspaceDto from 'Frontend/generated/com/itbd/application/db/dto/workspace/WorkspaceDto';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { WorkspaceDtoCrudService } from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import { useEffect, useState } from 'react';

const pagination: Pageable = {
  pageNumber: 0,
  pageSize: 50,
  sort: {
    orders: [{ property: 'sequenceId', direction: Direction.ASC, ignoreCase: false }],
  },
};
type navItam = {
  name: string;
  icon: JSX.Element;
  route: string;
  parent: string | undefined;
  subItems: WorkspaceDto[];
};

function AppNavItem() {
  const [workspace, setWorkspace] = useState<navItam[]>([]);
  const icons = NavIcons;
  useEffect(() => {
    WorkspaceDtoCrudService.list(pagination, undefined).then((result) => {
      const resultModifed = result.reduce((acc: navItam[], item) => {
        const parent = item.parentPage;
        const subItem = item;
        const parentIndex = acc.findIndex((accItem) => accItem.parent === parent);
        if (parentIndex === -1) {
          acc.push({
            name: item?.name ?? '',
            icon: icons[(item?.icon?.replace('-', '') as keyof typeof icons) ?? ''],
            route: item?.name?.toLowerCase().replace(' ', '-') ?? '',
            parent: item.name ?? '',
            subItems: [],
          });
        } else {
          acc[parentIndex].subItems?.push(subItem);
        }
        return acc;
      }, []);
      setWorkspace(resultModifed);
    });
  }, [icons]);

  return (
    <div className="flex flex-col h-screen">
      <div className="flex flex-row h-16 items-center justify-center">
        <img src="images/eco-factory.png" alt="" className="w-20 p-4" />
        <p
          className="text-4xl text-center font-kalpurush text-indigo-700 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]"
          lang="bn-BD"
        >
          প্রতিষ্ঠান
        </p>
      </div>
      <div className="overflow-y-scroll scroll-smooth flex-grow border-y">
        {/* <RNavItemRC name="Home" icon={<FaHouseChimney />} route="" /> */}
        {workspace.map((itemE) => (
          <RNavItemRC
            key={itemE.name}
            name={itemE.name}
            icon={itemE.icon}
            route={itemE.route}
            subItems={itemE.subItems.map((item) => ({
              name: item.name ?? '',
              icon: icons[(item?.icon?.replace('-', '') as keyof typeof icons) ?? ''],
              route: item.name?.toLowerCase().replace(' ', '-') ?? '',
            }))}
          />
        ))}
      </div>
      <div className="sticky inset-x-0 bottom-0 border-r border-gray-100">
        <div className="flex items-center gap-2 bg-white p-4 hover:bg-gray-50">
          <img
            alt=""
            src="images/profile/profile.jpg"
            className="size-10 rounded-full object-cover"
          />
          <div>
            <p className="text-xs">
              <strong className="block font-medium">Ridoy Kumar Joy</strong>
              <span>ridoykj@gmail.com</span>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}

export default AppNavItem;
