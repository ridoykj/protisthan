package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.core.user.UserSocialLoginDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserSocialLoginDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String provider,
        String username,
        String userid,
        String parent,
        String parentField,
        String parentType
) {
    public static UserSocialLoginDto fromEntity(UserSocialLoginDao eUserSocialLoginDao) {
        return new UserSocialLoginDto(
                eUserSocialLoginDao.getName(),
                eUserSocialLoginDao.getCreation(),
                eUserSocialLoginDao.getModified(),
                eUserSocialLoginDao.getModifiedBy(),
                eUserSocialLoginDao.getOwner(),
                eUserSocialLoginDao.getIsDocStatus(),
                eUserSocialLoginDao.getIdx(),
                eUserSocialLoginDao.getProvider(),
                eUserSocialLoginDao.getUsername(),
                eUserSocialLoginDao.getUserid(),
                eUserSocialLoginDao.getParent(),
                eUserSocialLoginDao.getParentField(),
                eUserSocialLoginDao.getParentType());
    }

    public static void fromDTO(UserSocialLoginDto vUserSocialLoginDto, UserSocialLoginDao eUserSocialLoginDao) {
        eUserSocialLoginDao.setName(vUserSocialLoginDto.name());
        eUserSocialLoginDao.setCreation(vUserSocialLoginDto.creation());
        eUserSocialLoginDao.setModified(vUserSocialLoginDto.modified());
        eUserSocialLoginDao.setModifiedBy(vUserSocialLoginDto.modifiedBy());
        eUserSocialLoginDao.setOwner(vUserSocialLoginDto.owner());
        eUserSocialLoginDao.setIsDocStatus(vUserSocialLoginDto.isDocStatus());
        eUserSocialLoginDao.setIdx(vUserSocialLoginDto.idx());
        eUserSocialLoginDao.setProvider(vUserSocialLoginDto.provider());
        eUserSocialLoginDao.setUsername(vUserSocialLoginDto.username());
        eUserSocialLoginDao.setUserid(vUserSocialLoginDto.userid());
        eUserSocialLoginDao.setParent(vUserSocialLoginDto.parent());
        eUserSocialLoginDao.setParentField(vUserSocialLoginDto.parentField());
        eUserSocialLoginDao.setParentType(vUserSocialLoginDto.parentType());
    }
}