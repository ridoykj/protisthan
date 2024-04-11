package com.itbd.application.db.dao.qualitys;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_quality_inspection_reading", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class QualityInspectionReadingDao {

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

    @Column(name = "tx_specification", length = 140)
    private String specification;

    @Column(name = "tx_parameter_group", length = 140)
    private String parameterGroup;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Accepted'")
    private String status;

    @Column(name = "tx_value", length = 140)
    private String value;

    @Column(name = "is_numeric", nullable = false)
    @ColumnDefault("1")
    private Boolean numeric;

    @Column(name = "is_manual_inspection", nullable = false)
    @ColumnDefault("0")
    private Boolean manualInspection;

    @Column(name = "flt_min_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minValue;

    @Column(name = "flt_max_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxValue;

    @Column(name = "is_formula_based_criteria", nullable = false)
    @ColumnDefault("0")
    private Boolean formulaBasedCriteria;

    @Column(name = "tx_acceptance_formula", columnDefinition = "longtext")
    private String acceptanceFormula;

    @Column(name = "tx_reading_value", length = 140)
    private String readingValue;

    @Column(name = "tx_reading1", length = 140)
    private String reading1;

    @Column(name = "tx_reading2", length = 140)
    private String reading2;

    @Column(name = "tx_reading3", length = 140)
    private String reading3;

    @Column(name = "tx_reading4", length = 140)
    private String reading4;

    @Column(name = "tx_reading5", length = 140)
    private String reading5;

    @Column(name = "tx_reading6", length = 140)
    private String reading6;

    @Column(name = "tx_reading7", length = 140)
    private String reading7;

    @Column(name = "tx_reading8", length = 140)
    private String reading8;

    @Column(name = "tx_reading9", length = 140)
    private String reading9;

    @Column(name = "tx_reading10", length = 140)
    private String reading10;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
