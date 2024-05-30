package com.itbd.application.db.dao.stock.shipment;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "t_shipment", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ShipmentDao {

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

    @Column(name = "tx_pickup_from_type", length = 140)
    @ColumnDefault("'Company'")
    private String pickupFromType;

    @Column(name = "tx_pickup_company", length = 140)
    private String pickupCompany;

    @Column(name = "tx_pickup_customer", length = 140)
    private String pickupCustomer;

    @Column(name = "tx_pickup_supplier", length = 140)
    private String pickupSupplier;

    @Column(name = "tx_pickup", length = 140)
    private String pickup;

    @Column(name = "tx_pickup_address_name", length = 140)
    private String pickupAddressName;

    @Column(name = "tx_pickup_address", columnDefinition = "text")
    private String pickupAddress;

    @Column(name = "tx_pickup_contact_person", length = 140)
    private String pickupContactPerson;

    @Column(name = "tx_pickup_contact_name", length = 140)
    private String pickupContactName;

    @Column(name = "tx_pickup_contact_email", length = 140)
    private String pickupContactEmail;

    @Column(name = "tx_pickup_contact", columnDefinition = "text")
    private String pickupContact;

    @Column(name = "tx_delivery_to_type", length = 140)
    @ColumnDefault("'Customer'")
    private String deliveryToType;

    @Column(name = "tx_delivery_company", length = 140)
    private String deliveryCompany;

    @Column(name = "tx_delivery_customer", length = 140)
    private String deliveryCustomer;

    @Column(name = "tx_delivery_supplier", length = 140)
    private String deliverySupplier;

    @Column(name = "tx_delivery_to", length = 140)
    private String deliveryTo;

    @Column(name = "tx_delivery_address_name", length = 140)
    private String deliveryAddressName;

    @Column(name = "tx_delivery_address", columnDefinition = "text")
    private String deliveryAddress;

    @Column(name = "tx_delivery_contact_name", length = 140)
    private String deliveryContactName;

    @Column(name = "tx_delivery_contact_email", length = 140)
    private String deliveryContactEmail;

    @Column(name = "tx_delivery_contact", columnDefinition = "text")
    private String deliveryContact;

    @Column(name = "tx_parcel_template", length = 140)
    private String parcelTemplate;

    @Column(name = "tx_pallets", length = 140)
    @ColumnDefault("'No'")
    private String pallets;

    @Column(name = "flt_value_of_goods", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal valueOfGoods;

    @Column(name = "dt_pickup_date")
    private LocalDate pickupDate;

    @Column(name = "tt_pickup_from")
    @ColumnDefault("'09:00:00'")
    private LocalTime pickupFrom;

    @Column(name = "tt_pickup_to")
    @ColumnDefault("'17:00:00'")
    private LocalTime pickupTo;

    @Column(name = "tx_shipment_type", length = 140)
    @ColumnDefault("'Goods'")
    private String shipmentType;

    @Column(name = "tx_pickup_type", length = 140)
    @ColumnDefault("'Pickup'")
    private String pickupType;

    @Column(name = "tx_incoterm", length = 140)
    private String incoterm;

    @Column(name = "tx_description_of_content", columnDefinition = "text")
    private String descriptionOfContent;

    @Column(name = "tx_service_provider", length = 140)
    private String serviceProvider;

    @Column(name = "tx_shipment_id", length = 140)
    private String shipmentId;

    @Column(name = "flt_shipment_amount", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal shipmentAmount;

    @Column(name = "tx_status", length = 140)
    private String status;

    @Column(name = "tx_tracking_url", columnDefinition = "text")
    private String trackingUrl;

    @Column(name = "tx_carrier", length = 140)
    private String carrier;

    @Column(name = "tx_carrier_service", length = 140)
    private String carrierService;

    @Column(name = "tx_awb_number", length = 140)
    private String awbNumber;

    @Column(name = "tx_tracking_status", length = 140)
    private String trackingStatus;

    @Column(name = "tx_tracking_status_info", length = 140)
    private String trackingStatusInfo;

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
