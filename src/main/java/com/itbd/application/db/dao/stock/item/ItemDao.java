package com.itbd.application.db.dao.stock.item;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_item", indexes = {
        @Index(name = "idx_item_name", columnList = "tx_item_name"),
        @Index(name = "idx_item_group", columnList = "tx_item_group"),
        @Index(name = "idx_disabled", columnList = "is_disabled"),
        @Index(name = "idx_variant_of", columnList = "tx_variant_of"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_item_code", columnNames = {"tx_item_code"})
})
@DynamicInsert
public class ItemDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_item_code", unique = true, length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "is_stock_item", nullable = false)
    @ColumnDefault("1")
    private Boolean isStockItem;

    @Column(name = "is_has_variants", nullable = false)
    @ColumnDefault("0")
    private Boolean hasVariants;

    @Column(name = "flt_opening_stock", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal openingStock;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_standard_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal standardRate;

    @Column(name = "is_fixed_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean isFixedAsset;

    @Column(name = "is_auto_create_assets", nullable = false)
    @ColumnDefault("0")
    private Boolean autoCreateAssets;

    @Column(name = "is_grouped_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroupedAsset;

    @Column(name = "tx_asset_category", length = 140)
    private String assetCategory;

    @Column(name = "tx_asset_naming_series", length = 140)
    private String assetNamingSeries;

    @Column(name = "flt_over_delivery_receipt_allowance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal overDeliveryReceiptAllowance;

    @Column(name = "flt_over_billing_allowance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal overBillingAllowance;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "ct_shelf_life_in_days", nullable = false)
    @ColumnDefault("0")
    private Integer shelfLifeInDays;

    @Column(name = "dt_end_of_life")
    @ColumnDefault("'2099-12-31'")
    private LocalDate endOfLife;

    @Column(name = "tx_default_material_request_type", length = 140)
    @ColumnDefault("'Purchase'")
    private String defaultMaterialRequestType;

    @Column(name = "tx_valuation_method", length = 140)
    private String valuationMethod;

    @Column(name = "tx_warranty_period", length = 140)
    private String warrantyPeriod;

    @Column(name = "flt_weight_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal weightPerUnit;

    @Column(name = "tx_weight_uom", length = 140)
    private String weightUom;

    @Column(name = "is_allow_negative_stock", nullable = false)
    @ColumnDefault("0")
    private Boolean allowNegativeStock;

    @Column(name = "is_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasBatchNo;

    @Column(name = "is_create_new_batch", nullable = false)
    @ColumnDefault("0")
    private Boolean createNewBatch;

    @Column(name = "tx_batch_number_series", length = 140)
    private String batchNumberSeries;

    @Column(name = "is_has_expiry_date", nullable = false)
    @ColumnDefault("0")
    private Boolean hasExpiryDate;

    @Column(name = "is_retain_sample", nullable = false)
    @ColumnDefault("0")
    private Boolean retainSample;

    @Column(name = "ct_sample_quantity", nullable = false)
    @ColumnDefault("0")
    private Integer sampleQuantity;

    @Column(name = "is_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasSerialNo;

    @Column(name = "tx_serial_no_series", length = 140)
    private String serialNoSeries;

    @Column(name = "tx_variant_of", length = 140)
    private String variantOf;

    @Column(name = "tx_variant_based_on", length = 140)
    @ColumnDefault("'Item Attribute'")
    private String variantBasedOn;

    @Column(name = "is_enable_deferred_expense", nullable = false)
    @ColumnDefault("0")
    private Boolean enableDeferredExpense;

    @Column(name = "ct_no_of_months_exp", nullable = false)
    @ColumnDefault("0")
    private Integer noOfMonthsExp;

    @Column(name = "is_enable_deferred_revenue", nullable = false)
    @ColumnDefault("0")
    private Boolean enableDeferredRevenue;

    @Column(name = "ct_no_of_months", nullable = false)
    @ColumnDefault("0")
    private Integer noOfMonths;

    @Column(name = "tx_purchase_uom", length = 140)
    private String purchaseUom;

    @Column(name = "flt_min_order_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minOrderQty;

    @Column(name = "flt_safety_stock", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal safetyStock;

    @Column(name = "is_purchase_item", nullable = false)
    @ColumnDefault("1")
    private Boolean isPurchaseItem;

    @Column(name = "ct_lead_time_days", nullable = false)     @ColumnDefault("0")
    private Integer leadTimeDays;

    @Column(name = "flt_last_purchase_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal lastPurchaseRate;

    @Column(name = "is_customer_provided_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isCustomerProvidedItem;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "is_delivered_by_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean deliveredBySupplier;

    @Column(name = "tx_country_of_origin", length = 140)
    private String countryOfOrigin;

    @Column(name = "tx_customs_tariff_number", length = 140)
    private String customsTariffNumber;

    @Column(name = "tx_sales_uom", length = 140)
    private String salesUom;

    @Column(name = "is_grant_commission", nullable = false)
    @ColumnDefault("1")
    private Boolean grantCommission;

    @Column(name = "is_sales_item", nullable = false)
    @ColumnDefault("1")
    private Boolean isSalesItem;

    @Column(name = "flt_max_discount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxDiscount;

    @Column(name = "is_inspection_required_before_purchase", nullable = false)
    @ColumnDefault("0")
    private Boolean inspectionRequiredBeforePurchase;

    @Column(name = "tx_quality_inspection_template", length = 140)
    private String qualityInspectionTemplate;

    @Column(name = "is_inspection_required_before_delivery", nullable = false)
    @ColumnDefault("0")
    private Boolean inspectionRequiredBeforeDelivery;

    @Column(name = "is_include_item_in_manufacturing", nullable = false)
    @ColumnDefault("1")
    private Boolean includeItemInManufacturing;

    @Column(name = "is_sub_contracted_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isSubContractedItem;

    @Column(name = "tx_default_bom", length = 140)
    private String defaultBom;

    @Column(name = "tx_customer_code", columnDefinition = "text")
    private String customerCode;

    @Column(name = "tx_default_item_manufacturer", length = 140)
    private String defaultItemManufacturer;

    @Column(name = "tx_default_manufacturer_part_no", length = 140)
    private String defaultManufacturerPartNo;

    @Column(name = "flt_total_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalProjectedQty;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
