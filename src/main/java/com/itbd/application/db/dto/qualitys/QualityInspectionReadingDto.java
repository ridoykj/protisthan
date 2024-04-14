package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityInspectionReadingDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record QualityInspectionReadingDto(
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
        String status,
        String value,
        Boolean numeric,
        Boolean manualInspection,
        BigDecimal minValue,
        BigDecimal maxValue,
        Boolean formulaBasedCriteria,
        String acceptanceFormula,
        String readingValue,
        String reading1,
        String reading2,
        String reading3,
        String reading4,
        String reading5,
        String reading6,
        String reading7,
        String reading8,
        String reading9,
        String reading10,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityInspectionReadingDto fromEntity(QualityInspectionReadingDao eQualityInspectionReadingDao) {
        return new QualityInspectionReadingDto(
                eQualityInspectionReadingDao.getName(),
                eQualityInspectionReadingDao.getCreation(),
                eQualityInspectionReadingDao.getModified(),
                eQualityInspectionReadingDao.getModifiedBy(),
                eQualityInspectionReadingDao.getOwner(),
                eQualityInspectionReadingDao.getIsDocStatus(),
                eQualityInspectionReadingDao.getIdx(),
                eQualityInspectionReadingDao.getSpecification(),
                eQualityInspectionReadingDao.getParameterGroup(),
                eQualityInspectionReadingDao.getStatus(),
                eQualityInspectionReadingDao.getValue(),
                eQualityInspectionReadingDao.getNumeric(),
                eQualityInspectionReadingDao.getManualInspection(),
                eQualityInspectionReadingDao.getMinValue(),
                eQualityInspectionReadingDao.getMaxValue(),
                eQualityInspectionReadingDao.getFormulaBasedCriteria(),
                eQualityInspectionReadingDao.getAcceptanceFormula(),
                eQualityInspectionReadingDao.getReadingValue(),
                eQualityInspectionReadingDao.getReading1(),
                eQualityInspectionReadingDao.getReading2(),
                eQualityInspectionReadingDao.getReading3(),
                eQualityInspectionReadingDao.getReading4(),
                eQualityInspectionReadingDao.getReading5(),
                eQualityInspectionReadingDao.getReading6(),
                eQualityInspectionReadingDao.getReading7(),
                eQualityInspectionReadingDao.getReading8(),
                eQualityInspectionReadingDao.getReading9(),
                eQualityInspectionReadingDao.getReading10(),
                eQualityInspectionReadingDao.getParent(),
                eQualityInspectionReadingDao.getParentField(),
                eQualityInspectionReadingDao.getParentType());
    }

    public static void fromDTO(QualityInspectionReadingDto vQualityInspectionReadingDto, QualityInspectionReadingDao eQualityInspectionReadingDao) {
        eQualityInspectionReadingDao.setName(vQualityInspectionReadingDto.name());
        eQualityInspectionReadingDao.setCreation(vQualityInspectionReadingDto.creation());
        eQualityInspectionReadingDao.setModified(vQualityInspectionReadingDto.modified());
        eQualityInspectionReadingDao.setModifiedBy(vQualityInspectionReadingDto.modifiedBy());
        eQualityInspectionReadingDao.setOwner(vQualityInspectionReadingDto.owner());
        eQualityInspectionReadingDao.setIsDocStatus(vQualityInspectionReadingDto.isDocStatus());
        eQualityInspectionReadingDao.setIdx(vQualityInspectionReadingDto.idx());
        eQualityInspectionReadingDao.setSpecification(vQualityInspectionReadingDto.specification());
        eQualityInspectionReadingDao.setParameterGroup(vQualityInspectionReadingDto.parameterGroup());
        eQualityInspectionReadingDao.setStatus(vQualityInspectionReadingDto.status());
        eQualityInspectionReadingDao.setValue(vQualityInspectionReadingDto.value());
        eQualityInspectionReadingDao.setNumeric(vQualityInspectionReadingDto.numeric());
        eQualityInspectionReadingDao.setManualInspection(vQualityInspectionReadingDto.manualInspection());
        eQualityInspectionReadingDao.setMinValue(vQualityInspectionReadingDto.minValue());
        eQualityInspectionReadingDao.setMaxValue(vQualityInspectionReadingDto.maxValue());
        eQualityInspectionReadingDao.setFormulaBasedCriteria(vQualityInspectionReadingDto.formulaBasedCriteria());
        eQualityInspectionReadingDao.setAcceptanceFormula(vQualityInspectionReadingDto.acceptanceFormula());
        eQualityInspectionReadingDao.setReadingValue(vQualityInspectionReadingDto.readingValue());
        eQualityInspectionReadingDao.setReading1(vQualityInspectionReadingDto.reading1());
        eQualityInspectionReadingDao.setReading2(vQualityInspectionReadingDto.reading2());
        eQualityInspectionReadingDao.setReading3(vQualityInspectionReadingDto.reading3());
        eQualityInspectionReadingDao.setReading4(vQualityInspectionReadingDto.reading4());
        eQualityInspectionReadingDao.setReading5(vQualityInspectionReadingDto.reading5());
        eQualityInspectionReadingDao.setReading6(vQualityInspectionReadingDto.reading6());
        eQualityInspectionReadingDao.setReading7(vQualityInspectionReadingDto.reading7());
        eQualityInspectionReadingDao.setReading8(vQualityInspectionReadingDto.reading8());
        eQualityInspectionReadingDao.setReading9(vQualityInspectionReadingDto.reading9());
        eQualityInspectionReadingDao.setReading10(vQualityInspectionReadingDto.reading10());
        eQualityInspectionReadingDao.setParent(vQualityInspectionReadingDto.parent());
        eQualityInspectionReadingDao.setParentField(vQualityInspectionReadingDto.parentField());
        eQualityInspectionReadingDao.setParentType(vQualityInspectionReadingDto.parentType());
    }
}