package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCategoryAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetCategoryAccountDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String companyName,
        String fixedAssetAccount,
        String accumulatedDepreciationAccount,
        String depreciationExpenseAccount,
        String capitalWorkInProgressAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetCategoryAccountDto fromEntity(AssetCategoryAccountDao eAssetCategoryAccountDao) {
        return new AssetCategoryAccountDto(
                eAssetCategoryAccountDao.getName(),
                eAssetCategoryAccountDao.getCreation(),
                eAssetCategoryAccountDao.getModified(),
                eAssetCategoryAccountDao.getModifiedBy(),
                eAssetCategoryAccountDao.getOwner(),
                eAssetCategoryAccountDao.getIsDocStatus(),
                eAssetCategoryAccountDao.getIdx(),
                eAssetCategoryAccountDao.getCompanyName(),
                eAssetCategoryAccountDao.getFixedAssetAccount(),
                eAssetCategoryAccountDao.getAccumulatedDepreciationAccount(),
                eAssetCategoryAccountDao.getDepreciationExpenseAccount(),
                eAssetCategoryAccountDao.getCapitalWorkInProgressAccount(),
                eAssetCategoryAccountDao.getParent(),
                eAssetCategoryAccountDao.getParentField(),
                eAssetCategoryAccountDao.getParentType());
    }

    public static void fromDTO(AssetCategoryAccountDto vAssetCategoryAccountDto, AssetCategoryAccountDao eAssetCategoryAccountDao) {
        eAssetCategoryAccountDao.setName(vAssetCategoryAccountDto.name());
        eAssetCategoryAccountDao.setCreation(vAssetCategoryAccountDto.creation());
        eAssetCategoryAccountDao.setModified(vAssetCategoryAccountDto.modified());
        eAssetCategoryAccountDao.setModifiedBy(vAssetCategoryAccountDto.modifiedBy());
        eAssetCategoryAccountDao.setOwner(vAssetCategoryAccountDto.owner());
        eAssetCategoryAccountDao.setIsDocStatus(vAssetCategoryAccountDto.isDocStatus());
        eAssetCategoryAccountDao.setIdx(vAssetCategoryAccountDto.idx());
        eAssetCategoryAccountDao.setCompanyName(vAssetCategoryAccountDto.companyName());
        eAssetCategoryAccountDao.setFixedAssetAccount(vAssetCategoryAccountDto.fixedAssetAccount());
        eAssetCategoryAccountDao.setAccumulatedDepreciationAccount(vAssetCategoryAccountDto.accumulatedDepreciationAccount());
        eAssetCategoryAccountDao.setDepreciationExpenseAccount(vAssetCategoryAccountDto.depreciationExpenseAccount());
        eAssetCategoryAccountDao.setCapitalWorkInProgressAccount(vAssetCategoryAccountDto.capitalWorkInProgressAccount());
        eAssetCategoryAccountDao.setParent(vAssetCategoryAccountDto.parent());
        eAssetCategoryAccountDao.setParentField(vAssetCategoryAccountDto.parentField());
        eAssetCategoryAccountDao.setParentType(vAssetCategoryAccountDto.parentType());
    }
}