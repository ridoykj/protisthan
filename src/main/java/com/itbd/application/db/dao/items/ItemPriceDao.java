package com.itbd.application.db.dao.items;


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
@Table(name = "t_item_price", indexes = {
        @Index(name = "idx_item_code", columnList = "tx_item_code"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ItemPriceDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "ct_packing_unit", nullable = false)
    private Integer packingUnit;

    @Column(name = "tx_itemName", length = 140)
    private String itemName;

    @Column(name = "tx_brand", length = 140)
    private String brand;

    @Column(name = "tx_item_description", columnDefinition = "text")
    private String itemDescription;

    @Column(name = "tx_price_list", length = 140)
    private String priceList;

    @Column(name = "tx_customer", length = 140)
    private String customer;

    @Column(name = "tx_supplier", length = 140)
    private String supplier;

    @Column(name = "tx_batchNo", length = 140)
    private String batchNo;

    @Column(name = "is_buying", nullable = false)
    @ColumnDefault("0")
    private Boolean buying;

    @Column(name = "is_selling", nullable = false)
    @ColumnDefault("0")
    private Boolean selling;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "flt_price_list_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal priceListRate;

    @Column(name = "dt_validFrom")
    private LocalDate validFrom;

    @Column(name = "ct_lead_time_days", nullable = false)
    private Integer leadTimeDays;

    @Column(name = "dt_validUpto")
    private LocalDate validUpto;

    @Column(name = "tx_note", columnDefinition = "text")
    private String note;

    @Column(name = "tx_reference", length = 140)
    private String reference;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
