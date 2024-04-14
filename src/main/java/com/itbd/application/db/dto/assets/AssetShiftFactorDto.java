package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetShiftFactorDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetShiftFactorDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String shiftName,
        BigDecimal shiftFactor,
        Boolean defaults,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetShiftFactorDto fromEntity(AssetShiftFactorDao eAssetShiftFactorDao) {
        return new AssetShiftFactorDto(
                eAssetShiftFactorDao.getName(),
                eAssetShiftFactorDao.getCreation(),
                eAssetShiftFactorDao.getModified(),
                eAssetShiftFactorDao.getModifiedBy(),
                eAssetShiftFactorDao.getOwner(),
                eAssetShiftFactorDao.getIsDocStatus(),
                eAssetShiftFactorDao.getIdx(),
                eAssetShiftFactorDao.getShiftName(),
                eAssetShiftFactorDao.getShiftFactor(),
                eAssetShiftFactorDao.getDefaults(),
                eAssetShiftFactorDao.getUserTags(),
                eAssetShiftFactorDao.getComments(),
                eAssetShiftFactorDao.getAssign(),
                eAssetShiftFactorDao.getLikedBy());
    }

    public static void fromDTO(AssetShiftFactorDto vAssetShiftFactorDto, AssetShiftFactorDao eAssetShiftFactorDao) {
        eAssetShiftFactorDao.setName(vAssetShiftFactorDto.name());
        eAssetShiftFactorDao.setCreation(vAssetShiftFactorDto.creation());
        eAssetShiftFactorDao.setModified(vAssetShiftFactorDto.modified());
        eAssetShiftFactorDao.setModifiedBy(vAssetShiftFactorDto.modifiedBy());
        eAssetShiftFactorDao.setOwner(vAssetShiftFactorDto.owner());
        eAssetShiftFactorDao.setIsDocStatus(vAssetShiftFactorDto.isDocStatus());
        eAssetShiftFactorDao.setIdx(vAssetShiftFactorDto.idx());
        eAssetShiftFactorDao.setShiftName(vAssetShiftFactorDto.shiftName());
        eAssetShiftFactorDao.setShiftFactor(vAssetShiftFactorDto.shiftFactor());
        eAssetShiftFactorDao.setDefaults(vAssetShiftFactorDto.defaults());
        eAssetShiftFactorDao.setUserTags(vAssetShiftFactorDto.userTags());
        eAssetShiftFactorDao.setComments(vAssetShiftFactorDto.comments());
        eAssetShiftFactorDao.setAssign(vAssetShiftFactorDto.assign());
        eAssetShiftFactorDao.setLikedBy(vAssetShiftFactorDto.likedBy());
    }
}