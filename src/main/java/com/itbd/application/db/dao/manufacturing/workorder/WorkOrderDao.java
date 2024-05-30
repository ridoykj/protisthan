package com.itbd.application.db.dao.manufacturing.workorder;


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
@Table(name = "t_work_order", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_production_plan", columnList = "tx_production_plan"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class WorkOrderDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_production_item", length = 140)
    private String productionItem;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal qty;

    @Column(name = "flt_material_transferred_for_manufacturing", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal materialTransferredForManufacturing;

    @Column(name = "flt_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal producedQty;

    @Column(name = "flt_process_loss_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossQty;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "is_use_multi_level_bom", nullable = false)
    @ColumnDefault("1")
    private Boolean useMultiLevelBom;

    @Column(name = "is_skip_transfer", nullable = false)
    @ColumnDefault("0")
    private Boolean skipTransfer;

    @Column(name = "is_from_wip_warehouse", nullable = false)
    @ColumnDefault("0")
    private Boolean fromWipWarehouse;

    @Column(name = "is_update_consumed_material_cost_in_project", nullable = false)
    @ColumnDefault("1")
    private Boolean updateConsumedMaterialCostInProject;

    @Column(name = "tx_source_warehouse", length = 140)
    private String sourceWarehouse;

    @Column(name = "tx_wip_warehouse", length = 140)
    private String wipWarehouse;

    @Column(name = "tx_fg_warehouse", length = 140)
    private String fgWarehouse;

    @Column(name = "tx_scrap_warehouse", length = 140)
    private String scrapWarehouse;

    @Column(name = "is_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasSerialNo;

    @Column(name = "is_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasBatchNo;

    @Column(name = "flt_batch_size", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal batchSize;

    @Column(name = "tx_transfer_material_against", length = 140)
    private String transferMaterialAgainst;

    @Column(name = "dtt_planned_start_date")
    private LocalDateTime plannedStartDate;

    @Column(name = "dtt_planned_end_date")
    private LocalDateTime plannedEndDate;

    @Column(name = "dt_expected_delivery_date")
    private LocalDate expectedDeliveryDate;

    @Column(name = "dtt_actual_start_date")
    private LocalDateTime actualStartDate;

    @Column(name = "dtt_actual_end_date")
    private LocalDateTime actualEndDate;

    @Column(name = "flt_lead_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal leadTime;

    @Column(name = "flt_planned_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plannedOperatingCost;

    @Column(name = "flt_actual_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualOperatingCost;

    @Column(name = "flt_additional_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalOperatingCost;

    @Column(name = "flt_corrective_operation_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal correctiveOperationCost;

    @Column(name = "flt_total_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalOperatingCost;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_sales_order_item", length = 140)
    private String salesOrderItem;

    @Column(name = "tx_production_plan", length = 140)
    private String productionPlan;

    @Column(name = "tx_production_plan_item", length = 140)
    private String productionPlanItem;

    @Column(name = "tx_production_plan_sub_assembly_item", length = 140)
    private String productionPlanSubAssemblyItem;

    @Column(name = "tx_product_bundle_item", length = 140)
    private String productBundleItem;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
