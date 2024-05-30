package com.itbd.application.db.dto;

import com.itbd.application.db.dao.setup.DriverDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DriverDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String fullName,
        String status,
        String transporter,
        String employee,
        String cellNumber,
        String address,
        String licenseNumber,
        LocalDate issuingDate,
        LocalDate expiryDate,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DriverDto fromEntity(DriverDao eDriverDao) {
        return new DriverDto(
                eDriverDao.getName(),
                eDriverDao.getCreation(),
                eDriverDao.getModified(),
                eDriverDao.getModifiedBy(),
                eDriverDao.getOwner(),
                eDriverDao.getIsDocStatus(),
                eDriverDao.getIdx(),
                eDriverDao.getNamingSeries(),
                eDriverDao.getFullName(),
                eDriverDao.getStatus(),
                eDriverDao.getTransporter(),
                eDriverDao.getEmployee(),
                eDriverDao.getCellNumber(),
                eDriverDao.getAddress(),
                eDriverDao.getLicenseNumber(),
                eDriverDao.getIssuingDate(),
                eDriverDao.getExpiryDate(),
                eDriverDao.getUserTags(),
                eDriverDao.getComments(),
                eDriverDao.getAssign(),
                eDriverDao.getLikedBy());
    }

    public static void fromDTO(DriverDto vDriverDto, DriverDao eDriverDao) {
        eDriverDao.setName(vDriverDto.name());
        eDriverDao.setCreation(vDriverDto.creation());
        eDriverDao.setModified(vDriverDto.modified());
        eDriverDao.setModifiedBy(vDriverDto.modifiedBy());
        eDriverDao.setOwner(vDriverDto.owner());
        eDriverDao.setIsDocStatus(vDriverDto.isDocStatus());
        eDriverDao.setIdx(vDriverDto.idx());
        eDriverDao.setNamingSeries(vDriverDto.namingSeries());
        eDriverDao.setFullName(vDriverDto.fullName());
        eDriverDao.setStatus(vDriverDto.status());
        eDriverDao.setTransporter(vDriverDto.transporter());
        eDriverDao.setEmployee(vDriverDto.employee());
        eDriverDao.setCellNumber(vDriverDto.cellNumber());
        eDriverDao.setAddress(vDriverDto.address());
        eDriverDao.setLicenseNumber(vDriverDto.licenseNumber());
        eDriverDao.setIssuingDate(vDriverDto.issuingDate());
        eDriverDao.setExpiryDate(vDriverDto.expiryDate());
        eDriverDao.setUserTags(vDriverDto.userTags());
        eDriverDao.setComments(vDriverDto.comments());
        eDriverDao.setAssign(vDriverDto.assign());
        eDriverDao.setLikedBy(vDriverDto.likedBy());
    }
}