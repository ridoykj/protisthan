package com.itbd.application.db.dao.core.doc;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_doc_share", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_share_doc_type", columnList = "tx_share_doc_type"),
        @Index(name = "idx_share_name", columnList = "tx_share_name"),
        @Index(name = "idx_everyone", columnList = "ct_everyone"),
        @Index(name = "idx_user_share_doc_type_index", columnList = "tx_user, tx_share_doc_type"),
        @Index(name = "idx_share_doc_type_share_name_index", columnList = "tx_share_doc_type, tx_share_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class DocShareDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_share_doc_type", length = 140)
    private String shareDocType;

    @Column(name = "tx_share_name", length = 140)
    private String shareName;

    @Column(name = "is_read", nullable = false)
    @ColumnDefault("0")
    private Boolean read;

    @Column(name = "is_write", nullable = false)
    @ColumnDefault("0")
    private Boolean write;

    @Column(name = "ct_share", nullable = false)
    private Integer share;

    @Column(name = "is_submit", nullable = false)
    @ColumnDefault("0")
    private Boolean submit;

    @Column(name = "ct_everyone", nullable = false)
    private Integer everyone;

    @Column(name = "is_notify_by_email", nullable = false)
    @ColumnDefault("1")
    private Boolean notifyByEmail;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
