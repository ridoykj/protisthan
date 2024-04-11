package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.price.PricingRuleBrandDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PricingRuleBrandDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String brand,
        String uom,
        String parent,
        String parentField,
        String parentType
) {
    public static PricingRuleBrandDto fromEntity(PricingRuleBrandDao ePricingRuleBrandDao) {
        return new PricingRuleBrandDto(
                ePricingRuleBrandDao.getName(),
                ePricingRuleBrandDao.getCreation(),
                ePricingRuleBrandDao.getModified(),
                ePricingRuleBrandDao.getModifiedBy(),
                ePricingRuleBrandDao.getOwner(),
                ePricingRuleBrandDao.getIsDocStatus(),
                ePricingRuleBrandDao.getIdx(),
                ePricingRuleBrandDao.getBrand(),
                ePricingRuleBrandDao.getUom(),
                ePricingRuleBrandDao.getParent(),
                ePricingRuleBrandDao.getParentField(),
                ePricingRuleBrandDao.getParentType());
    }

    public static void fromDTO(PricingRuleBrandDto vPricingRuleBrandDto, PricingRuleBrandDao ePricingRuleBrandDao) {
        ePricingRuleBrandDao.setName(vPricingRuleBrandDto.name());
        ePricingRuleBrandDao.setCreation(vPricingRuleBrandDto.creation());
        ePricingRuleBrandDao.setModified(vPricingRuleBrandDto.modified());
        ePricingRuleBrandDao.setModifiedBy(vPricingRuleBrandDto.modifiedBy());
        ePricingRuleBrandDao.setOwner(vPricingRuleBrandDto.owner());
        ePricingRuleBrandDao.setIsDocStatus(vPricingRuleBrandDto.isDocStatus());
        ePricingRuleBrandDao.setIdx(vPricingRuleBrandDto.idx());
        ePricingRuleBrandDao.setBrand(vPricingRuleBrandDto.brand());
        ePricingRuleBrandDao.setUom(vPricingRuleBrandDto.uom());
        ePricingRuleBrandDao.setParent(vPricingRuleBrandDto.parent());
        ePricingRuleBrandDao.setParentField(vPricingRuleBrandDto.parentField());
        ePricingRuleBrandDao.setParentType(vPricingRuleBrandDto.parentType());
    }
}