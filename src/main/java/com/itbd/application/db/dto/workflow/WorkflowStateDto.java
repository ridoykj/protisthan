package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowStateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowStateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workflowStateName,
        String icon,
        String style,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkflowStateDto fromEntity(WorkflowStateDao eWorkflowStateDao) {
        return new WorkflowStateDto(
                eWorkflowStateDao.getName(),
                eWorkflowStateDao.getCreation(),
                eWorkflowStateDao.getModified(),
                eWorkflowStateDao.getModifiedBy(),
                eWorkflowStateDao.getOwner(),
                eWorkflowStateDao.getIsDocStatus(),
                eWorkflowStateDao.getIdx(),
                eWorkflowStateDao.getWorkflowStateName(),
                eWorkflowStateDao.getIcon(),
                eWorkflowStateDao.getStyle(),
                eWorkflowStateDao.getUserTags(),
                eWorkflowStateDao.getComments(),
                eWorkflowStateDao.getAssign(),
                eWorkflowStateDao.getLikedBy());
    }

    public static void fromDTO(WorkflowStateDto vWorkflowStateDto, WorkflowStateDao eWorkflowStateDao) {
        eWorkflowStateDao.setName(vWorkflowStateDto.name());
        eWorkflowStateDao.setCreation(vWorkflowStateDto.creation());
        eWorkflowStateDao.setModified(vWorkflowStateDto.modified());
        eWorkflowStateDao.setModifiedBy(vWorkflowStateDto.modifiedBy());
        eWorkflowStateDao.setOwner(vWorkflowStateDto.owner());
        eWorkflowStateDao.setIsDocStatus(vWorkflowStateDto.isDocStatus());
        eWorkflowStateDao.setIdx(vWorkflowStateDto.idx());
        eWorkflowStateDao.setWorkflowStateName(vWorkflowStateDto.workflowStateName());
        eWorkflowStateDao.setIcon(vWorkflowStateDto.icon());
        eWorkflowStateDao.setStyle(vWorkflowStateDto.style());
        eWorkflowStateDao.setUserTags(vWorkflowStateDto.userTags());
        eWorkflowStateDao.setComments(vWorkflowStateDto.comments());
        eWorkflowStateDao.setAssign(vWorkflowStateDto.assign());
        eWorkflowStateDao.setLikedBy(vWorkflowStateDto.likedBy());
    }
}