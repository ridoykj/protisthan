package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.DynamicLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DynamicLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String linkDocType,
        String linkName,
        String linkTitle,
        String parent,
        String parentField,
        String parentType
) {
    public static DynamicLinkDto fromEntity(DynamicLinkDao eDynamicLinkDao) {
        return new DynamicLinkDto(
                eDynamicLinkDao.getName(),
                eDynamicLinkDao.getCreation(),
                eDynamicLinkDao.getModified(),
                eDynamicLinkDao.getModifiedBy(),
                eDynamicLinkDao.getOwner(),
                eDynamicLinkDao.getIsDocStatus(),
                eDynamicLinkDao.getIdx(),
                eDynamicLinkDao.getLinkDocType(),
                eDynamicLinkDao.getLinkName(),
                eDynamicLinkDao.getLinkTitle(),
                eDynamicLinkDao.getParent(),
                eDynamicLinkDao.getParentField(),
                eDynamicLinkDao.getParentType());
    }

    public static void fromDTO(DynamicLinkDto vDynamicLinkDto, DynamicLinkDao eDynamicLinkDao) {
        eDynamicLinkDao.setName(vDynamicLinkDto.name());
        eDynamicLinkDao.setCreation(vDynamicLinkDto.creation());
        eDynamicLinkDao.setModified(vDynamicLinkDto.modified());
        eDynamicLinkDao.setModifiedBy(vDynamicLinkDto.modifiedBy());
        eDynamicLinkDao.setOwner(vDynamicLinkDto.owner());
        eDynamicLinkDao.setIsDocStatus(vDynamicLinkDto.isDocStatus());
        eDynamicLinkDao.setIdx(vDynamicLinkDto.idx());
        eDynamicLinkDao.setLinkDocType(vDynamicLinkDto.linkDocType());
        eDynamicLinkDao.setLinkName(vDynamicLinkDto.linkName());
        eDynamicLinkDao.setLinkTitle(vDynamicLinkDto.linkTitle());
        eDynamicLinkDao.setParent(vDynamicLinkDto.parent());
        eDynamicLinkDao.setParentField(vDynamicLinkDto.parentField());
        eDynamicLinkDao.setParentType(vDynamicLinkDto.parentType());
    }
}