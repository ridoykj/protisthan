package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_cheque_print_template", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ChequePrintTemplateDao {

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

    @Column(name = "is_has_print_format", nullable = false)
    @ColumnDefault("0")
    private Boolean hasPrintFormat;

    @Column(name = "tx_bank_name", length = 140)
    private String bankName;

    @Column(name = "tx_cheque_size", length = 140)
    @ColumnDefault("'Regular'")
    private String chequeSize;

    @Column(name = "flt_starting_position_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal startingPositionFromTopEdge;

    @Column(name = "flt_cheque_width", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("20.0")
    private BigDecimal chequeWidth;

    @Column(name = "flt_cheque_height", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("9.0")
    private BigDecimal chequeHeight;

    @Column(name = "tx_scanned_cheque", columnDefinition = "text")
    private String scannedCheque;

    @Column(name = "is_account_payable", nullable = false)
    @ColumnDefault("1")
    private Boolean isAccountPayable;

    @Column(name = "flt_acc_pay_dist_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal accPayDistFromTopEdge;

    @Column(name = "flt_acc_pay_dist_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("9.0")
    private BigDecimal accPayDistFromLeftEdge;

    @Column(name = "tx_message_to_show", length = 140)
    @ColumnDefault("'Acc. Payee'")
    private String messageToShow;

    @Column(name = "flt_date_dist_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal dateDistFromTopEdge;

    @Column(name = "flt_date_dist_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal dateDistFromLeftEdge;

    @Column(name = "flt_payer_name_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("2.0")
    private BigDecimal payerNameFromTopEdge;

    @Column(name = "flt_payer_name_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("3.0")
    private BigDecimal payerNameFromLeftEdge;

    @Column(name = "flt_amt_in_words_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("3.0")
    private BigDecimal amtInWordsFromTopEdge;

    @Column(name = "flt_amt_in_words_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("4.0")
    private BigDecimal amtInWordsFromLeftEdge;

    @Column(name = "flt_amt_in_word_width", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal amtInWordWidth;

    @Column(name = "flt_amt_in_words_line_spacing", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.5")
    private BigDecimal amtInWordsLineSpacing;

    @Column(name = "flt_amt_in_figures_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("3.0")
    private BigDecimal amtInFiguresFromTopEdge;

    @Column(name = "flt_amt_in_figures_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("16.0")
    private BigDecimal amtInFiguresFromLeftEdge;

    @Column(name = "flt_acc_no_dist_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("5.0")
    private BigDecimal accNoDistFromTopEdge;

    @Column(name = "flt_acc_no_dist_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("4.0")
    private BigDecimal accNoDistFromLeftEdge;

    @Column(name = "flt_signatory_from_top_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("6.0")
    private BigDecimal signatoryFromTopEdge;

    @Column(name = "flt_signatory_from_left_edge", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal signatoryFromLeftEdge;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
