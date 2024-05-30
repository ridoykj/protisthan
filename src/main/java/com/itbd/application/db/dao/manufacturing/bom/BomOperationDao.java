package com.itbd.application.db.dao.manufacturing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_operation", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class BomOperationDao {

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

    @Column(name = "ct_sequence_id", nullable = false)
    private Integer sequenceId;

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_workstation_type", length = 140)
    private String workstationType;

    @Column(name = "tx_workstation", length = 140)
    private String workstation;

    @Column(name = "flt_time_in_mins", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal timeInMins;

    @Column(name = "is_fixed_time", nullable = false)
    @ColumnDefault("0")
    private Boolean fixedTime;

    @Column(name = "flt_hour_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRate;

    @Column(name = "flt_base_hour_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseHourRate;

    @Column(name = "flt_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal operatingCost;

    @Column(name = "flt_base_operating_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseOperatingCost;

    @Column(name = "ct_batch_size", nullable = false)
    private Integer batchSize;

    @Column(name = "is_set_cost_based_on_bom_qty", nullable = false)
    @ColumnDefault("0")
    private Boolean setCostBasedOnBomQty;

    @Column(name = "flt_cost_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal costPerUnit;

    @Column(name = "flt_base_cost_per_unit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseCostPerUnit;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
