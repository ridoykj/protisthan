package com.itbd.application.db.dao.accounts.pos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_pos_opening_entry", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PosOpeningEntryDao {

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

    @Column(name = "dtt_period_start_date")
    private LocalDateTime periodStartDate;

    @Column(name = "dt_period_end_date")
    private LocalDate periodEndDate;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Draft'")
    private String status;

    @Column(name = "dt_posting_date")
    private LocalDate postingDate;

    @Column(name = "is_set_posting_date", nullable = false)
    @ColumnDefault("0")
    private Boolean setPostingDate;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_pos_profile", length = 140)
    private String posProfile;

    @Column(name = "tx_pos_closing_entry", length = 140)
    private String posClosingEntry;

    @Column(name = "tx_user", length = 140)
    private String user;

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
