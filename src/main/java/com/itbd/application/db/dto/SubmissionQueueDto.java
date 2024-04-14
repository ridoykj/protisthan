package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SubmissionQueueDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SubmissionQueueDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String jobId,
        LocalDateTime endedAt,
        String refDocType,
        String refDocName,
        String exception,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubmissionQueueDto fromEntity(SubmissionQueueDao eSubmissionQueueDao) {
        return new SubmissionQueueDto(
                eSubmissionQueueDao.getName(),
                eSubmissionQueueDao.getCreation(),
                eSubmissionQueueDao.getModified(),
                eSubmissionQueueDao.getModifiedBy(),
                eSubmissionQueueDao.getOwner(),
                eSubmissionQueueDao.getIsDocStatus(),
                eSubmissionQueueDao.getIdx(),
                eSubmissionQueueDao.getStatus(),
                eSubmissionQueueDao.getJobId(),
                eSubmissionQueueDao.getEndedAt(),
                eSubmissionQueueDao.getRefDocType(),
                eSubmissionQueueDao.getRefDocName(),
                eSubmissionQueueDao.getException(),
                eSubmissionQueueDao.getUserTags(),
                eSubmissionQueueDao.getComments(),
                eSubmissionQueueDao.getAssign(),
                eSubmissionQueueDao.getLikedBy());
    }

    public static void fromDTO(SubmissionQueueDto vSubmissionQueueDto, SubmissionQueueDao eSubmissionQueueDao) {
        eSubmissionQueueDao.setName(vSubmissionQueueDto.name());
        eSubmissionQueueDao.setCreation(vSubmissionQueueDto.creation());
        eSubmissionQueueDao.setModified(vSubmissionQueueDto.modified());
        eSubmissionQueueDao.setModifiedBy(vSubmissionQueueDto.modifiedBy());
        eSubmissionQueueDao.setOwner(vSubmissionQueueDto.owner());
        eSubmissionQueueDao.setIsDocStatus(vSubmissionQueueDto.isDocStatus());
        eSubmissionQueueDao.setIdx(vSubmissionQueueDto.idx());
        eSubmissionQueueDao.setStatus(vSubmissionQueueDto.status());
        eSubmissionQueueDao.setJobId(vSubmissionQueueDto.jobId());
        eSubmissionQueueDao.setEndedAt(vSubmissionQueueDto.endedAt());
        eSubmissionQueueDao.setRefDocType(vSubmissionQueueDto.refDocType());
        eSubmissionQueueDao.setRefDocName(vSubmissionQueueDto.refDocName());
        eSubmissionQueueDao.setException(vSubmissionQueueDto.exception());
        eSubmissionQueueDao.setUserTags(vSubmissionQueueDto.userTags());
        eSubmissionQueueDao.setComments(vSubmissionQueueDto.comments());
        eSubmissionQueueDao.setAssign(vSubmissionQueueDto.assign());
        eSubmissionQueueDao.setLikedBy(vSubmissionQueueDto.likedBy());
    }
}