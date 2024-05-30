package com.itbd.application.db.dao.accounts.purchase;


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
@Table(name = "t_purchase_invoice_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_serial_and_batch_bundle", columnList = "tx_serial_and_batch_bundle"),
        @Index(name = "idx_batch_no", columnList = "tx_batch_no"),
        @Index(name = "idx_purchase_order", columnList = "tx_purchase_order"),
        @Index(name = "idx_po_detail", columnList = "tx_po_detail"),
        @Index(name = "idx_purchase_receipt", columnList = "tx_purchase_receipt"),
        @Index(name = "idx_pr_detail", columnList = "tx_pr_detail"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class PurchaseInvoiceItemDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_product_bundle", length = 140)
    private String productBundle;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "flt_rejected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rejectedQty;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal conversionFactor;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_stock_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockQty;

    @Column(name = "flt_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal priceListRate;

    @Column(name = "flt_base_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePriceListRate;

    @Column(name = "tx_margin_type", length = 140)
    private String marginType;

    @Column(name = "flt_margin_rate_or_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal marginRateOrAmount;

    @Column(name = "flt_rate_with_margin", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rateWithMargin;

    @Column(name = "flt_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountPercentage;

    @Column(name = "flt_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountAmount;

    @Column(name = "flt_base_rate_with_margin", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRateWithMargin;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_item_tax_template", length = 140)
    private String itemTaxTemplate;

    @Column(name = "flt_base_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRate;

    @Column(name = "flt_base_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseAmount;

    @Column(name = "tx_pricing_rules", columnDefinition = "text")
    private String pricingRules;

    @Column(name = "flt_stock_uom_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockUomRate;

    @Column(name = "is_free_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isFreeItem;

    @Column(name = "is_apply_tds", nullable = false)
    @ColumnDefault("1")
    private Boolean applyTds;

    @Column(name = "flt_net_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netRate;

    @Column(name = "flt_net_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netAmount;

    @Column(name = "flt_base_net_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseNetRate;

    @Column(name = "flt_base_net_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseNetAmount;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_item_tax_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal itemTaxAmount;

    @Column(name = "flt_landed_cost_voucher_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal landedCostVoucherAmount;

    @Column(name = "flt_rm_supp_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rmSuppCost;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "is_use_serial_batch_fields", nullable = false)
    @ColumnDefault("0")
    private Boolean useSerialBatchFields;

    @Column(name = "tx_from_warehouse", length = 140)
    private String fromWarehouse;

    @Column(name = "tx_quality_inspection", length = 140)
    private String qualityInspection;

    @Column(name = "tx_rejected_warehouse", length = 140)
    private String rejectedWarehouse;

    @Column(name = "tx_rejected_serial_and_batch_bundle", length = 140)
    private String rejectedSerialAndBatchBundle;

    @Column(name = "tx_serial_no", columnDefinition = "text")
    private String serialNo;

    @Column(name = "tx_rejected_serial_no", columnDefinition = "text")
    private String rejectedSerialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_wip_composite_asset", length = 140)
    private String wipCompositeAsset;

    @Column(name = "is_fixed_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean isFixedAsset;

    @Column(name = "tx_asset_location", length = 140)
    private String assetLocation;

    @Column(name = "tx_asset_category", length = 140)
    private String assetCategory;

    @Column(name = "tx_deferred_expense_account", length = 140)
    private String deferredExpenseAccount;

    @Column(name = "dt_serviceStopDate")
    private LocalDate serviceStopDate;

    @Column(name = "is_enable_deferred_expense", nullable = false)
    @ColumnDefault("0")
    private Boolean enableDeferredExpense;

    @Column(name = "dt_serviceStartDate")
    private LocalDate serviceStartDate;

    @Column(name = "dt_serviceEndDate")
    private LocalDate serviceEndDate;

    @Column(name = "is_allow_zero_valuation_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean allowZeroValuationRate;

    @Column(name = "tx_item_tax_rate", columnDefinition = "longtext")
    private String itemTaxRate;

    @Column(name = "tx_bom", length = 140)
    private String bom;

    @Column(name = "is_include_exploded_items", nullable = false)
    @ColumnDefault("0")
    private Boolean includeExplodedItems;

    @Column(name = "tx_purchase_invoice_item", length = 140)
    private String purchaseInvoiceItem;

    @Column(name = "tx_purchase_order", length = 140)
    private String purchaseOrder;

    @Column(name = "tx_po_detail", length = 140)
    private String poDetail;

    @Column(name = "tx_purchase_receipt", length = 140)
    private String purchaseReceipt;

    @Column(name = "tx_pr_detail", length = 140)
    private String prDetail;

    @Column(name = "tx_sales_invoice_item", length = 140)
    private String salesInvoiceItem;

    @Column(name = "flt_weight_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal weightPerUnit;

    @Column(name = "flt_total_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalWeight;

    @Column(name = "tx_weight_uom", length = 140)
    private String weightUom;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "is_page_break", nullable = false)
    @ColumnDefault("0")
    private Boolean pageBreak;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
