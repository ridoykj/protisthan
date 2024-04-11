package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierScorecardScoringVariableDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SupplierScorecardScoringVariableDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String variableLabel,
        String description,
        BigDecimal value,
        String paramName,
        String path,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierScorecardScoringVariableDto fromEntity(SupplierScorecardScoringVariableDao eSupplierScorecardScoringVariableDao) {
        return new SupplierScorecardScoringVariableDto(
                eSupplierScorecardScoringVariableDao.getName(),
                eSupplierScorecardScoringVariableDao.getCreation(),
                eSupplierScorecardScoringVariableDao.getModified(),
                eSupplierScorecardScoringVariableDao.getModifiedBy(),
                eSupplierScorecardScoringVariableDao.getOwner(),
                eSupplierScorecardScoringVariableDao.getIsDocStatus(),
                eSupplierScorecardScoringVariableDao.getIdx(),
                eSupplierScorecardScoringVariableDao.getVariableLabel(),
                eSupplierScorecardScoringVariableDao.getDescription(),
                eSupplierScorecardScoringVariableDao.getValue(),
                eSupplierScorecardScoringVariableDao.getParamName(),
                eSupplierScorecardScoringVariableDao.getPath(),
                eSupplierScorecardScoringVariableDao.getParent(),
                eSupplierScorecardScoringVariableDao.getParentField(),
                eSupplierScorecardScoringVariableDao.getParentType());
    }

    public static void fromDTO(SupplierScorecardScoringVariableDto vSupplierScorecardScoringVariableDto, SupplierScorecardScoringVariableDao eSupplierScorecardScoringVariableDao) {
        eSupplierScorecardScoringVariableDao.setName(vSupplierScorecardScoringVariableDto.name());
        eSupplierScorecardScoringVariableDao.setCreation(vSupplierScorecardScoringVariableDto.creation());
        eSupplierScorecardScoringVariableDao.setModified(vSupplierScorecardScoringVariableDto.modified());
        eSupplierScorecardScoringVariableDao.setModifiedBy(vSupplierScorecardScoringVariableDto.modifiedBy());
        eSupplierScorecardScoringVariableDao.setOwner(vSupplierScorecardScoringVariableDto.owner());
        eSupplierScorecardScoringVariableDao.setIsDocStatus(vSupplierScorecardScoringVariableDto.isDocStatus());
        eSupplierScorecardScoringVariableDao.setIdx(vSupplierScorecardScoringVariableDto.idx());
        eSupplierScorecardScoringVariableDao.setVariableLabel(vSupplierScorecardScoringVariableDto.variableLabel());
        eSupplierScorecardScoringVariableDao.setDescription(vSupplierScorecardScoringVariableDto.description());
        eSupplierScorecardScoringVariableDao.setValue(vSupplierScorecardScoringVariableDto.value());
        eSupplierScorecardScoringVariableDao.setParamName(vSupplierScorecardScoringVariableDto.paramName());
        eSupplierScorecardScoringVariableDao.setPath(vSupplierScorecardScoringVariableDto.path());
        eSupplierScorecardScoringVariableDao.setParent(vSupplierScorecardScoringVariableDto.parent());
        eSupplierScorecardScoringVariableDao.setParentField(vSupplierScorecardScoringVariableDto.parentField());
        eSupplierScorecardScoringVariableDao.setParentType(vSupplierScorecardScoringVariableDto.parentType());
    }
}