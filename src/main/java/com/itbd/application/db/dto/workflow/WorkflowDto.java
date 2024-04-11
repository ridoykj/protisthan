package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workflowName,
        String documentType,
        Boolean isActive,
        Boolean overrideStatus,
        Boolean sendEmailAlert,
        String workflowStateField,
        String workflowData,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkflowDto fromEntity(WorkflowDao eWorkflowDao) {
        return new WorkflowDto(
                eWorkflowDao.getName(),
                eWorkflowDao.getCreation(),
                eWorkflowDao.getModified(),
                eWorkflowDao.getModifiedBy(),
                eWorkflowDao.getOwner(),
                eWorkflowDao.getIsDocStatus(),
                eWorkflowDao.getIdx(),
                eWorkflowDao.getWorkflowName(),
                eWorkflowDao.getDocumentType(),
                eWorkflowDao.getIsActive(),
                eWorkflowDao.getOverrideStatus(),
                eWorkflowDao.getSendEmailAlert(),
                eWorkflowDao.getWorkflowStateField(),
                eWorkflowDao.getWorkflowData(),
                eWorkflowDao.getUserTags(),
                eWorkflowDao.getComments(),
                eWorkflowDao.getAssign(),
                eWorkflowDao.getLikedBy());
    }

    public static void fromDTO(WorkflowDto vWorkflowDto, WorkflowDao eWorkflowDao) {
        eWorkflowDao.setName(vWorkflowDto.name());
        eWorkflowDao.setCreation(vWorkflowDto.creation());
        eWorkflowDao.setModified(vWorkflowDto.modified());
        eWorkflowDao.setModifiedBy(vWorkflowDto.modifiedBy());
        eWorkflowDao.setOwner(vWorkflowDto.owner());
        eWorkflowDao.setIsDocStatus(vWorkflowDto.isDocStatus());
        eWorkflowDao.setIdx(vWorkflowDto.idx());
        eWorkflowDao.setWorkflowName(vWorkflowDto.workflowName());
        eWorkflowDao.setDocumentType(vWorkflowDto.documentType());
        eWorkflowDao.setIsActive(vWorkflowDto.isActive());
        eWorkflowDao.setOverrideStatus(vWorkflowDto.overrideStatus());
        eWorkflowDao.setSendEmailAlert(vWorkflowDto.sendEmailAlert());
        eWorkflowDao.setWorkflowStateField(vWorkflowDto.workflowStateField());
        eWorkflowDao.setWorkflowData(vWorkflowDto.workflowData());
        eWorkflowDao.setUserTags(vWorkflowDto.userTags());
        eWorkflowDao.setComments(vWorkflowDto.comments());
        eWorkflowDao.setAssign(vWorkflowDto.assign());
        eWorkflowDao.setLikedBy(vWorkflowDto.likedBy());
    }
}