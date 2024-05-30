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
@Table(name = "t_bank_account", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_integration_id", columnNames = {"tx_integration_id"}),
})
public class BankAccountDao {

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

    @Column(name = "tx_account_name", length = 140)
    private String accountName;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_bank", length = 140)
    private String bank;

    @Column(name = "tx_account_type", length = 140)
    private String accountType;

    @Column(name = "tx_account_subtype", length = 140)
    private String accountSubtype;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "is_company_account", nullable = false)
    @ColumnDefault("0")
    private Boolean isCompanyAccount;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_iban", length = 30)
    private String iban;

    @Column(name = "tx_branch_code", length = 140)
    private String branchCode;

    @Column(name = "tx_bank_account_no", length = 30)
    private String bankAccountNo;

    @Column(name = "tx_integration_id", unique = true, length = 140)
    private String integrationId;

    @Column(name = "dt_lastIntegrationDate")
    private LocalDate lastIntegrationDate;

    @Column(name = "tx_mask", length = 140)
    private String mask;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
