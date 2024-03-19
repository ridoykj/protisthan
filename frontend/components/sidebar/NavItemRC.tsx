import { useState } from "react";
import { FaChevronDown, FaChevronUp } from "react-icons/fa";
import { NavLink } from "react-router-dom";
import RippleDivRC from "../effects/ripple/div/RippleDivRC";
const navCss = `relative flex flex-row items-center border-transparent border-l-4
hover:text-white focus:outline-none hover:bg-gray-500 hover:border-indigo-500 hover:text-indigo-500 hover:font-semibold hover:no-underline `

type subItemType = { name: string, icon: any, route: string }

const navLinkClasses = ({ isActive }: any) => {
    return `${isActive ? 'bg-gray-500 border-l-green-600 font-semibold ' : ''}${navCss}`;
};

function NavLinkItem({ name, icon, route }: { name: string, icon: any, route: string, }) {
    const handleClick = () => {
        document.title = name;
    };
    return (

        <NavLink className={navLinkClasses} to={route} onClick={handleClick}>
            <RippleDivRC className={'w-full h-11 flex items-center'}>
                <span className="inline-flex justify-center text-white items-center ml-4">
                    {icon}
                </span>
                <span className="ml-2 text-sm text-white tracking-wide truncate">{name}</span>
            </RippleDivRC>
        </NavLink>
    );
}

// Component to display the Chevron icon based on the isOpen state
function ChevronIcon({ isOpen }: { isOpen: boolean }) {
    return isOpen ? <FaChevronUp size={20} className="pr-2" /> : <FaChevronDown size={20} className="pr-2" />;
}

// Dropdown button component
function DropdownButton({ name, icon, isDropdownOpen, toggleDropdown }: { name: string, icon: any, isDropdownOpen: boolean, toggleDropdown: () => void }) {
    return (
        <button type="button" className={`${navCss} w-full flex justify-between items-center text-white h-11 pr-6`} onClick={toggleDropdown}>
            <div className="flex items-center">
                <span className="inline-flex text-white justify-center items-center ml-4">
                    {icon}
                </span>
                <span className="ml-2 text-sm text-white tracking-wide truncate">{name}</span>
            </div>
            <ChevronIcon isOpen={isDropdownOpen} />
        </button>
    );
}

// Component to display the list of sub items
function SubItemList({ subItems }: { subItems: subItemType[] }) {
    return (
        <div className="bg-gray-700 border-l-4 border-blue-500">
            <ul>
                {subItems.map((item, index) => (
                    <li key={index}>
                        <NavLinkItem name={item.name} icon={item.icon} route={item.route} />
                    </li>
                ))}
            </ul>
        </div>
    );
}

function RNavItemRC({ name, icon, route, subItems }: { name: string, icon: any, route: string, subItems?: subItemType[] }) {
    const [isDropdownOpen, setIsDropdownOpen] = useState(false);
    const toggleDropdown = () => setIsDropdownOpen(!isDropdownOpen);

    return (
        <>
            {subItems && subItems.length > 0 ? (
                <>
                    <DropdownButton name={name} icon={icon} isDropdownOpen={isDropdownOpen} toggleDropdown={toggleDropdown} />
                    {isDropdownOpen && <SubItemList subItems={subItems} />}
                </>
            ) : (
                <NavLinkItem name={name} icon={icon} route={route} />
            )}
        </>
    );
}

export default RNavItemRC;