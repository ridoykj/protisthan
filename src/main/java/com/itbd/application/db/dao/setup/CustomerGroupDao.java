package com.itbd.application.db.dao.aaa.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_customer_group", indexes = {
        @Index(name = "idx_lft", columnList = "ct_lft"),
        @Index(name = "idx_rgt", columnList = "ct_rgt"),
        @Index(name = "idx_lft_rgt_index", columnList = "ct_lft, ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_customer_group_name", columnNames = {"tx_customer_group_name"})
})
public class CustomerGroupDao {

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

    @Column(name = "tx_customer_group_name", unique = true, length = 140)
    private String customerGroupName;

    @Column(name = "tx_parent_customer_group", length = 140)
    private String parentCustomerGroup;

    @Column(name = "is_group", nullable = false)
    @ColumnDefault("0")
    private Boolean isGroup;

    @Column(name = "tx_default_price_list", length = 140)
    private String defaultPriceList;

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
