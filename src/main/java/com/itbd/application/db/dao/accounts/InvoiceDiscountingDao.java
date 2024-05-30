package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_invoice_discounting", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class InvoiceDiscountingDao {

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

    @Column(name = "dt_loanStartDate")
    private LocalDate loanStartDate;

    @Column(name = "ct_loan_period", nullable = false)
    private Integer loanPeriod;

    @Column(name = "dt_loanEndDate")
    private LocalDate loanEndDate;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_total_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAmount;

    @Column(name = "flt_bank_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal bankCharges;

    @Column(name = "tx_short_term_loan", length = 140)
    private String shortTermLoan;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_bank_charges_account", length = 140)
    private String bankChargesAccount;

    @Column(name = "tx_accounts_receivable_credit", length = 140)
    private String accountsReceivableCredit;

    @Column(name = "tx_accounts_receivable_discounted", length = 140)
    private String accountsReceivableDiscounted;

    @Column(name = "tx_accounts_receivable_unpaid", length = 140)
    private String accountsReceivableUnpaid;

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
