package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.stock.shipment.ShipmentDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record ShipmentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String pickupFromType,
        String pickupCompany,
        String pickupCustomer,
        String pickupSupplier,
        String pickup,
        String pickupAddressName,
        String pickupAddress,
        String pickupContactPerson,
        String pickupContactName,
        String pickupContactEmail,
        String pickupContact,
        String deliveryToType,
        String deliveryCompany,
        String deliveryCustomer,
        String deliverySupplier,
        String deliveryTo,
        String deliveryAddressName,
        String deliveryAddress,
        String deliveryContactName,
        String deliveryContactEmail,
        String deliveryContact,
        String parcelTemplate,
        String pallets,
        BigDecimal valueOfGoods,
        LocalDate pickupDate,
        LocalTime pickupFrom,
        LocalTime pickupTo,
        String shipmentType,
        String pickupType,
        String incoterm,
        String descriptionOfContent,
        String serviceProvider,
        String shipmentId,
        BigDecimal shipmentAmount,
        String status,
        String trackingUrl,
        String carrier,
        String carrierService,
        String awbNumber,
        String trackingStatus,
        String trackingStatusInfo,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShipmentDto fromEntity(ShipmentDao eShipmentDao) {
        return new ShipmentDto(
                eShipmentDao.getName(),
                eShipmentDao.getCreation(),
                eShipmentDao.getModified(),
                eShipmentDao.getModifiedBy(),
                eShipmentDao.getOwner(),
                eShipmentDao.getIsDocStatus(),
                eShipmentDao.getIdx(),
                eShipmentDao.getPickupFromType(),
                eShipmentDao.getPickupCompany(),
                eShipmentDao.getPickupCustomer(),
                eShipmentDao.getPickupSupplier(),
                eShipmentDao.getPickup(),
                eShipmentDao.getPickupAddressName(),
                eShipmentDao.getPickupAddress(),
                eShipmentDao.getPickupContactPerson(),
                eShipmentDao.getPickupContactName(),
                eShipmentDao.getPickupContactEmail(),
                eShipmentDao.getPickupContact(),
                eShipmentDao.getDeliveryToType(),
                eShipmentDao.getDeliveryCompany(),
                eShipmentDao.getDeliveryCustomer(),
                eShipmentDao.getDeliverySupplier(),
                eShipmentDao.getDeliveryTo(),
                eShipmentDao.getDeliveryAddressName(),
                eShipmentDao.getDeliveryAddress(),
                eShipmentDao.getDeliveryContactName(),
                eShipmentDao.getDeliveryContactEmail(),
                eShipmentDao.getDeliveryContact(),
                eShipmentDao.getParcelTemplate(),
                eShipmentDao.getPallets(),
                eShipmentDao.getValueOfGoods(),
                eShipmentDao.getPickupDate(),
                eShipmentDao.getPickupFrom(),
                eShipmentDao.getPickupTo(),
                eShipmentDao.getShipmentType(),
                eShipmentDao.getPickupType(),
                eShipmentDao.getIncoterm(),
                eShipmentDao.getDescriptionOfContent(),
                eShipmentDao.getServiceProvider(),
                eShipmentDao.getShipmentId(),
                eShipmentDao.getShipmentAmount(),
                eShipmentDao.getStatus(),
                eShipmentDao.getTrackingUrl(),
                eShipmentDao.getCarrier(),
                eShipmentDao.getCarrierService(),
                eShipmentDao.getAwbNumber(),
                eShipmentDao.getTrackingStatus(),
                eShipmentDao.getTrackingStatusInfo(),
                eShipmentDao.getAmendedFrom(),
                eShipmentDao.getUserTags(),
                eShipmentDao.getComments(),
                eShipmentDao.getAssign(),
                eShipmentDao.getLikedBy());
    }

    public static void fromDTO(ShipmentDto vShipmentDto, ShipmentDao eShipmentDao) {
        eShipmentDao.setName(vShipmentDto.name());
        eShipmentDao.setCreation(vShipmentDto.creation());
        eShipmentDao.setModified(vShipmentDto.modified());
        eShipmentDao.setModifiedBy(vShipmentDto.modifiedBy());
        eShipmentDao.setOwner(vShipmentDto.owner());
        eShipmentDao.setIsDocStatus(vShipmentDto.isDocStatus());
        eShipmentDao.setIdx(vShipmentDto.idx());
        eShipmentDao.setPickupFromType(vShipmentDto.pickupFromType());
        eShipmentDao.setPickupCompany(vShipmentDto.pickupCompany());
        eShipmentDao.setPickupCustomer(vShipmentDto.pickupCustomer());
        eShipmentDao.setPickupSupplier(vShipmentDto.pickupSupplier());
        eShipmentDao.setPickup(vShipmentDto.pickup());
        eShipmentDao.setPickupAddressName(vShipmentDto.pickupAddressName());
        eShipmentDao.setPickupAddress(vShipmentDto.pickupAddress());
        eShipmentDao.setPickupContactPerson(vShipmentDto.pickupContactPerson());
        eShipmentDao.setPickupContactName(vShipmentDto.pickupContactName());
        eShipmentDao.setPickupContactEmail(vShipmentDto.pickupContactEmail());
        eShipmentDao.setPickupContact(vShipmentDto.pickupContact());
        eShipmentDao.setDeliveryToType(vShipmentDto.deliveryToType());
        eShipmentDao.setDeliveryCompany(vShipmentDto.deliveryCompany());
        eShipmentDao.setDeliveryCustomer(vShipmentDto.deliveryCustomer());
        eShipmentDao.setDeliverySupplier(vShipmentDto.deliverySupplier());
        eShipmentDao.setDeliveryTo(vShipmentDto.deliveryTo());
        eShipmentDao.setDeliveryAddressName(vShipmentDto.deliveryAddressName());
        eShipmentDao.setDeliveryAddress(vShipmentDto.deliveryAddress());
        eShipmentDao.setDeliveryContactName(vShipmentDto.deliveryContactName());
        eShipmentDao.setDeliveryContactEmail(vShipmentDto.deliveryContactEmail());
        eShipmentDao.setDeliveryContact(vShipmentDto.deliveryContact());
        eShipmentDao.setParcelTemplate(vShipmentDto.parcelTemplate());
        eShipmentDao.setPallets(vShipmentDto.pallets());
        eShipmentDao.setValueOfGoods(vShipmentDto.valueOfGoods());
        eShipmentDao.setPickupDate(vShipmentDto.pickupDate());
        eShipmentDao.setPickupFrom(vShipmentDto.pickupFrom());
        eShipmentDao.setPickupTo(vShipmentDto.pickupTo());
        eShipmentDao.setShipmentType(vShipmentDto.shipmentType());
        eShipmentDao.setPickupType(vShipmentDto.pickupType());
        eShipmentDao.setIncoterm(vShipmentDto.incoterm());
        eShipmentDao.setDescriptionOfContent(vShipmentDto.descriptionOfContent());
        eShipmentDao.setServiceProvider(vShipmentDto.serviceProvider());
        eShipmentDao.setShipmentId(vShipmentDto.shipmentId());
        eShipmentDao.setShipmentAmount(vShipmentDto.shipmentAmount());
        eShipmentDao.setStatus(vShipmentDto.status());
        eShipmentDao.setTrackingUrl(vShipmentDto.trackingUrl());
        eShipmentDao.setCarrier(vShipmentDto.carrier());
        eShipmentDao.setCarrierService(vShipmentDto.carrierService());
        eShipmentDao.setAwbNumber(vShipmentDto.awbNumber());
        eShipmentDao.setTrackingStatus(vShipmentDto.trackingStatus());
        eShipmentDao.setTrackingStatusInfo(vShipmentDto.trackingStatusInfo());
        eShipmentDao.setAmendedFrom(vShipmentDto.amendedFrom());
        eShipmentDao.setUserTags(vShipmentDto.userTags());
        eShipmentDao.setComments(vShipmentDto.comments());
        eShipmentDao.setAssign(vShipmentDto.assign());
        eShipmentDao.setLikedBy(vShipmentDto.likedBy());
    }
}