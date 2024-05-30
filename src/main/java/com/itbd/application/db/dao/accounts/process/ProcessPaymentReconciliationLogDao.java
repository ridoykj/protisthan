package com.itbd.application.db.dao.accounts.process;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_process_payment_reconciliation_log", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ProcessPaymentReconciliationLogDao {

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

    @Column(name = "tx_process_pr", length = 140)
    private String processPr;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "is_allocated", nullable = false)
    @ColumnDefault("0")
    private Boolean allocated;

    @Column(name = "is_reconciled", nullable = false)
    @ColumnDefault("0")
    private Boolean reconciled;

    @Column(name = "ct_total_allocations", nullable = false)
    private Integer totalAllocations;

    @Column(name = "ct_reconciled_entries", nullable = false)
    private Integer reconciledEntries;

    @Column(name = "tx_error_log", columnDefinition = "longtext")
    private String errorLog;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
