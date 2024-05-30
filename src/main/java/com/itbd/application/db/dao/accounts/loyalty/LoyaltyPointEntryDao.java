package com.itbd.application.db.dao.accounts.loyalty;


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
@Table(name = "t_loyalty_point_entry", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class LoyaltyPointEntryDao {

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

    @Column(name = "tx_loyalty_program", length = 140)
    private String loyaltyProgram;

    @Column(name = "tx_loyalty_program_tier", length = 140)
    private String loyaltyProgramTier;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_invoice_type", length = 140)
    private String invoiceType;

    @Column(name = "tx_invoice", length = 140)
    private String invoice;

    @Column(name = "tx_redeem_against", length = 140)
    private String redeemAgainst;

    @Column(name = "ct_loyalty_points", nullable = false)
    private Integer loyaltyPoints;

    @Column(name = "flt_purchase_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal purchaseAmount;

    @Column(name = "dt_expiryDate")
    private LocalDate expiryDate;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
