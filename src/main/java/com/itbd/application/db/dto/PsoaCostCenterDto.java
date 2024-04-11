package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PsoaCostCenterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PsoaCostCenterDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String costCenterName,
        String parent,
        String parentField,
        String parentType
) {
    public static PsoaCostCenterDto fromEntity(PsoaCostCenterDao ePsoaCostCenterDao) {
        return new PsoaCostCenterDto(
                ePsoaCostCenterDao.getName(),
                ePsoaCostCenterDao.getCreation(),
                ePsoaCostCenterDao.getModified(),
                ePsoaCostCenterDao.getModifiedBy(),
                ePsoaCostCenterDao.getOwner(),
                ePsoaCostCenterDao.getIsDocStatus(),
                ePsoaCostCenterDao.getIdx(),
                ePsoaCostCenterDao.getCostCenterName(),
                ePsoaCostCenterDao.getParent(),
                ePsoaCostCenterDao.getParentField(),
                ePsoaCostCenterDao.getParentType());
    }

    public static void fromDTO(PsoaCostCenterDto vPsoaCostCenterDto, PsoaCostCenterDao ePsoaCostCenterDao) {
        ePsoaCostCenterDao.setName(vPsoaCostCenterDto.name());
        ePsoaCostCenterDao.setCreation(vPsoaCostCenterDto.creation());
        ePsoaCostCenterDao.setModified(vPsoaCostCenterDto.modified());
        ePsoaCostCenterDao.setModifiedBy(vPsoaCostCenterDto.modifiedBy());
        ePsoaCostCenterDao.setOwner(vPsoaCostCenterDto.owner());
        ePsoaCostCenterDao.setIsDocStatus(vPsoaCostCenterDto.isDocStatus());
        ePsoaCostCenterDao.setIdx(vPsoaCostCenterDto.idx());
        ePsoaCostCenterDao.setCostCenterName(vPsoaCostCenterDto.costCenterName());
        ePsoaCostCenterDao.setParent(vPsoaCostCenterDto.parent());
        ePsoaCostCenterDao.setParentField(vPsoaCostCenterDto.parentField());
        ePsoaCostCenterDao.setParentType(vPsoaCostCenterDto.parentType());
    }
}