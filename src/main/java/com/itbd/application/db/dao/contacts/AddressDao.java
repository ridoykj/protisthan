package com.itbd.application.db.dao.contacts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_address", indexes = {
        @Index(name = "idx_city", columnList = "tx_city"),
        @Index(name = "idx_country", columnList = "tx_country"),
        @Index(name = "idx_pin_code", columnList = "tx_pin_code"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class AddressDao {

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

    @Column(name = "tx_address_title", length = 140)
    private String addressTitle;

    @Column(name = "tx_address_type", length = 140)
    private String addressType;

    @Column(name = "tx_address_line_1", length = 240)
    private String addressLine1;

    @Column(name = "tx_address_line_2", length = 240)
    private String addressLine2;

    @Column(name = "tx_city", length = 140)
    private String city;

    @Column(name = "tx_county", length = 140)
    private String county;

    @Column(name = "tx_state", length = 140)
    private String state;

    @Column(name = "tx_country", length = 140)
    private String country;

    @Column(name = "tx_pin_code", length = 140)
    private String pinCode;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_phone", length = 140)
    private String phone;

    @Column(name = "tx_fax", length = 140)
    private String fax;

    @Column(name = "is_primary_address", nullable = false)
    @ColumnDefault("0")
    private Boolean isPrimaryAddress;

    @Column(name = "is_shipping_address", nullable = false)
    @ColumnDefault("0")
    private Boolean isShippingAddress;

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

    @Column(name = "tx_tax_category", length = 140)
    private String taxCategory;

    @Column(name = "is_your_company_address", nullable = false)
    @ColumnDefault("0")
    private Boolean isYourCompanyAddress;

}
