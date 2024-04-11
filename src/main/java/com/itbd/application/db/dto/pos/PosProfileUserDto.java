package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosProfileUserDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosProfileUserDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean defaults,
        String user,
        String parent,
        String parentField,
        String parentType
) {
    public static PosProfileUserDto fromEntity(PosProfileUserDao ePosProfileUserDao) {
        return new PosProfileUserDto(
                ePosProfileUserDao.getName(),
                ePosProfileUserDao.getCreation(),
                ePosProfileUserDao.getModified(),
                ePosProfileUserDao.getModifiedBy(),
                ePosProfileUserDao.getOwner(),
                ePosProfileUserDao.getIsDocStatus(),
                ePosProfileUserDao.getIdx(),
                ePosProfileUserDao.getDefaults(),
                ePosProfileUserDao.getUser(),
                ePosProfileUserDao.getParent(),
                ePosProfileUserDao.getParentField(),
                ePosProfileUserDao.getParentType());
    }

    public static void fromDTO(PosProfileUserDto vPosProfileUserDto, PosProfileUserDao ePosProfileUserDao) {
        ePosProfileUserDao.setName(vPosProfileUserDto.name());
        ePosProfileUserDao.setCreation(vPosProfileUserDto.creation());
        ePosProfileUserDao.setModified(vPosProfileUserDto.modified());
        ePosProfileUserDao.setModifiedBy(vPosProfileUserDto.modifiedBy());
        ePosProfileUserDao.setOwner(vPosProfileUserDto.owner());
        ePosProfileUserDao.setIsDocStatus(vPosProfileUserDto.isDocStatus());
        ePosProfileUserDao.setIdx(vPosProfileUserDto.idx());
        ePosProfileUserDao.setDefaults(vPosProfileUserDto.defaults());
        ePosProfileUserDao.setUser(vPosProfileUserDto.user());
        ePosProfileUserDao.setParent(vPosProfileUserDto.parent());
        ePosProfileUserDao.setParentField(vPosProfileUserDto.parentField());
        ePosProfileUserDao.setParentType(vPosProfileUserDto.parentType());
    }
}