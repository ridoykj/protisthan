package com.itbd.application.db.dto.cummunication;

import com.itbd.application.db.dao.communication.CommunicationMediumTimeslotDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;

public record CommunicationMediumTimeslotDto(
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
        String employeeGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static CommunicationMediumTimeslotDto fromEntity(CommunicationMediumTimeslotDao eCommunicationMediumTimeslotDao) {
        return new CommunicationMediumTimeslotDto(
                eCommunicationMediumTimeslotDao.getName(),
                eCommunicationMediumTimeslotDao.getCreation(),
                eCommunicationMediumTimeslotDao.getModified(),
                eCommunicationMediumTimeslotDao.getModifiedBy(),
                eCommunicationMediumTimeslotDao.getOwner(),
                eCommunicationMediumTimeslotDao.getIsDocStatus(),
                eCommunicationMediumTimeslotDao.getIdx(),
                eCommunicationMediumTimeslotDao.getDayOfWeek(),
                eCommunicationMediumTimeslotDao.getFromTime(),
                eCommunicationMediumTimeslotDao.getToTime(),
                eCommunicationMediumTimeslotDao.getEmployeeGroup(),
                eCommunicationMediumTimeslotDao.getParent(),
                eCommunicationMediumTimeslotDao.getParentField(),
                eCommunicationMediumTimeslotDao.getParentType());
    }

    public static void fromDTO(CommunicationMediumTimeslotDto vCommunicationMediumTimeslotDto, CommunicationMediumTimeslotDao eCommunicationMediumTimeslotDao) {
        eCommunicationMediumTimeslotDao.setName(vCommunicationMediumTimeslotDto.name());
        eCommunicationMediumTimeslotDao.setCreation(vCommunicationMediumTimeslotDto.creation());
        eCommunicationMediumTimeslotDao.setModified(vCommunicationMediumTimeslotDto.modified());
        eCommunicationMediumTimeslotDao.setModifiedBy(vCommunicationMediumTimeslotDto.modifiedBy());
        eCommunicationMediumTimeslotDao.setOwner(vCommunicationMediumTimeslotDto.owner());
        eCommunicationMediumTimeslotDao.setIsDocStatus(vCommunicationMediumTimeslotDto.isDocStatus());
        eCommunicationMediumTimeslotDao.setIdx(vCommunicationMediumTimeslotDto.idx());
        eCommunicationMediumTimeslotDao.setDayOfWeek(vCommunicationMediumTimeslotDto.dayOfWeek());
        eCommunicationMediumTimeslotDao.setFromTime(vCommunicationMediumTimeslotDto.fromTime());
        eCommunicationMediumTimeslotDao.setToTime(vCommunicationMediumTimeslotDto.toTime());
        eCommunicationMediumTimeslotDao.setEmployeeGroup(vCommunicationMediumTimeslotDto.employeeGroup());
        eCommunicationMediumTimeslotDao.setParent(vCommunicationMediumTimeslotDto.parent());
        eCommunicationMediumTimeslotDao.setParentField(vCommunicationMediumTimeslotDto.parentField());
        eCommunicationMediumTimeslotDao.setParentType(vCommunicationMediumTimeslotDto.parentType());
    }
}