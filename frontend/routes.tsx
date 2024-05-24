import MainLayout from 'Frontend/views/MainLayout.js';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import ErrorView from './views/default/ErrorView';
import AccountView from './views/erp/module/accounting/AccountView';
import CompanyView from './views/erp/module/accounting/CompanyView';
import CustomerView from './views/erp/module/accounting/CustomerView';
import SupplierView from './views/erp/module/accounting/SupplierView';
import CustomerGroupView from './views/erp/module/crm/CustomerGroupView';
import LeadView from './views/erp/module/crm/LeadView';
import TerritoryView from './views/erp/module/crm/TerritoryView';
import CouponCodeView from './views/erp/module/selling/item/CouponCodeView';
import ItemGroupView from './views/erp/module/selling/item/ItemGroupView';
import ItemPriceView from './views/erp/module/selling/item/ItemPriceView';
import ItemsView from './views/erp/module/selling/item/ItemsView';
import PriceListView from './views/erp/module/selling/item/PriceListView';
import PricingRuleView from './views/erp/module/selling/item/PricingRuleView';
import ProductBundleView from './views/erp/module/selling/item/ProductBundleView';
import PromotionalSchemeView from './views/erp/module/selling/item/PromotionalSchemeView';
import ShippingRuleView from './views/erp/module/selling/item/ShippingRuleView';
import LoyaltyPointEntryView from './views/erp/module/selling/pointofsale/LoyaltyPointEntryView';
import LoyaltyProgramView from './views/erp/module/selling/pointofsale/LoyaltyProgramView';
import PosClosingEntryView from './views/erp/module/selling/pointofsale/PosClosingEntryView';
import PosOpeningEntryView from './views/erp/module/selling/pointofsale/PosOpeningEntryView';
import PosProfileView from './views/erp/module/selling/pointofsale/PosProfileView';
import BlanketOrderView from './views/erp/module/selling/selling/BlanketOrderView';
import QuotationView from './views/erp/module/selling/selling/QuotationView';
import SalesInvoiceView from './views/erp/module/selling/selling/SalesInvoiceView';
import SalesOrderView from './views/erp/module/selling/selling/SalesOrderView';
import SalesPartnerView from './views/erp/module/selling/selling/SalesPartnerView';
import SalesPersonView from './views/erp/module/selling/selling/SalesPersonView';
import AddressView from './views/erp/module/selling/settings/AddressView';
import CampaignView from './views/erp/module/selling/settings/CampaignView';
import ContactView from './views/erp/module/selling/settings/ContactView';
import LeadSourceView from './views/erp/module/selling/settings/LeadSourceView';
import SalesTaxesAndChargesView from './views/erp/module/selling/settings/SalesTaxesAndChargesView';
import TermsAndConditionsView from './views/erp/module/selling/settings/TermsAndConditionsView';
import AccessLogView from './views/erp/module/settings/log/AccessLogView';
import ActivityLogView from './views/erp/module/settings/log/ActivityLogView';
import BrandView from './views/erp/module/stock/BrandView';
import StockReconciliationView from './views/erp/module/stock/StockReconciliationView';
import UomView from './views/erp/module/stock/UomView';
import WarehouseView from './views/erp/module/stock/WarehouseView';
import ModuleProfileView from './views/erp/module/users/module/ModuleProfileView';
import RolePermissionView from './views/erp/module/users/role/RolePermissionView';
import RolesProfileView from './views/erp/module/users/role/RolesProfileView';
import RolesView from './views/erp/module/users/role/RolesView';
import UserProfileView from './views/erp/module/users/user/UserProfileView';
import UsersView from './views/erp/module/users/user/UsersView';
import UserTypeView from './views/erp/module/users/user/UserTypeView';
import CommonView from './views/erp/sidenav/CommonView';

// const AboutView = lazy(async () => import('Frontend/views/about/AboutView'));
// const prod = false;
// const prod = true;

export const routes: RouteObject[] = [
  {
    // path: rootPath,
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '*', element: <ErrorView /> },
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
        path: 'm/permission-manager',
        element: <RolePermissionView />,
        handle: { title: 'Role Permission' },
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

      { path: 'm/account', element: <AccountView />, handle: { title: 'Account' } },
      { path: 'm/account/:queryId', element: <AccountView />, handle: { title: 'Account' } },

      { path: 'm/company', element: <CompanyView />, handle: { title: 'Company' } },
      { path: 'm/company/:queryId', element: <CompanyView />, handle: { title: 'Company' } },

      { path: 'm/warehouse', element: <WarehouseView />, handle: { title: 'Warehouse' } },
      { path: 'm/warehouse/:queryId', element: <WarehouseView />, handle: { title: 'Warehouse' } },

      { path: 'm/brand', element: <BrandView />, handle: { title: 'Brand' } },
      { path: 'm/brand/:queryId', element: <BrandView />, handle: { title: 'Brand' } },

      { path: 'm/uom', element: <UomView />, handle: { title: 'UOM' } },
      { path: 'm/uom/:queryId', element: <UomView />, handle: { title: 'UOM' } },

      {
        path: 'm/stock-reconciliation',
        element: <StockReconciliationView />,
        handle: { title: 'Stock Reconciliation' },
      },
      {
        path: 'm/stock-reconciliation/:queryId',
        element: <StockReconciliationView />,
        handle: { title: 'Stock Reconciliation' },
      },

      { path: 'm/lead', element: <LeadView />, handle: { title: 'Lead' } },
      { path: 'm/lead/:queryId', element: <LeadView />, handle: { title: 'Lead' } },

      {
        path: 'm/customer-group',
        element: <CustomerGroupView />,
        handle: { title: 'Customer Group' },
      },
      {
        path: 'm/customer-group/:queryId',
        element: <CustomerGroupView />,
        handle: { title: 'Customer Group' },
      },

      { path: 'm/territory', element: <TerritoryView />, handle: { title: 'Territory' } },
      { path: 'm/territory/:queryId', element: <TerritoryView />, handle: { title: 'Territory' } },

      // add items
      { path: 'm/coupon-code', element: <CouponCodeView />, handle: { title: 'Coupon Code' } },
      {
        path: 'm/coupon-code/:queryId',
        element: <CouponCodeView />,
        handle: { title: 'Coupon Code' },
      },

      { path: 'm/item-group', element: <ItemGroupView />, handle: { title: 'Item Group' } },
      {
        path: 'm/item-group/:queryId',
        element: <ItemGroupView />,
        handle: { title: 'Item Group' },
      },

      { path: 'm/item-price', element: <ItemPriceView />, handle: { title: 'Item Price' } },
      {
        path: 'm/item-price/:queryId',
        element: <ItemPriceView />,
        handle: { title: 'Item Price' },
      },

      { path: 'm/price-list', element: <PriceListView />, handle: { title: 'Price List' } },
      {
        path: 'm/price-list/:queryId',
        element: <PriceListView />,
        handle: { title: 'Price List' },
      },

      { path: 'm/pricing-rule', element: <PricingRuleView />, handle: { title: 'Pricing Rule' } },
      {
        path: 'm/pricing-rule/:queryId',
        element: <PricingRuleView />,
        handle: { title: 'Pricing Rule' },
      },

      {
        path: 'm/product-bundle',
        element: <ProductBundleView />,
        handle: { title: 'Product Bundle' },
      },
      {
        path: 'm/product-bundle/:queryId',
        element: <ProductBundleView />,
        handle: { title: 'Product Bundle' },
      },

      {
        path: 'm/promotional-scheme',
        element: <PromotionalSchemeView />,
        handle: { title: 'Promotional Scheme' },
      },
      {
        path: 'm/promotional-scheme/:queryId',
        element: <PromotionalSchemeView />,
        handle: { title: 'Promotional Scheme' },
      },

      {
        path: 'm/shipping-rule',
        element: <ShippingRuleView />,
        handle: { title: 'Shipping Rule' },
      },
      {
        path: 'm/shipping-rule/:queryId',
        element: <ShippingRuleView />,
        handle: { title: 'Shipping Rule' },
      },

      // add items
      {
        path: 'm/loyalty-point-entry',
        element: <LoyaltyPointEntryView />,
        handle: { title: 'Loyalty Point Entry' },
      },
      {
        path: 'm/loyalty-point-entry/:queryId',
        element: <LoyaltyPointEntryView />,
        handle: { title: 'Loyalty Point Entry' },
      },

      {
        path: 'm/loyalty-program',
        element: <LoyaltyProgramView />,
        handle: { title: 'Loyalty Program' },
      },
      {
        path: 'm/loyalty-program/:queryId',
        element: <LoyaltyProgramView />,
        handle: { title: 'Loyalty Program' },
      },

      {
        path: 'm/pos-closing-entry',
        element: <PosClosingEntryView />,
        handle: { title: 'Pos Closing Entry' },
      },
      {
        path: 'm/pos-closing-entry/:queryId',
        element: <PosClosingEntryView />,
        handle: { title: 'Pos Closing Entry' },
      },

      {
        path: 'm/pos-opening-entry',
        element: <PosOpeningEntryView />,
        handle: { title: 'Pos Opening Entry' },
      },
      {
        path: 'm/pos-opening-entry/:queryId',
        element: <PosOpeningEntryView />,
        handle: { title: 'Pos Opening Entry' },
      },

      { path: 'm/pos-profile', element: <PosProfileView />, handle: { title: 'Pos Profile' } },
      {
        path: 'm/pos-profile/:queryId',
        element: <PosProfileView />,
        handle: { title: 'Pos Profile' },
      },

      // add items

      {
        path: 'm/blanket-order',
        element: <BlanketOrderView />,
        handle: { title: 'Blanket Order' },
      },
      {
        path: 'm/blanket-order/:queryId',
        element: <BlanketOrderView />,
        handle: { title: 'Blanket Order' },
      },

      { path: 'm/quotation', element: <QuotationView />, handle: { title: 'Quotation' } },
      { path: 'm/quotation/:queryId', element: <QuotationView />, handle: { title: 'Quotation' } },

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

      { path: 'm/sales-order', element: <SalesOrderView />, handle: { title: 'Sales Order' } },
      {
        path: 'm/sales-order/:queryId',
        element: <SalesOrderView />,
        handle: { title: 'Sales Order' },
      },

      {
        path: 'm/sales-partner',
        element: <SalesPartnerView />,
        handle: { title: 'Sales Partner' },
      },
      {
        path: 'm/sales-partner/:queryId',
        element: <SalesPartnerView />,
        handle: { title: 'Sales Partner' },
      },

      { path: 'm/sales-person', element: <SalesPersonView />, handle: { title: 'Sales Person' } },
      {
        path: 'm/sales-person/:queryId',
        element: <SalesPersonView />,
        handle: { title: 'Sales Person' },
      },

      // Add items

      { path: 'm/address', element: <AddressView />, handle: { title: 'Address' } },
      { path: 'm/lead/:queryId', element: <AddressView />, handle: { title: 'Address' } },

      { path: 'm/campaign', element: <CampaignView />, handle: { title: 'Campaign' } },
      { path: 'm/campaign/:queryId', element: <CampaignView />, handle: { title: 'Campaign' } },

      { path: 'm/contact', element: <ContactView />, handle: { title: 'Contact' } },
      { path: 'm/contact/:queryId', element: <ContactView />, handle: { title: 'Contact' } },

      { path: 'm/lead-source', element: <LeadSourceView />, handle: { title: 'Lead Source' } },
      {
        path: 'm/lead-source/:queryId',
        element: <LeadSourceView />,
        handle: { title: 'Lead Source' },
      },

      {
        path: 'm/sales-taxes-and-charges',
        element: <SalesTaxesAndChargesView />,
        handle: { title: 'Sales Taxes And Charges' },
      },
      {
        path: 'm/sales-taxes-and-charges/:queryId',
        element: <SalesTaxesAndChargesView />,
        handle: { title: 'Sales Taxes And Charges' },
      },

      {
        path: 'm/terms-and-conditions',
        element: <TermsAndConditionsView />,
        handle: { title: 'Terms And Conditions' },
      },
      {
        path: 'm/terms-and-conditions/:queryId',
        element: <TermsAndConditionsView />,
        handle: { title: 'Terms And Conditions' },
      },

      // { path: 'm/lead', element: <LeadView />, handle: { title: 'Lead' } },
      // { path: 'm/lead/:queryId', element: <LeadView />, handle: { title: 'Lead' } },
    ],
  },
];

// export default createBrowserRouter(routes, { basename: prod ? '/protisthan' : '/' });

export const router = createBrowserRouter([...routes], {
  basename: new URL(document.baseURI).pathname,
});
