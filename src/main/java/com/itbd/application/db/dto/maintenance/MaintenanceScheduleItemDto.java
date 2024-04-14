package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceScheduleItemDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaintenanceScheduleItemDto(
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
        String description,
        LocalDate startDate,
        LocalDate endDate,
        String periodicity,
        Integer noOfVisits,
        String salesPerson,
        String serialNo,
        String salesOrder,
        String serialAndBatchBundle,
        String parent,
        String parentField,
        String parentType
) {
    public static MaintenanceScheduleItemDto fromEntity(MaintenanceScheduleItemDao eMaintenanceScheduleItemDao) {
        return new MaintenanceScheduleItemDto(
                eMaintenanceScheduleItemDao.getName(),
                eMaintenanceScheduleItemDao.getCreation(),
                eMaintenanceScheduleItemDao.getModified(),
                eMaintenanceScheduleItemDao.getModifiedBy(),
                eMaintenanceScheduleItemDao.getOwner(),
                eMaintenanceScheduleItemDao.getIsDocStatus(),
                eMaintenanceScheduleItemDao.getIdx(),
                eMaintenanceScheduleItemDao.getItemCode(),
                eMaintenanceScheduleItemDao.getItemName(),
                eMaintenanceScheduleItemDao.getDescription(),
                eMaintenanceScheduleItemDao.getStartDate(),
                eMaintenanceScheduleItemDao.getEndDate(),
                eMaintenanceScheduleItemDao.getPeriodicity(),
                eMaintenanceScheduleItemDao.getNoOfVisits(),
                eMaintenanceScheduleItemDao.getSalesPerson(),
                eMaintenanceScheduleItemDao.getSerialNo(),
                eMaintenanceScheduleItemDao.getSalesOrder(),
                eMaintenanceScheduleItemDao.getSerialAndBatchBundle(),
                eMaintenanceScheduleItemDao.getParent(),
                eMaintenanceScheduleItemDao.getParentField(),
                eMaintenanceScheduleItemDao.getParentType());
    }

    public static void fromDTO(MaintenanceScheduleItemDto vMaintenanceScheduleItemDto, MaintenanceScheduleItemDao eMaintenanceScheduleItemDao) {
        eMaintenanceScheduleItemDao.setName(vMaintenanceScheduleItemDto.name());
        eMaintenanceScheduleItemDao.setCreation(vMaintenanceScheduleItemDto.creation());
        eMaintenanceScheduleItemDao.setModified(vMaintenanceScheduleItemDto.modified());
        eMaintenanceScheduleItemDao.setModifiedBy(vMaintenanceScheduleItemDto.modifiedBy());
        eMaintenanceScheduleItemDao.setOwner(vMaintenanceScheduleItemDto.owner());
        eMaintenanceScheduleItemDao.setIsDocStatus(vMaintenanceScheduleItemDto.isDocStatus());
        eMaintenanceScheduleItemDao.setIdx(vMaintenanceScheduleItemDto.idx());
        eMaintenanceScheduleItemDao.setItemCode(vMaintenanceScheduleItemDto.itemCode());
        eMaintenanceScheduleItemDao.setItemName(vMaintenanceScheduleItemDto.itemName());
        eMaintenanceScheduleItemDao.setDescription(vMaintenanceScheduleItemDto.description());
        eMaintenanceScheduleItemDao.setStartDate(vMaintenanceScheduleItemDto.startDate());
        eMaintenanceScheduleItemDao.setEndDate(vMaintenanceScheduleItemDto.endDate());
        eMaintenanceScheduleItemDao.setPeriodicity(vMaintenanceScheduleItemDto.periodicity());
        eMaintenanceScheduleItemDao.setNoOfVisits(vMaintenanceScheduleItemDto.noOfVisits());
        eMaintenanceScheduleItemDao.setSalesPerson(vMaintenanceScheduleItemDto.salesPerson());
        eMaintenanceScheduleItemDao.setSerialNo(vMaintenanceScheduleItemDto.serialNo());
        eMaintenanceScheduleItemDao.setSalesOrder(vMaintenanceScheduleItemDto.salesOrder());
        eMaintenanceScheduleItemDao.setSerialAndBatchBundle(vMaintenanceScheduleItemDto.serialAndBatchBundle());
        eMaintenanceScheduleItemDao.setParent(vMaintenanceScheduleItemDto.parent());
        eMaintenanceScheduleItemDao.setParentField(vMaintenanceScheduleItemDto.parentField());
        eMaintenanceScheduleItemDao.setParentType(vMaintenanceScheduleItemDto.parentType());
    }
}