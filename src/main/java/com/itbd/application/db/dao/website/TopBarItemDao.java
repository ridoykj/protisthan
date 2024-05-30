package com.itbd.application.db.dao.website;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_top_bar_item", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class TopBarItemDao {

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

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_url", length = 140)
    private String url;

    @Column(name = "is_open_in_new_tab", nullable = false)
    @ColumnDefault("0")
    private Boolean openInNewTab;

    @Column(name = "is_right", nullable = false)
    @ColumnDefault("1")
    private Boolean right;

    @Column(name = "tx_parent_label", length = 140)
    private String parentLabel;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
