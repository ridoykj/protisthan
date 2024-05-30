package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.ErrorLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ErrorLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean seen,
        String referenceDocType,
        String referenceName,
        String method,
        String error,
        String traceId,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ErrorLogDto fromEntity(ErrorLogDao eErrorLogDao) {
        return new ErrorLogDto(
                eErrorLogDao.getName(),
                eErrorLogDao.getCreation(),
                eErrorLogDao.getModified(),
                eErrorLogDao.getModifiedBy(),
                eErrorLogDao.getOwner(),
                eErrorLogDao.getIsDocStatus(),
                eErrorLogDao.getIdx(),
                eErrorLogDao.getSeen(),
                eErrorLogDao.getReferenceDocType(),
                eErrorLogDao.getReferenceName(),
                eErrorLogDao.getMethod(),
                eErrorLogDao.getError(),
                eErrorLogDao.getTraceId(),
                eErrorLogDao.getUserTags(),
                eErrorLogDao.getComments(),
                eErrorLogDao.getAssign(),
                eErrorLogDao.getLikedBy());
    }

    public static void fromDTO(ErrorLogDto vErrorLogDto, ErrorLogDao eErrorLogDao) {
        eErrorLogDao.setName(vErrorLogDto.name());
        eErrorLogDao.setCreation(vErrorLogDto.creation());
        eErrorLogDao.setModified(vErrorLogDto.modified());
        eErrorLogDao.setModifiedBy(vErrorLogDto.modifiedBy());
        eErrorLogDao.setOwner(vErrorLogDto.owner());
        eErrorLogDao.setIsDocStatus(vErrorLogDto.isDocStatus());
        eErrorLogDao.setIdx(vErrorLogDto.idx());
        eErrorLogDao.setSeen(vErrorLogDto.seen());
        eErrorLogDao.setReferenceDocType(vErrorLogDto.referenceDocType());
        eErrorLogDao.setReferenceName(vErrorLogDto.referenceName());
        eErrorLogDao.setMethod(vErrorLogDto.method());
        eErrorLogDao.setError(vErrorLogDto.error());
        eErrorLogDao.setTraceId(vErrorLogDto.traceId());
        eErrorLogDao.setUserTags(vErrorLogDto.userTags());
        eErrorLogDao.setComments(vErrorLogDto.comments());
        eErrorLogDao.setAssign(vErrorLogDto.assign());
        eErrorLogDao.setLikedBy(vErrorLogDto.likedBy());
    }
}