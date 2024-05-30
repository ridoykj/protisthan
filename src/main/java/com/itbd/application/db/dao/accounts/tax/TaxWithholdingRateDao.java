package com.itbd.application.db.dao.accounts.tax;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_tax_withholding_rate", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class TaxWithholdingRateDao {

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

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "flt_tax_withholding_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxWithholdingRate;

    @Column(name = "flt_single_threshold", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal singleThreshold;

    @Column(name = "flt_cumulative_threshold", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal cumulativeThreshold;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
