package com.itbd.application.db.dao.website.webhook;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_webhook_request_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class WebhookRequestLogDao {

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

    @Column(name = "tx_webhook", length = 140)
    private String webhook;

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "tx_headers", columnDefinition = "longtext")
    private String headers;

    @Column(name = "tx_data", columnDefinition = "longtext")
    private String data;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_url", length = 140)
    private String url;

    @Column(name = "tx_response", columnDefinition = "longtext")
    private String response;

    @Column(name = "tx_error", columnDefinition = "text")
    private String error;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
