package com.itbd.application.db.dao.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_queue", indexes = {
        @Index(name = "idx_reference_name", columnList = "tx_reference_name"),
        @Index(name = "idx_communication", columnList = "tx_communication"),
        @Index(name = "idx_index_bulk_flush", columnList = "tx_status, dtt_send_after, ct_priority, dtt_creation"),
        @Index(name = "idx_message_id_index", columnList = "tx_message_id"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class EmailQueueDao {

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

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "tx_show_as_cc", columnDefinition = "text")
    private String showAsCc;

    @Column(name = "tx_message", columnDefinition = "longtext")
    private String message;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Not_Sent'")
    private String status;

    @Column(name = "tx_error", columnDefinition = "longtext")
    private String error;

    @Column(name = "tx_message_id", columnDefinition = "text")
    private String messageId;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_communication", length = 140)
    private String communication;

    @Column(name = "dtt_send_after")
    private LocalDateTime sendAfter;

    @Column(name = "ct_priority", nullable = false)
    private Integer priority;

    @Column(name = "is_add_unsubscribe_link", nullable = false)
    @ColumnDefault("1")
    private Boolean addUnsubscribeLink;

    @Column(name = "tx_unsubscribe_param", length = 140)
    private String unsubscribeParam;

    @Column(name = "tx_unsubscribe_method", length = 140)
    private String unsubscribeMethod;

    @Column(name = "tx_expose_recipients", length = 140)
    private String exposeRecipients;

    @Column(name = "tx_attachments", columnDefinition = "longtext")
    private String attachments;

    @Column(name = "ct_retry", nullable = false)
    private Integer retry;

    @Column(name = "tx_email_account", length = 140)
    private String emailAccount;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
