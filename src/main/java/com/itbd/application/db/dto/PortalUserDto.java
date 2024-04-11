package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PortalUserDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PortalUserDto(
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
    public static PortalUserDto fromEntity(PortalUserDao ePortalUserDao) {
        return new PortalUserDto(
                ePortalUserDao.getName(),
                ePortalUserDao.getCreation(),
                ePortalUserDao.getModified(),
                ePortalUserDao.getModifiedBy(),
                ePortalUserDao.getOwner(),
                ePortalUserDao.getIsDocStatus(),
                ePortalUserDao.getIdx(),
                ePortalUserDao.getUser(),
                ePortalUserDao.getParent(),
                ePortalUserDao.getParentField(),
                ePortalUserDao.getParentType());
    }

    public static void fromDTO(PortalUserDto vPortalUserDto, PortalUserDao ePortalUserDao) {
        ePortalUserDao.setName(vPortalUserDto.name());
        ePortalUserDao.setCreation(vPortalUserDto.creation());
        ePortalUserDao.setModified(vPortalUserDto.modified());
        ePortalUserDao.setModifiedBy(vPortalUserDto.modifiedBy());
        ePortalUserDao.setOwner(vPortalUserDto.owner());
        ePortalUserDao.setIsDocStatus(vPortalUserDto.isDocStatus());
        ePortalUserDao.setIdx(vPortalUserDto.idx());
        ePortalUserDao.setUser(vPortalUserDto.user());
        ePortalUserDao.setParent(vPortalUserDto.parent());
        ePortalUserDao.setParentField(vPortalUserDto.parentField());
        ePortalUserDao.setParentType(vPortalUserDto.parentType());
    }
}