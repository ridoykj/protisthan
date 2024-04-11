package com.itbd.application.db.dao;


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
@Table(name = "t_lead", indexes = {
        @Index(name = "idx_lead_name", columnList = "tx_lead_name"),
        @Index(name = "idx_lead_owner", columnList = "tx_lead_owner"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_email_id", columnList = "tx_email_id"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class LeadDao {

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
    private String namingSeries;

    @Column(name = "tx_salutation", length = 140)
    private String salutation;

    @Column(name = "tx_first_name", length = 140)
    private String firstName;

    @Column(name = "tx_middle_name", length = 140)
    private String middleName;

    @Column(name = "tx_last_name", length = 140)
    private String lastName;

    @Column(name = "tx_lead_name", length = 140)
    private String leadName;

    @Column(name = "tx_job_title", length = 140)
    private String jobTitle;

    @Column(name = "tx_gender", length = 140)
    private String gender;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_lead_owner", length = 140)
    private String leadOwner;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Lead'")
    private String status;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_request_type", length = 140)
    private String requestType;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_mobile_no", length = 140)
    private String mobileNo;

    @Column(name = "tx_whatsapp_no", length = 140)
    private String whatsappNo;

    @Column(name = "tx_phone", length = 140)
    private String phone;

    @Column(name = "tx_phone_ext", length = 140)
    private String phoneExt;

    @Column(name = "tx_company_name", length = 140)
    private String companyName;

    @Column(name = "tx_no_of_employees", length = 140)
    private String noOfEmployees;

    @Column(name = "flt_annual_revenue", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal annualRevenue;

    @Column(name = "tx_industry", length = 140)
    private String industry;

    @Column(name = "tx_market_segment", length = 140)
    private String marketSegment;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_fax", length = 140)
    private String fax;

    @Column(name = "tx_city", length = 140)
    private String city;

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "tx_qualification_status", length = 140)
    private String qualificationStatus;

    @Column(name = "tx_qualified_by", length = 140)
    private String qualifiedBy;

    @Column(name = "dt_qualifiedOn")
    private LocalDate qualifiedOn;

    @Column(name = "tx_campaign_name", length = 140)
    private String campaignName;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_unsubscribed", nullable = false)
    @ColumnDefault("0")
    private Boolean unsubscribed;

    @Column(name = "is_blog_subscriber", nullable = false)
    @ColumnDefault("0")
    private Boolean blogSubscriber;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
