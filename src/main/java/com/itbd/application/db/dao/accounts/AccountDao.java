package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_account", indexes = {
        @Index(name = "idx_parent_account", columnList = "tx_parent_account"),
        @Index(name = "idx_lft", columnList = "ct_lft"),
        @Index(name = "idx_rgt", columnList = "ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
        @Index(name = "idx_lft_rgt_index", columnList = "ct_lft, ct_rgt")
})
public class AccountDao {

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

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_account_name", length = 140)
    private String accountName;

    @Column(name = "tx_account_number", length = 140)
    private String accountNumber;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_root_type", length = 140)
    private String rootType;

    @Column(name = "tx_report_type", length = 140)
    private String reportType;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "tx_parent_account", length = 140)
    private String parentAccount;

    @Column(name = "tx_account_type", length = 140)
    private String accountType;

    @Column(name = "flt_tax_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxRate;

    @Column(name = "tx_freeze_account", length = 140)
    private String freezeAccount;

    @Column(name = "tx_balance_must_be", length = 140)
    private String balanceMustBe;

    @Column(name = "ct_lft", nullable = false)
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    private Integer rgt;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "is_include_in_gross", nullable = false)
    @ColumnDefault("0")
    private Boolean includeInGross;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
