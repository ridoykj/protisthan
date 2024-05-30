package com.itbd.application.db.dao.aaa.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_page_view", indexes = {
        @Index(name = "idx_visitor_id", columnList = "tx_visitor_id"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class WebPageViewDao {

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

    @Column(name = "tx_path", length = 140)
    private String path;

    @Column(name = "tx_referrer", length = 140)
    private String referrer;

    @Column(name = "tx_browser", length = 140)
    private String browser;

    @Column(name = "tx_browser_version", length = 140)
    private String browserVersion;

    @Column(name = "tx_is_unique", length = 140)
    private String isUnique;

    @Column(name = "tx_time_zone", length = 140)
    private String timeZone;

    @Column(name = "tx_user_agent", length = 140)
    private String userAgent;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_campaign", length = 140)
    private String campaign;

    @Column(name = "tx_medium", length = 140)
    private String medium;

    @Column(name = "tx_visitor_id", length = 140)
    private String visitorId;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
