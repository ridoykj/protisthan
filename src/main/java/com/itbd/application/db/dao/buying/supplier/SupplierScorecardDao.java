package com.itbd.application.db.dao.buying.supplier;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_supplier_scorecard", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class SupplierScorecardDao {

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

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_supplier_score", length = 140)
    private String supplierScore;

    @Column(name = "tx_indicator_color", length = 140)
    private String indicatorColor;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_period", length = 140)
    @ColumnDefault("'Per Month'")
    private String period;

    @Column(name = "tx_weighting_function", columnDefinition = "text")
    @ColumnDefault("'{total_score} * max( 0, min ( 1 , (12 - {period_number}) / 12) )'")
    private String weightingFunction;

    @Column(name = "is_warn_rfqs", nullable = false)
    @ColumnDefault("0")
    private Boolean warnRfqs;

    @Column(name = "is_warn_pos", nullable = false)
    @ColumnDefault("0")
    private Boolean warnPos;

    @Column(name = "is_prevent_rfqs", nullable = false)
    @ColumnDefault("0")
    private Boolean preventRfqs;

    @Column(name = "is_prevent_pos", nullable = false)
    @ColumnDefault("0")
    private Boolean preventPos;

    @Column(name = "is_notify_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean notifySupplier;

    @Column(name = "ct_notify_employee", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyEmployee;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
