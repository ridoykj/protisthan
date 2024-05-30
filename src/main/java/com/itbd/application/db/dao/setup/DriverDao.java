package com.itbd.application.db.dao.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_driver", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class DriverDao {

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

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_transporter", length = 140)
    private String transporter;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_cell_number", length = 140)
    private String cellNumber;

    @Column(name = "tx_address", length = 140)
    private String address;

    @Column(name = "tx_license_number", length = 140)
    private String licenseNumber;

    @Column(name = "dt_issuingDate")
    private LocalDate issuingDate;

    @Column(name = "dt_expiryDate")
    private LocalDate expiryDate;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
