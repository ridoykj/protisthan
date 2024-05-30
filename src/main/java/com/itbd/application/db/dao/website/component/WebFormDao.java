package com.itbd.application.db.dao.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_form", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_route", columnNames = {"tx_route"})
})
public class WebFormDao {

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

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_route", unique = true, length = 140)
    private String route;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

    @Column(name = "tx_doc_type", length = 140)
    private String docType;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean isStandard;

    @Column(name = "tx_introduction_text", columnDefinition = "longtext")
    private String introductionText;

    @Column(name = "is_login_required", nullable = false)
    @ColumnDefault("0")
    private Boolean loginRequired;

    @Column(name = "is_allow_multiple", nullable = false)
    @ColumnDefault("0")
    private Boolean allowMultiple;

    @Column(name = "is_allow_edit", nullable = false)
    @ColumnDefault("0")
    private Boolean allowEdit;

    @Column(name = "is_allow_delete", nullable = false)
    @ColumnDefault("0")
    private Boolean allowDelete;

    @Column(name = "is_anonymous", nullable = false)
    @ColumnDefault("0")
    private Boolean anonymous;

    @Column(name = "is_apply_document_permissions", nullable = false)
    @ColumnDefault("0")
    private Boolean applyDocumentPermissions;

    @Column(name = "is_allow_print", nullable = false)
    @ColumnDefault("0")
    private Boolean allowPrint;

    @Column(name = "tx_print_format", length = 140)
    private String printFormat;

    @Column(name = "is_allow_comments", nullable = false)
    @ColumnDefault("0")
    private Boolean allowComments;

    @Column(name = "is_show_attachments", nullable = false)
    @ColumnDefault("0")
    private Boolean showAttachments;

    @Column(name = "is_allow_incomplete", nullable = false)
    @ColumnDefault("0")
    private Boolean allowIncomplete;

    @Column(name = "ct_max_attachment_size", nullable = false)
    private Integer maxAttachmentSize;

    @Column(name = "tx_condition_json", columnDefinition = "longtext")
    private String conditionJson;

    @Column(name = "is_show_list", nullable = false)
    @ColumnDefault("0")
    private Boolean showList;

    @Column(name = "tx_list_title", length = 140)
    private String listTitle;

    @Column(name = "is_show_sidebar", nullable = false)
    @ColumnDefault("0")
    private Boolean showSidebar;

    @Column(name = "tx_website_sidebar", length = 140)
    private String websiteSidebar;

    @Column(name = "tx_button_label", length = 140)
    @ColumnDefault("'Save'")
    private String buttonLabel;

    @Column(name = "tx_banner_image", columnDefinition = "text")
    private String bannerImage;

    @Column(name = "tx_breadcrumbs", columnDefinition = "longtext")
    private String breadcrumbs;

    @Column(name = "tx_success_title", length = 140)
    private String successTitle;

    @Column(name = "tx_success_url", length = 140)
    private String successUrl;

    @Column(name = "tx_success_message", columnDefinition = "text")
    private String successMessage;

    @Column(name = "tx_meta_title", length = 140)
    private String metaTitle;

    @Column(name = "tx_meta_description", columnDefinition = "text")
    private String metaDescription;

    @Column(name = "tx_meta_image", columnDefinition = "text")
    private String metaImage;

    @Column(name = "tx_client_script", columnDefinition = "longtext")
    private String clientScript;

    @Column(name = "tx_custom_css", columnDefinition = "longtext")
    private String customCss;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
