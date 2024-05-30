package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.manufacturing.jobcard.JobCardScheduledTimeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobCardScheduledTimeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDateTime fromTime,
        LocalDateTime toTime,
        BigDecimal timeInMins,
        String parent,
        String parentField,
        String parentType
) {
    public static JobCardScheduledTimeDto fromEntity(JobCardScheduledTimeDao eJobCardScheduledTimeDao) {
        return new JobCardScheduledTimeDto(
                eJobCardScheduledTimeDao.getName(),
                eJobCardScheduledTimeDao.getCreation(),
                eJobCardScheduledTimeDao.getModified(),
                eJobCardScheduledTimeDao.getModifiedBy(),
                eJobCardScheduledTimeDao.getOwner(),
                eJobCardScheduledTimeDao.getIsDocStatus(),
                eJobCardScheduledTimeDao.getIdx(),
                eJobCardScheduledTimeDao.getFromTime(),
                eJobCardScheduledTimeDao.getToTime(),
                eJobCardScheduledTimeDao.getTimeInMins(),
                eJobCardScheduledTimeDao.getParent(),
                eJobCardScheduledTimeDao.getParentField(),
                eJobCardScheduledTimeDao.getParentType());
    }

    public static void fromDTO(JobCardScheduledTimeDto vJobCardScheduledTimeDto, JobCardScheduledTimeDao eJobCardScheduledTimeDao) {
        eJobCardScheduledTimeDao.setName(vJobCardScheduledTimeDto.name());
        eJobCardScheduledTimeDao.setCreation(vJobCardScheduledTimeDto.creation());
        eJobCardScheduledTimeDao.setModified(vJobCardScheduledTimeDto.modified());
        eJobCardScheduledTimeDao.setModifiedBy(vJobCardScheduledTimeDto.modifiedBy());
        eJobCardScheduledTimeDao.setOwner(vJobCardScheduledTimeDto.owner());
        eJobCardScheduledTimeDao.setIsDocStatus(vJobCardScheduledTimeDto.isDocStatus());
        eJobCardScheduledTimeDao.setIdx(vJobCardScheduledTimeDto.idx());
        eJobCardScheduledTimeDao.setFromTime(vJobCardScheduledTimeDto.fromTime());
        eJobCardScheduledTimeDao.setToTime(vJobCardScheduledTimeDto.toTime());
        eJobCardScheduledTimeDao.setTimeInMins(vJobCardScheduledTimeDto.timeInMins());
        eJobCardScheduledTimeDao.setParent(vJobCardScheduledTimeDto.parent());
        eJobCardScheduledTimeDao.setParentField(vJobCardScheduledTimeDto.parentField());
        eJobCardScheduledTimeDao.setParentType(vJobCardScheduledTimeDto.parentType());
    }
}