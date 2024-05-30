package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.project.ProjectDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record ProjectDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String projectName,
        String status,
        String projectType,
        String isActive,
        String percentCompleteMethod,
        BigDecimal percentComplete,
        String projectTemplate,
        LocalDate expectedStartDate,
        LocalDate expectedEndDate,
        String priority,
        String department,
        String customer,
        String salesOrder,
        String copiedFrom,
        String notes,
        LocalDate actualStartDate,
        BigDecimal actualTime,
        LocalDate actualEndDate,
        BigDecimal estimatedCosting,
        BigDecimal totalCostingAmount,
        BigDecimal totalPurchaseCost,
        String company,
        BigDecimal totalSalesAmount,
        BigDecimal totalBillableAmount,
        BigDecimal totalBilledAmount,
        BigDecimal totalConsumedMaterialCost,
        String costCenter,
        BigDecimal grossMargin,
        BigDecimal perGrossMargin,
        Integer collectProgress,
        String holidayList,
        String frequency,
        LocalTime fromTime,
        LocalTime toTime,
        LocalTime firstEmail,
        LocalTime secondEmail,
        LocalTime dailyTimeToSend,
        String dayToSend,
        LocalTime weeklyTimeToSend,
        String message,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static ProjectDto fromEntity(ProjectDao eProjectDao) {
        return new ProjectDto(
                eProjectDao.getName(),
                eProjectDao.getCreation(),
                eProjectDao.getModified(),
                eProjectDao.getModifiedBy(),
                eProjectDao.getOwner(),
                eProjectDao.getIsDocStatus(),
                eProjectDao.getIdx(),
                eProjectDao.getNamingSeries(),
                eProjectDao.getProjectName(),
                eProjectDao.getStatus(),
                eProjectDao.getProjectType(),
                eProjectDao.getIsActive(),
                eProjectDao.getPercentCompleteMethod(),
                eProjectDao.getPercentComplete(),
                eProjectDao.getProjectTemplate(),
                eProjectDao.getExpectedStartDate(),
                eProjectDao.getExpectedEndDate(),
                eProjectDao.getPriority(),
                eProjectDao.getDepartment(),
                eProjectDao.getCustomer(),
                eProjectDao.getSalesOrder(),
                eProjectDao.getCopiedFrom(),
                eProjectDao.getNotes(),
                eProjectDao.getActualStartDate(),
                eProjectDao.getActualTime(),
                eProjectDao.getActualEndDate(),
                eProjectDao.getEstimatedCosting(),
                eProjectDao.getTotalCostingAmount(),
                eProjectDao.getTotalPurchaseCost(),
                eProjectDao.getCompany(),
                eProjectDao.getTotalSalesAmount(),
                eProjectDao.getTotalBillableAmount(),
                eProjectDao.getTotalBilledAmount(),
                eProjectDao.getTotalConsumedMaterialCost(),
                eProjectDao.getCostCenter(),
                eProjectDao.getGrossMargin(),
                eProjectDao.getPerGrossMargin(),
                eProjectDao.getCollectProgress(),
                eProjectDao.getHolidayList(),
                eProjectDao.getFrequency(),
                eProjectDao.getFromTime(),
                eProjectDao.getToTime(),
                eProjectDao.getFirstEmail(),
                eProjectDao.getSecondEmail(),
                eProjectDao.getDailyTimeToSend(),
                eProjectDao.getDayToSend(),
                eProjectDao.getWeeklyTimeToSend(),
                eProjectDao.getMessage(),
                eProjectDao.getUserTags(),
                eProjectDao.getComments(),
                eProjectDao.getAssign(),
                eProjectDao.getLikedBy(),
                eProjectDao.getSeen());
    }

    public static void fromDTO(ProjectDto vProjectDto, ProjectDao eProjectDao) {
        eProjectDao.setName(vProjectDto.name());
        eProjectDao.setCreation(vProjectDto.creation());
        eProjectDao.setModified(vProjectDto.modified());
        eProjectDao.setModifiedBy(vProjectDto.modifiedBy());
        eProjectDao.setOwner(vProjectDto.owner());
        eProjectDao.setIsDocStatus(vProjectDto.isDocStatus());
        eProjectDao.setIdx(vProjectDto.idx());
        eProjectDao.setNamingSeries(vProjectDto.namingSeries());
        eProjectDao.setProjectName(vProjectDto.projectName());
        eProjectDao.setStatus(vProjectDto.status());
        eProjectDao.setProjectType(vProjectDto.projectType());
        eProjectDao.setIsActive(vProjectDto.isActive());
        eProjectDao.setPercentCompleteMethod(vProjectDto.percentCompleteMethod());
        eProjectDao.setPercentComplete(vProjectDto.percentComplete());
        eProjectDao.setProjectTemplate(vProjectDto.projectTemplate());
        eProjectDao.setExpectedStartDate(vProjectDto.expectedStartDate());
        eProjectDao.setExpectedEndDate(vProjectDto.expectedEndDate());
        eProjectDao.setPriority(vProjectDto.priority());
        eProjectDao.setDepartment(vProjectDto.department());
        eProjectDao.setCustomer(vProjectDto.customer());
        eProjectDao.setSalesOrder(vProjectDto.salesOrder());
        eProjectDao.setCopiedFrom(vProjectDto.copiedFrom());
        eProjectDao.setNotes(vProjectDto.notes());
        eProjectDao.setActualStartDate(vProjectDto.actualStartDate());
        eProjectDao.setActualTime(vProjectDto.actualTime());
        eProjectDao.setActualEndDate(vProjectDto.actualEndDate());
        eProjectDao.setEstimatedCosting(vProjectDto.estimatedCosting());
        eProjectDao.setTotalCostingAmount(vProjectDto.totalCostingAmount());
        eProjectDao.setTotalPurchaseCost(vProjectDto.totalPurchaseCost());
        eProjectDao.setCompany(vProjectDto.company());
        eProjectDao.setTotalSalesAmount(vProjectDto.totalSalesAmount());
        eProjectDao.setTotalBillableAmount(vProjectDto.totalBillableAmount());
        eProjectDao.setTotalBilledAmount(vProjectDto.totalBilledAmount());
        eProjectDao.setTotalConsumedMaterialCost(vProjectDto.totalConsumedMaterialCost());
        eProjectDao.setCostCenter(vProjectDto.costCenter());
        eProjectDao.setGrossMargin(vProjectDto.grossMargin());
        eProjectDao.setPerGrossMargin(vProjectDto.perGrossMargin());
        eProjectDao.setCollectProgress(vProjectDto.collectProgress());
        eProjectDao.setHolidayList(vProjectDto.holidayList());
        eProjectDao.setFrequency(vProjectDto.frequency());
        eProjectDao.setFromTime(vProjectDto.fromTime());
        eProjectDao.setToTime(vProjectDto.toTime());
        eProjectDao.setFirstEmail(vProjectDto.firstEmail());
        eProjectDao.setSecondEmail(vProjectDto.secondEmail());
        eProjectDao.setDailyTimeToSend(vProjectDto.dailyTimeToSend());
        eProjectDao.setDayToSend(vProjectDto.dayToSend());
        eProjectDao.setWeeklyTimeToSend(vProjectDto.weeklyTimeToSend());
        eProjectDao.setMessage(vProjectDto.message());
        eProjectDao.setUserTags(vProjectDto.userTags());
        eProjectDao.setComments(vProjectDto.comments());
        eProjectDao.setAssign(vProjectDto.assign());
        eProjectDao.setLikedBy(vProjectDto.likedBy());
        eProjectDao.setSeen(vProjectDto.seen());
    }
}