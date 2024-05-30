package com.itbd.application.db.dao.crm.contract;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_contract", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ContractDao {

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

    @Column(name = "tx_party_type", length = 140)
    @ColumnDefault("'Customer'")
    private String partyType;

    @Column(name = "is_signed", nullable = false)
    @ColumnDefault("0")
    private Boolean isSigned;

    @Column(name = "tx_party_name", length = 140)
    private String partyName;

    @Column(name = "tx_party_user", length = 140)
    private String partyUser;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_fulfilment_status", length = 140)
    private String fulfilmentStatus;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "tx_signe", length = 140)
    private String signe;

    @Column(name = "dtt_signed_on")
    private LocalDateTime signedOn;

    @Column(name = "tx_ip_address", length = 140)
    private String ipAddress;

    @Column(name = "tx_contract_template", length = 140)
    private String contractTemplate;

    @Column(name = "tx_contract_terms", columnDefinition = "longtext")
    private String contractTerms;

    @Column(name = "is_requires_fulfilment", nullable = false)
    @ColumnDefault("0")
    private Boolean requiresFulfilment;

    @Column(name = "dt_fulfilment_deadline")
    private LocalDate fulfilmentDeadline;

    @Column(name = "tx_signe_company", columnDefinition = "longtext")
    private String signeCompany;

    @Column(name = "tx_signed_by_company", length = 140)
    private String signedByCompany;

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_document_name", length = 140)
    private String documentName;

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

    @Column(name = "_seen", columnDefinition = "text")
    private String seen;

}
