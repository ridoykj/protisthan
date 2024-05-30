package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_customize_form_field", indexes = {
        @Index(name = "idx_label", columnList = "tx_label"),
        @Index(name = "idx_field_type", columnList = "tx_field_type"),
        @Index(name = "idx_field_name", columnList = "tx_field_name"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class CustomizeFormFieldDao {

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

    @Column(name = "is_system_generated", nullable = false)
    @ColumnDefault("0")
    private Boolean isSystemGenerated;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_field_type", length = 140)
    @ColumnDefault("'Data'")
    private String fieldType;

    @Column(name = "tx_field_name", length = 140)
    private String fieldName;

    @Column(name = "is_non_negative", nullable = false)
    @ColumnDefault("0")
    private Boolean nonNegative;

    @Column(name = "is_reqd", nullable = false)
    @ColumnDefault("0")
    private Boolean reqd;

    @Column(name = "ct_unique", nullable = false)
    @ColumnDefault("0")
    private Boolean unique;

    @Column(name = "is_virtual", nullable = false)
    @ColumnDefault("0")
    private Boolean isVirtual;

    @Column(name = "is_in_list_view", nullable = false)
    @ColumnDefault("0")
    private Boolean inListView;

    @Column(name = "is_in_standard_filter", nullable = false)
    @ColumnDefault("0")
    private Boolean inStandardFilter;

    @Column(name = "is_in_global_search", nullable = false)
    @ColumnDefault("0")
    private Boolean inGlobalSearch;

    @Column(name = "is_in_preview", nullable = false)
    @ColumnDefault("0")
    private Boolean inPreview;

    @Column(name = "is_bold", nullable = false)
    @ColumnDefault("0")
    private Boolean bold;

    @Column(name = "is_no_copy", nullable = false)
    @ColumnDefault("0")
    private Boolean noCopy;

    @Column(name = "is_allow_in_quick_entry", nullable = false)
    @ColumnDefault("0")
    private Boolean allowInQuickEntry;

    @Column(name = "is_translatable", nullable = false)
    @ColumnDefault("1")
    private Boolean translatable;

    @Column(name = "tx_default", columnDefinition = "text")
    private String defaults;

    @Column(name = "tx_precision", length = 140)
    private String precision;

    @Column(name = "ct_length", nullable = false)
    private Integer length;

    @Column(name = "tx_options", columnDefinition = "text")
    private String options;

    @Column(name = "is_sort_options", nullable = false)
    @ColumnDefault("0")
    private Boolean sortOptions;

    @Column(name = "tx_fetch_from", columnDefinition = "text")
    private String fetchFrom;

    @Column(name = "is_fetch_if_empty", nullable = false)
    @ColumnDefault("0")
    private Boolean fetchIfEmpty;

    @Column(name = "is_show_dashboard", nullable = false)
    @ColumnDefault("0")
    private Boolean showDashboard;

    @Column(name = "tx_depends_on", columnDefinition = "longtext")
    private String dependsOn;

    @Column(name = "ct_perm_level", nullable = false)
    private Integer permLevel;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean hidden;

    @Column(name = "is_read_only", nullable = false)
    @ColumnDefault("0")
    private Boolean readOnly;

    @Column(name = "is_collapsible", nullable = false)
    @ColumnDefault("0")
    private Boolean collapsible;

    @Column(name = "is_allow_bulk_edit", nullable = false)
    @ColumnDefault("0")
    private Boolean allowBulkEdit;

    @Column(name = "tx_collapsible_depends_on", columnDefinition = "longtext")
    private String collapsibleDependsOn;

    @Column(name = "is_ignore_user_permissions", nullable = false)
    @ColumnDefault("0")
    private Boolean ignoreUserPermissions;

    @Column(name = "is_allow_on_submit", nullable = false)
    @ColumnDefault("0")
    private Boolean allowOnSubmit;

    @Column(name = "is_report_hide", nullable = false)
    @ColumnDefault("0")
    private Boolean reportHide;

    @Column(name = "is_remember_last_selected_value", nullable = false)
    @ColumnDefault("0")
    private Boolean rememberLastSelectedValue;

    @Column(name = "is_hide_border", nullable = false)
    @ColumnDefault("0")
    private Boolean hideBorder;

    @Column(name = "is_ignore_xss_filter", nullable = false)
    @ColumnDefault("0")
    private Boolean ignoreXssFilter;

    @Column(name = "tx_mandatory_depends_on", columnDefinition = "longtext")
    private String mandatoryDependsOn;

    @Column(name = "tx_read_only_depends_on", columnDefinition = "longtext")
    private String readOnlyDependsOn;

    @Column(name = "is_in_filter", nullable = false)
    @ColumnDefault("0")
    private Boolean inFilter;

    @Column(name = "is_hide_seconds", nullable = false)
    @ColumnDefault("0")
    private Boolean hideSeconds;

    @Column(name = "is_hide_days", nullable = false)
    @ColumnDefault("0")
    private Boolean hideDays;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "is_print_hide", nullable = false)
    @ColumnDefault("0")
    private Boolean printHide;

    @Column(name = "is_print_hide_if_no_value", nullable = false)
    @ColumnDefault("0")
    private Boolean printHideIfNoValue;

    @Column(name = "tx_print_width", length = 140)
    private String printWidth;

    @Column(name = "ct_columns", nullable = false)
    private Integer columns;

    @Column(name = "tx_width", length = 140)
    private String width;

    @Column(name = "ct_is_custom_field", nullable = false)
    private Integer isCustomField;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
