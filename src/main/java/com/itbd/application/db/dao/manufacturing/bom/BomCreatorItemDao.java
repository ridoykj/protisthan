package com.itbd.application.db.dao.manufacturing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_creator_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class BomCreatorItemDao {

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

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_fg_item", length = 140)
    private String fgItem;

    @Column(name = "tx_source_warehouse", length = 140)
    private String sourceWarehouse;

    @Column(name = "is_expandable", nullable = false)
    @ColumnDefault("0")
    private Boolean isExpandable;

    @Column(name = "is_sourced_by_supplier", nullable = false)
    private Boolean sourcedBySupplier;

    @Column(name = "is_bom_created", nullable = false)
    @ColumnDefault("0")
    private Boolean bomCreated;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_stock_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockQty;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "flt_base_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRate;

    @Column(name = "flt_base_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseAmount;

    @Column(name = "is_do_not_explode", nullable = false)
    @ColumnDefault("1")
    private Boolean doNotExplode;

    @Column(name = "tx_parent_row_no", length = 140)
    private String parentRowNo;

    @Column(name = "tx_fg_reference_id", length = 140)
    private String fgReferenceId;

    @Column(name = "tx_instruction", columnDefinition = "text")
    private String instruction;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
