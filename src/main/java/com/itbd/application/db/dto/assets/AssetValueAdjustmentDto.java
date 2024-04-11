package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetValueAdjustmentDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record AssetValueAdjustmentDto(
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
        String assetCategory,
        LocalDate date,
        String financeBook,
        String amendedFrom,
        BigDecimal currentAssetValue,
        BigDecimal newAssetValue,
        BigDecimal differenceAmount,
        String journalEntry,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetValueAdjustmentDto fromEntity(AssetValueAdjustmentDao eAssetValueAdjustmentDao) {
        return new AssetValueAdjustmentDto(
                eAssetValueAdjustmentDao.getName(),
                eAssetValueAdjustmentDao.getCreation(),
                eAssetValueAdjustmentDao.getModified(),
                eAssetValueAdjustmentDao.getModifiedBy(),
                eAssetValueAdjustmentDao.getOwner(),
                eAssetValueAdjustmentDao.getIsDocStatus(),
                eAssetValueAdjustmentDao.getIdx(),
                eAssetValueAdjustmentDao.getCompany(),
                eAssetValueAdjustmentDao.getAsset(),
                eAssetValueAdjustmentDao.getAssetCategory(),
                eAssetValueAdjustmentDao.getDate(),
                eAssetValueAdjustmentDao.getFinanceBook(),
                eAssetValueAdjustmentDao.getAmendedFrom(),
                eAssetValueAdjustmentDao.getCurrentAssetValue(),
                eAssetValueAdjustmentDao.getNewAssetValue(),
                eAssetValueAdjustmentDao.getDifferenceAmount(),
                eAssetValueAdjustmentDao.getJournalEntry(),
                eAssetValueAdjustmentDao.getCostCenter(),
                eAssetValueAdjustmentDao.getUserTags(),
                eAssetValueAdjustmentDao.getComments(),
                eAssetValueAdjustmentDao.getAssign(),
                eAssetValueAdjustmentDao.getLikedBy());
    }

    public static void fromDTO(AssetValueAdjustmentDto vAssetValueAdjustmentDto, AssetValueAdjustmentDao eAssetValueAdjustmentDao) {
        eAssetValueAdjustmentDao.setName(vAssetValueAdjustmentDto.name());
        eAssetValueAdjustmentDao.setCreation(vAssetValueAdjustmentDto.creation());
        eAssetValueAdjustmentDao.setModified(vAssetValueAdjustmentDto.modified());
        eAssetValueAdjustmentDao.setModifiedBy(vAssetValueAdjustmentDto.modifiedBy());
        eAssetValueAdjustmentDao.setOwner(vAssetValueAdjustmentDto.owner());
        eAssetValueAdjustmentDao.setIsDocStatus(vAssetValueAdjustmentDto.isDocStatus());
        eAssetValueAdjustmentDao.setIdx(vAssetValueAdjustmentDto.idx());
        eAssetValueAdjustmentDao.setCompany(vAssetValueAdjustmentDto.company());
        eAssetValueAdjustmentDao.setAsset(vAssetValueAdjustmentDto.asset());
        eAssetValueAdjustmentDao.setAssetCategory(vAssetValueAdjustmentDto.assetCategory());
        eAssetValueAdjustmentDao.setDate(vAssetValueAdjustmentDto.date());
        eAssetValueAdjustmentDao.setFinanceBook(vAssetValueAdjustmentDto.financeBook());
        eAssetValueAdjustmentDao.setAmendedFrom(vAssetValueAdjustmentDto.amendedFrom());
        eAssetValueAdjustmentDao.setCurrentAssetValue(vAssetValueAdjustmentDto.currentAssetValue());
        eAssetValueAdjustmentDao.setNewAssetValue(vAssetValueAdjustmentDto.newAssetValue());
        eAssetValueAdjustmentDao.setDifferenceAmount(vAssetValueAdjustmentDto.differenceAmount());
        eAssetValueAdjustmentDao.setJournalEntry(vAssetValueAdjustmentDto.journalEntry());
        eAssetValueAdjustmentDao.setCostCenter(vAssetValueAdjustmentDto.costCenter());
        eAssetValueAdjustmentDao.setUserTags(vAssetValueAdjustmentDto.userTags());
        eAssetValueAdjustmentDao.setComments(vAssetValueAdjustmentDto.comments());
        eAssetValueAdjustmentDao.setAssign(vAssetValueAdjustmentDto.assign());
        eAssetValueAdjustmentDao.setLikedBy(vAssetValueAdjustmentDto.likedBy());
    }
}