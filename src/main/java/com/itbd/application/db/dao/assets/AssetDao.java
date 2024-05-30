package com.itbd.application.db.dao.aaa.assets;


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
@Table(name = "t_asset", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AssetDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_asset_owner", length = 140)
    private String assetOwner;

    @Column(name = "tx_asset_owner_company", length = 140)
    private String assetOwnerCompany;

    @Column(name = "is_existing_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean isExistingAsset;

    @Column(name = "ct_is_composite_asset", nullable = false)
    private Integer isCompositeAsset;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_journal_entry_for_scrap", length = 140)
    private String journalEntryForScrap;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_asset_name", length = 140)
    private String assetName;

    @Column(name = "tx_asset_category", length = 140)
    private String assetCategory;

    @Column(name = "tx_location", length = 140)
    private String location;

    @Column(name = "tx_split_from", length = 140)
    private String splitFrom;

    @Column(name = "tx_custodian", length = 140)
    private String custodian;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "dt_disposalDate")
    private LocalDate disposalDate;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_purchase_receipt", length = 140)
    private String purchaseReceipt;

    @Column(name = "tx_purchase_invoice", length = 140)
    private String purchaseInvoice;

    @Column(name = "dt_availableForUseDate")
    private LocalDate availableForUseDate;

    @Column(name = "flt_total_asset_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAssetCost;

    @Column(name = "flt_additional_asset_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalAssetCost;

    @Column(name = "flt_gross_purchase_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grossPurchaseAmount;

    @Column(name = "ct_asset_quantity", nullable = false)
    private Integer assetQuantity;

    @Column(name = "dt_purchaseDate")
    private LocalDate purchaseDate;

    @Column(name = "is_calculate_depreciation", nullable = false)
    private Boolean calculateDepreciation;

    @Column(name = "flt_opening_accumulated_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal openingAccumulatedDepreciation;

    @Column(name = "ct_number_of_depreciation_booked", nullable = false)
    private Integer numberOfDepreciationBooked;

    @Column(name = "is_fully_depreciated", nullable = false)
    @ColumnDefault("0")
    private Boolean isFullyDepreciated;

    @Column(name = "tx_depreciation_method", length = 140)
    private String depreciationMethod;

    @Column(name = "flt_value_after_depreciation", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valueAfterDepreciation;

    @Column(name = "ct_total_number_of_depreciation", nullable = false)
    private Integer totalNumberOfDepreciation;

    @Column(name = "ct_frequency_of_depreciation", nullable = false)
    private Integer frequencyOfDepreciation;

    @Column(name = "dt_nextDepreciationDate")
    private LocalDate nextDepreciationDate;

    @Column(name = "tx_policy_number", length = 140)
    private String policyNumber;

    @Column(name = "tx_insurer", length = 140)
    private String insurer;

    @Column(name = "tx_insured_value", length = 140)
    private String insuredValue;

    @Column(name = "dt_insuranceStartDate")
    private LocalDate insuranceStartDate;

    @Column(name = "dt_insuranceEndDate")
    private LocalDate insuranceEndDate;

    @Column(name = "tx_comprehensive_insurance", length = 140)
    private String comprehensiveInsurance;

    @Column(name = "is_maintenance_required", nullable = false)
    @ColumnDefault("0")
    private Boolean maintenanceRequired;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "is_booked_fixed_asset", nullable = false)
    @ColumnDefault("0")
    private Boolean bookedFixedAsset;

    @Column(name = "flt_purchase_receipt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal purchaseReceiptAmount;

    @Column(name = "tx_default_finance_book", length = 140)
    private String defaultFinanceBook;

    @Column(name = "tx_depr_entry_posting_status", length = 140)
    private String deprEntryPostingStatus;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_capitalized_in", length = 140)
    private String capitalizedIn;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
