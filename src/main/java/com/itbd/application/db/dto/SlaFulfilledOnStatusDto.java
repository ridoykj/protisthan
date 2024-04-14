package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SlaFulfilledOnStatusDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SlaFulfilledOnStatusDto(
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
    public static SlaFulfilledOnStatusDto fromEntity(SlaFulfilledOnStatusDao eSlaFulfilledOnStatusDao) {
        return new SlaFulfilledOnStatusDto(
                eSlaFulfilledOnStatusDao.getName(),
                eSlaFulfilledOnStatusDao.getCreation(),
                eSlaFulfilledOnStatusDao.getModified(),
                eSlaFulfilledOnStatusDao.getModifiedBy(),
                eSlaFulfilledOnStatusDao.getOwner(),
                eSlaFulfilledOnStatusDao.getIsDocStatus(),
                eSlaFulfilledOnStatusDao.getIdx(),
                eSlaFulfilledOnStatusDao.getStatus(),
                eSlaFulfilledOnStatusDao.getParent(),
                eSlaFulfilledOnStatusDao.getParentField(),
                eSlaFulfilledOnStatusDao.getParentType());
    }

    public static void fromDTO(SlaFulfilledOnStatusDto vSlaFulfilledOnStatusDto, SlaFulfilledOnStatusDao eSlaFulfilledOnStatusDao) {
        eSlaFulfilledOnStatusDao.setName(vSlaFulfilledOnStatusDto.name());
        eSlaFulfilledOnStatusDao.setCreation(vSlaFulfilledOnStatusDto.creation());
        eSlaFulfilledOnStatusDao.setModified(vSlaFulfilledOnStatusDto.modified());
        eSlaFulfilledOnStatusDao.setModifiedBy(vSlaFulfilledOnStatusDto.modifiedBy());
        eSlaFulfilledOnStatusDao.setOwner(vSlaFulfilledOnStatusDto.owner());
        eSlaFulfilledOnStatusDao.setIsDocStatus(vSlaFulfilledOnStatusDto.isDocStatus());
        eSlaFulfilledOnStatusDao.setIdx(vSlaFulfilledOnStatusDto.idx());
        eSlaFulfilledOnStatusDao.setStatus(vSlaFulfilledOnStatusDto.status());
        eSlaFulfilledOnStatusDao.setParent(vSlaFulfilledOnStatusDto.parent());
        eSlaFulfilledOnStatusDao.setParentField(vSlaFulfilledOnStatusDto.parentField());
        eSlaFulfilledOnStatusDao.setParentType(vSlaFulfilledOnStatusDto.parentType());
    }
}