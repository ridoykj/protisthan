package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_property_setter", indexes = {
        @Index(name = "idx_doc_type", columnList = "tx_doc_type"),
        @Index(name = "idx_field_name", columnList = "tx_field_name"),
        @Index(name = "idx_property", columnList = "tx_property"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PropertySetterDao {

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

    @Column(name = "is_system_generated", nullable = false)
    @ColumnDefault("0")
    private Boolean isSystemGenerated;

    @Column(name = "tx_doc_type_or_field", length = 140)
    private String docTypeOrField;

    @Column(name = "tx_doc_type", length = 140)
    private String docType;

    @Column(name = "tx_field_name", length = 140)
    private String fieldName;

    @Column(name = "tx_row_name", length = 140)
    private String rowName;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_property", length = 140)
    private String property;

    @Column(name = "tx_property_type", length = 140)
    private String propertyType;

    @Column(name = "tx_value", columnDefinition = "text")
    private String value;

    @Column(name = "tx_default_value", length = 140)
    private String defaultValue;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
