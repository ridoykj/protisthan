package com.itbd.application.db.dao.accounts.promotional_scheme;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_promotional_scheme_product_discount", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PromotionalSchemeProductDiscountDao {

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

    @Column(name = "ct_disable", nullable = false)
    private Integer disable;

    @Column(name = "is_apply_multiple_pricing_rules", nullable = false)
    @ColumnDefault("0")
    private Boolean applyMultiplePricingRules;

    @Column(name = "tx_rule_description", columnDefinition = "text")
    private String ruleDescription;

    @Column(name = "flt_min_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minQty;

    @Column(name = "flt_max_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxQty;

    @Column(name = "flt_min_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minAmount;

    @Column(name = "flt_max_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxAmount;

    @Column(name = "is_same_item", nullable = false)
    @ColumnDefault("0")
    private Boolean sameItem;

    @Column(name = "tx_free_item", length = 140)
    private String freeItem;

    @Column(name = "flt_free_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal freeQty;

    @Column(name = "tx_free_item_uom", length = 140)
    private String freeItemUom;

    @Column(name = "flt_free_item_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal freeItemRate;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_threshold_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal thresholdPercentage;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "is_recursive", nullable = false)
    @ColumnDefault("0")
    private Boolean isRecursive;

    @Column(name = "flt_recurse_for", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal recurseFor;

    @Column(name = "flt_apply_recursion_over", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal applyRecursionOver;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
