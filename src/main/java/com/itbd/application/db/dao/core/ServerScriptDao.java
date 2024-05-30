package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_server_script", indexes = {
        @Index(name = "idx_reference_doc_type", columnList = "tx_reference_doc_type"),
        @Index(name = "idx_module", columnList = "tx_module"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ServerScriptDao {

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

    @Column(name = "tx_script_type", length = 140)
    private String scriptType;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_event_frequency", length = 140)
    private String eventFrequency;

    @Column(name = "tx_cron_format", length = 140)
    private String cronFormat;

    @Column(name = "tx_doc_type_event", length = 140)
    private String docTypeEvent;

    @Column(name = "tx_api_method", length = 140)
    private String apiMethod;

    @Column(name = "is_allow_guest", nullable = false)
    @ColumnDefault("0")
    private Boolean allowGuest;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_script", columnDefinition = "longtext")
    private String script;

    @Column(name = "is_enable_rate_limit", nullable = false)
    @ColumnDefault("0")
    private Boolean enableRateLimit;

    @Column(name = "ct_rate_limit_count", nullable = false)
    @ColumnDefault("5")
    private Integer rateLimitCount;

    @Column(name = "ct_rate_limit_seconds", nullable = false)
    @ColumnDefault("86400")
    private Integer rateLimitSeconds;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
