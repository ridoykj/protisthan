package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_exchange_rate_revaluation_account", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ExchangeRateRevaluationAccountDao {

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

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_account_currency", length = 140)
    private String accountCurrency;

    @Column(name = "flt_balance_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal balanceInAccountCurrency;

    @Column(name = "flt_new_balance_in_account_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal newBalanceInAccountCurrency;

    @Column(name = "flt_current_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal currentExchangeRate;

    @Column(name = "flt_new_exchange_rate", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal newExchangeRate;

    @Column(name = "flt_balance_in_base_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal balanceInBaseCurrency;

    @Column(name = "flt_new_balance_in_base_currency", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal newBalanceInBaseCurrency;

    @Column(name = "flt_gain_loss", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal gainLoss;

    @Column(name = "is_zero_balance", nullable = false)
    @ColumnDefault("0")
    private Boolean zeroBalance;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
