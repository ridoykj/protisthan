import MainLayout from 'Frontend/views/MainLayout.js';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import AccountView from './views/erp/module/accounting/AccountView';
import ItemsView from './views/erp/module/sale/item/ItemsView';
import SalesInvoiceView from './views/erp/module/sale/SalesInvoiceView';
import AccessLogView from './views/erp/module/settings/log/AccessLogView';
import ActivityLogView from './views/erp/module/settings/log/ActivityLogView';
import ModuleProfileView from './views/erp/module/users/module/ModuleProfileView';
import RolesProfileView from './views/erp/module/users/role/RolesProfileView';
import RolesView from './views/erp/module/users/role/RolesView';
import CompanyView from './views/erp/module/users/user/CompanyView';
import CustomerView from './views/erp/module/users/user/CustomerView';
import SupplierView from './views/erp/module/users/user/SupplierView';
import UserProfileView from './views/erp/module/users/user/UserProfileView';
import UsersView from './views/erp/module/users/user/UsersView';
import UserTypeView from './views/erp/module/users/user/UserTypeView';
import CommonView from './views/erp/sidenav/CommonView';

// const AboutView = lazy(async () => import('Frontend/views/about/AboutView'));

const prod = false;
// const prod = true;

export const routes: RouteObject[] = [
  {
    // path: rootPath,
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '', element: <UserProfileView />, handle: { title: 'Home' } },
      { path: 'm/user-profile', element: <UserProfileView />, handle: { title: 'Home' } },
      { path: ':workspace', element: <CommonView />, handle: {} },
      // { path: 'shops', element: <ShopView />, handle: { title: 'Dashboard' } },

      // Module

      { path: 'm/item', element: <ItemsView />, handle: { title: 'Items' } },
      { path: 'm/item/:queryId', element: <ItemsView />, handle: { title: 'Items' } },

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

      {
        path: 'm/module-profile',
        element: <ModuleProfileView />,
        handle: { title: 'Module Profile' },
      },
      {
        path: 'm/module-profile/:queryId',
        element: <ModuleProfileView />,
        handle: { title: 'Module Profile' },
      },

      { path: 'm/activity-log', element: <ActivityLogView />, handle: { title: 'Activity Log' } },
      {
        path: 'm/activity-log/:queryId',
        element: <ActivityLogView />,
        handle: { title: 'Activity Log' },
      },

      { path: 'm/access-log', element: <AccessLogView />, handle: { title: 'Access Log' } },
      {
        path: 'm/access-log/:queryId',
        element: <AccessLogView />,
        handle: { title: 'Access Log' },
      },

      { path: 'm/customer', element: <CustomerView />, handle: { title: 'Customer' } },
      { path: 'm/customer/:queryId', element: <CustomerView />, handle: { title: 'Customer' } },

      { path: 'm/supplier', element: <SupplierView />, handle: { title: 'Supplier' } },
      { path: 'm/supplier/:queryId', element: <SupplierView />, handle: { title: 'Supplier' } },

      {
        path: 'm/sales-invoice',
        element: <SalesInvoiceView />,
        handle: { title: 'Sales Invoice' },
      },
      {
        path: 'm/sales-invoice/:queryId',
        element: <SalesInvoiceView />,
        handle: { title: 'Sales Invoice' },
      },

      { path: 'm/account', element: <AccountView />, handle: { title: 'Account' } },
      { path: 'm/account/:queryId', element: <AccountView />, handle: { title: 'Account' } },

      { path: 'm/company', element: <CompanyView />, handle: { title: 'Company' } },
      { path: 'm/company/:queryId', element: <CompanyView />, handle: { title: 'Company' } },

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

export default createBrowserRouter(routes, { basename: prod ? '/protisthan' : '/' });
