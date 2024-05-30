package com.itbd.application.db.dao.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_employee_external_work_history", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class EmployeeExternalWorkHistoryDao {

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

    @Column(name = "tx_company_name", length = 140)
    private String companyName;

    @Column(name = "tx_designation", length = 140)
    private String designation;

    @Column(name = "flt_salary", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal salary;

    @Column(name = "tx_address", columnDefinition = "text")
    private String address;

    @Column(name = "tx_contact", length = 140)
    private String contact;

    @Column(name = "tx_total_experience", length = 140)
    private String totalExperience;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
