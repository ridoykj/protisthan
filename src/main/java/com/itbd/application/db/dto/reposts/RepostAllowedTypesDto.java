package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.reposts.RepostAllowedTypesDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RepostAllowedTypesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        Boolean allowed,
        String parent,
        String parentField,
        String parentType
) {
    public static RepostAllowedTypesDto fromEntity(RepostAllowedTypesDao eRepostAllowedTypesDao) {
        return new RepostAllowedTypesDto(
                eRepostAllowedTypesDao.getName(),
                eRepostAllowedTypesDao.getCreation(),
                eRepostAllowedTypesDao.getModified(),
                eRepostAllowedTypesDao.getModifiedBy(),
                eRepostAllowedTypesDao.getOwner(),
                eRepostAllowedTypesDao.getIsDocStatus(),
                eRepostAllowedTypesDao.getIdx(),
                eRepostAllowedTypesDao.getDocumentType(),
                eRepostAllowedTypesDao.getAllowed(),
                eRepostAllowedTypesDao.getParent(),
                eRepostAllowedTypesDao.getParentField(),
                eRepostAllowedTypesDao.getParentType());
    }

    public static void fromDTO(RepostAllowedTypesDto vRepostAllowedTypesDto, RepostAllowedTypesDao eRepostAllowedTypesDao) {
        eRepostAllowedTypesDao.setName(vRepostAllowedTypesDto.name());
        eRepostAllowedTypesDao.setCreation(vRepostAllowedTypesDto.creation());
        eRepostAllowedTypesDao.setModified(vRepostAllowedTypesDto.modified());
        eRepostAllowedTypesDao.setModifiedBy(vRepostAllowedTypesDto.modifiedBy());
        eRepostAllowedTypesDao.setOwner(vRepostAllowedTypesDto.owner());
        eRepostAllowedTypesDao.setIsDocStatus(vRepostAllowedTypesDto.isDocStatus());
        eRepostAllowedTypesDao.setIdx(vRepostAllowedTypesDto.idx());
        eRepostAllowedTypesDao.setDocumentType(vRepostAllowedTypesDto.documentType());
        eRepostAllowedTypesDao.setAllowed(vRepostAllowedTypesDto.allowed());
        eRepostAllowedTypesDao.setParent(vRepostAllowedTypesDto.parent());
        eRepostAllowedTypesDao.setParentField(vRepostAllowedTypesDto.parentField());
        eRepostAllowedTypesDao.setParentType(vRepostAllowedTypesDto.parentType());
    }
}