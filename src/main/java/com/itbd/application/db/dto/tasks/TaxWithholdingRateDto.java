package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaxWithholdingRateDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record TaxWithholdingRateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate fromDate,
        LocalDate toDate,
        BigDecimal taxWithholdingRate,
        BigDecimal singleThreshold,
        BigDecimal cumulativeThreshold,
        String parent,
        String parentField,
        String parentType
) {
    public static TaxWithholdingRateDto fromEntity(TaxWithholdingRateDao eTaxWithholdingRateDao) {
        return new TaxWithholdingRateDto(
                eTaxWithholdingRateDao.getName(),
                eTaxWithholdingRateDao.getCreation(),
                eTaxWithholdingRateDao.getModified(),
                eTaxWithholdingRateDao.getModifiedBy(),
                eTaxWithholdingRateDao.getOwner(),
                eTaxWithholdingRateDao.getIsDocStatus(),
                eTaxWithholdingRateDao.getIdx(),
                eTaxWithholdingRateDao.getFromDate(),
                eTaxWithholdingRateDao.getToDate(),
                eTaxWithholdingRateDao.getTaxWithholdingRate(),
                eTaxWithholdingRateDao.getSingleThreshold(),
                eTaxWithholdingRateDao.getCumulativeThreshold(),
                eTaxWithholdingRateDao.getParent(),
                eTaxWithholdingRateDao.getParentField(),
                eTaxWithholdingRateDao.getParentType());
    }

    public static void fromDTO(TaxWithholdingRateDto vTaxWithholdingRateDto, TaxWithholdingRateDao eTaxWithholdingRateDao) {
        eTaxWithholdingRateDao.setName(vTaxWithholdingRateDto.name());
        eTaxWithholdingRateDao.setCreation(vTaxWithholdingRateDto.creation());
        eTaxWithholdingRateDao.setModified(vTaxWithholdingRateDto.modified());
        eTaxWithholdingRateDao.setModifiedBy(vTaxWithholdingRateDto.modifiedBy());
        eTaxWithholdingRateDao.setOwner(vTaxWithholdingRateDto.owner());
        eTaxWithholdingRateDao.setIsDocStatus(vTaxWithholdingRateDto.isDocStatus());
        eTaxWithholdingRateDao.setIdx(vTaxWithholdingRateDto.idx());
        eTaxWithholdingRateDao.setFromDate(vTaxWithholdingRateDto.fromDate());
        eTaxWithholdingRateDao.setToDate(vTaxWithholdingRateDto.toDate());
        eTaxWithholdingRateDao.setTaxWithholdingRate(vTaxWithholdingRateDto.taxWithholdingRate());
        eTaxWithholdingRateDao.setSingleThreshold(vTaxWithholdingRateDto.singleThreshold());
        eTaxWithholdingRateDao.setCumulativeThreshold(vTaxWithholdingRateDto.cumulativeThreshold());
        eTaxWithholdingRateDao.setParent(vTaxWithholdingRateDto.parent());
        eTaxWithholdingRateDao.setParentField(vTaxWithholdingRateDto.parentField());
        eTaxWithholdingRateDao.setParentType(vTaxWithholdingRateDto.parentType());
    }
}