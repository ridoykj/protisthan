package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.FiscalYearCompanyDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record FiscalYearCompanyDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String parent,
        String parentField,
        String parentType
) {
    public static FiscalYearCompanyDto fromEntity(FiscalYearCompanyDao eFiscalYearCompanyDao) {
        return new FiscalYearCompanyDto(
                eFiscalYearCompanyDao.getName(),
                eFiscalYearCompanyDao.getCreation(),
                eFiscalYearCompanyDao.getModified(),
                eFiscalYearCompanyDao.getModifiedBy(),
                eFiscalYearCompanyDao.getOwner(),
                eFiscalYearCompanyDao.getIsDocStatus(),
                eFiscalYearCompanyDao.getIdx(),
                eFiscalYearCompanyDao.getCompany(),
                eFiscalYearCompanyDao.getParent(),
                eFiscalYearCompanyDao.getParentField(),
                eFiscalYearCompanyDao.getParentType());
    }

    public static void fromDTO(FiscalYearCompanyDto vFiscalYearCompanyDto, FiscalYearCompanyDao eFiscalYearCompanyDao) {
        eFiscalYearCompanyDao.setName(vFiscalYearCompanyDto.name());
        eFiscalYearCompanyDao.setCreation(vFiscalYearCompanyDto.creation());
        eFiscalYearCompanyDao.setModified(vFiscalYearCompanyDto.modified());
        eFiscalYearCompanyDao.setModifiedBy(vFiscalYearCompanyDto.modifiedBy());
        eFiscalYearCompanyDao.setOwner(vFiscalYearCompanyDto.owner());
        eFiscalYearCompanyDao.setIsDocStatus(vFiscalYearCompanyDto.isDocStatus());
        eFiscalYearCompanyDao.setIdx(vFiscalYearCompanyDto.idx());
        eFiscalYearCompanyDao.setCompany(vFiscalYearCompanyDto.company());
        eFiscalYearCompanyDao.setParent(vFiscalYearCompanyDto.parent());
        eFiscalYearCompanyDao.setParentField(vFiscalYearCompanyDto.parentField());
        eFiscalYearCompanyDao.setParentType(vFiscalYearCompanyDto.parentType());
    }
}