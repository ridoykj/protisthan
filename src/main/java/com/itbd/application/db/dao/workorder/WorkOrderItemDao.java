package com.itbd.application.db.dao.workorder;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_work_order_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_item_code_source_warehouse_index", columnList = "tx_item_code, tx_source_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WorkOrderItemDao {

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

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_source_warehouse", length = 140)
    private String sourceWarehouse;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "is_include_item_in_manufacturing", nullable = false)
    @ColumnDefault("0")
    private Boolean includeItemInManufacturing;

    @Column(name = "flt_required_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal requiredQty;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "flt_transferred_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal transferredQty;

    @Column(name = "flt_consumed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal consumedQty;

    @Column(name = "flt_returned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returnedQty;

    @Column(name = "flt_available_qty_at_source_warehouse", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal availableQtyAtSourceWarehouse;

    @Column(name = "flt_available_qty_at_wip_warehouse", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal availableQtyAtWipWarehouse;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
