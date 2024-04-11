package com.itbd.application.db.dao.doctypes;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_doc_type_link", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DocTypeLinkDao {

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

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_group", length = 140)
    private String group;

    @Column(name = "tx_link_doc_type", length = 140)
    private String linkDocType;

    @Column(name = "tx_link_field_name", length = 140)
    private String linkFieldName;

    @Column(name = "tx_parent_doc_type", length = 140)
    private String parentDocType;

    @Column(name = "tx_table_field_name", length = 140)
    private String tableFieldName;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean hidden;

    @Column(name = "is_child_table", nullable = false)
    @ColumnDefault("0")
    private Boolean isChildTable;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean custom;

}
