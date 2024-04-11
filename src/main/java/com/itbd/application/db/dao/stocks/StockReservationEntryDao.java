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
@Table(name = "t_stock_reservation_entry", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_voucher_no", columnList = "tx_voucher_no"),
        @Index(name = "idx_voucher_detail_no", columnList = "tx_voucher_detail_no"),
        @Index(name = "idx_from_voucher_no", columnList = "tx_from_voucher_no"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_project", columnList = "tx_project"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class StockReservationEntryDao {

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

    @Column(name = "is_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasSerialNo;

    @Column(name = "is_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasBatchNo;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_voucher_detail_no", length = 140)
    private String voucherDetailNo;

    @Column(name = "tx_from_voucher_type", length = 140)
    private String fromVoucherType;

    @Column(name = "tx_from_voucher_no", length = 140)
    private String fromVoucherNo;

    @Column(name = "tx_from_voucher_detail_no", length = 140)
    private String fromVoucherDetailNo;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "flt_available_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal availableQty;

    @Column(name = "flt_voucher_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal voucherQty;

    @Column(name = "flt_reserved_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal reservedQty;

    @Column(name = "flt_delivered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal deliveredQty;

    @Column(name = "tx_reservation_based_on", length = 140)
    @ColumnDefault("'Qty'")
    private String reservationBasedOn;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

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
