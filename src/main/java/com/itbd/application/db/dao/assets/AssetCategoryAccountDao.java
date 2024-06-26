package com.itbd.application.db.dao.assets;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_asset_category_account", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class AssetCategoryAccountDao {

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

    @Column(name = "tx_fixed_asset_account", length = 140)
    private String fixedAssetAccount;

    @Column(name = "tx_accumulated_depreciation_account", length = 140)
    private String accumulatedDepreciationAccount;

    @Column(name = "tx_depreciation_expense_account", length = 140)
    private String depreciationExpenseAccount;

    @Column(name = "tx_capital_work_in_progress_account", length = 140)
    private String capitalWorkInProgressAccount;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
