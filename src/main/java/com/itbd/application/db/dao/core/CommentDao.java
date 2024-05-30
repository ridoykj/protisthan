package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_comment", indexes = {
        @Index(name = "idx_reference_doc_type_reference_name_index", columnList = "tx_reference_doc_type, tx_reference_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class CommentDao {

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

    @Column(name = "tx_comment_type", length = 140)
    @ColumnDefault("'Comment'")
    private String commentType;

    @Column(name = "tx_comment_email", length = 140)
    private String commentEmail;

    @Column(name = "tx_subject", columnDefinition = "text")
    private String subject;

    @Column(name = "tx_comment_by", length = 140)
    private String commentBy;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

    @Column(name = "is_seen", nullable = false)
    @ColumnDefault("0")
    private Boolean seen;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_reference_owner", length = 140)
    private String referenceOwner;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "tx_ip_address", length = 140)
    private String ipAddress;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
