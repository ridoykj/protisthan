package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_role", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_role_name", columnNames = {"tx_role_name"})
})
@DynamicInsert
public class RoleDao {

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

    @Column(name = "tx_role_name", unique = true, length = 140)
    private String roleName;

    @Column(name = "tx_home_page", length = 140)
    private String homePage;

    @Column(name = "tx_restrict_to_domain", length = 140)
    private String restrictToDomain;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean isCustom;

    @Column(name = "is_desk_access", nullable = false)
    @ColumnDefault("1")
    private Boolean deskAccess;

    @Column(name = "is_two_factor_auth", nullable = false)
    @ColumnDefault("0")
    private Boolean twoFactorAuth;

    @Column(name = "is_search_bar", nullable = false)
    @ColumnDefault("1")
    private Boolean searchBar;

    @Column(name = "is_notifications", nullable = false)
    @ColumnDefault("1")
    private Boolean notifications;

    @Column(name = "is_list_sidebar", nullable = false)
    @ColumnDefault("1")
    private Boolean listSidebar;

    @Column(name = "is_bulk_actions", nullable = false)
    @ColumnDefault("1")
    private Boolean bulkActions;

    @Column(name = "is_view_switcher", nullable = false)
    @ColumnDefault("1")
    private Boolean viewSwitcher;

    @Column(name = "is_form_sidebar", nullable = false)
    @ColumnDefault("1")
    private Boolean formSidebar;

    @Column(name = "is_timeline", nullable = false)
    @ColumnDefault("1")
    private Boolean timeline;

    @Column(name = "is_dashboard", nullable = false)
    @ColumnDefault("1")
    private Boolean dashboard;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
