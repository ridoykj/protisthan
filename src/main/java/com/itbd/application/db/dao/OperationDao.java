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
@Table(name = "t_operation", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class OperationDao {

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

    @Column(name = "tx_workstation", length = 140)
    private String workstation;

    @Column(name = "is_corrective_operation", nullable = false)
    @ColumnDefault("0")
    private Boolean isCorrectiveOperation;

    @Column(name = "is_create_job_card_based_on_batch_size", nullable = false)
    @ColumnDefault("0")
    private Boolean createJobCardBasedOnBatchSize;

    @Column(name = "tx_quality_inspection_template", length = 140)
    private String qualityInspectionTemplate;

    @Column(name = "ct_batch_size", nullable = false)
    private Integer batchSize;

    @Column(name = "flt_total_operation_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalOperationTime;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
