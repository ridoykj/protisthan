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
    <div className="flex flex-row h-screen bg-slate-50 text-gray-800">
      <aside
        className={`inline-flex overflow-hidden z-50 shadow-lg duration-300 fixed md:relative ${isSidebarVisible ? 'w-full md:w-64' : 'w-0'}`}
      >
        <AppNavItem className={`bg-gray-100 ${isSidebarVisible ? 'w-3/4 md:w-64' : 'w-0'}`} />
        <button
          type="button"
          className="bg-gray-800/20 w-1/3 md:w-0"
          onClick={showSideNav}
          aria-label="Toggle Sidebar"
        />
      </aside>
      <div className="flex flex-col overflow-hidden w-screen">
        <nav className="bg-indigo-700 p-3">
          <AppHeader openSideBar={showSideNav} />
        </nav>
        <main className="flex-1 overflow-auto ">
          <Suspense fallback={<Placeholder />}>
            <Outlet />
          </Suspense>
        </main>
      </div>
    </div>
  );
}
