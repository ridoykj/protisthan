package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesPartnerDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SalesPartnerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String partnerName,
        String partnerType,
        String territory,
        BigDecimal commissionRate,
        Boolean showInWebsite,
        String referralCode,
        String route,
        String logo,
        String partnerWebsite,
        String introduction,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SalesPartnerDto fromEntity(SalesPartnerDao eSalesPartnerDao) {
        return new SalesPartnerDto(
                eSalesPartnerDao.getName(),
                eSalesPartnerDao.getCreation(),
                eSalesPartnerDao.getModified(),
                eSalesPartnerDao.getModifiedBy(),
                eSalesPartnerDao.getOwner(),
                eSalesPartnerDao.getIsDocStatus(),
                eSalesPartnerDao.getIdx(),
                eSalesPartnerDao.getPartnerName(),
                eSalesPartnerDao.getPartnerType(),
                eSalesPartnerDao.getTerritory(),
                eSalesPartnerDao.getCommissionRate(),
                eSalesPartnerDao.getShowInWebsite(),
                eSalesPartnerDao.getReferralCode(),
                eSalesPartnerDao.getRoute(),
                eSalesPartnerDao.getLogo(),
                eSalesPartnerDao.getPartnerWebsite(),
                eSalesPartnerDao.getIntroduction(),
                eSalesPartnerDao.getDescription(),
                eSalesPartnerDao.getUserTags(),
                eSalesPartnerDao.getComments(),
                eSalesPartnerDao.getAssign(),
                eSalesPartnerDao.getLikedBy());
    }

    public static void fromDTO(SalesPartnerDto vSalesPartnerDto, SalesPartnerDao eSalesPartnerDao) {
        eSalesPartnerDao.setName(vSalesPartnerDto.name());
        eSalesPartnerDao.setCreation(vSalesPartnerDto.creation());
        eSalesPartnerDao.setModified(vSalesPartnerDto.modified());
        eSalesPartnerDao.setModifiedBy(vSalesPartnerDto.modifiedBy());
        eSalesPartnerDao.setOwner(vSalesPartnerDto.owner());
        eSalesPartnerDao.setIsDocStatus(vSalesPartnerDto.isDocStatus());
        eSalesPartnerDao.setIdx(vSalesPartnerDto.idx());
        eSalesPartnerDao.setPartnerName(vSalesPartnerDto.partnerName());
        eSalesPartnerDao.setPartnerType(vSalesPartnerDto.partnerType());
        eSalesPartnerDao.setTerritory(vSalesPartnerDto.territory());
        eSalesPartnerDao.setCommissionRate(vSalesPartnerDto.commissionRate());
        eSalesPartnerDao.setShowInWebsite(vSalesPartnerDto.showInWebsite());
        eSalesPartnerDao.setReferralCode(vSalesPartnerDto.referralCode());
        eSalesPartnerDao.setRoute(vSalesPartnerDto.route());
        eSalesPartnerDao.setLogo(vSalesPartnerDto.logo());
        eSalesPartnerDao.setPartnerWebsite(vSalesPartnerDto.partnerWebsite());
        eSalesPartnerDao.setIntroduction(vSalesPartnerDto.introduction());
        eSalesPartnerDao.setDescription(vSalesPartnerDto.description());
        eSalesPartnerDao.setUserTags(vSalesPartnerDto.userTags());
        eSalesPartnerDao.setComments(vSalesPartnerDto.comments());
        eSalesPartnerDao.setAssign(vSalesPartnerDto.assign());
        eSalesPartnerDao.setLikedBy(vSalesPartnerDto.likedBy());
    }
}