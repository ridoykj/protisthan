package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierScorecardPeriodDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SupplierScorecardPeriodDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplier,
        String namingSeries,
        BigDecimal totalScore,
        LocalDate startDate,
        LocalDate endDate,
        String scorecard,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierScorecardPeriodDto fromEntity(SupplierScorecardPeriodDao eSupplierScorecardPeriodDao) {
        return new SupplierScorecardPeriodDto(
                eSupplierScorecardPeriodDao.getName(),
                eSupplierScorecardPeriodDao.getCreation(),
                eSupplierScorecardPeriodDao.getModified(),
                eSupplierScorecardPeriodDao.getModifiedBy(),
                eSupplierScorecardPeriodDao.getOwner(),
                eSupplierScorecardPeriodDao.getIsDocStatus(),
                eSupplierScorecardPeriodDao.getIdx(),
                eSupplierScorecardPeriodDao.getSupplier(),
                eSupplierScorecardPeriodDao.getNamingSeries(),
                eSupplierScorecardPeriodDao.getTotalScore(),
                eSupplierScorecardPeriodDao.getStartDate(),
                eSupplierScorecardPeriodDao.getEndDate(),
                eSupplierScorecardPeriodDao.getScorecard(),
                eSupplierScorecardPeriodDao.getAmendedFrom(),
                eSupplierScorecardPeriodDao.getUserTags(),
                eSupplierScorecardPeriodDao.getComments(),
                eSupplierScorecardPeriodDao.getAssign(),
                eSupplierScorecardPeriodDao.getLikedBy());
    }

    public static void fromDTO(SupplierScorecardPeriodDto vSupplierScorecardPeriodDto, SupplierScorecardPeriodDao eSupplierScorecardPeriodDao) {
        eSupplierScorecardPeriodDao.setName(vSupplierScorecardPeriodDto.name());
        eSupplierScorecardPeriodDao.setCreation(vSupplierScorecardPeriodDto.creation());
        eSupplierScorecardPeriodDao.setModified(vSupplierScorecardPeriodDto.modified());
        eSupplierScorecardPeriodDao.setModifiedBy(vSupplierScorecardPeriodDto.modifiedBy());
        eSupplierScorecardPeriodDao.setOwner(vSupplierScorecardPeriodDto.owner());
        eSupplierScorecardPeriodDao.setIsDocStatus(vSupplierScorecardPeriodDto.isDocStatus());
        eSupplierScorecardPeriodDao.setIdx(vSupplierScorecardPeriodDto.idx());
        eSupplierScorecardPeriodDao.setSupplier(vSupplierScorecardPeriodDto.supplier());
        eSupplierScorecardPeriodDao.setNamingSeries(vSupplierScorecardPeriodDto.namingSeries());
        eSupplierScorecardPeriodDao.setTotalScore(vSupplierScorecardPeriodDto.totalScore());
        eSupplierScorecardPeriodDao.setStartDate(vSupplierScorecardPeriodDto.startDate());
        eSupplierScorecardPeriodDao.setEndDate(vSupplierScorecardPeriodDto.endDate());
        eSupplierScorecardPeriodDao.setScorecard(vSupplierScorecardPeriodDto.scorecard());
        eSupplierScorecardPeriodDao.setAmendedFrom(vSupplierScorecardPeriodDto.amendedFrom());
        eSupplierScorecardPeriodDao.setUserTags(vSupplierScorecardPeriodDto.userTags());
        eSupplierScorecardPeriodDao.setComments(vSupplierScorecardPeriodDto.comments());
        eSupplierScorecardPeriodDao.setAssign(vSupplierScorecardPeriodDto.assign());
        eSupplierScorecardPeriodDao.setLikedBy(vSupplierScorecardPeriodDto.likedBy());
    }
}