package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HolidayDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record HolidayDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate holidayDate,
        Boolean weeklyOff,
        String description,
        String parent,
        String parentField,
        String parentType
) {
    public static HolidayDto fromEntity(HolidayDao eHolidayDao) {
        return new HolidayDto(
                eHolidayDao.getName(),
                eHolidayDao.getCreation(),
                eHolidayDao.getModified(),
                eHolidayDao.getModifiedBy(),
                eHolidayDao.getOwner(),
                eHolidayDao.getIsDocStatus(),
                eHolidayDao.getIdx(),
                eHolidayDao.getHolidayDate(),
                eHolidayDao.getWeeklyOff(),
                eHolidayDao.getDescription(),
                eHolidayDao.getParent(),
                eHolidayDao.getParentField(),
                eHolidayDao.getParentType());
    }

    public static void fromDTO(HolidayDto vHolidayDto, HolidayDao eHolidayDao) {
        eHolidayDao.setName(vHolidayDto.name());
        eHolidayDao.setCreation(vHolidayDto.creation());
        eHolidayDao.setModified(vHolidayDto.modified());
        eHolidayDao.setModifiedBy(vHolidayDto.modifiedBy());
        eHolidayDao.setOwner(vHolidayDto.owner());
        eHolidayDao.setIsDocStatus(vHolidayDto.isDocStatus());
        eHolidayDao.setIdx(vHolidayDto.idx());
        eHolidayDao.setHolidayDate(vHolidayDto.holidayDate());
        eHolidayDao.setWeeklyOff(vHolidayDto.weeklyOff());
        eHolidayDao.setDescription(vHolidayDto.description());
        eHolidayDao.setParent(vHolidayDto.parent());
        eHolidayDao.setParentField(vHolidayDto.parentField());
        eHolidayDao.setParentType(vHolidayDto.parentType());
    }
}