import MainLayout from 'Frontend/views/MainLayout.js';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import ErrorView from './views/default/ErrorView';
import AccountView from './views/erp/module/accounts/AccountView';
import CostCenterView from './views/erp/module/accounts/CostCenterView';
import CouponCodeView from './views/erp/module/accounts/CouponCodeView';
import CurrencyExchangeSettingsDetailsView from './views/erp/module/accounts/CurrencyExchangeSettingsDetailsView';
import CurrencyExchangeSettingsResultView from './views/erp/module/accounts/CurrencyExchangeSettingsResultView';
import ItemTaxTemplateDetailView from './views/erp/module/accounts/ItemTaxTemplateDetailView';
import ItemTaxTemplateView from './views/erp/module/accounts/ItemTaxTemplateView';
import LoyaltyPointEntryView from './views/erp/module/accounts/LoyaltyPointEntryView';
import LoyaltyProgramView from './views/erp/module/accounts/LoyaltyProgramView';
import ModeofPaymentAccountView from './views/erp/module/accounts/ModeofPaymentAccountView';
import ModeofPaymentView from './views/erp/module/accounts/ModeofPaymentView';
import PaymentLedgerEntryView from './views/erp/module/accounts/PaymentLedgerEntryView';
import PosClosingEntryView from './views/erp/module/accounts/PosClosingEntryView';
import PosOpeningEntryView from './views/erp/module/accounts/PosOpeningEntryView';
import PosProfileView from './views/erp/module/accounts/PosProfileView';
import PricingRuleView from './views/erp/module/accounts/PricingRuleView';
import ProcessDeferredAccountingView from './views/erp/module/accounts/ProcessDeferredAccountingView';
import PromotionalSchemeView from './views/erp/module/accounts/PromotionalSchemeView';
import PurchaseTaxesAndChargesTemplateView from './views/erp/module/accounts/PurchaseTaxesAndChargesTemplateView';
import PurchaseTaxesandChargesView from './views/erp/module/accounts/PurchaseTaxesandChargesView';
import SalesInvoiceItemView from './views/erp/module/accounts/SalesInvoiceItemView';
import SalesInvoiceView from './views/erp/module/accounts/SalesInvoiceView';
import SalesTaxesAndChargesTemplateView from './views/erp/module/accounts/SalesTaxesAndChargesTemplateView';
import SalesTaxesAndChargesView from './views/erp/module/accounts/SalesTaxesAndChargesView';
import ShareTypeView from './views/erp/module/accounts/ShareTypeView';
import ShippingRuleView from './views/erp/module/accounts/ShippingRuleView';
import SupplierScorecardStandingView from './views/erp/module/buying/SupplierScorecardStandingView';
import SupplierScorecardVariableView from './views/erp/module/buying/SupplierScorecardVariableView';
import SupplierView from './views/erp/module/buying/SupplierView';
import AddressView from './views/erp/module/contacts/AddressView';
import ContactView from './views/erp/module/contacts/ContactView';
import GenderView from './views/erp/module/contacts/GenderView';
import SalutationView from './views/erp/module/contacts/SalutationView';
import AccessLogView from './views/erp/module/core/AccessLogView';
import ActivityLogView from './views/erp/module/core/ActivityLogView';
import CommentView from './views/erp/module/core/CommentView';
import DefaultValueView from './views/erp/module/core/DefaultValueView';
import DeletedDocumentView from './views/erp/module/core/DeletedDocumentView';
import DocShareView from './views/erp/module/core/DocShareView';
import DocTypeActionView from './views/erp/module/core/DocTypeActionView';
import DocTypeLinkView from './views/erp/module/core/DocTypeLinkView';
import DocTypeStateView from './views/erp/module/core/DocTypeStateView';
import DomainView from './views/erp/module/core/DomainView';
import FileView from './views/erp/module/core/FileView';
import LanguageView from './views/erp/module/core/LanguageView';
import LogsToClearView from './views/erp/module/core/LogsToClearView';
import ModuleProfileView from './views/erp/module/core/ModuleProfileView';
import NavbarItemView from './views/erp/module/core/NavbarItemView';
import PageView from './views/erp/module/core/PageView';
import PatchLogView from './views/erp/module/core/PatchLogView';
import ReportView from './views/erp/module/core/ReportView';
import RolePermissionView from './views/erp/module/core/RolePermissionView';
import RoleProfileView from './views/erp/module/core/RoleProfileView';
import RoleView from './views/erp/module/core/RoleView';
import ScheduledJobLogView from './views/erp/module/core/ScheduledJobLogView';
import ScheduledJobTypeView from './views/erp/module/core/ScheduledJobTypeView';
import SuccessActionView from './views/erp/module/core/SuccessActionView';
import UserProfileView from './views/erp/module/core/UserProfileView';
import UserTypeView from './views/erp/module/core/UserTypeView';
import UserView from './views/erp/module/core/UserView';
import VersionView from './views/erp/module/core/VersionView';
import CampaignView from './views/erp/module/crm/CampaignView';
import LeadSourceView from './views/erp/module/crm/LeadSourceView';
import LeadView from './views/erp/module/crm/LeadView';
import MarketSegmentView from './views/erp/module/crm/MarketSegmentView';
import OpportunityTypeView from './views/erp/module/crm/OpportunityTypeView';
import SalesStageView from './views/erp/module/crm/SalesStageView';
import BlanketOrderView from './views/erp/module/manufacturing/BlanketOrderView';
import CustomerView from './views/erp/module/selling/CustomerView';
import ProductBundleView from './views/erp/module/selling/ProductBundleView';
import QuotationView from './views/erp/module/selling/QuotationView';
import SalesOrderView from './views/erp/module/selling/SalesOrderView';
import BrandView from './views/erp/module/setup/BrandView';
import CompanyView from './views/erp/module/setup/CompanyView';
import CustomerGroupView from './views/erp/module/setup/CustomerGroupView';
import ItemGroupView from './views/erp/module/setup/ItemGroupView';
import SalesPartnerView from './views/erp/module/setup/SalesPartnerView';
import SalesPersonView from './views/erp/module/setup/SalesPersonView';
import TermsAndConditionsView from './views/erp/module/setup/TermsAndConditionsView';
import TerritoryView from './views/erp/module/setup/TerritoryView';
import UomView from './views/erp/module/setup/UomView';
import ItemPriceView from './views/erp/module/stock/ItemPriceView';
import ItemsView from './views/erp/module/stock/ItemsView';
import PriceListView from './views/erp/module/stock/PriceListView';
import StockReconciliationView from './views/erp/module/stock/StockReconciliationView';
import WarehouseView from './views/erp/module/stock/WarehouseView';
import CommonView from './views/erp/sidenav/CommonView';

// const AboutView = lazy(async () => import('Frontend/views/about/AboutView'));
export const routes: RouteObject[] = [
  {
    // path: rootPath,
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '*', element: <ErrorView /> },
      { path: '', element: <UserProfileView />, handle: { title: 'Home' } },
      { path: ':workspace', element: <CommonView />, handle: {} },
      // { path: 'shops', element: <ShopView />, handle: { title: 'Dashboard' } },

      // Module

      // ## Accounts
      { path: 'm/account', element: <AccountView />, handle: { title: 'Account' } },
      { path: 'm/account/:queryId', element: <AccountView />, handle: { title: 'Account' } },

      { path: 'm/coupon-code', element: <CouponCodeView />, handle: { title: 'Coupon Code' } },
      {
        path: 'm/coupon-code/:queryId',
        element: <CouponCodeView />,
        handle: { title: 'Coupon Code' },
      },

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

      { path: 'm/pricing-rule', element: <PricingRuleView />, handle: { title: 'Pricing Rule' } },
      {
        path: 'm/pricing-rule/:queryId',
        element: <PricingRuleView />,
        handle: { title: 'Pricing Rule' },
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
        path: 'm/sales-invoice',
        element: <SalesInvoiceView />,
        handle: { title: 'Sales Invoice' },
      },
      {
        path: 'm/sales-invoice/:queryId',
        element: <SalesInvoiceView />,
        handle: { title: 'Sales Invoice' },
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
        path: 'm/shipping-rule',
        element: <ShippingRuleView />,
        handle: { title: 'Shipping Rule' },
      },
      {
        path: 'm/shipping-rule/:queryId',
        element: <ShippingRuleView />,
        handle: { title: 'Shipping Rule' },
      },

      {
        path: 'm/cost-center',
        element: <CostCenterView />,
        handle: { title: 'Cost Center' },
      },
      {
        path: 'm/cost-center/:queryId',
        element: <CostCenterView />,
        handle: { title: 'Cost Center' },
      },

      {
        path: 'm/currency-exchange-settings-details',
        element: <CurrencyExchangeSettingsDetailsView />,
        handle: { title: 'Currency Exchange Settings Details' },
      },
      {
        path: 'm/currency-exchange-settings-details/:queryId',
        element: <CurrencyExchangeSettingsDetailsView />,
        handle: { title: 'Currency Exchange Settings Details' },
      },

      {
        path: 'm/currency-exchange-settings-result',
        element: <CurrencyExchangeSettingsResultView />,
        handle: { title: 'Currency Exchange Settings Result' },
      },
      {
        path: 'm/currency-exchange-settings-result/:queryId',
        element: <CurrencyExchangeSettingsResultView />,
        handle: { title: 'Currency Exchange Settings Result' },
      },

      {
        path: 'm/item-tax-template',
        element: <ItemTaxTemplateView />,
        handle: { title: 'Item Tax Template' },
      },
      {
        path: 'm/item-tax-template/:queryId',
        element: <ItemTaxTemplateView />,
        handle: { title: 'Item Tax Template' },
      },

      {
        path: 'm/item-tax-template-detail',
        element: <ItemTaxTemplateDetailView />,
        handle: { title: 'Item Tax Template Detail' },
      },
      {
        path: 'm/item-tax-template-detail/:queryId',
        element: <ItemTaxTemplateDetailView />,
        handle: { title: 'Item Tax Template Detail' },
      },

      {
        path: 'm/mode-of-payment',
        element: <ModeofPaymentView />,
        handle: { title: 'Mode of Payment' },
      },
      {
        path: 'm/mode-of-payment/:queryId',
        element: <ModeofPaymentView />,
        handle: { title: 'Mode of Payment' },
      },

      {
        path: 'm/mode-of-payment-account',
        element: <ModeofPaymentAccountView />,
        handle: { title: 'Mode of Payment Account' },
      },
      {
        path: 'm/mode-of-payment-account/:queryId',
        element: <ModeofPaymentAccountView />,
        handle: { title: 'Mode of Payment Account' },
      },

      {
        path: 'm/payment-ledger-entry',
        element: <PaymentLedgerEntryView />,
        handle: { title: 'Payment Ledger Entry' },
      },
      {
        path: 'm/payment-ledger-entry/:queryId',
        element: <PaymentLedgerEntryView />,
        handle: { title: 'Payment Ledger Entry' },
      },

      {
        path: 'm/process-deferred-accounting',
        element: <ProcessDeferredAccountingView />,
        handle: { title: 'Process Deferred Accounting' },
      },
      {
        path: 'm/process-deferred-accounting/:queryId',
        element: <ProcessDeferredAccountingView />,
        handle: { title: 'Process Deferred Accounting' },
      },

      {
        path: 'm/purchase-taxes-and-charges',
        element: <PurchaseTaxesandChargesView />,
        handle: { title: 'Purchase Taxes and Charges' },
      },
      {
        path: 'm/purchase-taxes-and-charges/:queryId',
        element: <PurchaseTaxesandChargesView />,
        handle: { title: 'Purchase Taxes and Charges' },
      },

      {
        path: 'm/purchase-taxes-and-charges-template',
        element: <PurchaseTaxesAndChargesTemplateView />,
        handle: { title: 'Purchase Taxes and Charges Template' },
      },
      {
        path: 'm/purchase-taxes-and-charges-template/:queryId',
        element: <PurchaseTaxesAndChargesTemplateView />,
        handle: { title: 'Purchase Taxes and Charges Template' },
      },

      {
        path: 'm/sales-invoice-item',
        element: <SalesInvoiceItemView />,
        handle: { title: 'Sales Invoice Item' },
      },
      {
        path: 'm/sales-invoice-item/:queryId',
        element: <SalesInvoiceItemView />,
        handle: { title: 'Sales Invoice Item' },
      },

      {
        path: 'm/sales-taxes-and-charges-template',
        element: <SalesTaxesAndChargesTemplateView />,
        handle: { title: 'Sales Taxes and Charges Template' },
      },
      {
        path: 'm/sales-taxes-and-charges-template/:queryId',
        element: <SalesTaxesAndChargesTemplateView />,
        handle: { title: 'Sales Taxes and Charges Template' },
      },

      {
        path: 'm/share-type',
        element: <ShareTypeView />,
        handle: { title: 'Share Type' },
      },
      {
        path: 'm/share-type/:queryId',
        element: <ShareTypeView />,
        handle: { title: 'Share Type' },
      },

      // ## Buying

      { path: 'm/supplier', element: <SupplierView />, handle: { title: 'Supplier' } },
      { path: 'm/supplier/:queryId', element: <SupplierView />, handle: { title: 'Supplier' } },

      {
        path: 'm/supplier-scorecard-standing',
        element: <SupplierScorecardStandingView />,
        handle: { title: 'Supplier' },
      },
      {
        path: 'm/supplier-scorecard-standing/:queryId',
        element: <SupplierScorecardStandingView />,
        handle: { title: 'Supplier Scorecard Standing' },
      },

      {
        path: 'm/supplier-scorecard-variable',
        element: <SupplierScorecardVariableView />,
        handle: { title: 'Supplier' },
      },
      {
        path: 'm/supplier-scorecard-variable/:queryId',
        element: <SupplierScorecardVariableView />,
        handle: { title: 'Supplier Scorecard Variable' },
      },

      // ## Contacts

      { path: 'm/address', element: <AddressView />, handle: { title: 'Address' } },
      { path: 'm/lead/:queryId', element: <AddressView />, handle: { title: 'Address' } },

      { path: 'm/contact', element: <ContactView />, handle: { title: 'Contact' } },
      { path: 'm/contact/:queryId', element: <ContactView />, handle: { title: 'Contact' } },

      { path: 'm/gender', element: <GenderView />, handle: { title: 'Gender' } },
      { path: 'm/gender/:queryId', element: <GenderView />, handle: { title: 'Gender' } },

      { path: 'm/salutation', element: <SalutationView />, handle: { title: 'Salutation' } },
      {
        path: 'm/salutation/:queryId',
        element: <SalutationView />,
        handle: { title: 'Salutation' },
      },

      // ## Core

      { path: 'm/access-log', element: <AccessLogView />, handle: { title: 'Access Log' } },
      {
        path: 'm/access-log/:queryId',
        element: <AccessLogView />,
        handle: { title: 'Access Log' },
      },

      { path: 'm/activity-log', element: <ActivityLogView />, handle: { title: 'Activity Log' } },
      {
        path: 'm/activity-log/:queryId',
        element: <ActivityLogView />,
        handle: { title: 'Activity Log' },
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

      {
        path: 'm/permission-manager',
        element: <RolePermissionView />,
        handle: { title: 'Role Permission' },
      },

      { path: 'm/role', element: <RoleView />, handle: { title: 'Roles' } },
      { path: 'm/role/:queryId', element: <RoleView />, handle: { title: 'Roles' } },

      { path: 'm/role-profile', element: <RoleProfileView />, handle: { title: 'Role Profile' } },
      {
        path: 'm/role-profile/:queryId',
        element: <RoleProfileView />,
        handle: { title: 'Role Profile' },
      },

      { path: 'm/user-profile', element: <UserProfileView />, handle: { title: 'Profile' } },

      { path: 'm/user', element: <UserView />, handle: { title: 'User' } },
      { path: 'm/user/:queryId', element: <UserView />, handle: { title: 'User' } },

      { path: 'm/user-type', element: <UserTypeView />, handle: { title: 'User Type' } },
      { path: 'm/user-type/:queryId', element: <UserTypeView />, handle: { title: 'User Type' } },

      { path: 'm/comment', element: <CommentView />, handle: { title: 'Comment' } },
      { path: 'm/comment/:queryId', element: <CommentView />, handle: { title: 'Comment' } },

      { path: 'm/defaultvalue', element: <DefaultValueView />, handle: { title: 'DefaultValue' } },
      {
        path: 'm/defaultvalue/:queryId',
        element: <DefaultValueView />,
        handle: { title: 'DefaultValue' },
      },

      {
        path: 'm/deleted-document',
        element: <DeletedDocumentView />,
        handle: { title: 'Deleted Document' },
      },
      {
        path: 'm/deleted-document/:queryId',
        element: <DeletedDocumentView />,
        handle: { title: 'Deleted Document' },
      },

      { path: 'm/docshare', element: <DocShareView />, handle: { title: 'DocShare' } },
      { path: 'm/docshare/:queryId', element: <DocShareView />, handle: { title: 'DocShare' } },

      {
        path: 'm/doctype-action',
        element: <DocTypeActionView />,
        handle: { title: 'DocType Action' },
      },
      {
        path: 'm/doctype-action/:queryId',
        element: <DocTypeActionView />,
        handle: { title: 'DocType Action' },
      },

      { path: 'm/doctype-link', element: <DocTypeLinkView />, handle: { title: 'DocType Link' } },
      {
        path: 'm/doctype-link/:queryId',
        element: <DocTypeLinkView />,
        handle: { title: 'DocType Link' },
      },

      {
        path: 'm/doctype-state',
        element: <DocTypeStateView />,
        handle: { title: 'DocType State' },
      },
      {
        path: 'm/doctype-state/:queryId',
        element: <DocTypeStateView />,
        handle: { title: 'DocType State' },
      },

      { path: 'm/domain', element: <DomainView />, handle: { title: 'Domain' } },
      { path: 'm/domain/:queryId', element: <DomainView />, handle: { title: 'Domain' } },

      { path: 'm/file', element: <FileView />, handle: { title: 'File' } },
      { path: 'm/file/:queryId', element: <FileView />, handle: { title: 'File' } },

      { path: 'm/language', element: <LanguageView />, handle: { title: 'Language' } },
      { path: 'm/language/:queryId', element: <LanguageView />, handle: { title: 'Language' } },

      { path: 'm/logs-to-clear', element: <LogsToClearView />, handle: { title: 'Logs To Clear' } },
      {
        path: 'm/logs-to-clear/:queryId',
        element: <LogsToClearView />,
        handle: { title: 'Logs To Clear' },
      },

      { path: 'm/navbar-item', element: <NavbarItemView />, handle: { title: 'Navbar Item' } },
      {
        path: 'm/navbar-item/:queryId',
        element: <NavbarItemView />,
        handle: { title: 'Navbar Item' },
      },

      { path: 'm/page', element: <PageView />, handle: { title: 'Page' } },
      { path: 'm/page/:queryId', element: <PageView />, handle: { title: 'Page' } },

      { path: 'm/patch-log', element: <PatchLogView />, handle: { title: 'Patch Log' } },
      { path: 'm/patch-log/:queryId', element: <PatchLogView />, handle: { title: 'Patch Log' } },

      { path: 'm/report', element: <ReportView />, handle: { title: 'Report' } },
      { path: 'm/report/:queryId', element: <ReportView />, handle: { title: 'Report' } },

      {
        path: 'm/scheduled-job-log',
        element: <ScheduledJobLogView />,
        handle: { title: 'Scheduled Job Log' },
      },
      {
        path: 'm/scheduled-job-log/:queryId',
        element: <ScheduledJobLogView />,
        handle: { title: 'Scheduled Job Log' },
      },

      {
        path: 'm/scheduled-job-type',
        element: <ScheduledJobTypeView />,
        handle: { title: 'Scheduled Job Type' },
      },
      {
        path: 'm/scheduled-job-type/:queryId',
        element: <ScheduledJobTypeView />,
        handle: { title: 'Scheduled Job Type' },
      },

      {
        path: 'm/success-action',
        element: <SuccessActionView />,
        handle: { title: 'Success Action' },
      },
      {
        path: 'm/success-action/:queryId',
        element: <SuccessActionView />,
        handle: { title: 'Success Action' },
      },

      { path: 'm/version', element: <VersionView />, handle: { title: 'Version' } },
      { path: 'm/version/:queryId', element: <VersionView />, handle: { title: 'Version' } },

      // ## Crm

      { path: 'm/campaign', element: <CampaignView />, handle: { title: 'Campaign' } },
      { path: 'm/campaign/:queryId', element: <CampaignView />, handle: { title: 'Campaign' } },

      { path: 'm/lead-source', element: <LeadSourceView />, handle: { title: 'Lead Source' } },
      {
        path: 'm/lead-source/:queryId',
        element: <LeadSourceView />,
        handle: { title: 'Lead Source' },
      },

      { path: 'm/lead', element: <LeadView />, handle: { title: 'Lead' } },
      { path: 'm/lead/:queryId', element: <LeadView />, handle: { title: 'Lead' } },

      {
        path: 'm/market-segment',
        element: <MarketSegmentView />,
        handle: { title: 'Market Segment' },
      },
      {
        path: 'm/market-segment/:queryId',
        element: <MarketSegmentView />,
        handle: { title: 'Market Segment' },
      },

      {
        path: 'm/opportunity-type',
        element: <OpportunityTypeView />,
        handle: { title: 'Opportunity Type' },
      },
      {
        path: 'm/opportunity-type/:queryId',
        element: <OpportunityTypeView />,
        handle: { title: 'Opportunity Type' },
      },

      { path: 'm/sales-stage', element: <SalesStageView />, handle: { title: 'Sales Stage' } },
      {
        path: 'm/sales-stage/:queryId',
        element: <SalesStageView />,
        handle: { title: 'Sales Stage' },
      },
      // ## Manufacturing

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

      // ## Selling

      { path: 'm/customer', element: <CustomerView />, handle: { title: 'Customer' } },
      { path: 'm/customer/:queryId', element: <CustomerView />, handle: { title: 'Customer' } },

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
      { path: 'm/quotation', element: <QuotationView />, handle: { title: 'Quotation' } },
      { path: 'm/quotation/:queryId', element: <QuotationView />, handle: { title: 'Quotation' } },

      { path: 'm/sales-order', element: <SalesOrderView />, handle: { title: 'Sales Order' } },
      {
        path: 'm/sales-order/:queryId',
        element: <SalesOrderView />,
        handle: { title: 'Sales Order' },
      },

      // ## Setup

      { path: 'm/brand', element: <BrandView />, handle: { title: 'Brand' } },
      { path: 'm/brand/:queryId', element: <BrandView />, handle: { title: 'Brand' } },

      { path: 'm/company', element: <CompanyView />, handle: { title: 'Company' } },
      { path: 'm/company/:queryId', element: <CompanyView />, handle: { title: 'Company' } },

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

      { path: 'm/item-group', element: <ItemGroupView />, handle: { title: 'Item Group' } },
      {
        path: 'm/item-group/:queryId',
        element: <ItemGroupView />,
        handle: { title: 'Item Group' },
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

      { path: 'm/territory', element: <TerritoryView />, handle: { title: 'Territory' } },
      { path: 'm/territory/:queryId', element: <TerritoryView />, handle: { title: 'Territory' } },

      { path: 'm/uom', element: <UomView />, handle: { title: 'UOM' } },
      { path: 'm/uom/:queryId', element: <UomView />, handle: { title: 'UOM' } },

      // ## Stock

      { path: 'm/item', element: <ItemsView />, handle: { title: 'Items' } },
      { path: 'm/item/:queryId', element: <ItemsView />, handle: { title: 'Items' } },

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

      { path: 'm/warehouse', element: <WarehouseView />, handle: { title: 'Warehouse' } },
      { path: 'm/warehouse/:queryId', element: <WarehouseView />, handle: { title: 'Warehouse' } },

      // ## End

      // { path: 'm/lead', element: <LeadView />, handle: { title: 'Lead' } },
      // { path: 'm/lead/:queryId', element: <LeadView />, handle: { title: 'Lead' } },
    ],
  },
];

export const router = createBrowserRouter([...routes], {
  basename: new URL(document.baseURI).pathname,
});
