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
@Table(name = "t_journal_entry_account", indexes = {
        @Index(name = "idx_account", columnList = "tx_account"),
        @Index(name = "idx_party_type", columnList = "tx_party_type"),
        @Index(name = "idx_reference_type", columnList = "tx_reference_type"),
        @Index(name = "idx_reference_name", columnList = "tx_reference_name"),
        @Index(name = "idx_reference_detail_no", columnList = "tx_reference_detail_no"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class JournalEntryAccountDao {

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

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_account_type", length = 140)
    private String accountType;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "flt_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeRate;

    @Column(name = "flt_debit_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal debitInAccountCurrency;

    @Column(name = "flt_debit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal debit;

    @Column(name = "flt_credit_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal creditInAccountCurrency;

    @Column(name = "flt_credit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal credit;

    @Column(name = "tx_reference_type", length = 140)
    private String referenceType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "dt_reference_due_date")
    private LocalDate referenceDueDate;

    @Column(name = "tx_reference_detail_no", length = 140)
    private String referenceDetailNo;

    @Column(name = "tx_is_advance", length = 140)
    private String isAdvance;

    @Column(name = "tx_user_remark", columnDefinition = "text")
    private String userRemark;

    @Column(name = "tx_against_account", columnDefinition = "text")
    private String againstAccount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
