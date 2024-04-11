package com.itbd.application.db.dao.sales;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_sales_taxes_and_charges", indexes = {
        @Index(name = "idx_account_head", columnList = "tx_account_head"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class SalesTaxesAndChargesDao {

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

    @Column(name = "tx_charge_type", length = 140)
    private String chargeType;

    @Column(name = "tx_row_id", length = 140)
    private String rowId;

    @Column(name = "tx_account_head", length = 140)
    private String accountHead;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "is_included_in_print_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean includedInPrintRate;

    @Column(name = "is_included_in_paid_amount", nullable = false)
    @ColumnDefault("0")
    private Boolean includedInPaidAmount;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "flt_tax_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxAmount;

    @Column(name = "flt_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal total;

    @Column(name = "flt_tax_amount_after_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal taxAmountAfterDiscountAmount;

    @Column(name = "flt_base_tax_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTaxAmount;

    @Column(name = "flt_base_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTotal;

    @Column(name = "flt_base_tax_amount_after_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseTaxAmountAfterDiscountAmount;

    @Column(name = "tx_item_wise_tax_detail", columnDefinition = "longtext")
    private String itemWiseTaxDetail;

    @Column(name = "is_dont_recompute_tax", nullable = false)
    @ColumnDefault("0")
    private Boolean dontRecomputeTax;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
