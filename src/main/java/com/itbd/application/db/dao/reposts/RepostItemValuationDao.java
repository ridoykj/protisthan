package com.itbd.application.db.dao.reposts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_repost_item_valuation", indexes = {
        @Index(name = "idx_item_warehouse", columnList = "tx_warehouse, tx_item_code"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class RepostItemValuationDao {

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

    @Column(name = "tx_based_on", length = 140)
    @ColumnDefault("'Transaction'")
    private String basedOn;

    @Column(name = "tx_voucher_type", length = 140)
    private String voucherType;

    @Column(name = "tx_voucher_no", length = 140)
    private String voucherNo;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Queued'")
    private String status;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "is_allow_negative_stock", nullable = false)
    @ColumnDefault("1")
    private Boolean allowNegativeStock;

    @Column(name = "is_via_landed_cost_voucher", nullable = false)
    @ColumnDefault("0")
    private Boolean viaLandedCostVoucher;

    @Column(name = "is_allow_zero_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean allowZeroRate;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_error_log", columnDefinition = "longtext")
    private String errorLog;

    @Column(name = "tx_reposting_data_file", columnDefinition = "text")
    private String repostingDataFile;

    @Column(name = "tx_items_to_be_repost", columnDefinition = "longtext")
    private String itemsToBeRepost;

    @Column(name = "tx_distinct_item_and_warehouse", columnDefinition = "longtext")
    private String distinctItemAndWarehouse;

    @Column(name = "ct_total_reposting_count", nullable = false)
    private Integer totalRepostingCount;

    @Column(name = "ct_current_index", nullable = false)
    private Integer currentIndex;

    @Column(name = "ct_gl_reposting_index", nullable = false)
    private Integer glRepostingIndex;

    @Column(name = "tx_affected_transactions", columnDefinition = "longtext")
    private String affectedTransactions;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
