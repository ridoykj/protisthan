package com.itbd.application.db.dao.integrations;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_integration_request", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class IntegrationRequestDao {

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

    @Column(name = "tx_request_id", length = 140)
    private String requestId;

    @Column(name = "tx_integration_request_service", length = 140)
    private String integrationRequestService;

    @Column(name = "is_remote_request", nullable = false)
    @ColumnDefault("0")
    private Boolean isRemoteRequest;

    @Column(name = "tx_request_description", length = 140)
    private String requestDescription;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Queued'")
    private String status;

    @Column(name = "tx_url", columnDefinition = "text")
    private String url;

    @Column(name = "tx_request_headers", columnDefinition = "longtext")
    private String requestHeaders;

    @Column(name = "tx_data", columnDefinition = "longtext")
    private String data;

    @Column(name = "tx_output", columnDefinition = "longtext")
    private String output;

    @Column(name = "tx_error", columnDefinition = "longtext")
    private String error;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_doc_name", length = 140)
    private String referenceDocName;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
