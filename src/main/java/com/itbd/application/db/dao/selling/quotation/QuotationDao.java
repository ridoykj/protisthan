package com.itbd.application.db.dao.selling.quotation;


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
@Table(name = "t_quotation", indexes = {
        @Index(name = "idx_party_name", columnList = "tx_party_name"),
        @Index(name = "idx_transaction_date", columnList = "dt_transaction_date"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class QuotationDao {

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

    @Column(name = "tx_quotation_to", length = 140)
    @ColumnDefault("'Customer'")
    private String quotationTo;

    @Column(name = "tx_party_name", length = 140)
    private String partyName;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "dt_validTill")
    private LocalDate validTill;

    @Column(name = "tx_order_type", length = 140)
    @ColumnDefault("'Sales'")
    private String orderType;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

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

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

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

    @Column(name = "flt_base_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalTaxesAndCharges;

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

    @Column(name = "flt_rounded_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundedTotal;

    @Column(name = "tx_in_words", length = 240)
    private String inWords;

    @Column(name = "tx_apply_discount_on", length = 140)
    @ColumnDefault("'Grand Total'")
    private String applyDiscountOn;

    @Column(name = "flt_base_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseDiscountAmount;

    @Column(name = "tx_coupon_code", length = 140)
    private String couponCode;

    @Column(name = "flt_additional_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalDiscountPercentage;

    @Column(name = "flt_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountAmount;

    @Column(name = "tx_referral_sales_partner", length = 140)
    private String referralSalesPartner;

    @Column(name = "tx_other_charges_calculation", columnDefinition = "longtext")
    private String otherChargesCalculation;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_contact_mobile", columnDefinition = "text")
    private String contactMobile;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_shipping_address_name", length = 140)
    private String shippingAddressName;

    @Column(name = "tx_shipping_address", columnDefinition = "text")
    private String shippingAddress;

    @Column(name = "tx_company_address", length = 140)
    private String companyAddress;

    @Column(name = "tx_company_address_display", columnDefinition = "text")
    private String companyAddressDisplay;

    @Column(name = "tx_payment_terms_template", length = 140)
    private String paymentTermsTemplate;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "is_group_same_items", nullable = false)
    @ColumnDefault("0")
    private Boolean groupSameItems;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_order_lost_reason", columnDefinition = "text")
    private String orderLostReason;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_opportunity", length = 140)
    private String opportunity;

    @Column(name = "tx_supplier_quotation", length = 140)
    private String supplierQuotation;

    @Column(name = "tx_enq_det", columnDefinition = "text")
    private String enqDet;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
