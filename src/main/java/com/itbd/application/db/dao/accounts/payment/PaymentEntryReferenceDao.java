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
@Table(name = "t_payment_entry_reference", indexes = {
        @Index(name = "idx_reference_doc_type", columnList = "tx_reference_doc_type"),
        @Index(name = "idx_reference_name", columnList = "tx_reference_name"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PaymentEntryReferenceDao {

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

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "tx_bill_no", length = 140)
    private String billNo;

    @Column(name = "tx_payment_term", length = 140)
    private String paymentTerm;

    @Column(name = "flt_total_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAmount;

    @Column(name = "flt_outstanding_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstandingAmount;

    @Column(name = "flt_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal allocatedAmount;

    @Column(name = "flt_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeRate;

    @Column(name = "flt_exchange_gain_loss", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeGainLoss;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
