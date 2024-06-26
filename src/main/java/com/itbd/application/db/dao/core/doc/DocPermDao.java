package com.itbd.application.db.dao.core.doc;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_doc_perm", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DocPermDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false)
    private String name;

    @Column(name = "dtt_creation")
    private LocalDateTime creation;

    @Column(name = "dtt_modified")
    private LocalDateTime modified;

    @Column(name = "tx_modified_by", length = 140)
    private String modifiedBy;

    @Column(name = "tx_owner")
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

    @Column(name = "ct_perm_level")
    private Integer permLevel;

    @Column(name = "tx_role", length = 140)
    private String role;

    @Column(name = "tx_match")
    private String match;

    @Column(name = "is_read", nullable = false)
    @ColumnDefault("1")
    private Boolean read;

    @Column(name = "is_write", nullable = false)
    @ColumnDefault("1")
    private Boolean write;

    @Column(name = "is_create", nullable = false)
    @ColumnDefault("1")
    private Boolean create;

    @Column(name = "is_submit", nullable = false)
    @ColumnDefault("0")
    private Boolean submit;

    @Column(name = "is_cancel", nullable = false)
    @ColumnDefault("0")
    private Boolean cancel;

    @Column(name = "is_delete", nullable = false)
    @ColumnDefault("1")
    private Boolean delete;

    @Column(name = "is_amend", nullable = false)
    @ColumnDefault("0")
    private Boolean amend;

    @Column(name = "is_report", nullable = false)
    @ColumnDefault("1")
    private Boolean report;

    @Column(name = "is_export", nullable = false)
    @ColumnDefault("1")
    private Boolean export;

    @Column(name = "is_import", nullable = false)
    @ColumnDefault("0")
    private Boolean imports;

    @Column(name = "is_share", nullable = false)
    @ColumnDefault("1")
    private Boolean share;

    @Column(name = "is_print", nullable = false)
    @ColumnDefault("1")
    private Boolean print;

    @Column(name = "is_email", nullable = false)
    @ColumnDefault("1")
    private Boolean email;

    @Column(name = "is_if_owner", nullable = false)
    @ColumnDefault("0")
    private Boolean ifOwner;

    @Column(name = "is_select", nullable = false)
    @ColumnDefault("0")
    private Boolean select;

}
