package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ToDoDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ToDoDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String priority,
        String color,
        LocalDate date,
        String allocatedTo,
        String description,
        String referenceType,
        String referenceName,
        String role,
        String assignedBy,
        String assignedByFullName,
        String sender,
        String assignmentRule,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static ToDoDto fromEntity(ToDoDao eToDoDao) {
        return new ToDoDto(
                eToDoDao.getName(),
                eToDoDao.getCreation(),
                eToDoDao.getModified(),
                eToDoDao.getModifiedBy(),
                eToDoDao.getOwner(),
                eToDoDao.getIsDocStatus(),
                eToDoDao.getIdx(),
                eToDoDao.getStatus(),
                eToDoDao.getPriority(),
                eToDoDao.getColor(),
                eToDoDao.getDate(),
                eToDoDao.getAllocatedTo(),
                eToDoDao.getDescription(),
                eToDoDao.getReferenceType(),
                eToDoDao.getReferenceName(),
                eToDoDao.getRole(),
                eToDoDao.getAssignedBy(),
                eToDoDao.getAssignedByFullName(),
                eToDoDao.getSender(),
                eToDoDao.getAssignmentRule(),
                eToDoDao.getUserTags(),
                eToDoDao.getComments(),
                eToDoDao.getAssign(),
                eToDoDao.getLikedBy(),
                eToDoDao.getSeen());
    }

    public static void fromDTO(ToDoDto vToDoDto, ToDoDao eToDoDao) {
        eToDoDao.setName(vToDoDto.name());
        eToDoDao.setCreation(vToDoDto.creation());
        eToDoDao.setModified(vToDoDto.modified());
        eToDoDao.setModifiedBy(vToDoDto.modifiedBy());
        eToDoDao.setOwner(vToDoDto.owner());
        eToDoDao.setIsDocStatus(vToDoDto.isDocStatus());
        eToDoDao.setIdx(vToDoDto.idx());
        eToDoDao.setStatus(vToDoDto.status());
        eToDoDao.setPriority(vToDoDto.priority());
        eToDoDao.setColor(vToDoDto.color());
        eToDoDao.setDate(vToDoDto.date());
        eToDoDao.setAllocatedTo(vToDoDto.allocatedTo());
        eToDoDao.setDescription(vToDoDto.description());
        eToDoDao.setReferenceType(vToDoDto.referenceType());
        eToDoDao.setReferenceName(vToDoDto.referenceName());
        eToDoDao.setRole(vToDoDto.role());
        eToDoDao.setAssignedBy(vToDoDto.assignedBy());
        eToDoDao.setAssignedByFullName(vToDoDto.assignedByFullName());
        eToDoDao.setSender(vToDoDto.sender());
        eToDoDao.setAssignmentRule(vToDoDto.assignmentRule());
        eToDoDao.setUserTags(vToDoDto.userTags());
        eToDoDao.setComments(vToDoDto.comments());
        eToDoDao.setAssign(vToDoDto.assign());
        eToDoDao.setLikedBy(vToDoDto.likedBy());
        eToDoDao.setSeen(vToDoDto.seen());
    }
}