package com.itbd.application.db.dto;

import com.itbd.application.db.dao.website.PortalMenuItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PortalMenuItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean enabled,
        String route,
        String referenceDocType,
        String role,
        String target,
        String parent,
        String parentField,
        String parentType
) {
    public static PortalMenuItemDto fromEntity(PortalMenuItemDao ePortalMenuItemDao) {
        return new PortalMenuItemDto(
                ePortalMenuItemDao.getName(),
                ePortalMenuItemDao.getCreation(),
                ePortalMenuItemDao.getModified(),
                ePortalMenuItemDao.getModifiedBy(),
                ePortalMenuItemDao.getOwner(),
                ePortalMenuItemDao.getIsDocStatus(),
                ePortalMenuItemDao.getIdx(),
                ePortalMenuItemDao.getTitle(),
                ePortalMenuItemDao.getEnabled(),
                ePortalMenuItemDao.getRoute(),
                ePortalMenuItemDao.getReferenceDocType(),
                ePortalMenuItemDao.getRole(),
                ePortalMenuItemDao.getTarget(),
                ePortalMenuItemDao.getParent(),
                ePortalMenuItemDao.getParentField(),
                ePortalMenuItemDao.getParentType());
    }

    public static void fromDTO(PortalMenuItemDto vPortalMenuItemDto, PortalMenuItemDao ePortalMenuItemDao) {
        ePortalMenuItemDao.setName(vPortalMenuItemDto.name());
        ePortalMenuItemDao.setCreation(vPortalMenuItemDto.creation());
        ePortalMenuItemDao.setModified(vPortalMenuItemDto.modified());
        ePortalMenuItemDao.setModifiedBy(vPortalMenuItemDto.modifiedBy());
        ePortalMenuItemDao.setOwner(vPortalMenuItemDto.owner());
        ePortalMenuItemDao.setIsDocStatus(vPortalMenuItemDto.isDocStatus());
        ePortalMenuItemDao.setIdx(vPortalMenuItemDto.idx());
        ePortalMenuItemDao.setTitle(vPortalMenuItemDto.title());
        ePortalMenuItemDao.setEnabled(vPortalMenuItemDto.enabled());
        ePortalMenuItemDao.setRoute(vPortalMenuItemDto.route());
        ePortalMenuItemDao.setReferenceDocType(vPortalMenuItemDto.referenceDocType());
        ePortalMenuItemDao.setRole(vPortalMenuItemDto.role());
        ePortalMenuItemDao.setTarget(vPortalMenuItemDto.target());
        ePortalMenuItemDao.setParent(vPortalMenuItemDto.parent());
        ePortalMenuItemDao.setParentField(vPortalMenuItemDto.parentField());
        ePortalMenuItemDao.setParentType(vPortalMenuItemDto.parentType());
    }
}