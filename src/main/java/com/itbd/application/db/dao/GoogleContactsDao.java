package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_google_contacts", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class GoogleContactsDao {

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

    @Column(name = "is_enable", nullable = false)
    @ColumnDefault("0")
    private Boolean enable;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "dtt_last_sync_on")
    private LocalDateTime lastSyncOn;

    @Column(name = "tx_authorization_code", columnDefinition = "text")
    private String authorizationCode;

    @Column(name = "tx_refresh_token", columnDefinition = "text")
    private String refreshToken;

    @Column(name = "tx_next_sync_token", columnDefinition = "text")
    private String nextSyncToken;

    @Column(name = "is_pull_from_google_contacts", nullable = false)
    @ColumnDefault("0")
    private Boolean pullFromGoogleContacts;

    @Column(name = "is_push_to_google_contacts", nullable = false)
    @ColumnDefault("0")
    private Boolean pushToGoogleContacts;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
