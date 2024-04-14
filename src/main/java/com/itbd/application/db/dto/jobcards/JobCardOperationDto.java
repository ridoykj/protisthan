package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.jobcards.JobCardOperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobCardOperationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subOperation,
        String completedTime,
        String status,
        BigDecimal completedQty,
        String parent,
        String parentField,
        String parentType
) {
    public static JobCardOperationDto fromEntity(JobCardOperationDao eJobCardOperationDao) {
        return new JobCardOperationDto(
                eJobCardOperationDao.getName(),
                eJobCardOperationDao.getCreation(),
                eJobCardOperationDao.getModified(),
                eJobCardOperationDao.getModifiedBy(),
                eJobCardOperationDao.getOwner(),
                eJobCardOperationDao.getIsDocStatus(),
                eJobCardOperationDao.getIdx(),
                eJobCardOperationDao.getSubOperation(),
                eJobCardOperationDao.getCompletedTime(),
                eJobCardOperationDao.getStatus(),
                eJobCardOperationDao.getCompletedQty(),
                eJobCardOperationDao.getParent(),
                eJobCardOperationDao.getParentField(),
                eJobCardOperationDao.getParentType());
    }

    public static void fromDTO(JobCardOperationDto vJobCardOperationDto, JobCardOperationDao eJobCardOperationDao) {
        eJobCardOperationDao.setName(vJobCardOperationDto.name());
        eJobCardOperationDao.setCreation(vJobCardOperationDto.creation());
        eJobCardOperationDao.setModified(vJobCardOperationDto.modified());
        eJobCardOperationDao.setModifiedBy(vJobCardOperationDto.modifiedBy());
        eJobCardOperationDao.setOwner(vJobCardOperationDto.owner());
        eJobCardOperationDao.setIsDocStatus(vJobCardOperationDto.isDocStatus());
        eJobCardOperationDao.setIdx(vJobCardOperationDto.idx());
        eJobCardOperationDao.setSubOperation(vJobCardOperationDto.subOperation());
        eJobCardOperationDao.setCompletedTime(vJobCardOperationDto.completedTime());
        eJobCardOperationDao.setStatus(vJobCardOperationDto.status());
        eJobCardOperationDao.setCompletedQty(vJobCardOperationDto.completedQty());
        eJobCardOperationDao.setParent(vJobCardOperationDto.parent());
        eJobCardOperationDao.setParentField(vJobCardOperationDto.parentField());
        eJobCardOperationDao.setParentType(vJobCardOperationDto.parentType());
    }
}