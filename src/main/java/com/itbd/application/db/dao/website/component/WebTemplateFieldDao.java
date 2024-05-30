package com.itbd.application.db.dao.website.component;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_web_template_field", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class WebTemplateFieldDao {

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

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_field_name", length = 140)
    private String fieldName;

    @Column(name = "tx_field_type", length = 140)
    @ColumnDefault("'Data'")
    private String fieldType;

    @Column(name = "is_reqd", nullable = false)
    @ColumnDefault("0")
    private Boolean reqd;

    @Column(name = "tx_options", columnDefinition = "text")
    private String options;

    @Column(name = "tx_default", columnDefinition = "text")
    private String defaults;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
