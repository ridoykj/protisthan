package com.itbd.application.db.dao.crm;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_prospect", indexes = {
        @Index(name = "idx_company_name", columnList = "tx_company_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ProspectDao {

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

    @Column(name = "tx_company_name", unique = true, length = 140)
    private String companyName;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_no_of_employees", length = 140)
    private String noOfEmployees;

    @Column(name = "flt_annual_revenue", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal annualRevenue;

    @Column(name = "tx_market_segment", length = 140)
    private String marketSegment;

    @Column(name = "tx_industry", length = 140)
    private String industry;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_prospect_owner", length = 140)
    private String prospectOwner;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_fax", length = 140)
    private String fax;

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
