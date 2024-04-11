package com.itbd.application.db.dao.subscription;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_subscription_plan", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_plan_name", columnNames = {"tx_plan_name"})
})
public class SubscriptionPlanDao {

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

    @Column(name = "tx_plan_name", unique = true, length = 140)
    private String planName;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_item", length = 140)
    private String item;

    @Column(name = "tx_price_determination", length = 140)
    private String priceDetermination;

    @Column(name = "flt_cost", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal cost;

    @Column(name = "tx_price_list", length = 140)
    private String priceList;

    @Column(name = "tx_billing_interval", length = 140)
    @ColumnDefault("'Day'")
    private String billingInterval;

    @Column(name = "ct_billing_interval_count", nullable = false)
    private Integer billingIntervalCount;

    @Column(name = "tx_product_price_id", length = 140)
    private String productPriceId;

    @Column(name = "tx_payment_gateway", length = 140)
    private String paymentGateway;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
