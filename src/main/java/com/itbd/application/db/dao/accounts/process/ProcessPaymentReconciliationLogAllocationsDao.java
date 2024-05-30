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
@Table(name = "t_process_payment_reconciliation_log_allocations", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ProcessPaymentReconciliationLogAllocationsDao {

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

    @Column(name = "tx_reference_type", length = 140)
    private String referenceType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_reference_row", length = 140)
    private String referenceRow;

    @Column(name = "tx_invoice_type", length = 140)
    private String invoiceType;

    @Column(name = "tx_invoice_number", length = 140)
    private String invoiceNumber;

    @Column(name = "flt_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal allocatedAmount;

    @Column(name = "flt_unreconciled_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal unreconciledAmount;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_is_advance", length = 140)
    private String isAdvance;

    @Column(name = "flt_difference_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal differenceAmount;

    @Column(name = "tx_difference_account", length = 140)
    private String differenceAccount;

    @Column(name = "flt_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeRate;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "is_reconciled", nullable = false)
    @ColumnDefault("0")
    private Boolean reconciled;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
