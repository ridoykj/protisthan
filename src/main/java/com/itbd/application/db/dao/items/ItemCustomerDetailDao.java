package com.itbd.application.db.dao.items;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_item_customer_detail", indexes = {
        @Index(name = "idx_customer_name", columnList = "tx_customer_name"),
        @Index(name = "idx_ref_code", columnList = "tx_ref_code"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ItemCustomerDetailDao {

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

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_ref_code", length = 140)
    private String refCode;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
