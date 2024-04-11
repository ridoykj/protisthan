package com.itbd.application.db.dao.system;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "__user_settings")
//@Table(name = "__user_settings", uniqueConstraints = {@UniqueConstraint(columnNames = {"docType", "user"})})

@IdClass(UserSettingsId.class)
public class UserSettingsDao {

    @Id
    @Column(name = "tx_user", nullable = false, updatable = false, length = 180)
    private String user;

    @Id
    @Column(name = "tx_doc_type", nullable = false, length = 180)
    private String docType;

    @Column(name = "tx_data", columnDefinition = "text")
    private String data;

}
