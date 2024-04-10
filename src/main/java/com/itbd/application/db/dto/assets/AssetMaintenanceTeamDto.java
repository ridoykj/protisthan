package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMaintenanceTeamDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetMaintenanceTeamDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String maintenanceTeamName,
        String maintenanceManager,
        String maintenanceManagerName,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetMaintenanceTeamDto fromEntity(AssetMaintenanceTeamDao eAssetMaintenanceTeamDao) {
        return new AssetMaintenanceTeamDto(
                eAssetMaintenanceTeamDao.getName(),
                eAssetMaintenanceTeamDao.getCreation(),
                eAssetMaintenanceTeamDao.getModified(),
                eAssetMaintenanceTeamDao.getModifiedBy(),
                eAssetMaintenanceTeamDao.getOwner(),
                eAssetMaintenanceTeamDao.getIsDocStatus(),
                eAssetMaintenanceTeamDao.getIdx(),
                eAssetMaintenanceTeamDao.getMaintenanceTeamName(),
                eAssetMaintenanceTeamDao.getMaintenanceManager(),
                eAssetMaintenanceTeamDao.getMaintenanceManagerName(),
                eAssetMaintenanceTeamDao.getCompany(),
                eAssetMaintenanceTeamDao.getUserTags(),
                eAssetMaintenanceTeamDao.getComments(),
                eAssetMaintenanceTeamDao.getAssign(),
                eAssetMaintenanceTeamDao.getLikedBy());
    }

    public static void fromDTO(AssetMaintenanceTeamDto vAssetMaintenanceTeamDto, AssetMaintenanceTeamDao eAssetMaintenanceTeamDao) {
        eAssetMaintenanceTeamDao.setName(vAssetMaintenanceTeamDto.name());
        eAssetMaintenanceTeamDao.setCreation(vAssetMaintenanceTeamDto.creation());
        eAssetMaintenanceTeamDao.setModified(vAssetMaintenanceTeamDto.modified());
        eAssetMaintenanceTeamDao.setModifiedBy(vAssetMaintenanceTeamDto.modifiedBy());
        eAssetMaintenanceTeamDao.setOwner(vAssetMaintenanceTeamDto.owner());
        eAssetMaintenanceTeamDao.setIsDocStatus(vAssetMaintenanceTeamDto.isDocStatus());
        eAssetMaintenanceTeamDao.setIdx(vAssetMaintenanceTeamDto.idx());
        eAssetMaintenanceTeamDao.setMaintenanceTeamName(vAssetMaintenanceTeamDto.maintenanceTeamName());
        eAssetMaintenanceTeamDao.setMaintenanceManager(vAssetMaintenanceTeamDto.maintenanceManager());
        eAssetMaintenanceTeamDao.setMaintenanceManagerName(vAssetMaintenanceTeamDto.maintenanceManagerName());
        eAssetMaintenanceTeamDao.setCompany(vAssetMaintenanceTeamDto.company());
        eAssetMaintenanceTeamDao.setUserTags(vAssetMaintenanceTeamDto.userTags());
        eAssetMaintenanceTeamDao.setComments(vAssetMaintenanceTeamDto.comments());
        eAssetMaintenanceTeamDao.setAssign(vAssetMaintenanceTeamDto.assign());
        eAssetMaintenanceTeamDao.setLikedBy(vAssetMaintenanceTeamDto.likedBy());
    }
}