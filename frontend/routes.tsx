import MainLayout from 'Frontend/views/MainLayout.js';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import ItemsView from './views/erp/module/selling/item/ItemsView';
import ItemView from './views/erp/module/selling/item/ItemView';
import RolesProfileView from './views/erp/module/users/role/RolesProfileView';
import RolesView from './views/erp/module/users/role/RolesView';
import UsersView from './views/erp/module/users/user/UsersView';
import UserTypeView from './views/erp/module/users/user/UserTypeView';
import CommonView from './views/erp/sidenav/CommonView';
import HomeView from './views/erp/sidenav/HomeView';

// const AboutView = lazy(async () => import('Frontend/views/about/AboutView'));

const rootPath = 'ubd-lms';

export const routes: RouteObject[] = [
  {
    //     path: rootPath,
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '', element: <HomeView />, handle: { title: 'Home' } },
      { path: ':workspace', element: <CommonView />, handle: {} },
      // { path: 'shops', element: <ShopView />, handle: { title: 'Dashboard' } },

      // Module

      { path: 'm/item', element: <ItemsView />, handle: { title: 'Items' } },
      { path: 'm/item/:itemId', element: <ItemView />, handle: { title: 'Items' } },

      // Users
      { path: 'm/user', element: <UsersView />, handle: { title: 'User' } },
      { path: 'm/user/:queryId', element: <UsersView />, handle: { title: 'User' } },

      { path: 'm/user-type', element: <UserTypeView />, handle: { title: 'User Type' } },
      { path: 'm/user-type/:queryId', element: <UserTypeView />, handle: { title: 'User Type' } },

      { path: 'm/role', element: <RolesView />, handle: { title: 'Roles' } },
      { path: 'm/role/:queryId', element: <RolesView />, handle: { title: 'Roles' } },

      { path: 'm/role-profile', element: <RolesProfileView />, handle: { title: 'Role Profile' } },
      {
        path: 'm/role-profile/:queryId',
        element: <RolesProfileView />,
        handle: { title: 'Role Profile' },
      },

      // { path: 'm/role/:roleId', element: <RoleView />, handle: { title: 'Roles' } },

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
