package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_package_release", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class PackageReleaseDao {

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

    @Column(name = "tx_package", length = 140)
    private String packages;

    @Column(name = "is_publish", nullable = false)
    @ColumnDefault("0")
    private Boolean publish;

    @Column(name = "tx_path", columnDefinition = "text")
    private String path;

    @Column(name = "ct_major", nullable = false)
    private Integer major;

    @Column(name = "ct_minor", nullable = false)
    private Integer minor;

    @Column(name = "ct_patch", nullable = false)
    private Integer patch;

    @Column(name = "tx_release_notes", columnDefinition = "longtext")
    private String releaseNotes;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
