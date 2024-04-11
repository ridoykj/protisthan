package com.itbd.application.db.dao.notifications;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_notification_log", indexes = {
        @Index(name = "idx_for_user", columnList = "tx_for_user"),
        @Index(name = "idx_document_name", columnList = "tx_document_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class NotificationLogDao {

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

    @Column(name = "tx_subject", columnDefinition = "text")
    private String subject;

    @Column(name = "tx_for_user", length = 140)
    private String forUser;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_email_content", columnDefinition = "longtext")
    private String emailContent;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "is_read", nullable = false)
    @ColumnDefault("0")
    private Boolean read;

    @Column(name = "tx_document_name", length = 140)
    private String documentName;

    @Column(name = "tx_attached_file", columnDefinition = "longtext")
    private String attachedFile;

    @Column(name = "tx_from_user", length = 140)
    private String fromUser;

    @Column(name = "tx_link", length = 140)
    private String link;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
