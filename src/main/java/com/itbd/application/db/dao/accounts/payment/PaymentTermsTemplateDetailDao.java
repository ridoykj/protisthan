package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_payment_terms_template_detail", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PaymentTermsTemplateDetailDao {

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

    @Column(name = "flt_invoice_portion", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal invoicePortion;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "tx_due_date_based_on", length = 140)
    private String dueDateBasedOn;

    @Column(name = "ct_credit_days", nullable = false)
    private Integer creditDays;

    @Column(name = "ct_credit_months", nullable = false)
    private Integer creditMonths;

    @Column(name = "tx_discount_type", length = 140)
    @ColumnDefault("'Percentage'")
    private String discountType;

    @Column(name = "flt_discount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discount;

    @Column(name = "tx_discount_validity_based_on", length = 140)
    @ColumnDefault("'Day(s) after invoice date'")
    private String discountValidityBasedOn;

    @Column(name = "ct_discount_validity", nullable = false)
    private Integer discountValidity;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
