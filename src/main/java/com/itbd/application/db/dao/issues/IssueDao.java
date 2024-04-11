package com.itbd.application.db.dao.issues;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_issue", indexes = {
        @Index(name = "idx_customer", columnList = "tx_customer"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class IssueDao {

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

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_raised_by", length = 140)
    private String raisedBy;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "tx_issue_type", length = 140)
    private String issueType;

    @Column(name = "tx_issue_split_from", length = 140)
    private String issueSplitFrom;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_service_level_agreement", length = 140)
    private String serviceLevelAgreement;

    @Column(name = "dtt_response_by")
    private LocalDateTime responseBy;

    @Column(name = "tx_agreement_status", length = 140)
    @ColumnDefault("'First Response Due'")
    private String agreementStatus;

    @Column(name = "dtt_resolution_by")
    private LocalDateTime resolutionBy;

    @Column(name = "dtt_service_level_agreement_creation")
    private LocalDateTime serviceLevelAgreementCreation;

    @Column(name = "dtt_on_hold_since")
    private LocalDateTime onHoldSince;

    @Column(name = "flt_total_hold_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalHoldTime;

    @Column(name = "flt_first_response_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal firstResponseTime;

    @Column(name = "dtt_first_responded_on")
    private LocalDateTime firstRespondedOn;

    @Column(name = "flt_avg_response_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal avgResponseTime;

    @Column(name = "tx_resolution_details", columnDefinition = "longtext")
    private String resolutionDetails;

    @Column(name = "dt_opening_date")
    private LocalDate openingDate;

    @Column(name = "tt_opening_time")
    private LocalTime openingTime;

    @Column(name = "dtt_resolution_date")
    private LocalDateTime resolutionDate;

    @Column(name = "flt_resolution_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal resolutionTime;

    @Column(name = "flt_user_resolution_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal userResolutionTime;

    @Column(name = "tx_lead", length = 140)
    private String lead;

    @Column(name = "tx_contact", length = 140)
    private String contact;

    @Column(name = "tx_email_account", length = 140)
    private String emailAccount;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "is_via_customer_portal", nullable = false)
    @ColumnDefault("0")
    private Boolean viaCustomerPortal;

    @Column(name = "tx_attachment", columnDefinition = "text")
    private String attachment;

    @Column(name = "tx_content_type", length = 140)
    private String contentType;

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
