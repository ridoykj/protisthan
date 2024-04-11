package com.itbd.application.db.dao.website;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_website_theme", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_theme", columnNames = {"tx_theme"})
})
public class WebsiteThemeDao {

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

    @Column(name = "tx_theme", unique = true, length = 140)
    private String theme;

    @Column(name = "tx_module", length = 140)
    @ColumnDefault("'Website'")
    private String module;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("1")
    private Boolean custom;

    @Column(name = "tx_google_font", length = 140)
    private String googleFont;

    @Column(name = "tx_font_size", length = 140)
    private String fontSize;

    @Column(name = "tx_font_properties", length = 140)
    @ColumnDefault("'wght@300;400;500;600;700;800'")
    private String fontProperties;

    @Column(name = "is_button_rounded_corners", nullable = false)
    @ColumnDefault("1")
    private Boolean buttonRoundedCorners;

    @Column(name = "is_button_shadows", nullable = false)
    @ColumnDefault("0")
    private Boolean buttonShadows;

    @Column(name = "is_button_gradients", nullable = false)
    @ColumnDefault("0")
    private Boolean buttonGradients;

    @Column(name = "tx_primary_color", length = 140)
    private String primaryColor;

    @Column(name = "tx_text_color", length = 140)
    private String textColor;

    @Column(name = "tx_light_color", length = 140)
    private String lightColor;

    @Column(name = "tx_dark_color", length = 140)
    private String darkColor;

    @Column(name = "tx_background_color", length = 140)
    private String backgroundColor;

    @Column(name = "tx_custom_overrides", columnDefinition = "longtext")
    private String customOverrides;

    @Column(name = "tx_custom_scss", columnDefinition = "longtext")
    private String customScss;

    @Column(name = "tx_theme_scss", columnDefinition = "longtext")
    private String themeScss;

    @Column(name = "tx_theme_url", length = 140)
    private String themeUrl;

    @Column(name = "tx_js", columnDefinition = "longtext")
    private String js;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
