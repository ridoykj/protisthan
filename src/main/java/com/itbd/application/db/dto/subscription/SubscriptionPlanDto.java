package com.itbd.application.db.dto.subscription;

import com.itbd.application.db.dao.accounts.subscription.SubscriptionPlanDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubscriptionPlanDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String planName,
        String currency,
        String item,
        String priceDetermination,
        BigDecimal cost,
        String priceList,
        String billingInterval,
        Integer billingIntervalCount,
        String productPriceId,
        String paymentGateway,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubscriptionPlanDto fromEntity(SubscriptionPlanDao eSubscriptionPlanDao) {
        return new SubscriptionPlanDto(
                eSubscriptionPlanDao.getName(),
                eSubscriptionPlanDao.getCreation(),
                eSubscriptionPlanDao.getModified(),
                eSubscriptionPlanDao.getModifiedBy(),
                eSubscriptionPlanDao.getOwner(),
                eSubscriptionPlanDao.getIsDocStatus(),
                eSubscriptionPlanDao.getIdx(),
                eSubscriptionPlanDao.getPlanName(),
                eSubscriptionPlanDao.getCurrency(),
                eSubscriptionPlanDao.getItem(),
                eSubscriptionPlanDao.getPriceDetermination(),
                eSubscriptionPlanDao.getCost(),
                eSubscriptionPlanDao.getPriceList(),
                eSubscriptionPlanDao.getBillingInterval(),
                eSubscriptionPlanDao.getBillingIntervalCount(),
                eSubscriptionPlanDao.getProductPriceId(),
                eSubscriptionPlanDao.getPaymentGateway(),
                eSubscriptionPlanDao.getCostCenter(),
                eSubscriptionPlanDao.getUserTags(),
                eSubscriptionPlanDao.getComments(),
                eSubscriptionPlanDao.getAssign(),
                eSubscriptionPlanDao.getLikedBy());
    }

    public static void fromDTO(SubscriptionPlanDto vSubscriptionPlanDto, SubscriptionPlanDao eSubscriptionPlanDao) {
        eSubscriptionPlanDao.setName(vSubscriptionPlanDto.name());
        eSubscriptionPlanDao.setCreation(vSubscriptionPlanDto.creation());
        eSubscriptionPlanDao.setModified(vSubscriptionPlanDto.modified());
        eSubscriptionPlanDao.setModifiedBy(vSubscriptionPlanDto.modifiedBy());
        eSubscriptionPlanDao.setOwner(vSubscriptionPlanDto.owner());
        eSubscriptionPlanDao.setIsDocStatus(vSubscriptionPlanDto.isDocStatus());
        eSubscriptionPlanDao.setIdx(vSubscriptionPlanDto.idx());
        eSubscriptionPlanDao.setPlanName(vSubscriptionPlanDto.planName());
        eSubscriptionPlanDao.setCurrency(vSubscriptionPlanDto.currency());
        eSubscriptionPlanDao.setItem(vSubscriptionPlanDto.item());
        eSubscriptionPlanDao.setPriceDetermination(vSubscriptionPlanDto.priceDetermination());
        eSubscriptionPlanDao.setCost(vSubscriptionPlanDto.cost());
        eSubscriptionPlanDao.setPriceList(vSubscriptionPlanDto.priceList());
        eSubscriptionPlanDao.setBillingInterval(vSubscriptionPlanDto.billingInterval());
        eSubscriptionPlanDao.setBillingIntervalCount(vSubscriptionPlanDto.billingIntervalCount());
        eSubscriptionPlanDao.setProductPriceId(vSubscriptionPlanDto.productPriceId());
        eSubscriptionPlanDao.setPaymentGateway(vSubscriptionPlanDto.paymentGateway());
        eSubscriptionPlanDao.setCostCenter(vSubscriptionPlanDto.costCenter());
        eSubscriptionPlanDao.setUserTags(vSubscriptionPlanDto.userTags());
        eSubscriptionPlanDao.setComments(vSubscriptionPlanDto.comments());
        eSubscriptionPlanDao.setAssign(vSubscriptionPlanDto.assign());
        eSubscriptionPlanDao.setLikedBy(vSubscriptionPlanDto.likedBy());
    }
}