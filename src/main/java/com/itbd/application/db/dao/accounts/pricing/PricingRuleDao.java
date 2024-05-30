package com.itbd.application.db.dao.accounts.pricing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_pricing_rule", indexes = {
        @Index(name = "idx_warehouse", columnList = "tx_warehouse"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PricingRuleDao {

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

    @Column(name = "tx_naming_series", length = 140)
    @ColumnDefault("'PRLE-.####'")
    private String namingSeries;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "ct_disable", nullable = false)
    private Integer disable;

    @Column(name = "tx_apply_on", length = 140)
    @ColumnDefault("'Item Code'")
    private String applyOn;

    @Column(name = "tx_price_or_product_discount", length = 140)
    private String priceOrProductDiscount;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "is_mixed_conditions", nullable = false)
    @ColumnDefault("0")
    private Boolean mixedConditions;

    @Column(name = "is_cumulative", nullable = false)
    @ColumnDefault("0")
    private Boolean isCumulative;

    @Column(name = "is_coupon_code_based", nullable = false)
    @ColumnDefault("0")
    private Boolean couponCodeBased;

    @Column(name = "tx_apply_rule_on_other", length = 140)
    private String applyRuleOnOther;

    @Column(name = "tx_other_item_code", length = 140)
    private String otherItemCode;

    @Column(name = "tx_other_item_group", length = 140)
    private String otherItemGroup;

    @Column(name = "tx_other_brand", length = 140)
    private String otherBrand;

    @Column(name = "is_selling", nullable = false)
    @ColumnDefault("0")
    private Boolean selling;

    @Column(name = "is_buying", nullable = false)
    @ColumnDefault("0")
    private Boolean buying;

    @Column(name = "tx_applicable_for", length = 140)
    private String applicableFor;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_sales_partner", length = 140)
    private String salesPartner;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_supplier_group", length = 140)
    private String supplierGroup;

    @Column(name = "flt_min_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minQty;

    @Column(name = "flt_max_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxQty;

    @Column(name = "flt_min_amt", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal minAmt;

    @Column(name = "flt_max_amt", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal maxAmt;

    @Column(name = "is_same_item", nullable = false)
    @ColumnDefault("0")
    private Boolean sameItem;

    @Column(name = "tx_free_item", length = 140)
    private String freeItem;

    @Column(name = "flt_free_qty", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal freeQty;

    @Column(name = "flt_free_item_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal freeItemRate;

    @Column(name = "tx_free_item_uom", length = 140)
    private String freeItemUom;

    @Column(name = "is_round_free_qty", nullable = false)
    @ColumnDefault("0")
    private Boolean roundFreeQty;

    @Column(name = "is_recursive", nullable = false)
    @ColumnDefault("0")
    private Boolean isRecursive;

    @Column(name = "flt_recurse_for", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal recurseFor;

    @Column(name = "flt_apply_recursion_over", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal applyRecursionOver;

    @Column(name = "dt_validFrom")
    private LocalDate validFrom;

    @Column(name = "dt_validUpto")
    private LocalDate validUpto;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_margin_type", length = 140)
    @ColumnDefault("'Percentage'")
    private String marginType;

    @Column(name = "flt_margin_rate_or_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal marginRateOrAmount;

    @Column(name = "tx_rate_or_discount", length = 140)
    @ColumnDefault("'Discount Percentage'")
    private String rateOrDiscount;

    @Column(name = "tx_apply_discount_on", length = 140)
    @ColumnDefault("'Grand Total'")
    private String applyDiscountOn;

    @Column(name = "flt_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rate;

    @Column(name = "flt_discount_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountAmount;

    @Column(name = "flt_discount_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal discountPercentage;

    @Column(name = "tx_for_price_list", length = 140)
    private String forPriceList;

    @Column(name = "flt_threshold_percentage", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal thresholdPercentage;

    @Column(name = "tx_priority", length = 140)
    private String priority;

    @Column(name = "tx_condition", columnDefinition = "longtext")
    private String condition;

    @Column(name = "is_apply_multiple_pricing_rules", nullable = false)
    @ColumnDefault("0")
    private Boolean applyMultiplePricingRules;

    @Column(name = "is_apply_discount_on_rate", nullable = false)
    @ColumnDefault("0")
    private Boolean applyDiscountOnRate;

    @Column(name = "is_validate_applied_rule", nullable = false)
    @ColumnDefault("0")
    private Boolean validateAppliedRule;

    @Column(name = "tx_rule_description", columnDefinition = "text")
    private String ruleDescription;

    @Column(name = "tx_promotional_scheme_id", length = 140)
    private String promotionalSchemeId;

    @Column(name = "tx_promotional_scheme", length = 140)
    private String promotionalScheme;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
