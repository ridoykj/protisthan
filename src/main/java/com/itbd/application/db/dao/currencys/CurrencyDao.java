package com.itbd.application.db.dao.currencys;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_currency", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_currency_name", columnNames = {"tx_currency_name"})
})
public class CurrencyDao {

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

    @Column(name = "tx_currency_name", unique = true, length = 140)
    private String currencyName;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("0")
    private Boolean enabled;

    @Column(name = "tx_fraction", length = 140)
    private String fraction;

    @Column(name = "ct_fraction_units", nullable = false)
    private Integer fractionUnits;

    @Column(name = "flt_smallest_currency_fraction_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal smallestCurrencyFractionValue;

    @Column(name = "tx_symbol", length = 140)
    private String symbol;

    @Column(name = "is_symbol_on_right", nullable = false)
    @ColumnDefault("0")
    private Boolean symbolOnRight;

    @Column(name = "tx_number_format", length = 140)
    private String numberFormat;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
