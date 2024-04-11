package com.itbd.application.db.dao.opportunity;


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
@Table(name = "t_opportunity", indexes = {
        @Index(name = "idx_customer_group", columnList = "tx_customer_group"),
        @Index(name = "idx_territory", columnList = "tx_territory"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class OpportunityDao {

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

    @Column(name = "tx_opportunity_from", length = 140)
    private String opportunityFrom;

    @Column(name = "tx_party_name", length = 140)
    private String partyName;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_opportunity_type", length = 140)
    @ColumnDefault("'Sales'")
    private String opportunityType;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_opportunity_owner", length = 140)
    private String opportunityOwner;

    @Column(name = "tx_sales_stage", length = 140)
    @ColumnDefault("'Prospecting'")
    private String salesStage;

    @Column(name = "dt_expectedClosing")
    private LocalDate expectedClosing;

    @Column(name = "flt_probability", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("100.0")
    private BigDecimal probability;

    @Column(name = "tx_no_of_employees", length = 140)
    private String noOfEmployees;

    @Column(name = "flt_annual_revenue", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal annualRevenue;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_industry", length = 140)
    private String industry;

    @Column(name = "tx_market_segment", length = 140)
    private String marketSegment;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_city", length = 140)
    private String city;

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionRate;

    @Column(name = "flt_opportunity_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal opportunityAmount;

    @Column(name = "flt_base_opportunity_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseOpportunityAmount;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "flt_first_response_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal firstResponseTime;

    @Column(name = "tx_order_lost_reason", columnDefinition = "text")
    private String orderLostReason;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_job_title", length = 140)
    private String jobTitle;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_contact_mobile", length = 140)
    private String contactMobile;

    @Column(name = "tx_whatsapp", length = 140)
    private String whatsapp;

    @Column(name = "tx_phone", length = 140)
    private String phone;

    @Column(name = "tx_phone_ext", length = 140)
    private String phoneExt;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "flt_base_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotal;

    @Column(name = "flt_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal total;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
