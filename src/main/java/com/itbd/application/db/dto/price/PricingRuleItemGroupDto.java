package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.price.PricingRuleItemGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PricingRuleItemGroupDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemGroup,
        String uom,
        String parent,
        String parentField,
        String parentType
) {
    public static PricingRuleItemGroupDto fromEntity(PricingRuleItemGroupDao ePricingRuleItemGroupDao) {
        return new PricingRuleItemGroupDto(
                ePricingRuleItemGroupDao.getName(),
                ePricingRuleItemGroupDao.getCreation(),
                ePricingRuleItemGroupDao.getModified(),
                ePricingRuleItemGroupDao.getModifiedBy(),
                ePricingRuleItemGroupDao.getOwner(),
                ePricingRuleItemGroupDao.getIsDocStatus(),
                ePricingRuleItemGroupDao.getIdx(),
                ePricingRuleItemGroupDao.getItemGroup(),
                ePricingRuleItemGroupDao.getUom(),
                ePricingRuleItemGroupDao.getParent(),
                ePricingRuleItemGroupDao.getParentField(),
                ePricingRuleItemGroupDao.getParentType());
    }

    public static void fromDTO(PricingRuleItemGroupDto vPricingRuleItemGroupDto, PricingRuleItemGroupDao ePricingRuleItemGroupDao) {
        ePricingRuleItemGroupDao.setName(vPricingRuleItemGroupDto.name());
        ePricingRuleItemGroupDao.setCreation(vPricingRuleItemGroupDto.creation());
        ePricingRuleItemGroupDao.setModified(vPricingRuleItemGroupDto.modified());
        ePricingRuleItemGroupDao.setModifiedBy(vPricingRuleItemGroupDto.modifiedBy());
        ePricingRuleItemGroupDao.setOwner(vPricingRuleItemGroupDto.owner());
        ePricingRuleItemGroupDao.setIsDocStatus(vPricingRuleItemGroupDto.isDocStatus());
        ePricingRuleItemGroupDao.setIdx(vPricingRuleItemGroupDto.idx());
        ePricingRuleItemGroupDao.setItemGroup(vPricingRuleItemGroupDto.itemGroup());
        ePricingRuleItemGroupDao.setUom(vPricingRuleItemGroupDto.uom());
        ePricingRuleItemGroupDao.setParent(vPricingRuleItemGroupDto.parent());
        ePricingRuleItemGroupDao.setParentField(vPricingRuleItemGroupDto.parentField());
        ePricingRuleItemGroupDao.setParentType(vPricingRuleItemGroupDto.parentType());
    }
}