package com.itbd.application.db.dao.quality_management;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_quality_action_resolution", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class QualityActionResolutionDao {

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

    @Column(name = "tx_problem", columnDefinition = "longtext")
    private String problem;

    @Column(name = "tx_resolution", columnDefinition = "longtext")
    private String resolution;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_responsible", length = 140)
    private String responsible;

    @Column(name = "dt_completion_by")
    private LocalDate completionBy;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}