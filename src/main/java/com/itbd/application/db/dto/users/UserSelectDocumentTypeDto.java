package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.core.user.UserSelectDocumentTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserSelectDocumentTypeDto(
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
    public static UserSelectDocumentTypeDto fromEntity(UserSelectDocumentTypeDao eUserSelectDocumentTypeDao) {
        return new UserSelectDocumentTypeDto(
                eUserSelectDocumentTypeDao.getName(),
                eUserSelectDocumentTypeDao.getCreation(),
                eUserSelectDocumentTypeDao.getModified(),
                eUserSelectDocumentTypeDao.getModifiedBy(),
                eUserSelectDocumentTypeDao.getOwner(),
                eUserSelectDocumentTypeDao.getIsDocStatus(),
                eUserSelectDocumentTypeDao.getIdx(),
                eUserSelectDocumentTypeDao.getDocumentType(),
                eUserSelectDocumentTypeDao.getParent(),
                eUserSelectDocumentTypeDao.getParentField(),
                eUserSelectDocumentTypeDao.getParentType());
    }

    public static void fromDTO(UserSelectDocumentTypeDto vUserSelectDocumentTypeDto, UserSelectDocumentTypeDao eUserSelectDocumentTypeDao) {
        eUserSelectDocumentTypeDao.setName(vUserSelectDocumentTypeDto.name());
        eUserSelectDocumentTypeDao.setCreation(vUserSelectDocumentTypeDto.creation());
        eUserSelectDocumentTypeDao.setModified(vUserSelectDocumentTypeDto.modified());
        eUserSelectDocumentTypeDao.setModifiedBy(vUserSelectDocumentTypeDto.modifiedBy());
        eUserSelectDocumentTypeDao.setOwner(vUserSelectDocumentTypeDto.owner());
        eUserSelectDocumentTypeDao.setIsDocStatus(vUserSelectDocumentTypeDto.isDocStatus());
        eUserSelectDocumentTypeDao.setIdx(vUserSelectDocumentTypeDto.idx());
        eUserSelectDocumentTypeDao.setDocumentType(vUserSelectDocumentTypeDto.documentType());
        eUserSelectDocumentTypeDao.setParent(vUserSelectDocumentTypeDto.parent());
        eUserSelectDocumentTypeDao.setParentField(vUserSelectDocumentTypeDto.parentField());
        eUserSelectDocumentTypeDao.setParentType(vUserSelectDocumentTypeDto.parentType());
    }
}