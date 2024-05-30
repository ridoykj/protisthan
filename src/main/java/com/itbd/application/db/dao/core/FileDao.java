package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_file", indexes = {
        @Index(name = "idx_attached_to_doc_type_attached_to_name_index", columnList = "tx_attached_to_doc_type, tx_attached_to_name"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class FileDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false)
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

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_file_name", length = 140)
    private String fileName;

    @Column(name = "tx_file_url", columnDefinition = "longtext")
    private String fileUrl;

    @Column(name = "tx_module", columnDefinition = "text")
    private String module;

    @Column(name = "tx_attached_to_name", length = 140)
    private String attachedToName;

    @Column(name = "id_fileSize", nullable = false)
    private Long fileSize;

    @Column(name = "tx_attached_to_doc_type", length = 140)
    private String attachedToDocType;

    @Column(name = "is_private", nullable = false)
    @ColumnDefault("0")
    private Boolean isPrivate;

    @Column(name = "tx_file_type", length = 140)
    private String fileType;

    @Column(name = "is_home_folder", nullable = false)
    @ColumnDefault("0")
    private Boolean isHomeFolder;

    @Column(name = "is_attachments_folder", nullable = false)
    @ColumnDefault("0")
    private Boolean isAttachmentsFolder;

    @Column(name = "tx_thumbnail_url", columnDefinition = "text")
    private String thumbnailUrl;

    @Column(name = "tx_folder", length = 140)
    private String folder;

    @Column(name = "is_folder", nullable = false)
    @ColumnDefault("0")
    private Boolean isFolder;

    @Column(name = "tx_attached_to_field", length = 140)
    private String attachedToField;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "tx_content_hash", length = 140)
    private String contentHash;

    @Column(name = "is_uploaded_to_dropbox", nullable = false)
    @ColumnDefault("0")
    private Boolean uploadedToDropbox;

    @Column(name = "is_uploaded_to_google_drive", nullable = false)
    @ColumnDefault("0")
    private Boolean uploadedToGoogleDrive;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
