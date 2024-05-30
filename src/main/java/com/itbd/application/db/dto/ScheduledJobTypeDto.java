package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.ScheduledJobTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ScheduledJobTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean stopped,
        String method,
        String serverScript,
        String frequency,
        String cronFormat,
        Boolean createLog,
        LocalDateTime lastExecution,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ScheduledJobTypeDto fromEntity(ScheduledJobTypeDao eScheduledJobTypeDao) {
        return new ScheduledJobTypeDto(
                eScheduledJobTypeDao.getName(),
                eScheduledJobTypeDao.getCreation(),
                eScheduledJobTypeDao.getModified(),
                eScheduledJobTypeDao.getModifiedBy(),
                eScheduledJobTypeDao.getOwner(),
                eScheduledJobTypeDao.getIsDocStatus(),
                eScheduledJobTypeDao.getIdx(),
                eScheduledJobTypeDao.getStopped(),
                eScheduledJobTypeDao.getMethod(),
                eScheduledJobTypeDao.getServerScript(),
                eScheduledJobTypeDao.getFrequency(),
                eScheduledJobTypeDao.getCronFormat(),
                eScheduledJobTypeDao.getCreateLog(),
                eScheduledJobTypeDao.getLastExecution(),
                eScheduledJobTypeDao.getUserTags(),
                eScheduledJobTypeDao.getComments(),
                eScheduledJobTypeDao.getAssign(),
                eScheduledJobTypeDao.getLikedBy());
    }

    public static void fromDTO(ScheduledJobTypeDto vScheduledJobTypeDto, ScheduledJobTypeDao eScheduledJobTypeDao) {
        eScheduledJobTypeDao.setName(vScheduledJobTypeDto.name());
        eScheduledJobTypeDao.setCreation(vScheduledJobTypeDto.creation());
        eScheduledJobTypeDao.setModified(vScheduledJobTypeDto.modified());
        eScheduledJobTypeDao.setModifiedBy(vScheduledJobTypeDto.modifiedBy());
        eScheduledJobTypeDao.setOwner(vScheduledJobTypeDto.owner());
        eScheduledJobTypeDao.setIsDocStatus(vScheduledJobTypeDto.isDocStatus());
        eScheduledJobTypeDao.setIdx(vScheduledJobTypeDto.idx());
        eScheduledJobTypeDao.setStopped(vScheduledJobTypeDto.stopped());
        eScheduledJobTypeDao.setMethod(vScheduledJobTypeDto.method());
        eScheduledJobTypeDao.setServerScript(vScheduledJobTypeDto.serverScript());
        eScheduledJobTypeDao.setFrequency(vScheduledJobTypeDto.frequency());
        eScheduledJobTypeDao.setCronFormat(vScheduledJobTypeDto.cronFormat());
        eScheduledJobTypeDao.setCreateLog(vScheduledJobTypeDto.createLog());
        eScheduledJobTypeDao.setLastExecution(vScheduledJobTypeDto.lastExecution());
        eScheduledJobTypeDao.setUserTags(vScheduledJobTypeDto.userTags());
        eScheduledJobTypeDao.setComments(vScheduledJobTypeDto.comments());
        eScheduledJobTypeDao.setAssign(vScheduledJobTypeDto.assign());
        eScheduledJobTypeDao.setLikedBy(vScheduledJobTypeDto.likedBy());
    }
}