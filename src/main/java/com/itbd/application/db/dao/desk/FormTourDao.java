package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_form_tour", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_title", columnNames = {"tx_title"})
})
public class FormTourDao {

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

    @Column(name = "tx_title", unique = true, length = 140)
    private String title;

    @Column(name = "tx_view_name", length = 140)
    private String viewName;

    @Column(name = "tx_workspace_name", length = 140)
    private String workspaceName;

    @Column(name = "tx_list_name", length = 140)
    @ColumnDefault("'List'")
    private String listName;

    @Column(name = "tx_report_name", length = 140)
    private String reportName;

    @Column(name = "tx_dashboard_name", length = 140)
    private String dashboardName;

    @Column(name = "is_new_document_form", nullable = false)
    @ColumnDefault("0")
    private Boolean newDocumentForm;

    @Column(name = "tx_page_name", length = 140)
    private String pageName;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "is_ui_tour", nullable = false)
    @ColumnDefault("0")
    private Boolean uiTour;

    @Column(name = "is_track_steps", nullable = false)
    @ColumnDefault("0")
    private Boolean trackSteps;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean isStandard;

    @Column(name = "is_save_on_complete", nullable = false)
    @ColumnDefault("0")
    private Boolean saveOnComplete;

    @Column(name = "is_first_document", nullable = false)
    @ColumnDefault("0")
    private Boolean firstDocument;

    @Column(name = "is_include_name_field", nullable = false)
    @ColumnDefault("0")
    private Boolean includeNameField;

    @Column(name = "tx_page_route", columnDefinition = "text")
    private String pageRoute;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
