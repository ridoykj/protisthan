package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.ViewLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ViewLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String viewedBy,
        String referenceDocType,
        String referenceName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ViewLogDto fromEntity(ViewLogDao eViewLogDao) {
        return new ViewLogDto(
                eViewLogDao.getName(),
                eViewLogDao.getCreation(),
                eViewLogDao.getModified(),
                eViewLogDao.getModifiedBy(),
                eViewLogDao.getOwner(),
                eViewLogDao.getIsDocStatus(),
                eViewLogDao.getIdx(),
                eViewLogDao.getViewedBy(),
                eViewLogDao.getReferenceDocType(),
                eViewLogDao.getReferenceName(),
                eViewLogDao.getUserTags(),
                eViewLogDao.getComments(),
                eViewLogDao.getAssign(),
                eViewLogDao.getLikedBy());
    }

    public static void fromDTO(ViewLogDto vViewLogDto, ViewLogDao eViewLogDao) {
        eViewLogDao.setName(vViewLogDto.name());
        eViewLogDao.setCreation(vViewLogDto.creation());
        eViewLogDao.setModified(vViewLogDto.modified());
        eViewLogDao.setModifiedBy(vViewLogDto.modifiedBy());
        eViewLogDao.setOwner(vViewLogDto.owner());
        eViewLogDao.setIsDocStatus(vViewLogDto.isDocStatus());
        eViewLogDao.setIdx(vViewLogDto.idx());
        eViewLogDao.setViewedBy(vViewLogDto.viewedBy());
        eViewLogDao.setReferenceDocType(vViewLogDto.referenceDocType());
        eViewLogDao.setReferenceName(vViewLogDto.referenceName());
        eViewLogDao.setUserTags(vViewLogDto.userTags());
        eViewLogDao.setComments(vViewLogDto.comments());
        eViewLogDao.setAssign(vViewLogDto.assign());
        eViewLogDao.setLikedBy(vViewLogDto.likedBy());
    }
}