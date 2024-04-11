package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetActivityDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetActivityDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String asset,
        LocalDateTime date,
        String user,
        String subject,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetActivityDto fromEntity(AssetActivityDao eAssetActivityDao) {
        return new AssetActivityDto(
                eAssetActivityDao.getName(),
                eAssetActivityDao.getCreation(),
                eAssetActivityDao.getModified(),
                eAssetActivityDao.getModifiedBy(),
                eAssetActivityDao.getOwner(),
                eAssetActivityDao.getIsDocStatus(),
                eAssetActivityDao.getIdx(),
                eAssetActivityDao.getAsset(),
                eAssetActivityDao.getDate(),
                eAssetActivityDao.getUser(),
                eAssetActivityDao.getSubject(),
                eAssetActivityDao.getUserTags(),
                eAssetActivityDao.getComments(),
                eAssetActivityDao.getAssign(),
                eAssetActivityDao.getLikedBy());
    }

    public static void fromDTO(AssetActivityDto vAssetActivityDto, AssetActivityDao eAssetActivityDao) {
        eAssetActivityDao.setName(vAssetActivityDto.name());
        eAssetActivityDao.setCreation(vAssetActivityDto.creation());
        eAssetActivityDao.setModified(vAssetActivityDto.modified());
        eAssetActivityDao.setModifiedBy(vAssetActivityDto.modifiedBy());
        eAssetActivityDao.setOwner(vAssetActivityDto.owner());
        eAssetActivityDao.setIsDocStatus(vAssetActivityDto.isDocStatus());
        eAssetActivityDao.setIdx(vAssetActivityDto.idx());
        eAssetActivityDao.setAsset(vAssetActivityDto.asset());
        eAssetActivityDao.setDate(vAssetActivityDto.date());
        eAssetActivityDao.setUser(vAssetActivityDto.user());
        eAssetActivityDao.setSubject(vAssetActivityDto.subject());
        eAssetActivityDao.setUserTags(vAssetActivityDto.userTags());
        eAssetActivityDao.setComments(vAssetActivityDto.comments());
        eAssetActivityDao.setAssign(vAssetActivityDto.assign());
        eAssetActivityDao.setLikedBy(vAssetActivityDto.likedBy());
    }
}