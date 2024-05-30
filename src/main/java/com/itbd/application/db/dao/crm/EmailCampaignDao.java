package com.itbd.application.db.dao.aaa.crm;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_campaign", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class EmailCampaignDao {

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

    @Column(name = "tx_campaign_name", length = 140)
    private String campaignName;

    @Column(name = "tx_email_campaign_for", length = 140)
    @ColumnDefault("'Lead'")
    private String emailCampaignFor;

    @Column(name = "tx_recipient", length = 140)
    private String recipient;

    @Column(name = "tx_sender", length = 140)
    private String sender;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
