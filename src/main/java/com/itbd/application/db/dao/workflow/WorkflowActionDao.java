package com.itbd.application.db.dao.workflow;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workflow_action", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_reference_name_reference_doc_type_status_index", columnList = "tx_reference_name, tx_reference_doc_type"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class WorkflowActionDao {

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

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_workflow_state", length = 140)
    private String workflowState;

    @Column(name = "tx_completed_by_role", length = 140)
    private String completedByRole;

    @Column(name = "tx_completed_by", length = 140)
    private String completedBy;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
