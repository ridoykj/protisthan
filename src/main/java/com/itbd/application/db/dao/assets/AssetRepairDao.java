package com.itbd.application.db.dao.aaa.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_repair", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetRepairDao {

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

    @Column(name = "tx_asset", length = 140)
    private String asset;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_asset_name", length = 140)
    private String assetName;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "dtt_failure_date")
    private LocalDateTime failureDate;

    @Column(name = "tx_repair_status", length = 140)
    @ColumnDefault("'Pending'")
    private String repairStatus;

    @Column(name = "dtt_completion_date")
    private LocalDateTime completionDate;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "flt_repair_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal repairCost;

    @Column(name = "is_capitalize_repair_cost", nullable = false)
    @ColumnDefault("0")
    private Boolean capitalizeRepairCost;

    @Column(name = "is_stock_consumption", nullable = false)
    @ColumnDefault("0")
    private Boolean stockConsumption;

    @Column(name = "tx_purchase_invoice", length = 140)
    private String purchaseInvoice;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_total_repair_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalRepairCost;

    @Column(name = "tx_stock_entry", length = 140)
    private String stockEntry;

    @Column(name = "ct_increase_in_asset_life", nullable = false)
    private Integer increaseInAssetLife;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_actions_performed", columnDefinition = "longtext")
    private String actionsPerformed;

    @Column(name = "tx_downtime", length = 140)
    private String downtime;

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
