package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceShortcutDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceShortcutDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String type,
        String linkTo,
        String url,
        String docView,
        String kanbanBoard,
        String label,
        String icon,
        String restrictToDomain,
        String statsFilter,
        String color,
        String format,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceShortcutDto fromEntity(WorkspaceShortcutDao eWorkspaceShortcutDao) {
        return new WorkspaceShortcutDto(
                eWorkspaceShortcutDao.getName(),
                eWorkspaceShortcutDao.getCreation(),
                eWorkspaceShortcutDao.getModified(),
                eWorkspaceShortcutDao.getModifiedBy(),
                eWorkspaceShortcutDao.getOwner(),
                eWorkspaceShortcutDao.getIsDocStatus(),
                eWorkspaceShortcutDao.getIdx(),
                eWorkspaceShortcutDao.getType(),
                eWorkspaceShortcutDao.getLinkTo(),
                eWorkspaceShortcutDao.getUrl(),
                eWorkspaceShortcutDao.getDocView(),
                eWorkspaceShortcutDao.getKanbanBoard(),
                eWorkspaceShortcutDao.getLabel(),
                eWorkspaceShortcutDao.getIcon(),
                eWorkspaceShortcutDao.getRestrictToDomain(),
                eWorkspaceShortcutDao.getStatsFilter(),
                eWorkspaceShortcutDao.getColor(),
                eWorkspaceShortcutDao.getFormat(),
                eWorkspaceShortcutDao.getParent(),
                eWorkspaceShortcutDao.getParentField(),
                eWorkspaceShortcutDao.getParentType());
    }

    public static void fromDTO(WorkspaceShortcutDto vWorkspaceShortcutDto, WorkspaceShortcutDao eWorkspaceShortcutDao) {
        eWorkspaceShortcutDao.setName(vWorkspaceShortcutDto.name());
        eWorkspaceShortcutDao.setCreation(vWorkspaceShortcutDto.creation());
        eWorkspaceShortcutDao.setModified(vWorkspaceShortcutDto.modified());
        eWorkspaceShortcutDao.setModifiedBy(vWorkspaceShortcutDto.modifiedBy());
        eWorkspaceShortcutDao.setOwner(vWorkspaceShortcutDto.owner());
        eWorkspaceShortcutDao.setIsDocStatus(vWorkspaceShortcutDto.isDocStatus());
        eWorkspaceShortcutDao.setIdx(vWorkspaceShortcutDto.idx());
        eWorkspaceShortcutDao.setType(vWorkspaceShortcutDto.type());
        eWorkspaceShortcutDao.setLinkTo(vWorkspaceShortcutDto.linkTo());
        eWorkspaceShortcutDao.setUrl(vWorkspaceShortcutDto.url());
        eWorkspaceShortcutDao.setDocView(vWorkspaceShortcutDto.docView());
        eWorkspaceShortcutDao.setKanbanBoard(vWorkspaceShortcutDto.kanbanBoard());
        eWorkspaceShortcutDao.setLabel(vWorkspaceShortcutDto.label());
        eWorkspaceShortcutDao.setIcon(vWorkspaceShortcutDto.icon());
        eWorkspaceShortcutDao.setRestrictToDomain(vWorkspaceShortcutDto.restrictToDomain());
        eWorkspaceShortcutDao.setStatsFilter(vWorkspaceShortcutDto.statsFilter());
        eWorkspaceShortcutDao.setColor(vWorkspaceShortcutDto.color());
        eWorkspaceShortcutDao.setFormat(vWorkspaceShortcutDto.format());
        eWorkspaceShortcutDao.setParent(vWorkspaceShortcutDto.parent());
        eWorkspaceShortcutDao.setParentField(vWorkspaceShortcutDto.parentField());
        eWorkspaceShortcutDao.setParentType(vWorkspaceShortcutDto.parentType());
    }
}