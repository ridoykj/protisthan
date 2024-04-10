package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetShiftAllocationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetShiftAllocationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String asset,
        String namingSeries,
        String financeBook,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetShiftAllocationDto fromEntity(AssetShiftAllocationDao eAssetShiftAllocationDao) {
        return new AssetShiftAllocationDto(
                eAssetShiftAllocationDao.getName(),
                eAssetShiftAllocationDao.getCreation(),
                eAssetShiftAllocationDao.getModified(),
                eAssetShiftAllocationDao.getModifiedBy(),
                eAssetShiftAllocationDao.getOwner(),
                eAssetShiftAllocationDao.getIsDocStatus(),
                eAssetShiftAllocationDao.getIdx(),
                eAssetShiftAllocationDao.getAsset(),
                eAssetShiftAllocationDao.getNamingSeries(),
                eAssetShiftAllocationDao.getFinanceBook(),
                eAssetShiftAllocationDao.getAmendedFrom(),
                eAssetShiftAllocationDao.getUserTags(),
                eAssetShiftAllocationDao.getComments(),
                eAssetShiftAllocationDao.getAssign(),
                eAssetShiftAllocationDao.getLikedBy());
    }

    public static void fromDTO(AssetShiftAllocationDto vAssetShiftAllocationDto, AssetShiftAllocationDao eAssetShiftAllocationDao) {
        eAssetShiftAllocationDao.setName(vAssetShiftAllocationDto.name());
        eAssetShiftAllocationDao.setCreation(vAssetShiftAllocationDto.creation());
        eAssetShiftAllocationDao.setModified(vAssetShiftAllocationDto.modified());
        eAssetShiftAllocationDao.setModifiedBy(vAssetShiftAllocationDto.modifiedBy());
        eAssetShiftAllocationDao.setOwner(vAssetShiftAllocationDto.owner());
        eAssetShiftAllocationDao.setIsDocStatus(vAssetShiftAllocationDto.isDocStatus());
        eAssetShiftAllocationDao.setIdx(vAssetShiftAllocationDto.idx());
        eAssetShiftAllocationDao.setAsset(vAssetShiftAllocationDto.asset());
        eAssetShiftAllocationDao.setNamingSeries(vAssetShiftAllocationDto.namingSeries());
        eAssetShiftAllocationDao.setFinanceBook(vAssetShiftAllocationDto.financeBook());
        eAssetShiftAllocationDao.setAmendedFrom(vAssetShiftAllocationDto.amendedFrom());
        eAssetShiftAllocationDao.setUserTags(vAssetShiftAllocationDto.userTags());
        eAssetShiftAllocationDao.setComments(vAssetShiftAllocationDto.comments());
        eAssetShiftAllocationDao.setAssign(vAssetShiftAllocationDto.assign());
        eAssetShiftAllocationDao.setLikedBy(vAssetShiftAllocationDto.likedBy());
    }
}