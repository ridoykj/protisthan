package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_serial_and_batch_entry", indexes = {
        @Index(name = "idx_serial_no", columnList = "tx_serial_no"),
        @Index(name = "idx_batch_no", columnList = "tx_batch_no"),
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
})
public class SerialAndBatchEntryDao {

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

    @Column(name = "tx_serial_no", length = 140)
    private String serialNo;

    @Column(name = "tx_batch_no", length = 140)
    private String batchNo;

    @Column(name = "flt_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal qty;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "flt_delivered_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal deliveredQty;

    @Column(name = "flt_incoming_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal incomingRate;

    @Column(name = "flt_outgoing_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal outgoingRate;

    @Column(name = "flt_stock_value_difference", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal stockValueDifference;

    @Column(name = "is_outward", nullable = false)
    @ColumnDefault("0")
    private Boolean isOutward;

    @Column(name = "tx_stock_queue", columnDefinition = "text")
    private String stockQueue;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
