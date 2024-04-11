package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierScorecardCriteriaDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SupplierScorecardCriteriaDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String criteriaName,
        BigDecimal maxScore,
        String formula,
        BigDecimal weight,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierScorecardCriteriaDto fromEntity(SupplierScorecardCriteriaDao eSupplierScorecardCriteriaDao) {
        return new SupplierScorecardCriteriaDto(
                eSupplierScorecardCriteriaDao.getName(),
                eSupplierScorecardCriteriaDao.getCreation(),
                eSupplierScorecardCriteriaDao.getModified(),
                eSupplierScorecardCriteriaDao.getModifiedBy(),
                eSupplierScorecardCriteriaDao.getOwner(),
                eSupplierScorecardCriteriaDao.getIsDocStatus(),
                eSupplierScorecardCriteriaDao.getIdx(),
                eSupplierScorecardCriteriaDao.getCriteriaName(),
                eSupplierScorecardCriteriaDao.getMaxScore(),
                eSupplierScorecardCriteriaDao.getFormula(),
                eSupplierScorecardCriteriaDao.getWeight(),
                eSupplierScorecardCriteriaDao.getUserTags(),
                eSupplierScorecardCriteriaDao.getComments(),
                eSupplierScorecardCriteriaDao.getAssign(),
                eSupplierScorecardCriteriaDao.getLikedBy());
    }

    public static void fromDTO(SupplierScorecardCriteriaDto vSupplierScorecardCriteriaDto, SupplierScorecardCriteriaDao eSupplierScorecardCriteriaDao) {
        eSupplierScorecardCriteriaDao.setName(vSupplierScorecardCriteriaDto.name());
        eSupplierScorecardCriteriaDao.setCreation(vSupplierScorecardCriteriaDto.creation());
        eSupplierScorecardCriteriaDao.setModified(vSupplierScorecardCriteriaDto.modified());
        eSupplierScorecardCriteriaDao.setModifiedBy(vSupplierScorecardCriteriaDto.modifiedBy());
        eSupplierScorecardCriteriaDao.setOwner(vSupplierScorecardCriteriaDto.owner());
        eSupplierScorecardCriteriaDao.setIsDocStatus(vSupplierScorecardCriteriaDto.isDocStatus());
        eSupplierScorecardCriteriaDao.setIdx(vSupplierScorecardCriteriaDto.idx());
        eSupplierScorecardCriteriaDao.setCriteriaName(vSupplierScorecardCriteriaDto.criteriaName());
        eSupplierScorecardCriteriaDao.setMaxScore(vSupplierScorecardCriteriaDto.maxScore());
        eSupplierScorecardCriteriaDao.setFormula(vSupplierScorecardCriteriaDto.formula());
        eSupplierScorecardCriteriaDao.setWeight(vSupplierScorecardCriteriaDto.weight());
        eSupplierScorecardCriteriaDao.setUserTags(vSupplierScorecardCriteriaDto.userTags());
        eSupplierScorecardCriteriaDao.setComments(vSupplierScorecardCriteriaDto.comments());
        eSupplierScorecardCriteriaDao.setAssign(vSupplierScorecardCriteriaDto.assign());
        eSupplierScorecardCriteriaDao.setLikedBy(vSupplierScorecardCriteriaDto.likedBy());
    }
}