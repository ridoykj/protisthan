package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceCustomBlockDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceCustomBlockDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customBlockName,
        String label,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceCustomBlockDto fromEntity(WorkspaceCustomBlockDao eWorkspaceCustomBlDao) {
        return new WorkspaceCustomBlockDto(
                eWorkspaceCustomBlDao.getName(),
                eWorkspaceCustomBlDao.getCreation(),
                eWorkspaceCustomBlDao.getModified(),
                eWorkspaceCustomBlDao.getModifiedBy(),
                eWorkspaceCustomBlDao.getOwner(),
                eWorkspaceCustomBlDao.getIsDocStatus(),
                eWorkspaceCustomBlDao.getIdx(),
                eWorkspaceCustomBlDao.getCustomBlockName(),
                eWorkspaceCustomBlDao.getLabel(),
                eWorkspaceCustomBlDao.getParent(),
                eWorkspaceCustomBlDao.getParentField(),
                eWorkspaceCustomBlDao.getParentType());
    }

    public static void fromDTO(WorkspaceCustomBlockDto vWorkspaceCustomBlDto, WorkspaceCustomBlockDao eWorkspaceCustomBlDao) {
        eWorkspaceCustomBlDao.setName(vWorkspaceCustomBlDto.name());
        eWorkspaceCustomBlDao.setCreation(vWorkspaceCustomBlDto.creation());
        eWorkspaceCustomBlDao.setModified(vWorkspaceCustomBlDto.modified());
        eWorkspaceCustomBlDao.setModifiedBy(vWorkspaceCustomBlDto.modifiedBy());
        eWorkspaceCustomBlDao.setOwner(vWorkspaceCustomBlDto.owner());
        eWorkspaceCustomBlDao.setIsDocStatus(vWorkspaceCustomBlDto.isDocStatus());
        eWorkspaceCustomBlDao.setIdx(vWorkspaceCustomBlDto.idx());
        eWorkspaceCustomBlDao.setCustomBlockName(vWorkspaceCustomBlDto.customBlockName());
        eWorkspaceCustomBlDao.setLabel(vWorkspaceCustomBlDto.label());
        eWorkspaceCustomBlDao.setParent(vWorkspaceCustomBlDto.parent());
        eWorkspaceCustomBlDao.setParentField(vWorkspaceCustomBlDto.parentField());
        eWorkspaceCustomBlDao.setParentType(vWorkspaceCustomBlDto.parentType());
    }
}