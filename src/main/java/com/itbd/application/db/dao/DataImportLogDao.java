package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_data_import_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class DataImportLogDao {

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

    @Column(name = "tx_data_import", length = 140)
    private String dataImport;

    @Column(name = "tx_row_indexes", columnDefinition = "longtext")
    private String rowIndexes;

    @Column(name = "is_success", nullable = false)
    @ColumnDefault("0")
    private Boolean success;

    @Column(name = "tx_doc_name", length = 140)
    private String docName;

    @Column(name = "tx_messages", columnDefinition = "longtext")
    private String messages;

    @Column(name = "tx_exception", columnDefinition = "text")
    private String exception;

    @Column(name = "ct_log_index", nullable = false)
    private Integer logIndex;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
