package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_coupon_code", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_coupon_code", columnNames = {"tx_coupon_code"}),
        @UniqueConstraint(name = "uk_coupon_name", columnNames = {"tx_coupon_name"})
})
public class CouponCodeDao {

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

    @Column(name = "tx_coupon_name", unique = true, length = 140)
    private String couponName;

    @Column(name = "tx_coupon_type", length = 140)
    private String couponType;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_coupon_code", unique = true, length = 140)
    private String couponCode;

    @Column(name = "tx_pricing_rule", length = 140)
    private String pricingRule;

    @Column(name = "dt_valid_from")
    private LocalDate validFrom;

    @Column(name = "dt_valid_upto")
    private LocalDate validUpto;

    @Column(name = "ct_maximum_use", nullable = false)
    private Integer maximumUse;

    @Column(name = "ct_used", nullable = false)
    private Integer used;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

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
