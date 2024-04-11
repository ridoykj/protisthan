package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_request_for_quotation", indexes = {
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_transaction_date", columnList = "dt_transaction_date"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class RequestForQuotationDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_billing_address", length = 140)
    private String billingAddress;

    @Column(name = "tx_billing_address_display", columnDefinition = "text")
    private String billingAddressDisplay;

    @Column(name = "tx_vendor", length = 140)
    private String vendor;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_email_template", length = 140)
    private String emailTemplate;

    @Column(name = "is_send_attached_files", nullable = false)
    @ColumnDefault("1")
    private Boolean sendAttachedFiles;

    @Column(name = "is_send_document_print", nullable = false)
    @ColumnDefault("0")
    private Boolean sendDocumentPrint;

    @Column(name = "tx_message_for_supplier", columnDefinition = "longtext")
    private String messageForSupplier;

    @Column(name = "tx_incoterm", length = 140)
    private String incoterm;

    @Column(name = "tx_named_place", length = 140)
    private String namedPlace;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_terms", columnDefinition = "longtext")
    private String terms;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_opportunity", length = 140)
    private String opportunity;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
