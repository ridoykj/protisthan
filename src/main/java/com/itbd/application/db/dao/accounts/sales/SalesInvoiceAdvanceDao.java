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
@Table(name = "t_sales_invoice_advance", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SalesInvoiceAdvanceDao {

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

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_reference_row", length = 140)
    private String referenceRow;

    @Column(name = "flt_advance_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal advanceAmount;

    @Column(name = "flt_allocated_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal allocatedAmount;

    @Column(name = "flt_exchange_gain_loss", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeGainLoss;

    @Column(name = "flt_ref_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal refExchangeRate;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
