package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.RoleProfileDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RoleProfileDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String roleProfile,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RoleProfileDto fromEntity(RoleProfileDao eRoleProfileDao) {
        return new RoleProfileDto(
                eRoleProfileDao.getName(),
                eRoleProfileDao.getCreation(),
                eRoleProfileDao.getModified(),
                eRoleProfileDao.getModifiedBy(),
                eRoleProfileDao.getOwner(),
                eRoleProfileDao.getIsDocStatus(),
                eRoleProfileDao.getIdx(),
                eRoleProfileDao.getRoleProfile(),
                eRoleProfileDao.getUserTags(),
                eRoleProfileDao.getComments(),
                eRoleProfileDao.getAssign(),
                eRoleProfileDao.getLikedBy());
    }

    public static void fromDTO(RoleProfileDto vRoleProfileDto, RoleProfileDao eRoleProfileDao) {
        eRoleProfileDao.setName(vRoleProfileDto.name());
        eRoleProfileDao.setCreation(vRoleProfileDto.creation());
        eRoleProfileDao.setModified(vRoleProfileDto.modified());
        eRoleProfileDao.setModifiedBy(vRoleProfileDto.modifiedBy());
        eRoleProfileDao.setOwner(vRoleProfileDto.owner());
        eRoleProfileDao.setIsDocStatus(vRoleProfileDto.isDocStatus());
        eRoleProfileDao.setIdx(vRoleProfileDto.idx());
        eRoleProfileDao.setRoleProfile(vRoleProfileDto.roleProfile());
        eRoleProfileDao.setUserTags(vRoleProfileDto.userTags());
        eRoleProfileDao.setComments(vRoleProfileDto.comments());
        eRoleProfileDao.setAssign(vRoleProfileDto.assign());
        eRoleProfileDao.setLikedBy(vRoleProfileDto.likedBy());
    }
}