package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.accounts.pricing.PricingRuleDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PricingRuleDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String pricingRule,
        String itemCode,
        String marginType,
        String rateOrDiscount,
        String childDocName,
        Boolean ruleApplied,
        String parent,
        String parentField,
        String parentType
) {
    public static PricingRuleDetailDto fromEntity(PricingRuleDetailDao ePricingRuleDetailDao) {
        return new PricingRuleDetailDto(
                ePricingRuleDetailDao.getName(),
                ePricingRuleDetailDao.getCreation(),
                ePricingRuleDetailDao.getModified(),
                ePricingRuleDetailDao.getModifiedBy(),
                ePricingRuleDetailDao.getOwner(),
                ePricingRuleDetailDao.getIsDocStatus(),
                ePricingRuleDetailDao.getIdx(),
                ePricingRuleDetailDao.getPricingRule(),
                ePricingRuleDetailDao.getItemCode(),
                ePricingRuleDetailDao.getMarginType(),
                ePricingRuleDetailDao.getRateOrDiscount(),
                ePricingRuleDetailDao.getChildDocName(),
                ePricingRuleDetailDao.getRuleApplied(),
                ePricingRuleDetailDao.getParent(),
                ePricingRuleDetailDao.getParentField(),
                ePricingRuleDetailDao.getParentType());
    }

    public static void fromDTO(PricingRuleDetailDto vPricingRuleDetailDto, PricingRuleDetailDao ePricingRuleDetailDao) {
        ePricingRuleDetailDao.setName(vPricingRuleDetailDto.name());
        ePricingRuleDetailDao.setCreation(vPricingRuleDetailDto.creation());
        ePricingRuleDetailDao.setModified(vPricingRuleDetailDto.modified());
        ePricingRuleDetailDao.setModifiedBy(vPricingRuleDetailDto.modifiedBy());
        ePricingRuleDetailDao.setOwner(vPricingRuleDetailDto.owner());
        ePricingRuleDetailDao.setIsDocStatus(vPricingRuleDetailDto.isDocStatus());
        ePricingRuleDetailDao.setIdx(vPricingRuleDetailDto.idx());
        ePricingRuleDetailDao.setPricingRule(vPricingRuleDetailDto.pricingRule());
        ePricingRuleDetailDao.setItemCode(vPricingRuleDetailDto.itemCode());
        ePricingRuleDetailDao.setMarginType(vPricingRuleDetailDto.marginType());
        ePricingRuleDetailDao.setRateOrDiscount(vPricingRuleDetailDto.rateOrDiscount());
        ePricingRuleDetailDao.setChildDocName(vPricingRuleDetailDto.childDocName());
        ePricingRuleDetailDao.setRuleApplied(vPricingRuleDetailDto.ruleApplied());
        ePricingRuleDetailDao.setParent(vPricingRuleDetailDto.parent());
        ePricingRuleDetailDao.setParentField(vPricingRuleDetailDto.parentField());
        ePricingRuleDetailDao.setParentType(vPricingRuleDetailDto.parentType());
    }
}