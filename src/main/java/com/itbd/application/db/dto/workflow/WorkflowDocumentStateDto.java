package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowDocumentStateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowDocumentStateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String state,
        String docStatus,
        String updateField,
        String updateValue,
        Boolean isOptionalState,
        Boolean avoidStatusOverride,
        String nextActionEmailTemplate,
        String allowEdit,
        String message,
        String workflowBuilderId,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkflowDocumentStateDto fromEntity(WorkflowDocumentStateDao eWorkflowDocumentStateDao) {
        return new WorkflowDocumentStateDto(
                eWorkflowDocumentStateDao.getName(),
                eWorkflowDocumentStateDao.getCreation(),
                eWorkflowDocumentStateDao.getModified(),
                eWorkflowDocumentStateDao.getModifiedBy(),
                eWorkflowDocumentStateDao.getOwner(),
                eWorkflowDocumentStateDao.getIsDocStatus(),
                eWorkflowDocumentStateDao.getIdx(),
                eWorkflowDocumentStateDao.getState(),
                eWorkflowDocumentStateDao.getDocStatus(),
                eWorkflowDocumentStateDao.getUpdateField(),
                eWorkflowDocumentStateDao.getUpdateValue(),
                eWorkflowDocumentStateDao.getIsOptionalState(),
                eWorkflowDocumentStateDao.getAvoidStatusOverride(),
                eWorkflowDocumentStateDao.getNextActionEmailTemplate(),
                eWorkflowDocumentStateDao.getAllowEdit(),
                eWorkflowDocumentStateDao.getMessage(),
                eWorkflowDocumentStateDao.getWorkflowBuilderId(),
                eWorkflowDocumentStateDao.getParent(),
                eWorkflowDocumentStateDao.getParentField(),
                eWorkflowDocumentStateDao.getParentType());
    }

    public static void fromDTO(WorkflowDocumentStateDto vWorkflowDocumentStateDto, WorkflowDocumentStateDao eWorkflowDocumentStateDao) {
        eWorkflowDocumentStateDao.setName(vWorkflowDocumentStateDto.name());
        eWorkflowDocumentStateDao.setCreation(vWorkflowDocumentStateDto.creation());
        eWorkflowDocumentStateDao.setModified(vWorkflowDocumentStateDto.modified());
        eWorkflowDocumentStateDao.setModifiedBy(vWorkflowDocumentStateDto.modifiedBy());
        eWorkflowDocumentStateDao.setOwner(vWorkflowDocumentStateDto.owner());
        eWorkflowDocumentStateDao.setIsDocStatus(vWorkflowDocumentStateDto.isDocStatus());
        eWorkflowDocumentStateDao.setIdx(vWorkflowDocumentStateDto.idx());
        eWorkflowDocumentStateDao.setState(vWorkflowDocumentStateDto.state());
        eWorkflowDocumentStateDao.setDocStatus(vWorkflowDocumentStateDto.docStatus());
        eWorkflowDocumentStateDao.setUpdateField(vWorkflowDocumentStateDto.updateField());
        eWorkflowDocumentStateDao.setUpdateValue(vWorkflowDocumentStateDto.updateValue());
        eWorkflowDocumentStateDao.setIsOptionalState(vWorkflowDocumentStateDto.isOptionalState());
        eWorkflowDocumentStateDao.setAvoidStatusOverride(vWorkflowDocumentStateDto.avoidStatusOverride());
        eWorkflowDocumentStateDao.setNextActionEmailTemplate(vWorkflowDocumentStateDto.nextActionEmailTemplate());
        eWorkflowDocumentStateDao.setAllowEdit(vWorkflowDocumentStateDto.allowEdit());
        eWorkflowDocumentStateDao.setMessage(vWorkflowDocumentStateDto.message());
        eWorkflowDocumentStateDao.setWorkflowBuilderId(vWorkflowDocumentStateDto.workflowBuilderId());
        eWorkflowDocumentStateDao.setParent(vWorkflowDocumentStateDto.parent());
        eWorkflowDocumentStateDao.setParentField(vWorkflowDocumentStateDto.parentField());
        eWorkflowDocumentStateDao.setParentType(vWorkflowDocumentStateDto.parentType());
    }
}