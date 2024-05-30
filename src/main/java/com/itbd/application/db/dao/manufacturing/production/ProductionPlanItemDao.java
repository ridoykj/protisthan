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
@Table(name = "t_production_plan_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ProductionPlanItemDao {

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

    @Column(name = "is_include_exploded_items", nullable = false)
    @ColumnDefault("1")
    private Boolean includeExplodedItems;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "flt_planned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plannedQty;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "dtt_planned_start_date")
    private LocalDateTime plannedStartDate;

    @Column(name = "flt_pending_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal pendingQty;

    @Column(name = "flt_ordered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal orderedQty;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "flt_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal producedQty;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_sales_order_item", length = 140)
    private String salesOrderItem;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_product_bundle_item", length = 140)
    private String productBundleItem;

    @Column(name = "tx_item_reference", length = 140)
    private String itemReference;

    @Column(name = "tx_temporary_name", length = 140)
    private String temporaryName;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
