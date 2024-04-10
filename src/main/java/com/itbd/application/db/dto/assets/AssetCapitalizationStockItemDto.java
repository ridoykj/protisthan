package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCapitalizationStockItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetCapitalizationStockItemDto(
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
        String warehouse,
        BigDecimal stockQty,
        String stockUom,
        BigDecimal actualQty,
        BigDecimal valuationRate,
        BigDecimal amount,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String serialNo,
        String batchNo,
        String costCenter,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetCapitalizationStockItemDto fromEntity(AssetCapitalizationStockItemDao eAssetCapitalizationStockItemDao) {
        return new AssetCapitalizationStockItemDto(
                eAssetCapitalizationStockItemDao.getName(),
                eAssetCapitalizationStockItemDao.getCreation(),
                eAssetCapitalizationStockItemDao.getModified(),
                eAssetCapitalizationStockItemDao.getModifiedBy(),
                eAssetCapitalizationStockItemDao.getOwner(),
                eAssetCapitalizationStockItemDao.getIsDocStatus(),
                eAssetCapitalizationStockItemDao.getIdx(),
                eAssetCapitalizationStockItemDao.getItemCode(),
                eAssetCapitalizationStockItemDao.getItemName(),
                eAssetCapitalizationStockItemDao.getWarehouse(),
                eAssetCapitalizationStockItemDao.getStockQty(),
                eAssetCapitalizationStockItemDao.getStockUom(),
                eAssetCapitalizationStockItemDao.getActualQty(),
                eAssetCapitalizationStockItemDao.getValuationRate(),
                eAssetCapitalizationStockItemDao.getAmount(),
                eAssetCapitalizationStockItemDao.getSerialAndBatchBundle(),
                eAssetCapitalizationStockItemDao.getUseSerialBatchFields(),
                eAssetCapitalizationStockItemDao.getSerialNo(),
                eAssetCapitalizationStockItemDao.getBatchNo(),
                eAssetCapitalizationStockItemDao.getCostCenter(),
                eAssetCapitalizationStockItemDao.getParent(),
                eAssetCapitalizationStockItemDao.getParentField(),
                eAssetCapitalizationStockItemDao.getParentType());
    }

    public static void fromDTO(AssetCapitalizationStockItemDto vAssetCapitalizationStockItemDto, AssetCapitalizationStockItemDao eAssetCapitalizationStockItemDao) {
        eAssetCapitalizationStockItemDao.setName(vAssetCapitalizationStockItemDto.name());
        eAssetCapitalizationStockItemDao.setCreation(vAssetCapitalizationStockItemDto.creation());
        eAssetCapitalizationStockItemDao.setModified(vAssetCapitalizationStockItemDto.modified());
        eAssetCapitalizationStockItemDao.setModifiedBy(vAssetCapitalizationStockItemDto.modifiedBy());
        eAssetCapitalizationStockItemDao.setOwner(vAssetCapitalizationStockItemDto.owner());
        eAssetCapitalizationStockItemDao.setIsDocStatus(vAssetCapitalizationStockItemDto.isDocStatus());
        eAssetCapitalizationStockItemDao.setIdx(vAssetCapitalizationStockItemDto.idx());
        eAssetCapitalizationStockItemDao.setItemCode(vAssetCapitalizationStockItemDto.itemCode());
        eAssetCapitalizationStockItemDao.setItemName(vAssetCapitalizationStockItemDto.itemName());
        eAssetCapitalizationStockItemDao.setWarehouse(vAssetCapitalizationStockItemDto.warehouse());
        eAssetCapitalizationStockItemDao.setStockQty(vAssetCapitalizationStockItemDto.stockQty());
        eAssetCapitalizationStockItemDao.setStockUom(vAssetCapitalizationStockItemDto.stockUom());
        eAssetCapitalizationStockItemDao.setActualQty(vAssetCapitalizationStockItemDto.actualQty());
        eAssetCapitalizationStockItemDao.setValuationRate(vAssetCapitalizationStockItemDto.valuationRate());
        eAssetCapitalizationStockItemDao.setAmount(vAssetCapitalizationStockItemDto.amount());
        eAssetCapitalizationStockItemDao.setSerialAndBatchBundle(vAssetCapitalizationStockItemDto.serialAndBatchBundle());
        eAssetCapitalizationStockItemDao.setUseSerialBatchFields(vAssetCapitalizationStockItemDto.useSerialBatchFields());
        eAssetCapitalizationStockItemDao.setSerialNo(vAssetCapitalizationStockItemDto.serialNo());
        eAssetCapitalizationStockItemDao.setBatchNo(vAssetCapitalizationStockItemDto.batchNo());
        eAssetCapitalizationStockItemDao.setCostCenter(vAssetCapitalizationStockItemDto.costCenter());
        eAssetCapitalizationStockItemDao.setParent(vAssetCapitalizationStockItemDto.parent());
        eAssetCapitalizationStockItemDao.setParentField(vAssetCapitalizationStockItemDto.parentField());
        eAssetCapitalizationStockItemDao.setParentType(vAssetCapitalizationStockItemDto.parentType());
    }
}