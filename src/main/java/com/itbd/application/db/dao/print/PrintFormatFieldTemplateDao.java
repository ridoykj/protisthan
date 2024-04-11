package com.itbd.application.db.dao.print;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_print_format_field_template", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PrintFormatFieldTemplateDao {

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

    @Column(name = "tx_document_type", length = 140)
    private String documentType;

    @Column(name = "tx_field", length = 140)
    private String field;

    @Column(name = "tx_template_file", length = 140)
    private String templateFile;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean standard;

    @Column(name = "tx_template", columnDefinition = "longtext")
    private String template;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
