package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_dashboard", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_dashboard_name", columnNames = {"tx_dashboard_name"})
})
public class DashboardDao {

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

    @Column(name = "tx_dashboard_name", unique = true, length = 140)
    private String dashboardName;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean isStandard;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_chart_options", columnDefinition = "longtext")
    private String chartOptions;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
