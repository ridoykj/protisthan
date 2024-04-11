package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_company", indexes = {
        @Index(name = "idx_lft", columnList = "ct_lft"),
        @Index(name = "idx_rgt", columnList = "ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_company_name", columnNames = {"tx_company_name"})
})
public class CompanyDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false, length = 140)
    private String name;

    @Column(name = "dtt_creation")
    private LocalDateTime creation;

    @Column(name = "dtt_modified")
    private LocalDateTime modified;

    @Column(name = "tx_modified_by", length = 140)
    private String modifiedBy;

    @Column(name = "tx_owner", length = 140)
    private String owner;

    @Column(name = "is_doc_status", nullable = false)
    @ColumnDefault("0")
    private Boolean isDocStatus;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_company_name", unique = true, length = 140)
    private String companyName;

    @Column(name = "tx_abbr", length = 140)
    private String abbr;

    @Column(name = "tx_default_currency", length = 140)
    private String defaultCurrency;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "tx_default_holiday_list", length = 140)
    private String defaultHolidayList;

    @Column(name = "tx_default_letter_head", length = 140)
    private String defaultLetterHead;

    @Column(name = "tx_taxId", length = 140)
    private String taxId;

    @Column(name = "tx_domain", length = 140)
    private String domain;

    @Column(name = "dt_dateOfEstablishment")
    private LocalDate dateOfEstablishment;

    @Column(name = "tx_parent_company", length = 140)
    private String parentCompany;

    @Column(name = "tx_company_logo", columnDefinition = "text")
    private String companyLogo;

    @Column(name = "dt_dateOfIncorporation")
    private LocalDate dateOfIncorporation;

    @Column(name = "tx_phone_no", length = 140)
    private String phoneNo;

    @Column(name = "tx_email", length = 140)
    private String email;

    @Column(name = "tx_company_description", columnDefinition = "longtext")
    private String companyDescription;

    @Column(name = "dt_dateOfCommencement")
    private LocalDate dateOfCommencement;

    @Column(name = "tx_fax", length = 140)
    private String fax;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_registration_details", columnDefinition = "longtext")
    private String registrationDetails;

    @Column(name = "ct_lft", nullable = false)
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    private Integer rgt;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "tx_create_chart_of_accounts_based_on", length = 140)
    private String createChartOfAccountsBasedOn;

    @Column(name = "tx_existing_company", length = 140)
    private String existingCompany;

    @Column(name = "tx_chart_of_accounts", length = 140)
    private String chartOfAccounts;

    @Column(name = "tx_default_bank_account", length = 140)
    private String defaultBankAccount;

    @Column(name = "tx_default_cash_account", length = 140)
    private String defaultCashAccount;

    @Column(name = "tx_default_receivable_account", length = 140)
    private String defaultReceivableAccount;

    @Column(name = "tx_round_off_account", length = 140)
    private String roundOffAccount;

    @Column(name = "tx_round_off_cost_center", length = 140)
    private String roundOffCostCenter;

    @Column(name = "tx_write_off_account", length = 140)
    private String writeOffAccount;

    @Column(name = "tx_exchange_gain_loss_account", length = 140)
    private String exchangeGainLossAccount;

    @Column(name = "tx_unrealized_exchange_gain_loss_account", length = 140)
    private String unrealizedExchangeGainLossAccount;

    @Column(name = "tx_unrealized_profit_loss_account", length = 140)
    private String unrealizedProfitLossAccount;

    @Column(name = "is_allow_account_creation_against_child_company", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAccountCreationAgainstChildCompany;

    @Column(name = "tx_default_payable_account", length = 140)
    private String defaultPayableAccount;

    @Column(name = "tx_default_expense_account", length = 140)
    private String defaultExpenseAccount;

    @Column(name = "tx_default_income_account", length = 140)
    private String defaultIncomeAccount;

    @Column(name = "tx_default_deferred_revenue_account", length = 140)
    private String defaultDeferredRevenueAccount;

    @Column(name = "tx_default_deferred_expense_account", length = 140)
    private String defaultDeferredExpenseAccount;

    @Column(name = "tx_default_discount_account", length = 140)
    private String defaultDiscountAccount;

    @Column(name = "tx_payment_terms", length = 140)
    private String paymentTerms;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_default_finance_book", length = 140)
    private String defaultFinanceBook;

    @Column(name = "is_book_advance_payments_in_separate_party_account", nullable = false)
    @ColumnDefault("0")
    private Boolean bookAdvancePaymentsInSeparatePartyAccount;

    @Column(name = "tx_default_advance_received_account", length = 140)
    private String defaultAdvanceReceivedAccount;

    @Column(name = "tx_default_advance_paid_account", length = 140)
    private String defaultAdvancePaidAccount;

    @Column(name = "is_auto_exchange_rate_revaluation", nullable = false)
    @ColumnDefault("0")
    private Boolean autoExchangeRateRevaluation;

    @Column(name = "tx_auto_err_frequency", length = 140)
    private String autoErrFrequency;

    @Column(name = "is_submit_err_jv", nullable = false)
    @ColumnDefault("0")
    private Boolean submitErrJv;

    @Column(name = "tx_exception_budget_approver_role", length = 140)
    private String exceptionBudgetApproverRole;

    @Column(name = "tx_accumulated_depreciation_account", length = 140)
    private String accumulatedDepreciationAccount;

    @Column(name = "tx_depreciation_expense_account", length = 140)
    private String depreciationExpenseAccount;

    @Column(name = "tx_series_for_depreciation_entry", length = 140)
    private String seriesForDepreciationEntry;

    @Column(name = "tx_expenses_included_in_asset_valuation", length = 140)
    private String expensesIncludedInAssetValuation;

    @Column(name = "tx_disposal_account", length = 140)
    private String disposalAccount;

    @Column(name = "tx_depreciation_cost_center", length = 140)
    private String depreciationCostCenter;

    @Column(name = "tx_capital_work_in_progress_account", length = 140)
    private String capitalWorkInProgressAccount;

    @Column(name = "tx_asset_received_but_not_billed", length = 140)
    private String assetReceivedButNotBilled;

    @Column(name = "tx_default_buying_terms", length = 140)
    private String defaultBuyingTerms;

    @Column(name = "tx_sales_monthly_history", columnDefinition = "text")
    private String salesMonthlyHistory;

    @Column(name = "flt_monthly_sales_target", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal monthlySalesTarget;

    @Column(name = "flt_total_monthly_sales", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalMonthlySales;

    @Column(name = "tx_default_selling_terms", length = 140)
    private String defaultSellingTerms;

    @Column(name = "tx_default_warehouse_for_sales_return", length = 140)
    private String defaultWarehouseForSalesReturn;

    @Column(name = "flt_credit_limit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal creditLimit;

    @Column(name = "tx_transactions_annual_history", columnDefinition = "longtext")
    private String transactionsAnnualHistory;

    @Column(name = "is_enable_perpetual_inventory", nullable = false)
    @ColumnDefault("1")
    private Boolean enablePerpetualInventory;

    @Column(name = "is_enable_provisional_accounting_for_non_stock_items", nullable = false)
    @ColumnDefault("0")
    private Boolean enableProvisionalAccountingForNonStockItems;

    @Column(name = "tx_default_inventory_account", length = 140)
    private String defaultInventoryAccount;

    @Column(name = "tx_stock_adjustment_account", length = 140)
    private String stockAdjustmentAccount;

    @Column(name = "tx_default_in_transit_warehouse", length = 140)
    private String defaultInTransitWarehouse;

    @Column(name = "tx_stock_received_but_not_billed", length = 140)
    private String stockReceivedButNotBilled;

    @Column(name = "tx_default_provisional_account", length = 140)
    private String defaultProvisionalAccount;

    @Column(name = "tx_expenses_included_in_valuation", length = 140)
    private String expensesIncludedInValuation;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
