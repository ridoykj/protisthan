package com.itbd.application.db.dao.supplier;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_supplier_group", indexes = {
        @Index(name = "idx_lft", columnList = "ct_lft"),
        @Index(name = "idx_rgt", columnList = "ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_supplier_group_name", columnNames = {"tx_supplier_group_name"})
})
public class SupplierGroupDao {

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

    @Column(name = "tx_supplier_group_name", unique = true, length = 140)
    private String supplierGroupName;

    @Column(name = "tx_parent_supplier_group", length = 140)
    private String parentSupplierGroup;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "tx_payment_terms", length = 140)
    private String paymentTerms;

    @Column(name = "ct_lft", nullable = false)
    @ColumnDefault("0")
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    @ColumnDefault("0")
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
