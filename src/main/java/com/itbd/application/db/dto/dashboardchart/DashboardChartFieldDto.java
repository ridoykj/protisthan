package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.desk.deshboard.DashboardChartFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DashboardChartFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String yField,
        String color,
        String parent,
        String parentField,
        String parentType
) {
    public static DashboardChartFieldDto fromEntity(DashboardChartFieldDao eDashboardChartFiDao) {
        return new DashboardChartFieldDto(
                eDashboardChartFiDao.getName(),
                eDashboardChartFiDao.getCreation(),
                eDashboardChartFiDao.getModified(),
                eDashboardChartFiDao.getModifiedBy(),
                eDashboardChartFiDao.getOwner(),
                eDashboardChartFiDao.getIsDocStatus(),
                eDashboardChartFiDao.getIdx(),
                eDashboardChartFiDao.getYField(),
                eDashboardChartFiDao.getColor(),
                eDashboardChartFiDao.getParent(),
                eDashboardChartFiDao.getParentField(),
                eDashboardChartFiDao.getParentType());
    }

    //    DashboardChartFiDao
    public static void fromDTO(DashboardChartFieldDto vDashboardChartFiDto, DashboardChartFieldDao eDashboardChartFiDao) {
        eDashboardChartFiDao.setName(vDashboardChartFiDto.name());
        eDashboardChartFiDao.setCreation(vDashboardChartFiDto.creation());
        eDashboardChartFiDao.setModified(vDashboardChartFiDto.modified());
        eDashboardChartFiDao.setModifiedBy(vDashboardChartFiDto.modifiedBy());
        eDashboardChartFiDao.setOwner(vDashboardChartFiDto.owner());
        eDashboardChartFiDao.setIsDocStatus(vDashboardChartFiDto.isDocStatus());
        eDashboardChartFiDao.setIdx(vDashboardChartFiDto.idx());
        eDashboardChartFiDao.setYField(vDashboardChartFiDto.yField());
        eDashboardChartFiDao.setColor(vDashboardChartFiDto.color());
        eDashboardChartFiDao.setParent(vDashboardChartFiDto.parent());
        eDashboardChartFiDao.setParentField(vDashboardChartFiDto.parentField());
        eDashboardChartFiDao.setParentType(vDashboardChartFiDto.parentType());
    }
}