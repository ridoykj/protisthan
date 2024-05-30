package com.itbd.application.db.dao.core.user;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_user_document_type", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class UserDocumentTypeDao {

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

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean isCustom;

    @Column(name = "is_read", nullable = false)
    @ColumnDefault("1")
    private Boolean read;

    @Column(name = "is_write", nullable = false)
    @ColumnDefault("0")
    private Boolean write;

    @Column(name = "is_create", nullable = false)
    @ColumnDefault("0")
    private Boolean create;

    @Column(name = "is_submit", nullable = false)
    @ColumnDefault("0")
    private Boolean submit;

    @Column(name = "is_cancel", nullable = false)
    @ColumnDefault("0")
    private Boolean cancel;

    @Column(name = "is_amend", nullable = false)
    @ColumnDefault("0")
    private Boolean amend;

    @Column(name = "is_delete", nullable = false)
    @ColumnDefault("0")
    private Boolean delete;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
