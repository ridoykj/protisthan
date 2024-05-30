package com.itbd.application.db.dao.buying.supplier;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_supplier", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
@DynamicInsert
public class SupplierDao {

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

    @Column(name = "tx_supplier_name", length = 140)
    private String supplierName;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "tx_supplier_group", length = 140)
    private String supplierGroup;

    @Column(name = "tx_supplier_type", length = 140)
    @ColumnDefault("'Company'")
    private String supplierType;

    @Column(name = "is_transporter", nullable = false)
    @ColumnDefault("0")
    private Boolean isTransporter;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_default_currency", length = 140)
    private String defaultCurrency;

    @Column(name = "tx_default_bank_account", length = 140)
    private String defaultBankAccount;

    @Column(name = "tx_default_price_list", length = 140)
    private String defaultPriceList;

    @Column(name = "is_internal_supplier", nullable = false)
    @ColumnDefault("0")
    private Boolean isInternalSupplier;

    @Column(name = "tx_represents_company", length = 140)
    private String representsCompany;

    @Column(name = "tx_supplier_details", columnDefinition = "text")
    private String supplierDetails;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_tax_id", length = 140)
    private String taxId;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "tx_supplier_primary_address", length = 140)
    private String supplierPrimaryAddress;

    @Column(name = "tx_primary_address", columnDefinition = "text")
    private String primaryAddress;

    @Column(name = "tx_supplier_primary_contact", length = 140)
    private String supplierPrimaryContact;

    @Column(name = "tx_mobile_no", length = 140)
    private String mobileNo;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_payment_terms", length = 140)
    private String paymentTerms;

    @Column(name = "is_allow_purchase_invoice_creation_without_purchase_order", nullable = false)
    @ColumnDefault("0")
    private Boolean allowPurchaseInvoiceCreationWithoutPurchaseOrder;

    @Column(name = "is_allow_purchase_invoice_creation_without_purchase_receipt", nullable = false)
    @ColumnDefault("0")
    private Boolean allowPurchaseInvoiceCreationWithoutPurchaseReceipt;

    @Column(name = "is_frozen", nullable = false)
    @ColumnDefault("0")
    private Boolean isFrozen;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_warn_rfqs", nullable = false)
    @ColumnDefault("0")
    private Boolean warnRfqs;

    @Column(name = "is_warn_pos", nullable = false)
    @ColumnDefault("0")
    private Boolean warnPos;

    @Column(name = "is_prevent_rfqs", nullable = false)
    @ColumnDefault("0")
    private Boolean preventRfqs;

    @Column(name = "is_prevent_pos", nullable = false)
    @ColumnDefault("0")
    private Boolean preventPos;

    @Column(name = "is_on_hold", nullable = false)
    @ColumnDefault("0")
    private Boolean onHold;

    @Column(name = "tx_hold_type", length = 140)
    private String holdType;

    @Column(name = "dt_releaseDate")
    private LocalDate releaseDate;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
