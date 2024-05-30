package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.PeriodClosingVoucherDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PeriodClosingVoucherDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate transactionDate,
        LocalDate postingDate,
        String fiscalYear,
        LocalDate yearStartDate,
        String amendedFrom,
        String company,
        String closingAccountHead,
        String remarks,
        String gleProcessingStatus,
        String errorMessage,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PeriodClosingVoucherDto fromEntity(PeriodClosingVoucherDao ePeriodClosingVoucherDao) {
        return new PeriodClosingVoucherDto(
                ePeriodClosingVoucherDao.getName(),
                ePeriodClosingVoucherDao.getCreation(),
                ePeriodClosingVoucherDao.getModified(),
                ePeriodClosingVoucherDao.getModifiedBy(),
                ePeriodClosingVoucherDao.getOwner(),
                ePeriodClosingVoucherDao.getIsDocStatus(),
                ePeriodClosingVoucherDao.getIdx(),
                ePeriodClosingVoucherDao.getTransactionDate(),
                ePeriodClosingVoucherDao.getPostingDate(),
                ePeriodClosingVoucherDao.getFiscalYear(),
                ePeriodClosingVoucherDao.getYearStartDate(),
                ePeriodClosingVoucherDao.getAmendedFrom(),
                ePeriodClosingVoucherDao.getCompany(),
                ePeriodClosingVoucherDao.getClosingAccountHead(),
                ePeriodClosingVoucherDao.getRemarks(),
                ePeriodClosingVoucherDao.getGleProcessingStatus(),
                ePeriodClosingVoucherDao.getErrorMessage(),
                ePeriodClosingVoucherDao.getUserTags(),
                ePeriodClosingVoucherDao.getComments(),
                ePeriodClosingVoucherDao.getAssign(),
                ePeriodClosingVoucherDao.getLikedBy());
    }

    public static void fromDTO(PeriodClosingVoucherDto vPeriodClosingVoucherDto, PeriodClosingVoucherDao ePeriodClosingVoucherDao) {
        ePeriodClosingVoucherDao.setName(vPeriodClosingVoucherDto.name());
        ePeriodClosingVoucherDao.setCreation(vPeriodClosingVoucherDto.creation());
        ePeriodClosingVoucherDao.setModified(vPeriodClosingVoucherDto.modified());
        ePeriodClosingVoucherDao.setModifiedBy(vPeriodClosingVoucherDto.modifiedBy());
        ePeriodClosingVoucherDao.setOwner(vPeriodClosingVoucherDto.owner());
        ePeriodClosingVoucherDao.setIsDocStatus(vPeriodClosingVoucherDto.isDocStatus());
        ePeriodClosingVoucherDao.setIdx(vPeriodClosingVoucherDto.idx());
        ePeriodClosingVoucherDao.setTransactionDate(vPeriodClosingVoucherDto.transactionDate());
        ePeriodClosingVoucherDao.setPostingDate(vPeriodClosingVoucherDto.postingDate());
        ePeriodClosingVoucherDao.setFiscalYear(vPeriodClosingVoucherDto.fiscalYear());
        ePeriodClosingVoucherDao.setYearStartDate(vPeriodClosingVoucherDto.yearStartDate());
        ePeriodClosingVoucherDao.setAmendedFrom(vPeriodClosingVoucherDto.amendedFrom());
        ePeriodClosingVoucherDao.setCompany(vPeriodClosingVoucherDto.company());
        ePeriodClosingVoucherDao.setClosingAccountHead(vPeriodClosingVoucherDto.closingAccountHead());
        ePeriodClosingVoucherDao.setRemarks(vPeriodClosingVoucherDto.remarks());
        ePeriodClosingVoucherDao.setGleProcessingStatus(vPeriodClosingVoucherDto.gleProcessingStatus());
        ePeriodClosingVoucherDao.setErrorMessage(vPeriodClosingVoucherDto.errorMessage());
        ePeriodClosingVoucherDao.setUserTags(vPeriodClosingVoucherDto.userTags());
        ePeriodClosingVoucherDao.setComments(vPeriodClosingVoucherDto.comments());
        ePeriodClosingVoucherDao.setAssign(vPeriodClosingVoucherDto.assign());
        ePeriodClosingVoucherDao.setLikedBy(vPeriodClosingVoucherDto.likedBy());
    }
}