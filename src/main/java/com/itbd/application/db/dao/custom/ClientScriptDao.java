package com.itbd.application.db.dao.custom;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_client_script", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ClientScriptDao {

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

    @Column(name = "tx_dt", length = 140)
    private String dt;

    @Column(name = "tx_view", length = 140)
    @ColumnDefault("'Form'")
    private String view;

    @Column(name = "tx_module", length = 140)
    private String module;

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("0")
    private Boolean enabled;

    @Column(name = "tx_script", columnDefinition = "longtext")
    private String script;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
