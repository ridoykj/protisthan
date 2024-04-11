package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_packing_slip", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PackingSlipDao {

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

    @Column(name = "tx_delivery_note", length = 140)
    private String deliveryNote;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "ct_from_case_no", nullable = false)
    private Integer fromCaseNo;

    @Column(name = "ct_to_case_no", nullable = false)
    private Integer toCaseNo;

    @Column(name = "flt_net_weight_pkg", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netWeightPkg;

    @Column(name = "tx_net_weight_uom", length = 140)
    private String netWeightUom;

    @Column(name = "flt_gross_weight_pkg", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grossWeightPkg;

    @Column(name = "tx_gross_weight_uom", length = 140)
    private String grossWeightUom;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

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
