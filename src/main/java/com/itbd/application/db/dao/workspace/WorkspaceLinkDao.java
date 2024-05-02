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
@Table(name = "t_workspace_link", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
@DynamicInsert
public class WorkspaceLinkDao {

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
    @ColumnDefault("'Link'")
    private String type;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean hidden;

    @Column(name = "tx_link_type", length = 140)
    private String linkType;

    @Column(name = "tx_link_to", length = 140)
    private String linkTo;

    @Column(name = "tx_dependencies", length = 140)
    private String dependencies;

    @Column(name = "tx_only_for", length = 140)
    private String onlyFor;

    @Column(name = "is_onboard", nullable = false)
    @ColumnDefault("0")
    private Boolean onboard;

    @Column(name = "is_query_report", nullable = false)
    @ColumnDefault("0")
    private Boolean isQueryReport;

    @Column(name = "ct_link_count", nullable = false)
    private Integer linkCount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
