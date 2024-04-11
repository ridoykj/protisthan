package com.itbd.application.db.dao.items;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_item_manufacturer", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ItemManufacturerDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_manufacturer", length = 140)
    private String manufacturer;

    @Column(name = "tx_manufacturer_part_no", length = 140)
    private String manufacturerPartNo;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
