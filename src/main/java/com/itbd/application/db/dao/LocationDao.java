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
@Table(name = "t_location", indexes = {
        @Index(name = "idx_parent_location", columnList = "tx_parent_location"),
        @Index(name = "idx_lft_rgt_index", columnList = "ct_lft, ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_location_name", columnNames = {"tx_location_name"})
})
public class LocationDao {

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

    @Column(name = "tx_location_name", unique = true, length = 140)
    private String locationName;

    @Column(name = "tx_parent_location", length = 140)
    private String parentLocation;

    @Column(name = "is_container", nullable = false)
    @ColumnDefault("0")
    private Boolean isContainer;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "flt_latitude", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal latitude;

    @Column(name = "flt_longitude", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal longitude;

    @Column(name = "flt_area", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal area;

    @Column(name = "tx_area_uom", length = 140)
    private String areaUom;

    @Column(name = "tx_location", columnDefinition = "longtext")
    private String location;

    @Column(name = "ct_lft", nullable = false)
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    private Integer rgt;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
