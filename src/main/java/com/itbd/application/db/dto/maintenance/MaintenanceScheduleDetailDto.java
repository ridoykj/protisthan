package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceScheduleDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaintenanceScheduleDetailDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        LocalDate scheduledDate,
        LocalDate actualDate,
        String salesPerson,
        String completionStatus,
        String serialNo,
        String itemReference,
        String parent,
        String parentField,
        String parentType
) {
    public static MaintenanceScheduleDetailDto fromEntity(MaintenanceScheduleDetailDao eMaintenanceScheduleDetailDao) {
        return new MaintenanceScheduleDetailDto(
                eMaintenanceScheduleDetailDao.getName(),
                eMaintenanceScheduleDetailDao.getCreation(),
                eMaintenanceScheduleDetailDao.getModified(),
                eMaintenanceScheduleDetailDao.getModifiedBy(),
                eMaintenanceScheduleDetailDao.getOwner(),
                eMaintenanceScheduleDetailDao.getIsDocStatus(),
                eMaintenanceScheduleDetailDao.getIdx(),
                eMaintenanceScheduleDetailDao.getItemCode(),
                eMaintenanceScheduleDetailDao.getItemName(),
                eMaintenanceScheduleDetailDao.getScheduledDate(),
                eMaintenanceScheduleDetailDao.getActualDate(),
                eMaintenanceScheduleDetailDao.getSalesPerson(),
                eMaintenanceScheduleDetailDao.getCompletionStatus(),
                eMaintenanceScheduleDetailDao.getSerialNo(),
                eMaintenanceScheduleDetailDao.getItemReference(),
                eMaintenanceScheduleDetailDao.getParent(),
                eMaintenanceScheduleDetailDao.getParentField(),
                eMaintenanceScheduleDetailDao.getParentType());
    }

    public static void fromDTO(MaintenanceScheduleDetailDto vMaintenanceScheduleDetailDto, MaintenanceScheduleDetailDao eMaintenanceScheduleDetailDao) {
        eMaintenanceScheduleDetailDao.setName(vMaintenanceScheduleDetailDto.name());
        eMaintenanceScheduleDetailDao.setCreation(vMaintenanceScheduleDetailDto.creation());
        eMaintenanceScheduleDetailDao.setModified(vMaintenanceScheduleDetailDto.modified());
        eMaintenanceScheduleDetailDao.setModifiedBy(vMaintenanceScheduleDetailDto.modifiedBy());
        eMaintenanceScheduleDetailDao.setOwner(vMaintenanceScheduleDetailDto.owner());
        eMaintenanceScheduleDetailDao.setIsDocStatus(vMaintenanceScheduleDetailDto.isDocStatus());
        eMaintenanceScheduleDetailDao.setIdx(vMaintenanceScheduleDetailDto.idx());
        eMaintenanceScheduleDetailDao.setItemCode(vMaintenanceScheduleDetailDto.itemCode());
        eMaintenanceScheduleDetailDao.setItemName(vMaintenanceScheduleDetailDto.itemName());
        eMaintenanceScheduleDetailDao.setScheduledDate(vMaintenanceScheduleDetailDto.scheduledDate());
        eMaintenanceScheduleDetailDao.setActualDate(vMaintenanceScheduleDetailDto.actualDate());
        eMaintenanceScheduleDetailDao.setSalesPerson(vMaintenanceScheduleDetailDto.salesPerson());
        eMaintenanceScheduleDetailDao.setCompletionStatus(vMaintenanceScheduleDetailDto.completionStatus());
        eMaintenanceScheduleDetailDao.setSerialNo(vMaintenanceScheduleDetailDto.serialNo());
        eMaintenanceScheduleDetailDao.setItemReference(vMaintenanceScheduleDetailDto.itemReference());
        eMaintenanceScheduleDetailDao.setParent(vMaintenanceScheduleDetailDto.parent());
        eMaintenanceScheduleDetailDao.setParentField(vMaintenanceScheduleDetailDto.parentField());
        eMaintenanceScheduleDetailDao.setParentType(vMaintenanceScheduleDetailDto.parentType());
    }
}