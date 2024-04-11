package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemVariantAttributeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ItemVariantAttributeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String variantOf,
        String attribute,
        String attributeValue,
        Boolean numericValues,
        BigDecimal fromRange,
        BigDecimal increment,
        BigDecimal toRange,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemVariantAttributeDto fromEntity(ItemVariantAttributeDao eItemVariantAttributeDao) {
        return new ItemVariantAttributeDto(
                eItemVariantAttributeDao.getName(),
                eItemVariantAttributeDao.getCreation(),
                eItemVariantAttributeDao.getModified(),
                eItemVariantAttributeDao.getModifiedBy(),
                eItemVariantAttributeDao.getOwner(),
                eItemVariantAttributeDao.getIsDocStatus(),
                eItemVariantAttributeDao.getIdx(),
                eItemVariantAttributeDao.getVariantOf(),
                eItemVariantAttributeDao.getAttribute(),
                eItemVariantAttributeDao.getAttributeValue(),
                eItemVariantAttributeDao.getNumericValues(),
                eItemVariantAttributeDao.getFromRange(),
                eItemVariantAttributeDao.getIncrement(),
                eItemVariantAttributeDao.getToRange(),
                eItemVariantAttributeDao.getParent(),
                eItemVariantAttributeDao.getParentField(),
                eItemVariantAttributeDao.getParentType());
    }

    public static void fromDTO(ItemVariantAttributeDto vItemVariantAttributeDto, ItemVariantAttributeDao eItemVariantAttributeDao) {
        eItemVariantAttributeDao.setName(vItemVariantAttributeDto.name());
        eItemVariantAttributeDao.setCreation(vItemVariantAttributeDto.creation());
        eItemVariantAttributeDao.setModified(vItemVariantAttributeDto.modified());
        eItemVariantAttributeDao.setModifiedBy(vItemVariantAttributeDto.modifiedBy());
        eItemVariantAttributeDao.setOwner(vItemVariantAttributeDto.owner());
        eItemVariantAttributeDao.setIsDocStatus(vItemVariantAttributeDto.isDocStatus());
        eItemVariantAttributeDao.setIdx(vItemVariantAttributeDto.idx());
        eItemVariantAttributeDao.setVariantOf(vItemVariantAttributeDto.variantOf());
        eItemVariantAttributeDao.setAttribute(vItemVariantAttributeDto.attribute());
        eItemVariantAttributeDao.setAttributeValue(vItemVariantAttributeDto.attributeValue());
        eItemVariantAttributeDao.setNumericValues(vItemVariantAttributeDto.numericValues());
        eItemVariantAttributeDao.setFromRange(vItemVariantAttributeDto.fromRange());
        eItemVariantAttributeDao.setIncrement(vItemVariantAttributeDto.increment());
        eItemVariantAttributeDao.setToRange(vItemVariantAttributeDto.toRange());
        eItemVariantAttributeDao.setParent(vItemVariantAttributeDto.parent());
        eItemVariantAttributeDao.setParentField(vItemVariantAttributeDto.parentField());
        eItemVariantAttributeDao.setParentType(vItemVariantAttributeDto.parentType());
    }
}