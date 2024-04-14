package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.WebsiteSlideshowDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteSlideshowDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String slideshowName,
        String header,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebsiteSlideshowDto fromEntity(WebsiteSlideshowDao eWebsiteSlideshowDao) {
        return new WebsiteSlideshowDto(
                eWebsiteSlideshowDao.getName(),
                eWebsiteSlideshowDao.getCreation(),
                eWebsiteSlideshowDao.getModified(),
                eWebsiteSlideshowDao.getModifiedBy(),
                eWebsiteSlideshowDao.getOwner(),
                eWebsiteSlideshowDao.getIsDocStatus(),
                eWebsiteSlideshowDao.getIdx(),
                eWebsiteSlideshowDao.getSlideshowName(),
                eWebsiteSlideshowDao.getHeader(),
                eWebsiteSlideshowDao.getUserTags(),
                eWebsiteSlideshowDao.getComments(),
                eWebsiteSlideshowDao.getAssign(),
                eWebsiteSlideshowDao.getLikedBy());
    }

    public static void fromDTO(WebsiteSlideshowDto vWebsiteSlideshowDto, WebsiteSlideshowDao eWebsiteSlideshowDao) {
        eWebsiteSlideshowDao.setName(vWebsiteSlideshowDto.name());
        eWebsiteSlideshowDao.setCreation(vWebsiteSlideshowDto.creation());
        eWebsiteSlideshowDao.setModified(vWebsiteSlideshowDto.modified());
        eWebsiteSlideshowDao.setModifiedBy(vWebsiteSlideshowDto.modifiedBy());
        eWebsiteSlideshowDao.setOwner(vWebsiteSlideshowDto.owner());
        eWebsiteSlideshowDao.setIsDocStatus(vWebsiteSlideshowDto.isDocStatus());
        eWebsiteSlideshowDao.setIdx(vWebsiteSlideshowDto.idx());
        eWebsiteSlideshowDao.setSlideshowName(vWebsiteSlideshowDto.slideshowName());
        eWebsiteSlideshowDao.setHeader(vWebsiteSlideshowDto.header());
        eWebsiteSlideshowDao.setUserTags(vWebsiteSlideshowDto.userTags());
        eWebsiteSlideshowDao.setComments(vWebsiteSlideshowDto.comments());
        eWebsiteSlideshowDao.setAssign(vWebsiteSlideshowDto.assign());
        eWebsiteSlideshowDao.setLikedBy(vWebsiteSlideshowDto.likedBy());
    }
}