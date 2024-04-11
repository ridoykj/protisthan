package com.itbd.application.db.dao.system;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "__auth")
@IdClass(AuthId.class)
public class AuthDao {

    @Id
    @Column(name = "tx_doc_type", nullable = false, updatable = false, length = 140)
    private String docType;

    @Id
    @Column(name = "tx_name", nullable = false)
    private String name;

    @Id
    @Column(name = "tx_fieldName", nullable = false, length = 140)
//    @JdbcTypeCode(SqlTypes.JSON)
    private String fieldName;

    @Column(name = "tx_password", nullable = false, columnDefinition = "text")
    private String password;

    @Column(name = "ct_encrypted", nullable = false)
    private Integer encrypted;

}
