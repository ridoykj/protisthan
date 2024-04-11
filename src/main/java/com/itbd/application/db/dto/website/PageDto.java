package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.PageDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PageDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean systemPage,
        String pageName,
        String title,
        String icon,
        String module,
        String restrictToDomain,
        String standard,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PageDto fromEntity(PageDao ePageDao) {
        return new PageDto(
                ePageDao.getName(),
                ePageDao.getCreation(),
                ePageDao.getModified(),
                ePageDao.getModifiedBy(),
                ePageDao.getOwner(),
                ePageDao.getIsDocStatus(),
                ePageDao.getIdx(),
                ePageDao.getSystemPage(),
                ePageDao.getPageName(),
                ePageDao.getTitle(),
                ePageDao.getIcon(),
                ePageDao.getModule(),
                ePageDao.getRestrictToDomain(),
                ePageDao.getStandard(),
                ePageDao.getUserTags(),
                ePageDao.getComments(),
                ePageDao.getAssign(),
                ePageDao.getLikedBy());
    }

    public static void fromDTO(PageDto vPageDto, PageDao ePageDao) {
        ePageDao.setName(vPageDto.name());
        ePageDao.setCreation(vPageDto.creation());
        ePageDao.setModified(vPageDto.modified());
        ePageDao.setModifiedBy(vPageDto.modifiedBy());
        ePageDao.setOwner(vPageDto.owner());
        ePageDao.setIsDocStatus(vPageDto.isDocStatus());
        ePageDao.setIdx(vPageDto.idx());
        ePageDao.setSystemPage(vPageDto.systemPage());
        ePageDao.setPageName(vPageDto.pageName());
        ePageDao.setTitle(vPageDto.title());
        ePageDao.setIcon(vPageDto.icon());
        ePageDao.setModule(vPageDto.module());
        ePageDao.setRestrictToDomain(vPageDto.restrictToDomain());
        ePageDao.setStandard(vPageDto.standard());
        ePageDao.setUserTags(vPageDto.userTags());
        ePageDao.setComments(vPageDto.comments());
        ePageDao.setAssign(vPageDto.assign());
        ePageDao.setLikedBy(vPageDto.likedBy());
    }
}