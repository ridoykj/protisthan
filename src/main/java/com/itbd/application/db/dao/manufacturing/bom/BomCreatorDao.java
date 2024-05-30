package com.itbd.application.db.dao.manufacturing.bom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_creator", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class BomCreatorDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "tx_rm_cost_as_per", length = 140)
    @ColumnDefault("'Valuation Rate'")
    private String rmCostAsPer;

    @Column(name = "is_set_rate_based_on_warehouse", nullable = false)
    @ColumnDefault("0")
    private Boolean setRateBasedOnWarehouse;

    @Column(name = "tx_buying_price_list", length = 140)
    private String buyingPriceList;

    @Column(name = "tx_price_list_currency", length = 140)
    private String priceListCurrency;

    @Column(name = "flt_plc_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal plcConversionRate;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal conversionRate;

    @Column(name = "tx_default_warehouse", length = 140)
    private String defaultWarehouse;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_raw_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rawMaterialCost;

    @Column(name = "tx_remarks", columnDefinition = "longtext")
    private String remarks;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_error_log", columnDefinition = "text")
    private String errorLog;

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
