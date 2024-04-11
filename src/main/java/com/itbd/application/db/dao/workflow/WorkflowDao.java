package com.itbd.application.db.dao.workflow;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workflow", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_workflow_name", columnNames = {"tx_workflow_name"})
})
public class WorkflowDao {

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

    @Column(name = "tx_workflow_name", unique = true, length = 140)
    private String workflowName;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "is_active", nullable = false)
    @ColumnDefault("0")
    private Boolean isActive;

    @Column(name = "is_override_status", nullable = false)
    @ColumnDefault("0")
    private Boolean overrideStatus;

    @Column(name = "is_send_email_alert", nullable = false)
    @ColumnDefault("0")
    private Boolean sendEmailAlert;

    @Column(name = "tx_workflow_state_field", length = 140)
    @ColumnDefault("'workflow state'")
    private String workflowStateField;

    @Column(name = "tx_workflow_data", columnDefinition = "longtext")
    private String workflowData;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
