package com.itbd.application.db.dao.stock.item;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_item_default", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ItemDefaultDao {

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

    @Column(name = "tx_default_warehouse", length = 140)
    private String defaultWarehouse;

    @Column(name = "tx_default_price_list", length = 140)
    private String defaultPriceList;

    @Column(name = "tx_default_discount_account", length = 140)
    private String defaultDiscountAccount;

    @Column(name = "tx_buying_cost_center", length = 140)
    private String buyingCostCenter;

    @Column(name = "tx_default_supplier", length = 140)
    private String defaultSupplier;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_default_provisional_account", length = 140)
    private String defaultProvisionalAccount;

    @Column(name = "tx_selling_cost_center", length = 140)
    private String sellingCostCenter;

    @Column(name = "tx_income_account", length = 140)
    private String incomeAccount;

    @Column(name = "tx_deferred_expense_account", length = 140)
    private String deferredExpenseAccount;

    @Column(name = "tx_deferred_revenue_account", length = 140)
    private String deferredRevenueAccount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
