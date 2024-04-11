package com.itbd.application.db.dao.tasks;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_tax_rule", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class TaxRuleDao {

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

    @Column(name = "tx_tax_type", length = 140)
    @ColumnDefault("'Sales'")
    private String taxType;

    @Column(name = "is_use_for_shopping_cart", nullable = false)
    @ColumnDefault("1")
    private Boolean useForShoppingCart;

    @Column(name = "tx_sales_tax_template", length = 140)
    private String salesTaxTemplate;

    @Column(name = "tx_purchase_tax_template", length = 140)
    private String purchaseTaxTemplate;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_item", length = 140)
    private String item;

    @Column(name = "tx_billing_city", length = 140)
    private String billingCity;

    @Column(name = "tx_billing_county", length = 140)
    private String billingCounty;

    @Column(name = "tx_billing_state", length = 140)
    private String billingState;

    @Column(name = "tx_billing_zipcode", length = 140)
    private String billingZipcode;

    @Column(name = "tx_billing_country", length = 140)
    private String billingCountry;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_supplier_group", length = 140)
    private String supplierGroup;

    @Column(name = "tx_item_group", length = 140)
    private String itemGroup;

    @Column(name = "tx_shipping_city", length = 140)
    private String shippingCity;

    @Column(name = "tx_shipping_county", length = 140)
    private String shippingCounty;

    @Column(name = "tx_shipping_state", length = 140)
    private String shippingState;

    @Column(name = "tx_shipping_zipcode", length = 140)
    private String shippingZipcode;

    @Column(name = "tx_shipping_country", length = 140)
    private String shippingCountry;

    @Column(name = "dt_from_date")
    private LocalDate fromDate;

    @Column(name = "dt_to_date")
    private LocalDate toDate;

    @Column(name = "ct_priority", nullable = false)
    @ColumnDefault("1")
    private Integer priority;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
