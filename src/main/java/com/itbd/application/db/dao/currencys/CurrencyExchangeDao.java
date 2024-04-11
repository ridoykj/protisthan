package com.itbd.application.db.dao.currencys;


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
@Table(name = "t_currency_exchange", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class CurrencyExchangeDao {

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

    @Column(name = "dt_date")
    private LocalDate date;

    @Column(name = "tx_from_currency", length = 140)
    private String fromCurrency;

    @Column(name = "tx_to_currency", length = 140)
    private String toCurrency;

    @Column(name = "flt_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal exchangeRate;

    @Column(name = "is_for_buying", nullable = false)
    @ColumnDefault("1")
    private Boolean forBuying;

    @Column(name = "is_for_selling", nullable = false)
    @ColumnDefault("1")
    private Boolean forSelling;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
