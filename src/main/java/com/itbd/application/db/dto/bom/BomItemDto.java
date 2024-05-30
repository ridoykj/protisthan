package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.manufacturing.bom.BomItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomItemDto(
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
        String operation,
        Boolean doNotExplode,
        String bomNo,
        String sourceWarehouse,
        Boolean allowAlternativeItem,
        Boolean isStockItem,
        String description,
        String image,
        BigDecimal qty,
        String uom,
        BigDecimal stockQty,
        String stockUom,
        BigDecimal conversionFactor,
        BigDecimal rate,
        BigDecimal baseRate,
        BigDecimal amount,
        BigDecimal baseAmount,
        BigDecimal qtyConsumedPerUnit,
        Boolean hasVariants,
        Boolean includeItemInManufacturing,
        String originalItem,
        Boolean sourcedBySupplier,
        String parent,
        String parentField,
        String parentType
) {
    public static BomItemDto fromEntity(BomItemDao eBomItemDao) {
        return new BomItemDto(
                eBomItemDao.getName(),
                eBomItemDao.getCreation(),
                eBomItemDao.getModified(),
                eBomItemDao.getModifiedBy(),
                eBomItemDao.getOwner(),
                eBomItemDao.getIsDocStatus(),
                eBomItemDao.getIdx(),
                eBomItemDao.getItemCode(),
                eBomItemDao.getItemName(),
                eBomItemDao.getOperation(),
                eBomItemDao.getDoNotExplode(),
                eBomItemDao.getBomNo(),
                eBomItemDao.getSourceWarehouse(),
                eBomItemDao.getAllowAlternativeItem(),
                eBomItemDao.getIsStockItem(),
                eBomItemDao.getDescription(),
                eBomItemDao.getImage(),
                eBomItemDao.getQty(),
                eBomItemDao.getUom(),
                eBomItemDao.getStockQty(),
                eBomItemDao.getStockUom(),
                eBomItemDao.getConversionFactor(),
                eBomItemDao.getRate(),
                eBomItemDao.getBaseRate(),
                eBomItemDao.getAmount(),
                eBomItemDao.getBaseAmount(),
                eBomItemDao.getQtyConsumedPerUnit(),
                eBomItemDao.getHasVariants(),
                eBomItemDao.getIncludeItemInManufacturing(),
                eBomItemDao.getOriginalItem(),
                eBomItemDao.getSourcedBySupplier(),
                eBomItemDao.getParent(),
                eBomItemDao.getParentField(),
                eBomItemDao.getParentType());
    }

    public static void fromDTO(BomItemDto vBomItemDto, BomItemDao eBomItemDao) {
        eBomItemDao.setName(vBomItemDto.name());
        eBomItemDao.setCreation(vBomItemDto.creation());
        eBomItemDao.setModified(vBomItemDto.modified());
        eBomItemDao.setModifiedBy(vBomItemDto.modifiedBy());
        eBomItemDao.setOwner(vBomItemDto.owner());
        eBomItemDao.setIsDocStatus(vBomItemDto.isDocStatus());
        eBomItemDao.setIdx(vBomItemDto.idx());
        eBomItemDao.setItemCode(vBomItemDto.itemCode());
        eBomItemDao.setItemName(vBomItemDto.itemName());
        eBomItemDao.setOperation(vBomItemDto.operation());
        eBomItemDao.setDoNotExplode(vBomItemDto.doNotExplode());
        eBomItemDao.setBomNo(vBomItemDto.bomNo());
        eBomItemDao.setSourceWarehouse(vBomItemDto.sourceWarehouse());
        eBomItemDao.setAllowAlternativeItem(vBomItemDto.allowAlternativeItem());
        eBomItemDao.setIsStockItem(vBomItemDto.isStockItem());
        eBomItemDao.setDescription(vBomItemDto.description());
        eBomItemDao.setImage(vBomItemDto.image());
        eBomItemDao.setQty(vBomItemDto.qty());
        eBomItemDao.setUom(vBomItemDto.uom());
        eBomItemDao.setStockQty(vBomItemDto.stockQty());
        eBomItemDao.setStockUom(vBomItemDto.stockUom());
        eBomItemDao.setConversionFactor(vBomItemDto.conversionFactor());
        eBomItemDao.setRate(vBomItemDto.rate());
        eBomItemDao.setBaseRate(vBomItemDto.baseRate());
        eBomItemDao.setAmount(vBomItemDto.amount());
        eBomItemDao.setBaseAmount(vBomItemDto.baseAmount());
        eBomItemDao.setQtyConsumedPerUnit(vBomItemDto.qtyConsumedPerUnit());
        eBomItemDao.setHasVariants(vBomItemDto.hasVariants());
        eBomItemDao.setIncludeItemInManufacturing(vBomItemDto.includeItemInManufacturing());
        eBomItemDao.setOriginalItem(vBomItemDto.originalItem());
        eBomItemDao.setSourcedBySupplier(vBomItemDto.sourcedBySupplier());
        eBomItemDao.setParent(vBomItemDto.parent());
        eBomItemDao.setParentField(vBomItemDto.parentField());
        eBomItemDao.setParentType(vBomItemDto.parentType());
    }
}