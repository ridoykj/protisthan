package com.itbd.application.db.dto;

import com.itbd.application.db.dao.LogSettingUserDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LogSettingUserDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String parent,
        String parentField,
        String parentType
) {
    public static LogSettingUserDto fromEntity(LogSettingUserDao eLogSettingUserDao) {
        return new LogSettingUserDto(
                eLogSettingUserDao.getName(),
                eLogSettingUserDao.getCreation(),
                eLogSettingUserDao.getModified(),
                eLogSettingUserDao.getModifiedBy(),
                eLogSettingUserDao.getOwner(),
                eLogSettingUserDao.getIsDocStatus(),
                eLogSettingUserDao.getIdx(),
                eLogSettingUserDao.getUser(),
                eLogSettingUserDao.getParent(),
                eLogSettingUserDao.getParentField(),
                eLogSettingUserDao.getParentType());
    }

    public static void fromDTO(LogSettingUserDto vLogSettingUserDto, LogSettingUserDao eLogSettingUserDao) {
        eLogSettingUserDao.setName(vLogSettingUserDto.name());
        eLogSettingUserDao.setCreation(vLogSettingUserDto.creation());
        eLogSettingUserDao.setModified(vLogSettingUserDto.modified());
        eLogSettingUserDao.setModifiedBy(vLogSettingUserDto.modifiedBy());
        eLogSettingUserDao.setOwner(vLogSettingUserDto.owner());
        eLogSettingUserDao.setIsDocStatus(vLogSettingUserDto.isDocStatus());
        eLogSettingUserDao.setIdx(vLogSettingUserDto.idx());
        eLogSettingUserDao.setUser(vLogSettingUserDto.user());
        eLogSettingUserDao.setParent(vLogSettingUserDto.parent());
        eLogSettingUserDao.setParentField(vLogSettingUserDto.parentField());
        eLogSettingUserDao.setParentType(vLogSettingUserDto.parentType());
    }
}