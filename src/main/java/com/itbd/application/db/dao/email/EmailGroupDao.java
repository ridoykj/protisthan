package com.itbd.application.db.dao.email;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_group", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_title", columnNames = {"tx_title"})
})
public class EmailGroupDao {

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

    @Column(name = "tx_title", unique = true, length = 140)
    private String title;

    @Column(name = "ct_total_subscribers", nullable = false)
    private Integer totalSubscribers;

    @Column(name = "tx_confirmation_email_template", length = 140)
    private String confirmationEmailTemplate;

    @Column(name = "tx_welcome_email_template", length = 140)
    private String welcomeEmailTemplate;

    @Column(name = "tx_welcome_url", length = 140)
    private String welcomeUrl;

    @Column(name = "is_add_query_parameters", nullable = false)
    @ColumnDefault("0")
    private Boolean addQueryParameters;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
