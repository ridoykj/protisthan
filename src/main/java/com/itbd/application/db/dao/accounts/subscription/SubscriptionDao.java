package com.itbd.application.db.dao.accounts.subscription;


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
@Table(name = "t_subscription", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class SubscriptionDao {

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

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "dt_cancelation_date")
    private LocalDate cancelationDate;

    @Column(name = "dt_trial_period_start")
    private LocalDate trialPeriodStart;

    @Column(name = "dt_trial_period_end")
    private LocalDate trialPeriodEnd;

    @Column(name = "is_follow_calendar_months", nullable = false)
    @ColumnDefault("0")
    private Boolean followCalendarMonths;

    @Column(name = "is_generate_new_invoices_past_due_date", nullable = false)
    @ColumnDefault("0")
    private Boolean generateNewInvoicesPastDueDate;

    @Column(name = "is_submit_invoice", nullable = false)
    @ColumnDefault("1")
    private Boolean submitInvoice;

    @Column(name = "dt_current_invoice_start")
    private LocalDate currentInvoiceStart;

    @Column(name = "dt_current_invoice_end")
    private LocalDate currentInvoiceEnd;

    @Column(name = "ct_days_until_due", nullable = false)
    private Integer daysUntilDue;

    @Column(name = "tx_generate_invoice_at", length = 140)
    @ColumnDefault("'End of the current subscription period'")
    private String generateInvoiceAt;

    @Column(name = "ct_number_of_days", nullable = false)
    private Integer numberOfDays;

    @Column(name = "is_cancel_at_period_end", nullable = false)
    @ColumnDefault("0")
    private Boolean cancelAtPeriodEnd;

    @Column(name = "tx_sales_tax_template", length = 140)
    private String salesTaxTemplate;

    @Column(name = "tx_purchase_tax_template", length = 140)
    private String purchaseTaxTemplate;

    @Column(name = "tx_apply_additional_discount", length = 140)
    private String applyAdditionalDiscount;

    @Column(name = "flt_additional_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalDiscountPercentage;

    @Column(name = "flt_additional_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal additionalDiscountAmount;

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
