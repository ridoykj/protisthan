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
@Table(name = "t_auto_repeat", indexes = {
        @Index(name = "idx_next_schedule_date", columnList = "dt_next_schedule_date"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AutoRepeatDao {

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

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_document", length = 140)
    private String referenceDocument;

    @Column(name = "is_submit_on_creation", nullable = false)
    @ColumnDefault("0")
    private Boolean submitOnCreation;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "ct_repeat_on_day", nullable = false)
    private Integer repeatOnDay;

    @Column(name = "is_repeat_on_last_day", nullable = false)
    @ColumnDefault("0")
    private Boolean repeatOnLastDay;

    @Column(name = "dt_next_schedule_date")
    private LocalDate nextScheduleDate;

    @Column(name = "is_notify_by_email", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyByEmail;

    @Column(name = "tx_recipients", columnDefinition = "text")
    private String recipients;

    @Column(name = "tx_template", length = 140)
    private String template;

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_message", columnDefinition = "text")
    @ColumnDefault("'Please find attached {{ doc.doctype }} #{{ doc.name }}'")
    private String message;

    @Column(name = "tx_print_format", length = 140)
    private String printFormat;

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
