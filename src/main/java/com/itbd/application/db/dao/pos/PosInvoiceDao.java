package com.itbd.application.db.dao.pos;


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
@Table(name = "t_pos_invoice", indexes = {
        @Index(name = "idx_customer", columnList = "tx_customer"),
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_return_against", columnList = "tx_return_against"),
        @Index(name = "idx_debit_to", columnList = "tx_debit_to"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PosInvoiceDao {

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
    @ColumnDefault("'{customer_name}'")
    private String title;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_tax_id", length = 140)
    private String taxId;

    @Column(name = "tx_pos_profile", length = 140)
    private String posProfile;

    @Column(name = "tx_consolidated_invoice", length = 140)
    private String consolidatedInvoice;

    @Column(name = "is_pos", nullable = false)
    @ColumnDefault("1")
    private Boolean isPos;

    @Column(name = "is_return", nullable = false)
    @ColumnDefault("0")
    private Boolean isReturn;

    @Column(name = "is_update_billed_amount_in_sales_order", nullable = false)
    @ColumnDefault("0")
    private Boolean updateBilledAmountInSalesOrder;

    @Column(name = "is_update_billed_amount_in_delivery_note", nullable = false)
    @ColumnDefault("1")
    private Boolean updateBilledAmountInDeliveryNote;

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

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_return_against", length = 140)
    private String returnAgainst;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_po_no", length = 140)
    private String poNo;

    @Column(name = "dt_poDate")
    private LocalDate poDate;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_contact_mobile", length = 140)
    private String contactMobile;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_shipping_address_name", length = 140)
    private String shippingAddressName;

    @Column(name = "tx_shipping_address", columnDefinition = "text")
    private String shippingAddress;

    @Column(name = "tx_company_address", length = 140)
    private String companyAddress;

    @Column(name = "tx_company_address_display", columnDefinition = "text")
    private String companyAddressDisplay;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionRate;

    @Column(name = "tx_selling_price_list", length = 140)
    private String sellingPriceList;

    @Column(name = "tx_price_list_currency", length = 140)
    private String priceListCurrency;

    @Column(name = "flt_plc_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plcConversionRate;

    @Column(name = "is_ignore_pricing_rule", nullable = false)
    @ColumnDefault("0")
    private Boolean ignorePricingRule;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

    @Column(name = "is_update_stock", nullable = false)
    @ColumnDefault("0")
    private Boolean updateStock;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "flt_total_billing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBillingAmount;

    @Column(name = "flt_total_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalQty;

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

    @Column(name = "flt_total_net_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalNetWeight;

    @Column(name = "tx_taxes_and_charges", length = 140)
    private String taxesAndCharges;

    @Column(name = "tx_shipping_rule", length = 140)
    private String shippingRule;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_other_charges_calculation", columnDefinition = "longtext")
    private String otherChargesCalculation;

    @Column(name = "flt_base_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalTaxesAndCharges;

    @Column(name = "flt_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalTaxesAndCharges;

    @Column(name = "ct_loyalty_points", nullable = false)
    private Integer loyaltyPoints;

    @Column(name = "flt_loyalty_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal loyaltyAmount;

    @Column(name = "is_redeem_loyalty_points", nullable = false)
    @ColumnDefault("0")
    private Boolean redeemLoyaltyPoints;

    @Column(name = "tx_loyalty_program", length = 140)
    private String loyaltyProgram;

    @Column(name = "tx_loyalty_redemption_account", length = 140)
    private String loyaltyRedemptionAccount;

    @Column(name = "tx_loyalty_redemption_cost_center", length = 140)
    private String loyaltyRedemptionCostCenter;

    @Column(name = "tx_coupon_code", length = 140)
    private String couponCode;

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

    @Column(name = "flt_base_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseGrandTotal;

    @Column(name = "flt_base_rounding_adjustment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRoundingAdjustment;

    @Column(name = "flt_base_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRoundedTotal;

    @Column(name = "tx_base_in_words", length = 140)
    private String baseInWords;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "flt_rounding_adjustment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundingAdjustment;

    @Column(name = "flt_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundedTotal;

    @Column(name = "tx_in_words", length = 140)
    private String inWords;

    @Column(name = "flt_total_advance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAdvance;

    @Column(name = "flt_outstanding_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstandingAmount;

    @Column(name = "is_allocate_advances_automatically", nullable = false)
    @ColumnDefault("0")
    private Boolean allocateAdvancesAutomatically;

    @Column(name = "tx_payment_terms_template", length = 140)
    private String paymentTermsTemplate;

    @Column(name = "tx_cash_bank_account", length = 140)
    private String cashBankAccount;

    @Column(name = "flt_base_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePaidAmount;

    @Column(name = "flt_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidAmount;

    @Column(name = "flt_base_change_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseChangeAmount;

    @Column(name = "flt_change_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal changeAmount;

    @Column(name = "tx_account_for_change_amount", length = 140)
    private String accountForChangeAmount;

    @Column(name = "flt_write_off_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal writeOffAmount;

    @Column(name = "flt_base_write_off_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseWriteOffAmount;

    @Column(name = "is_write_off_outstanding_amount_automatically", nullable = false)
    @ColumnDefault("0")
    private Boolean writeOffOutstandingAmountAutomatically;

    @Column(name = "tx_write_off_account", length = 140)
    private String writeOffAccount;

    @Column(name = "tx_write_off_cost_center", length = 140)
    private String writeOffCostCenter;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "is_group_same_items", nullable = false)
    @ColumnDefault("0")
    private Boolean groupSameItems;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_inter_company_invoice_reference", length = 140)
    private String interCompanyInvoiceReference;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "is_discounted", nullable = false)
    @ColumnDefault("0")
    private Boolean isDiscounted;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_debit_to", length = 140)
    private String debitTo;

    @Column(name = "tx_party_account_currency", length = 140)
    private String partyAccountCurrency;

    @Column(name = "tx_is_opening", length = 140)
    @ColumnDefault("'No'")
    private String isOpening;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_sales_partner", length = 140)
    private String salesPartner;

    @Column(name = "flt_amount_eligible_for_commission", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amountEligibleForCommission;

    @Column(name = "flt_commission_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal commissionRate;

    @Column(name = "flt_total_commission", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCommission;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "tx_against_income_account", columnDefinition = "text")
    private String againstIncomeAccount;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
