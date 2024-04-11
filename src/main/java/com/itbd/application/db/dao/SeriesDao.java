package com.itbd.application.db.dao;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "t_series")
public class SeriesDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false, length = 100)
    private String name;

    @Column(name = "ct_current", nullable = false)
    private Integer current;

}
