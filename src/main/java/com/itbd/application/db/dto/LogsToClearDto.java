package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.LogsToClearDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LogsToClearDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String refDocType,
        Integer days,
        String parent,
        String parentField,
        String parentType
) {
    public static LogsToClearDto fromEntity(LogsToClearDao eLogsToClearDao) {
        return new LogsToClearDto(
                eLogsToClearDao.getName(),
                eLogsToClearDao.getCreation(),
                eLogsToClearDao.getModified(),
                eLogsToClearDao.getModifiedBy(),
                eLogsToClearDao.getOwner(),
                eLogsToClearDao.getIsDocStatus(),
                eLogsToClearDao.getIdx(),
                eLogsToClearDao.getRefDocType(),
                eLogsToClearDao.getDays(),
                eLogsToClearDao.getParent(),
                eLogsToClearDao.getParentField(),
                eLogsToClearDao.getParentType());
    }

    public static void fromDTO(LogsToClearDto vLogsToClearDto, LogsToClearDao eLogsToClearDao) {
        eLogsToClearDao.setName(vLogsToClearDto.name());
        eLogsToClearDao.setCreation(vLogsToClearDto.creation());
        eLogsToClearDao.setModified(vLogsToClearDto.modified());
        eLogsToClearDao.setModifiedBy(vLogsToClearDto.modifiedBy());
        eLogsToClearDao.setOwner(vLogsToClearDto.owner());
        eLogsToClearDao.setIsDocStatus(vLogsToClearDto.isDocStatus());
        eLogsToClearDao.setIdx(vLogsToClearDto.idx());
        eLogsToClearDao.setRefDocType(vLogsToClearDto.refDocType());
        eLogsToClearDao.setDays(vLogsToClearDto.days());
        eLogsToClearDao.setParent(vLogsToClearDto.parent());
        eLogsToClearDao.setParentField(vLogsToClearDto.parentField());
        eLogsToClearDao.setParentType(vLogsToClearDto.parentType());
    }
}