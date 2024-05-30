package com.itbd.application.db.dao.telephony;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_incoming_call_handling_schedule", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class IncomingCallHandlingScheduleDao {

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

    @Column(name = "tx_day_of_week", length = 140)
    private String dayOfWeek;

    @Column(name = "tt_from_time")
    @ColumnDefault("'09:00:00'")
    private LocalTime fromTime;

    @Column(name = "tt_to_time")
    @ColumnDefault("'17:00:00'")
    private LocalTime toTime;

    @Column(name = "tx_agent_group", length = 140)
    private String agentGroup;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
