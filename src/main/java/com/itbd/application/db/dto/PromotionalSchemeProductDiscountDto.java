package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PromotionalSchemeProductDiscountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PromotionalSchemeProductDiscountDto(
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
        Boolean sameItem,
        String freeItem,
        BigDecimal freeQty,
        String freeItemUom,
        BigDecimal freeItemRate,
        String warehouse,
        BigDecimal thresholdPercentage,
        String priority,
        Boolean isRecursive,
        BigDecimal recurseFor,
        BigDecimal applyRecursionOver,
        String parent,
        String parentField,
        String parentType
) {
    public static PromotionalSchemeProductDiscountDto fromEntity(PromotionalSchemeProductDiscountDao ePromotionalSchemeProductDiscountDao) {
        return new PromotionalSchemeProductDiscountDto(
                ePromotionalSchemeProductDiscountDao.getName(),
                ePromotionalSchemeProductDiscountDao.getCreation(),
                ePromotionalSchemeProductDiscountDao.getModified(),
                ePromotionalSchemeProductDiscountDao.getModifiedBy(),
                ePromotionalSchemeProductDiscountDao.getOwner(),
                ePromotionalSchemeProductDiscountDao.getIsDocStatus(),
                ePromotionalSchemeProductDiscountDao.getIdx(),
                ePromotionalSchemeProductDiscountDao.getDisable(),
                ePromotionalSchemeProductDiscountDao.getApplyMultiplePricingRules(),
                ePromotionalSchemeProductDiscountDao.getRuleDescription(),
                ePromotionalSchemeProductDiscountDao.getMinQty(),
                ePromotionalSchemeProductDiscountDao.getMaxQty(),
                ePromotionalSchemeProductDiscountDao.getMinAmount(),
                ePromotionalSchemeProductDiscountDao.getMaxAmount(),
                ePromotionalSchemeProductDiscountDao.getSameItem(),
                ePromotionalSchemeProductDiscountDao.getFreeItem(),
                ePromotionalSchemeProductDiscountDao.getFreeQty(),
                ePromotionalSchemeProductDiscountDao.getFreeItemUom(),
                ePromotionalSchemeProductDiscountDao.getFreeItemRate(),
                ePromotionalSchemeProductDiscountDao.getWarehouse(),
                ePromotionalSchemeProductDiscountDao.getThresholdPercentage(),
                ePromotionalSchemeProductDiscountDao.getPriority(),
                ePromotionalSchemeProductDiscountDao.getIsRecursive(),
                ePromotionalSchemeProductDiscountDao.getRecurseFor(),
                ePromotionalSchemeProductDiscountDao.getApplyRecursionOver(),
                ePromotionalSchemeProductDiscountDao.getParent(),
                ePromotionalSchemeProductDiscountDao.getParentField(),
                ePromotionalSchemeProductDiscountDao.getParentType());
    }

    public static void fromDTO(PromotionalSchemeProductDiscountDto vPromotionalSchemeProductDiscountDto, PromotionalSchemeProductDiscountDao ePromotionalSchemeProductDiscountDao) {
        ePromotionalSchemeProductDiscountDao.setName(vPromotionalSchemeProductDiscountDto.name());
        ePromotionalSchemeProductDiscountDao.setCreation(vPromotionalSchemeProductDiscountDto.creation());
        ePromotionalSchemeProductDiscountDao.setModified(vPromotionalSchemeProductDiscountDto.modified());
        ePromotionalSchemeProductDiscountDao.setModifiedBy(vPromotionalSchemeProductDiscountDto.modifiedBy());
        ePromotionalSchemeProductDiscountDao.setOwner(vPromotionalSchemeProductDiscountDto.owner());
        ePromotionalSchemeProductDiscountDao.setIsDocStatus(vPromotionalSchemeProductDiscountDto.isDocStatus());
        ePromotionalSchemeProductDiscountDao.setIdx(vPromotionalSchemeProductDiscountDto.idx());
        ePromotionalSchemeProductDiscountDao.setDisable(vPromotionalSchemeProductDiscountDto.disable());
        ePromotionalSchemeProductDiscountDao.setApplyMultiplePricingRules(vPromotionalSchemeProductDiscountDto.applyMultiplePricingRules());
        ePromotionalSchemeProductDiscountDao.setRuleDescription(vPromotionalSchemeProductDiscountDto.ruleDescription());
        ePromotionalSchemeProductDiscountDao.setMinQty(vPromotionalSchemeProductDiscountDto.minQty());
        ePromotionalSchemeProductDiscountDao.setMaxQty(vPromotionalSchemeProductDiscountDto.maxQty());
        ePromotionalSchemeProductDiscountDao.setMinAmount(vPromotionalSchemeProductDiscountDto.minAmount());
        ePromotionalSchemeProductDiscountDao.setMaxAmount(vPromotionalSchemeProductDiscountDto.maxAmount());
        ePromotionalSchemeProductDiscountDao.setSameItem(vPromotionalSchemeProductDiscountDto.sameItem());
        ePromotionalSchemeProductDiscountDao.setFreeItem(vPromotionalSchemeProductDiscountDto.freeItem());
        ePromotionalSchemeProductDiscountDao.setFreeQty(vPromotionalSchemeProductDiscountDto.freeQty());
        ePromotionalSchemeProductDiscountDao.setFreeItemUom(vPromotionalSchemeProductDiscountDto.freeItemUom());
        ePromotionalSchemeProductDiscountDao.setFreeItemRate(vPromotionalSchemeProductDiscountDto.freeItemRate());
        ePromotionalSchemeProductDiscountDao.setWarehouse(vPromotionalSchemeProductDiscountDto.warehouse());
        ePromotionalSchemeProductDiscountDao.setThresholdPercentage(vPromotionalSchemeProductDiscountDto.thresholdPercentage());
        ePromotionalSchemeProductDiscountDao.setPriority(vPromotionalSchemeProductDiscountDto.priority());
        ePromotionalSchemeProductDiscountDao.setIsRecursive(vPromotionalSchemeProductDiscountDto.isRecursive());
        ePromotionalSchemeProductDiscountDao.setRecurseFor(vPromotionalSchemeProductDiscountDto.recurseFor());
        ePromotionalSchemeProductDiscountDao.setApplyRecursionOver(vPromotionalSchemeProductDiscountDto.applyRecursionOver());
        ePromotionalSchemeProductDiscountDao.setParent(vPromotionalSchemeProductDiscountDto.parent());
        ePromotionalSchemeProductDiscountDao.setParentField(vPromotionalSchemeProductDiscountDto.parentField());
        ePromotionalSchemeProductDiscountDao.setParentType(vPromotionalSchemeProductDiscountDto.parentType());
    }
}