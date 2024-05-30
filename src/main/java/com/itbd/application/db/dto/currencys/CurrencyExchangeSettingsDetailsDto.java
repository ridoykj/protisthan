package com.itbd.application.db.dto.currencys;

import com.itbd.application.db.dao.accounts.CurrencyExchangeSettingsDetailsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CurrencyExchangeSettingsDetailsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String key,
        String value,
        String parent,
        String parentField,
        String parentType
) {
    public static CurrencyExchangeSettingsDetailsDto fromEntity(CurrencyExchangeSettingsDetailsDao eCurrencyExchangeSettingsDetailsDao) {
        return new CurrencyExchangeSettingsDetailsDto(
                eCurrencyExchangeSettingsDetailsDao.getName(),
                eCurrencyExchangeSettingsDetailsDao.getCreation(),
                eCurrencyExchangeSettingsDetailsDao.getModified(),
                eCurrencyExchangeSettingsDetailsDao.getModifiedBy(),
                eCurrencyExchangeSettingsDetailsDao.getOwner(),
                eCurrencyExchangeSettingsDetailsDao.getIsDocStatus(),
                eCurrencyExchangeSettingsDetailsDao.getIdx(),
                eCurrencyExchangeSettingsDetailsDao.getKey(),
                eCurrencyExchangeSettingsDetailsDao.getValue(),
                eCurrencyExchangeSettingsDetailsDao.getParent(),
                eCurrencyExchangeSettingsDetailsDao.getParentField(),
                eCurrencyExchangeSettingsDetailsDao.getParentType());
    }

    public static void fromDTO(CurrencyExchangeSettingsDetailsDto vCurrencyExchangeSettingsDetailsDto, CurrencyExchangeSettingsDetailsDao eCurrencyExchangeSettingsDetailsDao) {
        eCurrencyExchangeSettingsDetailsDao.setName(vCurrencyExchangeSettingsDetailsDto.name());
        eCurrencyExchangeSettingsDetailsDao.setCreation(vCurrencyExchangeSettingsDetailsDto.creation());
        eCurrencyExchangeSettingsDetailsDao.setModified(vCurrencyExchangeSettingsDetailsDto.modified());
        eCurrencyExchangeSettingsDetailsDao.setModifiedBy(vCurrencyExchangeSettingsDetailsDto.modifiedBy());
        eCurrencyExchangeSettingsDetailsDao.setOwner(vCurrencyExchangeSettingsDetailsDto.owner());
        eCurrencyExchangeSettingsDetailsDao.setIsDocStatus(vCurrencyExchangeSettingsDetailsDto.isDocStatus());
        eCurrencyExchangeSettingsDetailsDao.setIdx(vCurrencyExchangeSettingsDetailsDto.idx());
        eCurrencyExchangeSettingsDetailsDao.setKey(vCurrencyExchangeSettingsDetailsDto.key());
        eCurrencyExchangeSettingsDetailsDao.setValue(vCurrencyExchangeSettingsDetailsDto.value());
        eCurrencyExchangeSettingsDetailsDao.setParent(vCurrencyExchangeSettingsDetailsDto.parent());
        eCurrencyExchangeSettingsDetailsDao.setParentField(vCurrencyExchangeSettingsDetailsDto.parentField());
        eCurrencyExchangeSettingsDetailsDao.setParentType(vCurrencyExchangeSettingsDetailsDto.parentType());
    }
}