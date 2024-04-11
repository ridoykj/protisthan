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
@Table(name = "t_asset_value_adjustment", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetValueAdjustmentDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_asset", length = 140)
    private String asset;

    @Column(name = "tx_asset_category", length = 140)
    private String assetCategory;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "flt_current_asset_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentAssetValue;

    @Column(name = "flt_new_asset_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal newAssetValue;

    @Column(name = "flt_difference_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal differenceAmount;

    @Column(name = "tx_journal_entry", length = 140)
    private String journalEntry;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
