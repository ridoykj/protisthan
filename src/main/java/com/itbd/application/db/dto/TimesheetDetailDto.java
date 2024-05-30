package com.itbd.application.db.dto;

import com.itbd.application.db.dao.projects.timesheet.TimesheetDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TimesheetDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String activityType,
        LocalDateTime fromTime,
        String description,
        BigDecimal expectedHours,
        LocalDateTime toTime,
        BigDecimal hours,
        Boolean completed,
        String project,
        String projectName,
        String task,
        Boolean isBillable,
        String salesInvoice,
        BigDecimal billingHours,
        BigDecimal baseBillingRate,
        BigDecimal baseBillingAmount,
        BigDecimal baseCostingRate,
        BigDecimal baseCostingAmount,
        BigDecimal billingRate,
        BigDecimal billingAmount,
        BigDecimal costingRate,
        BigDecimal costingAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static TimesheetDetailDto fromEntity(TimesheetDetailDao eTimesheetDetailDao) {
        return new TimesheetDetailDto(
                eTimesheetDetailDao.getName(),
                eTimesheetDetailDao.getCreation(),
                eTimesheetDetailDao.getModified(),
                eTimesheetDetailDao.getModifiedBy(),
                eTimesheetDetailDao.getOwner(),
                eTimesheetDetailDao.getIsDocStatus(),
                eTimesheetDetailDao.getIdx(),
                eTimesheetDetailDao.getActivityType(),
                eTimesheetDetailDao.getFromTime(),
                eTimesheetDetailDao.getDescription(),
                eTimesheetDetailDao.getExpectedHours(),
                eTimesheetDetailDao.getToTime(),
                eTimesheetDetailDao.getHours(),
                eTimesheetDetailDao.getCompleted(),
                eTimesheetDetailDao.getProject(),
                eTimesheetDetailDao.getProjectName(),
                eTimesheetDetailDao.getTask(),
                eTimesheetDetailDao.getIsBillable(),
                eTimesheetDetailDao.getSalesInvoice(),
                eTimesheetDetailDao.getBillingHours(),
                eTimesheetDetailDao.getBaseBillingRate(),
                eTimesheetDetailDao.getBaseBillingAmount(),
                eTimesheetDetailDao.getBaseCostingRate(),
                eTimesheetDetailDao.getBaseCostingAmount(),
                eTimesheetDetailDao.getBillingRate(),
                eTimesheetDetailDao.getBillingAmount(),
                eTimesheetDetailDao.getCostingRate(),
                eTimesheetDetailDao.getCostingAmount(),
                eTimesheetDetailDao.getParent(),
                eTimesheetDetailDao.getParentField(),
                eTimesheetDetailDao.getParentType());
    }

    public static void fromDTO(TimesheetDetailDto vTimesheetDetailDto, TimesheetDetailDao eTimesheetDetailDao) {
        eTimesheetDetailDao.setName(vTimesheetDetailDto.name());
        eTimesheetDetailDao.setCreation(vTimesheetDetailDto.creation());
        eTimesheetDetailDao.setModified(vTimesheetDetailDto.modified());
        eTimesheetDetailDao.setModifiedBy(vTimesheetDetailDto.modifiedBy());
        eTimesheetDetailDao.setOwner(vTimesheetDetailDto.owner());
        eTimesheetDetailDao.setIsDocStatus(vTimesheetDetailDto.isDocStatus());
        eTimesheetDetailDao.setIdx(vTimesheetDetailDto.idx());
        eTimesheetDetailDao.setActivityType(vTimesheetDetailDto.activityType());
        eTimesheetDetailDao.setFromTime(vTimesheetDetailDto.fromTime());
        eTimesheetDetailDao.setDescription(vTimesheetDetailDto.description());
        eTimesheetDetailDao.setExpectedHours(vTimesheetDetailDto.expectedHours());
        eTimesheetDetailDao.setToTime(vTimesheetDetailDto.toTime());
        eTimesheetDetailDao.setHours(vTimesheetDetailDto.hours());
        eTimesheetDetailDao.setCompleted(vTimesheetDetailDto.completed());
        eTimesheetDetailDao.setProject(vTimesheetDetailDto.project());
        eTimesheetDetailDao.setProjectName(vTimesheetDetailDto.projectName());
        eTimesheetDetailDao.setTask(vTimesheetDetailDto.task());
        eTimesheetDetailDao.setIsBillable(vTimesheetDetailDto.isBillable());
        eTimesheetDetailDao.setSalesInvoice(vTimesheetDetailDto.salesInvoice());
        eTimesheetDetailDao.setBillingHours(vTimesheetDetailDto.billingHours());
        eTimesheetDetailDao.setBaseBillingRate(vTimesheetDetailDto.baseBillingRate());
        eTimesheetDetailDao.setBaseBillingAmount(vTimesheetDetailDto.baseBillingAmount());
        eTimesheetDetailDao.setBaseCostingRate(vTimesheetDetailDto.baseCostingRate());
        eTimesheetDetailDao.setBaseCostingAmount(vTimesheetDetailDto.baseCostingAmount());
        eTimesheetDetailDao.setBillingRate(vTimesheetDetailDto.billingRate());
        eTimesheetDetailDao.setBillingAmount(vTimesheetDetailDto.billingAmount());
        eTimesheetDetailDao.setCostingRate(vTimesheetDetailDto.costingRate());
        eTimesheetDetailDao.setCostingAmount(vTimesheetDetailDto.costingAmount());
        eTimesheetDetailDao.setParent(vTimesheetDetailDto.parent());
        eTimesheetDetailDao.setParentField(vTimesheetDetailDto.parentField());
        eTimesheetDetailDao.setParentType(vTimesheetDetailDto.parentType());
    }
}