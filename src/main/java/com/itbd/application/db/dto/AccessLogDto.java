package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.AccessLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AccessLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String exportFrom,
        String user,
        String referenceDocument,
        LocalDateTime timestamp,
        String fileType,
        String method,
        String reportName,
        String filters,
        String page,
        String columns,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static AccessLogDto fromEntity(AccessLogDao eAccessLogDao) {
        return new AccessLogDto(
                eAccessLogDao.getName(),
                eAccessLogDao.getCreation(),
                eAccessLogDao.getModified(),
                eAccessLogDao.getModifiedBy(),
                eAccessLogDao.getOwner(),
                eAccessLogDao.getIsDocStatus(),
                eAccessLogDao.getIdx(),
                eAccessLogDao.getExportFrom(),
                eAccessLogDao.getUser(),
                eAccessLogDao.getReferenceDocument(),
                eAccessLogDao.getTimestamp(),
                eAccessLogDao.getFileType(),
                eAccessLogDao.getMethod(),
                eAccessLogDao.getReportName(),
                eAccessLogDao.getFilters(),
                eAccessLogDao.getPage(),
                eAccessLogDao.getColumns(),
                eAccessLogDao.getUserTags(),
                eAccessLogDao.getComments(),
                eAccessLogDao.getAssign(),
                eAccessLogDao.getLikedBy(),
                eAccessLogDao.getSeen());
    }

    public static void fromDTO(AccessLogDto vAccessLogDto, AccessLogDao eAccessLogDao) {
        eAccessLogDao.setName(vAccessLogDto.name());
        eAccessLogDao.setCreation(vAccessLogDto.creation());
        eAccessLogDao.setModified(vAccessLogDto.modified());
        eAccessLogDao.setModifiedBy(vAccessLogDto.modifiedBy());
        eAccessLogDao.setOwner(vAccessLogDto.owner());
        eAccessLogDao.setIsDocStatus(vAccessLogDto.isDocStatus());
        eAccessLogDao.setIdx(vAccessLogDto.idx());
        eAccessLogDao.setExportFrom(vAccessLogDto.exportFrom());
        eAccessLogDao.setUser(vAccessLogDto.user());
        eAccessLogDao.setReferenceDocument(vAccessLogDto.referenceDocument());
        eAccessLogDao.setTimestamp(vAccessLogDto.timestamp());
        eAccessLogDao.setFileType(vAccessLogDto.fileType());
        eAccessLogDao.setMethod(vAccessLogDto.method());
        eAccessLogDao.setReportName(vAccessLogDto.reportName());
        eAccessLogDao.setFilters(vAccessLogDto.filters());
        eAccessLogDao.setPage(vAccessLogDto.page());
        eAccessLogDao.setColumns(vAccessLogDto.columns());
        eAccessLogDao.setUserTags(vAccessLogDto.userTags());
        eAccessLogDao.setComments(vAccessLogDto.comments());
        eAccessLogDao.setAssign(vAccessLogDto.assign());
        eAccessLogDao.setLikedBy(vAccessLogDto.likedBy());
        eAccessLogDao.setSeen(vAccessLogDto.seen());
    }
}