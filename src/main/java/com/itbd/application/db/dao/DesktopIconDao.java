package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_desktop_icon", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_unique_module_name_owner_standard", columnNames = {"tx_module_name", "tx_owner", "is_standard"})
})
public class DesktopIconDao {

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

    @Column(name = "tx_module_name", length = 140)
    private String moduleName;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean standard;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean custom;

    @Column(name = "tx_app", length = 140)
    private String app;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_category", length = 140)
    private String category;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean hidden;

    @Column(name = "is_blocked", nullable = false)
    @ColumnDefault("0")
    private Boolean blocked;

    @Column(name = "is_force_show", nullable = false)
    @ColumnDefault("0")
    private Boolean forceShow;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_doc_type", length = 140)
    private String docType;

    @Column(name = "tx_report", length = 140)
    private String report;

    @Column(name = "tx_link", columnDefinition = "text")
    private String link;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "is_reverse", nullable = false)
    @ColumnDefault("0")
    private Boolean reverse;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
