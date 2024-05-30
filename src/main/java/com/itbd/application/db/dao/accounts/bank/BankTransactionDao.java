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
@Table(name = "t_bank_transaction", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_transaction_id", columnNames = {"tx_transaction_id"}),
})
public class BankTransactionDao {

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

    @Column(name = "tx_naming_series", length = 140)
    @ColumnDefault("'ACC-BTN-.YYYY.-'")
    private String namingSeries;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Pending'")
    private String status;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "flt_deposit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal deposit;

    @Column(name = "flt_withdrawal", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal withdrawal;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_reference_number", length = 140)
    private String referenceNumber;

    @Column(name = "tx_transaction_id", unique = true, length = 140)
    private String transactionId;

    @Column(name = "tx_transaction_type", length = 50)
    private String transactionType;

    @Column(name = "flt_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal allocatedAmount;

    @Column(name = "flt_unallocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal unallocatedAmount;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_bank_party_name", length = 140)
    private String bankPartyName;

    @Column(name = "tx_bank_party_account_number", length = 140)
    private String bankPartyAccountNumber;

    @Column(name = "tx_bank_party_iban", length = 140)
    private String bankPartyIban;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
