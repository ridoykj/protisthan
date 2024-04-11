package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_request_for_quotation_supplier", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class RequestForQuotationSupplierDao {

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

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_contact", length = 140)
    private String contact;

    @Column(name = "tx_quote_status", length = 140)
    private String quoteStatus;

    @Column(name = "tx_supplier_name", length = 140)
    private String supplierName;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "is_send_email", nullable = false)
    @ColumnDefault("1")
    private Boolean sendEmail;

    @Column(name = "is_email_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean emailSent;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
