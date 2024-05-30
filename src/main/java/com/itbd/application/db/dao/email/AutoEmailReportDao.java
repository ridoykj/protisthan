package com.itbd.application.db.dao.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_auto_email_report", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AutoEmailReportDao {

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

    @Column(name = "tx_report", length = 140)
    private String report;

    @Column(name = "tx_user", length = 140)
    @ColumnDefault("'User'")
    private String user;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_report_type", length = 140)
    private String reportType;

    @Column(name = "tx_reference_report", length = 140)
    private String referenceReport;

    @Column(name = "is_send_if_data", nullable = false)
    @ColumnDefault("1")
    private Boolean sendIfData;

    @Column(name = "ct_data_modified_till", nullable = false)
    private Integer dataModifiedTill;

    @Column(name = "ct_no_of_rows", nullable = false)
    @ColumnDefault("100")
    private Integer noOfRows;

    @Column(name = "tx_filters", columnDefinition = "text")
    private String filters;

    @Column(name = "tx_filter_meta", columnDefinition = "text")
    private String filterMeta;

    @Column(name = "tx_from_date_field", length = 140)
    private String fromDateField;

    @Column(name = "tx_to_date_field", length = 140)
    private String toDateField;

    @Column(name = "tx_dynamic_date_period", length = 140)
    private String dynamicDatePeriod;

    @Column(name = "is_use_first_day_of_period", nullable = false)
    @ColumnDefault("0")
    private Boolean useFirstDayOfPeriod;

    @Column(name = "tx_email_to", columnDefinition = "text")
    private String emailTo;

    @Column(name = "tx_day_of_week", length = 140)
    @ColumnDefault("'Monday'")
    private String dayOfWeek;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "tx_format", length = 140)
    private String format;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
