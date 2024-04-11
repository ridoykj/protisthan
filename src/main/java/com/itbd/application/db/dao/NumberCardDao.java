package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_number_card", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class NumberCardDao {

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

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_report_name", length = 140)
    private String reportName;

    @Column(name = "tx_method", length = 140)
    private String method;

    @Column(name = "tx_function", length = 140)
    private String function;

    @Column(name = "tx_aggregate_function_based_on", length = 140)
    private String aggregateFunctionBasedOn;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_parent_document_type", length = 140)
    private String parentDocumentType;

    @Column(name = "tx_report_field", length = 140)
    private String reportField;

    @Column(name = "tx_report_function", length = 140)
    private String reportFunction;

    @Column(name = "is_public", nullable = false)
    @ColumnDefault("0")
    private Boolean isPublic;

    @Column(name = "tx_filters_config", columnDefinition = "longtext")
    private String filtersConfig;

    @Column(name = "is_show_percentage_stats", nullable = false)
    @ColumnDefault("1")
    private Boolean showPercentageStats;

    @Column(name = "tx_stats_time_interval", length = 140)
    @ColumnDefault("'Daily'")
    private String statsTimeInterval;

    @Column(name = "tx_filters_json", columnDefinition = "longtext")
    private String filtersJson;

    @Column(name = "tx_dynamic_filters_json", columnDefinition = "longtext")
    private String dynamicFiltersJson;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
