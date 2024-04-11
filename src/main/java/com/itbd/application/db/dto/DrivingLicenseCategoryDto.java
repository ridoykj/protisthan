package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DrivingLicenseCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DrivingLicenseCategoryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String classes,
        String description,
        LocalDate issuingDate,
        LocalDate expiryDate,
        String parent,
        String parentField,
        String parentType
) {
    public static DrivingLicenseCategoryDto fromEntity(DrivingLicenseCategoryDao eDrivingLicenseCategoryDao) {
        return new DrivingLicenseCategoryDto(
                eDrivingLicenseCategoryDao.getName(),
                eDrivingLicenseCategoryDao.getCreation(),
                eDrivingLicenseCategoryDao.getModified(),
                eDrivingLicenseCategoryDao.getModifiedBy(),
                eDrivingLicenseCategoryDao.getOwner(),
                eDrivingLicenseCategoryDao.getIsDocStatus(),
                eDrivingLicenseCategoryDao.getIdx(),
                eDrivingLicenseCategoryDao.getClasses(),
                eDrivingLicenseCategoryDao.getDescription(),
                eDrivingLicenseCategoryDao.getIssuingDate(),
                eDrivingLicenseCategoryDao.getExpiryDate(),
                eDrivingLicenseCategoryDao.getParent(),
                eDrivingLicenseCategoryDao.getParentField(),
                eDrivingLicenseCategoryDao.getParentType());
    }

    public static void fromDTO(DrivingLicenseCategoryDto vDrivingLicenseCategoryDto, DrivingLicenseCategoryDao eDrivingLicenseCategoryDao) {
        eDrivingLicenseCategoryDao.setName(vDrivingLicenseCategoryDto.name());
        eDrivingLicenseCategoryDao.setCreation(vDrivingLicenseCategoryDto.creation());
        eDrivingLicenseCategoryDao.setModified(vDrivingLicenseCategoryDto.modified());
        eDrivingLicenseCategoryDao.setModifiedBy(vDrivingLicenseCategoryDto.modifiedBy());
        eDrivingLicenseCategoryDao.setOwner(vDrivingLicenseCategoryDto.owner());
        eDrivingLicenseCategoryDao.setIsDocStatus(vDrivingLicenseCategoryDto.isDocStatus());
        eDrivingLicenseCategoryDao.setIdx(vDrivingLicenseCategoryDto.idx());
        eDrivingLicenseCategoryDao.setClasses(vDrivingLicenseCategoryDto.classes());
        eDrivingLicenseCategoryDao.setDescription(vDrivingLicenseCategoryDto.description());
        eDrivingLicenseCategoryDao.setIssuingDate(vDrivingLicenseCategoryDto.issuingDate());
        eDrivingLicenseCategoryDao.setExpiryDate(vDrivingLicenseCategoryDto.expiryDate());
        eDrivingLicenseCategoryDao.setParent(vDrivingLicenseCategoryDto.parent());
        eDrivingLicenseCategoryDao.setParentField(vDrivingLicenseCategoryDto.parentField());
        eDrivingLicenseCategoryDao.setParentType(vDrivingLicenseCategoryDto.parentType());
    }
}