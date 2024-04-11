package com.itbd.application.db.dao.stocks;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_stock_entry_detail", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_actual_qty", columnList = "flt_actual_qty"),
        @Index(name = "idx_material_request", columnList = "tx_material_request"),
        @Index(name = "idx_job_card_item", columnList = "tx_job_card_item"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class StockEntryDetailDao {

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

    @Column(name = "tx_barcode", length = 140)
    private String barcode;

    @Column(name = "is_has_item_scanned", nullable = false)
    @ColumnDefault("0")
    private Boolean hasItemScanned;

    @Column(name = "tx_s_warehouse", length = 140)
    private String sWarehouse;

    @Column(name = "tx_t_warehouse", length = 140)
    private String tWarehouse;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "is_finished_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isFinishedItem;

    @Column(name = "is_scrap_item", nullable = false)
    @ColumnDefault("0")
    private Boolean isScrapItem;

    @Column(name = "tx_quality_inspection", length = 140)
    private String qualityInspection;

    @Column(name = "tx_subcontracted_item", length = 140)
    private String subcontractedItem;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "flt_transfer_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal transferQty;

    @Column(name = "is_retain_sample", nullable = false)
    @ColumnDefault("0")
    private Boolean retainSample;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "ct_sample_quantity", nullable = false)
    private Integer sampleQuantity;

    @Column(name = "flt_basic_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basicRate;

    @Column(name = "flt_additional_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalCost;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "is_allow_zero_valuation_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean allowZeroValuationRate;

    @Column(name = "is_set_basic_rate_manually", nullable = false)
    @ColumnDefault("0")
    private Boolean setBasicRateManually;

    @Column(name = "flt_basic_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basicAmount;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "is_use_serial_batch_fields", nullable = false)
    @ColumnDefault("0")
    private Boolean useSerialBatchFields;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "tx_serial_no", columnDefinition = "text")
    private String serialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_transferred_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal transferredQty;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "is_allow_alternative_item", nullable = false)
    @ColumnDefault("0")
    private Boolean allowAlternativeItem;

    @Column(name = "tx_material_request", length = 140)
    private String materialRequest;

    @Column(name = "tx_material_request_item", length = 140)
    private String materialRequestItem;

    @Column(name = "tx_original_item", length = 140)
    private String originalItem;

    @Column(name = "tx_against_stock_entry", length = 140)
    private String againstStockEntry;

    @Column(name = "tx_ste_detail", length = 140)
    private String steDetail;

    @Column(name = "tx_po_detail", length = 140)
    private String poDetail;

    @Column(name = "tx_sco_rm_detail", length = 140)
    private String scoRmDetail;

    @Column(name = "tx_putaway_rule", length = 140)
    private String putawayRule;

    @Column(name = "tx_reference_purchase_receipt", length = 140)
    private String referencePurchaseReceipt;

    @Column(name = "tx_job_card_item", length = 140)
    private String jobCardItem;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
