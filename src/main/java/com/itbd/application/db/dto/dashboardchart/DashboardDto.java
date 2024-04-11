package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.dashboardchart.DashboardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DashboardDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dashboardName,
        Boolean isDefault,
        Boolean isStandard,
        String module,
        String chartOptions,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DashboardDto fromEntity(DashboardDao eDashboardDao) {
        return new DashboardDto(
                eDashboardDao.getName(),
                eDashboardDao.getCreation(),
                eDashboardDao.getModified(),
                eDashboardDao.getModifiedBy(),
                eDashboardDao.getOwner(),
                eDashboardDao.getIsDocStatus(),
                eDashboardDao.getIdx(),
                eDashboardDao.getDashboardName(),
                eDashboardDao.getIsDefault(),
                eDashboardDao.getIsStandard(),
                eDashboardDao.getModule(),
                eDashboardDao.getChartOptions(),
                eDashboardDao.getUserTags(),
                eDashboardDao.getComments(),
                eDashboardDao.getAssign(),
                eDashboardDao.getLikedBy());
    }

    public static void fromDTO(DashboardDto vDashboardDto, DashboardDao eDashboardDao) {
        eDashboardDao.setName(vDashboardDto.name());
        eDashboardDao.setCreation(vDashboardDto.creation());
        eDashboardDao.setModified(vDashboardDto.modified());
        eDashboardDao.setModifiedBy(vDashboardDto.modifiedBy());
        eDashboardDao.setOwner(vDashboardDto.owner());
        eDashboardDao.setIsDocStatus(vDashboardDto.isDocStatus());
        eDashboardDao.setIdx(vDashboardDto.idx());
        eDashboardDao.setDashboardName(vDashboardDto.dashboardName());
        eDashboardDao.setIsDefault(vDashboardDto.isDefault());
        eDashboardDao.setIsStandard(vDashboardDto.isStandard());
        eDashboardDao.setModule(vDashboardDto.module());
        eDashboardDao.setChartOptions(vDashboardDto.chartOptions());
        eDashboardDao.setUserTags(vDashboardDto.userTags());
        eDashboardDao.setComments(vDashboardDto.comments());
        eDashboardDao.setAssign(vDashboardDto.assign());
        eDashboardDao.setLikedBy(vDashboardDto.likedBy());
    }
}