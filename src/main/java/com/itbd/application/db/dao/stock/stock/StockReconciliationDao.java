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
@Table(name = "t_stock_reconciliation", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class StockReconciliationDao {

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

    @Column(name = "tx_purpose", length = 140)
    private String purpose;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "is_set_posting_time", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingTime;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

    @Column(name = "tx_scan_barcode", length = 140)
    private String scanBarcode;

    @Column(name = "is_scan_mode", nullable = false)
    @ColumnDefault("0")
    private Boolean scanMode;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "flt_difference_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal differenceAmount;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
