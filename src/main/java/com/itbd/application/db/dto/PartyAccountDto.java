package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.PartyAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PartyAccountDto(
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
        String advanceAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static PartyAccountDto fromEntity(PartyAccountDao ePartyAccountDao) {
        return new PartyAccountDto(
                ePartyAccountDao.getName(),
                ePartyAccountDao.getCreation(),
                ePartyAccountDao.getModified(),
                ePartyAccountDao.getModifiedBy(),
                ePartyAccountDao.getOwner(),
                ePartyAccountDao.getIsDocStatus(),
                ePartyAccountDao.getIdx(),
                ePartyAccountDao.getCompany(),
                ePartyAccountDao.getAccount(),
                ePartyAccountDao.getAdvanceAccount(),
                ePartyAccountDao.getParent(),
                ePartyAccountDao.getParentField(),
                ePartyAccountDao.getParentType());
    }

    public static void fromDTO(PartyAccountDto vPartyAccountDto, PartyAccountDao ePartyAccountDao) {
        ePartyAccountDao.setName(vPartyAccountDto.name());
        ePartyAccountDao.setCreation(vPartyAccountDto.creation());
        ePartyAccountDao.setModified(vPartyAccountDto.modified());
        ePartyAccountDao.setModifiedBy(vPartyAccountDto.modifiedBy());
        ePartyAccountDao.setOwner(vPartyAccountDto.owner());
        ePartyAccountDao.setIsDocStatus(vPartyAccountDto.isDocStatus());
        ePartyAccountDao.setIdx(vPartyAccountDto.idx());
        ePartyAccountDao.setCompany(vPartyAccountDto.company());
        ePartyAccountDao.setAccount(vPartyAccountDto.account());
        ePartyAccountDao.setAdvanceAccount(vPartyAccountDto.advanceAccount());
        ePartyAccountDao.setParent(vPartyAccountDto.parent());
        ePartyAccountDao.setParentField(vPartyAccountDto.parentField());
        ePartyAccountDao.setParentType(vPartyAccountDto.parentType());
    }
}