package com.itbd.application.db.dao.accounts.journal;


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
@Table(name = "t_journal_entry", indexes = {
        @Index(name = "idx_voucher_type", columnList = "tx_voucher_type"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_cheque_no", columnList = "tx_cheque_no"),
        @Index(name = "idx_cheque_date", columnList = "dt_cheque_date"),
        @Index(name = "idx_clearance_date", columnList = "dt_clearance_date"),
        @Index(name = "idx_is_opening", columnList = "tx_is_opening"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class JournalEntryDao {

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

    @Column(name = "is_system_generated", nullable = false)
    @ColumnDefault("0")
    private Boolean isSystemGenerated;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_voucher_type", length = 140)
    @ColumnDefault("'Journal_Entry'")
    private String voucherType;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_process_deferred_accounting", length = 140)
    private String processDeferredAccounting;

    @Column(name = "tx_reversal_of", length = 140)
    private String reversalOf;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "tx_from_template", length = 140)
    private String fromTemplate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "is_apply_tds", nullable = false)
    @ColumnDefault("0")
    private Boolean applyTds;

    @Column(name = "tx_cheque_no", length = 140)
    private String chequeNo;

    @Column(name = "dt_cheque_date")
    private LocalDate chequeDate;

    @Column(name = "tx_user_remark", columnDefinition = "text")
    private String userRemark;

    @Column(name = "flt_total_debit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalDebit;

    @Column(name = "flt_total_credit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalCredit;

    @Column(name = "flt_difference", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal difference;

    @Column(name = "is_multi_currency", nullable = false)
    @ColumnDefault("0")
    private Boolean multiCurrency;

    @Column(name = "tx_total_amount_currency", length = 140)
    private String totalAmountCurrency;

    @Column(name = "flt_total_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAmount;

    @Column(name = "tx_total_amount_in_words", length = 140)
    private String totalAmountInWords;

    @Column(name = "dt_clearance_date")
    private LocalDate clearanceDate;

    @Column(name = "tx_remark", columnDefinition = "text")
    private String remark;

    @Column(name = "tx_paid_loan", length = 140)
    private String paidLoan;

    @Column(name = "tx_inter_company_journal_entry_reference", length = 140)
    private String interCompanyJournalEntryReference;

    @Column(name = "tx_bill_no", length = 140)
    private String billNo;

    @Column(name = "dt_bill_date")
    private LocalDate billDate;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "tx_write_off_based_on", length = 140)
    @ColumnDefault("'Accounts_Receivable'")
    private String writeOffBasedOn;

    @Column(name = "flt_write_off_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal writeOffAmount;

    @Column(name = "tx_pay_to_recd_from", length = 140)
    private String payToRecdFrom;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "tx_payment_order", length = 140)
    private String paymentOrder;

    @Column(name = "tx_is_opening", length = 140)
    @ColumnDefault("'No'")
    private String isOpening;

    @Column(name = "tx_stock_entry", length = 140)
    private String stockEntry;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "is_repost_required", nullable = false)
    @ColumnDefault("0")
    private Boolean repostRequired;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
