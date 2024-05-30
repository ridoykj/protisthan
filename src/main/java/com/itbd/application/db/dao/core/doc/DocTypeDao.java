package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_doc_type", indexes = {
        @Index(name = "idx_module", columnList = "tx_module"),
})
public class DocTypeDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false)
    private String name;

    @Column(name = "dtt_creation")
    private LocalDateTime creation;

    @Column(name = "dtt_modified")
    private LocalDateTime modified;

    @Column(name = "tx_modified_by", length = 140)
    private String modifiedBy;

    @Column(name = "tx_owner")
    private String owner;

    @Column(name = "is_doc_status", nullable = false)
    @ColumnDefault("0")
    private Boolean isDocStatus;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_search_fields", length = 140)
    private String searchFields;

    @Column(name = "is_single", nullable = false)
    @ColumnDefault("0")
    private Boolean isSingle;

    @Column(name = "is_virtual", nullable = false)
    @ColumnDefault("0")
    private Boolean isVirtual;

    @Column(name = "is_tree", nullable = false)
    @ColumnDefault("0")
    private Boolean isTree;

    @Column(name = "is_table", nullable = false)
    @ColumnDefault("0")
    private Boolean isTable;

    @Column(name = "is_editable_grid", nullable = false)
    @ColumnDefault("1")
    private Boolean editableGrid;

    @Column(name = "is_track_changes", nullable = false)
    @ColumnDefault("0")
    private Boolean trackChanges;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_restrict_to_domain", length = 140)
    private String restrictToDomain;

    @Column(name = "tx_app")
    private String app;

    @Column(name = "tx_auto_name", length = 140)
    private String autoName;

    @Column(name = "tx_naming_rule", length = 40)
    private String namingRule;

    @Column(name = "tx_title_field", length = 140)
    private String titleField;

    @Column(name = "tx_image_field", length = 140)
    private String imageField;

    @Column(name = "tx_timeline_field", length = 140)
    private String timelineField;

    @Column(name = "tx_sort_field", length = 140)
    @ColumnDefault("'modified'")
    private String sortField;

    @Column(name = "tx_sort_order", length = 140)
    @ColumnDefault("'DESC'")
    private String sortOrder;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_colour")
    private String colour;

    @Column(name = "is_read_only", nullable = false)
    @ColumnDefault("0")
    private Boolean readOnly;

    @Column(name = "is_in_create", nullable = false)
    @ColumnDefault("0")
    private Boolean inCreate;

    @Column(name = "ct_menu_index")
    private Integer menuIndex;

    @Column(name = "tx_parent_node")
    private String parentNode;

    @Column(name = "tx_small_icon")
    private String smallIcon;

    @Column(name = "is_allow_copy", nullable = false)
    @ColumnDefault("0")
    private Boolean allowCopy;

    @Column(name = "is_allow_rename", nullable = false)
    @ColumnDefault("1")
    private Boolean allowRename;

    @Column(name = "is_allow_import", nullable = false)
    @ColumnDefault("0")
    private Boolean allowImport;

    @Column(name = "is_hide_toolbar", nullable = false)
    @ColumnDefault("0")
    private Boolean hideToolbar;

    @Column(name = "is_track_seen", nullable = false)
    @ColumnDefault("0")
    private Boolean trackSeen;

    @Column(name = "ct_max_attachments", nullable = false)
    private Integer maxAttachments;

    @Column(name = "tx_printOutline")
    private String printOutline;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "tx_tagFields")
    private String tagFields;

    @Column(name = "tx_subject")
    private String subject;

    @Column(name = "tx_last_update", length = 32)
    private String lastUpdate;

    @Column(name = "tx_engine", length = 140)
    @ColumnDefault("'InnoDB'")
    private String engine;

    @Column(name = "tx_default_print_format", length = 140)
    private String defaultPrintFormat;

    @Column(name = "is_submittable", nullable = false)
    @ColumnDefault("0")
    private Boolean isSubmittable;

    @Column(name = "is_show_name_in_global_search", nullable = false)
    @ColumnDefault("0")
    private Boolean showNameInGlobalSearch;

    @Column(name = "tx_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean custom;

    @Column(name = "is_beta", nullable = false)
    @ColumnDefault("0")
    private Boolean beta;

    @Column(name = "is_has_web_view", nullable = false)
    @ColumnDefault("0")
    private Boolean hasWebView;

    @Column(name = "is_allow_guest_to_view", nullable = false)
    @ColumnDefault("0")
    private Boolean allowGuestToView;

    @Column(name = "tx_route", length = 140)
    private String route;

    @Column(name = "tx_is_published_field", length = 140)
    private String isPublishedField;

    @Column(name = "tx_website_search_field", length = 140)
    private String websiteSearchField;

    @Column(name = "is_email_append_to", nullable = false)
    @ColumnDefault("0")
    private Boolean emailAppendTo;

    @Column(name = "tx_subject_field", length = 140)
    private String subjectField;

    @Column(name = "tx_sender_field", length = 140)
    private String senderField;

    @Column(name = "is_show_title_field_in_link", nullable = false)
    @ColumnDefault("0")
    private Boolean showTitleFieldInLink;

    @Column(name = "tx_migration_hash", length = 140)
    private String migrationHash;

    @Column(name = "is_translated_doc_type", nullable = false)
    @ColumnDefault("0")
    private Boolean translatedDocType;

    @Column(name = "is_calendar_and_gantt", nullable = false)
    @ColumnDefault("0")
    private Boolean isCalendarAndGantt;

    @Column(name = "is_quick_entry", nullable = false)
    @ColumnDefault("0")
    private Boolean quickEntry;

    @Column(name = "is_track_views", nullable = false)
    @ColumnDefault("0")
    private Boolean trackViews;

    @Column(name = "is_queue_in_background", nullable = false)
    @ColumnDefault("0")
    private Boolean queueInBackground;

    @Column(name = "tx_documentation", length = 140)
    private String documentation;

    @Column(name = "tx_nsm_parent_field", length = 140)
    private String nsmParentField;

    @Column(name = "is_allow_events_in_timeline", nullable = false)
    @ColumnDefault("0")
    private Boolean allowEventsInTimeline;

    @Column(name = "is_allow_auto_repeat", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAutoRepeat;

    @Column(name = "is_make_attachments_public", nullable = false)
    @ColumnDefault("0")
    private Boolean makeAttachmentsPublic;

    @Column(name = "tx_default_view", length = 140)
    private String defaultView;

    @Column(name = "is_force_re_route_to_default_view", nullable = false)
    @ColumnDefault("0")
    private Boolean forceReRouteToDefaultView;

    @Column(name = "is_show_preview_popup", nullable = false)
    @ColumnDefault("0")
    private Boolean showPreviewPopup;

    @Column(name = "tx_default_email_template", length = 140)
    private String defaultEmailTemplate;

    @Column(name = "tx_sender_name_field", length = 140)
    private String senderNameField;

    @Column(name = "is_index_web_pages_for_search", nullable = false)
    @ColumnDefault("1")
    private Boolean indexWebPagesForSearch;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;
}
