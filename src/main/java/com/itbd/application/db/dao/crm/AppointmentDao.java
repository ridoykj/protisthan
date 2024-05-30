package com.itbd.application.db.dao.aaa.crm;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_appointment", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AppointmentDao {

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

    @Column(name = "dtt_scheduled_time")
    private LocalDateTime scheduledTime;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_customer_phone_number", length = 140)
    private String customerPhoneNumber;

    @Column(name = "tx_customer_skype", length = 140)
    private String customerSkype;

    @Column(name = "tx_customer_email", length = 140)
    private String customerEmail;

    @Column(name = "tx_customer_details", columnDefinition = "longtext")
    private String customerDetails;

    @Column(name = "tx_appointment_with", length = 140)
    private String appointmentWith;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_calendar_event", length = 140)
    private String calendarEvent;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
