package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_process_payment_reconciliation", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ProcessPaymentReconciliationDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_receivable_payable_account", length = 140)
    private String receivablePayableAccount;

    @Column(name = "dt_from_invoice_date")
    private LocalDate fromInvoiceDate;

    @Column(name = "dt_to_invoice_date")
    private LocalDate toInvoiceDate;

    @Column(name = "dt_from_payment_date")
    private LocalDate fromPaymentDate;

    @Column(name = "dt_to_payment_date")
    private LocalDate toPaymentDate;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_bank_cash_account", length = 140)
    private String bankCashAccount;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_error_log", columnDefinition = "longtext")
    private String errorLog;

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
