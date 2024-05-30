package com.itbd.application.db.dao.crm;

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
@Table(name = "t_prospect_opportunity", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ProspectOpportunityDao {

    @Id
    @Column(name = "id_name_key", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long name;

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

    @Column(name = "tx_opportunity", length = 140)
    private String opportunity;

    @Column(name = "flt_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal amount;

    @Column(name = "tx_stage", length = 140)
    private String stage;

    @Column(name = "tx_deal_owner", length = 140)
    private String dealOwner;

    @Column(name = "flt_probability", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal probability;

    @Column(name = "dt_expected_closing")
    private LocalDate expectedClosing;

    @Column(name = "tx_currency", length = 140)
    private String currency;

    @Column(name = "tx_contact_person", length = 140)
    private String contactPerson;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
