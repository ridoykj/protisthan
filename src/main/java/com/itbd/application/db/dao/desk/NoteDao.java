package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_note", indexes = {
        @Index(name = "idx_expire_notification_on", columnList = "dt_expire_notification_on"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class NoteDao {

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

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "is_public", nullable = false)
    @ColumnDefault("0")
    private Boolean publics;

    @Column(name = "is_notify_on_login", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyOnLogin;

    @Column(name = "is_notify_on_every_login", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyOnEveryLogin;

    @Column(name = "dt_expire_notification_on")
    private LocalDate expireNotificationOn;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
