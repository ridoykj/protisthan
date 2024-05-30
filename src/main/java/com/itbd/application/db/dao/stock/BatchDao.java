package com.itbd.application.db.dao;


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
@Table(name = "t_batch", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_batch_id", columnNames = {"tx_batch_id"}),
})
public class BatchDao {

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

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_use_batchwise_valuation", nullable = false)
    @ColumnDefault("0")
    private Boolean useBatchwiseValuation;

    @Column(name = "tx_batch_id", unique = true, length = 140)
    private String batchId;

    @Column(name = "tx_item", length = 140)
    private String item;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_parent_batch", length = 140)
    private String parentBatch;

    @Column(name = "dt_manufacturingDate")
    private LocalDate manufacturingDate;

    @Column(name = "flt_batch_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal batchQty;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "dt_expiryDate")
    private LocalDate expiryDate;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "flt_qty_to_produce", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qtyToProduce;

    @Column(name = "flt_produced_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal producedQty;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
