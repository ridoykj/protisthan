package com.itbd.application.db.dto;

import com.itbd.application.db.dao.manufacturing.SubOperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubOperationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String operation,
        BigDecimal timeInMins,
        String description,
        String parent,
        String parentField,
        String parentType
) {
    public static SubOperationDto fromEntity(SubOperationDao eSubOperationDao) {
        return new SubOperationDto(
                eSubOperationDao.getName(),
                eSubOperationDao.getCreation(),
                eSubOperationDao.getModified(),
                eSubOperationDao.getModifiedBy(),
                eSubOperationDao.getOwner(),
                eSubOperationDao.getIsDocStatus(),
                eSubOperationDao.getIdx(),
                eSubOperationDao.getOperation(),
                eSubOperationDao.getTimeInMins(),
                eSubOperationDao.getDescription(),
                eSubOperationDao.getParent(),
                eSubOperationDao.getParentField(),
                eSubOperationDao.getParentType());
    }

    public static void fromDTO(SubOperationDto vSubOperationDto, SubOperationDao eSubOperationDao) {
        eSubOperationDao.setName(vSubOperationDto.name());
        eSubOperationDao.setCreation(vSubOperationDto.creation());
        eSubOperationDao.setModified(vSubOperationDto.modified());
        eSubOperationDao.setModifiedBy(vSubOperationDto.modifiedBy());
        eSubOperationDao.setOwner(vSubOperationDto.owner());
        eSubOperationDao.setIsDocStatus(vSubOperationDto.isDocStatus());
        eSubOperationDao.setIdx(vSubOperationDto.idx());
        eSubOperationDao.setOperation(vSubOperationDto.operation());
        eSubOperationDao.setTimeInMins(vSubOperationDto.timeInMins());
        eSubOperationDao.setDescription(vSubOperationDto.description());
        eSubOperationDao.setParent(vSubOperationDto.parent());
        eSubOperationDao.setParentField(vSubOperationDto.parentField());
        eSubOperationDao.setParentType(vSubOperationDto.parentType());
    }
}