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
@Table(name = "t_item_attribute", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_attribute_name", columnNames = {"tx_attribute_name"})
})
public class ItemAttributeDao {

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

    @Column(name = "tx_attribute_name", unique = true, length = 140)
    private String attributeName;

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

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
