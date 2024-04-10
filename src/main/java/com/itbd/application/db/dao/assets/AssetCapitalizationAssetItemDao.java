package com.itbd.application.db.dao.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_capitalization_asset_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AssetCapitalizationAssetItemDao {

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

    @Column(name = "tx_asset_name", length = 140)
    private String assetName;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "flt_current_asset_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentAssetValue;

    @Column(name = "flt_asset_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal assetValue;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_fixed_asset_account", length = 140)
    private String fixedAssetAccount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
