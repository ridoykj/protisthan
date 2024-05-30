package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_transaction_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class TransactionLogDao {

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

    @Column(name = "tx_row_index", length = 140)
    private String rowIndex;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_document_name", length = 140)
    private String documentName;

    @Column(name = "dtt_timestamp")
    private LocalDateTime timestamp;

    @Column(name = "tx_checksum_version", length = 140)
    private String checksumVersion;

    @Column(name = "tx_previous_hash", columnDefinition = "text")
    private String previousHash;

    @Column(name = "tx_transaction_hash", columnDefinition = "text")
    private String transactionHash;

    @Column(name = "tx_chaining_hash", columnDefinition = "text")
    private String chainingHash;

    @Column(name = "tx_data", columnDefinition = "longtext")
    private String data;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
