package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_promotional_scheme", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PromotionalSchemeDao {

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

    @Column(name = "tx_apply_on", length = 140)
    @ColumnDefault("'Item_Code'")
    private String applyOn;

    @Column(name = "ct_disable", nullable = false)
    private Integer disable;

    @Column(name = "is_mixed_conditions", nullable = false)
    @ColumnDefault("0")
    private Boolean mixedConditions;

    @Column(name = "is_cumulative", nullable = false)
    @ColumnDefault("0")
    private Boolean isCumulative;

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

    @Column(name = "dt_validFrom")
    private LocalDate validFrom;

    @Column(name = "dt_validUpto")
    private LocalDate validUpto;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
