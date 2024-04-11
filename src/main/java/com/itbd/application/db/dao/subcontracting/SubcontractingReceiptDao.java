package com.itbd.application.db.dao.subcontracting;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_subcontracting_receipt", indexes = {
        @Index(name = "idx_supplier", columnList = "tx_supplier"),
        @Index(name = "idx_posting_date", columnList = "dt_posting_date"),
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class SubcontractingReceiptDao {

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

    @Column(name = "tx_title", length = 140)
    @ColumnDefault("'{supplier_name}'")
    private String title;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_supplier_name", length = 140)
    private String supplierName;

    @Column(name = "tx_supplier_delivery_note", length = 140)
    private String supplierDeliveryNote;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "is_set_posting_time", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingTime;

    @Column(name = "is_return", nullable = false)
    @ColumnDefault("0")
    private Boolean isReturn;

    @Column(name = "tx_return_against", length = 140)
    private String returnAgainst;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_supplier_address", length = 140)
    private String supplierAddress;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_contact_mobile", columnDefinition = "text")
    private String contactMobile;

    @Column(name = "tx_contact_email", columnDefinition = "text")
    private String contactEmail;

    @Column(name = "tx_shipping_address", length = 140)
    private String shippingAddress;

    @Column(name = "tx_shipping_address_display", columnDefinition = "text")
    private String shippingAddressDisplay;

    @Column(name = "tx_billing_address", length = 140)
    private String billingAddress;

    @Column(name = "tx_billing_address_display", columnDefinition = "text")
    private String billingAddressDisplay;

    @Column(name = "tx_set_warehouse", length = 140)
    private String setWarehouse;

    @Column(name = "tx_rejected_warehouse", length = 140)
    private String rejectedWarehouse;

    @Column(name = "tx_supplier_warehouse", length = 140)
    private String supplierWarehouse;

    @Column(name = "flt_total_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalQty;

    @Column(name = "flt_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal total;

    @Column(name = "tx_distribute_additional_costs_based_on", length = 140)
    @ColumnDefault("'Qty'")
    private String distributeAdditionalCostsBasedOn;

    @Column(name = "flt_total_additional_costs", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalAdditionalCosts;

    @Column(name = "tx_in_words", length = 240)
    private String inWords;

    @Column(name = "tx_bill_no", length = 140)
    private String billNo;

    @Column(name = "dt_bill_date")
    private LocalDate billDate;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "flt_per_returned", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal perReturned;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "tx_range", length = 140)
    private String range;

    @Column(name = "tx_represents_company", length = 140)
    private String representsCompany;

    @Column(name = "tx_auto_repeat", length = 140)
    private String autoRepeat;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_instructions", columnDefinition = "text")
    private String instructions;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_transporter_name", length = 140)
    private String transporterName;

    @Column(name = "tx_lr_no", length = 140)
    private String lrNo;

    @Column(name = "dt_lr_date")
    private LocalDate lrDate;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
