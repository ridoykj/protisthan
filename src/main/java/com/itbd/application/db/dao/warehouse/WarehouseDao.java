package com.itbd.application.db.dao.warehouse;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_warehouse", indexes = {
        @Index(name = "idx_parent_warehouse", columnList = "tx_parent_warehouse"),
        @Index(name = "idx_company", columnList = "tx_company"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class WarehouseDao {

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

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_warehouse_name", length = 140)
    private String warehouseName;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "tx_parent_warehouse", length = 140)
    private String parentWarehouse;

    @Column(name = "is_rejected_warehouse", nullable = false)
    @ColumnDefault("0")
    private Boolean isRejectedWarehouse;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_phone_no", length = 140)
    private String phoneNo;

    @Column(name = "tx_mobile_no", length = 140)
    private String mobileNo;

    @Column(name = "tx_address_line_1", length = 140)
    private String addressLine1;

    @Column(name = "tx_address_line_2", length = 140)
    private String addressLine2;

    @Column(name = "tx_city", length = 140)
    private String city;

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_pin", length = 140)
    private String pin;

    @Column(name = "tx_warehouse_type", length = 140)
    private String warehouseType;

    @Column(name = "tx_default_in_transit_warehouse", length = 140)
    private String defaultInTransitWarehouse;

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
