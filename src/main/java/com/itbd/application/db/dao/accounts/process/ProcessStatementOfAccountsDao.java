package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_process_statement_of_accounts", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ProcessStatementOfAccountsDao {

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

    @Column(name = "tx_report", length = 140)
    private String report;

    @Column(name = "dt_fromDate")
    private LocalDate fromDate;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_account", length = 140)
    private String account;

    @Column(name = "tx_group_by", length = 140)
    @ColumnDefault("'Group by Voucher (Consolidated)'")
    private String groupBy;

    @Column(name = "tx_territory", length = 140)
    private String territory;

    @Column(name = "is_ignore_exchange_rate_revaluation_journals", nullable = false)
    @ColumnDefault("0")
    private Boolean ignoreExchangeRateRevaluationJournals;

    @Column(name = "dt_toDate")
    private LocalDate toDate;

    @Column(name = "tx_finance_book", length = 140)
    private String financeBook;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_payment_terms_template", length = 140)
    private String paymentTermsTemplate;

    @Column(name = "tx_sales_partner", length = 140)
    private String salesPartner;

    @Column(name = "tx_sales_person", length = 140)
    private String salesPerson;

    @Column(name = "is_based_on_payment_terms", nullable = false)
    @ColumnDefault("0")
    private Boolean basedOnPaymentTerms;

    @Column(name = "tx_customer_collection", length = 140)
    private String customerCollection;

    @Column(name = "tx_collection_name", length = 140)
    private String collectionName;

    @Column(name = "is_primary_mandatory", nullable = false)
    @ColumnDefault("1")
    private Boolean primaryMandatory;

    @Column(name = "is_show_net_values_in_party_account", nullable = false)
    @ColumnDefault("0")
    private Boolean showNetValuesInPartyAccount;

    @Column(name = "tx_orientation", length = 140)
    private String orientation;

    @Column(name = "is_include_break", nullable = false)
    @ColumnDefault("1")
    private Boolean includeBreak;

    @Column(name = "is_include_ageing", nullable = false)
    @ColumnDefault("0")
    private Boolean includeAgeing;

    @Column(name = "tx_ageing_based_on", length = 140)
    @ColumnDefault("'Due Date'")
    private String ageingBasedOn;

    @Column(name = "tx_letter_head", length = 140)
    private String letterHead;

    @Column(name = "tx_terms_and_conditions", length = 140)
    private String termsAndConditions;

    @Column(name = "is_enable_auto_email", nullable = false)
    @ColumnDefault("0")
    private Boolean enableAutoEmail;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "ct_filter_duration", nullable = false)
    private Integer filterDuration;

    @Column(name = "dt_startDate")
    private LocalDate startDate;

    @Column(name = "tx_pdf_name", length = 140)
    private String pdfName;

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_cc_to", length = 140)
    private String ccTo;

    @Column(name = "tx_body", columnDefinition = "longtext")
    private String body;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
