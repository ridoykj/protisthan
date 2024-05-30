package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.desk.deshboard.DashboardChartSourceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DashboardChartSourceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String sourceName,
        String module,
        Boolean timeseries,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DashboardChartSourceDto fromEntity(DashboardChartSourceDao eDashboardChartSouDao) {
        return new DashboardChartSourceDto(
                eDashboardChartSouDao.getName(),
                eDashboardChartSouDao.getCreation(),
                eDashboardChartSouDao.getModified(),
                eDashboardChartSouDao.getModifiedBy(),
                eDashboardChartSouDao.getOwner(),
                eDashboardChartSouDao.getIsDocStatus(),
                eDashboardChartSouDao.getIdx(),
                eDashboardChartSouDao.getSourceName(),
                eDashboardChartSouDao.getModule(),
                eDashboardChartSouDao.getTimeseries(),
                eDashboardChartSouDao.getUserTags(),
                eDashboardChartSouDao.getComments(),
                eDashboardChartSouDao.getAssign(),
                eDashboardChartSouDao.getLikedBy());
    }

    public static void fromDTO(DashboardChartSourceDto vDashboardChartSouDto, DashboardChartSourceDao eDashboardChartSouDao) {
        eDashboardChartSouDao.setName(vDashboardChartSouDto.name());
        eDashboardChartSouDao.setCreation(vDashboardChartSouDto.creation());
        eDashboardChartSouDao.setModified(vDashboardChartSouDto.modified());
        eDashboardChartSouDao.setModifiedBy(vDashboardChartSouDto.modifiedBy());
        eDashboardChartSouDao.setOwner(vDashboardChartSouDto.owner());
        eDashboardChartSouDao.setIsDocStatus(vDashboardChartSouDto.isDocStatus());
        eDashboardChartSouDao.setIdx(vDashboardChartSouDto.idx());
        eDashboardChartSouDao.setSourceName(vDashboardChartSouDto.sourceName());
        eDashboardChartSouDao.setModule(vDashboardChartSouDto.module());
        eDashboardChartSouDao.setTimeseries(vDashboardChartSouDto.timeseries());
        eDashboardChartSouDao.setUserTags(vDashboardChartSouDto.userTags());
        eDashboardChartSouDao.setComments(vDashboardChartSouDto.comments());
        eDashboardChartSouDao.setAssign(vDashboardChartSouDto.assign());
        eDashboardChartSouDao.setLikedBy(vDashboardChartSouDto.likedBy());
    }
}