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
@Table(name = "t_payment_ledger_entry", indexes = {
        @Index(name = "idx_posting_date", columnList = "dt_postingDate"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_account", columnList = "tx_account"),
        @Index(name = "idx_party_type", columnList = "tx_party_type"),
        @Index(name = "idx_party", columnList = "tx_party"),
        @Index(name = "idx_voucher_detail_no", columnList = "tx_voucher_detail_no"),
        @Index(name = "idx_voucher_type", columnList = "tx_voucher_type"),
        @Index(name = "idx_voucher_no", columnList = "tx_voucher_no"),
        @Index(name = "idx_against_voucher_type", columnList = "tx_against_voucher_type"),
        @Index(name = "idx_against_voucher_no", columnList = "tx_against_voucher_no"),
        @Index(name = "idx_against_voucher_no_against_voucher_type_index", columnList = "tx_against_voucher_no, tx_against_voucher_type"),
        @Index(name = "idx_voucher_no_voucher_type_index", columnList = "tx_voucher_no, tx_voucher_type"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PaymentLedgerEntryDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_account_type", length = 140)
    private String accountType;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "tx_voucher_detail_no", length = 140)
    private String voucherDetailNo;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_against_voucher_type", length = 140)
    private String againstVoucherType;

    @Column(name = "tx_against_voucher_no", length = 140)
    private String againstVoucherNo;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "flt_amount_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amountInAccountCurrency;

    @Column(name = "is_de_linked", nullable = false)
    @ColumnDefault("0")
    private Boolean deLinked;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
