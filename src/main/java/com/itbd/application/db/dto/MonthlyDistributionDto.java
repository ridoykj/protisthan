package com.itbd.application.db.dto;

import com.itbd.application.db.dao.MonthlyDistributionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MonthlyDistributionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String distributionId,
        String fiscalYear,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MonthlyDistributionDto fromEntity(MonthlyDistributionDao eMonthlyDistributionDao) {
        return new MonthlyDistributionDto(
                eMonthlyDistributionDao.getName(),
                eMonthlyDistributionDao.getCreation(),
                eMonthlyDistributionDao.getModified(),
                eMonthlyDistributionDao.getModifiedBy(),
                eMonthlyDistributionDao.getOwner(),
                eMonthlyDistributionDao.getIsDocStatus(),
                eMonthlyDistributionDao.getIdx(),
                eMonthlyDistributionDao.getDistributionId(),
                eMonthlyDistributionDao.getFiscalYear(),
                eMonthlyDistributionDao.getUserTags(),
                eMonthlyDistributionDao.getComments(),
                eMonthlyDistributionDao.getAssign(),
                eMonthlyDistributionDao.getLikedBy());
    }

    public static void fromDTO(MonthlyDistributionDto vMonthlyDistributionDto, MonthlyDistributionDao eMonthlyDistributionDao) {
        eMonthlyDistributionDao.setName(vMonthlyDistributionDto.name());
        eMonthlyDistributionDao.setCreation(vMonthlyDistributionDto.creation());
        eMonthlyDistributionDao.setModified(vMonthlyDistributionDto.modified());
        eMonthlyDistributionDao.setModifiedBy(vMonthlyDistributionDto.modifiedBy());
        eMonthlyDistributionDao.setOwner(vMonthlyDistributionDto.owner());
        eMonthlyDistributionDao.setIsDocStatus(vMonthlyDistributionDto.isDocStatus());
        eMonthlyDistributionDao.setIdx(vMonthlyDistributionDto.idx());
        eMonthlyDistributionDao.setDistributionId(vMonthlyDistributionDto.distributionId());
        eMonthlyDistributionDao.setFiscalYear(vMonthlyDistributionDto.fiscalYear());
        eMonthlyDistributionDao.setUserTags(vMonthlyDistributionDto.userTags());
        eMonthlyDistributionDao.setComments(vMonthlyDistributionDto.comments());
        eMonthlyDistributionDao.setAssign(vMonthlyDistributionDto.assign());
        eMonthlyDistributionDao.setLikedBy(vMonthlyDistributionDto.likedBy());
    }
}