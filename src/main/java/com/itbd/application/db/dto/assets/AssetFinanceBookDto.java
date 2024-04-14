package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetFinanceBookDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record AssetFinanceBookDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String financeBook,
        String depreciationMethod,
        Integer totalNumberOfDepreciation,
        Boolean dailyProrataBased,
        Boolean shiftBased,
        Integer frequencyOfDepreciation,
        LocalDate depreciationStartDate,
        BigDecimal salvageValuePercentage,
        BigDecimal expectedValueAfterUsefulLife,
        BigDecimal valueAfterDepreciation,
        BigDecimal rateOfDepreciation,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetFinanceBookDto fromEntity(AssetFinanceBookDao eAssetFinanceBookDao) {
        return new AssetFinanceBookDto(
                eAssetFinanceBookDao.getName(),
                eAssetFinanceBookDao.getCreation(),
                eAssetFinanceBookDao.getModified(),
                eAssetFinanceBookDao.getModifiedBy(),
                eAssetFinanceBookDao.getOwner(),
                eAssetFinanceBookDao.getIsDocStatus(),
                eAssetFinanceBookDao.getIdx(),
                eAssetFinanceBookDao.getFinanceBook(),
                eAssetFinanceBookDao.getDepreciationMethod(),
                eAssetFinanceBookDao.getTotalNumberOfDepreciation(),
                eAssetFinanceBookDao.getDailyProrataBased(),
                eAssetFinanceBookDao.getShiftBased(),
                eAssetFinanceBookDao.getFrequencyOfDepreciation(),
                eAssetFinanceBookDao.getDepreciationStartDate(),
                eAssetFinanceBookDao.getSalvageValuePercentage(),
                eAssetFinanceBookDao.getExpectedValueAfterUsefulLife(),
                eAssetFinanceBookDao.getValueAfterDepreciation(),
                eAssetFinanceBookDao.getRateOfDepreciation(),
                eAssetFinanceBookDao.getParent(),
                eAssetFinanceBookDao.getParentField(),
                eAssetFinanceBookDao.getParentType());
    }

    public static void fromDTO(AssetFinanceBookDto vAssetFinanceBookDto, AssetFinanceBookDao eAssetFinanceBookDao) {
        eAssetFinanceBookDao.setName(vAssetFinanceBookDto.name());
        eAssetFinanceBookDao.setCreation(vAssetFinanceBookDto.creation());
        eAssetFinanceBookDao.setModified(vAssetFinanceBookDto.modified());
        eAssetFinanceBookDao.setModifiedBy(vAssetFinanceBookDto.modifiedBy());
        eAssetFinanceBookDao.setOwner(vAssetFinanceBookDto.owner());
        eAssetFinanceBookDao.setIsDocStatus(vAssetFinanceBookDto.isDocStatus());
        eAssetFinanceBookDao.setIdx(vAssetFinanceBookDto.idx());
        eAssetFinanceBookDao.setFinanceBook(vAssetFinanceBookDto.financeBook());
        eAssetFinanceBookDao.setDepreciationMethod(vAssetFinanceBookDto.depreciationMethod());
        eAssetFinanceBookDao.setTotalNumberOfDepreciation(vAssetFinanceBookDto.totalNumberOfDepreciation());
        eAssetFinanceBookDao.setDailyProrataBased(vAssetFinanceBookDto.dailyProrataBased());
        eAssetFinanceBookDao.setShiftBased(vAssetFinanceBookDto.shiftBased());
        eAssetFinanceBookDao.setFrequencyOfDepreciation(vAssetFinanceBookDto.frequencyOfDepreciation());
        eAssetFinanceBookDao.setDepreciationStartDate(vAssetFinanceBookDto.depreciationStartDate());
        eAssetFinanceBookDao.setSalvageValuePercentage(vAssetFinanceBookDto.salvageValuePercentage());
        eAssetFinanceBookDao.setExpectedValueAfterUsefulLife(vAssetFinanceBookDto.expectedValueAfterUsefulLife());
        eAssetFinanceBookDao.setValueAfterDepreciation(vAssetFinanceBookDto.valueAfterDepreciation());
        eAssetFinanceBookDao.setRateOfDepreciation(vAssetFinanceBookDto.rateOfDepreciation());
        eAssetFinanceBookDao.setParent(vAssetFinanceBookDto.parent());
        eAssetFinanceBookDao.setParentField(vAssetFinanceBookDto.parentField());
        eAssetFinanceBookDao.setParentType(vAssetFinanceBookDto.parentType());
    }
}