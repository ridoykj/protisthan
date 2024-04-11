package com.itbd.application.db.dao.materials;


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
@Table(name = "t_material_request", indexes = {
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_transaction_date", columnList = "dt_transaction_date"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class MaterialRequestDao {

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

    @Column(name = "tx_title", length = 140)
    @ColumnDefault("'{material_request_type}'")
    private String title;

    @Column(name = "tx_material_request_type", length = 140)
    private String materialRequestType;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "tx_set_from_warehouse", length = 140)
    private String setFromWarehouse;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "flt_per_ordered", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perOrdered;

    @Column(name = "tx_transfer_status", length = 140)
    private String transferStatus;

    @Column(name = "flt_per_received", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perReceived;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_job_card", length = 140)
    private String jobCard;

    @Column(name = "tx_work_order", length = 140)
    private String workOrder;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
