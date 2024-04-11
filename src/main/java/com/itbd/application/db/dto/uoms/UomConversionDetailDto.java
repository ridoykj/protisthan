package com.itbd.application.db.dto.uoms;

import com.itbd.application.db.dao.uoms.UomConversionDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record UomConversionDetailDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String uom,
        BigDecimal conversionFactor,
        String parent,
        String parentField,
        String parentType
) {
    public static UomConversionDetailDto fromEntity(UomConversionDetailDao eUomConversionDetailDao) {
        return new UomConversionDetailDto(
                eUomConversionDetailDao.getName(),
                eUomConversionDetailDao.getCreation(),
                eUomConversionDetailDao.getModified(),
                eUomConversionDetailDao.getModifiedBy(),
                eUomConversionDetailDao.getOwner(),
                eUomConversionDetailDao.getIsDocStatus(),
                eUomConversionDetailDao.getIdx(),
                eUomConversionDetailDao.getUom(),
                eUomConversionDetailDao.getConversionFactor(),
                eUomConversionDetailDao.getParent(),
                eUomConversionDetailDao.getParentField(),
                eUomConversionDetailDao.getParentType());
    }

    public static void fromDTO(UomConversionDetailDto vUomConversionDetailDto, UomConversionDetailDao eUomConversionDetailDao) {
        eUomConversionDetailDao.setName(vUomConversionDetailDto.name());
        eUomConversionDetailDao.setCreation(vUomConversionDetailDto.creation());
        eUomConversionDetailDao.setModified(vUomConversionDetailDto.modified());
        eUomConversionDetailDao.setModifiedBy(vUomConversionDetailDto.modifiedBy());
        eUomConversionDetailDao.setOwner(vUomConversionDetailDto.owner());
        eUomConversionDetailDao.setIsDocStatus(vUomConversionDetailDto.isDocStatus());
        eUomConversionDetailDao.setIdx(vUomConversionDetailDto.idx());
        eUomConversionDetailDao.setUom(vUomConversionDetailDto.uom());
        eUomConversionDetailDao.setConversionFactor(vUomConversionDetailDto.conversionFactor());
        eUomConversionDetailDao.setParent(vUomConversionDetailDto.parent());
        eUomConversionDetailDao.setParentField(vUomConversionDetailDto.parentField());
        eUomConversionDetailDao.setParentType(vUomConversionDetailDto.parentType());
    }
}