package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_default_value", indexes = {
        @Index(name = "idx_default_value_parent_def_key_index", columnList = "tx_parent, tx_def_key"),
        @Index(name = "idx_default_value_parent_parent_type_index", columnList = "tx_parent, tx_parent_type"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DefaultValueDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false)
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

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_def_value", columnDefinition = "text")
    private String defValue;

    @Column(name = "tx_def_key", length = 140)
    private String defKey;

}
