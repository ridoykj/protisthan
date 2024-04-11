package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemVariantDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemVariantDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemAttribute,
        String itemAttributeValue,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemVariantDto fromEntity(ItemVariantDao eItemVariantDao) {
        return new ItemVariantDto(
                eItemVariantDao.getName(),
                eItemVariantDao.getCreation(),
                eItemVariantDao.getModified(),
                eItemVariantDao.getModifiedBy(),
                eItemVariantDao.getOwner(),
                eItemVariantDao.getIsDocStatus(),
                eItemVariantDao.getIdx(),
                eItemVariantDao.getItemAttribute(),
                eItemVariantDao.getItemAttributeValue(),
                eItemVariantDao.getParent(),
                eItemVariantDao.getParentField(),
                eItemVariantDao.getParentType());
    }

    public static void fromDTO(ItemVariantDto vItemVariantDto, ItemVariantDao eItemVariantDao) {
        eItemVariantDao.setName(vItemVariantDto.name());
        eItemVariantDao.setCreation(vItemVariantDto.creation());
        eItemVariantDao.setModified(vItemVariantDto.modified());
        eItemVariantDao.setModifiedBy(vItemVariantDto.modifiedBy());
        eItemVariantDao.setOwner(vItemVariantDto.owner());
        eItemVariantDao.setIsDocStatus(vItemVariantDto.isDocStatus());
        eItemVariantDao.setIdx(vItemVariantDto.idx());
        eItemVariantDao.setItemAttribute(vItemVariantDto.itemAttribute());
        eItemVariantDao.setItemAttributeValue(vItemVariantDto.itemAttributeValue());
        eItemVariantDao.setParent(vItemVariantDto.parent());
        eItemVariantDao.setParentField(vItemVariantDto.parentField());
        eItemVariantDao.setParentType(vItemVariantDto.parentType());
    }
}