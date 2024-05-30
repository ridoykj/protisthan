package com.itbd.application.db.dao.telephony;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_call_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_id", columnNames = {"tx_id"})
})
public class CallLogDao {

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

    @Column(name = "tx_id", unique = true, length = 140)
    private String id;

    @Column(name = "tx_fromm", length = 140)
    private String fromm;

    @Column(name = "tx_to", length = 140)
    private String to;

    @Column(name = "tx_call_received_by", length = 140)
    private String callReceivedBy;

    @Column(name = "tx_employee_user_id", length = 140)
    private String employeeUserId;

    @Column(name = "tx_medium", length = 140)
    private String medium;

    @Column(name = "dtt_start_time")
    private LocalDateTime startTime;

    @Column(name = "dtt_end_time")
    private LocalDateTime endTime;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "flt_duration", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal duration;

    @Column(name = "tx_recording_url", length = 140)
    private String recordingUrl;

    @Column(name = "tx_type_of_call", length = 140)
    private String typeOfCall;

    @Column(name = "tx_summary", columnDefinition = "text")
    private String summary;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
