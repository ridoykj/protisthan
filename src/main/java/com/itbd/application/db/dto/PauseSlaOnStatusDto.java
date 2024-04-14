package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PauseSlaOnStatusDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PauseSlaOnStatusDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String parent,
        String parentField,
        String parentType
) {
    public static PauseSlaOnStatusDto fromEntity(PauseSlaOnStatusDao ePauseSlaOnStatusDao) {
        return new PauseSlaOnStatusDto(
                ePauseSlaOnStatusDao.getName(),
                ePauseSlaOnStatusDao.getCreation(),
                ePauseSlaOnStatusDao.getModified(),
                ePauseSlaOnStatusDao.getModifiedBy(),
                ePauseSlaOnStatusDao.getOwner(),
                ePauseSlaOnStatusDao.getIsDocStatus(),
                ePauseSlaOnStatusDao.getIdx(),
                ePauseSlaOnStatusDao.getStatus(),
                ePauseSlaOnStatusDao.getParent(),
                ePauseSlaOnStatusDao.getParentField(),
                ePauseSlaOnStatusDao.getParentType());
    }

    public static void fromDTO(PauseSlaOnStatusDto vPauseSlaOnStatusDto, PauseSlaOnStatusDao ePauseSlaOnStatusDao) {
        ePauseSlaOnStatusDao.setName(vPauseSlaOnStatusDto.name());
        ePauseSlaOnStatusDao.setCreation(vPauseSlaOnStatusDto.creation());
        ePauseSlaOnStatusDao.setModified(vPauseSlaOnStatusDto.modified());
        ePauseSlaOnStatusDao.setModifiedBy(vPauseSlaOnStatusDto.modifiedBy());
        ePauseSlaOnStatusDao.setOwner(vPauseSlaOnStatusDto.owner());
        ePauseSlaOnStatusDao.setIsDocStatus(vPauseSlaOnStatusDto.isDocStatus());
        ePauseSlaOnStatusDao.setIdx(vPauseSlaOnStatusDto.idx());
        ePauseSlaOnStatusDao.setStatus(vPauseSlaOnStatusDto.status());
        ePauseSlaOnStatusDao.setParent(vPauseSlaOnStatusDto.parent());
        ePauseSlaOnStatusDao.setParentField(vPauseSlaOnStatusDto.parentField());
        ePauseSlaOnStatusDao.setParentType(vPauseSlaOnStatusDto.parentType());
    }
}