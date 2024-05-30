package com.itbd.application.db.dao.utilities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_video", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_title", columnNames = {"tx_title"})
})
public class VideoDao {

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

    @Column(name = "tx_title", unique = true, length = 140)
    private String title;

    @Column(name = "tx_provider", length = 140)
    private String provider;

    @Column(name = "tx_url", length = 140)
    private String url;

    @Column(name = "tx_youtube_video_id", length = 140)
    private String youtubeVideoId;

    @Column(name = "dt_publishDate")
    private LocalDate publishDate;

    @Column(name = "flt_duration", precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal duration;

    @Column(name = "flt_like_count", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal likeCount;

    @Column(name = "flt_view_count", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal viewCount;

    @Column(name = "flt_dislike_count", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal dislikeCount;

    @Column(name = "flt_comment_count", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal commentCount;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
