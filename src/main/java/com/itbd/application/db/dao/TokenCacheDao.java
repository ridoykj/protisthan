package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_token_cache", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class TokenCacheDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_connected_app", length = 140)
    private String connectedApp;

    @Column(name = "tx_provider_name", length = 140)
    private String providerName;

    @Column(name = "tx_access_token", columnDefinition = "text")
    private String accessToken;

    @Column(name = "tx_refresh_token", columnDefinition = "text")
    private String refreshToken;

    @Column(name = "ct_expires_in", nullable = false)
    private Integer expiresIn;

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_success_uri", length = 140)
    private String successUri;

    @Column(name = "tx_token_type", length = 140)
    private String tokenType;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
