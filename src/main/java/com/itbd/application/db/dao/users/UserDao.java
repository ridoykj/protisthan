package com.itbd.application.db.dao.users;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_user", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_username", columnNames = {"tx_username"}),
        @UniqueConstraint(name = "uk_mobile_no", columnNames = {"tx_mobile_no"}),
        @UniqueConstraint(name = "uk_api_key", columnNames = {"tx_api_key"})
})
@DynamicInsert
public class UserDao {

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

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_email", length = 140)
    private String email;

    @Column(name = "tx_first_name", length = 140)
    private String firstName;

    @Column(name = "tx_middle_name", length = 140)
    private String middleName;

    @Column(name = "tx_last_name", length = 140)
    private String lastName;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

    @Column(name = "tx_username", unique = true, length = 140)
    private String username;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_time_zone", length = 140)
    private String timeZone;

    @Column(name = "is_send_welcome_email", nullable = false)
    @ColumnDefault("1")
    private Boolean sendWelcomeEmail;

    @Column(name = "is_unsubscribed", nullable = false)
    @ColumnDefault("0")
    private Boolean unsubscribed;

    @Column(name = "tx_user_image", columnDefinition = "text")
    private String userImage;

    @Column(name = "tx_role_profile_name", length = 140)
    private String roleProfileName;

    @Column(name = "tx_module_profile", length = 140)
    private String moduleProfile;

    @Column(name = "tx_home_settings", columnDefinition = "longtext")
    private String homeSettings;

    @Column(name = "tx_gender", length = 140)
    private String gender;

    @Column(name = "dt_birthDate")
    private LocalDate birthDate;

    @Column(name = "tx_interest", columnDefinition = "text")
    private String interest;

    @Column(name = "tx_phone", length = 140)
    private String phone;

    @Column(name = "tx_location", length = 140)
    private String location;

    @Column(name = "tx_bio", columnDefinition = "text")
    private String bio;

    @Column(name = "tx_mobile_no", unique = true, length = 140)
    private String mobileNo;

    @Column(name = "is_mute_sounds", nullable = false)
    @ColumnDefault("0")
    private Boolean muteSounds;

    @Column(name = "tx_desk_theme", length = 140)
    private String deskTheme;

    @Column(name = "tx_banner_image", columnDefinition = "text")
    private String bannerImage;

    @Column(name = "tx_new_password", columnDefinition = "text")
    private String newPassword;

    @Column(name = "is_logout_all_sessions", nullable = false)
    @ColumnDefault("1")
    private Boolean logoutAllSessions;

    @Column(name = "tx_reset_password_key", length = 140)
    private String resetPasswordKey;

    @Column(name = "dtt_last_reset_password_key_generated_on")
    private LocalDateTime lastResetPasswordKeyGeneratedOn;

    @Column(name = "dt_lastPasswordResetDate")
    private LocalDate lastPasswordResetDate;

    @Column(name = "tx_redirect_url", columnDefinition = "text")
    private String redirectUrl;

    @Column(name = "is_document_follow_notify", nullable = false)
    @ColumnDefault("0")
    private Boolean documentFollowNotify;

    @Column(name = "tx_document_follow_frequency", length = 140)
    @ColumnDefault("'Daily'")
    private String documentFollowFrequency;

    @Column(name = "is_follow_created_documents", nullable = false)
    @ColumnDefault("0")
    private Boolean followCreatedDocuments;

    @Column(name = "is_follow_commented_documents", nullable = false)
    @ColumnDefault("0")
    private Boolean followCommentedDocuments;

    @Column(name = "is_follow_liked_documents", nullable = false)
    @ColumnDefault("0")
    private Boolean followLikedDocuments;

    @Column(name = "is_follow_assigned_documents", nullable = false)
    @ColumnDefault("0")
    private Boolean followAssignedDocuments;

    @Column(name = "is_follow_shared_documents", nullable = false)
    @ColumnDefault("0")
    private Boolean followSharedDocuments;

    @Column(name = "tx_email_signature", columnDefinition = "text")
    private String emailSignature;

    @Column(name = "is_thread_notify", nullable = false)
    @ColumnDefault("1")
    private Boolean threadNotify;

    @Column(name = "is_send_me_a_copy", nullable = false)
    @ColumnDefault("0")
    private Boolean sendMeACopy;

    @Column(name = "is_allowed_in_mentions", nullable = false)
    @ColumnDefault("1")
    private Boolean allowedInMentions;

    @Column(name = "ct_simultaneous_sessions", nullable = false)
    @ColumnDefault("2")
    private Integer simultaneousSessions;

    @Column(name = "tx_restrict_ip", columnDefinition = "text")
    private String restrictIp;

    @Column(name = "tx_last_ip", length = 140)
    private String lastIp;

    @Column(name = "ct_login_after", nullable = false)
    private Integer loginAfter;

    @Column(name = "tx_user_type", length = 140)
    @ColumnDefault("'System User'")
    private String userType;

    @Column(name = "dtt_last_active")
    private LocalDateTime lastActive;

    @Column(name = "ct_login_before", nullable = false)
    private Integer loginBefore;

    @Column(name = "is_bypass_restrict_ip_check_if_2_fa_enabled", nullable = false)
    @ColumnDefault("0")
    private Boolean bypassRestrictIpCheckIf2faEnabled;

    @Column(name = "tx_last_login", length = 140)
    private String lastLogin;

    @Column(name = "tx_last_known_versions", columnDefinition = "text")
    private String lastKnownVersions;

    @Column(name = "tx_api_key", unique = true, length = 140)
    private String apiKey;

    @Column(name = "tx_api_secret", columnDefinition = "text")
    private String apiSecret;

    @Column(name = "tx_onboarding_status", columnDefinition = "text")
    @ColumnDefault("'{}'")
    private String onboardingStatus;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
