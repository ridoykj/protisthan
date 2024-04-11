package com.itbd.application.db.dao.purchases;


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
@Table(name = "t_purchase_order", indexes = {
        @Index(name = "idx_supplier", columnList = "tx_supplier"),
        @Index(name = "idx_transaction_date", columnList = "dt_transaction_date"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PurchaseOrderDao {

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

    @Column(name = "tx_order_confirmation_no", length = 140)
    private String orderConfirmationNo;

    @Column(name = "dt_order_confirmation_date")
    private LocalDate orderConfirmationDate;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "is_apply_tds", nullable = false)
    @ColumnDefault("0")
    private Boolean applyTds;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "is_subcontracted", nullable = false)
    @ColumnDefault("0")
    private Boolean isSubcontracted;

    @Column(name = "tx_supplier_warehouse", length = 140)
    private String supplierWarehouse;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionRate;

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

    @Column(name = "tx_set_from_warehouse", length = 140)
    private String setFromWarehouse;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

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

    @Column(name = "tx_set_reserve_warehouse", length = 140)
    private String setReserveWarehouse;

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

    @Column(name = "tx_base_in_words", length = 240)
    private String baseInWords;

    @Column(name = "flt_base_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRoundedTotal;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "flt_rounding_adjustment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundingAdjustment;

    @Column(name = "flt_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundedTotal;

    @Column(name = "is_disable_rounded_total", nullable = false)
    @ColumnDefault("0")
    private Boolean disableRoundedTotal;

    @Column(name = "tx_in_words", length = 240)
    private String inWords;

    @Column(name = "flt_advance_paid", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal advancePaid;

    @Column(name = "tx_apply_discount_on", length = 140)
    @ColumnDefault("'Grand_Total'")
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

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_customer_contact_person", length = 140)
    private String customerContactPerson;

    @Column(name = "tx_customer_contact_display", columnDefinition = "text")
    private String customerContactDisplay;

    @Column(name = "tx_customer_contact_mobile", columnDefinition = "text")
    private String customerContactMobile;

    @Column(name = "tx_customer_contact_email", columnDefinition = "longtext")
    private String customerContactEmail;

    @Column(name = "tx_payment_terms_template", length = 140)
    private String paymentTermsTemplate;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "flt_per_billed", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perBilled;

    @Column(name = "flt_per_received", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perReceived;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "is_group_same_items", nullable = false)
    @ColumnDefault("0")
    private Boolean groupSameItems;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "is_internal_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean isInternalSupplier;

    @Column(name = "tx_represents_company", length = 140)
    private String representsCompany;

    @Column(name = "tx_ref_sq", length = 140)
    private String refSq;

    @Column(name = "tx_party_account_currency", length = 140)
    private String partyAccountCurrency;

    @Column(name = "tx_inter_company_order_reference", length = 140)
    private String interCompanyOrderReference;

    @Column(name = "is_old_subcontracting_flow", nullable = false)
    @ColumnDefault("0")
    private Boolean isOldSubcontractingFlow;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
