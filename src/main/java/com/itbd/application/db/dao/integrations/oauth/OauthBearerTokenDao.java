package com.itbd.application.db.dao.integrations.oauth;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_oauth_bearer_token", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_access_token", columnNames = {"tx_access_token"})
})
public class OauthBearerTokenDao {

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

    @Column(name = "tx_access_token", unique = true, length = 140)
    private String accessToken;

    @Column(name = "tx_refresh_token", length = 140)
    private String refreshToken;

    @Column(name = "dtt_expiration_time")
    private LocalDateTime expirationTime;

    @Column(name = "ct_expires_in", nullable = false)
    private Integer expiresIn;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
