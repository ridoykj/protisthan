package com.itbd.application.db.dao.aaa.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_movement_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AssetMovementItemDao {

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

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_asset", length = 140)
    private String asset;

    @Column(name = "tx_source_location", length = 140)
    private String sourceLocation;

    @Column(name = "tx_from_employee", length = 140)
    private String fromEmployee;

    @Column(name = "tx_asset_name", length = 140)
    private String assetName;

    @Column(name = "tx_target_location", length = 140)
    private String targetLocation;

    @Column(name = "tx_to_employee", length = 140)
    private String toEmployee;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
