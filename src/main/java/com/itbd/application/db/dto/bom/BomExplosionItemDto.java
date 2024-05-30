package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.manufacturing.bom.BomExplosionItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomExplosionItemDto(
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
        String sourceWarehouse,
        String operation,
        String description,
        String image,
        BigDecimal stockQty,
        BigDecimal rate,
        BigDecimal qtyConsumedPerUnit,
        String stockUom,
        BigDecimal amount,
        Boolean includeItemInManufacturing,
        Boolean sourcedBySupplier,
        String parent,
        String parentField,
        String parentType
) {
    public static BomExplosionItemDto fromEntity(BomExplosionItemDao eBomExplosionItemDao) {
        return new BomExplosionItemDto(
                eBomExplosionItemDao.getName(),
                eBomExplosionItemDao.getCreation(),
                eBomExplosionItemDao.getModified(),
                eBomExplosionItemDao.getModifiedBy(),
                eBomExplosionItemDao.getOwner(),
                eBomExplosionItemDao.getIsDocStatus(),
                eBomExplosionItemDao.getIdx(),
                eBomExplosionItemDao.getItemCode(),
                eBomExplosionItemDao.getItemName(),
                eBomExplosionItemDao.getSourceWarehouse(),
                eBomExplosionItemDao.getOperation(),
                eBomExplosionItemDao.getDescription(),
                eBomExplosionItemDao.getImage(),
                eBomExplosionItemDao.getStockQty(),
                eBomExplosionItemDao.getRate(),
                eBomExplosionItemDao.getQtyConsumedPerUnit(),
                eBomExplosionItemDao.getStockUom(),
                eBomExplosionItemDao.getAmount(),
                eBomExplosionItemDao.getIncludeItemInManufacturing(),
                eBomExplosionItemDao.getSourcedBySupplier(),
                eBomExplosionItemDao.getParent(),
                eBomExplosionItemDao.getParentField(),
                eBomExplosionItemDao.getParentType());
    }

    public static void fromDTO(BomExplosionItemDto vBomExplosionItemDto, BomExplosionItemDao eBomExplosionItemDao) {
        eBomExplosionItemDao.setName(vBomExplosionItemDto.name());
        eBomExplosionItemDao.setCreation(vBomExplosionItemDto.creation());
        eBomExplosionItemDao.setModified(vBomExplosionItemDto.modified());
        eBomExplosionItemDao.setModifiedBy(vBomExplosionItemDto.modifiedBy());
        eBomExplosionItemDao.setOwner(vBomExplosionItemDto.owner());
        eBomExplosionItemDao.setIsDocStatus(vBomExplosionItemDto.isDocStatus());
        eBomExplosionItemDao.setIdx(vBomExplosionItemDto.idx());
        eBomExplosionItemDao.setItemCode(vBomExplosionItemDto.itemCode());
        eBomExplosionItemDao.setItemName(vBomExplosionItemDto.itemName());
        eBomExplosionItemDao.setSourceWarehouse(vBomExplosionItemDto.sourceWarehouse());
        eBomExplosionItemDao.setOperation(vBomExplosionItemDto.operation());
        eBomExplosionItemDao.setDescription(vBomExplosionItemDto.description());
        eBomExplosionItemDao.setImage(vBomExplosionItemDto.image());
        eBomExplosionItemDao.setStockQty(vBomExplosionItemDto.stockQty());
        eBomExplosionItemDao.setRate(vBomExplosionItemDto.rate());
        eBomExplosionItemDao.setQtyConsumedPerUnit(vBomExplosionItemDto.qtyConsumedPerUnit());
        eBomExplosionItemDao.setStockUom(vBomExplosionItemDto.stockUom());
        eBomExplosionItemDao.setAmount(vBomExplosionItemDto.amount());
        eBomExplosionItemDao.setIncludeItemInManufacturing(vBomExplosionItemDto.includeItemInManufacturing());
        eBomExplosionItemDao.setSourcedBySupplier(vBomExplosionItemDto.sourcedBySupplier());
        eBomExplosionItemDao.setParent(vBomExplosionItemDto.parent());
        eBomExplosionItemDao.setParentField(vBomExplosionItemDto.parentField());
        eBomExplosionItemDao.setParentType(vBomExplosionItemDto.parentType());
    }
}