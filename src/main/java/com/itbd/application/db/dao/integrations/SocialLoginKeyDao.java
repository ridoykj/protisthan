package com.itbd.application.db.dao.integrations;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_social_login_key", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class SocialLoginKeyDao {

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

    @Column(name = "is_enable_social_login", nullable = false)
    @ColumnDefault("0")
    private Boolean enableSocialLogin;

    @Column(name = "tx_social_login_provider", length = 140)
    @ColumnDefault("'Custom'")
    private String socialLoginProvider;

    @Column(name = "tx_client_id", length = 140)
    private String clientId;

    @Column(name = "tx_provider_name", length = 140)
    private String providerName;

    @Column(name = "tx_client_secret", columnDefinition = "text")
    private String clientSecret;

    @Column(name = "tx_icon", length = 140)
    private String icon;

    @Column(name = "tx_base_url", length = 140)
    private String baseUrl;

    @Column(name = "tx_sign_ups", length = 140)
    private String signUps;

    @Column(name = "tx_authorize_url", length = 140)
    private String authorizeUrl;

    @Column(name = "tx_access_token_url", length = 140)
    private String accessTokenUrl;

    @Column(name = "tx_redirect_url", length = 140)
    private String redirectUrl;

    @Column(name = "tx_api_endpoint", length = 140)
    private String apiEndpoint;

    @Column(name = "is_custom_base_url", nullable = false)
    @ColumnDefault("0")
    private Boolean customBaseUrl;

    @Column(name = "tx_api_endpoint_args", columnDefinition = "longtext")
    private String apiEndpointArgs;

    @Column(name = "tx_auth_url_data", columnDefinition = "longtext")
    private String authUrlData;

    @Column(name = "tx_user_id_property", length = 140)
    private String userIdProperty;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
