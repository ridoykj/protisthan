package com.itbd.application.db.dao.activitys;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_activity_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified"),
        @Index(name = "idx_reference_doc_type_reference_name_index", columnList = "tx_reference_doc_type, tx_reference_name"),
        @Index(name = "idx_timeline_doc_type_timeline_name_index", columnList = "tx_timeline_doc_type, tx_timeline_name")
})
@DynamicInsert
public class ActivityLogDao {

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

    @Column(name = "tx_subject", columnDefinition = "text")
    private String subject;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "dtt_communication_date")
    private LocalDateTime communicationDate;

    @Column(name = "tx_ip_address", length = 140)
    private String ipAddress;

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_reference_doc_type", length = 140)
    private String referenceDocType;

    @Column(name = "tx_reference_name", length = 140)
    private String referenceName;

    @Column(name = "tx_reference_owner", length = 140)
    private String referenceOwner;

    @Column(name = "tx_timeline_doc_type", length = 140)
    private String timelineDocType;

    @Column(name = "tx_timeline_name", length = 140)
    private String timelineName;

    @Column(name = "tx_link_doc_type", length = 140)
    private String linkDocType;

    @Column(name = "tx_link_name", length = 140)
    private String linkName;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

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
