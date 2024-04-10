package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AutoRepeatDayDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AutoRepeatDayDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String day,
        String parent,
        String parentField,
        String parentType
) {
    public static AutoRepeatDayDto fromEntity(AutoRepeatDayDao eAutoRepeatDayDao) {
        return new AutoRepeatDayDto(
                eAutoRepeatDayDao.getName(),
                eAutoRepeatDayDao.getCreation(),
                eAutoRepeatDayDao.getModified(),
                eAutoRepeatDayDao.getModifiedBy(),
                eAutoRepeatDayDao.getOwner(),
                eAutoRepeatDayDao.getIsDocStatus(),
                eAutoRepeatDayDao.getIdx(),
                eAutoRepeatDayDao.getDay(),
                eAutoRepeatDayDao.getParent(),
                eAutoRepeatDayDao.getParentField(),
                eAutoRepeatDayDao.getParentType());
    }

    public static void fromDTO(AutoRepeatDayDto vAutoRepeatDayDto, AutoRepeatDayDao eAutoRepeatDayDao) {
        eAutoRepeatDayDao.setName(vAutoRepeatDayDto.name());
        eAutoRepeatDayDao.setCreation(vAutoRepeatDayDto.creation());
        eAutoRepeatDayDao.setModified(vAutoRepeatDayDto.modified());
        eAutoRepeatDayDao.setModifiedBy(vAutoRepeatDayDto.modifiedBy());
        eAutoRepeatDayDao.setOwner(vAutoRepeatDayDto.owner());
        eAutoRepeatDayDao.setIsDocStatus(vAutoRepeatDayDto.isDocStatus());
        eAutoRepeatDayDao.setIdx(vAutoRepeatDayDto.idx());
        eAutoRepeatDayDao.setDay(vAutoRepeatDayDto.day());
        eAutoRepeatDayDao.setParent(vAutoRepeatDayDto.parent());
        eAutoRepeatDayDao.setParentField(vAutoRepeatDayDto.parentField());
        eAutoRepeatDayDao.setParentType(vAutoRepeatDayDto.parentType());
    }
}