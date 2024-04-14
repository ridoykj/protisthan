package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesPartnerTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalesPartnerTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesPartnerType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SalesPartnerTypeDto fromEntity(SalesPartnerTypeDao eSalesPartnerTypeDao) {
        return new SalesPartnerTypeDto(
                eSalesPartnerTypeDao.getName(),
                eSalesPartnerTypeDao.getCreation(),
                eSalesPartnerTypeDao.getModified(),
                eSalesPartnerTypeDao.getModifiedBy(),
                eSalesPartnerTypeDao.getOwner(),
                eSalesPartnerTypeDao.getIsDocStatus(),
                eSalesPartnerTypeDao.getIdx(),
                eSalesPartnerTypeDao.getSalesPartnerType(),
                eSalesPartnerTypeDao.getUserTags(),
                eSalesPartnerTypeDao.getComments(),
                eSalesPartnerTypeDao.getAssign(),
                eSalesPartnerTypeDao.getLikedBy());
    }

    public static void fromDTO(SalesPartnerTypeDto vSalesPartnerTypeDto, SalesPartnerTypeDao eSalesPartnerTypeDao) {
        eSalesPartnerTypeDao.setName(vSalesPartnerTypeDto.name());
        eSalesPartnerTypeDao.setCreation(vSalesPartnerTypeDto.creation());
        eSalesPartnerTypeDao.setModified(vSalesPartnerTypeDto.modified());
        eSalesPartnerTypeDao.setModifiedBy(vSalesPartnerTypeDto.modifiedBy());
        eSalesPartnerTypeDao.setOwner(vSalesPartnerTypeDto.owner());
        eSalesPartnerTypeDao.setIsDocStatus(vSalesPartnerTypeDto.isDocStatus());
        eSalesPartnerTypeDao.setIdx(vSalesPartnerTypeDto.idx());
        eSalesPartnerTypeDao.setSalesPartnerType(vSalesPartnerTypeDto.salesPartnerType());
        eSalesPartnerTypeDao.setUserTags(vSalesPartnerTypeDto.userTags());
        eSalesPartnerTypeDao.setComments(vSalesPartnerTypeDto.comments());
        eSalesPartnerTypeDao.setAssign(vSalesPartnerTypeDto.assign());
        eSalesPartnerTypeDao.setLikedBy(vSalesPartnerTypeDto.likedBy());
    }
}