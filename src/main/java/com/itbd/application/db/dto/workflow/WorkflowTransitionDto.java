package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowTransitionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowTransitionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String state,
        String action,
        String nextState,
        String allowed,
        Boolean allowSelfApproval,
        String condition,
        String workflowBuilderId,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkflowTransitionDto fromEntity(WorkflowTransitionDao eWorkflowTransitionDao) {
        return new WorkflowTransitionDto(
                eWorkflowTransitionDao.getName(),
                eWorkflowTransitionDao.getCreation(),
                eWorkflowTransitionDao.getModified(),
                eWorkflowTransitionDao.getModifiedBy(),
                eWorkflowTransitionDao.getOwner(),
                eWorkflowTransitionDao.getIsDocStatus(),
                eWorkflowTransitionDao.getIdx(),
                eWorkflowTransitionDao.getState(),
                eWorkflowTransitionDao.getAction(),
                eWorkflowTransitionDao.getNextState(),
                eWorkflowTransitionDao.getAllowed(),
                eWorkflowTransitionDao.getAllowSelfApproval(),
                eWorkflowTransitionDao.getCondition(),
                eWorkflowTransitionDao.getWorkflowBuilderId(),
                eWorkflowTransitionDao.getParent(),
                eWorkflowTransitionDao.getParentField(),
                eWorkflowTransitionDao.getParentType());
    }

    public static void fromDTO(WorkflowTransitionDto vWorkflowTransitionDto, WorkflowTransitionDao eWorkflowTransitionDao) {
        eWorkflowTransitionDao.setName(vWorkflowTransitionDto.name());
        eWorkflowTransitionDao.setCreation(vWorkflowTransitionDto.creation());
        eWorkflowTransitionDao.setModified(vWorkflowTransitionDto.modified());
        eWorkflowTransitionDao.setModifiedBy(vWorkflowTransitionDto.modifiedBy());
        eWorkflowTransitionDao.setOwner(vWorkflowTransitionDto.owner());
        eWorkflowTransitionDao.setIsDocStatus(vWorkflowTransitionDto.isDocStatus());
        eWorkflowTransitionDao.setIdx(vWorkflowTransitionDto.idx());
        eWorkflowTransitionDao.setState(vWorkflowTransitionDto.state());
        eWorkflowTransitionDao.setAction(vWorkflowTransitionDto.action());
        eWorkflowTransitionDao.setNextState(vWorkflowTransitionDto.nextState());
        eWorkflowTransitionDao.setAllowed(vWorkflowTransitionDto.allowed());
        eWorkflowTransitionDao.setAllowSelfApproval(vWorkflowTransitionDto.allowSelfApproval());
        eWorkflowTransitionDao.setCondition(vWorkflowTransitionDto.condition());
        eWorkflowTransitionDao.setWorkflowBuilderId(vWorkflowTransitionDto.workflowBuilderId());
        eWorkflowTransitionDao.setParent(vWorkflowTransitionDto.parent());
        eWorkflowTransitionDao.setParentField(vWorkflowTransitionDto.parentField());
        eWorkflowTransitionDao.setParentType(vWorkflowTransitionDto.parentType());
    }
}