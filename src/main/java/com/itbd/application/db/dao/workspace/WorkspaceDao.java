package com.itbd.application.db.dao.workspace;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workspace", indexes = {
        @Index(name = "idx_restrict_to_domain", columnList = "tx_restrict_to_domain"),
        @Index(name = "idx_public", columnList = "is_public"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_label", columnNames = {"tx_label"})
})
public class WorkspaceDao {

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

    @Column(name = "tx_label", unique = true, length = 140)
    private String label;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "flt_sequence_id", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal sequenceId;

    @Column(name = "tx_for_user", length = 140)
    private String forUser;

    @Column(name = "tx_parent_page", length = 140)
    private String parentPage;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "tx_indicator_color", length = 140)
    private String indicatorColor;

    @Column(name = "tx_restrict_to_domain", length = 140)
    private String restrictToDomain;

    @Column(name = "is_hide_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean hideCustom;

    @Column(name = "is_public", nullable = false)
    @ColumnDefault("0")
    private Boolean publics;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean isHidden;

    @Column(name = "tx_content", columnDefinition = "longtext")
    @ColumnDefault("'[]'")
    private String content;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
