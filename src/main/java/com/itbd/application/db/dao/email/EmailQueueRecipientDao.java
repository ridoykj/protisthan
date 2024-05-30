package com.itbd.application.db.dao.aaa.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_queue_recipient", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_parent", columnList = "tx_parent"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class EmailQueueRecipientDao {

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

    @Column(name = "tx_recipient", length = 140)
    private String recipient;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Not_Sent'")
    private String status;

    @Column(name = "tx_error", columnDefinition = "longtext")
    private String error;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
