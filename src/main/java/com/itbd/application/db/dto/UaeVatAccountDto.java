package com.itbd.application.db.dto;

import com.itbd.application.db.dao.UaeVatAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UaeVatAccountDto(
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
    public static UaeVatAccountDto fromEntity(UaeVatAccountDao eUaeVatAccountDao) {
        return new UaeVatAccountDto(
                eUaeVatAccountDao.getName(),
                eUaeVatAccountDao.getCreation(),
                eUaeVatAccountDao.getModified(),
                eUaeVatAccountDao.getModifiedBy(),
                eUaeVatAccountDao.getOwner(),
                eUaeVatAccountDao.getIsDocStatus(),
                eUaeVatAccountDao.getIdx(),
                eUaeVatAccountDao.getAccount(),
                eUaeVatAccountDao.getParent(),
                eUaeVatAccountDao.getParentField(),
                eUaeVatAccountDao.getParentType());
    }

    public static void fromDTO(UaeVatAccountDto vUaeVatAccountDto, UaeVatAccountDao eUaeVatAccountDao) {
        eUaeVatAccountDao.setName(vUaeVatAccountDto.name());
        eUaeVatAccountDao.setCreation(vUaeVatAccountDto.creation());
        eUaeVatAccountDao.setModified(vUaeVatAccountDto.modified());
        eUaeVatAccountDao.setModifiedBy(vUaeVatAccountDto.modifiedBy());
        eUaeVatAccountDao.setOwner(vUaeVatAccountDto.owner());
        eUaeVatAccountDao.setIsDocStatus(vUaeVatAccountDto.isDocStatus());
        eUaeVatAccountDao.setIdx(vUaeVatAccountDto.idx());
        eUaeVatAccountDao.setAccount(vUaeVatAccountDto.account());
        eUaeVatAccountDao.setParent(vUaeVatAccountDto.parent());
        eUaeVatAccountDao.setParentField(vUaeVatAccountDto.parentField());
        eUaeVatAccountDao.setParentType(vUaeVatAccountDto.parentType());
    }
}