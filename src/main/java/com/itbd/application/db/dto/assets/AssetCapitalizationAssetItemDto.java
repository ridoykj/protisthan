package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCapitalizationAssetItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetCapitalizationAssetItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String asset,
        String assetName,
        String financeBook,
        String itemCode,
        String itemName,
        BigDecimal currentAssetValue,
        BigDecimal assetValue,
        String costCenter,
        String fixedAssetAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetCapitalizationAssetItemDto fromEntity(AssetCapitalizationAssetItemDao eAssetCapitalizationAssetItemDao) {
        return new AssetCapitalizationAssetItemDto(
                eAssetCapitalizationAssetItemDao.getName(),
                eAssetCapitalizationAssetItemDao.getCreation(),
                eAssetCapitalizationAssetItemDao.getModified(),
                eAssetCapitalizationAssetItemDao.getModifiedBy(),
                eAssetCapitalizationAssetItemDao.getOwner(),
                eAssetCapitalizationAssetItemDao.getIsDocStatus(),
                eAssetCapitalizationAssetItemDao.getIdx(),
                eAssetCapitalizationAssetItemDao.getAsset(),
                eAssetCapitalizationAssetItemDao.getAssetName(),
                eAssetCapitalizationAssetItemDao.getFinanceBook(),
                eAssetCapitalizationAssetItemDao.getItemCode(),
                eAssetCapitalizationAssetItemDao.getItemName(),
                eAssetCapitalizationAssetItemDao.getCurrentAssetValue(),
                eAssetCapitalizationAssetItemDao.getAssetValue(),
                eAssetCapitalizationAssetItemDao.getCostCenter(),
                eAssetCapitalizationAssetItemDao.getFixedAssetAccount(),
                eAssetCapitalizationAssetItemDao.getParent(),
                eAssetCapitalizationAssetItemDao.getParentField(),
                eAssetCapitalizationAssetItemDao.getParentType());
    }

    public static void fromDTO(AssetCapitalizationAssetItemDto vAssetCapitalizationAssetItemDto, AssetCapitalizationAssetItemDao eAssetCapitalizationAssetItemDao) {
        eAssetCapitalizationAssetItemDao.setName(vAssetCapitalizationAssetItemDto.name());
        eAssetCapitalizationAssetItemDao.setCreation(vAssetCapitalizationAssetItemDto.creation());
        eAssetCapitalizationAssetItemDao.setModified(vAssetCapitalizationAssetItemDto.modified());
        eAssetCapitalizationAssetItemDao.setModifiedBy(vAssetCapitalizationAssetItemDto.modifiedBy());
        eAssetCapitalizationAssetItemDao.setOwner(vAssetCapitalizationAssetItemDto.owner());
        eAssetCapitalizationAssetItemDao.setIsDocStatus(vAssetCapitalizationAssetItemDto.isDocStatus());
        eAssetCapitalizationAssetItemDao.setIdx(vAssetCapitalizationAssetItemDto.idx());
        eAssetCapitalizationAssetItemDao.setAsset(vAssetCapitalizationAssetItemDto.asset());
        eAssetCapitalizationAssetItemDao.setAssetName(vAssetCapitalizationAssetItemDto.assetName());
        eAssetCapitalizationAssetItemDao.setFinanceBook(vAssetCapitalizationAssetItemDto.financeBook());
        eAssetCapitalizationAssetItemDao.setItemCode(vAssetCapitalizationAssetItemDto.itemCode());
        eAssetCapitalizationAssetItemDao.setItemName(vAssetCapitalizationAssetItemDto.itemName());
        eAssetCapitalizationAssetItemDao.setCurrentAssetValue(vAssetCapitalizationAssetItemDto.currentAssetValue());
        eAssetCapitalizationAssetItemDao.setAssetValue(vAssetCapitalizationAssetItemDto.assetValue());
        eAssetCapitalizationAssetItemDao.setCostCenter(vAssetCapitalizationAssetItemDto.costCenter());
        eAssetCapitalizationAssetItemDao.setFixedAssetAccount(vAssetCapitalizationAssetItemDto.fixedAssetAccount());
        eAssetCapitalizationAssetItemDao.setParent(vAssetCapitalizationAssetItemDto.parent());
        eAssetCapitalizationAssetItemDao.setParentField(vAssetCapitalizationAssetItemDto.parentField());
        eAssetCapitalizationAssetItemDao.setParentType(vAssetCapitalizationAssetItemDto.parentType());
    }
}