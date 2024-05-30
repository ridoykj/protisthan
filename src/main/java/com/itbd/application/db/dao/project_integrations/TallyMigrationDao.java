package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_tally_migration", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class TallyMigrationDao {

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

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_master_data", columnDefinition = "text")
    private String masterData;

    @Column(name = "is_master_data_processed", nullable = false)
    @ColumnDefault("0")
    private Boolean notifyEmployee;

    @Column(name = "is_master_data_imported", nullable = false)
    @ColumnDefault("0")
    private Boolean isMasterDataImported;

    @Column(name = "tx_tally_creditors_account", length = 140)
    @ColumnDefault("'Sundry_Creditors'")
    private String tallyCreditorsAccount;

    @Column(name = "tx_tally_debtors_account", length = 140)
    @ColumnDefault("'Sundry_Debtors'")
    private String tallyDebtorsAccount;

    @Column(name = "tx_tally_company", length = 140)
    private String tallyCompany;

    @Column(name = "tx_default_uom", length = 140)
    @ColumnDefault("'Unit'")
    private String defaultUom;

    @Column(name = "tx_erpnext_company", length = 140)
    private String erpnextCompany;

    @Column(name = "tx_chart_of_accounts", columnDefinition = "text")
    private String chartOfAccounts;

    @Column(name = "tx_parties", columnDefinition = "text")
    private String parties;

    @Column(name = "tx_addresses", columnDefinition = "text")
    private String addresses;

    @Column(name = "tx_uoms", columnDefinition = "text")
    private String uoms;

    @Column(name = "tx_items", columnDefinition = "text")
    private String items;

    @Column(name = "tx_vouchers", columnDefinition = "text")
    private String vouchers;

    @Column(name = "tx_default_warehouse", length = 140)
    private String defaultWarehouse;

    @Column(name = "tx_default_round_off_account", length = 140)
    private String defaultRoundOffAccount;

    @Column(name = "tx_default_cost_center", length = 140)
    private String defaultCostCenter;

    @Column(name = "tx_day_book_data", columnDefinition = "text")
    private String dayBookData;

    @Column(name = "is_day_book_data_processed", nullable = false)
    @ColumnDefault("0")
    private Boolean isDayBookDataProcessed;

    @Column(name = "ct_is_day_book_data_imported", nullable = false)
    private Integer isDayBookDataImported;

    @Column(name = "tx_failed_import_log", columnDefinition = "longtext")
    @ColumnDefault("'[]'")
    private String failedImportLog;

    @Column(name = "tx_fixed_errors_log", columnDefinition = "longtext")
    @ColumnDefault("'[]'")
    private String fixedErrorsLog;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
