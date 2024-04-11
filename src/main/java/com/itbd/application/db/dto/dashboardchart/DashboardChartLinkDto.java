package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.dashboardchart.DashboardChartLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DashboardChartLinkDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String chart,
        String width,
        String parent,
        String parentField,
        String parentType
) {
    public static DashboardChartLinkDto fromEntity(DashboardChartLinkDao eDashboardChartLDao) {
        return new DashboardChartLinkDto(
                eDashboardChartLDao.getName(),
                eDashboardChartLDao.getCreation(),
                eDashboardChartLDao.getModified(),
                eDashboardChartLDao.getModifiedBy(),
                eDashboardChartLDao.getOwner(),
                eDashboardChartLDao.getIsDocStatus(),
                eDashboardChartLDao.getIdx(),
                eDashboardChartLDao.getChart(),
                eDashboardChartLDao.getWidth(),
                eDashboardChartLDao.getParent(),
                eDashboardChartLDao.getParentField(),
                eDashboardChartLDao.getParentType());
    }

    public static void fromDTO(DashboardChartLinkDto vDashboardChartLDto, DashboardChartLinkDao eDashboardChartLDao) {
        eDashboardChartLDao.setName(vDashboardChartLDto.name());
        eDashboardChartLDao.setCreation(vDashboardChartLDto.creation());
        eDashboardChartLDao.setModified(vDashboardChartLDto.modified());
        eDashboardChartLDao.setModifiedBy(vDashboardChartLDto.modifiedBy());
        eDashboardChartLDao.setOwner(vDashboardChartLDto.owner());
        eDashboardChartLDao.setIsDocStatus(vDashboardChartLDto.isDocStatus());
        eDashboardChartLDao.setIdx(vDashboardChartLDto.idx());
        eDashboardChartLDao.setChart(vDashboardChartLDto.chart());
        eDashboardChartLDao.setWidth(vDashboardChartLDto.width());
        eDashboardChartLDao.setParent(vDashboardChartLDto.parent());
        eDashboardChartLDao.setParentField(vDashboardChartLDto.parentField());
        eDashboardChartLDao.setParentType(vDashboardChartLDto.parentType());
    }
}