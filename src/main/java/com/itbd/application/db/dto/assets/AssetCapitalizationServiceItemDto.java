package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCapitalizationServiceItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetCapitalizationServiceItemDto(
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
        String expenseAccount,
        BigDecimal qty,
        String uom,
        BigDecimal rate,
        BigDecimal amount,
        String costCenter,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetCapitalizationServiceItemDto fromEntity(AssetCapitalizationServiceItemDao eAssetCapitalizationServiceItemDao) {
        return new AssetCapitalizationServiceItemDto(
                eAssetCapitalizationServiceItemDao.getName(),
                eAssetCapitalizationServiceItemDao.getCreation(),
                eAssetCapitalizationServiceItemDao.getModified(),
                eAssetCapitalizationServiceItemDao.getModifiedBy(),
                eAssetCapitalizationServiceItemDao.getOwner(),
                eAssetCapitalizationServiceItemDao.getIsDocStatus(),
                eAssetCapitalizationServiceItemDao.getIdx(),
                eAssetCapitalizationServiceItemDao.getItemCode(),
                eAssetCapitalizationServiceItemDao.getItemName(),
                eAssetCapitalizationServiceItemDao.getExpenseAccount(),
                eAssetCapitalizationServiceItemDao.getQty(),
                eAssetCapitalizationServiceItemDao.getUom(),
                eAssetCapitalizationServiceItemDao.getRate(),
                eAssetCapitalizationServiceItemDao.getAmount(),
                eAssetCapitalizationServiceItemDao.getCostCenter(),
                eAssetCapitalizationServiceItemDao.getParent(),
                eAssetCapitalizationServiceItemDao.getParentField(),
                eAssetCapitalizationServiceItemDao.getParentType());
    }

    public static void fromDTO(AssetCapitalizationServiceItemDto vAssetCapitalizationServiceItemDto, AssetCapitalizationServiceItemDao eAssetCapitalizationServiceItemDao) {
        eAssetCapitalizationServiceItemDao.setName(vAssetCapitalizationServiceItemDto.name());
        eAssetCapitalizationServiceItemDao.setCreation(vAssetCapitalizationServiceItemDto.creation());
        eAssetCapitalizationServiceItemDao.setModified(vAssetCapitalizationServiceItemDto.modified());
        eAssetCapitalizationServiceItemDao.setModifiedBy(vAssetCapitalizationServiceItemDto.modifiedBy());
        eAssetCapitalizationServiceItemDao.setOwner(vAssetCapitalizationServiceItemDto.owner());
        eAssetCapitalizationServiceItemDao.setIsDocStatus(vAssetCapitalizationServiceItemDto.isDocStatus());
        eAssetCapitalizationServiceItemDao.setIdx(vAssetCapitalizationServiceItemDto.idx());
        eAssetCapitalizationServiceItemDao.setItemCode(vAssetCapitalizationServiceItemDto.itemCode());
        eAssetCapitalizationServiceItemDao.setItemName(vAssetCapitalizationServiceItemDto.itemName());
        eAssetCapitalizationServiceItemDao.setExpenseAccount(vAssetCapitalizationServiceItemDto.expenseAccount());
        eAssetCapitalizationServiceItemDao.setQty(vAssetCapitalizationServiceItemDto.qty());
        eAssetCapitalizationServiceItemDao.setUom(vAssetCapitalizationServiceItemDto.uom());
        eAssetCapitalizationServiceItemDao.setRate(vAssetCapitalizationServiceItemDto.rate());
        eAssetCapitalizationServiceItemDao.setAmount(vAssetCapitalizationServiceItemDto.amount());
        eAssetCapitalizationServiceItemDao.setCostCenter(vAssetCapitalizationServiceItemDto.costCenter());
        eAssetCapitalizationServiceItemDao.setParent(vAssetCapitalizationServiceItemDto.parent());
        eAssetCapitalizationServiceItemDao.setParentField(vAssetCapitalizationServiceItemDto.parentField());
        eAssetCapitalizationServiceItemDao.setParentType(vAssetCapitalizationServiceItemDto.parentType());
    }
}