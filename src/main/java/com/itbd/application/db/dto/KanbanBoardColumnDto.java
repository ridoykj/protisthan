package com.itbd.application.db.dto;

import com.itbd.application.db.dao.KanbanBoardColumnDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record KanbanBoardColumnDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String columnName,
        String status,
        String indicator,
        String order,
        String parent,
        String parentField,
        String parentType
) {
    public static KanbanBoardColumnDto fromEntity(KanbanBoardColumnDao eKanbanBoardColumnDao) {
        return new KanbanBoardColumnDto(
                eKanbanBoardColumnDao.getName(),
                eKanbanBoardColumnDao.getCreation(),
                eKanbanBoardColumnDao.getModified(),
                eKanbanBoardColumnDao.getModifiedBy(),
                eKanbanBoardColumnDao.getOwner(),
                eKanbanBoardColumnDao.getIsDocStatus(),
                eKanbanBoardColumnDao.getIdx(),
                eKanbanBoardColumnDao.getColumnName(),
                eKanbanBoardColumnDao.getStatus(),
                eKanbanBoardColumnDao.getIndicator(),
                eKanbanBoardColumnDao.getOrder(),
                eKanbanBoardColumnDao.getParent(),
                eKanbanBoardColumnDao.getParentField(),
                eKanbanBoardColumnDao.getParentType());
    }

    public static void fromDTO(KanbanBoardColumnDto vKanbanBoardColumnDto, KanbanBoardColumnDao eKanbanBoardColumnDao) {
        eKanbanBoardColumnDao.setName(vKanbanBoardColumnDto.name());
        eKanbanBoardColumnDao.setCreation(vKanbanBoardColumnDto.creation());
        eKanbanBoardColumnDao.setModified(vKanbanBoardColumnDto.modified());
        eKanbanBoardColumnDao.setModifiedBy(vKanbanBoardColumnDto.modifiedBy());
        eKanbanBoardColumnDao.setOwner(vKanbanBoardColumnDto.owner());
        eKanbanBoardColumnDao.setIsDocStatus(vKanbanBoardColumnDto.isDocStatus());
        eKanbanBoardColumnDao.setIdx(vKanbanBoardColumnDto.idx());
        eKanbanBoardColumnDao.setColumnName(vKanbanBoardColumnDto.columnName());
        eKanbanBoardColumnDao.setStatus(vKanbanBoardColumnDto.status());
        eKanbanBoardColumnDao.setIndicator(vKanbanBoardColumnDto.indicator());
        eKanbanBoardColumnDao.setOrder(vKanbanBoardColumnDto.order());
        eKanbanBoardColumnDao.setParent(vKanbanBoardColumnDto.parent());
        eKanbanBoardColumnDao.setParentField(vKanbanBoardColumnDto.parentField());
        eKanbanBoardColumnDao.setParentType(vKanbanBoardColumnDto.parentType());
    }
}