package com.itbd.application.db.dao.website;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_help_article", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class HelpArticleDao {

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

    @Column(name = "tx_category", length = 140)
    private String category;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

    @Column(name = "tx_author", length = 140)
    @ColumnDefault("'user fullname'")
    private String author;

    @Column(name = "tx_level", length = 140)
    private String level;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "ct_likes", nullable = false)
    private Integer likes;

    @Column(name = "tx_route", length = 140)
    private String route;

    @Column(name = "ct_helpful", nullable = false)
    private Integer helpful;

    @Column(name = "ct_not_helpful", nullable = false)
    private Integer notHelpful;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
