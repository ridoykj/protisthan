package com.itbd.application.db.dao.maintenance;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_maintenance_schedule", indexes = {
        @Index(name = "idx_customer", columnList = "tx_customer"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class MaintenanceScheduleDao {

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

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_mobile", length = 140)
    private String contactMobile;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_company", length = 140)
    private String company;

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
