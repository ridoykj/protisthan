import { useState } from 'react';
import { AiOutlineLogout } from "react-icons/ai";
import { FaBell, FaRegBell, FaRegUserCircle } from 'react-icons/fa';
import { FaGear } from 'react-icons/fa6';
import { NavLink } from 'react-router-dom';

const userNavigation = [
  { name: 'Your Profile', icon: <FaRegUserCircle />, href: '#' },
  { name: 'Settings', icon: <FaGear />, href: '#' },
  { name: 'Sign out', icon: <AiOutlineLogout />, href: '#' },
]

function NavLinkItem({ name, icon, route }: { name: string, icon: any, route: string, }) {
  const handleClick = () => {
    document.title = name;
  };

  return (
    <NavLink
      className="block rounded-lg px py-2 text-sm text-gray-500 hover:bg-gray-50 hover:text-gray-700 hover:no-underline " to={route} onClick={handleClick}>
      <div>
        <span className="inline-flex justify-center items-center ml-4">
          {icon}
        </span>
        <span className="ml-2 text-sm tracking-wide truncate">{name}</span>
      </div>
    </NavLink>
  );
}

export default function AvatarControlRC() {
  const [isProfileOpen, setIsProfileOpen] = useState(false);

  return <>
    {/* <div className="absolute inset-y right-5 flex flex-row items-center md:ml-6"> */}
    <div className="absolute inset-y right-5 flex flex-row items-center md:ml-6 space-x-4">
      <button
        type="button"
        className="relative flex items-center justify-center rounded-full size-8 bg-gray-200 p-1 text-gray-400 hover:text-indigo-700 focus:outline-none focus:ring focus:ring-offset-1 focus:ring-offset-indigo-50"
      >
        <span className="sr-only">View notifications</span>
        <FaRegBell className="size-5" aria-hidden="true" />
      </button>

      <div className="relative">
        <button
          type='button'
          className="relative flex max-w-xs items-center rounded-full bg-gray-200 text-sm focus:outline-none focus:ring focus:ring-offset-1 focus:ring-offset-indigo-50"
          onClick={() => setIsProfileOpen(!isProfileOpen)}
        >
          <span className="sr-only">Menu</span>
          <img className="size-8 rounded-full" src={'icons/icon.png'} alt="" />
        </button>
        <div
          className={`absolute end-0 z-10 mt-2 w-56 rounded-md border border-gray-100 bg-white shadow-lg  duration-300 ${isProfileOpen ? 'visible' : 'hidden'}`}
        >
          <div className="p-2">
            {
              userNavigation.map((item, index) => (
                <NavLinkItem key={index} name={item.name} icon={item.icon} route={item.href} />
              ))
            }
          </div>
        </div>
      </div>
    </div>
  </>;
}
