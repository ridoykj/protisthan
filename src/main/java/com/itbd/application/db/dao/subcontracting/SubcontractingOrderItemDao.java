package com.itbd.application.db.dao.subcontracting;


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
@Table(name = "t_subcontracting_order_item", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_expected_delivery_date", columnList = "dt_expected_delivery_date"),
        @Index(name = "idx_material_request", columnList = "tx_material_request"),
        @Index(name = "idx_material_request_item", columnList = "tx_material_request_item"),
        @Index(name = "idx_purchase_order_item", columnList = "tx_purchase_order_item"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class SubcontractingOrderItemDao {

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

    @Column(name = "tx_bom", length = 140)
    private String bom;

    @Column(name = "is_include_exploded_items", nullable = false)
    @ColumnDefault("0")
    private Boolean includeExplodedItems;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "dt_expected_delivery_date")
    private LocalDate expectedDeliveryDate;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal qty;

    @Column(name = "flt_received_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedQty;

    @Column(name = "flt_returned_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returnedQty;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal conversionFactor;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "flt_rm_cost_per_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rmCostPerQty;

    @Column(name = "flt_service_cost_per_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal serviceCostPerQty;

    @Column(name = "flt_additional_cost_per_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalCostPerQty;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_purchase_order_item", length = 140)
    private String purchaseOrderItem;

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
