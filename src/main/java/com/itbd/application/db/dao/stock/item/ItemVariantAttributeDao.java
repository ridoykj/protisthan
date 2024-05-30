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
@Table(name = "t_item_variant_attribute", indexes = {
        @Index(name = "idx_variant_of", columnList = "tx_variant_of"),
        @Index(name = "idx_attribute", columnList = "tx_attribute"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class ItemVariantAttributeDao {

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

    @Column(name = "tx_variant_of", length = 140)
    private String variantOf;

    @Column(name = "tx_attribute", length = 140)
    private String attribute;

    @Column(name = "tx_attribute_value", length = 140)
    private String attributeValue;

    @Column(name = "is_numeric_values", nullable = false)
    @ColumnDefault("0")
    private Boolean numericValues;

    @Column(name = "flt_from_range", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal fromRange;

    @Column(name = "flt_increment", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal increment;

    @Column(name = "flt_to_range", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal toRange;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
