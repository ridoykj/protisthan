package com.itbd.application.db.dao.stock.item;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_item_reorder", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ItemReorderDao {

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

    @Column(name = "tx_warehouse_group", length = 140)
    private String warehouseGroup;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_warehouse_reorder_level", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal warehouseReorderLevel;

    @Column(name = "flt_warehouse_reorder_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal warehouseReorderQty;

    @Column(name = "tx_material_request_type", length = 140)
    private String materialRequestType;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
