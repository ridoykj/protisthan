package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_shareholder", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_folio_no", columnNames = {"tx_folio_no"})
})
public class ShareholderDao {

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

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_folio_no", unique = true, length = 140)
    private String folioNo;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "is_company", nullable = false)
    @ColumnDefault("0")
    private Boolean isCompany;

    @Column(name = "tx_contact_list", columnDefinition = "longtext")
    private String contactList;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
