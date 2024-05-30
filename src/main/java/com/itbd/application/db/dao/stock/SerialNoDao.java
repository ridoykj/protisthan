package com.itbd.application.db.dao.stock;


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
@Table(name = "t_serial_no", indexes = {
        @Index(name = "idx_maintenance_status", columnList = "tx_maintenance_status"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_serial_no", columnNames = {"tx_serial_no"})
})
public class SerialNoDao {

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

    @Column(name = "tx_serial_no", unique = true, length = 140)
    private String serialNo;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_purchase_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal purchaseRate;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "tx_asset", length = 140)
    private String asset;

    @Column(name = "tx_asset_status", length = 140)
    private String assetStatus;

    @Column(name = "tx_location", length = 140)
    private String location;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "dt_warranty_expiry_date")
    private LocalDate warrantyExpiryDate;

    @Column(name = "dt_amc_expiry_date")
    private LocalDate amcExpiryDate;

    @Column(name = "tx_maintenance_status", length = 140)
    private String maintenanceStatus;

    @Column(name = "ct_warranty_period", nullable = false)
    private Integer warrantyPeriod;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_work_order", length = 140)
    private String workOrder;

    @Column(name = "tx_purchase_document_no", length = 140)
    private String purchaseDocumentNo;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
