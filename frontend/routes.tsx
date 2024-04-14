import MainLayout from 'Frontend/views/MainLayout.js';
import { lazy } from 'react';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import ShopView from './views/shop/ShopView';
import UsersView from './views/module/users/UsersView';
import HomeView from './views/home/HomeView';
import UserView from './views/module/users/UserView';

const AboutView = lazy(async () => import('Frontend/views/about/AboutView.js'));

const rootPath = 'ubd-lms';

export const routes: RouteObject[] = [
  {
    //     path: rootPath,    
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '', element: <HomeView />, handle: { title: 'Home' } },
      { path: 'shops', element: <ShopView />, handle: { title: 'Dashboard' } },

      { path: 'users', element: <UsersView />, handle: { title: 'Users' } },
      { path: 'users/:userId', element: <UserView />, handle: { title: 'Users' } },
      // { path: 'default', element: <DefaultView />, handle: { title: 'Not Implemented' } },
      // { path: 'shop', element: <ShopView />, handle: { title: 'Shop' } },
      // { path: 'grid', element: <GridView />, handle: { title: 'Grid' } },
      // { path: 'about', element: <AboutView />, handle: { title: 'About' } },

      // { path: 'academic/organization', element: <OrganizationView />, handle: { title: 'Profile' } },
      // { path: 'academic/attendance', element: <AttendanceView />, handle: { title: 'Attendance' } },

      // { path: 'place/building', element: <BuildingView />, handle: { title: 'Building' } },
      // { path: 'place/floor', element: <FloorView />, handle: { title: 'Floor' } },
      // { path: 'place/room', element: <RoomView />, handle: { title: 'Room' } },
      // { path: 'place/sector', element: <SectorView />, handle: { title: 'Sector' } },

      // { path: 'user/users', element: <UserView />, handle: { title: 'Users' } },

      // { path: 'permission/roles', element: <RoleView />, handle: { title: 'Roles' } },
      // { path: 'permission/resources', element: <ResourcesView />, handle: { title: 'Resources' } },
      // { path: 'permission/authorization', element: <AuthorizationView />, handle: { title: 'Authorization' } },

      // { path: 'users', element: <UserView />, handle: { title: 'Users' } },
      // { path: 'profiles', element: <ProfileView />, handle: { title: 'profiles' } },
    ],
  },
];

export default createBrowserRouter(routes);
