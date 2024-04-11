package com.itbd.application.db.dao;


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
@Table(name = "t_production_plan", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ProductionPlanDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_get_items_from", length = 140)
    private String getItemsFrom;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_sales_order_status", length = 140)
    private String salesOrderStatus;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "dt_fromDeliveryDate")
    private LocalDate fromDeliveryDate;

    @Column(name = "dt_toDeliveryDate")
    private LocalDate toDeliveryDate;

    @Column(name = "is_combine_items", nullable = false)
    @ColumnDefault("0")
    private Boolean combineItems;

    @Column(name = "is_combine_sub_items", nullable = false)
    @ColumnDefault("0")
    private Boolean combineSubItems;

    @Column(name = "tx_sub_assembly_warehouse", length = 140)
    private String subAssemblyWarehouse;

    @Column(name = "is_skip_available_sub_assembly_item", nullable = false)
    @ColumnDefault("0")
    private Boolean skipAvailableSubAssemblyItem;

    @Column(name = "is_include_non_stock_items", nullable = false)
    @ColumnDefault("1")
    private Boolean includeNonStockItems;

    @Column(name = "is_include_subcontracted_items", nullable = false)
    @ColumnDefault("1")
    private Boolean includeSubcontractedItems;

    @Column(name = "is_consider_minimum_order_qty", nullable = false)
    @ColumnDefault("0")
    private Boolean considerMinimumOrderQty;

    @Column(name = "is_include_safety_stock", nullable = false)
    @ColumnDefault("0")
    private Boolean includeSafetyStock;

    @Column(name = "is_ignore_existing_ordered_qty", nullable = false)
    @ColumnDefault("0")
    private Boolean ignoreExistingOrderedQty;

    @Column(name = "tx_for_warehouse", length = 140)
    private String forWarehouse;

    @Column(name = "flt_total_planned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalPlannedQty;

    @Column(name = "flt_total_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalProducedQty;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

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

}
