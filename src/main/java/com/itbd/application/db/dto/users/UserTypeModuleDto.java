package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserTypeModuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserTypeModuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String module,
        String parent,
        String parentField,
        String parentType
) {
    public static UserTypeModuleDto fromEntity(UserTypeModuleDao eUserTypeModuleDao) {
        return new UserTypeModuleDto(
                eUserTypeModuleDao.getName(),
                eUserTypeModuleDao.getCreation(),
                eUserTypeModuleDao.getModified(),
                eUserTypeModuleDao.getModifiedBy(),
                eUserTypeModuleDao.getOwner(),
                eUserTypeModuleDao.getIsDocStatus(),
                eUserTypeModuleDao.getIdx(),
                eUserTypeModuleDao.getModule(),
                eUserTypeModuleDao.getParent(),
                eUserTypeModuleDao.getParentField(),
                eUserTypeModuleDao.getParentType());
    }

    public static void fromDTO(UserTypeModuleDto vUserTypeModuleDto, UserTypeModuleDao eUserTypeModuleDao) {
        eUserTypeModuleDao.setName(vUserTypeModuleDto.name());
        eUserTypeModuleDao.setCreation(vUserTypeModuleDto.creation());
        eUserTypeModuleDao.setModified(vUserTypeModuleDto.modified());
        eUserTypeModuleDao.setModifiedBy(vUserTypeModuleDto.modifiedBy());
        eUserTypeModuleDao.setOwner(vUserTypeModuleDto.owner());
        eUserTypeModuleDao.setIsDocStatus(vUserTypeModuleDto.isDocStatus());
        eUserTypeModuleDao.setIdx(vUserTypeModuleDto.idx());
        eUserTypeModuleDao.setModule(vUserTypeModuleDto.module());
        eUserTypeModuleDao.setParent(vUserTypeModuleDto.parent());
        eUserTypeModuleDao.setParentField(vUserTypeModuleDto.parentField());
        eUserTypeModuleDao.setParentType(vUserTypeModuleDto.parentType());
    }
}