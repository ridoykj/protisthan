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
@Table(name = "t_sales_invoice_payment", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SalesInvoicePaymentDao {

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

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean defaults;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_reference_no", length = 140)
    private String referenceNo;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "flt_base_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseAmount;

    @Column(name = "dt_clearanceDate")
    private LocalDate clearanceDate;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
