package com.itbd.application.db.dao.accounts.pos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_pos_profile", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PosProfileDao {

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

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_warehouse", length = 140)
    private String warehouse;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "tx_company_address", length = 140)
    private String companyAddress;

    @Column(name = "is_hide_images", nullable = false)
    @ColumnDefault("0")
    private Boolean hideImages;

    @Column(name = "is_hide_unavailable_items", nullable = false)
    @ColumnDefault("0")
    private Boolean hideUnavailableItems;

    @Column(name = "is_auto_add_item_to_cart", nullable = false)
    @ColumnDefault("0")
    private Boolean autoAddItemToCart;

    @Column(name = "is_validate_stock_on_save", nullable = false)
    @ColumnDefault("0")
    private Boolean validateStockOnSave;

    @Column(name = "is_update_stock", nullable = false)
    @ColumnDefault("1")
    private Boolean updateStock;

    @Column(name = "is_ignore_pricing_rule", nullable = false)
    @ColumnDefault("0")
    private Boolean ignorePricingRule;

    @Column(name = "is_allow_rate_change", nullable = false)
    @ColumnDefault("0")
    private Boolean allowRateChange;

    @Column(name = "is_allow_discount_change", nullable = false)
    @ColumnDefault("0")
    private Boolean allowDiscountChange;

    @Column(name = "tx_print_format", length = 140)
    private String printFormat;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_tc_name", length = 140)
    private String tcName;

    @Column(name = "tx_select_print_heading", length = 140)
    private String selectPrintHeading;

    @Column(name = "tx_selling_price_list", length = 140)
    private String sellingPriceList;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_write_off_account", length = 140)
    private String writeOffAccount;

    @Column(name = "tx_write_off_cost_center", length = 140)
    private String writeOffCostCenter;

    @Column(name = "flt_write_off_limit", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("1.0")
    private BigDecimal writeOffLimit;

    @Column(name = "tx_account_for_change_amount", length = 140)
    private String accountForChangeAmount;

    @Column(name = "is_disable_rounded_total", nullable = false)
    @ColumnDefault("0")
    private Boolean disableRoundedTotal;

    @Column(name = "tx_income_account", length = 140)
    private String incomeAccount;

    @Column(name = "tx_expense_account", length = 140)
    private String expenseAccount;

    @Column(name = "tx_taxes_and_charges", length = 140)
    private String taxesAndCharges;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_apply_discount_on", length = 140)
    @ColumnDefault("'Grand Total'")
    private String applyDiscountOn;

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
