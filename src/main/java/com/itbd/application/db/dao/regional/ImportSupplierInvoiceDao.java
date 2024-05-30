package com.itbd.application.db.dao.regional;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_import_supplier_invoice", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ImportSupplierInvoiceDao {

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

    @Column(name = "tx_invoice_series", length = 140)
    private String invoiceSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_supplier_group", length = 140)
    private String supplierGroup;

    @Column(name = "tx_tax_account", length = 140)
    private String taxAccount;

    @Column(name = "tx_default_buying_price_list", length = 140)
    private String defaultBuyingPriceList;

    @Column(name = "tx_zip_file", columnDefinition = "text")
    private String zipFile;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
