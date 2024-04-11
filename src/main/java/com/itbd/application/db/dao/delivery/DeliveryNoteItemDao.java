package com.itbd.application.db.dao.delivery;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_delivery_note_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_against_sales_order", columnList = "tx_against_sales_order"),
        @Index(name = "idx_so_detail", columnList = "tx_so_detail"),
        @Index(name = "idx_against_sales_invoice", columnList = "tx_against_sales_invoice"),
        @Index(name = "idx_si_detail", columnList = "tx_si_detail"),
        @Index(name = "idx_dn_detail", columnList = "tx_dn_detail"),
        @Index(name = "idx_serial_and_batch_bundle", columnList = "tx_serial_and_batch_bundle"),
        @Index(name = "idx_batch_no", columnList = "tx_batch_no"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DeliveryNoteItemDao {

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

    @Column(name = "tx_barcode", length = 140)
    private String barcode;

    @Column(name = "is_has_item_scanned", nullable = false)
    @ColumnDefault("0")
    private Boolean hasItemScanned;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_customer_item_code", length = 140)
    private String customerItemCode;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

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

    @Column(name = "flt_returned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returnedQty;

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

    @Column(name = "tx_item_tax_template", length = 140)
    private String itemTaxTemplate;

    @Column(name = "flt_base_net_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseNetRate;

    @Column(name = "flt_base_net_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseNetAmount;

    @Column(name = "flt_billed_amt", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billedAmt;

    @Column(name = "flt_incoming_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal incomingRate;

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

    @Column(name = "tx_quality_inspection", length = 140)
    private String qualityInspection;

    @Column(name = "is_allow_zero_valuation_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean allowZeroValuationRate;

    @Column(name = "tx_against_sales_order", length = 140)
    private String againstSalesOrder;

    @Column(name = "tx_so_detail", length = 140)
    private String soDetail;

    @Column(name = "tx_against_sales_invoice", length = 140)
    private String againstSalesInvoice;

    @Column(name = "tx_si_detail", length = 140)
    private String siDetail;

    @Column(name = "tx_dn_detail", length = 140)
    private String dnDetail;

    @Column(name = "tx_pick_list_item", length = 140)
    private String pickListItem;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "is_use_serial_batch_fields", nullable = false)
    @ColumnDefault("0")
    private Boolean useSerialBatchFields;

    @Column(name = "tx_serial_no", columnDefinition = "text")
    private String serialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "flt_actual_batch_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualBatchQty;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_installed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal installedQty;

    @Column(name = "tx_item_tax_rate", columnDefinition = "text")
    private String itemTaxRate;

    @Column(name = "flt_packed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal packedQty;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_purchase_order", length = 140)
    private String purchaseOrder;

    @Column(name = "tx_purchase_order_item", length = 140)
    private String purchaseOrderItem;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

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
