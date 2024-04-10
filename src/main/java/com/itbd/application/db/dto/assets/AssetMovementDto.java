package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMovementDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssetMovementDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String purpose,
        LocalDateTime transactionDate,
        String referenceDocType,
        String referenceName,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetMovementDto fromEntity(AssetMovementDao eAssetMovementDao) {
        return new AssetMovementDto(
                eAssetMovementDao.getName(),
                eAssetMovementDao.getCreation(),
                eAssetMovementDao.getModified(),
                eAssetMovementDao.getModifiedBy(),
                eAssetMovementDao.getOwner(),
                eAssetMovementDao.getIsDocStatus(),
                eAssetMovementDao.getIdx(),
                eAssetMovementDao.getCompany(),
                eAssetMovementDao.getPurpose(),
                eAssetMovementDao.getTransactionDate(),
                eAssetMovementDao.getReferenceDocType(),
                eAssetMovementDao.getReferenceName(),
                eAssetMovementDao.getAmendedFrom(),
                eAssetMovementDao.getUserTags(),
                eAssetMovementDao.getComments(),
                eAssetMovementDao.getAssign(),
                eAssetMovementDao.getLikedBy());
    }

    public static void fromDTO(AssetMovementDto vAssetMovementDto, AssetMovementDao eAssetMovementDao) {
        eAssetMovementDao.setName(vAssetMovementDto.name());
        eAssetMovementDao.setCreation(vAssetMovementDto.creation());
        eAssetMovementDao.setModified(vAssetMovementDto.modified());
        eAssetMovementDao.setModifiedBy(vAssetMovementDto.modifiedBy());
        eAssetMovementDao.setOwner(vAssetMovementDto.owner());
        eAssetMovementDao.setIsDocStatus(vAssetMovementDto.isDocStatus());
        eAssetMovementDao.setIdx(vAssetMovementDto.idx());
        eAssetMovementDao.setCompany(vAssetMovementDto.company());
        eAssetMovementDao.setPurpose(vAssetMovementDto.purpose());
        eAssetMovementDao.setTransactionDate(vAssetMovementDto.transactionDate());
        eAssetMovementDao.setReferenceDocType(vAssetMovementDto.referenceDocType());
        eAssetMovementDao.setReferenceName(vAssetMovementDto.referenceName());
        eAssetMovementDao.setAmendedFrom(vAssetMovementDto.amendedFrom());
        eAssetMovementDao.setUserTags(vAssetMovementDto.userTags());
        eAssetMovementDao.setComments(vAssetMovementDto.comments());
        eAssetMovementDao.setAssign(vAssetMovementDto.assign());
        eAssetMovementDao.setLikedBy(vAssetMovementDto.likedBy());
    }
}