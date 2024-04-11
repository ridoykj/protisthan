package com.itbd.application.db.dao.notifications;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_notification", indexes = {
        @Index(name = "idx_document_type", columnList = "tx_document_type"),
        @Index(name = "idx_event", columnList = "tx_event"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class NotificationDao {

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

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_channel", length = 140)
    @ColumnDefault("'Email'")
    private String channel;

    @Column(name = "tx_slack_webhook_url", length = 140)
    private String slackWebhookUrl;

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean isStandard;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_event", length = 140)
    private String event;

    @Column(name = "tx_method", length = 140)
    private String method;

    @Column(name = "tx_date_changed", length = 140)
    private String dateChanged;

    @Column(name = "ct_days_in_advance", nullable = false)
    private Integer daysInAdvance;

    @Column(name = "tx_value_changed", length = 140)
    private String valueChanged;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "is_send_system_notification", nullable = false)
    @ColumnDefault("0")
    private Boolean sendSystemNotification;

    @Column(name = "tx_sender_email", length = 140)
    private String senderEmail;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "tx_set_property_after_alert", length = 140)
    private String setPropertyAfterAlert;

    @Column(name = "tx_property_value", length = 140)
    private String propertyValue;

    @Column(name = "is_send_to_all_assignees", nullable = false)
    @ColumnDefault("0")
    private Boolean sendToAllAssignees;

    @Column(name = "tx_message", columnDefinition = "longtext")
    @ColumnDefault("'Add your message here'")
    private String message;

    @Column(name = "is_attach_print", nullable = false)
    @ColumnDefault("0")
    private Boolean attachPrint;

    @Column(name = "tx_print_format", length = 140)
    private String printFormat;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
