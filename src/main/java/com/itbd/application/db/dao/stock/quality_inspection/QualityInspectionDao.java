package com.itbd.application.db.dao.stock.quality_inspection;


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
@Table(name = "t_quality_inspection", indexes = {
        @Index(name = "idx_report_date", columnList = "dt_report_date"),
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class QualityInspectionDao {

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

    @Column(name = "dt_report_date")
    private LocalDate reportDate;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Accepted'")
    private String status;

    @Column(name = "is_manual_inspection", nullable = false)
    @ColumnDefault("0")
    private Boolean manualInspection;

    @Column(name = "tx_inspection_type", length = 140)
    private String inspectionType;

    @Column(name = "tx_reference_type", length = 140)
    private String referenceType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_serial_no", length = 140)
    private String itemSerialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "flt_sample_size", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal sampleSize;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_bom_no", length = 140)
    private String bomNo;

    @Column(name = "tx_quality_inspection_template", length = 140)
    private String qualityInspectionTemplate;

    @Column(name = "tx_inspected_by", length = 140)
    @ColumnDefault("'user'")
    private String inspectedBy;

    @Column(name = "tx_verified_by", length = 140)
    private String verifiedBy;

    @Column(name = "tx_remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
