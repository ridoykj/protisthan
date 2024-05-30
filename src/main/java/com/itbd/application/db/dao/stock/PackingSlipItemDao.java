package com.itbd.application.db.dao.stock;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_packing_slip_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PackingSlipItemDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal qty;

    @Column(name = "flt_net_weight", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal netWeight;

    @Column(name = "tx_stock_uom", length = 140)
    private String stockUom;

    @Column(name = "tx_weight_uom", length = 140)
    private String weightUom;

    @Column(name = "is_page_break", nullable = false)
    @ColumnDefault("0")
    private Boolean pageBreak;

    @Column(name = "tx_dn_detail", length = 140)
    private String dnDetail;

    @Column(name = "tx_pi_detail", length = 140)
    private String piDetail;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
