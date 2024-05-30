package com.itbd.application.db.dao.setup.employee;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_employee_education", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class EmployeeEducationDao {

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

    @Column(name = "tx_school_univ", columnDefinition = "text")
    private String schoolUniv;

    @Column(name = "tx_qualification", length = 140)
    private String qualification;

    @Column(name = "tx_level", length = 140)
    private String level;

    @Column(name = "ct_year_of_passing", nullable = false)
    private Integer yearOfPassing;

    @Column(name = "tx_class_per", length = 140)
    private String classPer;

    @Column(name = "tx_maj_opt_subj", columnDefinition = "text")
    private String majOptSubj;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
