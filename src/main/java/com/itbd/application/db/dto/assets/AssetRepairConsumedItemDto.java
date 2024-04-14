package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetRepairConsumedItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetRepairConsumedItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        BigDecimal valuationRate,
        String consumedQuantity,
        BigDecimal totalValue,
        String serialNo,
        String serialAndBatchBundle,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetRepairConsumedItemDto fromEntity(AssetRepairConsumedItemDao eAssetRepairConsumedIDao) {
        return new AssetRepairConsumedItemDto(
                eAssetRepairConsumedIDao.getName(),
                eAssetRepairConsumedIDao.getCreation(),
                eAssetRepairConsumedIDao.getModified(),
                eAssetRepairConsumedIDao.getModifiedBy(),
                eAssetRepairConsumedIDao.getOwner(),
                eAssetRepairConsumedIDao.getIsDocStatus(),
                eAssetRepairConsumedIDao.getIdx(),
                eAssetRepairConsumedIDao.getItemCode(),
                eAssetRepairConsumedIDao.getValuationRate(),
                eAssetRepairConsumedIDao.getConsumedQuantity(),
                eAssetRepairConsumedIDao.getTotalValue(),
                eAssetRepairConsumedIDao.getSerialNo(),
                eAssetRepairConsumedIDao.getSerialAndBatchBundle(),
                eAssetRepairConsumedIDao.getParent(),
                eAssetRepairConsumedIDao.getParentField(),
                eAssetRepairConsumedIDao.getParentType());
    }

    public static void fromDTO(AssetRepairConsumedItemDto vAssetRepairConsumedIDto, AssetRepairConsumedItemDao eAssetRepairConsumedIDao) {
        eAssetRepairConsumedIDao.setName(vAssetRepairConsumedIDto.name());
        eAssetRepairConsumedIDao.setCreation(vAssetRepairConsumedIDto.creation());
        eAssetRepairConsumedIDao.setModified(vAssetRepairConsumedIDto.modified());
        eAssetRepairConsumedIDao.setModifiedBy(vAssetRepairConsumedIDto.modifiedBy());
        eAssetRepairConsumedIDao.setOwner(vAssetRepairConsumedIDto.owner());
        eAssetRepairConsumedIDao.setIsDocStatus(vAssetRepairConsumedIDto.isDocStatus());
        eAssetRepairConsumedIDao.setIdx(vAssetRepairConsumedIDto.idx());
        eAssetRepairConsumedIDao.setItemCode(vAssetRepairConsumedIDto.itemCode());
        eAssetRepairConsumedIDao.setValuationRate(vAssetRepairConsumedIDto.valuationRate());
        eAssetRepairConsumedIDao.setConsumedQuantity(vAssetRepairConsumedIDto.consumedQuantity());
        eAssetRepairConsumedIDao.setTotalValue(vAssetRepairConsumedIDto.totalValue());
        eAssetRepairConsumedIDao.setSerialNo(vAssetRepairConsumedIDto.serialNo());
        eAssetRepairConsumedIDao.setSerialAndBatchBundle(vAssetRepairConsumedIDto.serialAndBatchBundle());
        eAssetRepairConsumedIDao.setParent(vAssetRepairConsumedIDto.parent());
        eAssetRepairConsumedIDao.setParentField(vAssetRepairConsumedIDto.parentField());
        eAssetRepairConsumedIDao.setParentType(vAssetRepairConsumedIDto.parentType());
    }
}