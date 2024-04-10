package com.itbd.application.db.dao.accounts.bank;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bank_clearance_detail", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class BankClearanceDetailDao {

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

    @Column(name = "tx_payment_document", length = 140)
    private String paymentDocument;

    @Column(name = "tx_payment_entry", length = 140)
    private String paymentEntry;

    @Column(name = "tx_against_account", length = 140)
    private String againstAccount;

    @Column(name = "tx_amount", length = 140)
    private String amount;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_cheque_number", length = 140)
    private String chequeNumber;

    @Column(name = "dt_chequeDate")
    private LocalDate chequeDate;

    @Column(name = "dt_clearanceDate")
    private LocalDate clearanceDate;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
