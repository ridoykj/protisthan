package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_payment_gateway_account", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PaymentGatewayAccountDao {

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

    @Column(name = "tx_payment_gateway", length = 140)
    private String paymentGateway;

    @Column(name = "tx_payment_channel", length = 140)
    @ColumnDefault("'Email'")
    private String paymentChannel;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "tx_payment_account", length = 140)
    private String paymentAccount;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_message", columnDefinition = "text")
    @ColumnDefault("'Please click on the link below to make your payment'")
    private String message;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
