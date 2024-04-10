package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_access_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AccessLogDao {

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

    @Column(name = "tx_export_from", length = 140)
    private String exportFrom;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "dtt_timestamp")
    private LocalDateTime timestamp;

    @Column(name = "tx_fileType", length = 140)
    private String fileType;

    @Column(name = "tx_method", length = 140)
    private String method;

    @Column(name = "tx_reportName", length = 140)
    private String reportName;

    @Column(name = "tx_filters", columnDefinition = "longtext")
    private String filters;

    @Column(name = "tx_page", columnDefinition = "longtext")
    private String page;

    @Column(name = "tx_columns", columnDefinition = "longtext")
    private String columns;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
