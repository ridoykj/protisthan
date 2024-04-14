package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ExchangeRateRevaluationAccountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ExchangeRateRevaluationAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String partyType,
        String party,
        String accountCurrency,
        BigDecimal balanceInAccountCurrency,
        BigDecimal newBalanceInAccountCurrency,
        BigDecimal currentExchangeRate,
        BigDecimal newExchangeRate,
        BigDecimal balanceInBaseCurrency,
        BigDecimal newBalanceInBaseCurrency,
        BigDecimal gainLoss,
        Boolean zeroBalance,
        String parent,
        String parentField,
        String parentType
) {
    public static ExchangeRateRevaluationAccountDto fromEntity(ExchangeRateRevaluationAccountDao eExchangeRateRevaluationAccountDao) {
        return new ExchangeRateRevaluationAccountDto(
                eExchangeRateRevaluationAccountDao.getName(),
                eExchangeRateRevaluationAccountDao.getCreation(),
                eExchangeRateRevaluationAccountDao.getModified(),
                eExchangeRateRevaluationAccountDao.getModifiedBy(),
                eExchangeRateRevaluationAccountDao.getOwner(),
                eExchangeRateRevaluationAccountDao.getIsDocStatus(),
                eExchangeRateRevaluationAccountDao.getIdx(),
                eExchangeRateRevaluationAccountDao.getAccount(),
                eExchangeRateRevaluationAccountDao.getPartyType(),
                eExchangeRateRevaluationAccountDao.getParty(),
                eExchangeRateRevaluationAccountDao.getAccountCurrency(),
                eExchangeRateRevaluationAccountDao.getBalanceInAccountCurrency(),
                eExchangeRateRevaluationAccountDao.getNewBalanceInAccountCurrency(),
                eExchangeRateRevaluationAccountDao.getCurrentExchangeRate(),
                eExchangeRateRevaluationAccountDao.getNewExchangeRate(),
                eExchangeRateRevaluationAccountDao.getBalanceInBaseCurrency(),
                eExchangeRateRevaluationAccountDao.getNewBalanceInBaseCurrency(),
                eExchangeRateRevaluationAccountDao.getGainLoss(),
                eExchangeRateRevaluationAccountDao.getZeroBalance(),
                eExchangeRateRevaluationAccountDao.getParent(),
                eExchangeRateRevaluationAccountDao.getParentField(),
                eExchangeRateRevaluationAccountDao.getParentType());
    }

    public static void fromDTO(ExchangeRateRevaluationAccountDto vExchangeRateRevaluationAccountDto, ExchangeRateRevaluationAccountDao eExchangeRateRevaluationAccountDao) {
        eExchangeRateRevaluationAccountDao.setName(vExchangeRateRevaluationAccountDto.name());
        eExchangeRateRevaluationAccountDao.setCreation(vExchangeRateRevaluationAccountDto.creation());
        eExchangeRateRevaluationAccountDao.setModified(vExchangeRateRevaluationAccountDto.modified());
        eExchangeRateRevaluationAccountDao.setModifiedBy(vExchangeRateRevaluationAccountDto.modifiedBy());
        eExchangeRateRevaluationAccountDao.setOwner(vExchangeRateRevaluationAccountDto.owner());
        eExchangeRateRevaluationAccountDao.setIsDocStatus(vExchangeRateRevaluationAccountDto.isDocStatus());
        eExchangeRateRevaluationAccountDao.setIdx(vExchangeRateRevaluationAccountDto.idx());
        eExchangeRateRevaluationAccountDao.setAccount(vExchangeRateRevaluationAccountDto.account());
        eExchangeRateRevaluationAccountDao.setPartyType(vExchangeRateRevaluationAccountDto.partyType());
        eExchangeRateRevaluationAccountDao.setParty(vExchangeRateRevaluationAccountDto.party());
        eExchangeRateRevaluationAccountDao.setAccountCurrency(vExchangeRateRevaluationAccountDto.accountCurrency());
        eExchangeRateRevaluationAccountDao.setBalanceInAccountCurrency(vExchangeRateRevaluationAccountDto.balanceInAccountCurrency());
        eExchangeRateRevaluationAccountDao.setNewBalanceInAccountCurrency(vExchangeRateRevaluationAccountDto.newBalanceInAccountCurrency());
        eExchangeRateRevaluationAccountDao.setCurrentExchangeRate(vExchangeRateRevaluationAccountDto.currentExchangeRate());
        eExchangeRateRevaluationAccountDao.setNewExchangeRate(vExchangeRateRevaluationAccountDto.newExchangeRate());
        eExchangeRateRevaluationAccountDao.setBalanceInBaseCurrency(vExchangeRateRevaluationAccountDto.balanceInBaseCurrency());
        eExchangeRateRevaluationAccountDao.setNewBalanceInBaseCurrency(vExchangeRateRevaluationAccountDto.newBalanceInBaseCurrency());
        eExchangeRateRevaluationAccountDao.setGainLoss(vExchangeRateRevaluationAccountDto.gainLoss());
        eExchangeRateRevaluationAccountDao.setZeroBalance(vExchangeRateRevaluationAccountDto.zeroBalance());
        eExchangeRateRevaluationAccountDao.setParent(vExchangeRateRevaluationAccountDto.parent());
        eExchangeRateRevaluationAccountDao.setParentField(vExchangeRateRevaluationAccountDto.parentField());
        eExchangeRateRevaluationAccountDao.setParentType(vExchangeRateRevaluationAccountDto.parentType());
    }
}