package com.itbd.application.db.dao.accounts.bank;


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
@Table(name = "t_bank_guarantee", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_bank_guarantee_number", columnNames = {"tx_bank_guarantee_number"}),
})
public class BankGuaranteeDao {

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

    @Column(name = "tx_bg_type", length = 140)
    private String bgType;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_doc_name", length = 140)
    private String referenceDocName;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "dt_startDate")
    private LocalDate startDate;

    @Column(name = "ct_validity", nullable = false)
    private Integer validity;

    @Column(name = "dt_endDate")
    private LocalDate endDate;

    @Column(name = "tx_bank", length = 140)
    private String bank;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_bank_account_no", length = 140)
    private String bankAccountNo;

    @Column(name = "tx_iban", length = 140)
    private String iban;

    @Column(name = "tx_branch_code", length = 140)
    private String branchCode;

    @Column(name = "tx_swift_number", length = 140)
    private String swiftNumber;

    @Column(name = "tx_more_information", columnDefinition = "longtext")
    private String moreInformation;

    @Column(name = "tx_bank_guarantee_number", unique = true, length = 140)
    private String bankGuaranteeNumber;

    @Column(name = "tx_name_of_beneficiary", length = 140)
    private String nameOfBeneficiary;

    @Column(name = "flt_margin_money", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal marginMoney;

    @Column(name = "flt_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal charges;

    @Column(name = "tx_fixed_deposit_number", length = 140)
    private String fixedDepositNumber;

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
