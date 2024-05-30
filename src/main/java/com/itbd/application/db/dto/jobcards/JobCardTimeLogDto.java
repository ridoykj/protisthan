package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.manufacturing.jobcard.JobCardTimeLogDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobCardTimeLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String employee,
        LocalDateTime fromTime,
        LocalDateTime toTime,
        BigDecimal timeInMins,
        BigDecimal completedQty,
        String operation,
        String parent,
        String parentField,
        String parentType
) {
    public static JobCardTimeLogDto fromEntity(JobCardTimeLogDao eJobCardTimeLogDao) {
        return new JobCardTimeLogDto(
                eJobCardTimeLogDao.getName(),
                eJobCardTimeLogDao.getCreation(),
                eJobCardTimeLogDao.getModified(),
                eJobCardTimeLogDao.getModifiedBy(),
                eJobCardTimeLogDao.getOwner(),
                eJobCardTimeLogDao.getIsDocStatus(),
                eJobCardTimeLogDao.getIdx(),
                eJobCardTimeLogDao.getEmployee(),
                eJobCardTimeLogDao.getFromTime(),
                eJobCardTimeLogDao.getToTime(),
                eJobCardTimeLogDao.getTimeInMins(),
                eJobCardTimeLogDao.getCompletedQty(),
                eJobCardTimeLogDao.getOperation(),
                eJobCardTimeLogDao.getParent(),
                eJobCardTimeLogDao.getParentField(),
                eJobCardTimeLogDao.getParentType());
    }

    public static void fromDTO(JobCardTimeLogDto vJobCardTimeLogDto, JobCardTimeLogDao eJobCardTimeLogDao) {
        eJobCardTimeLogDao.setName(vJobCardTimeLogDto.name());
        eJobCardTimeLogDao.setCreation(vJobCardTimeLogDto.creation());
        eJobCardTimeLogDao.setModified(vJobCardTimeLogDto.modified());
        eJobCardTimeLogDao.setModifiedBy(vJobCardTimeLogDto.modifiedBy());
        eJobCardTimeLogDao.setOwner(vJobCardTimeLogDto.owner());
        eJobCardTimeLogDao.setIsDocStatus(vJobCardTimeLogDto.isDocStatus());
        eJobCardTimeLogDao.setIdx(vJobCardTimeLogDto.idx());
        eJobCardTimeLogDao.setEmployee(vJobCardTimeLogDto.employee());
        eJobCardTimeLogDao.setFromTime(vJobCardTimeLogDto.fromTime());
        eJobCardTimeLogDao.setToTime(vJobCardTimeLogDto.toTime());
        eJobCardTimeLogDao.setTimeInMins(vJobCardTimeLogDto.timeInMins());
        eJobCardTimeLogDao.setCompletedQty(vJobCardTimeLogDto.completedQty());
        eJobCardTimeLogDao.setOperation(vJobCardTimeLogDto.operation());
        eJobCardTimeLogDao.setParent(vJobCardTimeLogDto.parent());
        eJobCardTimeLogDao.setParentField(vJobCardTimeLogDto.parentField());
        eJobCardTimeLogDao.setParentType(vJobCardTimeLogDto.parentType());
    }
}