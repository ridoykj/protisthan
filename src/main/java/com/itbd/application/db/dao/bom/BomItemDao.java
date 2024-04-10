package com.itbd.application.db.dao.bom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_bom_no", columnList = "tx_bom_no"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class BomItemDao {

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

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "is_do_not_explode", nullable = false)
    @ColumnDefault("0")
    private Boolean doNotExplode;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "tx_source_warehouse", length = 140)
    private String sourceWarehouse;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "is_stock_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isStockItem;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_stock_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockQty;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_base_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "flt_base_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseAmount;

    @Column(name = "flt_qty_consumed_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qtyConsumedPerUnit;

    @Column(name = "is_has_variants", nullable = false)
    @ColumnDefault("0")
    private Boolean hasVariants;

    @Column(name = "is_include_item_in_manufacturing", nullable = false)
    @ColumnDefault("0")
    private Boolean includeItemInManufacturing;

    @Column(name = "tx_original_item", length = 140)
    private String originalItem;

    @Column(name = "is_sourced_by_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean sourcedBySupplier;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
