package com.itbd.application.db.dto.contacts;

import com.itbd.application.db.dao.contacts.ContactEmailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContactEmailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailId,
        Boolean isPrimary,
        String parent,
        String parentField,
        String parentType
) {
    public static ContactEmailDto fromEntity(ContactEmailDao eContactEmailDao) {
        return new ContactEmailDto(
                eContactEmailDao.getName(),
                eContactEmailDao.getCreation(),
                eContactEmailDao.getModified(),
                eContactEmailDao.getModifiedBy(),
                eContactEmailDao.getOwner(),
                eContactEmailDao.getIsDocStatus(),
                eContactEmailDao.getIdx(),
                eContactEmailDao.getEmailId(),
                eContactEmailDao.getIsPrimary(),
                eContactEmailDao.getParent(),
                eContactEmailDao.getParentField(),
                eContactEmailDao.getParentType());
    }

    public static void fromDTO(ContactEmailDto vContactEmailDto, ContactEmailDao eContactEmailDao) {
        eContactEmailDao.setName(vContactEmailDto.name());
        eContactEmailDao.setCreation(vContactEmailDto.creation());
        eContactEmailDao.setModified(vContactEmailDto.modified());
        eContactEmailDao.setModifiedBy(vContactEmailDto.modifiedBy());
        eContactEmailDao.setOwner(vContactEmailDto.owner());
        eContactEmailDao.setIsDocStatus(vContactEmailDto.isDocStatus());
        eContactEmailDao.setIdx(vContactEmailDto.idx());
        eContactEmailDao.setEmailId(vContactEmailDto.emailId());
        eContactEmailDao.setIsPrimary(vContactEmailDto.isPrimary());
        eContactEmailDao.setParent(vContactEmailDto.parent());
        eContactEmailDao.setParentField(vContactEmailDto.parentField());
        eContactEmailDao.setParentType(vContactEmailDto.parentType());
    }
}