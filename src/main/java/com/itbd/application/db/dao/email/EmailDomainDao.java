package com.itbd.application.db.dao.aaa.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_domain", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_domain_name", columnNames = {"tx_domain_name"})
})
public class EmailDomainDao {

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

    @Column(name = "tx_domain_name", unique = true, length = 140)
    private String domainName;

    @Column(name = "tx_email_server", length = 140)
    private String emailServer;

    @Column(name = "is_use_imap", nullable = false)
    @ColumnDefault("0")
    private Boolean useImap;

    @Column(name = "is_use_ssl", nullable = false)
    @ColumnDefault("0")
    private Boolean useSsl;

    @Column(name = "is_use_starttls", nullable = false)
    @ColumnDefault("0")
    private Boolean useStarttls;

    @Column(name = "tx_incoming_port", length = 140)
    private String incomingPort;

    @Column(name = "ct_attachment_limit", nullable = false)
    private Integer attachmentLimit;

    @Column(name = "tx_smtp_server", length = 140)
    private String smtpServer;

    @Column(name = "is_use_tls", nullable = false)
    @ColumnDefault("0")
    private Boolean useTls;

    @Column(name = "is_use_ssl_for_outgoing", nullable = false)
    @ColumnDefault("0")
    private Boolean useSslForOutgoing;

    @Column(name = "tx_smtp_port", length = 140)
    private String smtpPort;

    @Column(name = "is_append_emails_to_sent_folder", nullable = false)
    @ColumnDefault("0")
    private Boolean appendEmailsToSentFolder;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
