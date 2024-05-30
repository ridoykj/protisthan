package com.itbd.application.db.dao.accounts;


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
@Table(name = "t_exchange_rate_revaluation", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ExchangeRateRevaluationDao {

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

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "flt_rounding_loss_allowance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal roundingLossAllowance;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "flt_gain_loss_unbooked", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal gainLossUnbooked;

    @Column(name = "flt_gain_loss_booked", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal gainLossBooked;

    @Column(name = "flt_total_gain_loss", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalGainLoss;

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
