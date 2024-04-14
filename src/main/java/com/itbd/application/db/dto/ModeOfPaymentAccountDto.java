package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ModeOfPaymentAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ModeOfPaymentAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String defaultAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static ModeOfPaymentAccountDto fromEntity(ModeOfPaymentAccountDao eModeOfPaymentAccoDao) {
        return new ModeOfPaymentAccountDto(
                eModeOfPaymentAccoDao.getName(),
                eModeOfPaymentAccoDao.getCreation(),
                eModeOfPaymentAccoDao.getModified(),
                eModeOfPaymentAccoDao.getModifiedBy(),
                eModeOfPaymentAccoDao.getOwner(),
                eModeOfPaymentAccoDao.getIsDocStatus(),
                eModeOfPaymentAccoDao.getIdx(),
                eModeOfPaymentAccoDao.getCompany(),
                eModeOfPaymentAccoDao.getDefaultAccount(),
                eModeOfPaymentAccoDao.getParent(),
                eModeOfPaymentAccoDao.getParentField(),
                eModeOfPaymentAccoDao.getParentType());
    }

    public static void fromDTO(ModeOfPaymentAccountDto vModeOfPaymentAccoDto, ModeOfPaymentAccountDao eModeOfPaymentAccoDao) {
        eModeOfPaymentAccoDao.setName(vModeOfPaymentAccoDto.name());
        eModeOfPaymentAccoDao.setCreation(vModeOfPaymentAccoDto.creation());
        eModeOfPaymentAccoDao.setModified(vModeOfPaymentAccoDto.modified());
        eModeOfPaymentAccoDao.setModifiedBy(vModeOfPaymentAccoDto.modifiedBy());
        eModeOfPaymentAccoDao.setOwner(vModeOfPaymentAccoDto.owner());
        eModeOfPaymentAccoDao.setIsDocStatus(vModeOfPaymentAccoDto.isDocStatus());
        eModeOfPaymentAccoDao.setIdx(vModeOfPaymentAccoDto.idx());
        eModeOfPaymentAccoDao.setCompany(vModeOfPaymentAccoDto.company());
        eModeOfPaymentAccoDao.setDefaultAccount(vModeOfPaymentAccoDto.defaultAccount());
        eModeOfPaymentAccoDao.setParent(vModeOfPaymentAccoDto.parent());
        eModeOfPaymentAccoDao.setParentField(vModeOfPaymentAccoDto.parentField());
        eModeOfPaymentAccoDao.setParentType(vModeOfPaymentAccoDto.parentType());
    }
}