package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteRouteMetaDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteRouteMetaDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebsiteRouteMetaDto fromEntity(WebsiteRouteMetaDao eWebsiteRouteMetaDao) {
        return new WebsiteRouteMetaDto(
                eWebsiteRouteMetaDao.getName(),
                eWebsiteRouteMetaDao.getCreation(),
                eWebsiteRouteMetaDao.getModified(),
                eWebsiteRouteMetaDao.getModifiedBy(),
                eWebsiteRouteMetaDao.getOwner(),
                eWebsiteRouteMetaDao.getIsDocStatus(),
                eWebsiteRouteMetaDao.getIdx(),
                eWebsiteRouteMetaDao.getUserTags(),
                eWebsiteRouteMetaDao.getComments(),
                eWebsiteRouteMetaDao.getAssign(),
                eWebsiteRouteMetaDao.getLikedBy());
    }

    public static void fromDTO(WebsiteRouteMetaDto vWebsiteRouteMetaDto, WebsiteRouteMetaDao eWebsiteRouteMetaDao) {
        eWebsiteRouteMetaDao.setName(vWebsiteRouteMetaDto.name());
        eWebsiteRouteMetaDao.setCreation(vWebsiteRouteMetaDto.creation());
        eWebsiteRouteMetaDao.setModified(vWebsiteRouteMetaDto.modified());
        eWebsiteRouteMetaDao.setModifiedBy(vWebsiteRouteMetaDto.modifiedBy());
        eWebsiteRouteMetaDao.setOwner(vWebsiteRouteMetaDto.owner());
        eWebsiteRouteMetaDao.setIsDocStatus(vWebsiteRouteMetaDto.isDocStatus());
        eWebsiteRouteMetaDao.setIdx(vWebsiteRouteMetaDto.idx());
        eWebsiteRouteMetaDao.setUserTags(vWebsiteRouteMetaDto.userTags());
        eWebsiteRouteMetaDao.setComments(vWebsiteRouteMetaDto.comments());
        eWebsiteRouteMetaDao.setAssign(vWebsiteRouteMetaDto.assign());
        eWebsiteRouteMetaDao.setLikedBy(vWebsiteRouteMetaDto.likedBy());
    }
}