
import { AppLayout } from '@hilla/react-components/AppLayout.js';
import { DrawerToggle } from '@hilla/react-components/DrawerToggle.js';
import Placeholder from 'Frontend/components/placeholder/Placeholder';
import AvatarControlRC from 'Frontend/components/profile/AvaterControlRC';
import RNavItemRC from 'Frontend/components/sidebar/NavItemRC';
import { useRouteMetadata } from 'Frontend/util/routing';
import { Suspense } from 'react';
import { FaArrowLeft, FaArrowRight, FaBuilding, FaChartArea, FaCog, FaDoorOpen, FaHome, FaKey, FaPlug, FaTools } from 'react-icons/fa';
import { FaBagShopping, FaBarsStaggered, FaBox, FaBuffer, FaBuildingCircleCheck, FaBuildingFlag, FaCartShopping, FaChartPie, FaEarthAmericas, FaFileShield, FaHeadset, FaHouseChimney, FaLock, FaMapLocationDot, FaRegFolderClosed, FaRegWindowMaximize, FaScaleBalanced, FaShieldHalved, FaSquarePollHorizontal, FaUser, FaUserGear, FaUserShield, FaUsers } from 'react-icons/fa6';
import { Outlet } from 'react-router-dom';

export default function MainLayout() {

  const currentTitle = useRouteMetadata()?.title ?? 'My App';
  return (
    <>
      <AppLayout primarySection="drawer" >
        <div slot="drawer" className="min-h-screen bg-gray-800 flex flex-col justify-between p-m">
          <header className="flex flex-col overflow-hidden">
            <div className="flex items-center justify-center h-20 shadow-md">
              {/* <img src="images/logo_uoa.svg" alt="" className='w-30' /> */}
              <img src="images/eco-factory.png" alt="" className='w-20' />
              {/* <p className="text-4xl text-center text-purple-500 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]">Protisthan</p> */}
              {/* <p className="text-4xl text-center text-purple-500 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]" lang='bn-BD'>প্রতিষ্ঠান</p> */}
              <p className="text-4xl text-center font-kalpurush text-purple-500 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]" lang='bn-BD'>প্রতিষ্ঠান</p>
              {/* <p className="text-xl uppercase text-center text-purple-500 font-bold drop-shadow-[0_10px_10px_rgba(255, 255, 255, 0.8)]">AFG College with the Univerity of Aberdeen</p> */}
            </div>
            <nav className='overflow-y-auto h-full'>
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
              {/* <RNavItemRC name='Report' icon={<FaClipboard />} route='' subItems={[
                { name: 'Result', icon: <FaReceipt />, route: '/default' },
                { name: 'Revenue', icon: <FaCircleDollarToSlot />, route: '/default' }
              ]} />
              <RNavItemRC name='Configuration' icon={<FaGear />} route='' subItems={[
                { name: 'Schedule', icon: <FaCalendarDay />, route: '/default' },
                { name: 'Result', icon: <FaReceipt />, route: '/default' },
                { name: 'Revenue', icon: <FaCircleDollarToSlot />, route: '/default' }
              ]} /> */}
              {/* <RNavItem name='Users' icon={<FaRegUser />} route='/users' />
            <RNavItem name='Profiles' icon={<FaRegUser />} route='/profiles' /> */}
            </nav>
          </header>
        </div>

        <div slot="navbar" className='flex flex-row w-full h-full items-center'>
          <DrawerToggle aria-label="Menu toggle"></DrawerToggle>
          <p className="text-lg font-semibold m-0">{currentTitle}</p>
          <AvatarControlRC />
        </div>
        <div slot='content'>

        </div>
        <Suspense fallback={<Placeholder />}>
          <Outlet />
        </Suspense>
      </AppLayout>
    </>
  );
}
