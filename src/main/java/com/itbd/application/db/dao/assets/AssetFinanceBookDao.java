package com.itbd.application.db.dao.assets;


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
@Table(name = "t_asset_finance_book", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AssetFinanceBookDao {

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

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_depreciation_method", length = 140)
    private String depreciationMethod;

    @Column(name = "ct_total_number_of_depreciation", nullable = false)
    private Integer totalNumberOfDepreciation;

    @Column(name = "is_daily_prorata_based", nullable = false)
    @ColumnDefault("0")
    private Boolean dailyProrataBased;

    @Column(name = "is_shift_based", nullable = false)
    @ColumnDefault("0")
    private Boolean shiftBased;

    @Column(name = "ct_frequency_of_depreciation", nullable = false)
    private Integer frequencyOfDepreciation;

    @Column(name = "dt_depreciationStartDate")
    private LocalDate depreciationStartDate;

    @Column(name = "flt_salvage_value_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal salvageValuePercentage;

    @Column(name = "flt_expected_value_after_useful_life", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal expectedValueAfterUsefulLife;

    @Column(name = "flt_value_after_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valueAfterDepreciation;

    @Column(name = "flt_rate_of_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rateOfDepreciation;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
