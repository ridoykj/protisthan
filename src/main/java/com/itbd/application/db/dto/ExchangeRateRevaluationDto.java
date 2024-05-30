package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.ExchangeRateRevaluationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ExchangeRateRevaluationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        BigDecimal roundingLossAllowance,
        String company,
        BigDecimal gainLossUnbooked,
        BigDecimal gainLossBooked,
        BigDecimal totalGainLoss,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ExchangeRateRevaluationDto fromEntity(ExchangeRateRevaluationDao eExchangeRateRevaluationDao) {
        return new ExchangeRateRevaluationDto(
                eExchangeRateRevaluationDao.getName(),
                eExchangeRateRevaluationDao.getCreation(),
                eExchangeRateRevaluationDao.getModified(),
                eExchangeRateRevaluationDao.getModifiedBy(),
                eExchangeRateRevaluationDao.getOwner(),
                eExchangeRateRevaluationDao.getIsDocStatus(),
                eExchangeRateRevaluationDao.getIdx(),
                eExchangeRateRevaluationDao.getPostingDate(),
                eExchangeRateRevaluationDao.getRoundingLossAllowance(),
                eExchangeRateRevaluationDao.getCompany(),
                eExchangeRateRevaluationDao.getGainLossUnbooked(),
                eExchangeRateRevaluationDao.getGainLossBooked(),
                eExchangeRateRevaluationDao.getTotalGainLoss(),
                eExchangeRateRevaluationDao.getAmendedFrom(),
                eExchangeRateRevaluationDao.getUserTags(),
                eExchangeRateRevaluationDao.getComments(),
                eExchangeRateRevaluationDao.getAssign(),
                eExchangeRateRevaluationDao.getLikedBy());
    }

    public static void fromDTO(ExchangeRateRevaluationDto vExchangeRateRevaluationDto, ExchangeRateRevaluationDao eExchangeRateRevaluationDao) {
        eExchangeRateRevaluationDao.setName(vExchangeRateRevaluationDto.name());
        eExchangeRateRevaluationDao.setCreation(vExchangeRateRevaluationDto.creation());
        eExchangeRateRevaluationDao.setModified(vExchangeRateRevaluationDto.modified());
        eExchangeRateRevaluationDao.setModifiedBy(vExchangeRateRevaluationDto.modifiedBy());
        eExchangeRateRevaluationDao.setOwner(vExchangeRateRevaluationDto.owner());
        eExchangeRateRevaluationDao.setIsDocStatus(vExchangeRateRevaluationDto.isDocStatus());
        eExchangeRateRevaluationDao.setIdx(vExchangeRateRevaluationDto.idx());
        eExchangeRateRevaluationDao.setPostingDate(vExchangeRateRevaluationDto.postingDate());
        eExchangeRateRevaluationDao.setRoundingLossAllowance(vExchangeRateRevaluationDto.roundingLossAllowance());
        eExchangeRateRevaluationDao.setCompany(vExchangeRateRevaluationDto.company());
        eExchangeRateRevaluationDao.setGainLossUnbooked(vExchangeRateRevaluationDto.gainLossUnbooked());
        eExchangeRateRevaluationDao.setGainLossBooked(vExchangeRateRevaluationDto.gainLossBooked());
        eExchangeRateRevaluationDao.setTotalGainLoss(vExchangeRateRevaluationDto.totalGainLoss());
        eExchangeRateRevaluationDao.setAmendedFrom(vExchangeRateRevaluationDto.amendedFrom());
        eExchangeRateRevaluationDao.setUserTags(vExchangeRateRevaluationDto.userTags());
        eExchangeRateRevaluationDao.setComments(vExchangeRateRevaluationDto.comments());
        eExchangeRateRevaluationDao.setAssign(vExchangeRateRevaluationDto.assign());
        eExchangeRateRevaluationDao.setLikedBy(vExchangeRateRevaluationDto.likedBy());
    }
}