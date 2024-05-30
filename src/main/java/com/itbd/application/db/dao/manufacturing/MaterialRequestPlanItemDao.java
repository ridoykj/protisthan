package com.itbd.application.db.dao.manufacturing;


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
@Table(name = "t_material_request_plan_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_from_warehouse", columnList = "tx_from_warehouse"),
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class MaterialRequestPlanItemDao {

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

    @Column(name = "tx_from_warehouse", length = 140)
    private String fromWarehouse;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_material_request_type", length = 140)
    private String materialRequestType;

    @Column(name = "flt_quantity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal quantity;

    @Column(name = "flt_required_bom_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal requiredBomQty;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "flt_min_order_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minOrderQty;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_requested_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal requestedQty;

    @Column(name = "flt_reserved_qty_for_production", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQtyForProduction;

    @Column(name = "flt_ordered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal orderedQty;

    @Column(name = "flt_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal projectedQty;

    @Column(name = "flt_safety_stock", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal safetyStock;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
