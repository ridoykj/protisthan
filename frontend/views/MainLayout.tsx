import Placeholder from 'Frontend/components/placeholder/Placeholder';
import { Suspense, useState } from 'react';
import { Outlet } from 'react-router-dom';
import AppHeader from './AppLayout/AppHeader';
import AppNavItem from './AppLayout/AppNavItem';

export default function MainLayout() {
  const [isSidebarVisible, setSidebarVisible] = useState(false);

  const showSideNav = () => {
    setSidebarVisible((e) => !e);
  };

  return (
    // <div className="flex flex-row h-screen bg-gradient-to-r from-cyan-500 to-blue-500">
    <div className="flex flex-row h-screen bg-slate-50 text-gray-800">
      <aside
        className={`bg-gray-100 overflow-hidden duration-300 ${isSidebarVisible ? 'w-64' : 'w-0'}`}
      >
        <AppNavItem />
      </aside>
      <div className="flex flex-col overflow-hidden w-screen">
        <nav className="bg-indigo-700 p-3">
          <AppHeader showSideNav={showSideNav} />
        </nav>
        {/* <main className="flex-1 overflow-auto bg-gray-50"> */}
        <main className="flex-1 overflow-auto ">
          <Suspense fallback={<Placeholder />}>
            <Outlet />
          </Suspense>
        </main>
      </div>
    </div>
  );
}
