package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.portal.WebsiteAttributeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteAttributeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String attribute,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteAttributeDto fromEntity(WebsiteAttributeDao eWebsiteAttributeDao) {
        return new WebsiteAttributeDto(
                eWebsiteAttributeDao.getName(),
                eWebsiteAttributeDao.getCreation(),
                eWebsiteAttributeDao.getModified(),
                eWebsiteAttributeDao.getModifiedBy(),
                eWebsiteAttributeDao.getOwner(),
                eWebsiteAttributeDao.getIsDocStatus(),
                eWebsiteAttributeDao.getIdx(),
                eWebsiteAttributeDao.getAttribute(),
                eWebsiteAttributeDao.getParent(),
                eWebsiteAttributeDao.getParentField(),
                eWebsiteAttributeDao.getParentType());
    }

    public static void fromDTO(WebsiteAttributeDto vWebsiteAttributeDto, WebsiteAttributeDao eWebsiteAttributeDao) {
        eWebsiteAttributeDao.setName(vWebsiteAttributeDto.name());
        eWebsiteAttributeDao.setCreation(vWebsiteAttributeDto.creation());
        eWebsiteAttributeDao.setModified(vWebsiteAttributeDto.modified());
        eWebsiteAttributeDao.setModifiedBy(vWebsiteAttributeDto.modifiedBy());
        eWebsiteAttributeDao.setOwner(vWebsiteAttributeDto.owner());
        eWebsiteAttributeDao.setIsDocStatus(vWebsiteAttributeDto.isDocStatus());
        eWebsiteAttributeDao.setIdx(vWebsiteAttributeDto.idx());
        eWebsiteAttributeDao.setAttribute(vWebsiteAttributeDto.attribute());
        eWebsiteAttributeDao.setParent(vWebsiteAttributeDto.parent());
        eWebsiteAttributeDao.setParentField(vWebsiteAttributeDto.parentField());
        eWebsiteAttributeDao.setParentType(vWebsiteAttributeDto.parentType());
    }
}