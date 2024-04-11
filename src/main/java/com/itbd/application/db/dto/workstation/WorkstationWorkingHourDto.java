package com.itbd.application.db.dto.workstation;

import com.itbd.application.db.dao.workstation.WorkstationWorkingHourDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record WorkstationWorkingHourDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalTime startTime,
        BigDecimal hours,
        LocalTime endTime,
        Boolean enabled,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkstationWorkingHourDto fromEntity(WorkstationWorkingHourDao eWorkstationWorkingHourDao) {
        return new WorkstationWorkingHourDto(
                eWorkstationWorkingHourDao.getName(),
                eWorkstationWorkingHourDao.getCreation(),
                eWorkstationWorkingHourDao.getModified(),
                eWorkstationWorkingHourDao.getModifiedBy(),
                eWorkstationWorkingHourDao.getOwner(),
                eWorkstationWorkingHourDao.getIsDocStatus(),
                eWorkstationWorkingHourDao.getIdx(),
                eWorkstationWorkingHourDao.getStartTime(),
                eWorkstationWorkingHourDao.getHours(),
                eWorkstationWorkingHourDao.getEndTime(),
                eWorkstationWorkingHourDao.getEnabled(),
                eWorkstationWorkingHourDao.getParent(),
                eWorkstationWorkingHourDao.getParentField(),
                eWorkstationWorkingHourDao.getParentType());
    }

    public static void fromDTO(WorkstationWorkingHourDto vWorkstationWorkingHourDto, WorkstationWorkingHourDao eWorkstationWorkingHourDao) {
        eWorkstationWorkingHourDao.setName(vWorkstationWorkingHourDto.name());
        eWorkstationWorkingHourDao.setCreation(vWorkstationWorkingHourDto.creation());
        eWorkstationWorkingHourDao.setModified(vWorkstationWorkingHourDto.modified());
        eWorkstationWorkingHourDao.setModifiedBy(vWorkstationWorkingHourDto.modifiedBy());
        eWorkstationWorkingHourDao.setOwner(vWorkstationWorkingHourDto.owner());
        eWorkstationWorkingHourDao.setIsDocStatus(vWorkstationWorkingHourDto.isDocStatus());
        eWorkstationWorkingHourDao.setIdx(vWorkstationWorkingHourDto.idx());
        eWorkstationWorkingHourDao.setStartTime(vWorkstationWorkingHourDto.startTime());
        eWorkstationWorkingHourDao.setHours(vWorkstationWorkingHourDto.hours());
        eWorkstationWorkingHourDao.setEndTime(vWorkstationWorkingHourDto.endTime());
        eWorkstationWorkingHourDao.setEnabled(vWorkstationWorkingHourDto.enabled());
        eWorkstationWorkingHourDao.setParent(vWorkstationWorkingHourDto.parent());
        eWorkstationWorkingHourDao.setParentField(vWorkstationWorkingHourDto.parentField());
        eWorkstationWorkingHourDao.setParentType(vWorkstationWorkingHourDto.parentType());
    }
}