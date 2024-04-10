package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountingPeriodDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AccountingPeriodDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String periodName,
        LocalDate startDate,
        LocalDate endDate,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AccountingPeriodDto fromEntity(AccountingPeriodDao eAccountingPeriodDao) {
        return new AccountingPeriodDto(
                eAccountingPeriodDao.getName(),
                eAccountingPeriodDao.getCreation(),
                eAccountingPeriodDao.getModified(),
                eAccountingPeriodDao.getModifiedBy(),
                eAccountingPeriodDao.getOwner(),
                eAccountingPeriodDao.getIsDocStatus(),
                eAccountingPeriodDao.getIdx(),
                eAccountingPeriodDao.getPeriodName(),
                eAccountingPeriodDao.getStartDate(),
                eAccountingPeriodDao.getEndDate(),
                eAccountingPeriodDao.getCompany(),
                eAccountingPeriodDao.getUserTags(),
                eAccountingPeriodDao.getComments(),
                eAccountingPeriodDao.getAssign(),
                eAccountingPeriodDao.getLikedBy());
    }

    public static void fromDTO(AccountingPeriodDto vAccountingPeriodDto, AccountingPeriodDao eAccountingPeriodDao) {
        eAccountingPeriodDao.setName(vAccountingPeriodDto.name());
        eAccountingPeriodDao.setCreation(vAccountingPeriodDto.creation());
        eAccountingPeriodDao.setModified(vAccountingPeriodDto.modified());
        eAccountingPeriodDao.setModifiedBy(vAccountingPeriodDto.modifiedBy());
        eAccountingPeriodDao.setOwner(vAccountingPeriodDto.owner());
        eAccountingPeriodDao.setIsDocStatus(vAccountingPeriodDto.isDocStatus());
        eAccountingPeriodDao.setIdx(vAccountingPeriodDto.idx());
        eAccountingPeriodDao.setPeriodName(vAccountingPeriodDto.periodName());
        eAccountingPeriodDao.setStartDate(vAccountingPeriodDto.startDate());
        eAccountingPeriodDao.setEndDate(vAccountingPeriodDto.endDate());
        eAccountingPeriodDao.setCompany(vAccountingPeriodDto.company());
        eAccountingPeriodDao.setUserTags(vAccountingPeriodDto.userTags());
        eAccountingPeriodDao.setComments(vAccountingPeriodDto.comments());
        eAccountingPeriodDao.setAssign(vAccountingPeriodDto.assign());
        eAccountingPeriodDao.setLikedBy(vAccountingPeriodDto.likedBy());
    }
}