package com.itbd.application.db.dao.projects.task;


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
@Table(name = "t_task", indexes = {
        @Index(name = "idx_subject", columnList = "tx_subject"),
        @Index(name = "idx_project", columnList = "tx_project"),
        @Index(name = "idx_priority", columnList = "tx_priority"),
        @Index(name = "idx_parent_task", columnList = "tx_parent_task"),
        @Index(name = "idx_exp_end_date", columnList = "dt_exp_end_date"),
        @Index(name = "idx_lft_rgt_index", columnList = "ct_lft, ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class TaskDao {

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

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_issue", length = 140)
    private String issue;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "is_template", nullable = false)
    @ColumnDefault("0")
    private Boolean isTemplate;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "flt_task_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taskWeight;

    @Column(name = "tx_parent_task", length = 140)
    private String parentTask;

    @Column(name = "tx_completed_by", length = 140)
    private String completedBy;

    @Column(name = "dt_completed_on")
    private LocalDate completedOn;

    @Column(name = "dt_exp_start_date")
    private LocalDate expStartDate;

    @Column(name = "flt_expected_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal expectedTime;

    @Column(name = "ct_start", nullable = false)
    private Integer start;

    @Column(name = "dt_exp_end_date")
    private LocalDate expEndDate;

    @Column(name = "flt_progress", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal progress;

    @Column(name = "ct_duration", nullable = false)
    private Integer duration;

    @Column(name = "is_milestone", nullable = false)
    @ColumnDefault("0")
    private Boolean isMilestone;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_depends_on_tasks", columnDefinition = "longtext")
    private String dependsOnTasks;

    @Column(name = "dt_actStartDate")
    private LocalDate actStartDate;

    @Column(name = "flt_actual_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualTime;

    @Column(name = "dt_actEndDate")
    private LocalDate actEndDate;

    @Column(name = "flt_total_costing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCostingAmount;

    @Column(name = "flt_total_billing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBillingAmount;

    @Column(name = "dt_review_date")
    private LocalDate reviewDate;

    @Column(name = "dt_closing_date")
    private LocalDate closingDate;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "ct_lft", nullable = false)
    @ColumnDefault("0")
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    @ColumnDefault("0")
    private Integer rgt;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "tx_template_task", length = 140)
    private String templateTask;

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
