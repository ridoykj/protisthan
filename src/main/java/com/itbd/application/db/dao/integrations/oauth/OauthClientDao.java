package com.itbd.application.db.dao.integrations.oauth;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_oauth_client", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class OauthClientDao {

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

    @Column(name = "tx_client_id", length = 140)
    private String clientId;

    @Column(name = "tx_app_name", length = 140)
    private String appName;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_client_secret", length = 140)
    private String clientSecret;

    @Column(name = "is_skip_authorization", nullable = false)
    @ColumnDefault("0")
    private Boolean skipAuthorization;

    @Column(name = "tx_scopes", columnDefinition = "text")
    @ColumnDefault("'all openid'")
    private String scopes;

    @Column(name = "tx_redirect_uris", columnDefinition = "text")
    private String redirectUris;

    @Column(name = "tx_default_redirect_uri", length = 140)
    private String defaultRedirectUri;

    @Column(name = "tx_grant_type", length = 140)
    private String grantType;

    @Column(name = "tx_response_type", length = 140)
    @ColumnDefault("'Code'")
    private String responseType;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
