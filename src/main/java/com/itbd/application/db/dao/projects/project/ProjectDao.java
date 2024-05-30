package com.itbd.application.db.dao.projects.project;


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
@Table(name = "t_project", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_customer", columnList = "tx_customer"),
        @Index(name = "idx_collect_progress", columnList = "ct_collect_progress"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_project_name", columnNames = {"tx_project_name"})
})
public class ProjectDao {

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

    @Column(name = "tx_project_name", unique = true, length = 140)
    private String projectName;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_project_type", length = 140)
    private String projectType;

    @Column(name = "tx_is_active", length = 140)
    private String isActive;

    @Column(name = "tx_percent_complete_method", length = 140)
    @ColumnDefault("'Task_Completion'")
    private String percentCompleteMethod;

    @Column(name = "flt_percent_complete", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal percentComplete;

    @Column(name = "tx_project_template", length = 140)
    private String projectTemplate;

    @Column(name = "dt_expectedStartDate")
    private LocalDate expectedStartDate;

    @Column(name = "dt_expectedEndDate")
    private LocalDate expectedEndDate;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_sales_order", length = 140)
    private String salesOrder;

    @Column(name = "tx_copied_from", length = 140)
    private String copiedFrom;

    @Column(name = "tx_notes", columnDefinition = "longtext")
    private String notes;

    @Column(name = "dt_actualStartDate")
    private LocalDate actualStartDate;

    @Column(name = "flt_actual_time", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualTime;

    @Column(name = "dt_actualEndDate")
    private LocalDate actualEndDate;

    @Column(name = "flt_estimated_costing", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal estimatedCosting;

    @Column(name = "flt_total_costing_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCostingAmount;

    @Column(name = "flt_total_purchase_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalPurchaseCost;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_total_sales_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalSalesAmount;

    @Column(name = "flt_total_billable_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBillableAmount;

    @Column(name = "flt_total_billed_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalBilledAmount;

    @Column(name = "flt_total_consumed_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalConsumedMaterialCost;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "flt_gross_margin", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grossMargin;

    @Column(name = "flt_per_gross_margin", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perGrossMargin;

    @Column(name = "ct_collect_progress", nullable = false)
    private Integer collectProgress;

    @Column(name = "tx_holiday_list", length = 140)
    private String holidayList;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "tt_from_time")
    private LocalTime fromTime;

    @Column(name = "tt_to_time")
    private LocalTime toTime;

    @Column(name = "tt_first_email")
    private LocalTime firstEmail;

    @Column(name = "tt_second_email")
    private LocalTime secondEmail;

    @Column(name = "tt_daily_time_to_send")
    private LocalTime dailyTimeToSend;

    @Column(name = "tx_day_to_send", length = 140)
    private String dayToSend;

    @Column(name = "tt_weekly_time_to_send")
    private LocalTime weeklyTimeToSend;

    @Column(name = "tx_message", columnDefinition = "text")
    private String message;

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
