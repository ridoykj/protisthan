package com.itbd.application.db.dto.assignments;

import com.itbd.application.db.dao.assignments.AssignmentRuleUserDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssignmentRuleUserDto(
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
    public static AssignmentRuleUserDto fromEntity(AssignmentRuleUserDao eAssignmentRuleUserDao) {
        return new AssignmentRuleUserDto(
                eAssignmentRuleUserDao.getName(),
                eAssignmentRuleUserDao.getCreation(),
                eAssignmentRuleUserDao.getModified(),
                eAssignmentRuleUserDao.getModifiedBy(),
                eAssignmentRuleUserDao.getOwner(),
                eAssignmentRuleUserDao.getIsDocStatus(),
                eAssignmentRuleUserDao.getIdx(),
                eAssignmentRuleUserDao.getUser(),
                eAssignmentRuleUserDao.getParent(),
                eAssignmentRuleUserDao.getParentField(),
                eAssignmentRuleUserDao.getParentType());
    }

    public static void fromDTO(AssignmentRuleUserDto vAssignmentRuleUserDto, AssignmentRuleUserDao eAssignmentRuleUserDao) {
        eAssignmentRuleUserDao.setName(vAssignmentRuleUserDto.name());
        eAssignmentRuleUserDao.setCreation(vAssignmentRuleUserDto.creation());
        eAssignmentRuleUserDao.setModified(vAssignmentRuleUserDto.modified());
        eAssignmentRuleUserDao.setModifiedBy(vAssignmentRuleUserDto.modifiedBy());
        eAssignmentRuleUserDao.setOwner(vAssignmentRuleUserDto.owner());
        eAssignmentRuleUserDao.setIsDocStatus(vAssignmentRuleUserDto.isDocStatus());
        eAssignmentRuleUserDao.setIdx(vAssignmentRuleUserDto.idx());
        eAssignmentRuleUserDao.setUser(vAssignmentRuleUserDto.user());
        eAssignmentRuleUserDao.setParent(vAssignmentRuleUserDto.parent());
        eAssignmentRuleUserDao.setParentField(vAssignmentRuleUserDto.parentField());
        eAssignmentRuleUserDao.setParentType(vAssignmentRuleUserDto.parentType());
    }
}