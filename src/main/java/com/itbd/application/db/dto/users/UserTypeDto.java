package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserTypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isStandard,
        String role,
        String applyUserPermissionOn,
        String userIdField,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UserTypeDto fromEntity(UserTypeDao eUserTypeDao) {
        return new UserTypeDto(
                eUserTypeDao.getName(),
                eUserTypeDao.getCreation(),
                eUserTypeDao.getModified(),
                eUserTypeDao.getModifiedBy(),
                eUserTypeDao.getOwner(),
                eUserTypeDao.getIsDocStatus(),
                eUserTypeDao.getIdx(),
                eUserTypeDao.getIsStandard(),
                eUserTypeDao.getRole(),
                eUserTypeDao.getApplyUserPermissionOn(),
                eUserTypeDao.getUserIdField(),
                eUserTypeDao.getUserTags(),
                eUserTypeDao.getComments(),
                eUserTypeDao.getAssign(),
                eUserTypeDao.getLikedBy());
    }

    public static void fromDTO(UserTypeDto vUserTypeDto, UserTypeDao eUserTypeDao) {
        eUserTypeDao.setName(vUserTypeDto.name());
        eUserTypeDao.setCreation(vUserTypeDto.creation());
        eUserTypeDao.setModified(vUserTypeDto.modified());
        eUserTypeDao.setModifiedBy(vUserTypeDto.modifiedBy());
        eUserTypeDao.setOwner(vUserTypeDto.owner());
        eUserTypeDao.setIsDocStatus(vUserTypeDto.isDocStatus());
        eUserTypeDao.setIdx(vUserTypeDto.idx());
        eUserTypeDao.setIsStandard(vUserTypeDto.isStandard());
        eUserTypeDao.setRole(vUserTypeDto.role());
        eUserTypeDao.setApplyUserPermissionOn(vUserTypeDto.applyUserPermissionOn());
        eUserTypeDao.setUserIdField(vUserTypeDto.userIdField());
        eUserTypeDao.setUserTags(vUserTypeDto.userTags());
        eUserTypeDao.setComments(vUserTypeDto.comments());
        eUserTypeDao.setAssign(vUserTypeDto.assign());
        eUserTypeDao.setLikedBy(vUserTypeDto.likedBy());
    }
}