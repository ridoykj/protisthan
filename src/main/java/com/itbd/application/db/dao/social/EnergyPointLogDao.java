package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_energy_point_log", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_reference_name", columnList = "tx_reference_name"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class EnergyPointLogDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_type", length = 140)
    private String type;

    @Column(name = "ct_points", nullable = false)
    private Integer points;

    @Column(name = "tx_rule", length = 140)
    private String rule;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "is_reverted", nullable = false)
    @ColumnDefault("0")
    private Boolean reverted;

    @Column(name = "tx_revert_of", length = 140)
    private String revertOf;

    @Column(name = "tx_reason", columnDefinition = "text")
    private String reason;

    @Column(name = "is_seen", nullable = false)
    @ColumnDefault("0")
    private Boolean seen;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
