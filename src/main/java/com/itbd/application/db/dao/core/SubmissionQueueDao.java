package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_submission_queue", indexes = {
        @Index(name = "idx_ref_doc_name", columnList = "tx_ref_doc_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class SubmissionQueueDao {

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

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_job_id", length = 140)
    private String jobId;

    @Column(name = "dtt_ended_at")
    private LocalDateTime endedAt;

    @Column(name = "tx_ref_doc_type", length = 140)
    private String refDocType;

    @Column(name = "tx_ref_doc_name", length = 140)
    private String refDocName;

    @Column(name = "tx_exception", columnDefinition = "longtext")
    private String exception;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
