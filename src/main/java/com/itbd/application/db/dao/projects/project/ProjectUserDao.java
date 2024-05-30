package com.itbd.application.db.dao.projects.project;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_project_user", indexes = {
        @Index(name = "idx_user", columnList = "tx_user"),
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class ProjectUserDao {

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

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_email", length = 140)
    private String email;

    @Column(name = "tx_image", length = 140)
    private String image;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

    @Column(name = "is_welcome_email_sent", nullable = false)
    @ColumnDefault("0")
    private Boolean welcomeEmailSent;

    @Column(name = "is_view_attachments", nullable = false)
    @ColumnDefault("0")
    private Boolean viewAttachments;

    @Column(name = "tx_project_status", columnDefinition = "text")
    private String projectStatus;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
