package com.itbd.application.db.dto.assignments;

import com.itbd.application.db.dao.assignments.AssignmentRuleDayDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssignmentRuleDayDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String day,
        String parent,
        String parentField,
        String parentType
) {
    public static AssignmentRuleDayDto fromEntity(AssignmentRuleDayDao eAssignmentRuleDayDao) {
        return new AssignmentRuleDayDto(
                eAssignmentRuleDayDao.getName(),
                eAssignmentRuleDayDao.getCreation(),
                eAssignmentRuleDayDao.getModified(),
                eAssignmentRuleDayDao.getModifiedBy(),
                eAssignmentRuleDayDao.getOwner(),
                eAssignmentRuleDayDao.getIsDocStatus(),
                eAssignmentRuleDayDao.getIdx(),
                eAssignmentRuleDayDao.getDay(),
                eAssignmentRuleDayDao.getParent(),
                eAssignmentRuleDayDao.getParentField(),
                eAssignmentRuleDayDao.getParentType());
    }

    public static void fromDTO(AssignmentRuleDayDto vAssignmentRuleDayDto, AssignmentRuleDayDao eAssignmentRuleDayDao) {
        eAssignmentRuleDayDao.setName(vAssignmentRuleDayDto.name());
        eAssignmentRuleDayDao.setCreation(vAssignmentRuleDayDto.creation());
        eAssignmentRuleDayDao.setModified(vAssignmentRuleDayDto.modified());
        eAssignmentRuleDayDao.setModifiedBy(vAssignmentRuleDayDto.modifiedBy());
        eAssignmentRuleDayDao.setOwner(vAssignmentRuleDayDto.owner());
        eAssignmentRuleDayDao.setIsDocStatus(vAssignmentRuleDayDto.isDocStatus());
        eAssignmentRuleDayDao.setIdx(vAssignmentRuleDayDto.idx());
        eAssignmentRuleDayDao.setDay(vAssignmentRuleDayDto.day());
        eAssignmentRuleDayDao.setParent(vAssignmentRuleDayDto.parent());
        eAssignmentRuleDayDao.setParentField(vAssignmentRuleDayDto.parentField());
        eAssignmentRuleDayDao.setParentType(vAssignmentRuleDayDto.parentType());
    }
}