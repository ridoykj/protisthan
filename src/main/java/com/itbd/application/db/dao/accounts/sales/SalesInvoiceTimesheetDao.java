package com.itbd.application.db.dao.accounts.sales;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_sales_invoice_timesheet", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SalesInvoiceTimesheetDao {

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

    @Column(name = "tx_activity_type", length = 140)
    private String activityType;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "dtt_from_time")
    private LocalDateTime fromTime;

    @Column(name = "dtt_to_time")
    private LocalDateTime toTime;

    @Column(name = "flt_billing_hours", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billingHours;

    @Column(name = "flt_billing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billingAmount;

    @Column(name = "tx_time_sheet", length = 140)
    private String timeSheet;

    @Column(name = "tx_timesheet_detail", length = 140)
    private String timesheetDetail;

    @Column(name = "tx_project_name", length = 140)
    private String projectName;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
