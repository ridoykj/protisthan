package com.itbd.application.db.dao.stock.delivery;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_delivery_trip", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class DeliveryTripDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "is_email_notification_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean emailNotificationSent;

    @Column(name = "tx_driver", length = 140)
    private String driver;

    @Column(name = "tx_driver_name", length = 140)
    private String driverName;

    @Column(name = "tx_driver_email", length = 140)
    private String driverEmail;

    @Column(name = "tx_driver_address", length = 140)
    private String driverAddress;

    @Column(name = "flt_total_distance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalDistance;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "tx_vehicle", length = 140)
    private String vehicle;

    @Column(name = "dtt_departure_time")
    private LocalDateTime departureTime;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
