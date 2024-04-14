package com.itbd.application.db.dto;

import com.itbd.application.db.dao.MonthlyDistributionPercentageDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record MonthlyDistributionPercentageDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String month,
        BigDecimal percentageAllocation,
        String parent,
        String parentField,
        String parentType
) {
    public static MonthlyDistributionPercentageDto fromEntity(MonthlyDistributionPercentageDao eMonthlyDistributionPercentageDao) {
        return new MonthlyDistributionPercentageDto(
                eMonthlyDistributionPercentageDao.getName(),
                eMonthlyDistributionPercentageDao.getCreation(),
                eMonthlyDistributionPercentageDao.getModified(),
                eMonthlyDistributionPercentageDao.getModifiedBy(),
                eMonthlyDistributionPercentageDao.getOwner(),
                eMonthlyDistributionPercentageDao.getIsDocStatus(),
                eMonthlyDistributionPercentageDao.getIdx(),
                eMonthlyDistributionPercentageDao.getMonth(),
                eMonthlyDistributionPercentageDao.getPercentageAllocation(),
                eMonthlyDistributionPercentageDao.getParent(),
                eMonthlyDistributionPercentageDao.getParentField(),
                eMonthlyDistributionPercentageDao.getParentType());
    }

    public static void fromDTO(MonthlyDistributionPercentageDto vMonthlyDistributionPercentageDto, MonthlyDistributionPercentageDao eMonthlyDistributionPercentageDao) {
        eMonthlyDistributionPercentageDao.setName(vMonthlyDistributionPercentageDto.name());
        eMonthlyDistributionPercentageDao.setCreation(vMonthlyDistributionPercentageDto.creation());
        eMonthlyDistributionPercentageDao.setModified(vMonthlyDistributionPercentageDto.modified());
        eMonthlyDistributionPercentageDao.setModifiedBy(vMonthlyDistributionPercentageDto.modifiedBy());
        eMonthlyDistributionPercentageDao.setOwner(vMonthlyDistributionPercentageDto.owner());
        eMonthlyDistributionPercentageDao.setIsDocStatus(vMonthlyDistributionPercentageDto.isDocStatus());
        eMonthlyDistributionPercentageDao.setIdx(vMonthlyDistributionPercentageDto.idx());
        eMonthlyDistributionPercentageDao.setMonth(vMonthlyDistributionPercentageDto.month());
        eMonthlyDistributionPercentageDao.setPercentageAllocation(vMonthlyDistributionPercentageDto.percentageAllocation());
        eMonthlyDistributionPercentageDao.setParent(vMonthlyDistributionPercentageDto.parent());
        eMonthlyDistributionPercentageDao.setParentField(vMonthlyDistributionPercentageDto.parentField());
        eMonthlyDistributionPercentageDao.setParentType(vMonthlyDistributionPercentageDto.parentType());
    }
}