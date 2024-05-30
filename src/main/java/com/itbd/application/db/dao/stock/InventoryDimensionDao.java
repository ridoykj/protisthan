package com.itbd.application.db.dao.stock;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_inventory_dimension", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_dimension_name", columnNames = {"tx_dimension_name"})
})
public class InventoryDimensionDao {

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

    @Column(name = "tx_dimension_name", unique = true, length = 140)
    private String dimensionName;

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_source_field_name", length = 140)
    private String sourceFieldName;

    @Column(name = "tx_target_field_name", length = 140)
    private String targetFieldName;

    @Column(name = "is_apply_to_all_doc_types", nullable = false)
    @ColumnDefault("1")
    private Boolean applyToAllDocTypes;

    @Column(name = "is_validate_negative_stock", nullable = false)
    @ColumnDefault("0")
    private Boolean validateNegativeStock;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_type_of_transaction", length = 140)
    private String typeOfTransaction;

    @Column(name = "tx_fetch_from_parent", length = 140)
    private String fetchFromParent;

    @Column(name = "is_table", nullable = false)
    @ColumnDefault("0")
    private Boolean isTable;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "is_reqd", nullable = false)
    @ColumnDefault("0")
    private Boolean reqd;

    @Column(name = "tx_mandatory_depends_on", columnDefinition = "text")
    private String mandatoryDependsOn;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
