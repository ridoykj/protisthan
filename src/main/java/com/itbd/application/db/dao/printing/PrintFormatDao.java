package com.itbd.application.db.dao.printing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_print_format", indexes = {
        @Index(name = "idx_standard", columnList = "tx_standard"),
        @Index(name = "idx_modified", columnList = "dtt_modified"),
})
public class PrintFormatDao {

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

    @Column(name = "tx_doc_type", length = 140)
    private String docType;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "tx_default_print_language", length = 140)
    private String defaultPrintLanguage;

    @Column(name = "tx_standard", length = 140)
    @ColumnDefault("'No'")
    private String standard;

    @Column(name = "is_custom_format", nullable = false)
    @ColumnDefault("0")
    private Boolean customFormat;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "tx_print_format_type", length = 140)
    @ColumnDefault("'Jinja'")
    private String printFormatType;

    @Column(name = "is_raw_printing", nullable = false)
    @ColumnDefault("0")
    private Boolean rawPrinting;

    @Column(name = "tx_html", columnDefinition = "longtext")
    private String html;

    @Column(name = "tx_raw_commands", columnDefinition = "longtext")
    private String rawCommands;

    @Column(name = "flt_margin_top", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal marginTop;

    @Column(name = "flt_margin_bottom", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal marginBottom;

    @Column(name = "flt_margin_left", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal marginLeft;

    @Column(name = "flt_margin_right", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("15.0")
    private BigDecimal marginRight;

    @Column(name = "is_align_labels_right", nullable = false)
    @ColumnDefault("0")
    private Boolean alignLabelsRight;

    @Column(name = "is_show_section_headings", nullable = false)
    @ColumnDefault("0")
    private Boolean showSectionHeadings;

    @Column(name = "is_line_breaks", nullable = false)
    @ColumnDefault("0")
    private Boolean lineBreaks;

    @Column(name = "is_absolute_value", nullable = false)
    @ColumnDefault("0")
    private Boolean absoluteValue;

    @Column(name = "ct_font_size", nullable = false)
    @ColumnDefault("14")
    private Integer fontSize;

    @Column(name = "tx_font", length = 140)
    private String font;

    @Column(name = "tx_page_number", length = 140)
    @ColumnDefault("'Hide'")
    private String pageNumber;

    @Column(name = "tx_css", columnDefinition = "longtext")
    private String css;

    @Column(name = "tx_format_data", columnDefinition = "longtext")
    private String formatData;

    @Column(name = "is_print_format_builder", nullable = false)
    @ColumnDefault("0")
    private Boolean printFormatBuilder;

    @Column(name = "is_print_format_builder_beta", nullable = false)
    @ColumnDefault("0")
    private Boolean printFormatBuilderBeta;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
