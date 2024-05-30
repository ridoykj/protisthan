package com.itbd.application.db.dao.automation;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_reminder", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_remind_at", columnList = "dtt_remind_at"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class ReminderDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "dtt_remind_at")
    private LocalDateTime remindAt;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_reminder_doc_type", length = 140)
    private String reminderDocType;

    @Column(name = "tx_reminder_doc_name", length = 140)
    private String reminderDocName;

    @Column(name = "is_notified", nullable = false)
    @ColumnDefault("0")
    private Boolean notified;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
