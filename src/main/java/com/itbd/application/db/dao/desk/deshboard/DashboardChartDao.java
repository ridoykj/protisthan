package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_dashboard_chart", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_chart_name", columnNames = {"tx_chart_name"})
})
public class DashboardChartDao {

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

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean isStandard;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_chart_name", unique = true, length = 140)
    private String chartName;

    @Column(name = "tx_chart_type", length = 140)
    private String chartType;

    @Column(name = "tx_report_name", length = 140)
    private String reportName;

    @Column(name = "is_use_report_chart", nullable = false)
    @ColumnDefault("0")
    private Boolean useReportChart;

    @Column(name = "tx_x_field", length = 140)
    private String xField;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_parent_document_type", length = 140)
    private String parentDocumentType;

    @Column(name = "tx_based_on", length = 140)
    private String basedOn;

    @Column(name = "tx_value_based_on", length = 140)
    private String valueBasedOn;

    @Column(name = "tx_group_by_type", length = 140)
    @ColumnDefault("'Count'")
    private String groupByType;

    @Column(name = "tx_group_by_based_on", length = 140)
    private String groupByBasedOn;

    @Column(name = "tx_aggregate_function_based_on", length = 140)
    private String aggregateFunctionBasedOn;

    @Column(name = "ct_number_of_groups", nullable = false)
    private Integer numberOfGroups;

    @Column(name = "is_public", nullable = false)
    @ColumnDefault("0")
    private Boolean isPublic;

    @Column(name = "tx_heatmap_year", length = 140)
    private String heatmapYear;

    @Column(name = "tx_timespan", length = 140)
    private String timespan;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "tx_time_interval", length = 140)
    private String timeInterval;

    @Column(name = "is_timeseries", nullable = false)
    @ColumnDefault("0")
    private Boolean timeseries;

    @Column(name = "tx_type", length = 140)
    @ColumnDefault("'Line'")
    private String type;

    @Column(name = "tx_filters_json", columnDefinition = "longtext")
    private String filtersJson;

    @Column(name = "tx_dynamic_filters_json", columnDefinition = "longtext")
    private String dynamicFiltersJson;

    @Column(name = "tx_custom_options", columnDefinition = "longtext")
    private String customOptions;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "dtt_last_synced_on")
    private LocalDateTime lastSyncedOn;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
