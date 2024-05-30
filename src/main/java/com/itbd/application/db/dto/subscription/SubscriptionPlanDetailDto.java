package com.itbd.application.db.dto.subscription;

import com.itbd.application.db.dao.accounts.subscription.SubscriptionPlanDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SubscriptionPlanDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String plan,
        Integer qty,
        String parent,
        String parentField,
        String parentType
) {
    public static SubscriptionPlanDetailDto fromEntity(SubscriptionPlanDetailDao eSubscriptionPlanDetailDao) {
        return new SubscriptionPlanDetailDto(
                eSubscriptionPlanDetailDao.getName(),
                eSubscriptionPlanDetailDao.getCreation(),
                eSubscriptionPlanDetailDao.getModified(),
                eSubscriptionPlanDetailDao.getModifiedBy(),
                eSubscriptionPlanDetailDao.getOwner(),
                eSubscriptionPlanDetailDao.getIsDocStatus(),
                eSubscriptionPlanDetailDao.getIdx(),
                eSubscriptionPlanDetailDao.getPlan(),
                eSubscriptionPlanDetailDao.getQty(),
                eSubscriptionPlanDetailDao.getParent(),
                eSubscriptionPlanDetailDao.getParentField(),
                eSubscriptionPlanDetailDao.getParentType());
    }

    public static void fromDTO(SubscriptionPlanDetailDto vSubscriptionPlanDetailDto, SubscriptionPlanDetailDao eSubscriptionPlanDetailDao) {
        eSubscriptionPlanDetailDao.setName(vSubscriptionPlanDetailDto.name());
        eSubscriptionPlanDetailDao.setCreation(vSubscriptionPlanDetailDto.creation());
        eSubscriptionPlanDetailDao.setModified(vSubscriptionPlanDetailDto.modified());
        eSubscriptionPlanDetailDao.setModifiedBy(vSubscriptionPlanDetailDto.modifiedBy());
        eSubscriptionPlanDetailDao.setOwner(vSubscriptionPlanDetailDto.owner());
        eSubscriptionPlanDetailDao.setIsDocStatus(vSubscriptionPlanDetailDto.isDocStatus());
        eSubscriptionPlanDetailDao.setIdx(vSubscriptionPlanDetailDto.idx());
        eSubscriptionPlanDetailDao.setPlan(vSubscriptionPlanDetailDto.plan());
        eSubscriptionPlanDetailDao.setQty(vSubscriptionPlanDetailDto.qty());
        eSubscriptionPlanDetailDao.setParent(vSubscriptionPlanDetailDto.parent());
        eSubscriptionPlanDetailDao.setParentField(vSubscriptionPlanDetailDto.parentField());
        eSubscriptionPlanDetailDao.setParentType(vSubscriptionPlanDetailDto.parentType());
    }
}