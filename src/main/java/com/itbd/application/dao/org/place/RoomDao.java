package com.itbd.application.dao.org.place;

import com.itbd.application.constants.enums.RoomTypeEnum;
import com.itbd.application.constants.enums.UnitTypeEnum;
import com.itbd.application.dao.AbstractEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "t_place_room", uniqueConstraints = {@UniqueConstraint(name = "ctx_place_room_unique", columnNames = {"name", "floor"})})
public class RoomDao extends AbstractEntity<Long> {
    @Id
    @Column(name = "id_room_key", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Nullable
    @Column(name = "id_room_ver", nullable = false)
    private Long version;

    @Column(name = "tx_name", unique = true)
    private String name;

    @Column(name = "tx_alternate_name")
    private String alternateName;

    @Enumerated(EnumType.STRING)
    private RoomTypeEnum type;

    @Column(name = "tx_description")
    private String description;

    @Column(name = "tx_contact")
    private String contact;

    @Column(name = "has_public_access")
    private Boolean hasPublicAccess;

    @Column(name = "ct_total_rooms")
    private Integer totalRooms;

    @Column(name = "tx_block")
    private String block;

    @Column(name = "tx_unit")
    private UnitTypeEnum unit;

    @Column(name = "ct_total_beds")
    private Integer totalBeds;

    @Column(name = "ct_total_bathrooms")
    private Integer totalBathrooms;

    @Column(name = "has_kitchen")
    private Boolean hasKitchen;

    @Column(name = "has_balcony")
    private Boolean hasBalcony;

    @Column(name = "has_air_conditioner")
    private Boolean hasAirConditioner;

    @Column(name = "has_heater")
    private Boolean hasHeater;

    @ManyToOne
    @JoinColumn(name = "id_floor_key")
    private FloorDao floor;
}
