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
@Table(name = "t_loyalty_program", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_loyalty_program_name", columnNames = {"tx_loyalty_program_name"})
})
public class LoyaltyProgramDao {

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

    @Column(name = "tx_loyalty_program_name", unique = true, length = 140)
    private String loyaltyProgramName;

    @Column(name = "tx_loyalty_program_type", length = 140)
    private String loyaltyProgramType;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_customer_territory", length = 140)
    private String customerTerritory;

    @Column(name = "is_auto_opt_in", nullable = false)
    @ColumnDefault("0")
    private Boolean autoOptIn;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "ct_expiry_duration", nullable = false)
    private Integer expiryDuration;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
