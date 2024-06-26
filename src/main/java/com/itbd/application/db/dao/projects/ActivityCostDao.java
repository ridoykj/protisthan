package com.itbd.application.db.dao.projects;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_activity_cost", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ActivityCostDao {

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

    @Column(name = "tx_activityType", length = 140)
    private String activityType;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_employeeName", length = 140)
    private String employeeName;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "flt_billingRate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal billingRate;

    @Column(name = "flt_costingRate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal costingRate;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
