package com.itbd.application.db.dto.assignments;

import com.itbd.application.db.dao.assignments.AssignmentRuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AssignmentRuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String dueDateBasedOn,
        Integer priority,
        Boolean disabled,
        String description,
        String assignCondition,
        String unassignedCondition,
        String closeCondition,
        String rule,
        String field,
        String lastUser,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssignmentRuleDto fromEntity(AssignmentRuleDao eAssignmentRuleDao) {
        return new AssignmentRuleDto(
                eAssignmentRuleDao.getName(),
                eAssignmentRuleDao.getCreation(),
                eAssignmentRuleDao.getModified(),
                eAssignmentRuleDao.getModifiedBy(),
                eAssignmentRuleDao.getOwner(),
                eAssignmentRuleDao.getIsDocStatus(),
                eAssignmentRuleDao.getIdx(),
                eAssignmentRuleDao.getDocumentType(),
                eAssignmentRuleDao.getDueDateBasedOn(),
                eAssignmentRuleDao.getPriority(),
                eAssignmentRuleDao.getDisabled(),
                eAssignmentRuleDao.getDescription(),
                eAssignmentRuleDao.getAssignCondition(),
                eAssignmentRuleDao.getUnassignedCondition(),
                eAssignmentRuleDao.getCloseCondition(),
                eAssignmentRuleDao.getRule(),
                eAssignmentRuleDao.getField(),
                eAssignmentRuleDao.getLastUser(),
                eAssignmentRuleDao.getUserTags(),
                eAssignmentRuleDao.getComments(),
                eAssignmentRuleDao.getAssign(),
                eAssignmentRuleDao.getLikedBy());
    }

    public static void fromDTO(AssignmentRuleDto vAssignmentRuleDto, AssignmentRuleDao eAssignmentRuleDao) {
        eAssignmentRuleDao.setName(vAssignmentRuleDto.name());
        eAssignmentRuleDao.setCreation(vAssignmentRuleDto.creation());
        eAssignmentRuleDao.setModified(vAssignmentRuleDto.modified());
        eAssignmentRuleDao.setModifiedBy(vAssignmentRuleDto.modifiedBy());
        eAssignmentRuleDao.setOwner(vAssignmentRuleDto.owner());
        eAssignmentRuleDao.setIsDocStatus(vAssignmentRuleDto.isDocStatus());
        eAssignmentRuleDao.setIdx(vAssignmentRuleDto.idx());
        eAssignmentRuleDao.setDocumentType(vAssignmentRuleDto.documentType());
        eAssignmentRuleDao.setDueDateBasedOn(vAssignmentRuleDto.dueDateBasedOn());
        eAssignmentRuleDao.setPriority(vAssignmentRuleDto.priority());
        eAssignmentRuleDao.setDisabled(vAssignmentRuleDto.disabled());
        eAssignmentRuleDao.setDescription(vAssignmentRuleDto.description());
        eAssignmentRuleDao.setAssignCondition(vAssignmentRuleDto.assignCondition());
        eAssignmentRuleDao.setUnassignedCondition(vAssignmentRuleDto.unassignedCondition());
        eAssignmentRuleDao.setCloseCondition(vAssignmentRuleDto.closeCondition());
        eAssignmentRuleDao.setRule(vAssignmentRuleDto.rule());
        eAssignmentRuleDao.setField(vAssignmentRuleDto.field());
        eAssignmentRuleDao.setLastUser(vAssignmentRuleDto.lastUser());
        eAssignmentRuleDao.setUserTags(vAssignmentRuleDto.userTags());
        eAssignmentRuleDao.setComments(vAssignmentRuleDto.comments());
        eAssignmentRuleDao.setAssign(vAssignmentRuleDto.assign());
        eAssignmentRuleDao.setLikedBy(vAssignmentRuleDto.likedBy());
    }
}