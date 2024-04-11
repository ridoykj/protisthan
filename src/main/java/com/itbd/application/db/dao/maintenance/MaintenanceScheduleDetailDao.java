package com.itbd.application.db.dao.maintenance;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_maintenance_schedule_detail", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_scheduled_date", columnList = "dt_scheduled_date"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class MaintenanceScheduleDetailDao {

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

    @Column(name = "dt_scheduled_date")
    private LocalDate scheduledDate;

    @Column(name = "dt_actual_date")
    private LocalDate actualDate;

    @Column(name = "tx_sales_person", length = 140)
    private String salesPerson;

    @Column(name = "tx_completion_status", length = 140)
    @ColumnDefault("'Pending'")
    private String completionStatus;

    @Column(name = "tx_serial_no", columnDefinition = "text")
    private String serialNo;

    @Column(name = "tx_item_reference", length = 140)
    private String itemReference;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
