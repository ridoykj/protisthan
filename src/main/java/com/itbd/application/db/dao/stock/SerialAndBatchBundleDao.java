package com.itbd.application.db.dao.stock;


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
@Table(name = "t_serial_and_batch_bundle", indexes = {
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_type_of_transaction", columnList = "tx_type_of_transaction"),
        @Index(name = "idx_voucher_no", columnList = "tx_voucher_no"),
        @Index(name = "idx_voucher_detail_no", columnList = "tx_voucher_detail_no"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class SerialAndBatchBundleDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "is_has_serial_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasSerialNo;

    @Column(name = "is_has_batch_no", nullable = false)
    @ColumnDefault("0")
    private Boolean hasBatchNo;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_type_of_transaction", length = 140)
    private String typeOfTransaction;

    @Column(name = "flt_total_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalQty;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "flt_avg_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal avgRate;

    @Column(name = "flt_total_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAmount;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_voucher_detail_no", length = 140)
    private String voucherDetailNo;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "tx_returned_against", length = 140)
    private String returnedAgainst;

    @Column(name = "is_cancelled", nullable = false)
    @ColumnDefault("0")
    private Boolean isCancelled;

    @Column(name = "is_rejected", nullable = false)
    @ColumnDefault("0")
    private Boolean isRejected;

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
