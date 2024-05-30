package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.manufacturing.bom.BomWebsiteItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomWebsiteItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        String description,
        BigDecimal qty,
        String websiteImage,
        String parent,
        String parentField,
        String parentType
) {
    public static BomWebsiteItemDto fromEntity(BomWebsiteItemDao eBomWebsiteItemDao) {
        return new BomWebsiteItemDto(
                eBomWebsiteItemDao.getName(),
                eBomWebsiteItemDao.getCreation(),
                eBomWebsiteItemDao.getModified(),
                eBomWebsiteItemDao.getModifiedBy(),
                eBomWebsiteItemDao.getOwner(),
                eBomWebsiteItemDao.getIsDocStatus(),
                eBomWebsiteItemDao.getIdx(),
                eBomWebsiteItemDao.getItemCode(),
                eBomWebsiteItemDao.getItemName(),
                eBomWebsiteItemDao.getDescription(),
                eBomWebsiteItemDao.getQty(),
                eBomWebsiteItemDao.getWebsiteImage(),
                eBomWebsiteItemDao.getParent(),
                eBomWebsiteItemDao.getParentField(),
                eBomWebsiteItemDao.getParentType());
    }

    public static void fromDTO(BomWebsiteItemDto vBomWebsiteItemDto, BomWebsiteItemDao eBomWebsiteItemDao) {
        eBomWebsiteItemDao.setName(vBomWebsiteItemDto.name());
        eBomWebsiteItemDao.setCreation(vBomWebsiteItemDto.creation());
        eBomWebsiteItemDao.setModified(vBomWebsiteItemDto.modified());
        eBomWebsiteItemDao.setModifiedBy(vBomWebsiteItemDto.modifiedBy());
        eBomWebsiteItemDao.setOwner(vBomWebsiteItemDto.owner());
        eBomWebsiteItemDao.setIsDocStatus(vBomWebsiteItemDto.isDocStatus());
        eBomWebsiteItemDao.setIdx(vBomWebsiteItemDto.idx());
        eBomWebsiteItemDao.setItemCode(vBomWebsiteItemDto.itemCode());
        eBomWebsiteItemDao.setItemName(vBomWebsiteItemDto.itemName());
        eBomWebsiteItemDao.setDescription(vBomWebsiteItemDto.description());
        eBomWebsiteItemDao.setQty(vBomWebsiteItemDto.qty());
        eBomWebsiteItemDao.setWebsiteImage(vBomWebsiteItemDto.websiteImage());
        eBomWebsiteItemDao.setParent(vBomWebsiteItemDto.parent());
        eBomWebsiteItemDao.setParentField(vBomWebsiteItemDto.parentField());
        eBomWebsiteItemDao.setParentType(vBomWebsiteItemDto.parentType());
    }
}