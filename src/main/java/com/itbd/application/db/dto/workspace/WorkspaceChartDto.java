package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceChartDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceChartDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String chartName,
        String label,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceChartDto fromEntity(WorkspaceChartDao eWorkspaceChDao) {
        return new WorkspaceChartDto(
                eWorkspaceChDao.getName(),
                eWorkspaceChDao.getCreation(),
                eWorkspaceChDao.getModified(),
                eWorkspaceChDao.getModifiedBy(),
                eWorkspaceChDao.getOwner(),
                eWorkspaceChDao.getIsDocStatus(),
                eWorkspaceChDao.getIdx(),
                eWorkspaceChDao.getChartName(),
                eWorkspaceChDao.getLabel(),
                eWorkspaceChDao.getParent(),
                eWorkspaceChDao.getParentField(),
                eWorkspaceChDao.getParentType());
    }

    public static void fromDTO(WorkspaceChartDto vWorkspaceChDto, WorkspaceChartDao eWorkspaceChDao) {
        eWorkspaceChDao.setName(vWorkspaceChDto.name());
        eWorkspaceChDao.setCreation(vWorkspaceChDto.creation());
        eWorkspaceChDao.setModified(vWorkspaceChDto.modified());
        eWorkspaceChDao.setModifiedBy(vWorkspaceChDto.modifiedBy());
        eWorkspaceChDao.setOwner(vWorkspaceChDto.owner());
        eWorkspaceChDao.setIsDocStatus(vWorkspaceChDto.isDocStatus());
        eWorkspaceChDao.setIdx(vWorkspaceChDto.idx());
        eWorkspaceChDao.setChartName(vWorkspaceChDto.chartName());
        eWorkspaceChDao.setLabel(vWorkspaceChDto.label());
        eWorkspaceChDao.setParent(vWorkspaceChDto.parent());
        eWorkspaceChDao.setParentField(vWorkspaceChDto.parentField());
        eWorkspaceChDao.setParentType(vWorkspaceChDto.parentType());
    }
}