package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemWebsiteSpecificationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemWebsiteSpecificationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String description,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemWebsiteSpecificationDto fromEntity(ItemWebsiteSpecificationDao eItemWebsiteSpecificationDao) {
        return new ItemWebsiteSpecificationDto(
                eItemWebsiteSpecificationDao.getName(),
                eItemWebsiteSpecificationDao.getCreation(),
                eItemWebsiteSpecificationDao.getModified(),
                eItemWebsiteSpecificationDao.getModifiedBy(),
                eItemWebsiteSpecificationDao.getOwner(),
                eItemWebsiteSpecificationDao.getIsDocStatus(),
                eItemWebsiteSpecificationDao.getIdx(),
                eItemWebsiteSpecificationDao.getLabel(),
                eItemWebsiteSpecificationDao.getDescription(),
                eItemWebsiteSpecificationDao.getParent(),
                eItemWebsiteSpecificationDao.getParentField(),
                eItemWebsiteSpecificationDao.getParentType());
    }

    public static void fromDTO(ItemWebsiteSpecificationDto vItemWebsiteSpecificationDto, ItemWebsiteSpecificationDao eItemWebsiteSpecificationDao) {
        eItemWebsiteSpecificationDao.setName(vItemWebsiteSpecificationDto.name());
        eItemWebsiteSpecificationDao.setCreation(vItemWebsiteSpecificationDto.creation());
        eItemWebsiteSpecificationDao.setModified(vItemWebsiteSpecificationDto.modified());
        eItemWebsiteSpecificationDao.setModifiedBy(vItemWebsiteSpecificationDto.modifiedBy());
        eItemWebsiteSpecificationDao.setOwner(vItemWebsiteSpecificationDto.owner());
        eItemWebsiteSpecificationDao.setIsDocStatus(vItemWebsiteSpecificationDto.isDocStatus());
        eItemWebsiteSpecificationDao.setIdx(vItemWebsiteSpecificationDto.idx());
        eItemWebsiteSpecificationDao.setLabel(vItemWebsiteSpecificationDto.label());
        eItemWebsiteSpecificationDao.setDescription(vItemWebsiteSpecificationDto.description());
        eItemWebsiteSpecificationDao.setParent(vItemWebsiteSpecificationDto.parent());
        eItemWebsiteSpecificationDao.setParentField(vItemWebsiteSpecificationDto.parentField());
        eItemWebsiteSpecificationDao.setParentType(vItemWebsiteSpecificationDto.parentType());
    }
}