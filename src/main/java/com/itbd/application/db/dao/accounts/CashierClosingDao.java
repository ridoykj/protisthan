package com.itbd.application.db.dao.accounts;


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
@Table(name = "t_cashier_closing", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class CashierClosingDao {

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
    @ColumnDefault("'POS-CLO-'")
    private String namingSeries;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tt_from_time")
    private LocalTime fromTime;

    @Column(name = "tt_time")
    private LocalTime time;

    @Column(name = "flt_expense", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal expense;

    @Column(name = "flt_custody", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal custody;

    @Column(name = "flt_returns", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal returns;

    @Column(name = "flt_outstanding_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstandingAmount;

    @Column(name = "flt_net_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netAmount;

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
