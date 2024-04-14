package com.itbd.application.db.dto.landedcost;

import com.itbd.application.db.dao.landedcost.LandedCostVoucherDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LandedCostVoucherDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        LocalDate postingDate,
        BigDecimal totalTaxesAndCharges,
        String distributeChargesBasedOn,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LandedCostVoucherDto fromEntity(LandedCostVoucherDao eLandedCostVoucherDao) {
        return new LandedCostVoucherDto(
                eLandedCostVoucherDao.getName(),
                eLandedCostVoucherDao.getCreation(),
                eLandedCostVoucherDao.getModified(),
                eLandedCostVoucherDao.getModifiedBy(),
                eLandedCostVoucherDao.getOwner(),
                eLandedCostVoucherDao.getIsDocStatus(),
                eLandedCostVoucherDao.getIdx(),
                eLandedCostVoucherDao.getNamingSeries(),
                eLandedCostVoucherDao.getCompany(),
                eLandedCostVoucherDao.getPostingDate(),
                eLandedCostVoucherDao.getTotalTaxesAndCharges(),
                eLandedCostVoucherDao.getDistributeChargesBasedOn(),
                eLandedCostVoucherDao.getAmendedFrom(),
                eLandedCostVoucherDao.getUserTags(),
                eLandedCostVoucherDao.getComments(),
                eLandedCostVoucherDao.getAssign(),
                eLandedCostVoucherDao.getLikedBy());
    }

    public static void fromDTO(LandedCostVoucherDto vLandedCostVoucherDto, LandedCostVoucherDao eLandedCostVoucherDao) {
        eLandedCostVoucherDao.setName(vLandedCostVoucherDto.name());
        eLandedCostVoucherDao.setCreation(vLandedCostVoucherDto.creation());
        eLandedCostVoucherDao.setModified(vLandedCostVoucherDto.modified());
        eLandedCostVoucherDao.setModifiedBy(vLandedCostVoucherDto.modifiedBy());
        eLandedCostVoucherDao.setOwner(vLandedCostVoucherDto.owner());
        eLandedCostVoucherDao.setIsDocStatus(vLandedCostVoucherDto.isDocStatus());
        eLandedCostVoucherDao.setIdx(vLandedCostVoucherDto.idx());
        eLandedCostVoucherDao.setNamingSeries(vLandedCostVoucherDto.namingSeries());
        eLandedCostVoucherDao.setCompany(vLandedCostVoucherDto.company());
        eLandedCostVoucherDao.setPostingDate(vLandedCostVoucherDto.postingDate());
        eLandedCostVoucherDao.setTotalTaxesAndCharges(vLandedCostVoucherDto.totalTaxesAndCharges());
        eLandedCostVoucherDao.setDistributeChargesBasedOn(vLandedCostVoucherDto.distributeChargesBasedOn());
        eLandedCostVoucherDao.setAmendedFrom(vLandedCostVoucherDto.amendedFrom());
        eLandedCostVoucherDao.setUserTags(vLandedCostVoucherDto.userTags());
        eLandedCostVoucherDao.setComments(vLandedCostVoucherDto.comments());
        eLandedCostVoucherDao.setAssign(vLandedCostVoucherDto.assign());
        eLandedCostVoucherDao.setLikedBy(vLandedCostVoucherDto.likedBy());
    }
}