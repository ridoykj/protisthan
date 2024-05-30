package com.itbd.application.db.dao.aaa.automation;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_assignment_rule", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssignmentRuleDao {

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

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_due_date_based_on", length = 140)
    private String dueDateBasedOn;

    @Column(name = "ct_priority", nullable = false)
    private Integer priority;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_description", columnDefinition = "text")
    @ColumnDefault("'Automatic_Assignment'")
    private String description;

    @Column(name = "tx_assign_condition", columnDefinition = "longtext")
    private String assignCondition;

    @Column(name = "tx_unassigned_condition", columnDefinition = "longtext")
    private String unassignedCondition;

    @Column(name = "tx_close_condition", columnDefinition = "longtext")
    private String closeCondition;

    @Column(name = "tx_rule", length = 140)
    private String rule;

    @Column(name = "tx_field", length = 140)
    private String field;

    @Column(name = "tx_last_user", length = 140)
    private String lastUser;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
