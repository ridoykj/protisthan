package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_data_import", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class DataImportDao {

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

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_import_type", length = 140)
    private String importType;

    @Column(name = "tx_import_file", columnDefinition = "text")
    private String importFile;

    @Column(name = "ct_payload_count", nullable = false)
    private Integer payloadCount;

    @Column(name = "tx_google_sheets_url", length = 140)
    private String googleSheetsUrl;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Pending'")
    private String status;

    @Column(name = "is_submit_after_import", nullable = false)
    @ColumnDefault("0")
    private Boolean submitAfterImport;

    @Column(name = "is_mute_emails", nullable = false)
    @ColumnDefault("1")
    private Boolean muteEmails;

    @Column(name = "tx_template_options", columnDefinition = "longtext")
    private String templateOptions;

    @Column(name = "tx_template_warnings", columnDefinition = "longtext")
    private String templateWarnings;

    @Column(name = "is_show_failed_logs", nullable = false)
    @ColumnDefault("0")
    private Boolean showFailedLogs;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
