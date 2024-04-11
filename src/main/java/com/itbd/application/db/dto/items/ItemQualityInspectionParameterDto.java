package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemQualityInspectionParameterDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ItemQualityInspectionParameterDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String specification,
        String parameterGroup,
        String value,
        Boolean numeric,
        BigDecimal minValue,
        BigDecimal maxValue,
        Boolean formulaBasedCriteria,
        String acceptanceFormula,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemQualityInspectionParameterDto fromEntity(ItemQualityInspectionParameterDao eItemQualityInspectionParameterDao) {
        return new ItemQualityInspectionParameterDto(
                eItemQualityInspectionParameterDao.getName(),
                eItemQualityInspectionParameterDao.getCreation(),
                eItemQualityInspectionParameterDao.getModified(),
                eItemQualityInspectionParameterDao.getModifiedBy(),
                eItemQualityInspectionParameterDao.getOwner(),
                eItemQualityInspectionParameterDao.getIsDocStatus(),
                eItemQualityInspectionParameterDao.getIdx(),
                eItemQualityInspectionParameterDao.getSpecification(),
                eItemQualityInspectionParameterDao.getParameterGroup(),
                eItemQualityInspectionParameterDao.getValue(),
                eItemQualityInspectionParameterDao.getNumeric(),
                eItemQualityInspectionParameterDao.getMinValue(),
                eItemQualityInspectionParameterDao.getMaxValue(),
                eItemQualityInspectionParameterDao.getFormulaBasedCriteria(),
                eItemQualityInspectionParameterDao.getAcceptanceFormula(),
                eItemQualityInspectionParameterDao.getParent(),
                eItemQualityInspectionParameterDao.getParentField(),
                eItemQualityInspectionParameterDao.getParentType());
    }

    public static void fromDTO(ItemQualityInspectionParameterDto vItemQualityInspectionParameterDto, ItemQualityInspectionParameterDao eItemQualityInspectionParameterDao) {
        eItemQualityInspectionParameterDao.setName(vItemQualityInspectionParameterDto.name());
        eItemQualityInspectionParameterDao.setCreation(vItemQualityInspectionParameterDto.creation());
        eItemQualityInspectionParameterDao.setModified(vItemQualityInspectionParameterDto.modified());
        eItemQualityInspectionParameterDao.setModifiedBy(vItemQualityInspectionParameterDto.modifiedBy());
        eItemQualityInspectionParameterDao.setOwner(vItemQualityInspectionParameterDto.owner());
        eItemQualityInspectionParameterDao.setIsDocStatus(vItemQualityInspectionParameterDto.isDocStatus());
        eItemQualityInspectionParameterDao.setIdx(vItemQualityInspectionParameterDto.idx());
        eItemQualityInspectionParameterDao.setSpecification(vItemQualityInspectionParameterDto.specification());
        eItemQualityInspectionParameterDao.setParameterGroup(vItemQualityInspectionParameterDto.parameterGroup());
        eItemQualityInspectionParameterDao.setValue(vItemQualityInspectionParameterDto.value());
        eItemQualityInspectionParameterDao.setNumeric(vItemQualityInspectionParameterDto.numeric());
        eItemQualityInspectionParameterDao.setMinValue(vItemQualityInspectionParameterDto.minValue());
        eItemQualityInspectionParameterDao.setMaxValue(vItemQualityInspectionParameterDto.maxValue());
        eItemQualityInspectionParameterDao.setFormulaBasedCriteria(vItemQualityInspectionParameterDto.formulaBasedCriteria());
        eItemQualityInspectionParameterDao.setAcceptanceFormula(vItemQualityInspectionParameterDto.acceptanceFormula());
        eItemQualityInspectionParameterDao.setParent(vItemQualityInspectionParameterDto.parent());
        eItemQualityInspectionParameterDao.setParentField(vItemQualityInspectionParameterDto.parentField());
        eItemQualityInspectionParameterDao.setParentType(vItemQualityInspectionParameterDto.parentType());
    }
}