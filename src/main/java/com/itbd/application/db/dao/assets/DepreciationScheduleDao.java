package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_depreciation_schedule", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class DepreciationScheduleDao {

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

    @Column(name = "dt_schedule_date")
    private LocalDate scheduleDate;

    @Column(name = "flt_depreciation_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal depreciationAmount;

    @Column(name = "flt_accumulated_depreciation_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal accumulatedDepreciationAmount;

    @Column(name = "tx_journal_entry", length = 140)
    private String journalEntry;

    @Column(name = "tx_shift", length = 140)
    private String shift;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
