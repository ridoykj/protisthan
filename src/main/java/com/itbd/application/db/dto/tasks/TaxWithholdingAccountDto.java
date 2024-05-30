package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.accounts.tax.TaxWithholdingAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TaxWithholdingAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String account,
        String parent,
        String parentField,
        String parentType
) {
    public static TaxWithholdingAccountDto fromEntity(TaxWithholdingAccountDao eTaxWithholdingAccountDao) {
        return new TaxWithholdingAccountDto(
                eTaxWithholdingAccountDao.getName(),
                eTaxWithholdingAccountDao.getCreation(),
                eTaxWithholdingAccountDao.getModified(),
                eTaxWithholdingAccountDao.getModifiedBy(),
                eTaxWithholdingAccountDao.getOwner(),
                eTaxWithholdingAccountDao.getIsDocStatus(),
                eTaxWithholdingAccountDao.getIdx(),
                eTaxWithholdingAccountDao.getCompany(),
                eTaxWithholdingAccountDao.getAccount(),
                eTaxWithholdingAccountDao.getParent(),
                eTaxWithholdingAccountDao.getParentField(),
                eTaxWithholdingAccountDao.getParentType());
    }

    public static void fromDTO(TaxWithholdingAccountDto vTaxWithholdingAccountDto, TaxWithholdingAccountDao eTaxWithholdingAccountDao) {
        eTaxWithholdingAccountDao.setName(vTaxWithholdingAccountDto.name());
        eTaxWithholdingAccountDao.setCreation(vTaxWithholdingAccountDto.creation());
        eTaxWithholdingAccountDao.setModified(vTaxWithholdingAccountDto.modified());
        eTaxWithholdingAccountDao.setModifiedBy(vTaxWithholdingAccountDto.modifiedBy());
        eTaxWithholdingAccountDao.setOwner(vTaxWithholdingAccountDto.owner());
        eTaxWithholdingAccountDao.setIsDocStatus(vTaxWithholdingAccountDto.isDocStatus());
        eTaxWithholdingAccountDao.setIdx(vTaxWithholdingAccountDto.idx());
        eTaxWithholdingAccountDao.setCompany(vTaxWithholdingAccountDto.company());
        eTaxWithholdingAccountDao.setAccount(vTaxWithholdingAccountDto.account());
        eTaxWithholdingAccountDao.setParent(vTaxWithholdingAccountDto.parent());
        eTaxWithholdingAccountDao.setParentField(vTaxWithholdingAccountDto.parentField());
        eTaxWithholdingAccountDao.setParentType(vTaxWithholdingAccountDto.parentType());
    }
}