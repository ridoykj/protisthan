package com.itbd.application.db.dao.aaa.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_maintenance_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetMaintenanceLogDao {

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

    @Column(name = "tx_asset_maintenance", length = 140)
    private String assetMaintenance;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_asset_name", length = 140)
    private String assetName;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_task", length = 140)
    private String task;

    @Column(name = "tx_task_name", length = 140)
    private String taskName;

    @Column(name = "tx_maintenance_type", length = 140)
    private String maintenanceType;

    @Column(name = "tx_periodicity", length = 140)
    private String periodicity;

    @Column(name = "is_has_certificate", nullable = false)
    @ColumnDefault("0")
    private Boolean hasCertificate;

    @Column(name = "tx_certificate_attachment", columnDefinition = "text")
    private String certificateAttachment;

    @Column(name = "tx_maintenance_status", length = 140)
    private String maintenanceStatus;

    @Column(name = "tx_assign_to_name", length = 140)
    private String assignToName;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "dt_completionDate")
    private LocalDate completionDate;

    @Column(name = "tx_description", length = 140)
    private String description;

    @Column(name = "tx_actions_performed", columnDefinition = "longtext")
    private String actionsPerformed;

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
