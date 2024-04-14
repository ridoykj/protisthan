package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetMaintenanceLogDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AssetMaintenanceLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String assetMaintenance,
        String namingSeries,
        String assetName,
        String itemCode,
        String itemName,
        String task,
        String taskName,
        String maintenanceType,
        String periodicity,
        Boolean hasCertificate,
        String certificateAttachment,
        String maintenanceStatus,
        String assignToName,
        LocalDate dueDate,
        LocalDate completionDate,
        String description,
        String actionsPerformed,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static AssetMaintenanceLogDto fromEntity(AssetMaintenanceLogDao eAssetMaintenanceLogDao) {
        return new AssetMaintenanceLogDto(
                eAssetMaintenanceLogDao.getName(),
                eAssetMaintenanceLogDao.getCreation(),
                eAssetMaintenanceLogDao.getModified(),
                eAssetMaintenanceLogDao.getModifiedBy(),
                eAssetMaintenanceLogDao.getOwner(),
                eAssetMaintenanceLogDao.getIsDocStatus(),
                eAssetMaintenanceLogDao.getIdx(),
                eAssetMaintenanceLogDao.getAssetMaintenance(),
                eAssetMaintenanceLogDao.getNamingSeries(),
                eAssetMaintenanceLogDao.getAssetName(),
                eAssetMaintenanceLogDao.getItemCode(),
                eAssetMaintenanceLogDao.getItemName(),
                eAssetMaintenanceLogDao.getTask(),
                eAssetMaintenanceLogDao.getTaskName(),
                eAssetMaintenanceLogDao.getMaintenanceType(),
                eAssetMaintenanceLogDao.getPeriodicity(),
                eAssetMaintenanceLogDao.getHasCertificate(),
                eAssetMaintenanceLogDao.getCertificateAttachment(),
                eAssetMaintenanceLogDao.getMaintenanceStatus(),
                eAssetMaintenanceLogDao.getAssignToName(),
                eAssetMaintenanceLogDao.getDueDate(),
                eAssetMaintenanceLogDao.getCompletionDate(),
                eAssetMaintenanceLogDao.getDescription(),
                eAssetMaintenanceLogDao.getActionsPerformed(),
                eAssetMaintenanceLogDao.getAmendedFrom(),
                eAssetMaintenanceLogDao.getUserTags(),
                eAssetMaintenanceLogDao.getComments(),
                eAssetMaintenanceLogDao.getAssign(),
                eAssetMaintenanceLogDao.getLikedBy(),
                eAssetMaintenanceLogDao.getSeen());
    }

    public static void fromDTO(AssetMaintenanceLogDto vAssetMaintenanceLogDto, AssetMaintenanceLogDao eAssetMaintenanceLogDao) {
        eAssetMaintenanceLogDao.setName(vAssetMaintenanceLogDto.name());
        eAssetMaintenanceLogDao.setCreation(vAssetMaintenanceLogDto.creation());
        eAssetMaintenanceLogDao.setModified(vAssetMaintenanceLogDto.modified());
        eAssetMaintenanceLogDao.setModifiedBy(vAssetMaintenanceLogDto.modifiedBy());
        eAssetMaintenanceLogDao.setOwner(vAssetMaintenanceLogDto.owner());
        eAssetMaintenanceLogDao.setIsDocStatus(vAssetMaintenanceLogDto.isDocStatus());
        eAssetMaintenanceLogDao.setIdx(vAssetMaintenanceLogDto.idx());
        eAssetMaintenanceLogDao.setAssetMaintenance(vAssetMaintenanceLogDto.assetMaintenance());
        eAssetMaintenanceLogDao.setNamingSeries(vAssetMaintenanceLogDto.namingSeries());
        eAssetMaintenanceLogDao.setAssetName(vAssetMaintenanceLogDto.assetName());
        eAssetMaintenanceLogDao.setItemCode(vAssetMaintenanceLogDto.itemCode());
        eAssetMaintenanceLogDao.setItemName(vAssetMaintenanceLogDto.itemName());
        eAssetMaintenanceLogDao.setTask(vAssetMaintenanceLogDto.task());
        eAssetMaintenanceLogDao.setTaskName(vAssetMaintenanceLogDto.taskName());
        eAssetMaintenanceLogDao.setMaintenanceType(vAssetMaintenanceLogDto.maintenanceType());
        eAssetMaintenanceLogDao.setPeriodicity(vAssetMaintenanceLogDto.periodicity());
        eAssetMaintenanceLogDao.setHasCertificate(vAssetMaintenanceLogDto.hasCertificate());
        eAssetMaintenanceLogDao.setCertificateAttachment(vAssetMaintenanceLogDto.certificateAttachment());
        eAssetMaintenanceLogDao.setMaintenanceStatus(vAssetMaintenanceLogDto.maintenanceStatus());
        eAssetMaintenanceLogDao.setAssignToName(vAssetMaintenanceLogDto.assignToName());
        eAssetMaintenanceLogDao.setDueDate(vAssetMaintenanceLogDto.dueDate());
        eAssetMaintenanceLogDao.setCompletionDate(vAssetMaintenanceLogDto.completionDate());
        eAssetMaintenanceLogDao.setDescription(vAssetMaintenanceLogDto.description());
        eAssetMaintenanceLogDao.setActionsPerformed(vAssetMaintenanceLogDto.actionsPerformed());
        eAssetMaintenanceLogDao.setAmendedFrom(vAssetMaintenanceLogDto.amendedFrom());
        eAssetMaintenanceLogDao.setUserTags(vAssetMaintenanceLogDto.userTags());
        eAssetMaintenanceLogDao.setComments(vAssetMaintenanceLogDto.comments());
        eAssetMaintenanceLogDao.setAssign(vAssetMaintenanceLogDto.assign());
        eAssetMaintenanceLogDao.setLikedBy(vAssetMaintenanceLogDto.likedBy());
        eAssetMaintenanceLogDao.setSeen(vAssetMaintenanceLogDto.seen());
    }
}