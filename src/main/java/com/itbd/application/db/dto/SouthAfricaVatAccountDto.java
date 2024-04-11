package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SouthAfricaVatAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SouthAfricaVatAccountDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String parent,
        String parentField,
        String parentType
) {
    public static SouthAfricaVatAccountDto fromEntity(SouthAfricaVatAccountDao eSouthAfricaVatAccountDao) {
        return new SouthAfricaVatAccountDto(
                eSouthAfricaVatAccountDao.getName(),
                eSouthAfricaVatAccountDao.getCreation(),
                eSouthAfricaVatAccountDao.getModified(),
                eSouthAfricaVatAccountDao.getModifiedBy(),
                eSouthAfricaVatAccountDao.getOwner(),
                eSouthAfricaVatAccountDao.getIsDocStatus(),
                eSouthAfricaVatAccountDao.getIdx(),
                eSouthAfricaVatAccountDao.getAccount(),
                eSouthAfricaVatAccountDao.getParent(),
                eSouthAfricaVatAccountDao.getParentField(),
                eSouthAfricaVatAccountDao.getParentType());
    }

    public static void fromDTO(SouthAfricaVatAccountDto vSouthAfricaVatAccountDto, SouthAfricaVatAccountDao eSouthAfricaVatAccountDao) {
        eSouthAfricaVatAccountDao.setName(vSouthAfricaVatAccountDto.name());
        eSouthAfricaVatAccountDao.setCreation(vSouthAfricaVatAccountDto.creation());
        eSouthAfricaVatAccountDao.setModified(vSouthAfricaVatAccountDto.modified());
        eSouthAfricaVatAccountDao.setModifiedBy(vSouthAfricaVatAccountDto.modifiedBy());
        eSouthAfricaVatAccountDao.setOwner(vSouthAfricaVatAccountDto.owner());
        eSouthAfricaVatAccountDao.setIsDocStatus(vSouthAfricaVatAccountDto.isDocStatus());
        eSouthAfricaVatAccountDao.setIdx(vSouthAfricaVatAccountDto.idx());
        eSouthAfricaVatAccountDao.setAccount(vSouthAfricaVatAccountDto.account());
        eSouthAfricaVatAccountDao.setParent(vSouthAfricaVatAccountDto.parent());
        eSouthAfricaVatAccountDao.setParentField(vSouthAfricaVatAccountDto.parentField());
        eSouthAfricaVatAccountDao.setParentType(vSouthAfricaVatAccountDto.parentType());
    }
}