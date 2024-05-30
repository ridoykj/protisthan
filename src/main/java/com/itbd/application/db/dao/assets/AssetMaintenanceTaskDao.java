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
@Table(name = "t_asset_maintenance_task", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AssetMaintenanceTaskDao {

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

    @Column(name = "tx_maintenance_task", length = 140)
    private String maintenanceTask;

    @Column(name = "tx_maintenance_type", length = 140)
    private String maintenanceType;

    @Column(name = "tx_maintenance_status", length = 140)
    private String maintenanceStatus;

    @Column(name = "dt_startDate")
    private LocalDate startDate;

    @Column(name = "tx_periodicity", length = 140)
    private String periodicity;

    @Column(name = "dt_endDate")
    private LocalDate endDate;

    @Column(name = "is_certificate_required", nullable = false)
    @ColumnDefault("0")
    private Boolean certificateRequired;

    @Column(name = "tx_assign_to", length = 140)
    private String assignTo;

    @Column(name = "tx_assign_to_name", length = 140)
    private String assignToName;

    @Column(name = "dt_nextDueDate")
    private LocalDate nextDueDate;

    @Column(name = "dt_lastCompletionDate")
    private LocalDate lastCompletionDate;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
