package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DunningTypeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DunningTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dunningType,
        Boolean isDefault,
        String company,
        BigDecimal dunningFee,
        BigDecimal rateOfInterest,
        String incomeAccount,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DunningTypeDto fromEntity(DunningTypeDao eDunningTypeDao) {
        return new DunningTypeDto(
                eDunningTypeDao.getName(),
                eDunningTypeDao.getCreation(),
                eDunningTypeDao.getModified(),
                eDunningTypeDao.getModifiedBy(),
                eDunningTypeDao.getOwner(),
                eDunningTypeDao.getIsDocStatus(),
                eDunningTypeDao.getIdx(),
                eDunningTypeDao.getDunningType(),
                eDunningTypeDao.getIsDefault(),
                eDunningTypeDao.getCompany(),
                eDunningTypeDao.getDunningFee(),
                eDunningTypeDao.getRateOfInterest(),
                eDunningTypeDao.getIncomeAccount(),
                eDunningTypeDao.getCostCenter(),
                eDunningTypeDao.getUserTags(),
                eDunningTypeDao.getComments(),
                eDunningTypeDao.getAssign(),
                eDunningTypeDao.getLikedBy());
    }

    public static void fromDTO(DunningTypeDto vDunningTypeDto, DunningTypeDao eDunningTypeDao) {
        eDunningTypeDao.setName(vDunningTypeDto.name());
        eDunningTypeDao.setCreation(vDunningTypeDto.creation());
        eDunningTypeDao.setModified(vDunningTypeDto.modified());
        eDunningTypeDao.setModifiedBy(vDunningTypeDto.modifiedBy());
        eDunningTypeDao.setOwner(vDunningTypeDto.owner());
        eDunningTypeDao.setIsDocStatus(vDunningTypeDto.isDocStatus());
        eDunningTypeDao.setIdx(vDunningTypeDto.idx());
        eDunningTypeDao.setDunningType(vDunningTypeDto.dunningType());
        eDunningTypeDao.setIsDefault(vDunningTypeDto.isDefault());
        eDunningTypeDao.setCompany(vDunningTypeDto.company());
        eDunningTypeDao.setDunningFee(vDunningTypeDto.dunningFee());
        eDunningTypeDao.setRateOfInterest(vDunningTypeDto.rateOfInterest());
        eDunningTypeDao.setIncomeAccount(vDunningTypeDto.incomeAccount());
        eDunningTypeDao.setCostCenter(vDunningTypeDto.costCenter());
        eDunningTypeDao.setUserTags(vDunningTypeDto.userTags());
        eDunningTypeDao.setComments(vDunningTypeDto.comments());
        eDunningTypeDao.setAssign(vDunningTypeDto.assign());
        eDunningTypeDao.setLikedBy(vDunningTypeDto.likedBy());
    }
}