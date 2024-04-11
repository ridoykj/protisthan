package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AllowedDimensionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AllowedDimensionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountingDimension,
        String dimensionValue,
        String parent,
        String parentField,
        String parentType
) {
    public static AllowedDimensionDto fromEntity(AllowedDimensionDao eAllowedDimensionDao) {
        return new AllowedDimensionDto(
                eAllowedDimensionDao.getName(),
                eAllowedDimensionDao.getCreation(),
                eAllowedDimensionDao.getModified(),
                eAllowedDimensionDao.getModifiedBy(),
                eAllowedDimensionDao.getOwner(),
                eAllowedDimensionDao.getIsDocStatus(),
                eAllowedDimensionDao.getIdx(),
                eAllowedDimensionDao.getAccountingDimension(),
                eAllowedDimensionDao.getDimensionValue(),
                eAllowedDimensionDao.getParent(),
                eAllowedDimensionDao.getParentField(),
                eAllowedDimensionDao.getParentType());
    }

    public static void fromDTO(AllowedDimensionDto vAllowedDimensionDto, AllowedDimensionDao eAllowedDimensionDao) {
        eAllowedDimensionDao.setName(vAllowedDimensionDto.name());
        eAllowedDimensionDao.setCreation(vAllowedDimensionDto.creation());
        eAllowedDimensionDao.setModified(vAllowedDimensionDto.modified());
        eAllowedDimensionDao.setModifiedBy(vAllowedDimensionDto.modifiedBy());
        eAllowedDimensionDao.setOwner(vAllowedDimensionDto.owner());
        eAllowedDimensionDao.setIsDocStatus(vAllowedDimensionDto.isDocStatus());
        eAllowedDimensionDao.setIdx(vAllowedDimensionDto.idx());
        eAllowedDimensionDao.setAccountingDimension(vAllowedDimensionDto.accountingDimension());
        eAllowedDimensionDao.setDimensionValue(vAllowedDimensionDto.dimensionValue());
        eAllowedDimensionDao.setParent(vAllowedDimensionDto.parent());
        eAllowedDimensionDao.setParentField(vAllowedDimensionDto.parentField());
        eAllowedDimensionDao.setParentType(vAllowedDimensionDto.parentType());
    }
}