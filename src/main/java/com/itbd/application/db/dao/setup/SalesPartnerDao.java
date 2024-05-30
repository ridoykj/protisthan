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
@Table(name = "t_sales_partner", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_partner_name", columnNames = "tx_partner_name"),
        @UniqueConstraint(name = "uk_referral_code", columnNames = "tx_referral_code"),
        @UniqueConstraint(name = "uk_route", columnNames = "tx_route")
})
public class SalesPartnerDao {

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

    @Column(name = "tx_partner_name", unique = true, length = 140)
    private String partnerName;

    @Column(name = "tx_partner_type", length = 140)
    private String partnerType;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "flt_commission_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal commissionRate;

    @Column(name = "is_show_in_website", nullable = false)
    @ColumnDefault("0")
    private Boolean showInWebsite;

    @Column(name = "tx_referral_code", unique = true, length = 8)
    private String referralCode;

    @Column(name = "tx_route", unique = true, length = 140)
    private String route;

    @Column(name = "tx_logo", columnDefinition = "text")
    private String logo;

    @Column(name = "tx_partner_website", length = 140)
    private String partnerWebsite;

    @Column(name = "tx_introduction", columnDefinition = "text")
    private String introduction;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
