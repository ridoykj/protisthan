package com.itbd.application.db.dto.delivery;

import com.itbd.application.db.dao.stock.delivery.DeliveryStopDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DeliveryStopDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customer,
        String address,
        Boolean locked,
        String customerAddress,
        Boolean visited,
        String deliveryNote,
        BigDecimal grandTotal,
        String contact,
        String emailSentTo,
        String customerContact,
        BigDecimal distance,
        LocalDateTime estimatedArrival,
        BigDecimal lat,
        String uom,
        BigDecimal lng,
        String details,
        String parent,
        String parentField,
        String parentType
) {
    public static DeliveryStopDto fromEntity(DeliveryStopDao eDeliveryStopDao) {
        return new DeliveryStopDto(
                eDeliveryStopDao.getName(),
                eDeliveryStopDao.getCreation(),
                eDeliveryStopDao.getModified(),
                eDeliveryStopDao.getModifiedBy(),
                eDeliveryStopDao.getOwner(),
                eDeliveryStopDao.getIsDocStatus(),
                eDeliveryStopDao.getIdx(),
                eDeliveryStopDao.getCustomer(),
                eDeliveryStopDao.getAddress(),
                eDeliveryStopDao.getLocked(),
                eDeliveryStopDao.getCustomerAddress(),
                eDeliveryStopDao.getVisited(),
                eDeliveryStopDao.getDeliveryNote(),
                eDeliveryStopDao.getGrandTotal(),
                eDeliveryStopDao.getContact(),
                eDeliveryStopDao.getEmailSentTo(),
                eDeliveryStopDao.getCustomerContact(),
                eDeliveryStopDao.getDistance(),
                eDeliveryStopDao.getEstimatedArrival(),
                eDeliveryStopDao.getLat(),
                eDeliveryStopDao.getUom(),
                eDeliveryStopDao.getLng(),
                eDeliveryStopDao.getDetails(),
                eDeliveryStopDao.getParent(),
                eDeliveryStopDao.getParentField(),
                eDeliveryStopDao.getParentType());
    }

    public static void fromDTO(DeliveryStopDto vDeliveryStopDto, DeliveryStopDao eDeliveryStopDao) {
        eDeliveryStopDao.setName(vDeliveryStopDto.name());
        eDeliveryStopDao.setCreation(vDeliveryStopDto.creation());
        eDeliveryStopDao.setModified(vDeliveryStopDto.modified());
        eDeliveryStopDao.setModifiedBy(vDeliveryStopDto.modifiedBy());
        eDeliveryStopDao.setOwner(vDeliveryStopDto.owner());
        eDeliveryStopDao.setIsDocStatus(vDeliveryStopDto.isDocStatus());
        eDeliveryStopDao.setIdx(vDeliveryStopDto.idx());
        eDeliveryStopDao.setCustomer(vDeliveryStopDto.customer());
        eDeliveryStopDao.setAddress(vDeliveryStopDto.address());
        eDeliveryStopDao.setLocked(vDeliveryStopDto.locked());
        eDeliveryStopDao.setCustomerAddress(vDeliveryStopDto.customerAddress());
        eDeliveryStopDao.setVisited(vDeliveryStopDto.visited());
        eDeliveryStopDao.setDeliveryNote(vDeliveryStopDto.deliveryNote());
        eDeliveryStopDao.setGrandTotal(vDeliveryStopDto.grandTotal());
        eDeliveryStopDao.setContact(vDeliveryStopDto.contact());
        eDeliveryStopDao.setEmailSentTo(vDeliveryStopDto.emailSentTo());
        eDeliveryStopDao.setCustomerContact(vDeliveryStopDto.customerContact());
        eDeliveryStopDao.setDistance(vDeliveryStopDto.distance());
        eDeliveryStopDao.setEstimatedArrival(vDeliveryStopDto.estimatedArrival());
        eDeliveryStopDao.setLat(vDeliveryStopDto.lat());
        eDeliveryStopDao.setUom(vDeliveryStopDto.uom());
        eDeliveryStopDao.setLng(vDeliveryStopDto.lng());
        eDeliveryStopDao.setDetails(vDeliveryStopDto.details());
        eDeliveryStopDao.setParent(vDeliveryStopDto.parent());
        eDeliveryStopDao.setParentField(vDeliveryStopDto.parentField());
        eDeliveryStopDao.setParentType(vDeliveryStopDto.parentType());
    }
}