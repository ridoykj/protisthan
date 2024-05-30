package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_bulk_transaction_log_detail", indexes = {
        @Index(name = "idx_from_doc_type", columnList = "tx_from_doc_type"),
        @Index(name = "idx_transaction_name", columnList = "tx_transaction_name"),
        @Index(name = "idx_date", columnList = "dt_date"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class BulkTransactionLogDetailDao {

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

    @Column(name = "tx_from_doc_type", length = 140)
    private String fromDocType;

    @Column(name = "tx_transaction_name", length = 140)
    private String transactionName;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tt_time")
    private LocalTime time;

    @Column(name = "tx_transaction_status", length = 140)
    private String transactionStatus;

    @Column(name = "tx_error_description", columnDefinition = "longtext")
    private String errorDescription;

    @Column(name = "tx_to_doc_type", length = 140)
    private String toDocType;

    @Column(name = "ct_retried", nullable = false)
    private Integer retried;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
