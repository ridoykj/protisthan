package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_to_do", indexes = {
        @Index(name = "idx_reference_type_reference_name_index", columnList = "tx_reference_type, tx_reference_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ToDoDao {

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
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_priority", length = 140)
    @ColumnDefault("'Medium'")
    private String priority;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tx_allocated_to", length = 140)
    private String allocatedTo;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_reference_type", length = 140)
    private String referenceType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_role", length = 140)
    private String role;

    @Column(name = "tx_assigned_by", length = 140)
    private String assignedBy;

    @Column(name = "tx_assigned_by_full_name", length = 140)
    private String assignedByFullName;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "tx_assignment_rule", length = 140)
    private String assignmentRule;

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
