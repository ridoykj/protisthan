package com.itbd.application.db.dao.core.user;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_user_permission", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class UserPermissionDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_allow", length = 140)
    private String allow;

    @Column(name = "tx_for_value", length = 140)
    private String forValue;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "is_apply_to_all_doc_types", nullable = false)
    @ColumnDefault("1")
    private Boolean applyToAllDocTypes;

    @Column(name = "tx_applicable_for", length = 140)
    private String applicableFor;

    @Column(name = "is_hide_descendants", nullable = false)
    @ColumnDefault("0")
    private Boolean hideDescendants;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
