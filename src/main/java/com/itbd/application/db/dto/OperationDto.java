package com.itbd.application.db.dto;

import com.itbd.application.db.dao.OperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OperationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workstation,
        Boolean isCorrectiveOperation,
        Boolean createJobCardBasedOnBatchSize,
        String qualityInspectionTemplate,
        Integer batchSize,
        BigDecimal totalOperationTime,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OperationDto fromEntity(OperationDao eOperationDao) {
        return new OperationDto(
                eOperationDao.getName(),
                eOperationDao.getCreation(),
                eOperationDao.getModified(),
                eOperationDao.getModifiedBy(),
                eOperationDao.getOwner(),
                eOperationDao.getIsDocStatus(),
                eOperationDao.getIdx(),
                eOperationDao.getWorkstation(),
                eOperationDao.getIsCorrectiveOperation(),
                eOperationDao.getCreateJobCardBasedOnBatchSize(),
                eOperationDao.getQualityInspectionTemplate(),
                eOperationDao.getBatchSize(),
                eOperationDao.getTotalOperationTime(),
                eOperationDao.getDescription(),
                eOperationDao.getUserTags(),
                eOperationDao.getComments(),
                eOperationDao.getAssign(),
                eOperationDao.getLikedBy());
    }

    public static void fromDTO(OperationDto vOperationDto, OperationDao eOperationDao) {
        eOperationDao.setName(vOperationDto.name());
        eOperationDao.setCreation(vOperationDto.creation());
        eOperationDao.setModified(vOperationDto.modified());
        eOperationDao.setModifiedBy(vOperationDto.modifiedBy());
        eOperationDao.setOwner(vOperationDto.owner());
        eOperationDao.setIsDocStatus(vOperationDto.isDocStatus());
        eOperationDao.setIdx(vOperationDto.idx());
        eOperationDao.setWorkstation(vOperationDto.workstation());
        eOperationDao.setIsCorrectiveOperation(vOperationDto.isCorrectiveOperation());
        eOperationDao.setCreateJobCardBasedOnBatchSize(vOperationDto.createJobCardBasedOnBatchSize());
        eOperationDao.setQualityInspectionTemplate(vOperationDto.qualityInspectionTemplate());
        eOperationDao.setBatchSize(vOperationDto.batchSize());
        eOperationDao.setTotalOperationTime(vOperationDto.totalOperationTime());
        eOperationDao.setDescription(vOperationDto.description());
        eOperationDao.setUserTags(vOperationDto.userTags());
        eOperationDao.setComments(vOperationDto.comments());
        eOperationDao.setAssign(vOperationDto.assign());
        eOperationDao.setLikedBy(vOperationDto.likedBy());
    }
}