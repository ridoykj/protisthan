package com.itbd.application.db.dao.integrations.webhook;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_webhook", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class WebhookDao {

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

    @Column(name = "tx_webhook_doc_type", length = 140)
    private String webhookDocType;

    @Column(name = "tx_webhook_doc_event", length = 140)
    private String webhookDocEvent;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_condition", columnDefinition = "text")
    private String condition;

    @Column(name = "tx_request_url", columnDefinition = "text")
    private String requestUrl;

    @Column(name = "is_dynamic_url", nullable = false)
    @ColumnDefault("0")
    private Boolean isDynam;

    @Column(name = "ct_timeout", nullable = false)
    @ColumnDefault("5")
    private Integer timeout;

    @Column(name = "tx_background_jobs_queue", length = 140)
    private String backgroundJobsQueue;

    @Column(name = "tx_request_method", length = 140)
    @ColumnDefault("'POST'")
    private String requestMethod;

    @Column(name = "tx_request_structure", length = 140)
    private String requestStructure;

    @Column(name = "is_enable_security", nullable = false)
    @ColumnDefault("0")
    private Boolean enableSecurity;

    @Column(name = "tx_webhook_secret", columnDefinition = "text")
    private String webhookSecret;

    @Column(name = "tx_webhook_json", columnDefinition = "longtext")
    private String webhookJson;

    @Column(name = "tx_preview_document", length = 140)
    private String previewDocument;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
