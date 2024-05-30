package com.itbd.application.db.dao.accounts;


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
@Table(name = "t_payment_request", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PaymentRequestDao {

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

    @Column(name = "tx_payment_request_type", length = 140)
    @ColumnDefault("'Inward'")
    private String paymentRequestType;

    @Column(name = "dt_transaction_date")
    private LocalDate transactionDate;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_mode_of_payment", length = 140)
    private String modeOfPayment;

    @Column(name = "tx_party_type", length = 140)
    private String partyType;

    @Column(name = "tx_party", length = 140)
    private String party;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "flt_grand_total", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal grandTotal;

    @Column(name = "is_a_subscription", nullable = false)
    @ColumnDefault("0")
    private Boolean isASubscription;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_bank_account", length = 140)
    private String bankAccount;

    @Column(name = "tx_bank", length = 140)
    private String bank;

    @Column(name = "tx_bank_account_no", length = 140)
    private String bankAccountNo;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_iban", length = 140)
    private String iban;

    @Column(name = "tx_branch_code", length = 140)
    private String branchCode;

    @Column(name = "tx_swift_number", length = 140)
    private String swiftNumber;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_print_format", length = 140)
    private String printFormat;

    @Column(name = "tx_email_to", length = 140)
    private String emailTo;

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_payment_gateway_account", length = 140)
    private String paymentGatewayAccount;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "is_make_sales_invoice", nullable = false)
    @ColumnDefault("0")
    private Boolean makeSalesInvoice;

    @Column(name = "tx_message", columnDefinition = "text")
    private String message;

    @Column(name = "is_mute_email", nullable = false)
    @ColumnDefault("0")
    private Boolean muteEmail;

    @Column(name = "tx_payment_url", length = 500)
    private String paymentUrl;

    @Column(name = "tx_payment_gateway", length = 140)
    private String paymentGateway;

    @Column(name = "tx_payment_account", length = 140)
    private String paymentAccount;

    @Column(name = "tx_payment_channel", length = 140)
    private String paymentChannel;

    @Column(name = "tx_payment_order", length = 140)
    private String paymentOrder;

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
