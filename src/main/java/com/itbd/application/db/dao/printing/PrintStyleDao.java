package com.itbd.application.db.dao.printing;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_print_style", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_print_style_name", columnNames = {"tx_print_style_name"})
})
public class PrintStyleDao {

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

    @Column(name = "tx_print_style_name", unique = true, length = 140)
    private String printStyleName;

    @Column(name = "is_disabled", nullable = false)
    @ColumnDefault("0")
    private Boolean disabled;

    @Column(name = "is_standard", nullable = false)
    @ColumnDefault("0")
    private Boolean standard;

    @Column(name = "tx_css", columnDefinition = "longtext")
    private String css;

    @Column(name = "tx_preview", columnDefinition = "text")
    private String preview;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
