package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CashierClosingDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record CashierClosingDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String user,
        LocalDate date,
        LocalTime fromTime,
        LocalTime time,
        BigDecimal expense,
        BigDecimal custody,
        BigDecimal returns,
        BigDecimal outstandingAmount,
        BigDecimal netAmount,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CashierClosingDto fromEntity(CashierClosingDao eCashierClosingDao) {
        return new CashierClosingDto(
                eCashierClosingDao.getName(),
                eCashierClosingDao.getCreation(),
                eCashierClosingDao.getModified(),
                eCashierClosingDao.getModifiedBy(),
                eCashierClosingDao.getOwner(),
                eCashierClosingDao.getIsDocStatus(),
                eCashierClosingDao.getIdx(),
                eCashierClosingDao.getNamingSeries(),
                eCashierClosingDao.getUser(),
                eCashierClosingDao.getDate(),
                eCashierClosingDao.getFromTime(),
                eCashierClosingDao.getTime(),
                eCashierClosingDao.getExpense(),
                eCashierClosingDao.getCustody(),
                eCashierClosingDao.getReturns(),
                eCashierClosingDao.getOutstandingAmount(),
                eCashierClosingDao.getNetAmount(),
                eCashierClosingDao.getAmendedFrom(),
                eCashierClosingDao.getUserTags(),
                eCashierClosingDao.getComments(),
                eCashierClosingDao.getAssign(),
                eCashierClosingDao.getLikedBy());
    }

    public static void fromDTO(CashierClosingDto vCashierClosingDto, CashierClosingDao eCashierClosingDao) {
        eCashierClosingDao.setName(vCashierClosingDto.name());
        eCashierClosingDao.setCreation(vCashierClosingDto.creation());
        eCashierClosingDao.setModified(vCashierClosingDto.modified());
        eCashierClosingDao.setModifiedBy(vCashierClosingDto.modifiedBy());
        eCashierClosingDao.setOwner(vCashierClosingDto.owner());
        eCashierClosingDao.setIsDocStatus(vCashierClosingDto.isDocStatus());
        eCashierClosingDao.setIdx(vCashierClosingDto.idx());
        eCashierClosingDao.setNamingSeries(vCashierClosingDto.namingSeries());
        eCashierClosingDao.setUser(vCashierClosingDto.user());
        eCashierClosingDao.setDate(vCashierClosingDto.date());
        eCashierClosingDao.setFromTime(vCashierClosingDto.fromTime());
        eCashierClosingDao.setTime(vCashierClosingDto.time());
        eCashierClosingDao.setExpense(vCashierClosingDto.expense());
        eCashierClosingDao.setCustody(vCashierClosingDto.custody());
        eCashierClosingDao.setReturns(vCashierClosingDto.returns());
        eCashierClosingDao.setOutstandingAmount(vCashierClosingDto.outstandingAmount());
        eCashierClosingDao.setNetAmount(vCashierClosingDto.netAmount());
        eCashierClosingDao.setAmendedFrom(vCashierClosingDto.amendedFrom());
        eCashierClosingDao.setUserTags(vCashierClosingDto.userTags());
        eCashierClosingDao.setComments(vCashierClosingDto.comments());
        eCashierClosingDao.setAssign(vCashierClosingDto.assign());
        eCashierClosingDao.setLikedBy(vCashierClosingDto.likedBy());
    }
}