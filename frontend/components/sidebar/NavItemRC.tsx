import { useState } from 'react';
import { FaChevronDown, FaChevronUp } from 'react-icons/fa';
import { NavLink } from 'react-router-dom';
import RippleDivRC from '../effects/ripple/div/RippleDivRC';

const navCss = `relative flex flex-row items-center font-semibold 
focus:outline-none hover:bg-indigo-50 hover:no-underline `;

type subItemType = { name: string; icon: any; route: string };

const navLinkClasses = ({ isActive }: any) =>
  `${isActive ? 'bg-indigo-100 text-indigo-700 rounded-md ' : ''}${navCss}`;

function NavLinkItem({ name, icon, route }: { name: string; icon: any; route: string }) {
  const handleClick = () => {
    document.title = name;
  };
  return (
    <NavLink className={navLinkClasses} to={route} onClick={handleClick}>
      <RippleDivRC className="w-full h-10 flex rounded-md items-center">
        <span className="inline-flex justify-center items-center ml-4">{icon}</span>
        <span className="ml-2 text-sm tracking-wide truncate">{name}</span>
      </RippleDivRC>
    </NavLink>
  );
}

// Component to display the Chevron icon based on the isOpen state
function ChevronIcon({ isOpen }: { isOpen: boolean }) {
  return isOpen ? (
    <FaChevronUp size={20} className="pr-2" />
  ) : (
    <FaChevronDown size={20} className="pr-2" />
  );
}

// Dropdown button component
function DropdownButton({
  name,
  icon,
  isDropdownOpen,
  toggleDropdown,
}: {
  name: string;
  icon: React.ReactNode;
  isDropdownOpen: boolean;
  toggleDropdown: () => void;
}) {
  return (
    <button
      type="button"
      className={`${navCss} w-full flex justify-between items-center h-10 pr-6 ${isDropdownOpen ? 'shadow-[0_5px_5px_#dfe7ff]' : ''}`}
      onClick={toggleDropdown}
    >
      <div className="flex items-center">
        <span className="inline-flex justify-center items-center ml-4">{icon}</span>
        <span className="ml-2 text-sm tracking-wide truncate">{name}</span>
      </div>
      <ChevronIcon isOpen={isDropdownOpen} />
    </button>
  );
}

// Component to display the list of sub items
function SubItemList({ subItems }: { subItems: subItemType[] }) {
  return (
    <div className="pl-4 border-b border-gray-300">
      <ul>
        {subItems.map((item, index) => (
          <li key={`sub_${index}`}>
            <NavLinkItem name={item.name} icon={item.icon} route={item.route} />
          </li>
        ))}
      </ul>
    </div>
  );
}

function RNavItemRC({
  name,
  icon,
  route,
  subItems,
}: {
  name: string;
  icon: React.ReactNode;
  route: string;
  subItems?: subItemType[];
}) {
  const [isDropdownOpen, setIsDropdownOpen] = useState(false);
  const toggleDropdown = () => setIsDropdownOpen(!isDropdownOpen);

  return (
    <>
      {subItems && subItems.length > 0 ? (
        <>
          <DropdownButton
            name={name}
            icon={icon}
            isDropdownOpen={isDropdownOpen}
            toggleDropdown={toggleDropdown}
          />
          {isDropdownOpen && <SubItemList subItems={subItems} />}
        </>
      ) : (
        <NavLinkItem name={name} icon={icon} route={route} />
      )}
    </>
  );
}

export default RNavItemRC;
