package com.itbd.application.db.dao.aaa.subcontracting;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_subcontracting_bom", indexes = {
        @Index(name = "idx_finished_good", columnList = "tx_finished_good"),
        @Index(name = "idx_finished_good_bom", columnList = "tx_finished_good_bom"),
        @Index(name = "idx_service_item", columnList = "tx_service_item"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class SubcontractingBomDao {

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

    @Column(name = "is_active", nullable = false)
    @ColumnDefault("1")
    private Boolean isActive;

    @Column(name = "tx_finished_good", length = 140)
    private String finishedGood;

    @Column(name = "flt_finished_good_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal finishedGoodQty;

    @Column(name = "tx_finished_good_uom", length = 140)
    private String finishedGoodUom;

    @Column(name = "tx_finished_good_bom", length = 140)
    private String finishedGoodBom;

    @Column(name = "tx_service_item", length = 140)
    private String serviceItem;

    @Column(name = "flt_service_item_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal serviceItemQty;

    @Column(name = "tx_service_item_uom", length = 140)
    private String serviceItemUom;

    @Column(name = "flt_conversion_factor", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionFactor;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
