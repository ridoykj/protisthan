package com.itbd.application.db.dao.buying.supplier;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_supplier_scorecard_scoring_standing", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SupplierScorecardScoringStandingDao {

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

    @Column(name = "tx_standing_name", length = 140)
    private String standingName;

    @Column(name = "tx_standing_color", length = 140)
    private String standingColor;

    @Column(name = "flt_min_grade", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minGrade;

    @Column(name = "flt_max_grade", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxGrade;

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

    @Column(name = "tx_employee_link", length = 140)
    private String employeeLink;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
