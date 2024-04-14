package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMaintenanceTaskDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AssetMaintenanceTaskDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String maintenanceTask,
        String maintenanceType,
        String maintenanceStatus,
        LocalDate startDate,
        String periodicity,
        LocalDate endDate,
        Boolean certificateRequired,
        String assignTo,
        String assignToName,
        LocalDate nextDueDate,
        LocalDate lastCompletionDate,
        String description,
        String parent,
        String parentField,
        String parentType
) {
    public static AssetMaintenanceTaskDto fromEntity(AssetMaintenanceTaskDao eAssetMaintenanceTaskDao) {
        return new AssetMaintenanceTaskDto(
                eAssetMaintenanceTaskDao.getName(),
                eAssetMaintenanceTaskDao.getCreation(),
                eAssetMaintenanceTaskDao.getModified(),
                eAssetMaintenanceTaskDao.getModifiedBy(),
                eAssetMaintenanceTaskDao.getOwner(),
                eAssetMaintenanceTaskDao.getIsDocStatus(),
                eAssetMaintenanceTaskDao.getIdx(),
                eAssetMaintenanceTaskDao.getMaintenanceTask(),
                eAssetMaintenanceTaskDao.getMaintenanceType(),
                eAssetMaintenanceTaskDao.getMaintenanceStatus(),
                eAssetMaintenanceTaskDao.getStartDate(),
                eAssetMaintenanceTaskDao.getPeriodicity(),
                eAssetMaintenanceTaskDao.getEndDate(),
                eAssetMaintenanceTaskDao.getCertificateRequired(),
                eAssetMaintenanceTaskDao.getAssignTo(),
                eAssetMaintenanceTaskDao.getAssignToName(),
                eAssetMaintenanceTaskDao.getNextDueDate(),
                eAssetMaintenanceTaskDao.getLastCompletionDate(),
                eAssetMaintenanceTaskDao.getDescription(),
                eAssetMaintenanceTaskDao.getParent(),
                eAssetMaintenanceTaskDao.getParentField(),
                eAssetMaintenanceTaskDao.getParentType());
    }

    public static void fromDTO(AssetMaintenanceTaskDto vAssetMaintenanceTaskDto, AssetMaintenanceTaskDao eAssetMaintenanceTaskDao) {
        eAssetMaintenanceTaskDao.setName(vAssetMaintenanceTaskDto.name());
        eAssetMaintenanceTaskDao.setCreation(vAssetMaintenanceTaskDto.creation());
        eAssetMaintenanceTaskDao.setModified(vAssetMaintenanceTaskDto.modified());
        eAssetMaintenanceTaskDao.setModifiedBy(vAssetMaintenanceTaskDto.modifiedBy());
        eAssetMaintenanceTaskDao.setOwner(vAssetMaintenanceTaskDto.owner());
        eAssetMaintenanceTaskDao.setIsDocStatus(vAssetMaintenanceTaskDto.isDocStatus());
        eAssetMaintenanceTaskDao.setIdx(vAssetMaintenanceTaskDto.idx());
        eAssetMaintenanceTaskDao.setMaintenanceTask(vAssetMaintenanceTaskDto.maintenanceTask());
        eAssetMaintenanceTaskDao.setMaintenanceType(vAssetMaintenanceTaskDto.maintenanceType());
        eAssetMaintenanceTaskDao.setMaintenanceStatus(vAssetMaintenanceTaskDto.maintenanceStatus());
        eAssetMaintenanceTaskDao.setStartDate(vAssetMaintenanceTaskDto.startDate());
        eAssetMaintenanceTaskDao.setPeriodicity(vAssetMaintenanceTaskDto.periodicity());
        eAssetMaintenanceTaskDao.setEndDate(vAssetMaintenanceTaskDto.endDate());
        eAssetMaintenanceTaskDao.setCertificateRequired(vAssetMaintenanceTaskDto.certificateRequired());
        eAssetMaintenanceTaskDao.setAssignTo(vAssetMaintenanceTaskDto.assignTo());
        eAssetMaintenanceTaskDao.setAssignToName(vAssetMaintenanceTaskDto.assignToName());
        eAssetMaintenanceTaskDao.setNextDueDate(vAssetMaintenanceTaskDto.nextDueDate());
        eAssetMaintenanceTaskDao.setLastCompletionDate(vAssetMaintenanceTaskDto.lastCompletionDate());
        eAssetMaintenanceTaskDao.setDescription(vAssetMaintenanceTaskDto.description());
        eAssetMaintenanceTaskDao.setParent(vAssetMaintenanceTaskDto.parent());
        eAssetMaintenanceTaskDao.setParentField(vAssetMaintenanceTaskDto.parentField());
        eAssetMaintenanceTaskDao.setParentType(vAssetMaintenanceTaskDto.parentType());
    }
}