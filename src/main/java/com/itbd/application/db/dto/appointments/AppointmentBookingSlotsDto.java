package com.itbd.application.db.dto.appointments;

import com.itbd.application.db.dao.appointments.AppointmentBookingSlotsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record AppointmentBookingSlotsDto(
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
    public static AppointmentBookingSlotsDto fromEntity(AppointmentBookingSlotsDao eAppointmentBookingSlotsDao) {
        return new AppointmentBookingSlotsDto(
                eAppointmentBookingSlotsDao.getName(),
                eAppointmentBookingSlotsDao.getCreation(),
                eAppointmentBookingSlotsDao.getModified(),
                eAppointmentBookingSlotsDao.getModifiedBy(),
                eAppointmentBookingSlotsDao.getOwner(),
                eAppointmentBookingSlotsDao.getIsDocStatus(),
                eAppointmentBookingSlotsDao.getIdx(),
                eAppointmentBookingSlotsDao.getDayOfWeek(),
                eAppointmentBookingSlotsDao.getFromTime(),
                eAppointmentBookingSlotsDao.getToTime(),
                eAppointmentBookingSlotsDao.getParent(),
                eAppointmentBookingSlotsDao.getParentField(),
                eAppointmentBookingSlotsDao.getParentType());
    }

    public static void fromDTO(AppointmentBookingSlotsDto vAppointmentBookingSlotsDto, AppointmentBookingSlotsDao eAppointmentBookingSlotsDao) {
        eAppointmentBookingSlotsDao.setName(vAppointmentBookingSlotsDto.name());
        eAppointmentBookingSlotsDao.setCreation(vAppointmentBookingSlotsDto.creation());
        eAppointmentBookingSlotsDao.setModified(vAppointmentBookingSlotsDto.modified());
        eAppointmentBookingSlotsDao.setModifiedBy(vAppointmentBookingSlotsDto.modifiedBy());
        eAppointmentBookingSlotsDao.setOwner(vAppointmentBookingSlotsDto.owner());
        eAppointmentBookingSlotsDao.setIsDocStatus(vAppointmentBookingSlotsDto.isDocStatus());
        eAppointmentBookingSlotsDao.setIdx(vAppointmentBookingSlotsDto.idx());
        eAppointmentBookingSlotsDao.setDayOfWeek(vAppointmentBookingSlotsDto.dayOfWeek());
        eAppointmentBookingSlotsDao.setFromTime(vAppointmentBookingSlotsDto.fromTime());
        eAppointmentBookingSlotsDao.setToTime(vAppointmentBookingSlotsDto.toTime());
        eAppointmentBookingSlotsDao.setParent(vAppointmentBookingSlotsDto.parent());
        eAppointmentBookingSlotsDao.setParentField(vAppointmentBookingSlotsDto.parentField());
        eAppointmentBookingSlotsDao.setParentType(vAppointmentBookingSlotsDto.parentType());
    }
}