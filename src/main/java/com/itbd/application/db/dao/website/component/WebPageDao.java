package com.itbd.application.db.dao.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_page", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_route", columnNames = {"tx_route"})
})
public class WebPageDao {

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

    @Column(name = "tx_route", unique = true, length = 140)
    private String route;

    @Column(name = "is_dynamic_route", nullable = false)
    @ColumnDefault("0")
    private Boolean dynamicRoute;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("1")
    private Boolean published;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_content_type", length = 140)
    @ColumnDefault("'Page_Builder'")
    private String contentType;

    @Column(name = "tx_slideshow", length = 140)
    private String slideshow;

    @Column(name = "is_dynamic_template", nullable = false)
    @ColumnDefault("0")
    private Boolean dynamicTemplate;

    @Column(name = "tx_main_section", columnDefinition = "longtext")
    private String mainSection;

    @Column(name = "tx_main_section_md", columnDefinition = "longtext")
    private String mainSectionMd;

    @Column(name = "tx_main_section_html", columnDefinition = "longtext")
    private String mainSectionHtml;

    @Column(name = "tx_context_script", columnDefinition = "longtext")
    private String contextScript;

    @Column(name = "tx_javascript", columnDefinition = "longtext")
    private String javascript;

    @Column(name = "is_insert_style", nullable = false)
    @ColumnDefault("0")
    private Boolean insertStyle;

    @Column(name = "tx_text_align", length = 140)
    private String textAlign;

    @Column(name = "tx_css", columnDefinition = "longtext")
    private String css;

    @Column(name = "is_full_width", nullable = false)
    @ColumnDefault("1")
    private Boolean fullWidth;

    @Column(name = "is_show_title", nullable = false)
    @ColumnDefault("0")
    private Boolean showTitle;

    @Column(name = "dtt_start_date")
    private LocalDateTime startDate;

    @Column(name = "dtt_end_date")
    private LocalDateTime endDate;

    @Column(name = "tx_meta_title", length = 140)
    private String metaTitle;

    @Column(name = "tx_meta_description", columnDefinition = "text")
    private String metaDescription;

    @Column(name = "tx_meta_image", columnDefinition = "text")
    private String metaImage;

    @Column(name = "is_show_sidebar", nullable = false)
    @ColumnDefault("0")
    private Boolean showSidebar;

    @Column(name = "tx_website_sidebar", length = 140)
    private String websiteSidebar;

    @Column(name = "is_enable_comments", nullable = false)
    @ColumnDefault("0")
    private Boolean enableComments;

    @Column(name = "tx_header", columnDefinition = "longtext")
    private String header;

    @Column(name = "tx_breadcrumbs", columnDefinition = "longtext")
    private String breadcrumbs;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
