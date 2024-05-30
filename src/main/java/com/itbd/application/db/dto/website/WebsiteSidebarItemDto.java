package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteSidebarItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteSidebarItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String route,
        String group,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteSidebarItemDto fromEntity(WebsiteSidebarItemDao eWebsiteSidebarItemDao) {
        return new WebsiteSidebarItemDto(
                eWebsiteSidebarItemDao.getName(),
                eWebsiteSidebarItemDao.getCreation(),
                eWebsiteSidebarItemDao.getModified(),
                eWebsiteSidebarItemDao.getModifiedBy(),
                eWebsiteSidebarItemDao.getOwner(),
                eWebsiteSidebarItemDao.getIsDocStatus(),
                eWebsiteSidebarItemDao.getIdx(),
                eWebsiteSidebarItemDao.getTitle(),
                eWebsiteSidebarItemDao.getRoute(),
                eWebsiteSidebarItemDao.getGroup(),
                eWebsiteSidebarItemDao.getParent(),
                eWebsiteSidebarItemDao.getParentField(),
                eWebsiteSidebarItemDao.getParentType());
    }

    public static void fromDTO(WebsiteSidebarItemDto vWebsiteSidebarItemDto, WebsiteSidebarItemDao eWebsiteSidebarItemDao) {
        eWebsiteSidebarItemDao.setName(vWebsiteSidebarItemDto.name());
        eWebsiteSidebarItemDao.setCreation(vWebsiteSidebarItemDto.creation());
        eWebsiteSidebarItemDao.setModified(vWebsiteSidebarItemDto.modified());
        eWebsiteSidebarItemDao.setModifiedBy(vWebsiteSidebarItemDto.modifiedBy());
        eWebsiteSidebarItemDao.setOwner(vWebsiteSidebarItemDto.owner());
        eWebsiteSidebarItemDao.setIsDocStatus(vWebsiteSidebarItemDto.isDocStatus());
        eWebsiteSidebarItemDao.setIdx(vWebsiteSidebarItemDto.idx());
        eWebsiteSidebarItemDao.setTitle(vWebsiteSidebarItemDto.title());
        eWebsiteSidebarItemDao.setRoute(vWebsiteSidebarItemDto.route());
        eWebsiteSidebarItemDao.setGroup(vWebsiteSidebarItemDto.group());
        eWebsiteSidebarItemDao.setParent(vWebsiteSidebarItemDto.parent());
        eWebsiteSidebarItemDao.setParentField(vWebsiteSidebarItemDto.parentField());
        eWebsiteSidebarItemDao.setParentType(vWebsiteSidebarItemDto.parentType());
    }
}