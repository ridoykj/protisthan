package com.itbd.application.db.dao.core;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_communication", indexes = {
        @Index(name = "idx_reference_doc_type_reference_name_index", columnList = "tx_reference_doc_type, tx_reference_name"),
        @Index(name = "idx_reference_owner", columnList = "tx_reference_owner"),
        @Index(name = "idx_status_communication_type_index", columnList = "tx_status, tx_communication_type"),
        @Index(name = "idx_message_id_index", columnList = "tx_message_id"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class CommunicationDao {

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

    @Column(name = "tx_communication_medium", length = 140)
    private String communicationMedium;

    @Column(name = "tx_sender")
    private String sender;

    @Column(name = "tx_recipients", columnDefinition = "longtext")
    private String recipients;

    @Column(name = "tx_cc", columnDefinition = "longtext")
    private String cc;

    @Column(name = "tx_bcc", columnDefinition = "longtext")
    private String bcc;

    @Column(name = "tx_phone_no", length = 140)
    private String phoneNo;

    @Column(name = "tx_delivery_status", length = 140)
    private String deliveryStatus;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "tx_text_content", columnDefinition = "longtext")
    private String textContent;

    @Column(name = "tx_communication_type", length = 140)
    @ColumnDefault("'Communication'")
    private String communicationType;

    @Column(name = "tx_comment_type", length = 140)
    private String commentType;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_sent_or_received", length = 140)
    private String sentOrReceived;

    @Column(name = "dtt_communication_date")
    private LocalDateTime communicationDate;

    @Column(name = "is_read_receipt", nullable = false)
    @ColumnDefault("0")
    private Boolean readReceipt;

    @Column(name = "dtt_send_after")
    private LocalDateTime sendAfter;

    @Column(name = "tx_sender_full_name", length = 140)
    private String senderFullName;

    @Column(name = "is_read_by_recipient", nullable = false)
    @ColumnDefault("0")
    private Boolean readByRecipient;

    @Column(name = "dtt_read_by_recipient_on")
    private LocalDateTime readByRecipientOn;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_reference_owner", length = 140)
    private String referenceOwner;

    @Column(name = "tx_email_account", length = 140)
    private String emailAccount;

    @Column(name = "tx_in_reply_to", length = 140)
    private String inReplyTo;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_email_template", length = 140)
    private String emailTemplate;

    @Column(name = "is_unread_notification_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean unreadNotificationSent;

    @Column(name = "is_seen", nullable = false)
    @ColumnDefault("0")
    private Boolean seen;

    @Column(name = "tx_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "tx_message_id", columnDefinition = "text")
    private String messageId;

    @Column(name = "ct_uid", nullable = false)
    private Integer uid;

    @Column(name = "tx_imap_folder", length = 140)
    private String imapFolder;

    @Column(name = "tx_email_status", length = 140)
    private String emailStatus;

    @Column(name = "is_has_attachment", nullable = false)
    @ColumnDefault("0")
    private Boolean hasAttachment;

    @Column(name = "ct_rating", nullable = false)
    private Integer rating;

    @Column(name = "tx_feedback_request", length = 140)
    private String feedbackRequest;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String _seen;

}
