package com.itbd.application.db.dao.pos;


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
@Table(name = "t_pos_invoice_merge_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PosInvoiceMergeLogDao {

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

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "tx_merge_invoices_based_on", length = 140)
    private String mergeInvoicesBasedOn;

    @Column(name = "tx_pos_closing_entry", length = 140)
    private String posClosingEntry;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_consolidated_invoice", length = 140)
    private String consolidatedInvoice;

    @Column(name = "tx_consolidated_credit_note", length = 140)
    private String consolidatedCreditNote;

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
