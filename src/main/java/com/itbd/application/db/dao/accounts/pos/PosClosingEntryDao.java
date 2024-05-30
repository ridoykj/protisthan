package com.itbd.application.db.dao.accounts.pos;


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
@Table(name = "t_pos_closing_entry", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PosClosingEntryDao {

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

    @Column(name = "dtt_period_start_date")
    private LocalDateTime periodStartDate;

    @Column(name = "dtt_period_end_date")
    private LocalDateTime periodEndDate;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "tx_pos_opening_entry", length = 140)
    private String posOpeningEntry;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_pos_profile", length = 140)
    private String posProfile;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "flt_net_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netTotal;

    @Column(name = "flt_total_quantity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalQuantity;

    @Column(name = "tx_error_message", columnDefinition = "text")
    private String errorMessage;

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
