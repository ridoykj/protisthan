package com.itbd.application.db.dto.activitys;

import com.itbd.application.db.dao.activitys.ActivityCostDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ActivityCostDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String activityType,
        String employee,
        String employeeName,
        String department,
        BigDecimal billingRate,
        BigDecimal costingRate,
        String title,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ActivityCostDto fromEntity(ActivityCostDao eActivityCostDao) {
        return new ActivityCostDto(
                eActivityCostDao.getName(),
                eActivityCostDao.getCreation(),
                eActivityCostDao.getModified(),
                eActivityCostDao.getModifiedBy(),
                eActivityCostDao.getOwner(),
                eActivityCostDao.getIsDocStatus(),
                eActivityCostDao.getIdx(),
                eActivityCostDao.getActivityType(),
                eActivityCostDao.getEmployee(),
                eActivityCostDao.getEmployeeName(),
                eActivityCostDao.getDepartment(),
                eActivityCostDao.getBillingRate(),
                eActivityCostDao.getCostingRate(),
                eActivityCostDao.getTitle(),
                eActivityCostDao.getUserTags(),
                eActivityCostDao.getComments(),
                eActivityCostDao.getAssign(),
                eActivityCostDao.getLikedBy());
    }

    public static void fromDTO(ActivityCostDto vActivityCostDto, ActivityCostDao eActivityCostDao) {
        eActivityCostDao.setName(vActivityCostDto.name());
        eActivityCostDao.setCreation(vActivityCostDto.creation());
        eActivityCostDao.setModified(vActivityCostDto.modified());
        eActivityCostDao.setModifiedBy(vActivityCostDto.modifiedBy());
        eActivityCostDao.setOwner(vActivityCostDto.owner());
        eActivityCostDao.setIsDocStatus(vActivityCostDto.isDocStatus());
        eActivityCostDao.setIdx(vActivityCostDto.idx());
        eActivityCostDao.setActivityType(vActivityCostDto.activityType());
        eActivityCostDao.setEmployee(vActivityCostDto.employee());
        eActivityCostDao.setEmployeeName(vActivityCostDto.employeeName());
        eActivityCostDao.setDepartment(vActivityCostDto.department());
        eActivityCostDao.setBillingRate(vActivityCostDto.billingRate());
        eActivityCostDao.setCostingRate(vActivityCostDto.costingRate());
        eActivityCostDao.setTitle(vActivityCostDto.title());
        eActivityCostDao.setUserTags(vActivityCostDto.userTags());
        eActivityCostDao.setComments(vActivityCostDto.comments());
        eActivityCostDao.setAssign(vActivityCostDto.assign());
        eActivityCostDao.setLikedBy(vActivityCostDto.likedBy());
    }
}