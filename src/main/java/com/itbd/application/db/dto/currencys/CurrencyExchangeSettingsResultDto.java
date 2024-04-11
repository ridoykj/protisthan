package com.itbd.application.db.dto.currencys;

import com.itbd.application.db.dao.currencys.CurrencyExchangeSettingsResultDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CurrencyExchangeSettingsResultDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String key,
        String parent,
        String parentField,
        String parentType
) {
    public static CurrencyExchangeSettingsResultDto fromEntity(CurrencyExchangeSettingsResultDao eCurrencyExchangeSettingsResultDao) {
        return new CurrencyExchangeSettingsResultDto(
                eCurrencyExchangeSettingsResultDao.getName(),
                eCurrencyExchangeSettingsResultDao.getCreation(),
                eCurrencyExchangeSettingsResultDao.getModified(),
                eCurrencyExchangeSettingsResultDao.getModifiedBy(),
                eCurrencyExchangeSettingsResultDao.getOwner(),
                eCurrencyExchangeSettingsResultDao.getIsDocStatus(),
                eCurrencyExchangeSettingsResultDao.getIdx(),
                eCurrencyExchangeSettingsResultDao.getKey(),
                eCurrencyExchangeSettingsResultDao.getParent(),
                eCurrencyExchangeSettingsResultDao.getParentField(),
                eCurrencyExchangeSettingsResultDao.getParentType());
    }

    public static void fromDTO(CurrencyExchangeSettingsResultDto vCurrencyExchangeSettingsResultDto, CurrencyExchangeSettingsResultDao eCurrencyExchangeSettingsResultDao) {
        eCurrencyExchangeSettingsResultDao.setName(vCurrencyExchangeSettingsResultDto.name());
        eCurrencyExchangeSettingsResultDao.setCreation(vCurrencyExchangeSettingsResultDto.creation());
        eCurrencyExchangeSettingsResultDao.setModified(vCurrencyExchangeSettingsResultDto.modified());
        eCurrencyExchangeSettingsResultDao.setModifiedBy(vCurrencyExchangeSettingsResultDto.modifiedBy());
        eCurrencyExchangeSettingsResultDao.setOwner(vCurrencyExchangeSettingsResultDto.owner());
        eCurrencyExchangeSettingsResultDao.setIsDocStatus(vCurrencyExchangeSettingsResultDto.isDocStatus());
        eCurrencyExchangeSettingsResultDao.setIdx(vCurrencyExchangeSettingsResultDto.idx());
        eCurrencyExchangeSettingsResultDao.setKey(vCurrencyExchangeSettingsResultDto.key());
        eCurrencyExchangeSettingsResultDao.setParent(vCurrencyExchangeSettingsResultDto.parent());
        eCurrencyExchangeSettingsResultDao.setParentField(vCurrencyExchangeSettingsResultDto.parentField());
        eCurrencyExchangeSettingsResultDao.setParentType(vCurrencyExchangeSettingsResultDto.parentType());
    }
}