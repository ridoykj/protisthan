package com.itbd.application.db.dao.accounts.payment;


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
@Table(name = "t_payment_schedule", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PaymentScheduleDao {

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

    @Column(name = "tx_payment_term", length = 140)
    private String paymentTerm;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "flt_invoice_portion", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal invoicePortion;

    @Column(name = "tx_discount_type", length = 140)
    @ColumnDefault("'Percentage'")
    private String discountType;

    @Column(name = "dt_discountDate")
    private LocalDate discountDate;

    @Column(name = "flt_discount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discount;

    @Column(name = "flt_payment_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paymentAmount;

    @Column(name = "flt_outstanding", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstanding;

    @Column(name = "flt_paid_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal paidAmount;

    @Column(name = "flt_discounted_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountedAmount;

    @Column(name = "flt_base_payment_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal basePaymentAmount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
