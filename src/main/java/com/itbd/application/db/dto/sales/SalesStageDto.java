package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesStageDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalesStageDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String stageName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SalesStageDto fromEntity(SalesStageDao eSalesStageDao) {
        return new SalesStageDto(
                eSalesStageDao.getName(),
                eSalesStageDao.getCreation(),
                eSalesStageDao.getModified(),
                eSalesStageDao.getModifiedBy(),
                eSalesStageDao.getOwner(),
                eSalesStageDao.getIsDocStatus(),
                eSalesStageDao.getIdx(),
                eSalesStageDao.getStageName(),
                eSalesStageDao.getUserTags(),
                eSalesStageDao.getComments(),
                eSalesStageDao.getAssign(),
                eSalesStageDao.getLikedBy());
    }

    public static void fromDTO(SalesStageDto vSalesStageDto, SalesStageDao eSalesStageDao) {
        eSalesStageDao.setName(vSalesStageDto.name());
        eSalesStageDao.setCreation(vSalesStageDto.creation());
        eSalesStageDao.setModified(vSalesStageDto.modified());
        eSalesStageDao.setModifiedBy(vSalesStageDto.modifiedBy());
        eSalesStageDao.setOwner(vSalesStageDto.owner());
        eSalesStageDao.setIsDocStatus(vSalesStageDto.isDocStatus());
        eSalesStageDao.setIdx(vSalesStageDto.idx());
        eSalesStageDao.setStageName(vSalesStageDto.stageName());
        eSalesStageDao.setUserTags(vSalesStageDto.userTags());
        eSalesStageDao.setComments(vSalesStageDto.comments());
        eSalesStageDao.setAssign(vSalesStageDto.assign());
        eSalesStageDao.setLikedBy(vSalesStageDto.likedBy());
    }
}