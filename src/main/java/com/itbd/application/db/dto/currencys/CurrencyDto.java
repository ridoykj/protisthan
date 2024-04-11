package com.itbd.application.db.dto.currencys;

import com.itbd.application.db.dao.currencys.CurrencyDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CurrencyDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String currencyName,
        Boolean enabled,
        String fraction,
        Integer fractionUnits,
        BigDecimal smallestCurrencyFractionValue,
        String symbol,
        Boolean symbolOnRight,
        String numberFormat,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CurrencyDto fromEntity(CurrencyDao eCurrencyDao) {
        return new CurrencyDto(
                eCurrencyDao.getName(),
                eCurrencyDao.getCreation(),
                eCurrencyDao.getModified(),
                eCurrencyDao.getModifiedBy(),
                eCurrencyDao.getOwner(),
                eCurrencyDao.getIsDocStatus(),
                eCurrencyDao.getIdx(),
                eCurrencyDao.getCurrencyName(),
                eCurrencyDao.getEnabled(),
                eCurrencyDao.getFraction(),
                eCurrencyDao.getFractionUnits(),
                eCurrencyDao.getSmallestCurrencyFractionValue(),
                eCurrencyDao.getSymbol(),
                eCurrencyDao.getSymbolOnRight(),
                eCurrencyDao.getNumberFormat(),
                eCurrencyDao.getUserTags(),
                eCurrencyDao.getComments(),
                eCurrencyDao.getAssign(),
                eCurrencyDao.getLikedBy());
    }

    public static void fromDTO(CurrencyDto vCurrencyDto, CurrencyDao eCurrencyDao) {
        eCurrencyDao.setName(vCurrencyDto.name());
        eCurrencyDao.setCreation(vCurrencyDto.creation());
        eCurrencyDao.setModified(vCurrencyDto.modified());
        eCurrencyDao.setModifiedBy(vCurrencyDto.modifiedBy());
        eCurrencyDao.setOwner(vCurrencyDto.owner());
        eCurrencyDao.setIsDocStatus(vCurrencyDto.isDocStatus());
        eCurrencyDao.setIdx(vCurrencyDto.idx());
        eCurrencyDao.setCurrencyName(vCurrencyDto.currencyName());
        eCurrencyDao.setEnabled(vCurrencyDto.enabled());
        eCurrencyDao.setFraction(vCurrencyDto.fraction());
        eCurrencyDao.setFractionUnits(vCurrencyDto.fractionUnits());
        eCurrencyDao.setSmallestCurrencyFractionValue(vCurrencyDto.smallestCurrencyFractionValue());
        eCurrencyDao.setSymbol(vCurrencyDto.symbol());
        eCurrencyDao.setSymbolOnRight(vCurrencyDto.symbolOnRight());
        eCurrencyDao.setNumberFormat(vCurrencyDto.numberFormat());
        eCurrencyDao.setUserTags(vCurrencyDto.userTags());
        eCurrencyDao.setComments(vCurrencyDto.comments());
        eCurrencyDao.setAssign(vCurrencyDto.assign());
        eCurrencyDao.setLikedBy(vCurrencyDto.likedBy());
    }
}