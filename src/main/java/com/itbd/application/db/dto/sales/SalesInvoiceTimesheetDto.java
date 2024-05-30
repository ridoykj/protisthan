package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.accounts.sales.SalesInvoiceTimesheetDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SalesInvoiceTimesheetDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String activityType,
        String description,
        LocalDateTime fromTime,
        LocalDateTime toTime,
        BigDecimal billingHours,
        BigDecimal billingAmount,
        String timeSheet,
        String timesheetDetail,
        String projectName,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesInvoiceTimesheetDto fromEntity(SalesInvoiceTimesheetDao eSalesInvoiceTimesheetDao) {
        return new SalesInvoiceTimesheetDto(
                eSalesInvoiceTimesheetDao.getName(),
                eSalesInvoiceTimesheetDao.getCreation(),
                eSalesInvoiceTimesheetDao.getModified(),
                eSalesInvoiceTimesheetDao.getModifiedBy(),
                eSalesInvoiceTimesheetDao.getOwner(),
                eSalesInvoiceTimesheetDao.getIsDocStatus(),
                eSalesInvoiceTimesheetDao.getIdx(),
                eSalesInvoiceTimesheetDao.getActivityType(),
                eSalesInvoiceTimesheetDao.getDescription(),
                eSalesInvoiceTimesheetDao.getFromTime(),
                eSalesInvoiceTimesheetDao.getToTime(),
                eSalesInvoiceTimesheetDao.getBillingHours(),
                eSalesInvoiceTimesheetDao.getBillingAmount(),
                eSalesInvoiceTimesheetDao.getTimeSheet(),
                eSalesInvoiceTimesheetDao.getTimesheetDetail(),
                eSalesInvoiceTimesheetDao.getProjectName(),
                eSalesInvoiceTimesheetDao.getParent(),
                eSalesInvoiceTimesheetDao.getParentField(),
                eSalesInvoiceTimesheetDao.getParentType());
    }

    public static void fromDTO(SalesInvoiceTimesheetDto vSalesInvoiceTimesheetDto, SalesInvoiceTimesheetDao eSalesInvoiceTimesheetDao) {
        eSalesInvoiceTimesheetDao.setName(vSalesInvoiceTimesheetDto.name());
        eSalesInvoiceTimesheetDao.setCreation(vSalesInvoiceTimesheetDto.creation());
        eSalesInvoiceTimesheetDao.setModified(vSalesInvoiceTimesheetDto.modified());
        eSalesInvoiceTimesheetDao.setModifiedBy(vSalesInvoiceTimesheetDto.modifiedBy());
        eSalesInvoiceTimesheetDao.setOwner(vSalesInvoiceTimesheetDto.owner());
        eSalesInvoiceTimesheetDao.setIsDocStatus(vSalesInvoiceTimesheetDto.isDocStatus());
        eSalesInvoiceTimesheetDao.setIdx(vSalesInvoiceTimesheetDto.idx());
        eSalesInvoiceTimesheetDao.setActivityType(vSalesInvoiceTimesheetDto.activityType());
        eSalesInvoiceTimesheetDao.setDescription(vSalesInvoiceTimesheetDto.description());
        eSalesInvoiceTimesheetDao.setFromTime(vSalesInvoiceTimesheetDto.fromTime());
        eSalesInvoiceTimesheetDao.setToTime(vSalesInvoiceTimesheetDto.toTime());
        eSalesInvoiceTimesheetDao.setBillingHours(vSalesInvoiceTimesheetDto.billingHours());
        eSalesInvoiceTimesheetDao.setBillingAmount(vSalesInvoiceTimesheetDto.billingAmount());
        eSalesInvoiceTimesheetDao.setTimeSheet(vSalesInvoiceTimesheetDto.timeSheet());
        eSalesInvoiceTimesheetDao.setTimesheetDetail(vSalesInvoiceTimesheetDto.timesheetDetail());
        eSalesInvoiceTimesheetDao.setProjectName(vSalesInvoiceTimesheetDto.projectName());
        eSalesInvoiceTimesheetDao.setParent(vSalesInvoiceTimesheetDto.parent());
        eSalesInvoiceTimesheetDao.setParentField(vSalesInvoiceTimesheetDto.parentField());
        eSalesInvoiceTimesheetDao.setParentType(vSalesInvoiceTimesheetDto.parentType());
    }
}