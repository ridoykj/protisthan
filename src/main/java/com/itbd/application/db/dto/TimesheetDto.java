package com.itbd.application.db.dto;

import com.itbd.application.db.dao.projects.timesheet.TimesheetDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record TimesheetDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String namingSeries,
        String company,
        String customer,
        String currency,
        BigDecimal exchangeRate,
        String salesInvoice,
        String status,
        String parentProject,
        String employee,
        String employeeName,
        String department,
        String user,
        LocalDate startDate,
        LocalDate endDate,
        BigDecimal totalHours,
        BigDecimal totalBillableHours,
        BigDecimal baseTotalBillableAmount,
        BigDecimal baseTotalBilledAmount,
        BigDecimal baseTotalCostingAmount,
        BigDecimal totalBilledHours,
        BigDecimal totalBillableAmount,
        BigDecimal totalBilledAmount,
        BigDecimal totalCostingAmount,
        BigDecimal perBilled,
        String note,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TimesheetDto fromEntity(TimesheetDao eTimesheetDao) {
        return new TimesheetDto(
                eTimesheetDao.getName(),
                eTimesheetDao.getCreation(),
                eTimesheetDao.getModified(),
                eTimesheetDao.getModifiedBy(),
                eTimesheetDao.getOwner(),
                eTimesheetDao.getIsDocStatus(),
                eTimesheetDao.getIdx(),
                eTimesheetDao.getTitle(),
                eTimesheetDao.getNamingSeries(),
                eTimesheetDao.getCompany(),
                eTimesheetDao.getCustomer(),
                eTimesheetDao.getCurrency(),
                eTimesheetDao.getExchangeRate(),
                eTimesheetDao.getSalesInvoice(),
                eTimesheetDao.getStatus(),
                eTimesheetDao.getParentProject(),
                eTimesheetDao.getEmployee(),
                eTimesheetDao.getEmployeeName(),
                eTimesheetDao.getDepartment(),
                eTimesheetDao.getUser(),
                eTimesheetDao.getStartDate(),
                eTimesheetDao.getEndDate(),
                eTimesheetDao.getTotalHours(),
                eTimesheetDao.getTotalBillableHours(),
                eTimesheetDao.getBaseTotalBillableAmount(),
                eTimesheetDao.getBaseTotalBilledAmount(),
                eTimesheetDao.getBaseTotalCostingAmount(),
                eTimesheetDao.getTotalBilledHours(),
                eTimesheetDao.getTotalBillableAmount(),
                eTimesheetDao.getTotalBilledAmount(),
                eTimesheetDao.getTotalCostingAmount(),
                eTimesheetDao.getPerBilled(),
                eTimesheetDao.getNote(),
                eTimesheetDao.getAmendedFrom(),
                eTimesheetDao.getUserTags(),
                eTimesheetDao.getComments(),
                eTimesheetDao.getAssign(),
                eTimesheetDao.getLikedBy());
    }

    public static void fromDTO(TimesheetDto vTimesheetDto, TimesheetDao eTimesheetDao) {
        eTimesheetDao.setName(vTimesheetDto.name());
        eTimesheetDao.setCreation(vTimesheetDto.creation());
        eTimesheetDao.setModified(vTimesheetDto.modified());
        eTimesheetDao.setModifiedBy(vTimesheetDto.modifiedBy());
        eTimesheetDao.setOwner(vTimesheetDto.owner());
        eTimesheetDao.setIsDocStatus(vTimesheetDto.isDocStatus());
        eTimesheetDao.setIdx(vTimesheetDto.idx());
        eTimesheetDao.setTitle(vTimesheetDto.title());
        eTimesheetDao.setNamingSeries(vTimesheetDto.namingSeries());
        eTimesheetDao.setCompany(vTimesheetDto.company());
        eTimesheetDao.setCustomer(vTimesheetDto.customer());
        eTimesheetDao.setCurrency(vTimesheetDto.currency());
        eTimesheetDao.setExchangeRate(vTimesheetDto.exchangeRate());
        eTimesheetDao.setSalesInvoice(vTimesheetDto.salesInvoice());
        eTimesheetDao.setStatus(vTimesheetDto.status());
        eTimesheetDao.setParentProject(vTimesheetDto.parentProject());
        eTimesheetDao.setEmployee(vTimesheetDto.employee());
        eTimesheetDao.setEmployeeName(vTimesheetDto.employeeName());
        eTimesheetDao.setDepartment(vTimesheetDto.department());
        eTimesheetDao.setUser(vTimesheetDto.user());
        eTimesheetDao.setStartDate(vTimesheetDto.startDate());
        eTimesheetDao.setEndDate(vTimesheetDto.endDate());
        eTimesheetDao.setTotalHours(vTimesheetDto.totalHours());
        eTimesheetDao.setTotalBillableHours(vTimesheetDto.totalBillableHours());
        eTimesheetDao.setBaseTotalBillableAmount(vTimesheetDto.baseTotalBillableAmount());
        eTimesheetDao.setBaseTotalBilledAmount(vTimesheetDto.baseTotalBilledAmount());
        eTimesheetDao.setBaseTotalCostingAmount(vTimesheetDto.baseTotalCostingAmount());
        eTimesheetDao.setTotalBilledHours(vTimesheetDto.totalBilledHours());
        eTimesheetDao.setTotalBillableAmount(vTimesheetDto.totalBillableAmount());
        eTimesheetDao.setTotalBilledAmount(vTimesheetDto.totalBilledAmount());
        eTimesheetDao.setTotalCostingAmount(vTimesheetDto.totalCostingAmount());
        eTimesheetDao.setPerBilled(vTimesheetDto.perBilled());
        eTimesheetDao.setNote(vTimesheetDto.note());
        eTimesheetDao.setAmendedFrom(vTimesheetDto.amendedFrom());
        eTimesheetDao.setUserTags(vTimesheetDto.userTags());
        eTimesheetDao.setComments(vTimesheetDto.comments());
        eTimesheetDao.setAssign(vTimesheetDto.assign());
        eTimesheetDao.setLikedBy(vTimesheetDto.likedBy());
    }
}