package com.itbd.application.db.dao.support;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_service_level_priority", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ServiceLevelPriorityDao {

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

    @Column(name = "is_default_priority", nullable = false)
    @ColumnDefault("0")
    private Boolean defaultPriority;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "flt_response_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal responseTime;

    @Column(name = "flt_resolution_time", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal resolutionTime;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
