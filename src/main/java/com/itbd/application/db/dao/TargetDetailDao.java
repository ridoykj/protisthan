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
@Table(name = "t_target_detail", indexes = {
        @Index(name = "idx_item_group", columnList = "tx_parent"),
        @Index(name = "idx_fiscal_year", columnList = "tx_parent"),
        @Index(name = "idx_target_amount", columnList = "tx_parent"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class TargetDetailDao {

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

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_fiscal_year", length = 140)
    private String fiscalYear;

    @Column(name = "flt_target_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal targetQty;

    @Column(name = "flt_target_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal targetAmount;

    @Column(name = "tx_distribution_id", length = 140)
    private String distributionId;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
