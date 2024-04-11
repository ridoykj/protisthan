package com.itbd.application.db.dto.currencys;

import com.itbd.application.db.dao.currencys.CurrencyExchangeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record CurrencyExchangeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate date,
        String fromCurrency,
        String toCurrency,
        BigDecimal exchangeRate,
        Boolean forBuying,
        Boolean forSelling,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CurrencyExchangeDto fromEntity(CurrencyExchangeDao eCurrencyExchangeDao) {
        return new CurrencyExchangeDto(
                eCurrencyExchangeDao.getName(),
                eCurrencyExchangeDao.getCreation(),
                eCurrencyExchangeDao.getModified(),
                eCurrencyExchangeDao.getModifiedBy(),
                eCurrencyExchangeDao.getOwner(),
                eCurrencyExchangeDao.getIsDocStatus(),
                eCurrencyExchangeDao.getIdx(),
                eCurrencyExchangeDao.getDate(),
                eCurrencyExchangeDao.getFromCurrency(),
                eCurrencyExchangeDao.getToCurrency(),
                eCurrencyExchangeDao.getExchangeRate(),
                eCurrencyExchangeDao.getForBuying(),
                eCurrencyExchangeDao.getForSelling(),
                eCurrencyExchangeDao.getUserTags(),
                eCurrencyExchangeDao.getComments(),
                eCurrencyExchangeDao.getAssign(),
                eCurrencyExchangeDao.getLikedBy());
    }

    public static void fromDTO(CurrencyExchangeDto vCurrencyExchangeDto, CurrencyExchangeDao eCurrencyExchangeDao) {
        eCurrencyExchangeDao.setName(vCurrencyExchangeDto.name());
        eCurrencyExchangeDao.setCreation(vCurrencyExchangeDto.creation());
        eCurrencyExchangeDao.setModified(vCurrencyExchangeDto.modified());
        eCurrencyExchangeDao.setModifiedBy(vCurrencyExchangeDto.modifiedBy());
        eCurrencyExchangeDao.setOwner(vCurrencyExchangeDto.owner());
        eCurrencyExchangeDao.setIsDocStatus(vCurrencyExchangeDto.isDocStatus());
        eCurrencyExchangeDao.setIdx(vCurrencyExchangeDto.idx());
        eCurrencyExchangeDao.setDate(vCurrencyExchangeDto.date());
        eCurrencyExchangeDao.setFromCurrency(vCurrencyExchangeDto.fromCurrency());
        eCurrencyExchangeDao.setToCurrency(vCurrencyExchangeDto.toCurrency());
        eCurrencyExchangeDao.setExchangeRate(vCurrencyExchangeDto.exchangeRate());
        eCurrencyExchangeDao.setForBuying(vCurrencyExchangeDto.forBuying());
        eCurrencyExchangeDao.setForSelling(vCurrencyExchangeDto.forSelling());
        eCurrencyExchangeDao.setUserTags(vCurrencyExchangeDto.userTags());
        eCurrencyExchangeDao.setComments(vCurrencyExchangeDto.comments());
        eCurrencyExchangeDao.setAssign(vCurrencyExchangeDto.assign());
        eCurrencyExchangeDao.setLikedBy(vCurrencyExchangeDto.likedBy());
    }
}