import AvatarControlRC from 'Frontend/components/profile/AvaterControlRC';
import useRouteMetadata from 'Frontend/util/routing';
import { useState } from 'react';
import { FaBars } from 'react-icons/fa';
import { FaXmark } from 'react-icons/fa6';
import { useParams } from 'react-router-dom';

interface AppHeaderProps {
  openSideBar: () => void;
}
function AppHeader({ openSideBar }: AppHeaderProps) {
  const currentTitle = useRouteMetadata()?.title ?? 'My App';
  const { workspace } = useParams();

  const [iconState, setIconState] = useState(false);

  return (
    <div className="flex flex-row items-center">
      <button
        type="button"
        className="text-white px-4"
        onClick={() => {
          setIconState((e) => !e);
          openSideBar();
        }}
      >
        {iconState ? <FaXmark /> : <FaBars />}
      </button>
      <div className="flex flex-row grow items-center">
        <h1 className="text-white text-xl text-center">{workspace ?? currentTitle}</h1>
        <div className="grow">
          <AvatarControlRC />
        </div>
      </div>
    </div>
  );
}

export default AppHeader;
