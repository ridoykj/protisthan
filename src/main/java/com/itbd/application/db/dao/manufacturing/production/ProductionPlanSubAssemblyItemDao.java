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
@Table(name = "t_production_plan_sub_assembly_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ProductionPlanSubAssemblyItemDao {

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

    @Column(name = "tx_production_item", length = 140)
    private String productionItem;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_fg_warehouse", length = 140)
    private String fgWarehouse;

    @Column(name = "tx_parent_item_code", length = 140)
    private String parentItemCode;

    @Column(name = "dtt_schedule_date")
    private LocalDateTime scheduleDate;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "ct_bom_level", nullable = false)
    private Integer bomLevel;

    @Column(name = "tx_type_of_manufacturing", length = 140)
    @ColumnDefault("'In House'")
    private String typeOfManufacturing;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "flt_wo_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal woProducedQty;

    @Column(name = "tx_purchase_order", length = 140)
    private String purchaseOrder;

    @Column(name = "tx_production_plan_item", length = 140)
    private String productionPlanItem;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "ct_indent", nullable = false)
    private Integer indent;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal projectedQty;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
