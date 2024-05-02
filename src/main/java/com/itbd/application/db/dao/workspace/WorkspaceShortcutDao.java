package com.itbd.application.db.dao.workspace;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workspace_shortcut", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
@DynamicInsert
public class WorkspaceShortcutDao {

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

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_link_to", length = 140)
    private String linkTo;

    @Column(name = "tx_url", length = 140)
    private String url;

    @Column(name = "tx_doc_view", length = 140)
    private String docView;

    @Column(name = "tx_kanban_board", length = 140)
    private String kanbanBoard;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "tx_restrict_to_domain", length = 140)
    private String restrictToDomain;

    @Column(name = "tx_stats_filter", columnDefinition = "longtext")
    private String statsFilter;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "tx_format", length = 140)
    private String format;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
