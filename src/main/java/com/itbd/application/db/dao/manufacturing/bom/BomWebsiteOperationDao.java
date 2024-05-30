package com.itbd.application.db.dao.manufacturing.bom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_bom_website_operation", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class BomWebsiteOperationDao {

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

    @Column(name = "tx_operation", length = 140)
    private String operation;

    @Column(name = "tx_workstation", length = 140)
    private String workstation;

    @Column(name = "flt_time_in_mins", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal timeInMins;

    @Column(name = "tx_website_image", columnDefinition = "text")
    private String websiteImage;

    @Column(name = "tx_thumbnail", length = 140)
    private String thumbnail;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
