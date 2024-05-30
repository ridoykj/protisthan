package com.itbd.application.db.dao;


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
@Table(name = "t_gl_entry", indexes = {
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_account", columnList = "tx_account"),
        @Index(name = "idx_party_type", columnList = "tx_party_type"),
        @Index(name = "idx_party", columnList = "tx_party"),
        @Index(name = "idx_against_voucher", columnList = "tx_against_voucher"),
        @Index(name = "idx_voucher_no", columnList = "tx_voucher_no"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_to_rename", columnList = "ct_to_rename"),
        @Index(name = "idx_against_voucher_type_against_voucher_index", columnList = "tx_against_voucher_type, tx_against_voucher"),
        @Index(name = "idx_voucher_type_voucher_no_index", columnList = "tx_voucher_type, tx_voucher_no"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class GlEntryDao {

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

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "flt_debit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal debit;

    @Column(name = "flt_credit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal credit;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "flt_debit_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal debitInAccountCurrency;

    @Column(name = "flt_credit_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal creditInAccountCurrency;

    @Column(name = "tx_against", columnDefinition = "text")
    private String against;

    @Column(name = "tx_against_voucher_type", length = 140)
    private String againstVoucherType;

    @Column(name = "tx_against_voucher", length = 140)
    private String againstVoucher;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_subtype", columnDefinition = "text")
    private String voucherSubtype;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_voucher_detail_no", length = 140)
    private String voucherDetailNo;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_is_opening", length = 140)
    private String isOpening;

    @Column(name = "tx_is_advance", length = 140)
    private String isAdvance;

    @Column(name = "tx_fiscal_year", length = 140)
    private String fiscalYear;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "ct_to_rename", nullable = false)
    @ColumnDefault("1")
    private Boolean toRename;

    @Column(name = "dt_due_date")
    private LocalDate dueDate;

    @Column(name = "is_cancelled", nullable = false)
    @ColumnDefault("0")
    private Boolean isCancelled;

    @Column(name = "tx_transaction_currency", length = 140)
    private String transactionCurrency;

    @Column(name = "flt_debit_in_transaction_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal debitInTransactionCurrency;

    @Column(name = "flt_credit_in_transaction_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal creditInTransactionCurrency;

    @Column(name = "flt_transaction_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal transactionExchangeRate;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
