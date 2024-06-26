package com.itbd.application.db.dao.quality_management;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_non_conformance", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class NonConformanceDao {

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

    @Column(name = "tx_subject", length = 140)
    private String subject;

    @Column(name = "tx_procedure", length = 140)
    private String procedure;

    @Column(name = "tx_process_owner", length = 140)
    private String processOwner;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_details", columnDefinition = "longtext")
    private String details;

    @Column(name = "tx_corrective_action", columnDefinition = "longtext")
    private String correctiveAction;

    @Column(name = "tx_preventive_action", columnDefinition = "longtext")
    private String preventiveAction;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
