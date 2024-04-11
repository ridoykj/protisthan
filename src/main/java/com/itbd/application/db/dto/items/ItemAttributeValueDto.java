package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemAttributeValueDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemAttributeValueDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String attributeValue,
        String abbr,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemAttributeValueDto fromEntity(ItemAttributeValueDao eItemAttributeValueDao) {
        return new ItemAttributeValueDto(
                eItemAttributeValueDao.getName(),
                eItemAttributeValueDao.getCreation(),
                eItemAttributeValueDao.getModified(),
                eItemAttributeValueDao.getModifiedBy(),
                eItemAttributeValueDao.getOwner(),
                eItemAttributeValueDao.getIsDocStatus(),
                eItemAttributeValueDao.getIdx(),
                eItemAttributeValueDao.getAttributeValue(),
                eItemAttributeValueDao.getAbbr(),
                eItemAttributeValueDao.getParent(),
                eItemAttributeValueDao.getParentField(),
                eItemAttributeValueDao.getParentType());
    }

    public static void fromDTO(ItemAttributeValueDto vItemAttributeValueDto, ItemAttributeValueDao eItemAttributeValueDao) {
        eItemAttributeValueDao.setName(vItemAttributeValueDto.name());
        eItemAttributeValueDao.setCreation(vItemAttributeValueDto.creation());
        eItemAttributeValueDao.setModified(vItemAttributeValueDto.modified());
        eItemAttributeValueDao.setModifiedBy(vItemAttributeValueDto.modifiedBy());
        eItemAttributeValueDao.setOwner(vItemAttributeValueDto.owner());
        eItemAttributeValueDao.setIsDocStatus(vItemAttributeValueDto.isDocStatus());
        eItemAttributeValueDao.setIdx(vItemAttributeValueDto.idx());
        eItemAttributeValueDao.setAttributeValue(vItemAttributeValueDto.attributeValue());
        eItemAttributeValueDao.setAbbr(vItemAttributeValueDto.abbr());
        eItemAttributeValueDao.setParent(vItemAttributeValueDto.parent());
        eItemAttributeValueDao.setParentField(vItemAttributeValueDto.parentField());
        eItemAttributeValueDao.setParentType(vItemAttributeValueDto.parentType());
    }
}