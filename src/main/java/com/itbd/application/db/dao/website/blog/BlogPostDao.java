package com.itbd.application.db.dao.website;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_blog_post", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_route", columnNames = {"tx_route"})
})
public class BlogPostDao {

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

    @Column(name = "tx_blog_category", length = 140)
    private String blogCategory;

    @Column(name = "tx_blogger", length = 140)
    private String blogger;

    @Column(name = "tx_route", unique = true, length = 140)
    private String route;

    @Column(name = "ct_read_time", nullable = false)
    private Integer readTime;

    @Column(name = "dt_publishedOn")
    private LocalDate publishedOn;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

    @Column(name = "is_featured", nullable = false)
    @ColumnDefault("0")
    private Boolean featured;

    @Column(name = "is_hideCta", nullable = false)
    @ColumnDefault("0")
    private Boolean hideCta;

    @Column(name = "is_enable_email_notification", nullable = false)
    @ColumnDefault("1")
    private Boolean enableEmailNotification;

    @Column(name = "is_disable_comments", nullable = false)
    @ColumnDefault("0")
    private Boolean disableComments;

    @Column(name = "is_disable_likes", nullable = false)
    @ColumnDefault("0")
    private Boolean disableLikes;

    @Column(name = "tx_blog_intro", columnDefinition = "text")
    private String blogIntro;

    @Column(name = "tx_content_type", length = 140)
    @ColumnDefault("'Markdown'")
    private String contentType;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "tx_content_md", columnDefinition = "longtext")
    private String contentMd;

    @Column(name = "tx_content_html", columnDefinition = "longtext")
    private String contentHtml;

    @Column(name = "is_email_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean emailSent;

    @Column(name = "tx_meta_title", length = 60)
    private String metaTitle;

    @Column(name = "tx_meta_description", columnDefinition = "text")
    private String metaDescription;

    @Column(name = "tx_meta_image", columnDefinition = "text")
    private String metaImage;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
