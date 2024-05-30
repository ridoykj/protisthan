package com.itbd.application.db.dao.aaa.maintenance;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_maintenance_visit_purpose", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class MaintenanceVisitPurposeDao {

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

    @Column(name = "tx_item_code", length = 140)
    private String itemCode;

    @Column(name = "tx_item_name", length = 140)
    private String itemName;

    @Column(name = "tx_service_person", length = 140)
    private String servicePerson;

    @Column(name = "tx_serial_no", length = 140)
    private String serialNo;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_work_done", columnDefinition = "text")
    private String workDone;

    @Column(name = "tx_prev_document_doc_type", length = 140)
    private String prevDocumentDocType;

    @Column(name = "tx_prev_document_doc_name", length = 140)
    private String prevDocumentDocName;

    @Column(name = "tx_maintenance_schedule_detail", length = 140)
    private String maintenanceScheduleDetail;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
