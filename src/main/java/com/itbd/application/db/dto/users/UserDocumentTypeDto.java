package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserDocumentTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserDocumentTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        Boolean isCustom,
        Boolean read,
        Boolean write,
        Boolean create,
        Boolean submit,
        Boolean cancel,
        Boolean amend,
        Boolean delete,
        String parent,
        String parentField,
        String parentType
) {
    public static UserDocumentTypeDto fromEntity(UserDocumentTypeDao eUserDocumentTypeDao) {
        return new UserDocumentTypeDto(
                eUserDocumentTypeDao.getName(),
                eUserDocumentTypeDao.getCreation(),
                eUserDocumentTypeDao.getModified(),
                eUserDocumentTypeDao.getModifiedBy(),
                eUserDocumentTypeDao.getOwner(),
                eUserDocumentTypeDao.getIsDocStatus(),
                eUserDocumentTypeDao.getIdx(),
                eUserDocumentTypeDao.getDocumentType(),
                eUserDocumentTypeDao.getIsCustom(),
                eUserDocumentTypeDao.getRead(),
                eUserDocumentTypeDao.getWrite(),
                eUserDocumentTypeDao.getCreate(),
                eUserDocumentTypeDao.getSubmit(),
                eUserDocumentTypeDao.getCancel(),
                eUserDocumentTypeDao.getAmend(),
                eUserDocumentTypeDao.getDelete(),
                eUserDocumentTypeDao.getParent(),
                eUserDocumentTypeDao.getParentField(),
                eUserDocumentTypeDao.getParentType());
    }

    public static void fromDTO(UserDocumentTypeDto vUserDocumentTypeDto, UserDocumentTypeDao eUserDocumentTypeDao) {
        eUserDocumentTypeDao.setName(vUserDocumentTypeDto.name());
        eUserDocumentTypeDao.setCreation(vUserDocumentTypeDto.creation());
        eUserDocumentTypeDao.setModified(vUserDocumentTypeDto.modified());
        eUserDocumentTypeDao.setModifiedBy(vUserDocumentTypeDto.modifiedBy());
        eUserDocumentTypeDao.setOwner(vUserDocumentTypeDto.owner());
        eUserDocumentTypeDao.setIsDocStatus(vUserDocumentTypeDto.isDocStatus());
        eUserDocumentTypeDao.setIdx(vUserDocumentTypeDto.idx());
        eUserDocumentTypeDao.setDocumentType(vUserDocumentTypeDto.documentType());
        eUserDocumentTypeDao.setIsCustom(vUserDocumentTypeDto.isCustom());
        eUserDocumentTypeDao.setRead(vUserDocumentTypeDto.read());
        eUserDocumentTypeDao.setWrite(vUserDocumentTypeDto.write());
        eUserDocumentTypeDao.setCreate(vUserDocumentTypeDto.create());
        eUserDocumentTypeDao.setSubmit(vUserDocumentTypeDto.submit());
        eUserDocumentTypeDao.setCancel(vUserDocumentTypeDto.cancel());
        eUserDocumentTypeDao.setAmend(vUserDocumentTypeDto.amend());
        eUserDocumentTypeDao.setDelete(vUserDocumentTypeDto.delete());
        eUserDocumentTypeDao.setParent(vUserDocumentTypeDto.parent());
        eUserDocumentTypeDao.setParentField(vUserDocumentTypeDto.parentField());
        eUserDocumentTypeDao.setParentType(vUserDocumentTypeDto.parentType());
    }
}