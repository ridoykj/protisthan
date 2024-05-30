package com.itbd.application.db.dao.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_vehicle", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_license_plate", columnNames = "tx_license_plate")
})
public class VehicleDao {

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

    @Column(name = "tx_license_plate", unique = true, length = 140)
    private String licensePlate;

    @Column(name = "tx_make", length = 140)
    private String make;

    @Column(name = "tx_model", length = 140)
    private String model;

    @Column(name = "ct_last_odometer", nullable = false)
    private Integer lastOdometer;

    @Column(name = "dt_acquisition_date")
    private LocalDate acquisitionDate;

    @Column(name = "tx_location", length = 140)
    private String location;

    @Column(name = "tx_chassis_no", length = 140)
    private String chassisNo;

    @Column(name = "flt_vehicle_value", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal vehicleValue;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_insurance_company", length = 140)
    private String insuranceCompany;

    @Column(name = "tx_policy_no", length = 140)
    private String policyNo;

    @Column(name = "dt_start_date")
    private LocalDate startDate;

    @Column(name = "dt_end_date")
    private LocalDate endDate;

    @Column(name = "tx_fuel_type", length = 140)
    private String fuelType;

    @Column(name = "tx_uom", length = 140)
    private String uom;

    @Column(name = "dt_carbon_check_date")
    private LocalDate carbonCheckDate;

    @Column(name = "tx_color", length = 140)
    private String color;

    @Column(name = "ct_wheels", nullable = false)
    private Integer wheels;

    @Column(name = "ct_doors", nullable = false)
    private Integer doors;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
