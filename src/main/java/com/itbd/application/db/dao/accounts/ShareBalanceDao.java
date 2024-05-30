package com.itbd.application.db.dao.accounts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_share_balance", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ShareBalanceDao {

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

    @Column(name = "tx_share_type", length = 140)
    private String shareType;

    @Column(name = "ct_from_no", nullable = false)
    private Integer fromNo;

    @Column(name = "ct_rate", nullable = false)
    private Integer rate;

    @Column(name = "ct_no_of_shares", nullable = false)
    private Integer noOfShares;

    @Column(name = "ct_to_no", nullable = false)
    private Integer toNo;

    @Column(name = "ct_amount", nullable = false)
    private Integer amount;

    @Column(name = "is_company", nullable = false)
    @ColumnDefault("0")
    private Boolean isCompany;

    @Column(name = "tx_current_state", length = 140)
    private String currentState;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
