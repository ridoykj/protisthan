package com.itbd.application.db.dto;

import com.itbd.application.db.dao.IncomingCallHandlingScheduleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record IncomingCallHandlingScheduleDto(
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
        String agentGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static IncomingCallHandlingScheduleDto fromEntity(IncomingCallHandlingScheduleDao eIncomingCallHandlingScheduleDao) {
        return new IncomingCallHandlingScheduleDto(
                eIncomingCallHandlingScheduleDao.getName(),
                eIncomingCallHandlingScheduleDao.getCreation(),
                eIncomingCallHandlingScheduleDao.getModified(),
                eIncomingCallHandlingScheduleDao.getModifiedBy(),
                eIncomingCallHandlingScheduleDao.getOwner(),
                eIncomingCallHandlingScheduleDao.getIsDocStatus(),
                eIncomingCallHandlingScheduleDao.getIdx(),
                eIncomingCallHandlingScheduleDao.getDayOfWeek(),
                eIncomingCallHandlingScheduleDao.getFromTime(),
                eIncomingCallHandlingScheduleDao.getToTime(),
                eIncomingCallHandlingScheduleDao.getAgentGroup(),
                eIncomingCallHandlingScheduleDao.getParent(),
                eIncomingCallHandlingScheduleDao.getParentField(),
                eIncomingCallHandlingScheduleDao.getParentType());
    }

    public static void fromDTO(IncomingCallHandlingScheduleDto vIncomingCallHandlingScheduleDto, IncomingCallHandlingScheduleDao eIncomingCallHandlingScheduleDao) {
        eIncomingCallHandlingScheduleDao.setName(vIncomingCallHandlingScheduleDto.name());
        eIncomingCallHandlingScheduleDao.setCreation(vIncomingCallHandlingScheduleDto.creation());
        eIncomingCallHandlingScheduleDao.setModified(vIncomingCallHandlingScheduleDto.modified());
        eIncomingCallHandlingScheduleDao.setModifiedBy(vIncomingCallHandlingScheduleDto.modifiedBy());
        eIncomingCallHandlingScheduleDao.setOwner(vIncomingCallHandlingScheduleDto.owner());
        eIncomingCallHandlingScheduleDao.setIsDocStatus(vIncomingCallHandlingScheduleDto.isDocStatus());
        eIncomingCallHandlingScheduleDao.setIdx(vIncomingCallHandlingScheduleDto.idx());
        eIncomingCallHandlingScheduleDao.setDayOfWeek(vIncomingCallHandlingScheduleDto.dayOfWeek());
        eIncomingCallHandlingScheduleDao.setFromTime(vIncomingCallHandlingScheduleDto.fromTime());
        eIncomingCallHandlingScheduleDao.setToTime(vIncomingCallHandlingScheduleDto.toTime());
        eIncomingCallHandlingScheduleDao.setAgentGroup(vIncomingCallHandlingScheduleDto.agentGroup());
        eIncomingCallHandlingScheduleDao.setParent(vIncomingCallHandlingScheduleDto.parent());
        eIncomingCallHandlingScheduleDao.setParentField(vIncomingCallHandlingScheduleDto.parentField());
        eIncomingCallHandlingScheduleDao.setParentType(vIncomingCallHandlingScheduleDto.parentType());
    }
}