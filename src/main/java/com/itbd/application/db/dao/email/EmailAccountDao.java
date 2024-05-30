package com.itbd.application.db.dao.aaa.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_account", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_email_id", columnNames = {"tx_email_id"}),
        @UniqueConstraint(name = "uk_email_account_name", columnNames = {"tx_email_account_name"})
})
public class EmailAccountDao {

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

    @Column(name = "tx_email_id", unique = true, length = 140)
    private String emailId;

    @Column(name = "tx_email_account_name", unique = true, length = 140)
    private String emailAccountName;

    @Column(name = "tx_domain", length = 140)
    private String domain;

    @Column(name = "tx_service", length = 140)
    private String service;

    @Column(name = "tx_auth_method", length = 140)
    @ColumnDefault("'Basic'")
    private String authMethod;

    @Column(name = "tx_password", columnDefinition = "text")
    private String password;

    @Column(name = "is_awaiting_password", nullable = false)
    @ColumnDefault("0")
    private Boolean awaitingPassword;

    @Column(name = "is_ascii_encode_password", nullable = false)
    @ColumnDefault("0")
    private Boolean asciiEncodePassword;

    @Column(name = "tx_connected_app", length = 140)
    private String connectedApp;

    @Column(name = "tx_connected_user", length = 140)
    private String connectedUser;

    @Column(name = "is_login_id_is_different", nullable = false)
    @ColumnDefault("0")
    private Boolean loginIdIsDifferent;

    @Column(name = "tx_login_id", length = 140)
    private String loginId;

    @Column(name = "is_enable_incoming", nullable = false)
    @ColumnDefault("0")
    private Boolean enableIncoming;

    @Column(name = "is_default_incoming", nullable = false)
    @ColumnDefault("0")
    private Boolean defaultIncoming;

    @Column(name = "is_use_imap", nullable = false)
    @ColumnDefault("0")
    private Boolean useImap;

    @Column(name = "is_use_ssl", nullable = false)
    @ColumnDefault("0")
    private Boolean useSsl;

    @Column(name = "is_use_starttls", nullable = false)
    @ColumnDefault("0")
    private Boolean useStarttls;

    @Column(name = "tx_email_server", length = 140)
    private String emailServer;

    @Column(name = "tx_incoming_port", length = 140)
    private String incomingPort;

    @Column(name = "ct_attachment_limit", nullable = false)
    private Integer attachmentLimit;

    @Column(name = "tx_email_sync_option", length = 140)
    @ColumnDefault("'UNSEEN'")
    private String emailSyncOption;

    @Column(name = "tx_initial_sync_count", length = 140)
    @ColumnDefault("250")
    private String initialSyncCount;

    @Column(name = "is_append_emails_to_sent_folder", nullable = false)
    @ColumnDefault("0")
    private Boolean appendEmailsToSentFolder;

    @Column(name = "tx_append_to", length = 140)
    private String appendTo;

    @Column(name = "is_create_contact", nullable = false)
    @ColumnDefault("1")
    private Boolean createContact;

    @Column(name = "is_enable_automatic_linking", nullable = false)
    @ColumnDefault("0")
    private Boolean enableAutomaticLinking;

    @Column(name = "is_notify_if_unreplied", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyIfUnreplied;

    @Column(name = "ct_unreplied_for_mins", nullable = false)
    @ColumnDefault("30")
    private Integer unrepliedForMins;

    @Column(name = "tx_send_notification_to", columnDefinition = "text")
    private String sendNotificationTo;

    @Column(name = "is_enable_outgoing", nullable = false)
    @ColumnDefault("0")
    private Boolean enableOutgoing;

    @Column(name = "is_use_tls", nullable = false)
    @ColumnDefault("0")
    private Boolean useTls;

    @Column(name = "is_use_ssl_for_outgoing", nullable = false)
    @ColumnDefault("0")
    private Boolean useSslForOutgoing;

    @Column(name = "tx_smtp_server", length = 140)
    private String smtpServer;

    @Column(name = "tx_smtp_port", length = 140)
    private String smtpPort;

    @Column(name = "is_default_outgoing", nullable = false)
    @ColumnDefault("0")
    private Boolean defaultOutgoing;

    @Column(name = "is_always_use_account_email_id_as_sender", nullable = false)
    @ColumnDefault("0")
    private Boolean alwaysUseAccountEmailIdAsSender;

    @Column(name = "is_always_use_account_name_as_sender_name", nullable = false)
    @ColumnDefault("0")
    private Boolean alwaysUseAccountNameAsSenderName;

    @Column(name = "is_send_unsubscribe_message", nullable = false)
    @ColumnDefault("1")
    private Boolean sendUnsubscribeMessage;

    @Column(name = "is_track_email_status", nullable = false)
    @ColumnDefault("1")
    private Boolean trackEmailStatus;

    @Column(name = "is_no_smtp_authentication", nullable = false)
    @ColumnDefault("0")
    private Boolean noSmtpAuthentication;

    @Column(name = "is_add_signature", nullable = false)
    @ColumnDefault("0")
    private Boolean addSignature;

    @Column(name = "tx_signature", columnDefinition = "longtext")
    private String signature;

    @Column(name = "is_enable_auto_reply", nullable = false)
    @ColumnDefault("0")
    private Boolean enableAutoReply;

    @Column(name = "tx_auto_reply_message", columnDefinition = "longtext")
    private String autoReplyMessage;

    @Column(name = "tx_footer", columnDefinition = "longtext")
    private String footer;

    @Column(name = "tx_brand_logo", columnDefinition = "text")
    private String brandLogo;

    @Column(name = "tx_uid_validity", length = 140)
    private String uidValidity;

    @Column(name = "ct_uid_next", nullable = false)
    private Integer uidNext;

    @Column(name = "ct_no_failed", nullable = false)
    private Integer noFailed;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
