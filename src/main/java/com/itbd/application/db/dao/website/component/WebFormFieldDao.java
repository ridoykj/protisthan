package com.itbd.application.db.dao.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_form_field", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WebFormFieldDao {

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

    @Column(name = "tx_field_name", length = 140)
    private String fieldName;

    @Column(name = "tx_field_type", length = 140)
    private String fieldType;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "is_allow_read_on_all_link_options", nullable = false)
    @ColumnDefault("0")
    private Boolean allowReadOnAllLinkOptions;

    @Column(name = "is_reqd", nullable = false)
    @ColumnDefault("0")
    private Boolean reqd;

    @Column(name = "is_read_only", nullable = false)
    @ColumnDefault("0")
    private Boolean readOnly;

    @Column(name = "is_show_in_filter", nullable = false)
    @ColumnDefault("0")
    private Boolean showInFilter;

    @Column(name = "is_hidden", nullable = false)
    @ColumnDefault("0")
    private Boolean hidden;

    @Column(name = "tx_options", columnDefinition = "text")
    private String options;

    @Column(name = "ct_max_length", nullable = false)
    private Integer maxLength;

    @Column(name = "ct_max_value", nullable = false)
    private Integer maxValue;

    @Column(name = "tx_precision", length = 140)
    private String precision;

    @Column(name = "tx_depends_on", columnDefinition = "longtext")
    private String dependsOn;

    @Column(name = "tx_mandatory_depends_on", columnDefinition = "longtext")
    private String mandatoryDependsOn;

    @Column(name = "tx_read_only_depends_on", columnDefinition = "longtext")
    private String readOnlyDependsOn;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "tx_default", length = 140)
    private String defaults;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
