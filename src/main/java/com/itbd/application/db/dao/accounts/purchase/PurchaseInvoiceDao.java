package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_purchase_invoice", indexes = {
        @Index(name = "idx_supplier", columnList = "tx_supplier"),
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_return_against", columnList = "tx_return_against"),
        @Index(name = "idx_bill_no", columnList = "tx_bill_no"),
        @Index(name = "idx_credit_to", columnList = "tx_credit_to"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PurchaseInvoiceDao {

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

    @Column(name = "tx_title", length = 140)
    @ColumnDefault("'{supplier_name}'")
    private String title;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_supplier_name", length = 140)
    private String supplierName;

    @Column(name = "tx_taxId", length = 140)
    private String taxId;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "is_set_posting_time", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingTime;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "is_paid", nullable = false)
    @ColumnDefault("0")
    private Boolean isPaid;

    @Column(name = "is_return", nullable = false)
    @ColumnDefault("0")
    private Boolean isReturn;

    @Column(name = "tx_return_against", length = 140)
    private String returnAgainst;

    @Column(name = "is_update_outstanding_for_self", nullable = false)
    @ColumnDefault("1")
    private Boolean updateOutstandingForSelf;

    @Column(name = "is_update_billed_amount_in_purchase_order", nullable = false)
    @ColumnDefault("0")
    private Boolean updateBilledAmountInPurchaseOrder;

    @Column(name = "is_update_billed_amount_in_purchase_receipt", nullable = false)
    @ColumnDefault("1")
    private Boolean updateBilledAmountInPurchaseReceipt;

    @Column(name = "is_apply_tds", nullable = false)
    @ColumnDefault("0")
    private Boolean applyTds;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_bill_no", length = 140)
    private String billNo;

    @Column(name = "dt_billDate")
    private LocalDate billDate;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionRate;

    @Column(name = "is_use_transaction_date_exchange_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean useTransactionDateExchangeRate;

    @Column(name = "tx_buying_price_list", length = 140)
    private String buyingPriceList;

    @Column(name = "tx_price_list_currency", length = 140)
    private String priceListCurrency;

    @Column(name = "flt_plc_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plcConversionRate;

    @Column(name = "is_ignore_pricing_rule", nullable = false)
    @ColumnDefault("0")
    private Boolean ignorePricingRule;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "is_update_stock", nullable = false)
    @ColumnDefault("0")
    private Boolean updateStock;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

    @Column(name = "tx_set_from_warehouse", length = 140)
    private String setFromWarehouse;

    @Column(name = "is_subcontracted", nullable = false)
    @ColumnDefault("0")
    private Boolean isSubcontracted;

    @Column(name = "tx_rejected_warehouse", length = 140)
    private String rejectedWarehouse;

    @Column(name = "tx_supplier_warehouse", length = 140)
    private String supplierWarehouse;

    @Column(name = "flt_total_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalQty;

    @Column(name = "flt_total_net_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalNetWeight;

    @Column(name = "flt_base_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotal;

    @Column(name = "flt_base_net_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseNetTotal;

    @Column(name = "flt_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal total;

    @Column(name = "flt_net_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netTotal;

    @Column(name = "flt_tax_withholding_net_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxWithholdingNetTotal;

    @Column(name = "flt_base_tax_withholding_net_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTaxWithholdingNetTotal;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_taxes_and_charges", length = 140)
    private String taxesAndCharges;

    @Column(name = "tx_shipping_rule", length = 140)
    private String shippingRule;

    @Column(name = "tx_incoterm", length = 140)
    private String incoterm;

    @Column(name = "tx_named_place", length = 140)
    private String namedPlace;

    @Column(name = "flt_base_taxes_and_charges_added", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTaxesAndChargesAdded;

    @Column(name = "flt_base_taxes_and_charges_deducted", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTaxesAndChargesDeducted;

    @Column(name = "flt_base_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalTaxesAndCharges;

    @Column(name = "flt_taxes_and_charges_added", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxesAndChargesAdded;

    @Column(name = "flt_taxes_and_charges_deducted", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxesAndChargesDeducted;

    @Column(name = "flt_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalTaxesAndCharges;

    @Column(name = "flt_base_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseGrandTotal;

    @Column(name = "flt_base_rounding_adjustment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRoundingAdjustment;

    @Column(name = "flt_base_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRoundedTotal;

    @Column(name = "tx_base_in_words", length = 240)
    private String baseInWords;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "flt_rounding_adjustment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundingAdjustment;

    @Column(name = "is_use_company_roundoff_cost_center", nullable = false)
    @ColumnDefault("0")
    private Boolean useCompanyRoundoffCostCenter;

    @Column(name = "flt_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundedTotal;

    @Column(name = "tx_in_words", length = 240)
    private String inWords;

    @Column(name = "flt_total_advance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAdvance;

    @Column(name = "flt_outstanding_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstandingAmount;

    @Column(name = "is_disable_rounded_total", nullable = false)
    @ColumnDefault("0")
    private Boolean disableRoundedTotal;

    @Column(name = "tx_apply_discount_on", length = 140)
    @ColumnDefault("'Grand Total'")
    private String applyDiscountOn;

    @Column(name = "flt_base_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseDiscountAmount;

    @Column(name = "flt_additional_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalDiscountPercentage;

    @Column(name = "flt_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountAmount;

    @Column(name = "tx_other_charges_calculation", columnDefinition = "longtext")
    private String otherChargesCalculation;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "flt_base_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePaidAmount;

    @Column(name = "dt_clearanceDate")
    private LocalDate clearanceDate;

    @Column(name = "tx_cash_bank_account", length = 140)
    private String cashBankAccount;

    @Column(name = "flt_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidAmount;

    @Column(name = "is_allocate_advances_automatically", nullable = false)
    @ColumnDefault("0")
    private Boolean allocateAdvancesAutomatically;

    @Column(name = "is_only_include_allocated_payments", nullable = false)
    @ColumnDefault("0")
    private Boolean onlyIncludeAllocatedPayments;

    @Column(name = "flt_write_off_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal writeOffAmount;

    @Column(name = "flt_base_write_off_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseWriteOffAmount;

    @Column(name = "tx_write_off_account", length = 140)
    private String writeOffAccount;

    @Column(name = "tx_write_off_cost_center", length = 140)
    private String writeOffCostCenter;

    @Column(name = "tx_supplier_address", length = 140)
    private String supplierAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_contact_mobile", columnDefinition = "text")
    private String contactMobile;

    @Column(name = "tx_contact_email", columnDefinition = "text")
    private String contactEmail;

    @Column(name = "tx_shipping_address", length = 140)
    private String shippingAddress;

    @Column(name = "tx_shipping_address_display", columnDefinition = "text")
    private String shippingAddressDisplay;

    @Column(name = "tx_billing_address", length = 140)
    private String billingAddress;

    @Column(name = "tx_billing_address_display", columnDefinition = "text")
    private String billingAddressDisplay;

    @Column(name = "tx_payment_terms_template", length = 140)
    private String paymentTermsTemplate;

    @Column(name = "is_ignore_default_payment_terms_template", nullable = false)
    @ColumnDefault("0")
    private Boolean ignoreDefaultPaymentTermsTemplate;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "flt_per_received", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perReceived;

    @Column(name = "tx_credit_to", length = 140)
    private String creditTo;

    @Column(name = "tx_party_account_currency", length = 140)
    private String partyAccountCurrency;

    @Column(name = "tx_is_opening", length = 140)
    @ColumnDefault("'No'")
    private String isOpening;

    @Column(name = "tx_against_expense_account", columnDefinition = "text")
    private String againstExpenseAccount;

    @Column(name = "tx_unrealized_profit_loss_account", length = 140)
    private String unrealizedProfitLossAccount;

    @Column(name = "is_repost_required", nullable = false)
    @ColumnDefault("0")
    private Boolean repostRequired;

    @Column(name = "tx_subscription", length = 140)
    private String subscription;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "is_group_same_items", nullable = false)
    @ColumnDefault("0")
    private Boolean groupSameItems;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "is_on_hold", nullable = false)
    @ColumnDefault("0")
    private Boolean onHold;

    @Column(name = "dt_releaseDate")
    private LocalDate releaseDate;

    @Column(name = "tx_hold_comment", columnDefinition = "text")
    private String holdComment;

    @Column(name = "is_internal_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean isInternalSupplier;

    @Column(name = "tx_represents_company", length = 140)
    private String representsCompany;

    @Column(name = "tx_supplier_group", length = 140)
    private String supplierGroup;

    @Column(name = "tx_inter_company_invoice_reference", length = 140)
    private String interCompanyInvoiceReference;

    @Column(name = "is_old_subcontracting_flow", nullable = false)
    @ColumnDefault("0")
    private Boolean isOldSubcontractingFlow;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
