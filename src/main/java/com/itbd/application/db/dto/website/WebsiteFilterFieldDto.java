package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.portal.WebsiteFilterFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteFilterFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteFilterFieldDto fromEntity(WebsiteFilterFieldDao eWebsiteFilterFieldDao) {
        return new WebsiteFilterFieldDto(
                eWebsiteFilterFieldDao.getName(),
                eWebsiteFilterFieldDao.getCreation(),
                eWebsiteFilterFieldDao.getModified(),
                eWebsiteFilterFieldDao.getModifiedBy(),
                eWebsiteFilterFieldDao.getOwner(),
                eWebsiteFilterFieldDao.getIsDocStatus(),
                eWebsiteFilterFieldDao.getIdx(),
                eWebsiteFilterFieldDao.getFieldName(),
                eWebsiteFilterFieldDao.getParent(),
                eWebsiteFilterFieldDao.getParentField(),
                eWebsiteFilterFieldDao.getParentType());
    }

    public static void fromDTO(WebsiteFilterFieldDto vWebsiteFilterFieldDto, WebsiteFilterFieldDao eWebsiteFilterFieldDao) {
        eWebsiteFilterFieldDao.setName(vWebsiteFilterFieldDto.name());
        eWebsiteFilterFieldDao.setCreation(vWebsiteFilterFieldDto.creation());
        eWebsiteFilterFieldDao.setModified(vWebsiteFilterFieldDto.modified());
        eWebsiteFilterFieldDao.setModifiedBy(vWebsiteFilterFieldDto.modifiedBy());
        eWebsiteFilterFieldDao.setOwner(vWebsiteFilterFieldDto.owner());
        eWebsiteFilterFieldDao.setIsDocStatus(vWebsiteFilterFieldDto.isDocStatus());
        eWebsiteFilterFieldDao.setIdx(vWebsiteFilterFieldDto.idx());
        eWebsiteFilterFieldDao.setFieldName(vWebsiteFilterFieldDto.fieldName());
        eWebsiteFilterFieldDao.setParent(vWebsiteFilterFieldDto.parent());
        eWebsiteFilterFieldDao.setParentField(vWebsiteFilterFieldDto.parentField());
        eWebsiteFilterFieldDao.setParentType(vWebsiteFilterFieldDto.parentType());
    }
}