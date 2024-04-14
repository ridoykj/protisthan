package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PromotionalSchemePriceDiscountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PromotionalSchemePriceDiscountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Integer disable,
        Boolean applyMultiplePricingRules,
        String ruleDescription,
        BigDecimal minQty,
        BigDecimal maxQty,
        BigDecimal minAmount,
        BigDecimal maxAmount,
        String rateOrDiscount,
        BigDecimal rate,
        BigDecimal discountAmount,
        BigDecimal discountPercentage,
        String warehouse,
        BigDecimal thresholdPercentage,
        Boolean validateAppliedRule,
        String priority,
        Boolean applyDiscountOnRate,
        String parent,
        String parentField,
        String parentType
) {
    public static PromotionalSchemePriceDiscountDto fromEntity(PromotionalSchemePriceDiscountDao ePromotionalSchemePriceDiscountDao) {
        return new PromotionalSchemePriceDiscountDto(
                ePromotionalSchemePriceDiscountDao.getName(),
                ePromotionalSchemePriceDiscountDao.getCreation(),
                ePromotionalSchemePriceDiscountDao.getModified(),
                ePromotionalSchemePriceDiscountDao.getModifiedBy(),
                ePromotionalSchemePriceDiscountDao.getOwner(),
                ePromotionalSchemePriceDiscountDao.getIsDocStatus(),
                ePromotionalSchemePriceDiscountDao.getIdx(),
                ePromotionalSchemePriceDiscountDao.getDisable(),
                ePromotionalSchemePriceDiscountDao.getApplyMultiplePricingRules(),
                ePromotionalSchemePriceDiscountDao.getRuleDescription(),
                ePromotionalSchemePriceDiscountDao.getMinQty(),
                ePromotionalSchemePriceDiscountDao.getMaxQty(),
                ePromotionalSchemePriceDiscountDao.getMinAmount(),
                ePromotionalSchemePriceDiscountDao.getMaxAmount(),
                ePromotionalSchemePriceDiscountDao.getRateOrDiscount(),
                ePromotionalSchemePriceDiscountDao.getRate(),
                ePromotionalSchemePriceDiscountDao.getDiscountAmount(),
                ePromotionalSchemePriceDiscountDao.getDiscountPercentage(),
                ePromotionalSchemePriceDiscountDao.getWarehouse(),
                ePromotionalSchemePriceDiscountDao.getThresholdPercentage(),
                ePromotionalSchemePriceDiscountDao.getValidateAppliedRule(),
                ePromotionalSchemePriceDiscountDao.getPriority(),
                ePromotionalSchemePriceDiscountDao.getApplyDiscountOnRate(),
                ePromotionalSchemePriceDiscountDao.getParent(),
                ePromotionalSchemePriceDiscountDao.getParentField(),
                ePromotionalSchemePriceDiscountDao.getParentType());
    }

    public static void fromDTO(PromotionalSchemePriceDiscountDto vPromotionalSchemePriceDiscountDto, PromotionalSchemePriceDiscountDao ePromotionalSchemePriceDiscountDao) {
        ePromotionalSchemePriceDiscountDao.setName(vPromotionalSchemePriceDiscountDto.name());
        ePromotionalSchemePriceDiscountDao.setCreation(vPromotionalSchemePriceDiscountDto.creation());
        ePromotionalSchemePriceDiscountDao.setModified(vPromotionalSchemePriceDiscountDto.modified());
        ePromotionalSchemePriceDiscountDao.setModifiedBy(vPromotionalSchemePriceDiscountDto.modifiedBy());
        ePromotionalSchemePriceDiscountDao.setOwner(vPromotionalSchemePriceDiscountDto.owner());
        ePromotionalSchemePriceDiscountDao.setIsDocStatus(vPromotionalSchemePriceDiscountDto.isDocStatus());
        ePromotionalSchemePriceDiscountDao.setIdx(vPromotionalSchemePriceDiscountDto.idx());
        ePromotionalSchemePriceDiscountDao.setDisable(vPromotionalSchemePriceDiscountDto.disable());
        ePromotionalSchemePriceDiscountDao.setApplyMultiplePricingRules(vPromotionalSchemePriceDiscountDto.applyMultiplePricingRules());
        ePromotionalSchemePriceDiscountDao.setRuleDescription(vPromotionalSchemePriceDiscountDto.ruleDescription());
        ePromotionalSchemePriceDiscountDao.setMinQty(vPromotionalSchemePriceDiscountDto.minQty());
        ePromotionalSchemePriceDiscountDao.setMaxQty(vPromotionalSchemePriceDiscountDto.maxQty());
        ePromotionalSchemePriceDiscountDao.setMinAmount(vPromotionalSchemePriceDiscountDto.minAmount());
        ePromotionalSchemePriceDiscountDao.setMaxAmount(vPromotionalSchemePriceDiscountDto.maxAmount());
        ePromotionalSchemePriceDiscountDao.setRateOrDiscount(vPromotionalSchemePriceDiscountDto.rateOrDiscount());
        ePromotionalSchemePriceDiscountDao.setRate(vPromotionalSchemePriceDiscountDto.rate());
        ePromotionalSchemePriceDiscountDao.setDiscountAmount(vPromotionalSchemePriceDiscountDto.discountAmount());
        ePromotionalSchemePriceDiscountDao.setDiscountPercentage(vPromotionalSchemePriceDiscountDto.discountPercentage());
        ePromotionalSchemePriceDiscountDao.setWarehouse(vPromotionalSchemePriceDiscountDto.warehouse());
        ePromotionalSchemePriceDiscountDao.setThresholdPercentage(vPromotionalSchemePriceDiscountDto.thresholdPercentage());
        ePromotionalSchemePriceDiscountDao.setValidateAppliedRule(vPromotionalSchemePriceDiscountDto.validateAppliedRule());
        ePromotionalSchemePriceDiscountDao.setPriority(vPromotionalSchemePriceDiscountDto.priority());
        ePromotionalSchemePriceDiscountDao.setApplyDiscountOnRate(vPromotionalSchemePriceDiscountDto.applyDiscountOnRate());
        ePromotionalSchemePriceDiscountDao.setParent(vPromotionalSchemePriceDiscountDto.parent());
        ePromotionalSchemePriceDiscountDao.setParentField(vPromotionalSchemePriceDiscountDto.parentField());
        ePromotionalSchemePriceDiscountDao.setParentType(vPromotionalSchemePriceDiscountDto.parentType());
    }
}