package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.accounts.shipping.ShippingRuleCountryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ShippingRuleCountryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String country,
        String parent,
        String parentField,
        String parentType
) {
    public static ShippingRuleCountryDto fromEntity(ShippingRuleCountryDao eShippingRuleCountryDao) {
        return new ShippingRuleCountryDto(
                eShippingRuleCountryDao.getName(),
                eShippingRuleCountryDao.getCreation(),
                eShippingRuleCountryDao.getModified(),
                eShippingRuleCountryDao.getModifiedBy(),
                eShippingRuleCountryDao.getOwner(),
                eShippingRuleCountryDao.getIsDocStatus(),
                eShippingRuleCountryDao.getIdx(),
                eShippingRuleCountryDao.getCountry(),
                eShippingRuleCountryDao.getParent(),
                eShippingRuleCountryDao.getParentField(),
                eShippingRuleCountryDao.getParentType());
    }

    public static void fromDTO(ShippingRuleCountryDto vShippingRuleCountryDto, ShippingRuleCountryDao eShippingRuleCountryDao) {
        eShippingRuleCountryDao.setName(vShippingRuleCountryDto.name());
        eShippingRuleCountryDao.setCreation(vShippingRuleCountryDto.creation());
        eShippingRuleCountryDao.setModified(vShippingRuleCountryDto.modified());
        eShippingRuleCountryDao.setModifiedBy(vShippingRuleCountryDto.modifiedBy());
        eShippingRuleCountryDao.setOwner(vShippingRuleCountryDto.owner());
        eShippingRuleCountryDao.setIsDocStatus(vShippingRuleCountryDto.isDocStatus());
        eShippingRuleCountryDao.setIdx(vShippingRuleCountryDto.idx());
        eShippingRuleCountryDao.setCountry(vShippingRuleCountryDto.country());
        eShippingRuleCountryDao.setParent(vShippingRuleCountryDto.parent());
        eShippingRuleCountryDao.setParentField(vShippingRuleCountryDto.parentField());
        eShippingRuleCountryDao.setParentType(vShippingRuleCountryDto.parentType());
    }
}