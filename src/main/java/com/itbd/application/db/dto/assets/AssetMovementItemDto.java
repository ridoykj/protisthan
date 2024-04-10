package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMovementItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetMovementItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String asset,
        String sourceLocation,
        String fromEmployee,
        String assetName,
        String targetLocation,
        String toEmployee,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetMovementItemDto fromEntity(AssetMovementItemDao eAssetMovementItemDao) {
        return new AssetMovementItemDto(
                eAssetMovementItemDao.getName(),
                eAssetMovementItemDao.getCreation(),
                eAssetMovementItemDao.getModified(),
                eAssetMovementItemDao.getModifiedBy(),
                eAssetMovementItemDao.getOwner(),
                eAssetMovementItemDao.getIsDocStatus(),
                eAssetMovementItemDao.getIdx(),
                eAssetMovementItemDao.getCompany(),
                eAssetMovementItemDao.getAsset(),
                eAssetMovementItemDao.getSourceLocation(),
                eAssetMovementItemDao.getFromEmployee(),
                eAssetMovementItemDao.getAssetName(),
                eAssetMovementItemDao.getTargetLocation(),
                eAssetMovementItemDao.getToEmployee(),
                eAssetMovementItemDao.getParent(),
                eAssetMovementItemDao.getParentField(),
                eAssetMovementItemDao.getParentType());
    }

    public static void fromDTO(AssetMovementItemDto vAssetMovementItemDto, AssetMovementItemDao eAssetMovementItemDao) {
        eAssetMovementItemDao.setName(vAssetMovementItemDto.name());
        eAssetMovementItemDao.setCreation(vAssetMovementItemDto.creation());
        eAssetMovementItemDao.setModified(vAssetMovementItemDto.modified());
        eAssetMovementItemDao.setModifiedBy(vAssetMovementItemDto.modifiedBy());
        eAssetMovementItemDao.setOwner(vAssetMovementItemDto.owner());
        eAssetMovementItemDao.setIsDocStatus(vAssetMovementItemDto.isDocStatus());
        eAssetMovementItemDao.setIdx(vAssetMovementItemDto.idx());
        eAssetMovementItemDao.setCompany(vAssetMovementItemDto.company());
        eAssetMovementItemDao.setAsset(vAssetMovementItemDto.asset());
        eAssetMovementItemDao.setSourceLocation(vAssetMovementItemDto.sourceLocation());
        eAssetMovementItemDao.setFromEmployee(vAssetMovementItemDto.fromEmployee());
        eAssetMovementItemDao.setAssetName(vAssetMovementItemDto.assetName());
        eAssetMovementItemDao.setTargetLocation(vAssetMovementItemDto.targetLocation());
        eAssetMovementItemDao.setToEmployee(vAssetMovementItemDto.toEmployee());
        eAssetMovementItemDao.setParent(vAssetMovementItemDto.parent());
        eAssetMovementItemDao.setParentField(vAssetMovementItemDto.parentField());
        eAssetMovementItemDao.setParentType(vAssetMovementItemDto.parentType());
    }
}