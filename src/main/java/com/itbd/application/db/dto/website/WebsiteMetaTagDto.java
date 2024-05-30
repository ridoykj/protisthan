package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteMetaTagDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteMetaTagDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String key,
        String value,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteMetaTagDto fromEntity(WebsiteMetaTagDao eWebsiteMetaTagDao) {
        return new WebsiteMetaTagDto(
                eWebsiteMetaTagDao.getName(),
                eWebsiteMetaTagDao.getCreation(),
                eWebsiteMetaTagDao.getModified(),
                eWebsiteMetaTagDao.getModifiedBy(),
                eWebsiteMetaTagDao.getOwner(),
                eWebsiteMetaTagDao.getIsDocStatus(),
                eWebsiteMetaTagDao.getIdx(),
                eWebsiteMetaTagDao.getKey(),
                eWebsiteMetaTagDao.getValue(),
                eWebsiteMetaTagDao.getParent(),
                eWebsiteMetaTagDao.getParentField(),
                eWebsiteMetaTagDao.getParentType());
    }

    public static void fromDTO(WebsiteMetaTagDto vWebsiteMetaTagDto, WebsiteMetaTagDao eWebsiteMetaTagDao) {
        eWebsiteMetaTagDao.setName(vWebsiteMetaTagDto.name());
        eWebsiteMetaTagDao.setCreation(vWebsiteMetaTagDto.creation());
        eWebsiteMetaTagDao.setModified(vWebsiteMetaTagDto.modified());
        eWebsiteMetaTagDao.setModifiedBy(vWebsiteMetaTagDto.modifiedBy());
        eWebsiteMetaTagDao.setOwner(vWebsiteMetaTagDto.owner());
        eWebsiteMetaTagDao.setIsDocStatus(vWebsiteMetaTagDto.isDocStatus());
        eWebsiteMetaTagDao.setIdx(vWebsiteMetaTagDto.idx());
        eWebsiteMetaTagDao.setKey(vWebsiteMetaTagDto.key());
        eWebsiteMetaTagDao.setValue(vWebsiteMetaTagDto.value());
        eWebsiteMetaTagDao.setParent(vWebsiteMetaTagDto.parent());
        eWebsiteMetaTagDao.setParentField(vWebsiteMetaTagDto.parentField());
        eWebsiteMetaTagDao.setParentType(vWebsiteMetaTagDto.parentType());
    }
}