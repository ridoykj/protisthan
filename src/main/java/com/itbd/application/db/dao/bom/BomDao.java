package com.itbd.application.db.dao.bom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom", indexes = {
        @Index(name = "idx_item", columnList = "tx_item"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class BomDao {

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

    @Column(name = "tx_item", length = 140)
    private String item;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_quantity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal quantity;

    @Column(name = "is_active", nullable = false)
    @ColumnDefault("1")
    private Boolean isActive;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("1")
    private Boolean isDefault;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "is_set_rate_of_sub_assembly_item_based_on_bom", nullable = false)
    @ColumnDefault("1")
    private Boolean setRateOfSubAssemblyItemBasedOnBom;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_rm_cost_as_per", length = 140)
    @ColumnDefault("'Valuation_Rate'")
    private String rmCostAsPer;

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

    @Column(name = "is_with_operations", nullable = false)
    @ColumnDefault("0")
    private Boolean withOperations;

    @Column(name = "tx_transfer_material_against", length = 140)
    @ColumnDefault("'Work Order'")
    private String transferMaterialAgainst;

    @Column(name = "tx_routing", length = 140)
    private String routing;

    @Column(name = "is_fg_based_operating_cost", nullable = false)
    @ColumnDefault("0")
    private Boolean fgBasedOperatingCost;

    @Column(name = "flt_operating_cost_per_bom_quantity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal operatingCostPerBomQuantity;

    @Column(name = "flt_process_loss_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossPercentage;

    @Column(name = "flt_process_loss_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossQty;

    @Column(name = "flt_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal operatingCost;

    @Column(name = "flt_raw_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rawMaterialCost;

    @Column(name = "flt_scrap_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal scrapMaterialCost;

    @Column(name = "flt_base_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseOperatingCost;

    @Column(name = "flt_base_raw_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseRawMaterialCost;

    @Column(name = "flt_base_scrap_material_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseScrapMaterialCost;

    @Column(name = "flt_total_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCost;

    @Column(name = "flt_base_total_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalCost;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "is_has_variants", nullable = false)
    @ColumnDefault("0")
    private Boolean hasVariants;

    @Column(name = "is_inspection_required", nullable = false)
    @ColumnDefault("0")
    private Boolean inspectionRequired;

    @Column(name = "tx_quality_inspection_template", length = 140)
    private String qualityInspectionTemplate;

    @Column(name = "is_show_in_website", nullable = false)
    @ColumnDefault("0")
    private Boolean showInWebsite;

    @Column(name = "tx_route", columnDefinition = "text")
    private String route;

    @Column(name = "tx_website_image", columnDefinition = "text")
    private String websiteImage;

    @Column(name = "tx_thumbnail", length = 140)
    private String thumbnail;

    @Column(name = "is_show_items", nullable = false)
    @ColumnDefault("0")
    private Boolean showItems;

    @Column(name = "is_show_operations", nullable = false)
    @ColumnDefault("0")
    private Boolean showOperations;

    @Column(name = "tx_web_long_description", columnDefinition = "longtext")
    private String webLongDescription;

    @Column(name = "tx_bom_creator", length = 140)
    private String bomCreator;

    @Column(name = "tx_bom_creator_item", length = 140)
    private String bomCreatorItem;

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
