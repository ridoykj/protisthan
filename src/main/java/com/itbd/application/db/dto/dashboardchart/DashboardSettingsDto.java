package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.desk.deshboard.DashboardSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DashboardSettingsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String chartConfig,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DashboardSettingsDto fromEntity(DashboardSettingsDao eDashboardSettingsDao) {
        return new DashboardSettingsDto(
                eDashboardSettingsDao.getName(),
                eDashboardSettingsDao.getCreation(),
                eDashboardSettingsDao.getModified(),
                eDashboardSettingsDao.getModifiedBy(),
                eDashboardSettingsDao.getOwner(),
                eDashboardSettingsDao.getIsDocStatus(),
                eDashboardSettingsDao.getIdx(),
                eDashboardSettingsDao.getUser(),
                eDashboardSettingsDao.getChartConfig(),
                eDashboardSettingsDao.getUserTags(),
                eDashboardSettingsDao.getComments(),
                eDashboardSettingsDao.getAssign(),
                eDashboardSettingsDao.getLikedBy());
    }

    public static void fromDTO(DashboardSettingsDto vDashboardSettingsDto, DashboardSettingsDao eDashboardSettingsDao) {
        eDashboardSettingsDao.setName(vDashboardSettingsDto.name());
        eDashboardSettingsDao.setCreation(vDashboardSettingsDto.creation());
        eDashboardSettingsDao.setModified(vDashboardSettingsDto.modified());
        eDashboardSettingsDao.setModifiedBy(vDashboardSettingsDto.modifiedBy());
        eDashboardSettingsDao.setOwner(vDashboardSettingsDto.owner());
        eDashboardSettingsDao.setIsDocStatus(vDashboardSettingsDto.isDocStatus());
        eDashboardSettingsDao.setIdx(vDashboardSettingsDto.idx());
        eDashboardSettingsDao.setUser(vDashboardSettingsDto.user());
        eDashboardSettingsDao.setChartConfig(vDashboardSettingsDto.chartConfig());
        eDashboardSettingsDao.setUserTags(vDashboardSettingsDto.userTags());
        eDashboardSettingsDao.setComments(vDashboardSettingsDto.comments());
        eDashboardSettingsDao.setAssign(vDashboardSettingsDto.assign());
        eDashboardSettingsDao.setLikedBy(vDashboardSettingsDto.likedBy());
    }
}