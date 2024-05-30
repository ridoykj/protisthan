package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_notification_settings", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class NotificationSettingsDao {

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

    @Column(name = "is_enable_email_notifications", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailNotifications;

    @Column(name = "is_enable_email_mention", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailMention;

    @Column(name = "is_enable_email_assignment", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailAssignment;

    @Column(name = "is_enable_email_threads_on_assigned_document", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailThreadsOnAssignedDocument;

    @Column(name = "is_enable_email_energy_point", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailEnergyPoint;

    @Column(name = "is_enable_email_share", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailShare;

    @Column(name = "is_enable_email_event_reminders", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailEventReminders;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "is_seen", nullable = false)
    @ColumnDefault("0")
    private Boolean seen;

    @Column(name = "is_energy_points_system_notifications", nullable = false)
    @ColumnDefault("1")
    private Boolean energyPointsSystemNotifications;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
