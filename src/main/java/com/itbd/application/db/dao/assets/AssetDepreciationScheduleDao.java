package com.itbd.application.db.dao.aaa.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_depreciation_schedule", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetDepreciationScheduleDao {

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

    @Column(name = "tx_asset", length = 140)
    private String asset;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_gross_purchase_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grossPurchaseAmount;

    @Column(name = "flt_opening_accumulated_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal openingAccumulatedDepreciation;

    @Column(name = "ct_number_of_depreciation_booked", nullable = false)
    private Integer numberOfDepreciationBooked;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "ct_finance_book_id", nullable = false)
    private Integer financeBookId;

    @Column(name = "tx_depreciation_method", length = 140)
    private String depreciationMethod;

    @Column(name = "ct_total_number_of_depreciation", nullable = false)
    private Integer totalNumberOfDepreciation;

    @Column(name = "flt_rate_of_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rateOfDepreciation;

    @Column(name = "is_daily_prorata_based", nullable = false)
    @ColumnDefault("0")
    private Boolean dailyProrataBased;

    @Column(name = "is_shift_based", nullable = false)
    @ColumnDefault("0")
    private Boolean shiftBased;

    @Column(name = "ct_frequency_of_depreciation", nullable = false)
    private Integer frequencyOfDepreciation;

    @Column(name = "flt_expected_value_after_useful_life", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal expectedValueAfterUsefulLife;

    @Column(name = "tx_notes", columnDefinition = "text")
    private String notes;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
