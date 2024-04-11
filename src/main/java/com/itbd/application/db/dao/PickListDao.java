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
@Table(name = "t_pick_list", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PickListDao {

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

    @Column(name = "tx_purpose", length = 140)
    @ColumnDefault("'Material Transfer for Manufacture'")
    private String purpose;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_work_order", length = 140)
    private String workOrder;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "flt_for_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal forQty;

    @Column(name = "tx_parent_warehouse", length = 140)
    private String parentWarehouse;

    @Column(name = "is_consider_rejected_warehouses", nullable = false)
    @ColumnDefault("0")
    private Boolean considerRejectedWarehouses;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "is_scan_mode", nullable = false)
    @ColumnDefault("0")
    private Boolean scanMode;

    @Column(name = "is_prompt_qty", nullable = false)
    @ColumnDefault("0")
    private Boolean promptQty;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "is_group_same_items", nullable = false)
    @ColumnDefault("0")
    private Boolean groupSameItems;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
