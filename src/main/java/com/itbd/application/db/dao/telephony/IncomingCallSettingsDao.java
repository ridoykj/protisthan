package com.itbd.application.db.dao.telephony;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_incoming_call_settings", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class IncomingCallSettingsDao {

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

    @Column(name = "tx_call_routing", length = 140)
    @ColumnDefault("'Sequential'")
    private String callRouting;

    @Column(name = "tx_greeting_message", length = 140)
    private String greetingMessage;

    @Column(name = "tx_agent_busy_message", length = 140)
    private String agentBusyMessage;

    @Column(name = "tx_agent_unavailable_message", length = 140)
    private String agentUnavailableMessage;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
