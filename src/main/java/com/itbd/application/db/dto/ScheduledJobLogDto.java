package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.ScheduledJobLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ScheduledJobLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String scheduledJobType,
        String details,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ScheduledJobLogDto fromEntity(ScheduledJobLogDao eScheduledJobLogDao) {
        return new ScheduledJobLogDto(
                eScheduledJobLogDao.getName(),
                eScheduledJobLogDao.getCreation(),
                eScheduledJobLogDao.getModified(),
                eScheduledJobLogDao.getModifiedBy(),
                eScheduledJobLogDao.getOwner(),
                eScheduledJobLogDao.getIsDocStatus(),
                eScheduledJobLogDao.getIdx(),
                eScheduledJobLogDao.getStatus(),
                eScheduledJobLogDao.getScheduledJobType(),
                eScheduledJobLogDao.getDetails(),
                eScheduledJobLogDao.getUserTags(),
                eScheduledJobLogDao.getComments(),
                eScheduledJobLogDao.getAssign(),
                eScheduledJobLogDao.getLikedBy());
    }

    public static void fromDTO(ScheduledJobLogDto vScheduledJobLogDto, ScheduledJobLogDao eScheduledJobLogDao) {
        eScheduledJobLogDao.setName(vScheduledJobLogDto.name());
        eScheduledJobLogDao.setCreation(vScheduledJobLogDto.creation());
        eScheduledJobLogDao.setModified(vScheduledJobLogDto.modified());
        eScheduledJobLogDao.setModifiedBy(vScheduledJobLogDto.modifiedBy());
        eScheduledJobLogDao.setOwner(vScheduledJobLogDto.owner());
        eScheduledJobLogDao.setIsDocStatus(vScheduledJobLogDto.isDocStatus());
        eScheduledJobLogDao.setIdx(vScheduledJobLogDto.idx());
        eScheduledJobLogDao.setStatus(vScheduledJobLogDto.status());
        eScheduledJobLogDao.setScheduledJobType(vScheduledJobLogDto.scheduledJobType());
        eScheduledJobLogDao.setDetails(vScheduledJobLogDto.details());
        eScheduledJobLogDao.setUserTags(vScheduledJobLogDto.userTags());
        eScheduledJobLogDao.setComments(vScheduledJobLogDto.comments());
        eScheduledJobLogDao.setAssign(vScheduledJobLogDto.assign());
        eScheduledJobLogDao.setLikedBy(vScheduledJobLogDto.likedBy());
    }
}