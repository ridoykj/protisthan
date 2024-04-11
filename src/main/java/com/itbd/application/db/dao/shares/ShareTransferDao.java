package com.itbd.application.db.dao.shares;


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
@Table(name = "t_share_transfer", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ShareTransferDao {

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

    @Column(name = "tx_transfer_type", length = 140)
    private String transferType;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tx_from_shareholder", length = 140)
    private String fromShareholder;

    @Column(name = "tx_from_folio_no", length = 140)
    private String fromFolioNo;

    @Column(name = "tx_to_shareholder", length = 140)
    private String toShareholder;

    @Column(name = "tx_to_folio_no", length = 140)
    private String toFolioNo;

    @Column(name = "tx_equity_or_liability_account", length = 140)
    private String equityOrLiabilityAccount;

    @Column(name = "tx_asset_account", length = 140)
    private String assetAccount;

    @Column(name = "tx_share_type", length = 140)
    private String shareType;

    @Column(name = "ct_from_no", nullable = false)
    private Integer fromNo;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "ct_no_of_shares", nullable = false)
    private Integer noOfShares;

    @Column(name = "ct_to_no", nullable = false)
    private Integer toNo;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_remarks", columnDefinition = "longtext")
    private String remarks;

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
