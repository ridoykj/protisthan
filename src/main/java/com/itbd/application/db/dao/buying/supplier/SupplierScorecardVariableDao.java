package com.itbd.application.db.dao.buying.supplier;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_supplier_scorecard_variable", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_variable_label", columnNames = {"tx_variable_label"}),
        @UniqueConstraint(name = "uk_param_name", columnNames = {"tx_param_name"}),
})
public class SupplierScorecardVariableDao {

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

    @Column(name = "tx_variable_label", unique = true, length = 140)
    private String variableLabel;

    @Column(name = "is_custom", nullable = false)
    @ColumnDefault("0")
    private Boolean isCustom;

    @Column(name = "tx_param_name", unique = true, length = 140)
    private String paramName;

    @Column(name = "tx_path", length = 140)
    private String path;

    @Column(name = "tx_description", columnDefinition = "text")
    private String description;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
