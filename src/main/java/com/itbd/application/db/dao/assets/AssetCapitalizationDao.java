package com.itbd.application.db.dao.aaa.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_capitalization", indexes = {
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetCapitalizationDao {

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

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_entry_type", length = 140)
    @ColumnDefault("'Capitalization'")
    private String entryType;

    @Column(name = "tx_target_item_name", length = 140)
    private String targetItemName;

    @Column(name = "is_target_is_fixed_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean targetIsFixedAsset;

    @Column(name = "is_target_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean targetHasBatchNo;

    @Column(name = "is_target_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean targetHasSerialNo;

    @Column(name = "tx_capitalization_method", length = 140)
    private String capitalizationMethod;

    @Column(name = "tx_target_item_code", length = 140)
    private String targetItemCode;

    @Column(name = "tx_target_asset_location", length = 140)
    private String targetAssetLocation;

    @Column(name = "tx_target_asset", length = 140)
    private String targetAsset;

    @Column(name = "tx_target_asset_name", length = 140)
    private String targetAssetName;

    @Column(name = "tx_target_warehouse", length = 140)
    private String targetWarehouse;

    @Column(name = "flt_target_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal targetQty;

    @Column(name = "tx_target_stock_uom", length = 140)
    private String targetStockUom;

    @Column(name = "tx_target_batch_no", length = 140)
    private String targetBatchNo;

    @Column(name = "tx_target_serial_no", columnDefinition = "text")
    private String targetSerialNo;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "is_set_posting_time", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingTime;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "flt_stock_items_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockItemsTotal;

    @Column(name = "flt_asset_items_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal assetItemsTotal;

    @Column(name = "flt_service_items_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal serviceItemsTotal;

    @Column(name = "flt_total_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalValue;

    @Column(name = "flt_target_incoming_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal targetIncomingRate;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_target_fixed_asset_account", length = 140)
    private String targetFixedAssetAccount;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
