package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_report", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_report_name", columnNames = {"tx_report_name"})
})
public class ReportDao {

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

    @Column(name = "tx_report_name", unique = true, length = 140)
    private String reportName;

    @Column(name = "tx_ref_doc_type", length = 140)
    private String refDocType;

    @Column(name = "tx_reference_report", length = 140)
    private String referenceReport;

    @Column(name = "tx_is_standard", length = 140)
    private String isStandard;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_report_type", length = 140)
    private String reportType;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "is_add_total_row", nullable = false)
    @ColumnDefault("0")
    private Boolean addTotalRow;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_prepared_report", nullable = false)
    @ColumnDefault("0")
    private Boolean preparedReport;

    @Column(name = "tx_query", columnDefinition = "longtext")
    private String query;

    @Column(name = "tx_report_script", columnDefinition = "longtext")
    private String reportScript;

    @Column(name = "tx_javascript", columnDefinition = "longtext")
    private String javascript;

    @Column(name = "tx_json", columnDefinition = "longtext")
    private String json;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
