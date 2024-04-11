package com.itbd.application.db.dao.sales;


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
@Table(name = "t_sales_order_item", indexes = {
        @Index(name = "idx_prev_document_doc_name", columnList = "tx_prev_document_doc_name"),
        @Index(name = "idx_item_code_warehouse_index", columnList = "tx_item_code, tx_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class SalesOrderItemDao {

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

    @Column(name = "tx_customer_item_code", length = 140)
    private String customerItemCode;

    @Column(name = "is_ensure_delivery_based_on_produced_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean ensureDeliveryBasedOnProducedSerialNo;

    @Column(name = "is_stock_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isStockItem;

    @Column(name = "is_reserve_stock", nullable = false)
    @ColumnDefault("1")
    private Boolean reserveStock;

    @Column(name = "dt_delivery_date")
    private LocalDate deliveryDate;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_brand", length = 140)
    private String brand;

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

    @Column(name = "flt_stock_reserved_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockReservedQty;

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

    @Column(name = "is_grant_commission", nullable = false)
    @ColumnDefault("0")
    private Boolean grantCommission;

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

    @Column(name = "flt_billed_amt", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billedAmt;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_gross_profit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grossProfit;

    @Column(name = "is_delivered_by_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean deliveredBySupplier;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "flt_weight_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal weightPerUnit;

    @Column(name = "flt_total_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalWeight;

    @Column(name = "tx_weight_uom", length = 140)
    private String weightUom;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_target_warehouse", length = 140)
    private String targetWarehouse;

    @Column(name = "tx_prev_document_doc_name", length = 140)
    private String prevDocumentDocName;

    @Column(name = "tx_quotation_item", length = 140)
    private String quotationItem;

    @Column(name = "is_against_blanket_order", nullable = false)
    @ColumnDefault("0")
    private Boolean againstBlanketOrder;

    @Column(name = "tx_blanket_order", length = 140)
    private String blanketOrder;

    @Column(name = "flt_blanket_order_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal blanketOrderRate;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "flt_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal projectedQty;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_ordered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal orderedQty;

    @Column(name = "flt_planned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plannedQty;

    @Column(name = "flt_production_plan_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal productionPlanQty;

    @Column(name = "flt_work_order_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal workOrderQty;

    @Column(name = "flt_delivered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal deliveredQty;

    @Column(name = "flt_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal producedQty;

    @Column(name = "flt_returned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returnedQty;

    @Column(name = "flt_picked_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal pickedQty;

    @Column(name = "tx_additional_notes", columnDefinition = "text")
    private String additionalNotes;

    @Column(name = "is_page_break", nullable = false)
    @ColumnDefault("0")
    private Boolean pageBreak;

    @Column(name = "tx_item_tax_rate", columnDefinition = "longtext")
    private String itemTaxRate;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_purchase_order", length = 140)
    private String purchaseOrder;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_purchase_order_item", length = 140)
    private String purchaseOrderItem;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
