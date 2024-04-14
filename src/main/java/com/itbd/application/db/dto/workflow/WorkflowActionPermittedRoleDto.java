package com.itbd.application.db.dto.workflow;

import com.itbd.application.db.dao.workflow.WorkflowActionPermittedRoleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkflowActionPermittedRoleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String role,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkflowActionPermittedRoleDto fromEntity(WorkflowActionPermittedRoleDao eWorkflowActionPermittedRoleDao) {
        return new WorkflowActionPermittedRoleDto(
                eWorkflowActionPermittedRoleDao.getName(),
                eWorkflowActionPermittedRoleDao.getCreation(),
                eWorkflowActionPermittedRoleDao.getModified(),
                eWorkflowActionPermittedRoleDao.getModifiedBy(),
                eWorkflowActionPermittedRoleDao.getOwner(),
                eWorkflowActionPermittedRoleDao.getIsDocStatus(),
                eWorkflowActionPermittedRoleDao.getIdx(),
                eWorkflowActionPermittedRoleDao.getRole(),
                eWorkflowActionPermittedRoleDao.getParent(),
                eWorkflowActionPermittedRoleDao.getParentField(),
                eWorkflowActionPermittedRoleDao.getParentType());
    }

    public static void fromDTO(WorkflowActionPermittedRoleDto vWorkflowActionPermittedRoleDto, WorkflowActionPermittedRoleDao eWorkflowActionPermittedRoleDao) {
        eWorkflowActionPermittedRoleDao.setName(vWorkflowActionPermittedRoleDto.name());
        eWorkflowActionPermittedRoleDao.setCreation(vWorkflowActionPermittedRoleDto.creation());
        eWorkflowActionPermittedRoleDao.setModified(vWorkflowActionPermittedRoleDto.modified());
        eWorkflowActionPermittedRoleDao.setModifiedBy(vWorkflowActionPermittedRoleDto.modifiedBy());
        eWorkflowActionPermittedRoleDao.setOwner(vWorkflowActionPermittedRoleDto.owner());
        eWorkflowActionPermittedRoleDao.setIsDocStatus(vWorkflowActionPermittedRoleDto.isDocStatus());
        eWorkflowActionPermittedRoleDao.setIdx(vWorkflowActionPermittedRoleDto.idx());
        eWorkflowActionPermittedRoleDao.setRole(vWorkflowActionPermittedRoleDto.role());
        eWorkflowActionPermittedRoleDao.setParent(vWorkflowActionPermittedRoleDto.parent());
        eWorkflowActionPermittedRoleDao.setParentField(vWorkflowActionPermittedRoleDto.parentField());
        eWorkflowActionPermittedRoleDao.setParentType(vWorkflowActionPermittedRoleDto.parentType());
    }
}