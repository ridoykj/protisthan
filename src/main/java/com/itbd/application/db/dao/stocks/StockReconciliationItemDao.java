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
@Table(name = "t_stock_reconciliation_item", indexes = {
        @Index(name = "idx_serial_and_batch_bundle", columnList = "tx_serial_and_batch_bundle"),
        @Index(name = "idx_batch_no", columnList = "tx_batch_no"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class StockReconciliationItemDao {

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

    @Column(name = "tx_has_item_scanned", length = 140)
    private String hasItemScanned;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "flt_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valuationRate;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "is_allow_zero_valuation_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean allowZeroValuationRate;

    @Column(name = "is_use_serial_batch_fields", nullable = false)
    @ColumnDefault("0")
    private Boolean useSerialBatchFields;

    @Column(name = "tx_serial_and_batch_bundle", length = 140)
    private String serialAndBatchBundle;

    @Column(name = "tx_current_serial_and_batch_bundle", length = 140)
    private String currentSerialAndBatchBundle;

    @Column(name = "tx_serial_no", columnDefinition = "longtext")
    private String serialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "flt_current_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentQty;

    @Column(name = "flt_current_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentAmount;

    @Column(name = "flt_current_valuation_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentValuationRate;

    @Column(name = "tx_current_serial_no", columnDefinition = "longtext")
    private String currentSerialNo;

    @Column(name = "tx_quantity_difference", length = 140)
    private String quantityDifference;

    @Column(name = "flt_amount_difference", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amountDifference;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
