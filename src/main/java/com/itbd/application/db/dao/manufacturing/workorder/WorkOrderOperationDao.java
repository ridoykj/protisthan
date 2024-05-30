package com.itbd.application.db.dao.manufacturing.workorder;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_work_order_operation", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WorkOrderOperationDao {

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

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Pending'")
    private String status;

    @Column(name = "flt_completed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal completedQty;

    @Column(name = "flt_process_loss_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossQty;

    @Column(name = "tx_bom", length = 140)
    private String bom;

    @Column(name = "tx_workstation_type", length = 140)
    private String workstationType;

    @Column(name = "tx_workstation", length = 140)
    private String workstation;

    @Column(name = "ct_sequence_id", nullable = false)
    private Integer sequenceId;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "dtt_planned_start_time")
    private LocalDateTime plannedStartTime;

    @Column(name = "flt_hour_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRate;

    @Column(name = "flt_time_in_mins", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal timeInMins;

    @Column(name = "dtt_planned_end_time")
    private LocalDateTime plannedEndTime;

    @Column(name = "flt_batch_size", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal batchSize;

    @Column(name = "flt_planned_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plannedOperatingCost;

    @Column(name = "dtt_actual_start_time")
    private LocalDateTime actualStartTime;

    @Column(name = "flt_actual_operation_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualOperationTime;

    @Column(name = "dtt_actual_end_time")
    private LocalDateTime actualEndTime;

    @Column(name = "flt_actual_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualOperatingCost;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
