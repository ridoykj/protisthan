package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_success_action", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_ref_doc_type", columnNames = {"tx_ref_doc_type"})
})
public class SuccessActionDao {

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

    @Column(name = "tx_ref_doc_type", unique = true, length = 140)
    private String refDocType;

    @Column(name = "tx_first_success_message", length = 140)
    @ColumnDefault("'Congratulations on first creations'")
    private String firstSuccessMessage;

    @Column(name = "tx_message", length = 140)
    @ColumnDefault("'Successfully created'")
    private String message;

    @Column(name = "tx_next_actions", length = 140)
    private String nextActions;

    @Column(name = "ct_action_timeout", nullable = false)
    @ColumnDefault("7")
    private Integer actionTimeout;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
