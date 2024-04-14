package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierScorecardScoringCriteriaDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SupplierScorecardScoringCriteriaDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String criteriaName,
        BigDecimal score,
        BigDecimal weight,
        BigDecimal maxScore,
        String formula,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierScorecardScoringCriteriaDto fromEntity(SupplierScorecardScoringCriteriaDao eSupplierScorecardScoringCriteriaDao) {
        return new SupplierScorecardScoringCriteriaDto(
                eSupplierScorecardScoringCriteriaDao.getName(),
                eSupplierScorecardScoringCriteriaDao.getCreation(),
                eSupplierScorecardScoringCriteriaDao.getModified(),
                eSupplierScorecardScoringCriteriaDao.getModifiedBy(),
                eSupplierScorecardScoringCriteriaDao.getOwner(),
                eSupplierScorecardScoringCriteriaDao.getIsDocStatus(),
                eSupplierScorecardScoringCriteriaDao.getIdx(),
                eSupplierScorecardScoringCriteriaDao.getCriteriaName(),
                eSupplierScorecardScoringCriteriaDao.getScore(),
                eSupplierScorecardScoringCriteriaDao.getWeight(),
                eSupplierScorecardScoringCriteriaDao.getMaxScore(),
                eSupplierScorecardScoringCriteriaDao.getFormula(),
                eSupplierScorecardScoringCriteriaDao.getParent(),
                eSupplierScorecardScoringCriteriaDao.getParentField(),
                eSupplierScorecardScoringCriteriaDao.getParentType());
    }

    public static void fromDTO(SupplierScorecardScoringCriteriaDto vSupplierScorecardScoringCriteriaDto, SupplierScorecardScoringCriteriaDao eSupplierScorecardScoringCriteriaDao) {
        eSupplierScorecardScoringCriteriaDao.setName(vSupplierScorecardScoringCriteriaDto.name());
        eSupplierScorecardScoringCriteriaDao.setCreation(vSupplierScorecardScoringCriteriaDto.creation());
        eSupplierScorecardScoringCriteriaDao.setModified(vSupplierScorecardScoringCriteriaDto.modified());
        eSupplierScorecardScoringCriteriaDao.setModifiedBy(vSupplierScorecardScoringCriteriaDto.modifiedBy());
        eSupplierScorecardScoringCriteriaDao.setOwner(vSupplierScorecardScoringCriteriaDto.owner());
        eSupplierScorecardScoringCriteriaDao.setIsDocStatus(vSupplierScorecardScoringCriteriaDto.isDocStatus());
        eSupplierScorecardScoringCriteriaDao.setIdx(vSupplierScorecardScoringCriteriaDto.idx());
        eSupplierScorecardScoringCriteriaDao.setCriteriaName(vSupplierScorecardScoringCriteriaDto.criteriaName());
        eSupplierScorecardScoringCriteriaDao.setScore(vSupplierScorecardScoringCriteriaDto.score());
        eSupplierScorecardScoringCriteriaDao.setWeight(vSupplierScorecardScoringCriteriaDto.weight());
        eSupplierScorecardScoringCriteriaDao.setMaxScore(vSupplierScorecardScoringCriteriaDto.maxScore());
        eSupplierScorecardScoringCriteriaDao.setFormula(vSupplierScorecardScoringCriteriaDto.formula());
        eSupplierScorecardScoringCriteriaDao.setParent(vSupplierScorecardScoringCriteriaDto.parent());
        eSupplierScorecardScoringCriteriaDao.setParentField(vSupplierScorecardScoringCriteriaDto.parentField());
        eSupplierScorecardScoringCriteriaDao.setParentType(vSupplierScorecardScoringCriteriaDto.parentType());
    }
}