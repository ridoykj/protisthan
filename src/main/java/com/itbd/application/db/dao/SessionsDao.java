package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_sessions", indexes = {
        @Index(name = "idx_sid", columnList = "tx_sid"),
})
public class SessionsDao {

    @Id
    @Column(name = "tx_user", nullable = false, updatable = false)
    private String user;

    @Column(name = "tx_sid")
    private String sid;

    @Column(name = "tx_session_data", columnDefinition = "longtext")
    private String sessionData;

    @Column(name = "tx_ip_address", length = 16)
    private String ipAddress;

    @Column(name = "dtt_last_update")
    private LocalDateTime lastUpdate;

    @Column(name = "tx_status", length = 20)
    private String status;

}
