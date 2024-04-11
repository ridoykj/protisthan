package com.itbd.application.db.dto.contacts;

import com.itbd.application.db.dao.contacts.ContactPhoneDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContactPhoneDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String phone,
        Boolean isPrimaryPhone,
        Boolean isPrimaryMobileNo,
        String parent,
        String parentField,
        String parentType
) {
    public static ContactPhoneDto fromEntity(ContactPhoneDao eContactPhoneDao) {
        return new ContactPhoneDto(
                eContactPhoneDao.getName(),
                eContactPhoneDao.getCreation(),
                eContactPhoneDao.getModified(),
                eContactPhoneDao.getModifiedBy(),
                eContactPhoneDao.getOwner(),
                eContactPhoneDao.getIsDocStatus(),
                eContactPhoneDao.getIdx(),
                eContactPhoneDao.getPhone(),
                eContactPhoneDao.getIsPrimaryPhone(),
                eContactPhoneDao.getIsPrimaryMobileNo(),
                eContactPhoneDao.getParent(),
                eContactPhoneDao.getParentField(),
                eContactPhoneDao.getParentType());
    }

    public static void fromDTO(ContactPhoneDto vContactPhoneDto, ContactPhoneDao eContactPhoneDao) {
        eContactPhoneDao.setName(vContactPhoneDto.name());
        eContactPhoneDao.setCreation(vContactPhoneDto.creation());
        eContactPhoneDao.setModified(vContactPhoneDto.modified());
        eContactPhoneDao.setModifiedBy(vContactPhoneDto.modifiedBy());
        eContactPhoneDao.setOwner(vContactPhoneDto.owner());
        eContactPhoneDao.setIsDocStatus(vContactPhoneDto.isDocStatus());
        eContactPhoneDao.setIdx(vContactPhoneDto.idx());
        eContactPhoneDao.setPhone(vContactPhoneDto.phone());
        eContactPhoneDao.setIsPrimaryPhone(vContactPhoneDto.isPrimaryPhone());
        eContactPhoneDao.setIsPrimaryMobileNo(vContactPhoneDto.isPrimaryMobileNo());
        eContactPhoneDao.setParent(vContactPhoneDto.parent());
        eContactPhoneDao.setParentField(vContactPhoneDto.parentField());
        eContactPhoneDao.setParentType(vContactPhoneDto.parentType());
    }
}