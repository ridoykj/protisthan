package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ServiceDayDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record ServiceDayDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workday,
        LocalTime startTime,
        LocalTime endTime,
        String parent,
        String parentField,
        String parentType
) {
    public static ServiceDayDto fromEntity(ServiceDayDao eServiceDayDao) {
        return new ServiceDayDto(
                eServiceDayDao.getName(),
                eServiceDayDao.getCreation(),
                eServiceDayDao.getModified(),
                eServiceDayDao.getModifiedBy(),
                eServiceDayDao.getOwner(),
                eServiceDayDao.getIsDocStatus(),
                eServiceDayDao.getIdx(),
                eServiceDayDao.getWorkday(),
                eServiceDayDao.getStartTime(),
                eServiceDayDao.getEndTime(),
                eServiceDayDao.getParent(),
                eServiceDayDao.getParentField(),
                eServiceDayDao.getParentType());
    }

    public static void fromDTO(ServiceDayDto vServiceDayDto, ServiceDayDao eServiceDayDao) {
        eServiceDayDao.setName(vServiceDayDto.name());
        eServiceDayDao.setCreation(vServiceDayDto.creation());
        eServiceDayDao.setModified(vServiceDayDto.modified());
        eServiceDayDao.setModifiedBy(vServiceDayDto.modifiedBy());
        eServiceDayDao.setOwner(vServiceDayDto.owner());
        eServiceDayDao.setIsDocStatus(vServiceDayDto.isDocStatus());
        eServiceDayDao.setIdx(vServiceDayDto.idx());
        eServiceDayDao.setWorkday(vServiceDayDto.workday());
        eServiceDayDao.setStartTime(vServiceDayDto.startTime());
        eServiceDayDao.setEndTime(vServiceDayDto.endTime());
        eServiceDayDao.setParent(vServiceDayDto.parent());
        eServiceDayDao.setParentField(vServiceDayDto.parentField());
        eServiceDayDao.setParentType(vServiceDayDto.parentType());
    }
}