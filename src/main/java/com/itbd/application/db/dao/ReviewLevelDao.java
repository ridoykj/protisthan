package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_review_level", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_level_name", columnNames = {"tx_level_name"}),
        @UniqueConstraint(name = "uk_role", columnNames = {"tx_role"})
})
public class ReviewLevelDao {

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

    @Column(name = "tx_level_name", unique = true, length = 140)
    private String levelName;

    @Column(name = "tx_role", unique = true, length = 140)
    private String role;

    @Column(name = "ct_review_points", nullable = false)
    private Integer reviewPoints;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
