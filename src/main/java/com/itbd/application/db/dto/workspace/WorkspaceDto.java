package com.itbd.application.db.dto.workspace;

import com.itbd.application.db.dao.workspace.WorkspaceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record WorkspaceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String title,
        BigDecimal sequenceId,
        String forUser,
        String parentPage,
        String module,
        String icon,
        String indicatorColor,
        String restrictToDomain,
        Boolean hideCustom,
        Boolean publics,
        Boolean isHidden,
        String content,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkspaceDto fromEntity(WorkspaceDao eWorkspaceDao) {
        return new WorkspaceDto(
                eWorkspaceDao.getName(),
                eWorkspaceDao.getCreation(),
                eWorkspaceDao.getModified(),
                eWorkspaceDao.getModifiedBy(),
                eWorkspaceDao.getOwner(),
                eWorkspaceDao.getIsDocStatus(),
                eWorkspaceDao.getIdx(),
                eWorkspaceDao.getLabel(),
                eWorkspaceDao.getTitle(),
                eWorkspaceDao.getSequenceId(),
                eWorkspaceDao.getForUser(),
                eWorkspaceDao.getParentPage(),
                eWorkspaceDao.getModule(),
                eWorkspaceDao.getIcon(),
                eWorkspaceDao.getIndicatorColor(),
                eWorkspaceDao.getRestrictToDomain(),
                eWorkspaceDao.getHideCustom(),
                eWorkspaceDao.getPublics(),
                eWorkspaceDao.getIsHidden(),
                eWorkspaceDao.getContent(),
                eWorkspaceDao.getUserTags(),
                eWorkspaceDao.getComments(),
                eWorkspaceDao.getAssign(),
                eWorkspaceDao.getLikedBy());
    }

    public static void fromDTO(WorkspaceDto vWorkspaceDto, WorkspaceDao eWorkspaceDao) {
        eWorkspaceDao.setName(vWorkspaceDto.name());
        eWorkspaceDao.setCreation(vWorkspaceDto.creation());
        eWorkspaceDao.setModified(vWorkspaceDto.modified());
        eWorkspaceDao.setModifiedBy(vWorkspaceDto.modifiedBy());
        eWorkspaceDao.setOwner(vWorkspaceDto.owner());
        eWorkspaceDao.setIsDocStatus(vWorkspaceDto.isDocStatus());
        eWorkspaceDao.setIdx(vWorkspaceDto.idx());
        eWorkspaceDao.setLabel(vWorkspaceDto.label());
        eWorkspaceDao.setTitle(vWorkspaceDto.title());
        eWorkspaceDao.setSequenceId(vWorkspaceDto.sequenceId());
        eWorkspaceDao.setForUser(vWorkspaceDto.forUser());
        eWorkspaceDao.setParentPage(vWorkspaceDto.parentPage());
        eWorkspaceDao.setModule(vWorkspaceDto.module());
        eWorkspaceDao.setIcon(vWorkspaceDto.icon());
        eWorkspaceDao.setIndicatorColor(vWorkspaceDto.indicatorColor());
        eWorkspaceDao.setRestrictToDomain(vWorkspaceDto.restrictToDomain());
        eWorkspaceDao.setHideCustom(vWorkspaceDto.hideCustom());
        eWorkspaceDao.setPublics(vWorkspaceDto.publics());
        eWorkspaceDao.setIsHidden(vWorkspaceDto.isHidden());
        eWorkspaceDao.setContent(vWorkspaceDto.content());
        eWorkspaceDao.setUserTags(vWorkspaceDto.userTags());
        eWorkspaceDao.setComments(vWorkspaceDto.comments());
        eWorkspaceDao.setAssign(vWorkspaceDto.assign());
        eWorkspaceDao.setLikedBy(vWorkspaceDto.likedBy());
    }
}