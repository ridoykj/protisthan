package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetCategoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String assetCategoryName,
        Boolean enableCwipAccounting,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetCategoryDto fromEntity(AssetCategoryDao eAssetCategoryDao) {
        return new AssetCategoryDto(
                eAssetCategoryDao.getName(),
                eAssetCategoryDao.getCreation(),
                eAssetCategoryDao.getModified(),
                eAssetCategoryDao.getModifiedBy(),
                eAssetCategoryDao.getOwner(),
                eAssetCategoryDao.getIsDocStatus(),
                eAssetCategoryDao.getIdx(),
                eAssetCategoryDao.getAssetCategoryName(),
                eAssetCategoryDao.getEnableCwipAccounting(),
                eAssetCategoryDao.getUserTags(),
                eAssetCategoryDao.getComments(),
                eAssetCategoryDao.getAssign(),
                eAssetCategoryDao.getLikedBy());
    }

    public static void fromDTO(AssetCategoryDto vAssetCategoryDto, AssetCategoryDao eAssetCategoryDao) {
        eAssetCategoryDao.setName(vAssetCategoryDto.name());
        eAssetCategoryDao.setCreation(vAssetCategoryDto.creation());
        eAssetCategoryDao.setModified(vAssetCategoryDto.modified());
        eAssetCategoryDao.setModifiedBy(vAssetCategoryDto.modifiedBy());
        eAssetCategoryDao.setOwner(vAssetCategoryDto.owner());
        eAssetCategoryDao.setIsDocStatus(vAssetCategoryDto.isDocStatus());
        eAssetCategoryDao.setIdx(vAssetCategoryDto.idx());
        eAssetCategoryDao.setAssetCategoryName(vAssetCategoryDto.assetCategoryName());
        eAssetCategoryDao.setEnableCwipAccounting(vAssetCategoryDto.enableCwipAccounting());
        eAssetCategoryDao.setUserTags(vAssetCategoryDto.userTags());
        eAssetCategoryDao.setComments(vAssetCategoryDto.comments());
        eAssetCategoryDao.setAssign(vAssetCategoryDto.assign());
        eAssetCategoryDao.setLikedBy(vAssetCategoryDto.likedBy());
    }
}