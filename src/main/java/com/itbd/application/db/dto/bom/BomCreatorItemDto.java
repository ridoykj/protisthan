package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomCreatorItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomCreatorItemDto(
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
        String itemGroup,
        String fgItem,
        String sourceWarehouse,
        Boolean isExpandable,
        Boolean sourcedBySupplier,
        Boolean bomCreated,
        String description,
        BigDecimal qty,
        BigDecimal rate,
        String uom,
        BigDecimal stockQty,
        BigDecimal conversionFactor,
        String stockUom,
        BigDecimal amount,
        BigDecimal baseRate,
        BigDecimal baseAmount,
        Boolean doNotExplode,
        String parentRowNo,
        String fgReferenceId,
        String instruction,
        String parent,
        String parentField,
        String parentType
) {
    public static BomCreatorItemDto fromEntity(BomCreatorItemDao eBomCreatorItemDao) {
        return new BomCreatorItemDto(
                eBomCreatorItemDao.getName(),
                eBomCreatorItemDao.getCreation(),
                eBomCreatorItemDao.getModified(),
                eBomCreatorItemDao.getModifiedBy(),
                eBomCreatorItemDao.getOwner(),
                eBomCreatorItemDao.getIsDocStatus(),
                eBomCreatorItemDao.getIdx(),
                eBomCreatorItemDao.getItemCode(),
                eBomCreatorItemDao.getItemName(),
                eBomCreatorItemDao.getItemGroup(),
                eBomCreatorItemDao.getFgItem(),
                eBomCreatorItemDao.getSourceWarehouse(),
                eBomCreatorItemDao.getIsExpandable(),
                eBomCreatorItemDao.getSourcedBySupplier(),
                eBomCreatorItemDao.getBomCreated(),
                eBomCreatorItemDao.getDescription(),
                eBomCreatorItemDao.getQty(),
                eBomCreatorItemDao.getRate(),
                eBomCreatorItemDao.getUom(),
                eBomCreatorItemDao.getStockQty(),
                eBomCreatorItemDao.getConversionFactor(),
                eBomCreatorItemDao.getStockUom(),
                eBomCreatorItemDao.getAmount(),
                eBomCreatorItemDao.getBaseRate(),
                eBomCreatorItemDao.getBaseAmount(),
                eBomCreatorItemDao.getDoNotExplode(),
                eBomCreatorItemDao.getParentRowNo(),
                eBomCreatorItemDao.getFgReferenceId(),
                eBomCreatorItemDao.getInstruction(),
                eBomCreatorItemDao.getParent(),
                eBomCreatorItemDao.getParentField(),
                eBomCreatorItemDao.getParentType());
    }

    public static void fromDTO(BomCreatorItemDto vBomCreatorItemDto, BomCreatorItemDao eBomCreatorItemDao) {
        eBomCreatorItemDao.setName(vBomCreatorItemDto.name());
        eBomCreatorItemDao.setCreation(vBomCreatorItemDto.creation());
        eBomCreatorItemDao.setModified(vBomCreatorItemDto.modified());
        eBomCreatorItemDao.setModifiedBy(vBomCreatorItemDto.modifiedBy());
        eBomCreatorItemDao.setOwner(vBomCreatorItemDto.owner());
        eBomCreatorItemDao.setIsDocStatus(vBomCreatorItemDto.isDocStatus());
        eBomCreatorItemDao.setIdx(vBomCreatorItemDto.idx());
        eBomCreatorItemDao.setItemCode(vBomCreatorItemDto.itemCode());
        eBomCreatorItemDao.setItemName(vBomCreatorItemDto.itemName());
        eBomCreatorItemDao.setItemGroup(vBomCreatorItemDto.itemGroup());
        eBomCreatorItemDao.setFgItem(vBomCreatorItemDto.fgItem());
        eBomCreatorItemDao.setSourceWarehouse(vBomCreatorItemDto.sourceWarehouse());
        eBomCreatorItemDao.setIsExpandable(vBomCreatorItemDto.isExpandable());
        eBomCreatorItemDao.setSourcedBySupplier(vBomCreatorItemDto.sourcedBySupplier());
        eBomCreatorItemDao.setBomCreated(vBomCreatorItemDto.bomCreated());
        eBomCreatorItemDao.setDescription(vBomCreatorItemDto.description());
        eBomCreatorItemDao.setQty(vBomCreatorItemDto.qty());
        eBomCreatorItemDao.setRate(vBomCreatorItemDto.rate());
        eBomCreatorItemDao.setUom(vBomCreatorItemDto.uom());
        eBomCreatorItemDao.setStockQty(vBomCreatorItemDto.stockQty());
        eBomCreatorItemDao.setConversionFactor(vBomCreatorItemDto.conversionFactor());
        eBomCreatorItemDao.setStockUom(vBomCreatorItemDto.stockUom());
        eBomCreatorItemDao.setAmount(vBomCreatorItemDto.amount());
        eBomCreatorItemDao.setBaseRate(vBomCreatorItemDto.baseRate());
        eBomCreatorItemDao.setBaseAmount(vBomCreatorItemDto.baseAmount());
        eBomCreatorItemDao.setDoNotExplode(vBomCreatorItemDto.doNotExplode());
        eBomCreatorItemDao.setParentRowNo(vBomCreatorItemDto.parentRowNo());
        eBomCreatorItemDao.setFgReferenceId(vBomCreatorItemDto.fgReferenceId());
        eBomCreatorItemDao.setInstruction(vBomCreatorItemDto.instruction());
        eBomCreatorItemDao.setParent(vBomCreatorItemDto.parent());
        eBomCreatorItemDao.setParentField(vBomCreatorItemDto.parentField());
        eBomCreatorItemDao.setParentType(vBomCreatorItemDto.parentType());
    }
}