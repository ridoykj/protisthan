package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UserGroupDto fromEntity(UserGroupDao eUserGroupDao) {
        return new UserGroupDto(
                eUserGroupDao.getName(),
                eUserGroupDao.getCreation(),
                eUserGroupDao.getModified(),
                eUserGroupDao.getModifiedBy(),
                eUserGroupDao.getOwner(),
                eUserGroupDao.getIsDocStatus(),
                eUserGroupDao.getIdx(),
                eUserGroupDao.getUserTags(),
                eUserGroupDao.getComments(),
                eUserGroupDao.getAssign(),
                eUserGroupDao.getLikedBy());
    }

    public static void fromDTO(UserGroupDto vUserGroupDto, UserGroupDao eUserGroupDao) {
        eUserGroupDao.setName(vUserGroupDto.name());
        eUserGroupDao.setCreation(vUserGroupDto.creation());
        eUserGroupDao.setModified(vUserGroupDto.modified());
        eUserGroupDao.setModifiedBy(vUserGroupDto.modifiedBy());
        eUserGroupDao.setOwner(vUserGroupDto.owner());
        eUserGroupDao.setIsDocStatus(vUserGroupDto.isDocStatus());
        eUserGroupDao.setIdx(vUserGroupDto.idx());
        eUserGroupDao.setUserTags(vUserGroupDto.userTags());
        eUserGroupDao.setComments(vUserGroupDto.comments());
        eUserGroupDao.setAssign(vUserGroupDto.assign());
        eUserGroupDao.setLikedBy(vUserGroupDto.likedBy());
    }
}