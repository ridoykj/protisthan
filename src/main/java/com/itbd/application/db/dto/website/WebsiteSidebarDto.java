package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteSidebarDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteSidebarDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebsiteSidebarDto fromEntity(WebsiteSidebarDao eWebsiteSidebarDao) {
        return new WebsiteSidebarDto(
                eWebsiteSidebarDao.getName(),
                eWebsiteSidebarDao.getCreation(),
                eWebsiteSidebarDao.getModified(),
                eWebsiteSidebarDao.getModifiedBy(),
                eWebsiteSidebarDao.getOwner(),
                eWebsiteSidebarDao.getIsDocStatus(),
                eWebsiteSidebarDao.getIdx(),
                eWebsiteSidebarDao.getTitle(),
                eWebsiteSidebarDao.getUserTags(),
                eWebsiteSidebarDao.getComments(),
                eWebsiteSidebarDao.getAssign(),
                eWebsiteSidebarDao.getLikedBy());
    }

    public static void fromDTO(WebsiteSidebarDto vWebsiteSidebarDto, WebsiteSidebarDao eWebsiteSidebarDao) {
        eWebsiteSidebarDao.setName(vWebsiteSidebarDto.name());
        eWebsiteSidebarDao.setCreation(vWebsiteSidebarDto.creation());
        eWebsiteSidebarDao.setModified(vWebsiteSidebarDto.modified());
        eWebsiteSidebarDao.setModifiedBy(vWebsiteSidebarDto.modifiedBy());
        eWebsiteSidebarDao.setOwner(vWebsiteSidebarDto.owner());
        eWebsiteSidebarDao.setIsDocStatus(vWebsiteSidebarDto.isDocStatus());
        eWebsiteSidebarDao.setIdx(vWebsiteSidebarDto.idx());
        eWebsiteSidebarDao.setTitle(vWebsiteSidebarDto.title());
        eWebsiteSidebarDao.setUserTags(vWebsiteSidebarDto.userTags());
        eWebsiteSidebarDao.setComments(vWebsiteSidebarDto.comments());
        eWebsiteSidebarDao.setAssign(vWebsiteSidebarDto.assign());
        eWebsiteSidebarDao.setLikedBy(vWebsiteSidebarDto.likedBy());
    }
}