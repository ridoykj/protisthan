package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_onboarding_step", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class OnboardingStepDao {

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

    @Column(name = "is_complete", nullable = false)
    @ColumnDefault("0")
    private Boolean isComplete;

    @Column(name = "is_skipped", nullable = false)
    @ColumnDefault("0")
    private Boolean isSkipped;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_intro_video_url", length = 140)
    private String introVideoUrl;

    @Column(name = "tx_action", length = 140)
    private String action;

    @Column(name = "tx_action_label", length = 140)
    private String actionLabel;

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "is_show_full_form", nullable = false)
    @ColumnDefault("0")
    private Boolean showFullForm;

    @Column(name = "is_show_form_tour", nullable = false)
    @ColumnDefault("0")
    private Boolean showFormTour;

    @Column(name = "tx_form_tour", length = 140)
    private String formTour;

    @Column(name = "is_single", nullable = false)
    @ColumnDefault("0")
    private Boolean isSingle;

    @Column(name = "tx_reference_report", length = 140)
    private String referenceReport;

    @Column(name = "tx_report_reference_doc_type", length = 140)
    private String reportReferenceDocType;

    @Column(name = "tx_report_type", length = 140)
    private String reportType;

    @Column(name = "tx_report_description", length = 140)
    private String reportDescription;

    @Column(name = "tx_path", length = 140)
    private String path;

    @Column(name = "tx_callback_title", length = 140)
    private String callbackTitle;

    @Column(name = "tx_callback_message", columnDefinition = "text")
    private String callbackMessage;

    @Column(name = "is_validate_action", nullable = false)
    @ColumnDefault("1")
    private Boolean validateAction;

    @Column(name = "tx_field", length = 140)
    private String field;

    @Column(name = "tx_value_to_validate", length = 140)
    private String valueToValidate;

    @Column(name = "tx_video_url", length = 140)
    private String videoUrl;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
