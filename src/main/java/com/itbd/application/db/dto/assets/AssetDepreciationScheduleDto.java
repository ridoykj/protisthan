package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetDepreciationScheduleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetDepreciationScheduleDto(
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
        String company,
        BigDecimal grossPurchaseAmount,
        BigDecimal openingAccumulatedDepreciation,
        Integer numberOfDepreciationBooked,
        String financeBook,
        Integer financeBookId,
        String depreciationMethod,
        Integer totalNumberOfDepreciation,
        BigDecimal rateOfDepreciation,
        Boolean dailyProrataBased,
        Boolean shiftBased,
        Integer frequencyOfDepreciation,
        BigDecimal expectedValueAfterUsefulLife,
        String notes,
        String status,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetDepreciationScheduleDto fromEntity(AssetDepreciationScheduleDao eAssetDepreciationScheduleDao) {
        return new AssetDepreciationScheduleDto(
                eAssetDepreciationScheduleDao.getName(),
                eAssetDepreciationScheduleDao.getCreation(),
                eAssetDepreciationScheduleDao.getModified(),
                eAssetDepreciationScheduleDao.getModifiedBy(),
                eAssetDepreciationScheduleDao.getOwner(),
                eAssetDepreciationScheduleDao.getIsDocStatus(),
                eAssetDepreciationScheduleDao.getIdx(),
                eAssetDepreciationScheduleDao.getAsset(),
                eAssetDepreciationScheduleDao.getNamingSeries(),
                eAssetDepreciationScheduleDao.getCompany(),
                eAssetDepreciationScheduleDao.getGrossPurchaseAmount(),
                eAssetDepreciationScheduleDao.getOpeningAccumulatedDepreciation(),
                eAssetDepreciationScheduleDao.getNumberOfDepreciationBooked(),
                eAssetDepreciationScheduleDao.getFinanceBook(),
                eAssetDepreciationScheduleDao.getFinanceBookId(),
                eAssetDepreciationScheduleDao.getDepreciationMethod(),
                eAssetDepreciationScheduleDao.getTotalNumberOfDepreciation(),
                eAssetDepreciationScheduleDao.getRateOfDepreciation(),
                eAssetDepreciationScheduleDao.getDailyProrataBased(),
                eAssetDepreciationScheduleDao.getShiftBased(),
                eAssetDepreciationScheduleDao.getFrequencyOfDepreciation(),
                eAssetDepreciationScheduleDao.getExpectedValueAfterUsefulLife(),
                eAssetDepreciationScheduleDao.getNotes(),
                eAssetDepreciationScheduleDao.getStatus(),
                eAssetDepreciationScheduleDao.getAmendedFrom(),
                eAssetDepreciationScheduleDao.getUserTags(),
                eAssetDepreciationScheduleDao.getComments(),
                eAssetDepreciationScheduleDao.getAssign(),
                eAssetDepreciationScheduleDao.getLikedBy());
    }

    public static void fromDTO(AssetDepreciationScheduleDto vAssetDepreciationScheduleDto, AssetDepreciationScheduleDao eAssetDepreciationScheduleDao) {
        eAssetDepreciationScheduleDao.setName(vAssetDepreciationScheduleDto.name());
        eAssetDepreciationScheduleDao.setCreation(vAssetDepreciationScheduleDto.creation());
        eAssetDepreciationScheduleDao.setModified(vAssetDepreciationScheduleDto.modified());
        eAssetDepreciationScheduleDao.setModifiedBy(vAssetDepreciationScheduleDto.modifiedBy());
        eAssetDepreciationScheduleDao.setOwner(vAssetDepreciationScheduleDto.owner());
        eAssetDepreciationScheduleDao.setIsDocStatus(vAssetDepreciationScheduleDto.isDocStatus());
        eAssetDepreciationScheduleDao.setIdx(vAssetDepreciationScheduleDto.idx());
        eAssetDepreciationScheduleDao.setAsset(vAssetDepreciationScheduleDto.asset());
        eAssetDepreciationScheduleDao.setNamingSeries(vAssetDepreciationScheduleDto.namingSeries());
        eAssetDepreciationScheduleDao.setCompany(vAssetDepreciationScheduleDto.company());
        eAssetDepreciationScheduleDao.setGrossPurchaseAmount(vAssetDepreciationScheduleDto.grossPurchaseAmount());
        eAssetDepreciationScheduleDao.setOpeningAccumulatedDepreciation(vAssetDepreciationScheduleDto.openingAccumulatedDepreciation());
        eAssetDepreciationScheduleDao.setNumberOfDepreciationBooked(vAssetDepreciationScheduleDto.numberOfDepreciationBooked());
        eAssetDepreciationScheduleDao.setFinanceBook(vAssetDepreciationScheduleDto.financeBook());
        eAssetDepreciationScheduleDao.setFinanceBookId(vAssetDepreciationScheduleDto.financeBookId());
        eAssetDepreciationScheduleDao.setDepreciationMethod(vAssetDepreciationScheduleDto.depreciationMethod());
        eAssetDepreciationScheduleDao.setTotalNumberOfDepreciation(vAssetDepreciationScheduleDto.totalNumberOfDepreciation());
        eAssetDepreciationScheduleDao.setRateOfDepreciation(vAssetDepreciationScheduleDto.rateOfDepreciation());
        eAssetDepreciationScheduleDao.setDailyProrataBased(vAssetDepreciationScheduleDto.dailyProrataBased());
        eAssetDepreciationScheduleDao.setShiftBased(vAssetDepreciationScheduleDto.shiftBased());
        eAssetDepreciationScheduleDao.setFrequencyOfDepreciation(vAssetDepreciationScheduleDto.frequencyOfDepreciation());
        eAssetDepreciationScheduleDao.setExpectedValueAfterUsefulLife(vAssetDepreciationScheduleDto.expectedValueAfterUsefulLife());
        eAssetDepreciationScheduleDao.setNotes(vAssetDepreciationScheduleDto.notes());
        eAssetDepreciationScheduleDao.setStatus(vAssetDepreciationScheduleDto.status());
        eAssetDepreciationScheduleDao.setAmendedFrom(vAssetDepreciationScheduleDto.amendedFrom());
        eAssetDepreciationScheduleDao.setUserTags(vAssetDepreciationScheduleDto.userTags());
        eAssetDepreciationScheduleDao.setComments(vAssetDepreciationScheduleDto.comments());
        eAssetDepreciationScheduleDao.setAssign(vAssetDepreciationScheduleDto.assign());
        eAssetDepreciationScheduleDao.setLikedBy(vAssetDepreciationScheduleDto.likedBy());
    }
}