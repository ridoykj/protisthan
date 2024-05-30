package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.PreparedReportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PreparedReportDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String reportName,
        String jobId,
        LocalDateTime reportEndTime,
        String errorMessage,
        String filters,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PreparedReportDto fromEntity(PreparedReportDao ePreparedReportDao) {
        return new PreparedReportDto(
                ePreparedReportDao.getName(),
                ePreparedReportDao.getCreation(),
                ePreparedReportDao.getModified(),
                ePreparedReportDao.getModifiedBy(),
                ePreparedReportDao.getOwner(),
                ePreparedReportDao.getIsDocStatus(),
                ePreparedReportDao.getIdx(),
                ePreparedReportDao.getStatus(),
                ePreparedReportDao.getReportName(),
                ePreparedReportDao.getJobId(),
                ePreparedReportDao.getReportEndTime(),
                ePreparedReportDao.getErrorMessage(),
                ePreparedReportDao.getFilters(),
                ePreparedReportDao.getUserTags(),
                ePreparedReportDao.getComments(),
                ePreparedReportDao.getAssign(),
                ePreparedReportDao.getLikedBy());
    }

    public static void fromDTO(PreparedReportDto vPreparedReportDto, PreparedReportDao ePreparedReportDao) {
        ePreparedReportDao.setName(vPreparedReportDto.name());
        ePreparedReportDao.setCreation(vPreparedReportDto.creation());
        ePreparedReportDao.setModified(vPreparedReportDto.modified());
        ePreparedReportDao.setModifiedBy(vPreparedReportDto.modifiedBy());
        ePreparedReportDao.setOwner(vPreparedReportDto.owner());
        ePreparedReportDao.setIsDocStatus(vPreparedReportDto.isDocStatus());
        ePreparedReportDao.setIdx(vPreparedReportDto.idx());
        ePreparedReportDao.setStatus(vPreparedReportDto.status());
        ePreparedReportDao.setReportName(vPreparedReportDto.reportName());
        ePreparedReportDao.setJobId(vPreparedReportDto.jobId());
        ePreparedReportDao.setReportEndTime(vPreparedReportDto.reportEndTime());
        ePreparedReportDao.setErrorMessage(vPreparedReportDto.errorMessage());
        ePreparedReportDao.setFilters(vPreparedReportDto.filters());
        ePreparedReportDao.setUserTags(vPreparedReportDto.userTags());
        ePreparedReportDao.setComments(vPreparedReportDto.comments());
        ePreparedReportDao.setAssign(vPreparedReportDto.assign());
        ePreparedReportDao.setLikedBy(vPreparedReportDto.likedBy());
    }
}