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
@Table(name = "t_delivery_stop", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DeliveryStopDao {

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

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_address", length = 140)
    private String address;

    @Column(name = "is_locked", nullable = false)
    @ColumnDefault("0")
    private Boolean locked;

    @Column(name = "tx_customer_address", columnDefinition = "text")
    private String customerAddress;

    @Column(name = "is_visited", nullable = false)
    @ColumnDefault("0")
    private Boolean visited;

    @Column(name = "tx_delivery_note", length = 140)
    private String deliveryNote;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "tx_contact", length = 140)
    private String contact;

    @Column(name = "tx_email_sent_to", length = 140)
    private String emailSentTo;

    @Column(name = "tx_customer_contact", columnDefinition = "text")
    private String customerContact;

    @Column(name = "flt_distance", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal distance;

    @Column(name = "dtt_estimated_arrival")
    private LocalDateTime estimatedArrival;

    @Column(name = "flt_lat", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal lat;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "flt_lng", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal lng;

    @Column(name = "tx_details", columnDefinition = "longtext")
    private String details;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
