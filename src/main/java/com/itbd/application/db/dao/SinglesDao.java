package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "t_singles", indexes = {
        @Index(name = "idx_singles_doc_type_field_index", columnList = "tx_doc_type, tx_field")
})
public class SinglesDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_singles_key", nullable = false, updatable = false)
    private Long singlesId;

    @Column(name = "tx_doc_type", nullable = false, updatable = false)
    private String docType;

    @Column(name = "tx_field")
    private String field;

    @Column(name = "tx_value", columnDefinition = "longtext")
    private String value;

}
