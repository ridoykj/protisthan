import RNavItemRC from 'Frontend/components/sidebar/NavItemRC';
import { FaArrowLeft, FaArrowRight, FaBox, FaBuffer, FaBuilding, FaChartArea, FaChartPie, FaCog, FaDoorOpen, FaHeadset, FaHome, FaKey, FaLock, FaPlug, FaRegWindowMaximize, FaTools, FaUser, FaUsers, FaUserShield } from 'react-icons/fa';
import { FaBagShopping, FaBarsStaggered, FaBuildingCircleCheck, FaBuildingFlag, FaCartShopping, FaEarthAmericas, FaFileShield, FaHouseChimney, FaMapLocationDot, FaRegFolderClosed, FaScaleBalanced, FaShieldHalved, FaSquarePollHorizontal, FaUserGear } from 'react-icons/fa6';

function AppNavItem() {
    return (
        <>
            <div className='flex flex-col h-screen'>
                <div className="flex flex-row h-16 items-center justify-center">
                    <img src="images/eco-factory.png" alt="" className='w-20 p-4' />
                    <p className="text-4xl text-center font-kalpurush text-indigo-700 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]" lang='bn-BD'>প্রতিষ্ঠান</p>
                </div>
                <div className='overflow-y-scroll flex-grow border-y'>
                    <RNavItemRC name='Home' icon={<FaHouseChimney />} route='' />
                    <RNavItemRC name='Accounting' icon={<FaScaleBalanced />} route='' subItems={[
                        { name: 'Payables', icon: <FaArrowLeft />, route: 'academic/organization' },
                        { name: 'Receivables', icon: <FaArrowRight />, route: 'academic/organization' },
                        { name: 'Financial Reports', icon: <FaSquarePollHorizontal />, route: 'academic/organization' },
                    ]} />
                    <RNavItemRC name='Buying' icon={<FaCartShopping />} route='' />
                    <RNavItemRC name='Selling' icon={<FaRegWindowMaximize />} route='' />
                    <RNavItemRC name='Stock' icon={<FaBox />} route='' />
                    <RNavItemRC name='Assets' icon={<FaBagShopping />} route='' />
                    <RNavItemRC name='Manufacturing' icon={<FaBuilding />} route='' />
                    <RNavItemRC name='Quality' icon={<FaShieldHalved />} route='' />
                    <RNavItemRC name='Projects' icon={<FaRegFolderClosed />} route='' />
                    <RNavItemRC name='Support' icon={<FaHeadset />} route='' />
                    <RNavItemRC name='Users' icon={<FaUsers />} route='' />
                    <RNavItemRC name='Website' icon={<FaEarthAmericas />} route='' />
                    <RNavItemRC name='CRM' icon={<FaChartPie />} route='' />
                    <RNavItemRC name='Tools' icon={<FaTools />} route='' />
                    <RNavItemRC name='Settings' icon={<FaCog />} route='' />
                    <RNavItemRC name='Integrations' icon={<FaPlug />} route='' />
                    <RNavItemRC name='Build' icon={<FaBuffer />} route='' />
                    <RNavItemRC name='Dashboard' icon={<FaChartArea />} route='' />
                    <RNavItemRC name='Organization' icon={<FaHome />} route='' subItems={[
                        { name: 'Profile', icon: <FaUserGear />, route: 'academic/organization' },
                        // { name: 'Reservation', icon: <FaCalendarDay />, route: '/edu/reservation' }
                    ]} />
                    <RNavItemRC name='Place' icon={<FaMapLocationDot />} route='' subItems={[
                        { name: 'Sector', icon: <FaBuildingFlag />, route: 'place/sector' },
                        { name: 'Building', icon: <FaBuildingCircleCheck />, route: 'place/building' },
                        { name: 'Floor', icon: <FaBarsStaggered />, route: 'place/floor' },
                        { name: 'Room', icon: <FaDoorOpen />, route: 'place/room' }
                    ]} />
                    <RNavItemRC name='User' icon={<FaUser />} route='' subItems={[
                        { name: 'Users', icon: <FaKey />, route: 'user/users' },
                    ]} />
                    <RNavItemRC name='Permission' icon={<FaLock />} route='' subItems={[
                        { name: 'Resources', icon: <FaFileShield />, route: 'permission/resources' },
                        { name: 'Role', icon: <FaUserShield />, route: 'permission/roles' },
                        { name: 'Authorization', icon: <FaKey />, route: 'permission/authorization' }
                    ]} />
                </div>
                <div className="sticky inset-x-0 bottom-0 border-r border-gray-100">
                    <div className="flex items-center gap-2 bg-white p-4 hover:bg-gray-50">
                        <img
                            alt=""
                            src="https://images.unsplash.com/photo-1600486913747-55e5470d6f40?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80"
                            className="size-10 rounded-full object-cover"
                        />
                        <div>
                            <p className="text-xs">
                                <strong className="block font-medium">Ridoy Kumar Joy</strong>

                                <span> ridoykj@gmail.com </span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default AppNavItem