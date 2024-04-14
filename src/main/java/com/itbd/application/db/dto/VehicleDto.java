package com.itbd.application.db.dto;

import com.itbd.application.db.dao.VehicleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record VehicleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String licensePlate,
        String make,
        String model,
        Integer lastOdometer,
        LocalDate acquisitionDate,
        String location,
        String chassisNo,
        BigDecimal vehicleValue,
        String employee,
        String insuranceCompany,
        String policyNo,
        LocalDate startDate,
        LocalDate endDate,
        String fuelType,
        String uom,
        LocalDate carbonCheckDate,
        String color,
        Integer wheels,
        Integer doors,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static VehicleDto fromEntity(VehicleDao eVehicleDao) {
        return new VehicleDto(
                eVehicleDao.getName(),
                eVehicleDao.getCreation(),
                eVehicleDao.getModified(),
                eVehicleDao.getModifiedBy(),
                eVehicleDao.getOwner(),
                eVehicleDao.getIsDocStatus(),
                eVehicleDao.getIdx(),
                eVehicleDao.getLicensePlate(),
                eVehicleDao.getMake(),
                eVehicleDao.getModel(),
                eVehicleDao.getLastOdometer(),
                eVehicleDao.getAcquisitionDate(),
                eVehicleDao.getLocation(),
                eVehicleDao.getChassisNo(),
                eVehicleDao.getVehicleValue(),
                eVehicleDao.getEmployee(),
                eVehicleDao.getInsuranceCompany(),
                eVehicleDao.getPolicyNo(),
                eVehicleDao.getStartDate(),
                eVehicleDao.getEndDate(),
                eVehicleDao.getFuelType(),
                eVehicleDao.getUom(),
                eVehicleDao.getCarbonCheckDate(),
                eVehicleDao.getColor(),
                eVehicleDao.getWheels(),
                eVehicleDao.getDoors(),
                eVehicleDao.getAmendedFrom(),
                eVehicleDao.getUserTags(),
                eVehicleDao.getComments(),
                eVehicleDao.getAssign(),
                eVehicleDao.getLikedBy());
    }

    public static void fromDTO(VehicleDto vVehicleDto, VehicleDao eVehicleDao) {
        eVehicleDao.setName(vVehicleDto.name());
        eVehicleDao.setCreation(vVehicleDto.creation());
        eVehicleDao.setModified(vVehicleDto.modified());
        eVehicleDao.setModifiedBy(vVehicleDto.modifiedBy());
        eVehicleDao.setOwner(vVehicleDto.owner());
        eVehicleDao.setIsDocStatus(vVehicleDto.isDocStatus());
        eVehicleDao.setIdx(vVehicleDto.idx());
        eVehicleDao.setLicensePlate(vVehicleDto.licensePlate());
        eVehicleDao.setMake(vVehicleDto.make());
        eVehicleDao.setModel(vVehicleDto.model());
        eVehicleDao.setLastOdometer(vVehicleDto.lastOdometer());
        eVehicleDao.setAcquisitionDate(vVehicleDto.acquisitionDate());
        eVehicleDao.setLocation(vVehicleDto.location());
        eVehicleDao.setChassisNo(vVehicleDto.chassisNo());
        eVehicleDao.setVehicleValue(vVehicleDto.vehicleValue());
        eVehicleDao.setEmployee(vVehicleDto.employee());
        eVehicleDao.setInsuranceCompany(vVehicleDto.insuranceCompany());
        eVehicleDao.setPolicyNo(vVehicleDto.policyNo());
        eVehicleDao.setStartDate(vVehicleDto.startDate());
        eVehicleDao.setEndDate(vVehicleDto.endDate());
        eVehicleDao.setFuelType(vVehicleDto.fuelType());
        eVehicleDao.setUom(vVehicleDto.uom());
        eVehicleDao.setCarbonCheckDate(vVehicleDto.carbonCheckDate());
        eVehicleDao.setColor(vVehicleDto.color());
        eVehicleDao.setWheels(vVehicleDto.wheels());
        eVehicleDao.setDoors(vVehicleDto.doors());
        eVehicleDao.setAmendedFrom(vVehicleDto.amendedFrom());
        eVehicleDao.setUserTags(vVehicleDto.userTags());
        eVehicleDao.setComments(vVehicleDto.comments());
        eVehicleDao.setAssign(vVehicleDto.assign());
        eVehicleDao.setLikedBy(vVehicleDto.likedBy());
    }
}