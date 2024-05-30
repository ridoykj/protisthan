package com.itbd.application.db.dao.stock.stock;


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
@Table(name = "t_stock_entry", indexes = {
        @Index(name = "idx_stock_entry_type", columnList = "tx_stock_entry_type"),
        @Index(name = "idx_purpose", columnList = "tx_purpose"),
        @Index(name = "idx_work_order", columnList = "tx_work_order"),
        @Index(name = "idx_delivery_note_no", columnList = "tx_delivery_note_no"),
        @Index(name = "idx_pick_list", columnList = "tx_pick_list"),
        @Index(name = "idx_purchase_receipt_no", columnList = "tx_purchase_receipt_no"),
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_job_card", columnList = "tx_job_card"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class StockEntryDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_stock_entry_type", length = 140)
    private String stockEntryType;

    @Column(name = "tx_outgoing_stock_entry", length = 140)
    private String outgoingStockEntry;

    @Column(name = "tx_purpose", length = 140)
    private String purpose;

    @Column(name = "is_add_to_transit", nullable = false)
    @ColumnDefault("0")
    private Boolean addToTransit;

    @Column(name = "tx_work_order", length = 140)
    private String workOrder;

    @Column(name = "tx_purchase_order", length = 140)
    private String purchaseOrder;

    @Column(name = "tx_subcontracting_order", length = 140)
    private String subcontractingOrder;

    @Column(name = "tx_delivery_note_no", length = 140)
    private String deliveryNoteNo;

    @Column(name = "tx_sales_invoice_no", length = 140)
    private String salesInvoiceNo;

    @Column(name = "tx_pick_list", length = 140)
    private String pickList;

    @Column(name = "tx_purchase_receipt_no", length = 140)
    private String purchaseReceiptNo;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "is_set_posting_time", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingTime;

    @Column(name = "is_inspection_required", nullable = false)
    @ColumnDefault("0")
    private Boolean inspectionRequired;

    @Column(name = "is_apply_putaway_rule", nullable = false)
    @ColumnDefault("0")
    private Boolean applyPutawayRule;

    @Column(name = "is_from_bom", nullable = false)
    @ColumnDefault("0")
    private Boolean fromBom;

    @Column(name = "is_use_multi_level_bom", nullable = false)
    @ColumnDefault("1")
    private Boolean useMultiLevelBom;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "flt_fg_completed_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal fgCompletedQty;

    @Column(name = "flt_process_loss_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossPercentage;

    @Column(name = "flt_process_loss_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal processLossQty;

    @Column(name = "tx_from_warehouse", length = 140)
    private String fromWarehouse;

    @Column(name = "tx_source_warehouse_address", length = 140)
    private String sourceWarehouseAddress;

    @Column(name = "tx_source_address_display", columnDefinition = "text")
    private String sourceAddressDisplay;

    @Column(name = "tx_to_warehouse", length = 140)
    private String toWarehouse;

    @Column(name = "tx_target_warehouse_address", length = 140)
    private String targetWarehouseAddress;

    @Column(name = "tx_target_address_display", columnDefinition = "text")
    private String targetAddressDisplay;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "flt_total_outgoing_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalOutgoingValue;

    @Column(name = "flt_total_incoming_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalIncomingValue;

    @Column(name = "flt_value_difference", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valueDifference;

    @Column(name = "flt_total_additional_costs", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAdditionalCosts;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_supplier_name", length = 140)
    private String supplierName;

    @Column(name = "tx_supplier_address", length = 140)
    private String supplierAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_is_opening", length = 140)
    private String isOpening;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "flt_per_transferred", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perTransferred;

    @Column(name = "flt_total_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAmount;

    @Column(name = "tx_job_card", length = 140)
    private String jobCard;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_credit_note", length = 140)
    private String creditNote;

    @Column(name = "is_return", nullable = false)
    @ColumnDefault("0")
    private Boolean isReturn;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
