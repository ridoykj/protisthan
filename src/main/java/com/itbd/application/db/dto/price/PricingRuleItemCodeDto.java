package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.accounts.pricing.PricingRuleItemCodeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PricingRuleItemCodeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String uom,
        String parent,
        String parentField,
        String parentType
) {
    public static PricingRuleItemCodeDto fromEntity(PricingRuleItemCodeDao ePricingRuleItemCodeDao) {
        return new PricingRuleItemCodeDto(
                ePricingRuleItemCodeDao.getName(),
                ePricingRuleItemCodeDao.getCreation(),
                ePricingRuleItemCodeDao.getModified(),
                ePricingRuleItemCodeDao.getModifiedBy(),
                ePricingRuleItemCodeDao.getOwner(),
                ePricingRuleItemCodeDao.getIsDocStatus(),
                ePricingRuleItemCodeDao.getIdx(),
                ePricingRuleItemCodeDao.getItemCode(),
                ePricingRuleItemCodeDao.getUom(),
                ePricingRuleItemCodeDao.getParent(),
                ePricingRuleItemCodeDao.getParentField(),
                ePricingRuleItemCodeDao.getParentType());
    }

    public static void fromDTO(PricingRuleItemCodeDto vPricingRuleItemCodeDto, PricingRuleItemCodeDao ePricingRuleItemCodeDao) {
        ePricingRuleItemCodeDao.setName(vPricingRuleItemCodeDto.name());
        ePricingRuleItemCodeDao.setCreation(vPricingRuleItemCodeDto.creation());
        ePricingRuleItemCodeDao.setModified(vPricingRuleItemCodeDto.modified());
        ePricingRuleItemCodeDao.setModifiedBy(vPricingRuleItemCodeDto.modifiedBy());
        ePricingRuleItemCodeDao.setOwner(vPricingRuleItemCodeDto.owner());
        ePricingRuleItemCodeDao.setIsDocStatus(vPricingRuleItemCodeDto.isDocStatus());
        ePricingRuleItemCodeDao.setIdx(vPricingRuleItemCodeDto.idx());
        ePricingRuleItemCodeDao.setItemCode(vPricingRuleItemCodeDto.itemCode());
        ePricingRuleItemCodeDao.setUom(vPricingRuleItemCodeDto.uom());
        ePricingRuleItemCodeDao.setParent(vPricingRuleItemCodeDto.parent());
        ePricingRuleItemCodeDao.setParentField(vPricingRuleItemCodeDto.parentField());
        ePricingRuleItemCodeDao.setParentType(vPricingRuleItemCodeDto.parentType());
    }
}