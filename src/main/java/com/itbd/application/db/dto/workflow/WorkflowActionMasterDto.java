package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowActionMasterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowActionMasterDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workflowActionName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkflowActionMasterDto fromEntity(WorkflowActionMasterDao eWorkflowActionMasterDao) {
        return new WorkflowActionMasterDto(
                eWorkflowActionMasterDao.getName(),
                eWorkflowActionMasterDao.getCreation(),
                eWorkflowActionMasterDao.getModified(),
                eWorkflowActionMasterDao.getModifiedBy(),
                eWorkflowActionMasterDao.getOwner(),
                eWorkflowActionMasterDao.getIsDocStatus(),
                eWorkflowActionMasterDao.getIdx(),
                eWorkflowActionMasterDao.getWorkflowActionName(),
                eWorkflowActionMasterDao.getUserTags(),
                eWorkflowActionMasterDao.getComments(),
                eWorkflowActionMasterDao.getAssign(),
                eWorkflowActionMasterDao.getLikedBy());
    }

    public static void fromDTO(WorkflowActionMasterDto vWorkflowActionMasterDto, WorkflowActionMasterDao eWorkflowActionMasterDao) {
        eWorkflowActionMasterDao.setName(vWorkflowActionMasterDto.name());
        eWorkflowActionMasterDao.setCreation(vWorkflowActionMasterDto.creation());
        eWorkflowActionMasterDao.setModified(vWorkflowActionMasterDto.modified());
        eWorkflowActionMasterDao.setModifiedBy(vWorkflowActionMasterDto.modifiedBy());
        eWorkflowActionMasterDao.setOwner(vWorkflowActionMasterDto.owner());
        eWorkflowActionMasterDao.setIsDocStatus(vWorkflowActionMasterDto.isDocStatus());
        eWorkflowActionMasterDao.setIdx(vWorkflowActionMasterDto.idx());
        eWorkflowActionMasterDao.setWorkflowActionName(vWorkflowActionMasterDto.workflowActionName());
        eWorkflowActionMasterDao.setUserTags(vWorkflowActionMasterDto.userTags());
        eWorkflowActionMasterDao.setComments(vWorkflowActionMasterDto.comments());
        eWorkflowActionMasterDao.setAssign(vWorkflowActionMasterDto.assign());
        eWorkflowActionMasterDao.setLikedBy(vWorkflowActionMasterDto.likedBy());
    }
}