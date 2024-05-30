package com.itbd.application.db.dao.support;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_warranty_claim", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_complaint_date", columnList = "dt_complaint_date"),
        @Index(name = "idx_customer", columnList = "tx_customer"),
        @Index(name = "idx_serial_no", columnList = "tx_serial_no"),
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_warranty_amc_status", columnList = "tx_warranty_amc_status"),
        @Index(name = "idx_resolution_date", columnList = "dtt_resolution_date"),
        @Index(name = "idx_resolved_by", columnList = "tx_resolved_by"),
        @Index(name = "idx_territory", columnList = "tx_territory"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class WarrantyClaimDao {

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

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "dt_complaint_date")
    private LocalDate complaintDate;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_serial_no", length = 140)
    private String serialNo;

    @Column(name = "tx_complaint", columnDefinition = "longtext")
    private String complaint;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_warranty_amc_status", length = 140)
    private String warrantyAmcStatus;

    @Column(name = "dt_warranty_expiry_date")
    private LocalDate warrantyExpiryDate;

    @Column(name = "dt_amc_expiry_date")
    private LocalDate amcExpiryDate;

    @Column(name = "dtt_resolution_date")
    private LocalDateTime resolutionDate;

    @Column(name = "tx_resolved_by", length = 140)
    private String resolvedBy;

    @Column(name = "tx_resolution_details", columnDefinition = "text")
    private String resolutionDetails;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_contact_mobile", length = 140)
    private String contactMobile;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_service_address", columnDefinition = "text")
    private String serviceAddress;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_complaint_raised_by", length = 140)
    private String complaintRaisedBy;

    @Column(name = "tx_from_company", length = 140)
    private String fromCompany;

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
