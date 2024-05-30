package com.itbd.application.db.dto.activitys;

import com.itbd.application.db.dao.projects.ActivityTypeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ActivityTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String activityType,
        BigDecimal costingRate,
        BigDecimal billingRate,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ActivityTypeDto fromEntity(ActivityTypeDao eActivityTypeDao) {
        return new ActivityTypeDto(
                eActivityTypeDao.getName(),
                eActivityTypeDao.getCreation(),
                eActivityTypeDao.getModified(),
                eActivityTypeDao.getModifiedBy(),
                eActivityTypeDao.getOwner(),
                eActivityTypeDao.getIsDocStatus(),
                eActivityTypeDao.getIdx(),
                eActivityTypeDao.getActivityType(),
                eActivityTypeDao.getCostingRate(),
                eActivityTypeDao.getBillingRate(),
                eActivityTypeDao.getDisabled(),
                eActivityTypeDao.getUserTags(),
                eActivityTypeDao.getComments(),
                eActivityTypeDao.getAssign(),
                eActivityTypeDao.getLikedBy());
    }

    public static void fromDTO(ActivityTypeDto vActivityTypeDto, ActivityTypeDao eActivityTypeDao) {
        eActivityTypeDao.setName(vActivityTypeDto.name());
        eActivityTypeDao.setCreation(vActivityTypeDto.creation());
        eActivityTypeDao.setModified(vActivityTypeDto.modified());
        eActivityTypeDao.setModifiedBy(vActivityTypeDto.modifiedBy());
        eActivityTypeDao.setOwner(vActivityTypeDto.owner());
        eActivityTypeDao.setIsDocStatus(vActivityTypeDto.isDocStatus());
        eActivityTypeDao.setIdx(vActivityTypeDto.idx());
        eActivityTypeDao.setActivityType(vActivityTypeDto.activityType());
        eActivityTypeDao.setCostingRate(vActivityTypeDto.costingRate());
        eActivityTypeDao.setBillingRate(vActivityTypeDto.billingRate());
        eActivityTypeDao.setDisabled(vActivityTypeDto.disabled());
        eActivityTypeDao.setUserTags(vActivityTypeDto.userTags());
        eActivityTypeDao.setComments(vActivityTypeDto.comments());
        eActivityTypeDao.setAssign(vActivityTypeDto.assign());
        eActivityTypeDao.setLikedBy(vActivityTypeDto.likedBy());
    }
}