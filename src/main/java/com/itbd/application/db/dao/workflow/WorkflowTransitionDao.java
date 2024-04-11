package com.itbd.application.db.dao.workflow;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workflow_transition", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WorkflowTransitionDao {

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

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_action", length = 140)
    private String action;

    @Column(name = "tx_nextState", length = 140)
    private String nextState;

    @Column(name = "tx_allowed", length = 140)
    private String allowed;

    @Column(name = "is_allow_self_approval", nullable = false)
    @ColumnDefault("1")
    private Boolean allowSelfApproval;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "tx_workflow_builder_id", length = 140)
    private String workflowBuilderId;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
