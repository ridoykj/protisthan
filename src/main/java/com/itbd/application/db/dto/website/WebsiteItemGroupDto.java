package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.WebsiteItemGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteItemGroupDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteItemGroupDto fromEntity(WebsiteItemGroupDao eWebsiteItemGroupDao) {
        return new WebsiteItemGroupDto(
                eWebsiteItemGroupDao.getName(),
                eWebsiteItemGroupDao.getCreation(),
                eWebsiteItemGroupDao.getModified(),
                eWebsiteItemGroupDao.getModifiedBy(),
                eWebsiteItemGroupDao.getOwner(),
                eWebsiteItemGroupDao.getIsDocStatus(),
                eWebsiteItemGroupDao.getIdx(),
                eWebsiteItemGroupDao.getItemGroup(),
                eWebsiteItemGroupDao.getParent(),
                eWebsiteItemGroupDao.getParentField(),
                eWebsiteItemGroupDao.getParentType());
    }

    public static void fromDTO(WebsiteItemGroupDto vWebsiteItemGroupDto, WebsiteItemGroupDao eWebsiteItemGroupDao) {
        eWebsiteItemGroupDao.setName(vWebsiteItemGroupDto.name());
        eWebsiteItemGroupDao.setCreation(vWebsiteItemGroupDto.creation());
        eWebsiteItemGroupDao.setModified(vWebsiteItemGroupDto.modified());
        eWebsiteItemGroupDao.setModifiedBy(vWebsiteItemGroupDto.modifiedBy());
        eWebsiteItemGroupDao.setOwner(vWebsiteItemGroupDto.owner());
        eWebsiteItemGroupDao.setIsDocStatus(vWebsiteItemGroupDto.isDocStatus());
        eWebsiteItemGroupDao.setIdx(vWebsiteItemGroupDto.idx());
        eWebsiteItemGroupDao.setItemGroup(vWebsiteItemGroupDto.itemGroup());
        eWebsiteItemGroupDao.setParent(vWebsiteItemGroupDto.parent());
        eWebsiteItemGroupDao.setParentField(vWebsiteItemGroupDto.parentField());
        eWebsiteItemGroupDao.setParentType(vWebsiteItemGroupDto.parentType());
    }
}