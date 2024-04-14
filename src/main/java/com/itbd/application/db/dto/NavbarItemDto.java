package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NavbarItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NavbarItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemLabel,
        String itemType,
        String route,
        String action,
        Boolean hidden,
        Boolean isStandard,
        String parent,
        String parentField,
        String parentType
) {
    public static NavbarItemDto fromEntity(NavbarItemDao eNavbarItemDao) {
        return new NavbarItemDto(
                eNavbarItemDao.getName(),
                eNavbarItemDao.getCreation(),
                eNavbarItemDao.getModified(),
                eNavbarItemDao.getModifiedBy(),
                eNavbarItemDao.getOwner(),
                eNavbarItemDao.getIsDocStatus(),
                eNavbarItemDao.getIdx(),
                eNavbarItemDao.getItemLabel(),
                eNavbarItemDao.getItemType(),
                eNavbarItemDao.getRoute(),
                eNavbarItemDao.getAction(),
                eNavbarItemDao.getHidden(),
                eNavbarItemDao.getIsStandard(),
                eNavbarItemDao.getParent(),
                eNavbarItemDao.getParentField(),
                eNavbarItemDao.getParentType());
    }

    public static void fromDTO(NavbarItemDto vNavbarItemDto, NavbarItemDao eNavbarItemDao) {
        eNavbarItemDao.setName(vNavbarItemDto.name());
        eNavbarItemDao.setCreation(vNavbarItemDto.creation());
        eNavbarItemDao.setModified(vNavbarItemDto.modified());
        eNavbarItemDao.setModifiedBy(vNavbarItemDto.modifiedBy());
        eNavbarItemDao.setOwner(vNavbarItemDto.owner());
        eNavbarItemDao.setIsDocStatus(vNavbarItemDto.isDocStatus());
        eNavbarItemDao.setIdx(vNavbarItemDto.idx());
        eNavbarItemDao.setItemLabel(vNavbarItemDto.itemLabel());
        eNavbarItemDao.setItemType(vNavbarItemDto.itemType());
        eNavbarItemDao.setRoute(vNavbarItemDto.route());
        eNavbarItemDao.setAction(vNavbarItemDto.action());
        eNavbarItemDao.setHidden(vNavbarItemDto.hidden());
        eNavbarItemDao.setIsStandard(vNavbarItemDto.isStandard());
        eNavbarItemDao.setParent(vNavbarItemDto.parent());
        eNavbarItemDao.setParentField(vNavbarItemDto.parentField());
        eNavbarItemDao.setParentType(vNavbarItemDto.parentType());
    }
}