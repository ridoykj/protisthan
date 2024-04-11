package com.itbd.application.db.dto.delivery;

import com.itbd.application.db.dao.delivery.DeliveryTripDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DeliveryTripDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        Boolean emailNotificationSent,
        String driver,
        String driverName,
        String driverEmail,
        String driverAddress,
        BigDecimal totalDistance,
        String uom,
        String vehicle,
        LocalDateTime departureTime,
        String employee,
        String status,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DeliveryTripDto fromEntity(DeliveryTripDao eDeliveryTripDao) {
        return new DeliveryTripDto(
                eDeliveryTripDao.getName(),
                eDeliveryTripDao.getCreation(),
                eDeliveryTripDao.getModified(),
                eDeliveryTripDao.getModifiedBy(),
                eDeliveryTripDao.getOwner(),
                eDeliveryTripDao.getIsDocStatus(),
                eDeliveryTripDao.getIdx(),
                eDeliveryTripDao.getNamingSeries(),
                eDeliveryTripDao.getCompany(),
                eDeliveryTripDao.getEmailNotificationSent(),
                eDeliveryTripDao.getDriver(),
                eDeliveryTripDao.getDriverName(),
                eDeliveryTripDao.getDriverEmail(),
                eDeliveryTripDao.getDriverAddress(),
                eDeliveryTripDao.getTotalDistance(),
                eDeliveryTripDao.getUom(),
                eDeliveryTripDao.getVehicle(),
                eDeliveryTripDao.getDepartureTime(),
                eDeliveryTripDao.getEmployee(),
                eDeliveryTripDao.getStatus(),
                eDeliveryTripDao.getAmendedFrom(),
                eDeliveryTripDao.getUserTags(),
                eDeliveryTripDao.getComments(),
                eDeliveryTripDao.getAssign(),
                eDeliveryTripDao.getLikedBy());
    }

    public static void fromDTO(DeliveryTripDto vDeliveryTripDto, DeliveryTripDao eDeliveryTripDao) {
        eDeliveryTripDao.setName(vDeliveryTripDto.name());
        eDeliveryTripDao.setCreation(vDeliveryTripDto.creation());
        eDeliveryTripDao.setModified(vDeliveryTripDto.modified());
        eDeliveryTripDao.setModifiedBy(vDeliveryTripDto.modifiedBy());
        eDeliveryTripDao.setOwner(vDeliveryTripDto.owner());
        eDeliveryTripDao.setIsDocStatus(vDeliveryTripDto.isDocStatus());
        eDeliveryTripDao.setIdx(vDeliveryTripDto.idx());
        eDeliveryTripDao.setNamingSeries(vDeliveryTripDto.namingSeries());
        eDeliveryTripDao.setCompany(vDeliveryTripDto.company());
        eDeliveryTripDao.setEmailNotificationSent(vDeliveryTripDto.emailNotificationSent());
        eDeliveryTripDao.setDriver(vDeliveryTripDto.driver());
        eDeliveryTripDao.setDriverName(vDeliveryTripDto.driverName());
        eDeliveryTripDao.setDriverEmail(vDeliveryTripDto.driverEmail());
        eDeliveryTripDao.setDriverAddress(vDeliveryTripDto.driverAddress());
        eDeliveryTripDao.setTotalDistance(vDeliveryTripDto.totalDistance());
        eDeliveryTripDao.setUom(vDeliveryTripDto.uom());
        eDeliveryTripDao.setVehicle(vDeliveryTripDto.vehicle());
        eDeliveryTripDao.setDepartureTime(vDeliveryTripDto.departureTime());
        eDeliveryTripDao.setEmployee(vDeliveryTripDto.employee());
        eDeliveryTripDao.setStatus(vDeliveryTripDto.status());
        eDeliveryTripDao.setAmendedFrom(vDeliveryTripDto.amendedFrom());
        eDeliveryTripDao.setUserTags(vDeliveryTripDto.userTags());
        eDeliveryTripDao.setComments(vDeliveryTripDto.comments());
        eDeliveryTripDao.setAssign(vDeliveryTripDto.assign());
        eDeliveryTripDao.setLikedBy(vDeliveryTripDto.likedBy());
    }
}