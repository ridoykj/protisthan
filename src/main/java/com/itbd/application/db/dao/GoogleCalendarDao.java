package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_google_calendar", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_calendar_name", columnNames = {"tx_calendar_name"})
})
public class GoogleCalendarDao {

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
    @ColumnDefault("1")
    private Boolean enable;

    @Column(name = "tx_calendar_name", unique = true, length = 140)
    private String calendarName;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "is_pull_from_google_calendar", nullable = false)
    @ColumnDefault("1")
    private Boolean pullFromGoogleCalendar;

    @Column(name = "is_push_to_google_calendar", nullable = false)
    @ColumnDefault("1")
    private Boolean pushToGoogleCalendar;

    @Column(name = "tx_google_calendar_id", length = 140)
    private String googleCalendarId;

    @Column(name = "tx_refresh_token", columnDefinition = "text")
    private String refreshToken;

    @Column(name = "tx_authorization_code", columnDefinition = "text")
    private String authorizationCode;

    @Column(name = "tx_next_sync_token", columnDefinition = "text")
    private String nextSyncToken;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
