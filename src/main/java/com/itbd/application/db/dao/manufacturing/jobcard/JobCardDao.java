package com.itbd.application.db.dao.manufacturing.jobcard;


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
@Table(name = "t_job_card", indexes = {
        @Index(name = "idx_work_order", columnList = "tx_work_order"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class JobCardDao {

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
    @ColumnDefault("'PO-JOB.#####'")
    private String namingSeries;

    @Column(name = "tx_work_order", length = 140)
    private String workOrder;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "tx_production_item", length = 140)
    private String productionItem;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_for_quantity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal forQuantity;

    @Column(name = "flt_total_completed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCompletedQty;

    @Column(name = "flt_process_loss_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossQty;

    @Column(name = "dtt_expected_start_date")
    private LocalDateTime expectedStartDate;

    @Column(name = "flt_time_required", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal timeRequired;

    @Column(name = "dtt_expected_end_date")
    private LocalDateTime expectedEndDate;

    @Column(name = "dtt_actual_start_date")
    private LocalDateTime actualStartDate;

    @Column(name = "flt_total_time_in_mins", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalTimeInMins;

    @Column(name = "dtt_actual_end_date")
    private LocalDateTime actualEndDate;

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_wip_warehouse", length = 140)
    private String wipWarehouse;

    @Column(name = "tx_workstation_type", length = 140)
    private String workstationType;

    @Column(name = "tx_workstation", length = 140)
    private String workstation;

    @Column(name = "tx_quality_inspection_template", length = 140)
    private String qualityInspectionTemplate;

    @Column(name = "tx_quality_inspection", length = 140)
    private String qualityInspection;

    @Column(name = "tx_for_job_card", length = 140)
    private String forJobCard;

    @Column(name = "is_corrective_job_card", nullable = false)
    @ColumnDefault("0")
    private Boolean isCorrectiveJobCard;

    @Column(name = "flt_hour_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRate;

    @Column(name = "tx_for_operation", length = 140)
    private String forOperation;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "flt_transferred_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal transferredQty;

    @Column(name = "flt_requested_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal requestedQty;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_operation_row_number", length = 140)
    private String operationRowNumber;

    @Column(name = "tx_operation_id", length = 140)
    private String operationId;

    @Column(name = "ct_sequence_id", nullable = false)
    private Integer sequenceId;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "tx_serial_no", columnDefinition = "text")
    private String serialNo;

    @Column(name = "tx_barcode", columnDefinition = "longtext")
    private String barcode;

    @Column(name = "ct_job_started", nullable = false)
    @ColumnDefault("0")
    private Boolean jobStarted;

    @Column(name = "dtt_started_time")
    private LocalDateTime startedTime;

    @Column(name = "ct_current_time", nullable = false)
    private Integer currentTime;

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
