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
@Table(name = "t_timesheet", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class TimesheetDao {

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

    @Column(name = "tx_title", length = 140)
    @ColumnDefault("'{employee_name}'")
    private String title;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal exchangeRate;

    @Column(name = "tx_sales_invoice", length = 140)
    private String salesInvoice;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_parent_project", length = 140)
    private String parentProject;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_employee_name", length = 140)
    private String employeeName;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "flt_total_hours", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalHours;

    @Column(name = "flt_total_billable_hours", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBillableHours;

    @Column(name = "flt_base_total_billable_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalBillableAmount;

    @Column(name = "flt_base_total_billed_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalBilledAmount;

    @Column(name = "flt_base_total_costing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalCostingAmount;

    @Column(name = "flt_total_billed_hours", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBilledHours;

    @Column(name = "flt_total_billable_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBillableAmount;

    @Column(name = "flt_total_billed_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBilledAmount;

    @Column(name = "flt_total_costing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCostingAmount;

    @Column(name = "flt_per_billed", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perBilled;

    @Column(name = "tx_note", columnDefinition = "longtext")
    private String note;

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
