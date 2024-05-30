package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bin", indexes = {
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_unique_item_warehouse", columnNames = {"tx_item_code", "tx_warehouse"}),
})
public class BinDao {

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

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_planned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plannedQty;

    @Column(name = "flt_indented_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal indentedQty;

    @Column(name = "flt_ordered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal orderedQty;

    @Column(name = "flt_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal projectedQty;

    @Column(name = "flt_reserved_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQty;

    @Column(name = "flt_reserved_qty_for_production", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQtyForProduction;

    @Column(name = "flt_reserved_qty_for_sub_contract", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQtyForSubContract;

    @Column(name = "flt_reserved_qty_for_production_plan", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQtyForProductionPlan;

    @Column(name = "flt_reserved_stock", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedStock;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_stock_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockValue;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
