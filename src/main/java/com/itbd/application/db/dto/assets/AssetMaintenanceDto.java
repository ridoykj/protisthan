package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMaintenanceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetMaintenanceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String assetName,
        String assetCategory,
        String company,
        String itemCode,
        String itemName,
        String maintenanceTeam,
        String maintenanceManager,
        String maintenanceManagerName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetMaintenanceDto fromEntity(AssetMaintenanceDao eAssetMaintenanceDao) {
        return new AssetMaintenanceDto(
                eAssetMaintenanceDao.getName(),
                eAssetMaintenanceDao.getCreation(),
                eAssetMaintenanceDao.getModified(),
                eAssetMaintenanceDao.getModifiedBy(),
                eAssetMaintenanceDao.getOwner(),
                eAssetMaintenanceDao.getIsDocStatus(),
                eAssetMaintenanceDao.getIdx(),
                eAssetMaintenanceDao.getAssetName(),
                eAssetMaintenanceDao.getAssetCategory(),
                eAssetMaintenanceDao.getCompany(),
                eAssetMaintenanceDao.getItemCode(),
                eAssetMaintenanceDao.getItemName(),
                eAssetMaintenanceDao.getMaintenanceTeam(),
                eAssetMaintenanceDao.getMaintenanceManager(),
                eAssetMaintenanceDao.getMaintenanceManagerName(),
                eAssetMaintenanceDao.getUserTags(),
                eAssetMaintenanceDao.getComments(),
                eAssetMaintenanceDao.getAssign(),
                eAssetMaintenanceDao.getLikedBy());
    }

    public static void fromDTO(AssetMaintenanceDto vAssetMaintenanceDto, AssetMaintenanceDao eAssetMaintenanceDao) {
        eAssetMaintenanceDao.setName(vAssetMaintenanceDto.name());
        eAssetMaintenanceDao.setCreation(vAssetMaintenanceDto.creation());
        eAssetMaintenanceDao.setModified(vAssetMaintenanceDto.modified());
        eAssetMaintenanceDao.setModifiedBy(vAssetMaintenanceDto.modifiedBy());
        eAssetMaintenanceDao.setOwner(vAssetMaintenanceDto.owner());
        eAssetMaintenanceDao.setIsDocStatus(vAssetMaintenanceDto.isDocStatus());
        eAssetMaintenanceDao.setIdx(vAssetMaintenanceDto.idx());
        eAssetMaintenanceDao.setAssetName(vAssetMaintenanceDto.assetName());
        eAssetMaintenanceDao.setAssetCategory(vAssetMaintenanceDto.assetCategory());
        eAssetMaintenanceDao.setCompany(vAssetMaintenanceDto.company());
        eAssetMaintenanceDao.setItemCode(vAssetMaintenanceDto.itemCode());
        eAssetMaintenanceDao.setItemName(vAssetMaintenanceDto.itemName());
        eAssetMaintenanceDao.setMaintenanceTeam(vAssetMaintenanceDto.maintenanceTeam());
        eAssetMaintenanceDao.setMaintenanceManager(vAssetMaintenanceDto.maintenanceManager());
        eAssetMaintenanceDao.setMaintenanceManagerName(vAssetMaintenanceDto.maintenanceManagerName());
        eAssetMaintenanceDao.setUserTags(vAssetMaintenanceDto.userTags());
        eAssetMaintenanceDao.setComments(vAssetMaintenanceDto.comments());
        eAssetMaintenanceDao.setAssign(vAssetMaintenanceDto.assign());
        eAssetMaintenanceDao.setLikedBy(vAssetMaintenanceDto.likedBy());
    }
}