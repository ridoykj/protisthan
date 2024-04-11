package com.itbd.application.db.dao.workflow;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workflow_document_state", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WorkflowDocumentStateDao {

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

    @Column(name = "tx_doc_status", length = 140)
    @ColumnDefault("'0'")
    private String docStatus;

    @Column(name = "tx_update_field", length = 140)
    private String updateField;

    @Column(name = "tx_update_value", length = 140)
    private String updateValue;

    @Column(name = "is_optional_state", nullable = false)
    @ColumnDefault("0")
    private Boolean isOptionalState;

    @Column(name = "is_avoid_status_override", nullable = false)
    @ColumnDefault("0")
    private Boolean avoidStatusOverride;

    @Column(name = "tx_next_action_email_template", length = 140)
    private String nextActionEmailTemplate;

    @Column(name = "tx_allow_edit", length = 140)
    private String allowEdit;

    @Column(name = "tx_message", columnDefinition = "text")
    private String message;

    @Column(name = "tx_workflow_builder_id", length = 140)
    private String workflowBuilderId;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
