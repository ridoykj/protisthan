package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_scheduled_job_type", indexes = {
        @Index(name = "idx_server_script", columnList = "tx_server_script"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ScheduledJobTypeDao {

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

    @Column(name = "is_stopped", nullable = false)
    @ColumnDefault("0")
    private Boolean stopped;

    @Column(name = "tx_method", length = 140)
    private String method;

    @Column(name = "tx_server_script", length = 140)
    private String serverScript;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "tx_cron_format", length = 140)
    private String cronFormat;

    @Column(name = "is_create_log", nullable = false)
    @ColumnDefault("0")
    private Boolean createLog;

    @Column(name = "dtt_last_execution")
    private LocalDateTime lastExecution;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
