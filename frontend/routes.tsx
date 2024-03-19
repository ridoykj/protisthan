import MainLayout from 'Frontend/views/MainLayout.js';
import { lazy } from 'react';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import DefaultView from './views/default/DefaultView';
import GridView from './views/grid/GridView';
import HomeView from './views/home/HomeView';
import AttendanceView from './views/org/academic/AttendanceView';
import OrganizationView from './views/org/academic/OrganizationView';
import BuildingView from './views/org/place/BuildingView';
import FloorView from './views/org/place/FloorView';
import RoomView from './views/org/place/RoomView';
import SectorView from './views/org/place/SectorView';
import UserView from './views/org/user/users/UserView';
import AuthorizationView from './views/permission/authorization/AuthorizationView';
import ResourcesView from './views/permission/resource/ResourceView';
import RoleView from './views/permission/role/RoleView';
import ShopView from './views/shop/ShopView';

const AboutView = lazy(async () => import('Frontend/views/about/AboutView.js'));

const rootPath = 'ubd-lms';

export const routes: RouteObject[] = [
  {
//     path: rootPath,
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '', element: <HomeView />, handle: { title: 'Dashboard' } },

      { path: 'default', element: <DefaultView />, handle: { title: 'Not Implemented' } },
      { path: 'shop', element: <ShopView />, handle: { title: 'Shop' } },
      { path: 'grid', element: <GridView />, handle: { title: 'Grid' } },
      { path: 'about', element: <AboutView />, handle: { title: 'About' } },

      { path: 'academic/organization', element: <OrganizationView />, handle: { title: 'Profile' } },
      { path: 'academic/attendance', element: <AttendanceView />, handle: { title: 'Attendance' } },

      { path: 'place/building', element: <BuildingView />, handle: { title: 'Building' } },
      { path: 'place/floor', element: <FloorView />, handle: { title: 'Floor' } },
      { path: 'place/room', element: <RoomView />, handle: { title: 'Room' } },
      { path: 'place/sector', element: <SectorView />, handle: { title: 'Sector' } },

      { path: 'user/users', element: <UserView />, handle: { title: 'Users' } },

      { path: 'permission/roles', element: <RoleView />, handle: { title: 'Roles' } },
      { path: 'permission/resources', element: <ResourcesView />, handle: { title: 'Resources' } },
      { path: 'permission/authorization', element: <AuthorizationView />, handle: { title: 'Authorization' } },

      // { path: 'users', element: <UserView />, handle: { title: 'Users' } },
      // { path: 'profiles', element: <ProfileView />, handle: { title: 'profiles' } },
    ],
  },
];

export default createBrowserRouter(routes);
