package com.itbd.application.db.dao.supplier;


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
@Table(name = "t_supplier_quotation_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_item_name", columnList = "tx_item_name"),
        @Index(name = "idx_material_request", columnList = "tx_material_request"),
        @Index(name = "idx_sales_order", columnList = "tx_sales_order"),
        @Index(name = "idx_material_request_item", columnList = "tx_material_request_item"),
        @Index(name = "idx_parent", columnList = "dtt_modified"),
})
public class SupplierQuotationItemDao {

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

    @Column(name = "tx_supplier_part_no", length = 140)
    private String supplierPartNo;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "ct_lead_time_days", nullable = false)
    private Integer leadTimeDays;

    @Column(name = "dt_expected_delivery_date")
    private LocalDate expectedDeliveryDate;

    @Column(name = "is_free_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isFreeItem;

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

    @Column(name = "flt_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal priceListRate;

    @Column(name = "flt_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountPercentage;

    @Column(name = "flt_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountAmount;

    @Column(name = "flt_base_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePriceListRate;

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

    @Column(name = "tx_prev_document_doc_type", length = 140)
    private String prevDocumentDocType;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_request_for_quotation", length = 140)
    private String requestForQuotation;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_request_for_quotation_item", length = 140)
    private String requestForQuotationItem;

    @Column(name = "tx_item_tax_rate", columnDefinition = "longtext")
    private String itemTaxRate;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

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
