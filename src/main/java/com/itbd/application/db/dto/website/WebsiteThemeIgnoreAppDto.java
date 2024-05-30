package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteThemeIgnoreAppDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteThemeIgnoreAppDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String app,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteThemeIgnoreAppDto fromEntity(WebsiteThemeIgnoreAppDao eWebsiteThemeIgnoreAppDao) {
        return new WebsiteThemeIgnoreAppDto(
                eWebsiteThemeIgnoreAppDao.getName(),
                eWebsiteThemeIgnoreAppDao.getCreation(),
                eWebsiteThemeIgnoreAppDao.getModified(),
                eWebsiteThemeIgnoreAppDao.getModifiedBy(),
                eWebsiteThemeIgnoreAppDao.getOwner(),
                eWebsiteThemeIgnoreAppDao.getIsDocStatus(),
                eWebsiteThemeIgnoreAppDao.getIdx(),
                eWebsiteThemeIgnoreAppDao.getApp(),
                eWebsiteThemeIgnoreAppDao.getParent(),
                eWebsiteThemeIgnoreAppDao.getParentField(),
                eWebsiteThemeIgnoreAppDao.getParentType());
    }

    public static void fromDTO(WebsiteThemeIgnoreAppDto vWebsiteThemeIgnoreAppDto, WebsiteThemeIgnoreAppDao eWebsiteThemeIgnoreAppDao) {
        eWebsiteThemeIgnoreAppDao.setName(vWebsiteThemeIgnoreAppDto.name());
        eWebsiteThemeIgnoreAppDao.setCreation(vWebsiteThemeIgnoreAppDto.creation());
        eWebsiteThemeIgnoreAppDao.setModified(vWebsiteThemeIgnoreAppDto.modified());
        eWebsiteThemeIgnoreAppDao.setModifiedBy(vWebsiteThemeIgnoreAppDto.modifiedBy());
        eWebsiteThemeIgnoreAppDao.setOwner(vWebsiteThemeIgnoreAppDto.owner());
        eWebsiteThemeIgnoreAppDao.setIsDocStatus(vWebsiteThemeIgnoreAppDto.isDocStatus());
        eWebsiteThemeIgnoreAppDao.setIdx(vWebsiteThemeIgnoreAppDto.idx());
        eWebsiteThemeIgnoreAppDao.setApp(vWebsiteThemeIgnoreAppDto.app());
        eWebsiteThemeIgnoreAppDao.setParent(vWebsiteThemeIgnoreAppDto.parent());
        eWebsiteThemeIgnoreAppDao.setParentField(vWebsiteThemeIgnoreAppDto.parentField());
        eWebsiteThemeIgnoreAppDao.setParentType(vWebsiteThemeIgnoreAppDto.parentType());
    }
}