package com.itbd.application.db.dao.integrations.oauth;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_oauth_authorization_code", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_authorization_code", columnNames = {"tx_authorization_code"})
})
public class OauthAuthorizationCodeDao {

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

    @Column(name = "tx_client", length = 140)
    private String client;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_scopes", columnDefinition = "text")
    private String scopes;

    @Column(name = "tx_authorization_code", unique = true, length = 140)
    private String authorizationCode;

    @Column(name = "dtt_expiration_time")
    private LocalDateTime expirationTime;

    @Column(name = "tx_redirect_uri_bound_to_authorization_code", length = 140)
    private String redirectUriBoundToAuthorizationCode;

    @Column(name = "tx_validity", length = 140)
    private String validity;

    @Column(name = "tx_nonce", length = 140)
    private String nonce;

    @Column(name = "tx_code_challenge", length = 140)
    private String codeChallenge;

    @Column(name = "tx_code_challenge_method", length = 140)
    private String codeChallengeMethod;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
