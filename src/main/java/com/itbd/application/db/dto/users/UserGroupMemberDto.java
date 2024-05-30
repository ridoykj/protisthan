package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.core.user.UserGroupMemberDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserGroupMemberDto(
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
    public static UserGroupMemberDto fromEntity(UserGroupMemberDao eUserGroupMemberDao) {
        return new UserGroupMemberDto(
                eUserGroupMemberDao.getName(),
                eUserGroupMemberDao.getCreation(),
                eUserGroupMemberDao.getModified(),
                eUserGroupMemberDao.getModifiedBy(),
                eUserGroupMemberDao.getOwner(),
                eUserGroupMemberDao.getIsDocStatus(),
                eUserGroupMemberDao.getIdx(),
                eUserGroupMemberDao.getUser(),
                eUserGroupMemberDao.getParent(),
                eUserGroupMemberDao.getParentField(),
                eUserGroupMemberDao.getParentType());
    }

    public static void fromDTO(UserGroupMemberDto vUserGroupMemberDto, UserGroupMemberDao eUserGroupMemberDao) {
        eUserGroupMemberDao.setName(vUserGroupMemberDto.name());
        eUserGroupMemberDao.setCreation(vUserGroupMemberDto.creation());
        eUserGroupMemberDao.setModified(vUserGroupMemberDto.modified());
        eUserGroupMemberDao.setModifiedBy(vUserGroupMemberDto.modifiedBy());
        eUserGroupMemberDao.setOwner(vUserGroupMemberDto.owner());
        eUserGroupMemberDao.setIsDocStatus(vUserGroupMemberDto.isDocStatus());
        eUserGroupMemberDao.setIdx(vUserGroupMemberDto.idx());
        eUserGroupMemberDao.setUser(vUserGroupMemberDto.user());
        eUserGroupMemberDao.setParent(vUserGroupMemberDto.parent());
        eUserGroupMemberDao.setParentField(vUserGroupMemberDto.parentField());
        eUserGroupMemberDao.setParentType(vUserGroupMemberDto.parentType());
    }
}