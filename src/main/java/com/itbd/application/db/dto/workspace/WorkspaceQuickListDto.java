package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceQuickListDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceQuickListDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String label,
        String quickListFilter,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceQuickListDto fromEntity(WorkspaceQuickListDao eWorkspaceQuickListDao) {
        return new WorkspaceQuickListDto(
                eWorkspaceQuickListDao.getName(),
                eWorkspaceQuickListDao.getCreation(),
                eWorkspaceQuickListDao.getModified(),
                eWorkspaceQuickListDao.getModifiedBy(),
                eWorkspaceQuickListDao.getOwner(),
                eWorkspaceQuickListDao.getIsDocStatus(),
                eWorkspaceQuickListDao.getIdx(),
                eWorkspaceQuickListDao.getDocumentType(),
                eWorkspaceQuickListDao.getLabel(),
                eWorkspaceQuickListDao.getQuickListFilter(),
                eWorkspaceQuickListDao.getParent(),
                eWorkspaceQuickListDao.getParentField(),
                eWorkspaceQuickListDao.getParentType());
    }

    public static void fromDTO(WorkspaceQuickListDto vWorkspaceQuickListDto, WorkspaceQuickListDao eWorkspaceQuickListDao) {
        eWorkspaceQuickListDao.setName(vWorkspaceQuickListDto.name());
        eWorkspaceQuickListDao.setCreation(vWorkspaceQuickListDto.creation());
        eWorkspaceQuickListDao.setModified(vWorkspaceQuickListDto.modified());
        eWorkspaceQuickListDao.setModifiedBy(vWorkspaceQuickListDto.modifiedBy());
        eWorkspaceQuickListDao.setOwner(vWorkspaceQuickListDto.owner());
        eWorkspaceQuickListDao.setIsDocStatus(vWorkspaceQuickListDto.isDocStatus());
        eWorkspaceQuickListDao.setIdx(vWorkspaceQuickListDto.idx());
        eWorkspaceQuickListDao.setDocumentType(vWorkspaceQuickListDto.documentType());
        eWorkspaceQuickListDao.setLabel(vWorkspaceQuickListDto.label());
        eWorkspaceQuickListDao.setQuickListFilter(vWorkspaceQuickListDto.quickListFilter());
        eWorkspaceQuickListDao.setParent(vWorkspaceQuickListDto.parent());
        eWorkspaceQuickListDao.setParentField(vWorkspaceQuickListDto.parentField());
        eWorkspaceQuickListDao.setParentType(vWorkspaceQuickListDto.parentType());
    }
}