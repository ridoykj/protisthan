package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_list_view_settings", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ListViewSettingsDao {

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

    @Column(name = "is_disable_count", nullable = false)
    @ColumnDefault("0")
    private Boolean disableCount;

    @Column(name = "is_disable_comment_count", nullable = false)
    @ColumnDefault("0")
    private Boolean disableCommentCount;

    @Column(name = "is_disable_sidebar_stats", nullable = false)
    @ColumnDefault("0")
    private Boolean disableSidebarStats;

    @Column(name = "is_disable_auto_refresh", nullable = false)
    @ColumnDefault("0")
    private Boolean disableAutoRefresh;

    @Column(name = "tx_total_fields", length = 140)
    private String totalFields;

    @Column(name = "tx_fields", columnDefinition = "longtext")
    private String fields;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
