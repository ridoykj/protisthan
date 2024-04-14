package com.itbd.application.db.dto.dashboardchart;

import com.itbd.application.db.dao.dashboardchart.DashboardChartDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DashboardChartDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isStandard,
        String module,
        String chartName,
        String chartType,
        String reportName,
        Boolean useReportChart,
        String xField,
        String source,
        String documentType,
        String parentDocumentType,
        String basedOn,
        String valueBasedOn,
        String groupByType,
        String groupByBasedOn,
        String aggregateFunctionBasedOn,
        Integer numberOfGroups,
        Boolean isPublic,
        String heatmapYear,
        String timespan,
        LocalDate fromDate,
        LocalDate toDate,
        String timeInterval,
        Boolean timeseries,
        String type,
        String filtersJson,
        String dynamicFiltersJson,
        String customOptions,
        String color,
        LocalDateTime lastSyncedOn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DashboardChartDto fromEntity(DashboardChartDao eDashboardChDao) {
        return new DashboardChartDto(
                eDashboardChDao.getName(),
                eDashboardChDao.getCreation(),
                eDashboardChDao.getModified(),
                eDashboardChDao.getModifiedBy(),
                eDashboardChDao.getOwner(),
                eDashboardChDao.getIsDocStatus(),
                eDashboardChDao.getIdx(),
                eDashboardChDao.getIsStandard(),
                eDashboardChDao.getModule(),
                eDashboardChDao.getChartName(),
                eDashboardChDao.getChartType(),
                eDashboardChDao.getReportName(),
                eDashboardChDao.getUseReportChart(),
                eDashboardChDao.getXField(),
                eDashboardChDao.getSource(),
                eDashboardChDao.getDocumentType(),
                eDashboardChDao.getParentDocumentType(),
                eDashboardChDao.getBasedOn(),
                eDashboardChDao.getValueBasedOn(),
                eDashboardChDao.getGroupByType(),
                eDashboardChDao.getGroupByBasedOn(),
                eDashboardChDao.getAggregateFunctionBasedOn(),
                eDashboardChDao.getNumberOfGroups(),
                eDashboardChDao.getIsPublic(),
                eDashboardChDao.getHeatmapYear(),
                eDashboardChDao.getTimespan(),
                eDashboardChDao.getFromDate(),
                eDashboardChDao.getToDate(),
                eDashboardChDao.getTimeInterval(),
                eDashboardChDao.getTimeseries(),
                eDashboardChDao.getType(),
                eDashboardChDao.getFiltersJson(),
                eDashboardChDao.getDynamicFiltersJson(),
                eDashboardChDao.getCustomOptions(),
                eDashboardChDao.getColor(),
                eDashboardChDao.getLastSyncedOn(),
                eDashboardChDao.getUserTags(),
                eDashboardChDao.getComments(),
                eDashboardChDao.getAssign(),
                eDashboardChDao.getLikedBy());
    }

    public static void fromDTO(DashboardChartDto vDashboardChDto, DashboardChartDao eDashboardChDao) {
        eDashboardChDao.setName(vDashboardChDto.name());
        eDashboardChDao.setCreation(vDashboardChDto.creation());
        eDashboardChDao.setModified(vDashboardChDto.modified());
        eDashboardChDao.setModifiedBy(vDashboardChDto.modifiedBy());
        eDashboardChDao.setOwner(vDashboardChDto.owner());
        eDashboardChDao.setIsDocStatus(vDashboardChDto.isDocStatus());
        eDashboardChDao.setIdx(vDashboardChDto.idx());
        eDashboardChDao.setIsStandard(vDashboardChDto.isStandard());
        eDashboardChDao.setModule(vDashboardChDto.module());
        eDashboardChDao.setChartName(vDashboardChDto.chartName());
        eDashboardChDao.setChartType(vDashboardChDto.chartType());
        eDashboardChDao.setReportName(vDashboardChDto.reportName());
        eDashboardChDao.setUseReportChart(vDashboardChDto.useReportChart());
        eDashboardChDao.setXField(vDashboardChDto.xField());
        eDashboardChDao.setSource(vDashboardChDto.source());
        eDashboardChDao.setDocumentType(vDashboardChDto.documentType());
        eDashboardChDao.setParentDocumentType(vDashboardChDto.parentDocumentType());
        eDashboardChDao.setBasedOn(vDashboardChDto.basedOn());
        eDashboardChDao.setValueBasedOn(vDashboardChDto.valueBasedOn());
        eDashboardChDao.setGroupByType(vDashboardChDto.groupByType());
        eDashboardChDao.setGroupByBasedOn(vDashboardChDto.groupByBasedOn());
        eDashboardChDao.setAggregateFunctionBasedOn(vDashboardChDto.aggregateFunctionBasedOn());
        eDashboardChDao.setNumberOfGroups(vDashboardChDto.numberOfGroups());
        eDashboardChDao.setIsPublic(vDashboardChDto.isPublic());
        eDashboardChDao.setHeatmapYear(vDashboardChDto.heatmapYear());
        eDashboardChDao.setTimespan(vDashboardChDto.timespan());
        eDashboardChDao.setFromDate(vDashboardChDto.fromDate());
        eDashboardChDao.setToDate(vDashboardChDto.toDate());
        eDashboardChDao.setTimeInterval(vDashboardChDto.timeInterval());
        eDashboardChDao.setTimeseries(vDashboardChDto.timeseries());
        eDashboardChDao.setType(vDashboardChDto.type());
        eDashboardChDao.setFiltersJson(vDashboardChDto.filtersJson());
        eDashboardChDao.setDynamicFiltersJson(vDashboardChDto.dynamicFiltersJson());
        eDashboardChDao.setCustomOptions(vDashboardChDto.customOptions());
        eDashboardChDao.setColor(vDashboardChDto.color());
        eDashboardChDao.setLastSyncedOn(vDashboardChDto.lastSyncedOn());
        eDashboardChDao.setUserTags(vDashboardChDto.userTags());
        eDashboardChDao.setComments(vDashboardChDto.comments());
        eDashboardChDao.setAssign(vDashboardChDto.assign());
        eDashboardChDao.setLikedBy(vDashboardChDto.likedBy());
    }
}