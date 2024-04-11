package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_connected_app", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ConnectedAppDao {

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

    @Column(name = "tx_provider_name", length = 140)
    private String providerName;

    @Column(name = "tx_openid_configuration", length = 140)
    private String openidConfiguration;

    @Column(name = "tx_client_id", length = 140)
    private String clientId;

    @Column(name = "tx_redirect_uri", length = 140)
    private String redirectUri;

    @Column(name = "tx_client_secret", columnDefinition = "text")
    private String clientSecret;

    @Column(name = "tx_authorization_uri", columnDefinition = "text")
    private String authorizationUri;

    @Column(name = "tx_token_uri", length = 140)
    private String tokenUri;

    @Column(name = "tx_revocation_uri", length = 140)
    private String revocationUri;

    @Column(name = "tx_userinfo_uri", length = 140)
    private String userinfoUri;

    @Column(name = "tx_introspection_uri", length = 140)
    private String introspectionUri;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
