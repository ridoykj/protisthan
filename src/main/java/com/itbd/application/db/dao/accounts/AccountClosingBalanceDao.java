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
@Table(name = "t_account_closing_balance", indexes = {
        @Index(name = "idx_closing_date", columnList = "dt_closing_date"),
        @Index(name = "idx_account", columnList = "tx_account"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_period_closing_voucher", columnList = "tx_period_closing_voucher"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AccountClosingBalanceDao {

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

    @Column(name = "dt_closing_date")
    private LocalDate closingDate;

    @Column(name = "tx_account", length = 140)
    private String account;

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

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_period_closing_voucher", length = 140)
    private String periodClosingVoucher;

    @Column(name = "is_period_closing_voucher_entry", nullable = false)
    @ColumnDefault("0")
    private Boolean isPeriodClosingVoucherEntry;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
