package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WorkspaceLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String type,
        String label,
        String icon,
        String description,
        Boolean hidden,
        String linkType,
        String linkTo,
        String dependencies,
        String onlyFor,
        Boolean onboard,
        Boolean isQueryReport,
        Integer linkCount,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkspaceLinkDto fromEntity(WorkspaceLinkDao eWorkspaceLinkDao) {
        return new WorkspaceLinkDto(
                eWorkspaceLinkDao.getName(),
                eWorkspaceLinkDao.getCreation(),
                eWorkspaceLinkDao.getModified(),
                eWorkspaceLinkDao.getModifiedBy(),
                eWorkspaceLinkDao.getOwner(),
                eWorkspaceLinkDao.getIsDocStatus(),
                eWorkspaceLinkDao.getIdx(),
                eWorkspaceLinkDao.getType(),
                eWorkspaceLinkDao.getLabel(),
                eWorkspaceLinkDao.getIcon(),
                eWorkspaceLinkDao.getDescription(),
                eWorkspaceLinkDao.getHidden(),
                eWorkspaceLinkDao.getLinkType(),
                eWorkspaceLinkDao.getLinkTo(),
                eWorkspaceLinkDao.getDependencies(),
                eWorkspaceLinkDao.getOnlyFor(),
                eWorkspaceLinkDao.getOnboard(),
                eWorkspaceLinkDao.getIsQueryReport(),
                eWorkspaceLinkDao.getLinkCount(),
                eWorkspaceLinkDao.getParent(),
                eWorkspaceLinkDao.getParentField(),
                eWorkspaceLinkDao.getParentType());
    }

    public static void fromDTO(WorkspaceLinkDto vWorkspaceLinkDto, WorkspaceLinkDao eWorkspaceLinkDao) {
        eWorkspaceLinkDao.setName(vWorkspaceLinkDto.name());
        eWorkspaceLinkDao.setCreation(vWorkspaceLinkDto.creation());
        eWorkspaceLinkDao.setModified(vWorkspaceLinkDto.modified());
        eWorkspaceLinkDao.setModifiedBy(vWorkspaceLinkDto.modifiedBy());
        eWorkspaceLinkDao.setOwner(vWorkspaceLinkDto.owner());
        eWorkspaceLinkDao.setIsDocStatus(vWorkspaceLinkDto.isDocStatus());
        eWorkspaceLinkDao.setIdx(vWorkspaceLinkDto.idx());
        eWorkspaceLinkDao.setType(vWorkspaceLinkDto.type());
        eWorkspaceLinkDao.setLabel(vWorkspaceLinkDto.label());
        eWorkspaceLinkDao.setIcon(vWorkspaceLinkDto.icon());
        eWorkspaceLinkDao.setDescription(vWorkspaceLinkDto.description());
        eWorkspaceLinkDao.setHidden(vWorkspaceLinkDto.hidden());
        eWorkspaceLinkDao.setLinkType(vWorkspaceLinkDto.linkType());
        eWorkspaceLinkDao.setLinkTo(vWorkspaceLinkDto.linkTo());
        eWorkspaceLinkDao.setDependencies(vWorkspaceLinkDto.dependencies());
        eWorkspaceLinkDao.setOnlyFor(vWorkspaceLinkDto.onlyFor());
        eWorkspaceLinkDao.setOnboard(vWorkspaceLinkDto.onboard());
        eWorkspaceLinkDao.setIsQueryReport(vWorkspaceLinkDto.isQueryReport());
        eWorkspaceLinkDao.setLinkCount(vWorkspaceLinkDto.linkCount());
        eWorkspaceLinkDao.setParent(vWorkspaceLinkDto.parent());
        eWorkspaceLinkDao.setParentField(vWorkspaceLinkDto.parentField());
        eWorkspaceLinkDao.setParentType(vWorkspaceLinkDto.parentType());
    }
}