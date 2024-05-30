package com.itbd.application.db.dao.accounts.pricing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_pricing_rule_detail", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class PricingRuleDetailDao {

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

    @Column(name = "tx_pricing_rule", length = 140)
    private String pricingRule;

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_margin_type", length = 140)
    private String marginType;

    @Column(name = "tx_rate_or_discount", length = 140)
    private String rateOrDiscount;

    @Column(name = "tx_child_doc_name", length = 140)
    private String childDocName;

    @Column(name = "is_rule_applied", nullable = false)
    @ColumnDefault("1")
    private Boolean ruleApplied;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
