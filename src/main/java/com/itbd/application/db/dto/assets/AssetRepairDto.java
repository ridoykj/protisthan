package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetRepairDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AssetRepairDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String asset,
        String company,
        String assetName,
        String namingSeries,
        LocalDateTime failureDate,
        String repairStatus,
        LocalDateTime completionDate,
        String costCenter,
        String project,
        BigDecimal repairCost,
        Boolean capitalizeRepairCost,
        Boolean stockConsumption,
        String purchaseInvoice,
        String warehouse,
        BigDecimal totalRepairCost,
        String stockEntry,
        Integer increaseInAssetLife,
        String description,
        String actionsPerformed,
        String downtime,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static AssetRepairDto fromEntity(AssetRepairDao eAssetRepairDao) {
        return new AssetRepairDto(
                eAssetRepairDao.getName(),
                eAssetRepairDao.getCreation(),
                eAssetRepairDao.getModified(),
                eAssetRepairDao.getModifiedBy(),
                eAssetRepairDao.getOwner(),
                eAssetRepairDao.getIsDocStatus(),
                eAssetRepairDao.getIdx(),
                eAssetRepairDao.getAsset(),
                eAssetRepairDao.getCompany(),
                eAssetRepairDao.getAssetName(),
                eAssetRepairDao.getNamingSeries(),
                eAssetRepairDao.getFailureDate(),
                eAssetRepairDao.getRepairStatus(),
                eAssetRepairDao.getCompletionDate(),
                eAssetRepairDao.getCostCenter(),
                eAssetRepairDao.getProject(),
                eAssetRepairDao.getRepairCost(),
                eAssetRepairDao.getCapitalizeRepairCost(),
                eAssetRepairDao.getStockConsumption(),
                eAssetRepairDao.getPurchaseInvoice(),
                eAssetRepairDao.getWarehouse(),
                eAssetRepairDao.getTotalRepairCost(),
                eAssetRepairDao.getStockEntry(),
                eAssetRepairDao.getIncreaseInAssetLife(),
                eAssetRepairDao.getDescription(),
                eAssetRepairDao.getActionsPerformed(),
                eAssetRepairDao.getDowntime(),
                eAssetRepairDao.getAmendedFrom(),
                eAssetRepairDao.getUserTags(),
                eAssetRepairDao.getComments(),
                eAssetRepairDao.getAssign(),
                eAssetRepairDao.getLikedBy(),
                eAssetRepairDao.getSeen());
    }

    public static void fromDTO(AssetRepairDto vAssetRepairDto, AssetRepairDao eAssetRepairDao) {
        eAssetRepairDao.setName(vAssetRepairDto.name());
        eAssetRepairDao.setCreation(vAssetRepairDto.creation());
        eAssetRepairDao.setModified(vAssetRepairDto.modified());
        eAssetRepairDao.setModifiedBy(vAssetRepairDto.modifiedBy());
        eAssetRepairDao.setOwner(vAssetRepairDto.owner());
        eAssetRepairDao.setIsDocStatus(vAssetRepairDto.isDocStatus());
        eAssetRepairDao.setIdx(vAssetRepairDto.idx());
        eAssetRepairDao.setAsset(vAssetRepairDto.asset());
        eAssetRepairDao.setCompany(vAssetRepairDto.company());
        eAssetRepairDao.setAssetName(vAssetRepairDto.assetName());
        eAssetRepairDao.setNamingSeries(vAssetRepairDto.namingSeries());
        eAssetRepairDao.setFailureDate(vAssetRepairDto.failureDate());
        eAssetRepairDao.setRepairStatus(vAssetRepairDto.repairStatus());
        eAssetRepairDao.setCompletionDate(vAssetRepairDto.completionDate());
        eAssetRepairDao.setCostCenter(vAssetRepairDto.costCenter());
        eAssetRepairDao.setProject(vAssetRepairDto.project());
        eAssetRepairDao.setRepairCost(vAssetRepairDto.repairCost());
        eAssetRepairDao.setCapitalizeRepairCost(vAssetRepairDto.capitalizeRepairCost());
        eAssetRepairDao.setStockConsumption(vAssetRepairDto.stockConsumption());
        eAssetRepairDao.setPurchaseInvoice(vAssetRepairDto.purchaseInvoice());
        eAssetRepairDao.setWarehouse(vAssetRepairDto.warehouse());
        eAssetRepairDao.setTotalRepairCost(vAssetRepairDto.totalRepairCost());
        eAssetRepairDao.setStockEntry(vAssetRepairDto.stockEntry());
        eAssetRepairDao.setIncreaseInAssetLife(vAssetRepairDto.increaseInAssetLife());
        eAssetRepairDao.setDescription(vAssetRepairDto.description());
        eAssetRepairDao.setActionsPerformed(vAssetRepairDto.actionsPerformed());
        eAssetRepairDao.setDowntime(vAssetRepairDto.downtime());
        eAssetRepairDao.setAmendedFrom(vAssetRepairDto.amendedFrom());
        eAssetRepairDao.setUserTags(vAssetRepairDto.userTags());
        eAssetRepairDao.setComments(vAssetRepairDto.comments());
        eAssetRepairDao.setAssign(vAssetRepairDto.assign());
        eAssetRepairDao.setLikedBy(vAssetRepairDto.likedBy());
        eAssetRepairDao.setSeen(vAssetRepairDto.seen());
    }
}