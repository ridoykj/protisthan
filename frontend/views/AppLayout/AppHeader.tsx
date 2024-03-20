import AvatarControlRC from 'Frontend/components/profile/AvaterControlRC';
import { useRouteMetadata } from 'Frontend/util/routing';
import { useState } from 'react';
import { FaBars } from 'react-icons/fa';
import { FaXmark } from 'react-icons/fa6';

interface AppHeaderProps {
    showSideNav: () => void;
}
const AppHeader = ({ showSideNav }: AppHeaderProps) => {
    const currentTitle = useRouteMetadata()?.title ?? 'My App';
    const [iconState, setIconState] = useState(false);
    return (
        <>
            <div className='flex flex-row'>
                <button type='button' className="text-white px-4" onClick={() => {
                    setIconState(e => !e);
                    showSideNav();
                }}>
                    {iconState ? <FaXmark /> : <FaBars />}
                </button>
                <div className={`flex flex-row`}>
                    <h1 className="text-white text-xl">{currentTitle}</h1>
                    <AvatarControlRC />
                </div>
            </div>
        </>
    )
}

export default AppHeader