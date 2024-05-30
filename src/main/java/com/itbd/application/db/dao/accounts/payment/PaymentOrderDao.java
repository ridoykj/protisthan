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
@Table(name = "t_payment_order", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PaymentOrderDao {

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
    @ColumnDefault("'PMO-'")
    private String namingSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_payment_order_type", length = 140)
    private String paymentOrderType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_company_bank", length = 140)
    private String companyBank;

    @Column(name = "tx_company_bank_account", length = 140)
    private String companyBankAccount;

    @Column(name = "tx_account", length = 140)
    private String account;

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
