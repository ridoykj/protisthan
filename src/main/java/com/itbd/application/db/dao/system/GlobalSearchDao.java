package com.itbd.application.db.dao.system;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;


@Entity
@Getter
@Setter
@Table(name = "__global_search")
//@Table(name = "__global_search", uniqueConstraints = {@UniqueConstraint(columnNames = {"docType", "name"})})

@IdClass(GlobalSearchId.class)
public class GlobalSearchDao {

    @Id
    @Column(name = "tx_doc_type", nullable = false, updatable = false, length = 100)
    private String docType;

    @Id
    @Column(name = "tx_name", length = 140)
    private String name;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_content", columnDefinition = "text")
    private String content;

    @Column(name = "tx_route", length = 140)
    private String route;

    @Column(name = "is_published", nullable = false)
    @ColumnDefault("0")
    private Boolean published;

}
