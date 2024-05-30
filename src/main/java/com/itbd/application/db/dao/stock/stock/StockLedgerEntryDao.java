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
@Table(name = "t_stock_ledger_entry", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_voucher_detail_no", columnList = "tx_voucher_detail_no"),
        @Index(name = "idx_serial_and_batch_bundle", columnList = "tx_serial_and_batch_bundle"),
        @Index(name = "idx_to_rename", columnList = "is_to_rename"),
        @Index(name = "idx_voucher_no_voucher_type_index", columnList = "tx_voucher_no, tx_voucher_type"),
        @Index(name = "idx_batch_no_item_code_warehouse_index", columnList = "tx_batch_no, tx_item_code, tx_warehouse"),
        @Index(name = "idx_item_warehouse", columnList = "tx_warehouse, tx_item_code"),
        @Index(name = "idx_posting_datetime_creation_index", columnList = "dtt_posting_datetime, dtt_creation"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class StockLedgerEntryDao {

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

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "dtt_posting_datetime")
    private LocalDateTime postingDatetime;

    @Column(name = "is_adjustment_entry", nullable = false)
    @ColumnDefault("0")
    private Boolean isAdjustmentEntry;

    @Column(name = "is_auto_created_serial_and_batch_bundle", nullable = false)
    @ColumnDefault("0")
    private Boolean autoCreatedSerialAndBatchBundle;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_voucher_detail_no", length = 140)
    private String voucherDetailNo;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "tx_dependant_sle_voucher_detail_no", length = 140)
    private String dependantSleVoucherDetailNo;

    @Column(name = "is_recalculate_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean recalculateRate;

    @Column(name = "flt_actual_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal actualQty;

    @Column(name = "flt_qty_after_transaction", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qtyAfterTransaction;

    @Column(name = "flt_incoming_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal incomingRate;

    @Column(name = "flt_outgoing_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outgoingRate;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_stock_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockValue;

    @Column(name = "flt_stock_value_difference", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockValueDifference;

    @Column(name = "tx_stock_queue", columnDefinition = "text")
    private String stockQueue;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_fiscal_year", length = 140)
    private String fiscalYear;

    @Column(name = "is_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasBatchNo;

    @Column(name = "is_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasSerialNo;

    @Column(name = "is_cancelled", nullable = false)
    @ColumnDefault("0")
    private Boolean isCancelled;

    @Column(name = "is_to_rename", nullable = false)
    @ColumnDefault("1")
    private Boolean toRename;

    @Column(name = "tx_serial_no", columnDefinition = "longtext")
    private String serialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
