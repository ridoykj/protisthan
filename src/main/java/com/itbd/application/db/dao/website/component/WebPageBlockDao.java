package com.itbd.application.db.dao.aaa.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_page_block", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WebPageBlockDao {

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

    @Column(name = "tx_web_template", length = 140)
    private String webTemplate;

    @Column(name = "tx_web_template_values", columnDefinition = "longtext")
    private String webTemplateValues;

    @Column(name = "tx_css_class", columnDefinition = "text")
    private String cssClass;

    @Column(name = "tx_section_id", length = 140)
    private String sectionId;

    @Column(name = "is_add_container", nullable = false)
    @ColumnDefault("1")
    private Boolean addContainer;

    @Column(name = "is_add_top_padding", nullable = false)
    @ColumnDefault("1")
    private Boolean addTopPadding;

    @Column(name = "is_add_bottom_padding", nullable = false)
    @ColumnDefault("1")
    private Boolean addBottomPadding;

    @Column(name = "is_add_border_at_top", nullable = false)
    @ColumnDefault("0")
    private Boolean addBorderAtTop;

    @Column(name = "is_add_border_at_bottom", nullable = false)
    @ColumnDefault("0")
    private Boolean addBorderAtBottom;

    @Column(name = "is_add_shade", nullable = false)
    @ColumnDefault("0")
    private Boolean addShade;

    @Column(name = "is_hide_block", nullable = false)
    @ColumnDefault("0")
    private Boolean hideBlock;

    @Column(name = "is_add_background_image", nullable = false)
    @ColumnDefault("0")
    private Boolean addBackgroundImage;

    @Column(name = "tx_background_image", columnDefinition = "text")
    private String backgroundImage;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
