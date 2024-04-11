package com.itbd.application.db.dao.materials;


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
@Table(name = "t_material_request_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_item_name", columnList = "tx_item_name"),
        @Index(name = "idx_item_group", columnList = "tx_item_group"),
        @Index(name = "idx_sales_order_item", columnList = "tx_sales_order_item"),
        @Index(name = "idx_item_code_warehouse_index", columnList = "tx_item_code, tx_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class MaterialRequestItemDao {

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

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

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

    @Column(name = "tx_from_warehouse", length = 140)
    private String fromWarehouse;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "flt_stock_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockQty;

    @Column(name = "flt_min_order_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minOrderQty;

    @Column(name = "flt_projected_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal projectedQty;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_ordered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal orderedQty;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal priceListRate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_wip_composite_asset", length = 140)
    private String wipCompositeAsset;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "dt_lead_time_date")
    private LocalDate leadTimeDate;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_sales_order_item", length = 140)
    private String salesOrderItem;

    @Column(name = "tx_production_plan", length = 140)
    private String productionPlan;

    @Column(name = "tx_material_request_plan_item", length = 140)
    private String materialRequestPlanItem;

    @Column(name = "tx_job_card_item", length = 140)
    private String jobCardItem;

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
