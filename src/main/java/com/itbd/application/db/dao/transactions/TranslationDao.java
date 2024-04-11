package com.itbd.application.db.dao.transactions;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_translation", indexes = {
        @Index(name = "idx_language", columnList = "tx_language"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class TranslationDao {

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

    @Column(name = "is_contributed", nullable = false)
    @ColumnDefault("0")
    private Boolean contributed;

    @Column(name = "tx_language", length = 140)
    private String language;

    @Column(name = "tx_source_text", columnDefinition = "longtext")
    private String sourceText;

    @Column(name = "tx_context", length = 140)
    private String context;

    @Column(name = "tx_translated_text", columnDefinition = "longtext")
    private String translatedText;

    @Column(name = "tx_contribution_status", length = 140)
    private String contributionStatus;

    @Column(name = "tx_contribution_doc_name", length = 140)
    private String contributionDocName;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
