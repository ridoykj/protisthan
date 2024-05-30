package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.accounts.shipping.ShippingRuleConditionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShippingRuleConditionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        BigDecimal fromValue,
        BigDecimal toValue,
        BigDecimal shippingAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static ShippingRuleConditionDto fromEntity(ShippingRuleConditionDao eShippingRuleConditionDao) {
        return new ShippingRuleConditionDto(
                eShippingRuleConditionDao.getName(),
                eShippingRuleConditionDao.getCreation(),
                eShippingRuleConditionDao.getModified(),
                eShippingRuleConditionDao.getModifiedBy(),
                eShippingRuleConditionDao.getOwner(),
                eShippingRuleConditionDao.getIsDocStatus(),
                eShippingRuleConditionDao.getIdx(),
                eShippingRuleConditionDao.getFromValue(),
                eShippingRuleConditionDao.getToValue(),
                eShippingRuleConditionDao.getShippingAmount(),
                eShippingRuleConditionDao.getParent(),
                eShippingRuleConditionDao.getParentField(),
                eShippingRuleConditionDao.getParentType());
    }

    public static void fromDTO(ShippingRuleConditionDto vShippingRuleConditionDto, ShippingRuleConditionDao eShippingRuleConditionDao) {
        eShippingRuleConditionDao.setName(vShippingRuleConditionDto.name());
        eShippingRuleConditionDao.setCreation(vShippingRuleConditionDto.creation());
        eShippingRuleConditionDao.setModified(vShippingRuleConditionDto.modified());
        eShippingRuleConditionDao.setModifiedBy(vShippingRuleConditionDto.modifiedBy());
        eShippingRuleConditionDao.setOwner(vShippingRuleConditionDto.owner());
        eShippingRuleConditionDao.setIsDocStatus(vShippingRuleConditionDto.isDocStatus());
        eShippingRuleConditionDao.setIdx(vShippingRuleConditionDto.idx());
        eShippingRuleConditionDao.setFromValue(vShippingRuleConditionDto.fromValue());
        eShippingRuleConditionDao.setToValue(vShippingRuleConditionDto.toValue());
        eShippingRuleConditionDao.setShippingAmount(vShippingRuleConditionDto.shippingAmount());
        eShippingRuleConditionDao.setParent(vShippingRuleConditionDto.parent());
        eShippingRuleConditionDao.setParentField(vShippingRuleConditionDto.parentField());
        eShippingRuleConditionDao.setParentType(vShippingRuleConditionDto.parentType());
    }
}