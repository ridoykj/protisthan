package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceNumberCardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceNumberCardDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String numberCardName,
        String label,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceNumberCardDto fromEntity(WorkspaceNumberCardDao eWorkspaceNumberCardDao) {
        return new WorkspaceNumberCardDto(
                eWorkspaceNumberCardDao.getName(),
                eWorkspaceNumberCardDao.getCreation(),
                eWorkspaceNumberCardDao.getModified(),
                eWorkspaceNumberCardDao.getModifiedBy(),
                eWorkspaceNumberCardDao.getOwner(),
                eWorkspaceNumberCardDao.getIsDocStatus(),
                eWorkspaceNumberCardDao.getIdx(),
                eWorkspaceNumberCardDao.getNumberCardName(),
                eWorkspaceNumberCardDao.getLabel(),
                eWorkspaceNumberCardDao.getParent(),
                eWorkspaceNumberCardDao.getParentField(),
                eWorkspaceNumberCardDao.getParentType());
    }

    public static void fromDTO(WorkspaceNumberCardDto vWorkspaceNumberCardDto, WorkspaceNumberCardDao eWorkspaceNumberCardDao) {
        eWorkspaceNumberCardDao.setName(vWorkspaceNumberCardDto.name());
        eWorkspaceNumberCardDao.setCreation(vWorkspaceNumberCardDto.creation());
        eWorkspaceNumberCardDao.setModified(vWorkspaceNumberCardDto.modified());
        eWorkspaceNumberCardDao.setModifiedBy(vWorkspaceNumberCardDto.modifiedBy());
        eWorkspaceNumberCardDao.setOwner(vWorkspaceNumberCardDto.owner());
        eWorkspaceNumberCardDao.setIsDocStatus(vWorkspaceNumberCardDto.isDocStatus());
        eWorkspaceNumberCardDao.setIdx(vWorkspaceNumberCardDto.idx());
        eWorkspaceNumberCardDao.setNumberCardName(vWorkspaceNumberCardDto.numberCardName());
        eWorkspaceNumberCardDao.setLabel(vWorkspaceNumberCardDto.label());
        eWorkspaceNumberCardDao.setParent(vWorkspaceNumberCardDto.parent());
        eWorkspaceNumberCardDao.setParentField(vWorkspaceNumberCardDto.parentField());
        eWorkspaceNumberCardDao.setParentType(vWorkspaceNumberCardDto.parentType());
    }
}