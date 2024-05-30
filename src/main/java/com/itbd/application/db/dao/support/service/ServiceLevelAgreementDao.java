package com.itbd.application.db.dao.support;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_service_level_agreement", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ServiceLevelAgreementDao {

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

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_default_priority", length = 140)
    private String defaultPriority;

    @Column(name = "tx_service_level", length = 140)
    private String serviceLevel;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("1")
    private Boolean enabled;

    @Column(name = "is_default_service_level_agreement", nullable = false)
    @ColumnDefault("0")
    private Boolean defaultServiceLevelAgreement;

    @Column(name = "tx_entity_type", length = 140)
    private String entityType;

    @Column(name = "tx_entity", length = 140)
    private String entity;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "dt_startDate")
    private LocalDate startDate;

    @Column(name = "dt_endDate")
    private LocalDate endDate;

    @Column(name = "is_apply_sla_for_resolution", nullable = false)
    @ColumnDefault("1")
    private Boolean applySlaForResolution;

    @Column(name = "tx_holiday_list", length = 140)
    private String holidayList;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
