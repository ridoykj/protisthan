package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_period_closing_voucher", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PeriodClosingVoucherDao {

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

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_fiscal_year", length = 140)
    private String fiscalYear;

    @Column(name = "dt_yearStartDate")
    private LocalDate yearStartDate;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_closing_account_head", length = 140)
    private String closingAccountHead;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_gle_processing_status", length = 140)
    private String gleProcessingStatus;

    @Column(name = "tx_error_message", columnDefinition = "text")
    private String errorMessage;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
