package com.itbd.application.db.dao.buying.purchase;


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
@Table(name = "t_purchase_order_item", indexes = {
        @Index(name = "idx_expected_delivery_date", columnList = "dt_expectedDeliveryDate"),
        @Index(name = "idx_material_request", columnList = "tx_material_request"),
        @Index(name = "idx_material_request_item", columnList = "tx_material_request_item"),
        @Index(name = "idx_sales_order", columnList = "tx_sales_order"),
        @Index(name = "idx_sales_order_item", columnList = "tx_sales_order_item"),
        @Index(name = "idx_item_code_warehouse_index", columnList = "tx_item_code, tx_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PurchaseOrderItemDao {

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

    @Column(name = "tx_fg_item", length = 140)
    private String fgItem;

    @Column(name = "flt_fg_item_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal fgItemQty;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_supplier_part_no", length = 140)
    private String supplierPartNo;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "tx_product_bundle", length = 140)
    private String productBundle;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "dt_expected_delivery_date")
    private LocalDate expectedDeliveryDate;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "flt_stock_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockQty;

    @Column(name = "flt_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal priceListRate;

    @Column(name = "flt_last_purchase_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal lastPurchaseRate;

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

    @Column(name = "tx_from_warehouse", length = 140)
    private String fromWarehouse;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_company_total_stock", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal companyTotalStock;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_sales_order_item", length = 140)
    private String salesOrderItem;

    @Column(name = "tx_sales_order_packed_item", length = 140)
    private String salesOrderPackedItem;

    @Column(name = "tx_supplier_quotation", length = 140)
    private String supplierQuotation;

    @Column(name = "tx_supplier_quotation_item", length = 140)
    private String supplierQuotationItem;

    @Column(name = "is_delivered_by_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean deliveredBySupplier;

    @Column(name = "is_against_blanket_order", nullable = false)
    @ColumnDefault("0")
    private Boolean againstBlanketOrder;

    @Column(name = "tx_blanket_order", length = 140)
    private String blanketOrder;

    @Column(name = "flt_blanket_order_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal blanketOrderRate;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "flt_returned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returnedQty;

    @Column(name = "flt_billed_amt", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billedAmt;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_wip_composite_asset", length = 140)
    private String wipCompositeAsset;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

    @Column(name = "tx_bom", length = 140)
    private String bom;

    @Column(name = "is_include_exploded_items", nullable = false)
    @ColumnDefault("0")
    private Boolean includeExplodedItems;

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

    @Column(name = "is_fixed_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean isFixedAsset;

    @Column(name = "tx_item_tax_rate", columnDefinition = "longtext")
    private String itemTaxRate;

    @Column(name = "tx_production_plan", length = 140)
    private String productionPlan;

    @Column(name = "tx_production_plan_item", length = 140)
    private String productionPlanItem;

    @Column(name = "tx_production_plan_sub_assembly_item", length = 140)
    private String productionPlanSubAssemblyItem;

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
