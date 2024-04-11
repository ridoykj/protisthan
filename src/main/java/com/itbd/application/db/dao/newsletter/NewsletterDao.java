package com.itbd.application.db.dao.newsletter;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_newsletter", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class NewsletterDao {

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

    @Column(name = "dtt_email_sent_at")
    private LocalDateTime emailSentAt;

    @Column(name = "ct_total_recipients", nullable = false)
    private Integer totalRecipients;

    @Column(name = "ct_total_views", nullable = false)
    private Integer totalViews;

    @Column(name = "is_email_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean emailSent;

    @Column(name = "tx_sender_name", length = 140)
    private String senderName;

    @Column(name = "tx_sender_email", length = 140)
    private String senderEmail;

    @Column(name = "tx_send_from", length = 140)
    private String sendFrom;

    @Column(name = "tx_subject", columnDefinition = "text")
    private String subject;

    @Column(name = "tx_content_type", length = 140)
    private String contentType;

    @Column(name = "tx_message", columnDefinition = "longtext")
    private String message;

    @Column(name = "tx_message_md", columnDefinition = "longtext")
    private String messageMd;

    @Column(name = "tx_message_html", columnDefinition = "longtext")
    private String messageHtml;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "is_send_unsubscribe_link", nullable = false)
    @ColumnDefault("1")
    private Boolean sendUnsubscribeLink;

    @Column(name = "is_send_web_view_link", nullable = false)
    @ColumnDefault("0")
    private Boolean sendWebViewLink;

    @Column(name = "ct_scheduled_to_send", nullable = false)
    private Integer scheduledToSend;

    @Column(name = "is_schedule_sending", nullable = false)
    @ColumnDefault("0")
    private Boolean scheduleSending;

    @Column(name = "dtt_schedule_send")
    private LocalDateTime scheduleSend;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

    @Column(name = "tx_route", length = 140)
    private String route;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
