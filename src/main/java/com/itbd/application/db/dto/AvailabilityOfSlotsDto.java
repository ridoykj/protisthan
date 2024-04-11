package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AvailabilityOfSlotsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record AvailabilityOfSlotsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dayOfWeek,
        LocalTime fromTime,
        LocalTime toTime,
        String parent,
        String parentField,
        String parentType
) {
    public static AvailabilityOfSlotsDto fromEntity(AvailabilityOfSlotsDao eAvailabilityOfSlotsDao) {
        return new AvailabilityOfSlotsDto(
                eAvailabilityOfSlotsDao.getName(),
                eAvailabilityOfSlotsDao.getCreation(),
                eAvailabilityOfSlotsDao.getModified(),
                eAvailabilityOfSlotsDao.getModifiedBy(),
                eAvailabilityOfSlotsDao.getOwner(),
                eAvailabilityOfSlotsDao.getIsDocStatus(),
                eAvailabilityOfSlotsDao.getIdx(),
                eAvailabilityOfSlotsDao.getDayOfWeek(),
                eAvailabilityOfSlotsDao.getFromTime(),
                eAvailabilityOfSlotsDao.getToTime(),
                eAvailabilityOfSlotsDao.getParent(),
                eAvailabilityOfSlotsDao.getParentField(),
                eAvailabilityOfSlotsDao.getParentType());
    }

    public static void fromDTO(AvailabilityOfSlotsDto vAvailabilityOfSlotsDto, AvailabilityOfSlotsDao eAvailabilityOfSlotsDao) {
        eAvailabilityOfSlotsDao.setName(vAvailabilityOfSlotsDto.name());
        eAvailabilityOfSlotsDao.setCreation(vAvailabilityOfSlotsDto.creation());
        eAvailabilityOfSlotsDao.setModified(vAvailabilityOfSlotsDto.modified());
        eAvailabilityOfSlotsDao.setModifiedBy(vAvailabilityOfSlotsDto.modifiedBy());
        eAvailabilityOfSlotsDao.setOwner(vAvailabilityOfSlotsDto.owner());
        eAvailabilityOfSlotsDao.setIsDocStatus(vAvailabilityOfSlotsDto.isDocStatus());
        eAvailabilityOfSlotsDao.setIdx(vAvailabilityOfSlotsDto.idx());
        eAvailabilityOfSlotsDao.setDayOfWeek(vAvailabilityOfSlotsDto.dayOfWeek());
        eAvailabilityOfSlotsDao.setFromTime(vAvailabilityOfSlotsDto.fromTime());
        eAvailabilityOfSlotsDao.setToTime(vAvailabilityOfSlotsDto.toTime());
        eAvailabilityOfSlotsDao.setParent(vAvailabilityOfSlotsDto.parent());
        eAvailabilityOfSlotsDao.setParentField(vAvailabilityOfSlotsDto.parentField());
        eAvailabilityOfSlotsDao.setParentType(vAvailabilityOfSlotsDto.parentType());
    }
}