package com.itbd.application.db.dao.accounts.account;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_accounting_dimension_detail", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AccountingDimensionDetailDao {

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

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "tx_default_dimension", length = 140)
    private String defaultDimension;

    @Column(name = "is_mandatory_for_bs", nullable = false)
    @ColumnDefault("0")
    private Boolean mandatoryForBs;

    @Column(name = "is_mandatory_for_pl", nullable = false)
    @ColumnDefault("0")
    private Boolean mandatoryForPl;

    @Column(name = "is_automatically_post_balancing_accounting_entry", nullable = false)
    @ColumnDefault("0")
    private Boolean automaticallyPostBalancingAccountingEntry;

    @Column(name = "tx_offsetting_account", length = 140)
    private String offsettingAccount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
