package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.AllowedToTransactWithDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AllowedToTransactWithDto(
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
    public static AllowedToTransactWithDto fromEntity(AllowedToTransactWithDao eAllowedToTransactWithDao) {
        return new AllowedToTransactWithDto(
                eAllowedToTransactWithDao.getName(),
                eAllowedToTransactWithDao.getCreation(),
                eAllowedToTransactWithDao.getModified(),
                eAllowedToTransactWithDao.getModifiedBy(),
                eAllowedToTransactWithDao.getOwner(),
                eAllowedToTransactWithDao.getIsDocStatus(),
                eAllowedToTransactWithDao.getIdx(),
                eAllowedToTransactWithDao.getCompany(),
                eAllowedToTransactWithDao.getParent(),
                eAllowedToTransactWithDao.getParentField(),
                eAllowedToTransactWithDao.getParentType());
    }

    public static void fromDTO(AllowedToTransactWithDto vAllowedToTransactWithDto, AllowedToTransactWithDao eAllowedToTransactWithDao) {
        eAllowedToTransactWithDao.setName(vAllowedToTransactWithDto.name());
        eAllowedToTransactWithDao.setCreation(vAllowedToTransactWithDto.creation());
        eAllowedToTransactWithDao.setModified(vAllowedToTransactWithDto.modified());
        eAllowedToTransactWithDao.setModifiedBy(vAllowedToTransactWithDto.modifiedBy());
        eAllowedToTransactWithDao.setOwner(vAllowedToTransactWithDto.owner());
        eAllowedToTransactWithDao.setIsDocStatus(vAllowedToTransactWithDto.isDocStatus());
        eAllowedToTransactWithDao.setIdx(vAllowedToTransactWithDto.idx());
        eAllowedToTransactWithDao.setCompany(vAllowedToTransactWithDto.company());
        eAllowedToTransactWithDao.setParent(vAllowedToTransactWithDto.parent());
        eAllowedToTransactWithDao.setParentField(vAllowedToTransactWithDto.parentField());
        eAllowedToTransactWithDao.setParentType(vAllowedToTransactWithDto.parentType());
    }
}