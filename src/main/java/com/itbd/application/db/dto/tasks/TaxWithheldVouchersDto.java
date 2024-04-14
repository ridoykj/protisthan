package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaxWithheldVouchersDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TaxWithheldVouchersDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String voucherType,
        String voucherName,
        BigDecimal taxableAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static TaxWithheldVouchersDto fromEntity(TaxWithheldVouchersDao eTaxWithheldVouchersDao) {
        return new TaxWithheldVouchersDto(
                eTaxWithheldVouchersDao.getName(),
                eTaxWithheldVouchersDao.getCreation(),
                eTaxWithheldVouchersDao.getModified(),
                eTaxWithheldVouchersDao.getModifiedBy(),
                eTaxWithheldVouchersDao.getOwner(),
                eTaxWithheldVouchersDao.getIsDocStatus(),
                eTaxWithheldVouchersDao.getIdx(),
                eTaxWithheldVouchersDao.getVoucherType(),
                eTaxWithheldVouchersDao.getVoucherName(),
                eTaxWithheldVouchersDao.getTaxableAmount(),
                eTaxWithheldVouchersDao.getParent(),
                eTaxWithheldVouchersDao.getParentField(),
                eTaxWithheldVouchersDao.getParentType());
    }

    public static void fromDTO(TaxWithheldVouchersDto vTaxWithheldVouchersDto, TaxWithheldVouchersDao eTaxWithheldVouchersDao) {
        eTaxWithheldVouchersDao.setName(vTaxWithheldVouchersDto.name());
        eTaxWithheldVouchersDao.setCreation(vTaxWithheldVouchersDto.creation());
        eTaxWithheldVouchersDao.setModified(vTaxWithheldVouchersDto.modified());
        eTaxWithheldVouchersDao.setModifiedBy(vTaxWithheldVouchersDto.modifiedBy());
        eTaxWithheldVouchersDao.setOwner(vTaxWithheldVouchersDto.owner());
        eTaxWithheldVouchersDao.setIsDocStatus(vTaxWithheldVouchersDto.isDocStatus());
        eTaxWithheldVouchersDao.setIdx(vTaxWithheldVouchersDto.idx());
        eTaxWithheldVouchersDao.setVoucherType(vTaxWithheldVouchersDto.voucherType());
        eTaxWithheldVouchersDao.setVoucherName(vTaxWithheldVouchersDto.voucherName());
        eTaxWithheldVouchersDao.setTaxableAmount(vTaxWithheldVouchersDto.taxableAmount());
        eTaxWithheldVouchersDao.setParent(vTaxWithheldVouchersDto.parent());
        eTaxWithheldVouchersDao.setParentField(vTaxWithheldVouchersDto.parentField());
        eTaxWithheldVouchersDao.setParentType(vTaxWithheldVouchersDto.parentType());
    }
}