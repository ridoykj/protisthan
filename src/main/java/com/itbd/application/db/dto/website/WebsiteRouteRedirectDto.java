package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteRouteRedirectDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteRouteRedirectDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String source,
        String target,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteRouteRedirectDto fromEntity(WebsiteRouteRedirectDao eWebsiteRouteRedirectDao) {
        return new WebsiteRouteRedirectDto(
                eWebsiteRouteRedirectDao.getName(),
                eWebsiteRouteRedirectDao.getCreation(),
                eWebsiteRouteRedirectDao.getModified(),
                eWebsiteRouteRedirectDao.getModifiedBy(),
                eWebsiteRouteRedirectDao.getOwner(),
                eWebsiteRouteRedirectDao.getIsDocStatus(),
                eWebsiteRouteRedirectDao.getIdx(),
                eWebsiteRouteRedirectDao.getSource(),
                eWebsiteRouteRedirectDao.getTarget(),
                eWebsiteRouteRedirectDao.getParent(),
                eWebsiteRouteRedirectDao.getParentField(),
                eWebsiteRouteRedirectDao.getParentType());
    }

    public static void fromDTO(WebsiteRouteRedirectDto vWebsiteRouteRedirectDto, WebsiteRouteRedirectDao eWebsiteRouteRedirectDao) {
        eWebsiteRouteRedirectDao.setName(vWebsiteRouteRedirectDto.name());
        eWebsiteRouteRedirectDao.setCreation(vWebsiteRouteRedirectDto.creation());
        eWebsiteRouteRedirectDao.setModified(vWebsiteRouteRedirectDto.modified());
        eWebsiteRouteRedirectDao.setModifiedBy(vWebsiteRouteRedirectDto.modifiedBy());
        eWebsiteRouteRedirectDao.setOwner(vWebsiteRouteRedirectDto.owner());
        eWebsiteRouteRedirectDao.setIsDocStatus(vWebsiteRouteRedirectDto.isDocStatus());
        eWebsiteRouteRedirectDao.setIdx(vWebsiteRouteRedirectDto.idx());
        eWebsiteRouteRedirectDao.setSource(vWebsiteRouteRedirectDto.source());
        eWebsiteRouteRedirectDao.setTarget(vWebsiteRouteRedirectDto.target());
        eWebsiteRouteRedirectDao.setParent(vWebsiteRouteRedirectDto.parent());
        eWebsiteRouteRedirectDao.setParentField(vWebsiteRouteRedirectDto.parentField());
        eWebsiteRouteRedirectDao.setParentType(vWebsiteRouteRedirectDto.parentType());
    }
}