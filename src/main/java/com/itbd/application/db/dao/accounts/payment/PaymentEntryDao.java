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
@Table(name = "t_payment_entry", indexes = {
        @Index(name = "idx_party_type", columnList = "tx_party_type"),
        @Index(name = "idx_reference_date", columnList = "dt_reference_date"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PaymentEntryDao {

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

    @Column(name = "tx_payment_type", length = 140)
    private String paymentType;

    @Column(name = "tx_payment_order_status", length = 140)
    private String paymentOrderStatus;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_party_name", length = 140)
    private String partyName;

    @Column(name = "is_book_advance_payments_in_separate_party_account", nullable = false)
    @ColumnDefault("0")
    private Boolean bookAdvancePaymentsInSeparatePartyAccount;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_party_bank_account", length = 140)
    private String partyBankAccount;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "flt_party_balance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal partyBalance;

    @Column(name = "tx_paid_from", length = 140)
    private String paidFrom;

    @Column(name = "tx_paid_from_account_type", length = 140)
    private String paidFromAccountType;

    @Column(name = "tx_paid_from_account_currency", length = 140)
    private String paidFromAccountCurrency;

    @Column(name = "flt_paid_from_account_balance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidFromAccountBalance;

    @Column(name = "tx_paid_to", length = 140)
    private String paidTo;

    @Column(name = "tx_paid_to_account_type", length = 140)
    private String paidToAccountType;

    @Column(name = "tx_paid_to_account_currency", length = 140)
    private String paidToAccountCurrency;

    @Column(name = "flt_paid_to_account_balance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidToAccountBalance;

    @Column(name = "flt_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidAmount;

    @Column(name = "flt_paid_amount_after_tax", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidAmountAfterTax;

    @Column(name = "flt_source_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal sourceExchangeRate;

    @Column(name = "flt_base_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePaidAmount;

    @Column(name = "flt_base_paid_amount_after_tax", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePaidAmountAfterTax;

    @Column(name = "flt_received_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedAmount;

    @Column(name = "flt_received_amount_after_tax", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal receivedAmountAfterTax;

    @Column(name = "flt_target_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal targetExchangeRate;

    @Column(name = "flt_base_received_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseReceivedAmount;

    @Column(name = "flt_base_received_amount_after_tax", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseReceivedAmountAfterTax;

    @Column(name = "flt_total_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAllocatedAmount;

    @Column(name = "flt_base_total_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalAllocatedAmount;

    @Column(name = "flt_unallocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal unallocatedAmount;

    @Column(name = "flt_difference_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal differenceAmount;

    @Column(name = "tx_purchase_taxes_and_charges_template", length = 140)
    private String purchaseTaxesAndChargesTemplate;

    @Column(name = "tx_sales_taxes_and_charges_template", length = 140)
    private String salesTaxesAndChargesTemplate;

    @Column(name = "is_apply_tax_withholding_amount", nullable = false)
    @ColumnDefault("0")
    private Boolean applyTaxWithholdingAmount;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "flt_base_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotalTaxesAndCharges;

    @Column(name = "flt_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalTaxesAndCharges;

    @Column(name = "tx_reference_no", length = 140)
    private String referenceNo;

    @Column(name = "dt_reference_date")
    private LocalDate referenceDate;

    @Column(name = "dt_clearance_date")
    private LocalDate clearanceDate;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "is_custom_remarks", nullable = false)
    @ColumnDefault("0")
    private Boolean customRemarks;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_base_in_words", columnDefinition = "text")
    private String baseInWords;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_print_heading", length = 140)
    private String printHeading;

    @Column(name = "tx_bank", length = 140)
    private String bank;

    @Column(name = "tx_bank_account_no", length = 140)
    private String bankAccountNo;

    @Column(name = "tx_payment_order", length = 140)
    private String paymentOrder;

    @Column(name = "tx_in_words", columnDefinition = "text")
    private String inWords;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
