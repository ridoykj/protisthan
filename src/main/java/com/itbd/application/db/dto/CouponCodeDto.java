package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CouponCodeDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CouponCodeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String couponName,
        String couponType,
        String customer,
        String couponCode,
        String pricingRule,
        LocalDate validFrom,
        LocalDate validUpto,
        Integer maximumUse,
        Integer used,
        String description,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CouponCodeDto fromEntity(CouponCodeDao eCouponCodeDao) {
        return new CouponCodeDto(
                eCouponCodeDao.getName(),
                eCouponCodeDao.getCreation(),
                eCouponCodeDao.getModified(),
                eCouponCodeDao.getModifiedBy(),
                eCouponCodeDao.getOwner(),
                eCouponCodeDao.getIsDocStatus(),
                eCouponCodeDao.getIdx(),
                eCouponCodeDao.getCouponName(),
                eCouponCodeDao.getCouponType(),
                eCouponCodeDao.getCustomer(),
                eCouponCodeDao.getCouponCode(),
                eCouponCodeDao.getPricingRule(),
                eCouponCodeDao.getValidFrom(),
                eCouponCodeDao.getValidUpto(),
                eCouponCodeDao.getMaximumUse(),
                eCouponCodeDao.getUsed(),
                eCouponCodeDao.getDescription(),
                eCouponCodeDao.getAmendedFrom(),
                eCouponCodeDao.getUserTags(),
                eCouponCodeDao.getComments(),
                eCouponCodeDao.getAssign(),
                eCouponCodeDao.getLikedBy());
    }

    public static void fromDTO(CouponCodeDto vCouponCodeDto, CouponCodeDao eCouponCodeDao) {
        eCouponCodeDao.setName(vCouponCodeDto.name());
        eCouponCodeDao.setCreation(vCouponCodeDto.creation());
        eCouponCodeDao.setModified(vCouponCodeDto.modified());
        eCouponCodeDao.setModifiedBy(vCouponCodeDto.modifiedBy());
        eCouponCodeDao.setOwner(vCouponCodeDto.owner());
        eCouponCodeDao.setIsDocStatus(vCouponCodeDto.isDocStatus());
        eCouponCodeDao.setIdx(vCouponCodeDto.idx());
        eCouponCodeDao.setCouponName(vCouponCodeDto.couponName());
        eCouponCodeDao.setCouponType(vCouponCodeDto.couponType());
        eCouponCodeDao.setCustomer(vCouponCodeDto.customer());
        eCouponCodeDao.setCouponCode(vCouponCodeDto.couponCode());
        eCouponCodeDao.setPricingRule(vCouponCodeDto.pricingRule());
        eCouponCodeDao.setValidFrom(vCouponCodeDto.validFrom());
        eCouponCodeDao.setValidUpto(vCouponCodeDto.validUpto());
        eCouponCodeDao.setMaximumUse(vCouponCodeDto.maximumUse());
        eCouponCodeDao.setUsed(vCouponCodeDto.used());
        eCouponCodeDao.setDescription(vCouponCodeDto.description());
        eCouponCodeDao.setAmendedFrom(vCouponCodeDto.amendedFrom());
        eCouponCodeDao.setUserTags(vCouponCodeDto.userTags());
        eCouponCodeDao.setComments(vCouponCodeDto.comments());
        eCouponCodeDao.setAssign(vCouponCodeDto.assign());
        eCouponCodeDao.setLikedBy(vCouponCodeDto.likedBy());
    }
}