package com.itbd.application.db.dao.social;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_energy_point_rule", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_rule_name", columnNames = {"tx_rule_name"})
})
public class EnergyPointRuleDao {

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

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_rule_name", unique = true, length = 140)
    private String ruleName;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_for_doc_event", length = 140)
    @ColumnDefault("'Custom'")
    private String forDocEvent;

    @Column(name = "tx_field_to_check", length = 140)
    private String fieldToCheck;

    @Column(name = "ct_points", nullable = false)
    private Integer points;

    @Column(name = "is_for_assigned_users", nullable = false)
    @ColumnDefault("0")
    private Boolean forAssignedUsers;

    @Column(name = "tx_user_field", length = 140)
    private String userField;

    @Column(name = "tx_multiplier_field", length = 140)
    private String multiplierField;

    @Column(name = "ct_max_points", nullable = false)
    private Integer maxPoints;

    @Column(name = "is_apply_only_once", nullable = false)
    @ColumnDefault("0")
    private Boolean applyOnlyOnce;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
