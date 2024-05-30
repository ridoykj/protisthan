package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.FiscalYearDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record FiscalYearDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String year,
        Boolean disabled,
        Boolean isShortYear,
        LocalDate yearStartDate,
        LocalDate yearEndDate,
        Boolean autoCreated,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static FiscalYearDto fromEntity(FiscalYearDao eFiscalYearDao) {
        return new FiscalYearDto(
                eFiscalYearDao.getName(),
                eFiscalYearDao.getCreation(),
                eFiscalYearDao.getModified(),
                eFiscalYearDao.getModifiedBy(),
                eFiscalYearDao.getOwner(),
                eFiscalYearDao.getIsDocStatus(),
                eFiscalYearDao.getIdx(),
                eFiscalYearDao.getYear(),
                eFiscalYearDao.getDisabled(),
                eFiscalYearDao.getIsShortYear(),
                eFiscalYearDao.getYearStartDate(),
                eFiscalYearDao.getYearEndDate(),
                eFiscalYearDao.getAutoCreated(),
                eFiscalYearDao.getUserTags(),
                eFiscalYearDao.getComments(),
                eFiscalYearDao.getAssign(),
                eFiscalYearDao.getLikedBy());
    }

    public static void fromDTO(FiscalYearDto vFiscalYearDto, FiscalYearDao eFiscalYearDao) {
        eFiscalYearDao.setName(vFiscalYearDto.name());
        eFiscalYearDao.setCreation(vFiscalYearDto.creation());
        eFiscalYearDao.setModified(vFiscalYearDto.modified());
        eFiscalYearDao.setModifiedBy(vFiscalYearDto.modifiedBy());
        eFiscalYearDao.setOwner(vFiscalYearDto.owner());
        eFiscalYearDao.setIsDocStatus(vFiscalYearDto.isDocStatus());
        eFiscalYearDao.setIdx(vFiscalYearDto.idx());
        eFiscalYearDao.setYear(vFiscalYearDto.year());
        eFiscalYearDao.setDisabled(vFiscalYearDto.disabled());
        eFiscalYearDao.setIsShortYear(vFiscalYearDto.isShortYear());
        eFiscalYearDao.setYearStartDate(vFiscalYearDto.yearStartDate());
        eFiscalYearDao.setYearEndDate(vFiscalYearDto.yearEndDate());
        eFiscalYearDao.setAutoCreated(vFiscalYearDto.autoCreated());
        eFiscalYearDao.setUserTags(vFiscalYearDto.userTags());
        eFiscalYearDao.setComments(vFiscalYearDto.comments());
        eFiscalYearDao.setAssign(vFiscalYearDto.assign());
        eFiscalYearDao.setLikedBy(vFiscalYearDto.likedBy());
    }
}