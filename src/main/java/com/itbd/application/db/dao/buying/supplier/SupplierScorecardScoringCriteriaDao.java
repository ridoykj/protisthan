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
@Table(name = "t_supplier_scorecard_scoring_criteria", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SupplierScorecardScoringCriteriaDao {

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

    @Column(name = "tx_criteria_name", length = 140)
    private String criteriaName;

    @Column(name = "flt_score", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal score;

    @Column(name = "flt_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal weight;

    @Column(name = "flt_max_score", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("100.0")
    private BigDecimal maxScore;

    @Column(name = "tx_formula", columnDefinition = "text")
    private String formula;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
