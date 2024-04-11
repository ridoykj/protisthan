package com.itbd.application.db.dto;

import com.itbd.application.db.dao.GlobalSearchDocTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record GlobalSearchDocTypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String parent,
        String parentField,
        String parentType
) {
    public static GlobalSearchDocTypeDto fromEntity(GlobalSearchDocTypeDao eGlobalSearchDocTypeDao) {
        return new GlobalSearchDocTypeDto(
                eGlobalSearchDocTypeDao.getName(),
                eGlobalSearchDocTypeDao.getCreation(),
                eGlobalSearchDocTypeDao.getModified(),
                eGlobalSearchDocTypeDao.getModifiedBy(),
                eGlobalSearchDocTypeDao.getOwner(),
                eGlobalSearchDocTypeDao.getIsDocStatus(),
                eGlobalSearchDocTypeDao.getIdx(),
                eGlobalSearchDocTypeDao.getDocumentType(),
                eGlobalSearchDocTypeDao.getParent(),
                eGlobalSearchDocTypeDao.getParentField(),
                eGlobalSearchDocTypeDao.getParentType());
    }

    public static void fromDTO(GlobalSearchDocTypeDto vGlobalSearchDocTypeDto, GlobalSearchDocTypeDao eGlobalSearchDocTypeDao) {
        eGlobalSearchDocTypeDao.setName(vGlobalSearchDocTypeDto.name());
        eGlobalSearchDocTypeDao.setCreation(vGlobalSearchDocTypeDto.creation());
        eGlobalSearchDocTypeDao.setModified(vGlobalSearchDocTypeDto.modified());
        eGlobalSearchDocTypeDao.setModifiedBy(vGlobalSearchDocTypeDto.modifiedBy());
        eGlobalSearchDocTypeDao.setOwner(vGlobalSearchDocTypeDto.owner());
        eGlobalSearchDocTypeDao.setIsDocStatus(vGlobalSearchDocTypeDto.isDocStatus());
        eGlobalSearchDocTypeDao.setIdx(vGlobalSearchDocTypeDto.idx());
        eGlobalSearchDocTypeDao.setDocumentType(vGlobalSearchDocTypeDto.documentType());
        eGlobalSearchDocTypeDao.setParent(vGlobalSearchDocTypeDto.parent());
        eGlobalSearchDocTypeDao.setParentField(vGlobalSearchDocTypeDto.parentField());
        eGlobalSearchDocTypeDao.setParentType(vGlobalSearchDocTypeDto.parentType());
    }
}