package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_dunning", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class DunningDao {

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
    @ColumnDefault("'DUNN-.MM.-.YY.-'")
    private String namingSeries;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_customer_name", length = 140)
    private String customerName;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tt_posting_time")
    private LocalTime postingTime;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Unresolved'")
    private String status;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_conversion_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal conversionRate;

    @Column(name = "tx_customer_address", length = 140)
    private String customerAddress;

    @Column(name = "tx_address_display", columnDefinition = "text")
    private String addressDisplay;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_contact_display", columnDefinition = "text")
    private String contactDisplay;

    @Column(name = "tx_company_address", length = 140)
    private String companyAddress;

    @Column(name = "tx_company_address_display", columnDefinition = "text")
    private String companyAddressDisplay;

    @Column(name = "tx_contact_mobile", columnDefinition = "text")
    private String contactMobile;

    @Column(name = "tx_contact_email", length = 140)
    private String contactEmail;

    @Column(name = "tx_dunning_type", length = 140)
    private String dunningType;

    @Column(name = "flt_rate_of_interest", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal rateOfInterest;

    @Column(name = "flt_total_interest", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalInterest;

    @Column(name = "flt_dunning_fee", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal dunningFee;

    @Column(name = "flt_dunning_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal dunningAmount;

    @Column(name = "flt_base_dunning_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal baseDunningAmount;

    @Column(name = "tx_spacer", length = 140)
    private String spacer;

    @Column(name = "flt_total_outstanding", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal totalOutstanding;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_body_text", columnDefinition = "longtext")
    private String bodyText;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_closing_text", columnDefinition = "longtext")
    private String closingText;

    @Column(name = "tx_income_account", length = 140)
    private String incomeAccount;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
