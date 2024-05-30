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
@Table(name = "t_opening_invoice_creation_tool_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class OpeningInvoiceCreationToolItemDao {

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

    @Column(name = "tx_invoice_number", length = 140)
    private String invoiceNumber;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_temporary_opening_account", length = 140)
    private String temporaryOpeningAccount;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "dt_dueDate")
    private LocalDate dueDate;

    @Column(name = "tx_item_name", length = 140)
    @ColumnDefault("'Opening_Invoice_Item'")
    private String itemName;

    @Column(name = "flt_outstanding_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outstandingAmount;

    @Column(name = "tx_qty", length = 140)
    @ColumnDefault("'1'")
    private String qty;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
