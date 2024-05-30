package com.itbd.application.db.dao.manufacturing.bom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_update_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class BomUpdateLogDao {

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

    @Column(name = "tx_update_type", length = 140)
    private String updateType;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_current_bom", length = 140)
    private String currentBom;

    @Column(name = "tx_new_bom", length = 140)
    private String newBom;

    @Column(name = "tx_error_log", length = 140)
    private String errorLog;

    @Column(name = "ct_current_level", nullable = false)
    private Integer currentLevel;

    @Column(name = "tx_processed_boms", columnDefinition = "longtext")
    private String processedBoms;

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
