package com.itbd.application.db.dao.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_authorization_rule", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AuthorizationRuleDao {

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

    @Column(name = "tx_transaction", length = 140)
    private String transaction;

    @Column(name = "tx_based_on", length = 140)
    private String basedOn;

    @Column(name = "tx_customer_or_item", length = 140)
    private String customerOrItem;

    @Column(name = "tx_master_name", length = 140)
    private String masterName;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal value;

    @Column(name = "tx_system_role", length = 140)
    private String systemRole;

    @Column(name = "tx_to_emp", length = 140)
    private String toEmp;

    @Column(name = "tx_system_user", length = 140)
    private String systemUser;

    @Column(name = "tx_to_designation", length = 140)
    private String toDesignation;

    @Column(name = "tx_approving_role", length = 140)
    private String approvingRole;

    @Column(name = "tx_approving_user", length = 140)
    private String approvingUser;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
