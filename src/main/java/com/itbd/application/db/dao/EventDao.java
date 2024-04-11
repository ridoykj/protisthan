package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_event", indexes = {
        @Index(name = "idx_event_type", columnList = "tx_event_type"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class EventDao {

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

    @Column(name = "tx_subject", columnDefinition = "text")
    private String subject;

    @Column(name = "tx_event_category", length = 140)
    private String eventCategory;

    @Column(name = "tx_event_type", length = 140)
    private String eventType;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "is_send_reminder", nullable = false)
    @ColumnDefault("1")
    private Boolean sendReminder;

    @Column(name = "is_repeat_this_event", nullable = false)
    @ColumnDefault("0")
    private Boolean repeatThisEvent;

    @Column(name = "dtt_starts_on")
    private LocalDateTime startsOn;

    @Column(name = "dtt_ends_on")
    private LocalDateTime endsOn;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Open'")
    private String status;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "is_all_day", nullable = false)
    @ColumnDefault("0")
    private Boolean allDay;

    @Column(name = "ct_sync_with_google_calendar", nullable = false)
    private Integer syncWithGoogleCalendar;

    @Column(name = "ct_add_video_conferencing", nullable = false)
    private Integer addVideoConferencing;

    @Column(name = "tx_google_calendar", length = 140)
    private String googleCalendar;

    @Column(name = "tx_google_calendar_id", length = 140)
    private String googleCalendarId;

    @Column(name = "tx_google_calendar_event_id", length = 140)
    private String googleCalendarEventId;

    @Column(name = "tx_google_meet_link", length = 140)
    private String googleMeetLink;

    @Column(name = "is_pulled_from_google_calendar", nullable = false)
    @ColumnDefault("0")
    private Boolean pulledFromGoogleCalendar;

    @Column(name = "tx_repeat_on", length = 140)
    private String repeatOn;

    @Column(name = "dt_repeatTill")
    private LocalDate repeatTill;

    @Column(name = "is_monday", nullable = false)
    @ColumnDefault("0")
    private Boolean monday;

    @Column(name = "is_tuesday", nullable = false)
    @ColumnDefault("0")
    private Boolean tuesday;

    @Column(name = "is_wednesday", nullable = false)
    @ColumnDefault("0")
    private Boolean wednesday;

    @Column(name = "is_thursday", nullable = false)
    @ColumnDefault("0")
    private Boolean thursday;

    @Column(name = "is_friday", nullable = false)
    @ColumnDefault("0")
    private Boolean friday;

    @Column(name = "is_saturday", nullable = false)
    @ColumnDefault("0")
    private Boolean saturday;

    @Column(name = "is_sunday", nullable = false)
    @ColumnDefault("0")
    private Boolean sunday;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
