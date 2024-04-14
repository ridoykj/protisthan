package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowActionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowActionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String referenceName,
        String referenceDocType,
        String workflowState,
        String completedByRole,
        String completedBy,
        String user,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkflowActionDto fromEntity(WorkflowActionDao eWorkflowActionDao) {
        return new WorkflowActionDto(
                eWorkflowActionDao.getName(),
                eWorkflowActionDao.getCreation(),
                eWorkflowActionDao.getModified(),
                eWorkflowActionDao.getModifiedBy(),
                eWorkflowActionDao.getOwner(),
                eWorkflowActionDao.getIsDocStatus(),
                eWorkflowActionDao.getIdx(),
                eWorkflowActionDao.getStatus(),
                eWorkflowActionDao.getReferenceName(),
                eWorkflowActionDao.getReferenceDocType(),
                eWorkflowActionDao.getWorkflowState(),
                eWorkflowActionDao.getCompletedByRole(),
                eWorkflowActionDao.getCompletedBy(),
                eWorkflowActionDao.getUser(),
                eWorkflowActionDao.getUserTags(),
                eWorkflowActionDao.getComments(),
                eWorkflowActionDao.getAssign(),
                eWorkflowActionDao.getLikedBy());
    }

    public static void fromDTO(WorkflowActionDto vWorkflowActionDto, WorkflowActionDao eWorkflowActionDao) {
        eWorkflowActionDao.setName(vWorkflowActionDto.name());
        eWorkflowActionDao.setCreation(vWorkflowActionDto.creation());
        eWorkflowActionDao.setModified(vWorkflowActionDto.modified());
        eWorkflowActionDao.setModifiedBy(vWorkflowActionDto.modifiedBy());
        eWorkflowActionDao.setOwner(vWorkflowActionDto.owner());
        eWorkflowActionDao.setIsDocStatus(vWorkflowActionDto.isDocStatus());
        eWorkflowActionDao.setIdx(vWorkflowActionDto.idx());
        eWorkflowActionDao.setStatus(vWorkflowActionDto.status());
        eWorkflowActionDao.setReferenceName(vWorkflowActionDto.referenceName());
        eWorkflowActionDao.setReferenceDocType(vWorkflowActionDto.referenceDocType());
        eWorkflowActionDao.setWorkflowState(vWorkflowActionDto.workflowState());
        eWorkflowActionDao.setCompletedByRole(vWorkflowActionDto.completedByRole());
        eWorkflowActionDao.setCompletedBy(vWorkflowActionDto.completedBy());
        eWorkflowActionDao.setUser(vWorkflowActionDto.user());
        eWorkflowActionDao.setUserTags(vWorkflowActionDto.userTags());
        eWorkflowActionDao.setComments(vWorkflowActionDto.comments());
        eWorkflowActionDao.setAssign(vWorkflowActionDto.assign());
        eWorkflowActionDao.setLikedBy(vWorkflowActionDto.likedBy());
    }
}