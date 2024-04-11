package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_letter_head", indexes = {
        @Index(name = "idx_is_default", columnList = "is_default"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_letter_head_name", columnNames = {"tx_letter_head_name"})
})
public class LetterHeadDao {

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

    @Column(name = "tx_letter_head_name", unique = true, length = 140)
    private String letterHeadName;

    @Column(name = "tx_source", length = 140)
    private String source;

    @Column(name = "tx_footer_source", length = 140)
    @ColumnDefault("'HTML'")
    private String footerSource;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("0")
    private Boolean isDefault;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "flt_image_height", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal imageHeight;

    @Column(name = "flt_image_width", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal imageWidth;

    @Column(name = "tx_align", length = 140)
    @ColumnDefault("'Left'")
    private String align;

    @Column(name = "tx_content", columnDefinition = "longtext")
    private String content;

    @Column(name = "tx_footer", columnDefinition = "longtext")
    private String footer;

    @Column(name = "tx_footer_image", columnDefinition = "text")
    private String footerImage;

    @Column(name = "flt_footer_image_height", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal footerImageHeight;

    @Column(name = "flt_footer_image_width", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal footerImageWidth;

    @Column(name = "tx_footer_align", length = 140)
    private String footerAlign;

    @Column(name = "tx_header_script", columnDefinition = "longtext")
    private String headerScript;

    @Column(name = "tx_footer_script", columnDefinition = "longtext")
    private String footerScript;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
