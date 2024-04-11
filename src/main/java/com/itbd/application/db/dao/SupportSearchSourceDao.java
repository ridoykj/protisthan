package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_support_search_source", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class SupportSearchSourceDao {

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

    @Column(name = "tx_source_name", length = 140)
    private String sourceName;

    @Column(name = "tx_source_type", length = 140)
    private String sourceType;

    @Column(name = "tx_base_url", length = 140)
    private String baseUrl;

    @Column(name = "tx_query_route", length = 140)
    private String queryRoute;

    @Column(name = "tx_search_term_param_name", length = 140)
    private String searchTermParamName;

    @Column(name = "tx_response_result_key_path", length = 140)
    private String responseResultKeyPath;

    @Column(name = "tx_post_route", length = 140)
    private String postRoute;

    @Column(name = "tx_post_route_key_list", length = 140)
    private String postRouteKeyList;

    @Column(name = "tx_post_title_key", length = 140)
    private String postTitleKey;

    @Column(name = "tx_post_description_key", length = 140)
    private String postDescriptionKey;

    @Column(name = "tx_source_doc_type", length = 140)
    private String sourceDocType;

    @Column(name = "tx_result_title_field", length = 140)
    private String resultTitleField;

    @Column(name = "tx_result_preview_field", length = 140)
    private String resultPreviewField;

    @Column(name = "tx_result_route_field", length = 140)
    private String resultRouteField;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
