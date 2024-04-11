package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserPermissionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserPermissionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String allow,
        String forValue,
        Boolean isDefault,
        Boolean applyToAllDocTypes,
        String applicableFor,
        Boolean hideDescendants,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UserPermissionDto fromEntity(UserPermissionDao eUserPermissionDao) {
        return new UserPermissionDto(
                eUserPermissionDao.getName(),
                eUserPermissionDao.getCreation(),
                eUserPermissionDao.getModified(),
                eUserPermissionDao.getModifiedBy(),
                eUserPermissionDao.getOwner(),
                eUserPermissionDao.getIsDocStatus(),
                eUserPermissionDao.getIdx(),
                eUserPermissionDao.getUser(),
                eUserPermissionDao.getAllow(),
                eUserPermissionDao.getForValue(),
                eUserPermissionDao.getIsDefault(),
                eUserPermissionDao.getApplyToAllDocTypes(),
                eUserPermissionDao.getApplicableFor(),
                eUserPermissionDao.getHideDescendants(),
                eUserPermissionDao.getUserTags(),
                eUserPermissionDao.getComments(),
                eUserPermissionDao.getAssign(),
                eUserPermissionDao.getLikedBy());
    }

    public static void fromDTO(UserPermissionDto vUserPermissionDto, UserPermissionDao eUserPermissionDao) {
        eUserPermissionDao.setName(vUserPermissionDto.name());
        eUserPermissionDao.setCreation(vUserPermissionDto.creation());
        eUserPermissionDao.setModified(vUserPermissionDto.modified());
        eUserPermissionDao.setModifiedBy(vUserPermissionDto.modifiedBy());
        eUserPermissionDao.setOwner(vUserPermissionDto.owner());
        eUserPermissionDao.setIsDocStatus(vUserPermissionDto.isDocStatus());
        eUserPermissionDao.setIdx(vUserPermissionDto.idx());
        eUserPermissionDao.setUser(vUserPermissionDto.user());
        eUserPermissionDao.setAllow(vUserPermissionDto.allow());
        eUserPermissionDao.setForValue(vUserPermissionDto.forValue());
        eUserPermissionDao.setIsDefault(vUserPermissionDto.isDefault());
        eUserPermissionDao.setApplyToAllDocTypes(vUserPermissionDto.applyToAllDocTypes());
        eUserPermissionDao.setApplicableFor(vUserPermissionDto.applicableFor());
        eUserPermissionDao.setHideDescendants(vUserPermissionDto.hideDescendants());
        eUserPermissionDao.setUserTags(vUserPermissionDto.userTags());
        eUserPermissionDao.setComments(vUserPermissionDto.comments());
        eUserPermissionDao.setAssign(vUserPermissionDto.assign());
        eUserPermissionDao.setLikedBy(vUserPermissionDto.likedBy());
    }
}