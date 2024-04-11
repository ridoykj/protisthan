package com.itbd.application.db.dao.workstation;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_workstation_type", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_workstation_type", columnNames = {"tx_workstation_type"})
})
public class WorkstationTypeDao {

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

    @Column(name = "tx_workstation_type", unique = true, length = 140)
    private String workstationType;

    @Column(name = "flt_hour_rate_electricity", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRateElectricity;

    @Column(name = "flt_hour_rate_consumable", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRateConsumable;

    @Column(name = "flt_hour_rate_rent", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRateRent;

    @Column(name = "flt_hour_rate_labour", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRateLabour;

    @Column(name = "flt_hour_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal hourRate;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
