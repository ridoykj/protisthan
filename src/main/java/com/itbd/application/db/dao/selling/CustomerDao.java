package com.itbd.application.db.dao.selling;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_customer", indexes = {
        @Index(name = "idx_customer_name", columnList = "tx_customer_name"),
        @Index(name = "idx_customer_group", columnList = "tx_customer_group"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_represents_company", columnNames = {"tx_represents_company"})
})
@DynamicInsert
public class CustomerDao {

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
    private String namingSeries;

    @Column(name = "tx_salutation", length = 140)
    private String salutation;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_customer_type", length = 140)
    @ColumnDefault("'Company'")
    private String customerType;

    @Column(name = "tx_customer_group", length = 140)
    private String customerGroup;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "tx_gender", length = 140)
    private String gender;

    @Column(name = "tx_lead_name", length = 140)
    private String leadName;

    @Column(name = "tx_opportunity_name", length = 140)
    private String opportunityName;

    @Column(name = "tx_account_manager", length = 140)
    private String accountManager;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_default_currency", length = 140)
    private String defaultCurrency;

    @Column(name = "tx_default_bank_account", length = 140)
    private String defaultBankAccount;

    @Column(name = "tx_default_price_list", length = 140)
    private String defaultPriceList;

    @Column(name = "is_internal_customer", nullable = false)
    @ColumnDefault("0")
    private Boolean isInternalCustomer;

    @Column(name = "tx_represents_company", unique = true, length = 140)
    private String representsCompany;

    @Column(name = "tx_market_segment", length = 140)
    private String marketSegment;

    @Column(name = "tx_industry", length = 140)
    private String industry;

    @Column(name = "tx_customer_pos_id", length = 140)
    private String customerPosId;

    @Column(name = "tx_website", length = 140)
    private String website;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_customer_details", columnDefinition = "text")
    private String customerDetails;

    @Column(name = "tx_customer_primary_address", length = 140)
    private String customerPrimaryAddress;

    @Column(name = "tx_primary_address", columnDefinition = "text")
    private String primaryAddress;

    @Column(name = "tx_customer_primary_contact", length = 140)
    private String customerPrimaryContact;

    @Column(name = "tx_mobile_no", length = 140)
    private String mobileNo;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_tax_id", length = 140)
    private String taxId;

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "tx_tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @Column(name = "tx_payment_terms", length = 140)
    private String paymentTerms;

    @Column(name = "tx_loyalty_program", length = 140)
    private String loyaltyProgram;

    @Column(name = "tx_loyalty_program_tier", length = 140)
    private String loyaltyProgramTier;

    @Column(name = "tx_default_sales_partner", length = 140)
    private String defaultSalesPartner;

    @Column(name = "flt_default_commission_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal defaultCommissionRate;

    @Column(name = "is_so_required", nullable = false)
    @ColumnDefault("0")
    private Boolean soRequired;

    @Column(name = "is_dn_required", nullable = false)
    @ColumnDefault("0")
    private Boolean dnRequired;

    @Column(name = "is_frozen", nullable = false)
    @ColumnDefault("0")
    private Boolean isFrozen;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
