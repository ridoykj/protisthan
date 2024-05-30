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
@Table(name = "t_sms_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class SmsLogDao {

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

    @Column(name = "tx_sender_name", length = 140)
    private String senderName;

    @Column(name = "dt_sent_on")
    private LocalDate sentOn;

    @Column(name = "tx_message", columnDefinition = "text")
    private String message;

    @Column(name = "ct_no_of_requested_sms", nullable = false)
    private Integer noOfRequestedSms;

    @Column(name = "tx_requested_numbers", columnDefinition = "longtext")
    private String requestedNumbers;

    @Column(name = "ct_no_of_sent_sms", nullable = false)
    private Integer noOfSentSms;

    @Column(name = "tx_sent_to", columnDefinition = "longtext")
    private String sentTo;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
