package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomScrapItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomScrapItemDto(
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
        BigDecimal stockQty,
        BigDecimal rate,
        BigDecimal amount,
        String stockUom,
        BigDecimal baseRate,
        BigDecimal baseAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static BomScrapItemDto fromEntity(BomScrapItemDao eBomScrapItemDao) {
        return new BomScrapItemDto(
                eBomScrapItemDao.getName(),
                eBomScrapItemDao.getCreation(),
                eBomScrapItemDao.getModified(),
                eBomScrapItemDao.getModifiedBy(),
                eBomScrapItemDao.getOwner(),
                eBomScrapItemDao.getIsDocStatus(),
                eBomScrapItemDao.getIdx(),
                eBomScrapItemDao.getItemCode(),
                eBomScrapItemDao.getItemName(),
                eBomScrapItemDao.getStockQty(),
                eBomScrapItemDao.getRate(),
                eBomScrapItemDao.getAmount(),
                eBomScrapItemDao.getStockUom(),
                eBomScrapItemDao.getBaseRate(),
                eBomScrapItemDao.getBaseAmount(),
                eBomScrapItemDao.getParent(),
                eBomScrapItemDao.getParentField(),
                eBomScrapItemDao.getParentType());
    }

    public static void fromDTO(BomScrapItemDto vBomScrapItemDto, BomScrapItemDao eBomScrapItemDao) {
        eBomScrapItemDao.setName(vBomScrapItemDto.name());
        eBomScrapItemDao.setCreation(vBomScrapItemDto.creation());
        eBomScrapItemDao.setModified(vBomScrapItemDto.modified());
        eBomScrapItemDao.setModifiedBy(vBomScrapItemDto.modifiedBy());
        eBomScrapItemDao.setOwner(vBomScrapItemDto.owner());
        eBomScrapItemDao.setIsDocStatus(vBomScrapItemDto.isDocStatus());
        eBomScrapItemDao.setIdx(vBomScrapItemDto.idx());
        eBomScrapItemDao.setItemCode(vBomScrapItemDto.itemCode());
        eBomScrapItemDao.setItemName(vBomScrapItemDto.itemName());
        eBomScrapItemDao.setStockQty(vBomScrapItemDto.stockQty());
        eBomScrapItemDao.setRate(vBomScrapItemDto.rate());
        eBomScrapItemDao.setAmount(vBomScrapItemDto.amount());
        eBomScrapItemDao.setStockUom(vBomScrapItemDto.stockUom());
        eBomScrapItemDao.setBaseRate(vBomScrapItemDto.baseRate());
        eBomScrapItemDao.setBaseAmount(vBomScrapItemDto.baseAmount());
        eBomScrapItemDao.setParent(vBomScrapItemDto.parent());
        eBomScrapItemDao.setParentField(vBomScrapItemDto.parentField());
        eBomScrapItemDao.setParentType(vBomScrapItemDto.parentType());
    }
}