package com.itbd.application.db.dao.manufacturing.workstation;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_workstation_working_hour", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WorkstationWorkingHourDao {

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

    @Column(name = "tt_start_time")
    private LocalTime startTime;

    @Column(name = "flt_hours", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hours;

    @Column(name = "tt_end_time")
    private LocalTime endTime;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
