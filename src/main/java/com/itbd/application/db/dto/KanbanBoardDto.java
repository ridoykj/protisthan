package com.itbd.application.db.dto;

import com.itbd.application.db.dao.KanbanBoardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record KanbanBoardDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String kanbanBoardName,
        String referenceDocType,
        String fieldName,
        Boolean privates,
        Boolean showLabels,
        String filters,
        String fields,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static KanbanBoardDto fromEntity(KanbanBoardDao eKanbanBoardDao) {
        return new KanbanBoardDto(
                eKanbanBoardDao.getName(),
                eKanbanBoardDao.getCreation(),
                eKanbanBoardDao.getModified(),
                eKanbanBoardDao.getModifiedBy(),
                eKanbanBoardDao.getOwner(),
                eKanbanBoardDao.getIsDocStatus(),
                eKanbanBoardDao.getIdx(),
                eKanbanBoardDao.getKanbanBoardName(),
                eKanbanBoardDao.getReferenceDocType(),
                eKanbanBoardDao.getFieldName(),
                eKanbanBoardDao.getPrivates(),
                eKanbanBoardDao.getShowLabels(),
                eKanbanBoardDao.getFilters(),
                eKanbanBoardDao.getFields(),
                eKanbanBoardDao.getUserTags(),
                eKanbanBoardDao.getComments(),
                eKanbanBoardDao.getAssign(),
                eKanbanBoardDao.getLikedBy());
    }

    public static void fromDTO(KanbanBoardDto vKanbanBoardDto, KanbanBoardDao eKanbanBoardDao) {
        eKanbanBoardDao.setName(vKanbanBoardDto.name());
        eKanbanBoardDao.setCreation(vKanbanBoardDto.creation());
        eKanbanBoardDao.setModified(vKanbanBoardDto.modified());
        eKanbanBoardDao.setModifiedBy(vKanbanBoardDto.modifiedBy());
        eKanbanBoardDao.setOwner(vKanbanBoardDto.owner());
        eKanbanBoardDao.setIsDocStatus(vKanbanBoardDto.isDocStatus());
        eKanbanBoardDao.setIdx(vKanbanBoardDto.idx());
        eKanbanBoardDao.setKanbanBoardName(vKanbanBoardDto.kanbanBoardName());
        eKanbanBoardDao.setReferenceDocType(vKanbanBoardDto.referenceDocType());
        eKanbanBoardDao.setFieldName(vKanbanBoardDto.fieldName());
        eKanbanBoardDao.setPrivates(vKanbanBoardDto.privates());
        eKanbanBoardDao.setShowLabels(vKanbanBoardDto.showLabels());
        eKanbanBoardDao.setFilters(vKanbanBoardDto.filters());
        eKanbanBoardDao.setFields(vKanbanBoardDto.fields());
        eKanbanBoardDao.setUserTags(vKanbanBoardDto.userTags());
        eKanbanBoardDao.setComments(vKanbanBoardDto.comments());
        eKanbanBoardDao.setAssign(vKanbanBoardDto.assign());
        eKanbanBoardDao.setLikedBy(vKanbanBoardDto.likedBy());
    }
}