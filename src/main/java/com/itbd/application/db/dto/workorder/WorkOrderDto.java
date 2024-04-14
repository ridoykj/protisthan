package com.itbd.application.db.dto.workorder;

import com.itbd.application.db.dao.workorder.WorkOrderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record WorkOrderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String status,
        String productionItem,
        String itemName,
        String image,
        String bomNo,
        String salesOrder,
        String company,
        BigDecimal qty,
        BigDecimal materialTransferredForManufacturing,
        BigDecimal producedQty,
        BigDecimal processLossQty,
        String project,
        Boolean allowAlternativeItem,
        Boolean useMultiLevelBom,
        Boolean skipTransfer,
        Boolean fromWipWarehouse,
        Boolean updateConsumedMaterialCostInProject,
        String sourceWarehouse,
        String wipWarehouse,
        String fgWarehouse,
        String scrapWarehouse,
        Boolean hasSerialNo,
        Boolean hasBatchNo,
        BigDecimal batchSize,
        String transferMaterialAgainst,
        LocalDateTime plannedStartDate,
        LocalDateTime plannedEndDate,
        LocalDate expectedDeliveryDate,
        LocalDateTime actualStartDate,
        LocalDateTime actualEndDate,
        BigDecimal leadTime,
        BigDecimal plannedOperatingCost,
        BigDecimal actualOperatingCost,
        BigDecimal additionalOperatingCost,
        BigDecimal correctiveOperationCost,
        BigDecimal totalOperatingCost,
        String description,
        String stockUom,
        String materialRequest,
        String materialRequestItem,
        String salesOrderItem,
        String productionPlan,
        String productionPlanItem,
        String productionPlanSubAssemblyItem,
        String productBundleItem,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static WorkOrderDto fromEntity(WorkOrderDao eWorkOrderDao) {
        return new WorkOrderDto(
                eWorkOrderDao.getName(),
                eWorkOrderDao.getCreation(),
                eWorkOrderDao.getModified(),
                eWorkOrderDao.getModifiedBy(),
                eWorkOrderDao.getOwner(),
                eWorkOrderDao.getIsDocStatus(),
                eWorkOrderDao.getIdx(),
                eWorkOrderDao.getNamingSeries(),
                eWorkOrderDao.getStatus(),
                eWorkOrderDao.getProductionItem(),
                eWorkOrderDao.getItemName(),
                eWorkOrderDao.getImage(),
                eWorkOrderDao.getBomNo(),
                eWorkOrderDao.getSalesOrder(),
                eWorkOrderDao.getCompany(),
                eWorkOrderDao.getQty(),
                eWorkOrderDao.getMaterialTransferredForManufacturing(),
                eWorkOrderDao.getProducedQty(),
                eWorkOrderDao.getProcessLossQty(),
                eWorkOrderDao.getProject(),
                eWorkOrderDao.getAllowAlternativeItem(),
                eWorkOrderDao.getUseMultiLevelBom(),
                eWorkOrderDao.getSkipTransfer(),
                eWorkOrderDao.getFromWipWarehouse(),
                eWorkOrderDao.getUpdateConsumedMaterialCostInProject(),
                eWorkOrderDao.getSourceWarehouse(),
                eWorkOrderDao.getWipWarehouse(),
                eWorkOrderDao.getFgWarehouse(),
                eWorkOrderDao.getScrapWarehouse(),
                eWorkOrderDao.getHasSerialNo(),
                eWorkOrderDao.getHasBatchNo(),
                eWorkOrderDao.getBatchSize(),
                eWorkOrderDao.getTransferMaterialAgainst(),
                eWorkOrderDao.getPlannedStartDate(),
                eWorkOrderDao.getPlannedEndDate(),
                eWorkOrderDao.getExpectedDeliveryDate(),
                eWorkOrderDao.getActualStartDate(),
                eWorkOrderDao.getActualEndDate(),
                eWorkOrderDao.getLeadTime(),
                eWorkOrderDao.getPlannedOperatingCost(),
                eWorkOrderDao.getActualOperatingCost(),
                eWorkOrderDao.getAdditionalOperatingCost(),
                eWorkOrderDao.getCorrectiveOperationCost(),
                eWorkOrderDao.getTotalOperatingCost(),
                eWorkOrderDao.getDescription(),
                eWorkOrderDao.getStockUom(),
                eWorkOrderDao.getMaterialRequest(),
                eWorkOrderDao.getMaterialRequestItem(),
                eWorkOrderDao.getSalesOrderItem(),
                eWorkOrderDao.getProductionPlan(),
                eWorkOrderDao.getProductionPlanItem(),
                eWorkOrderDao.getProductionPlanSubAssemblyItem(),
                eWorkOrderDao.getProductBundleItem(),
                eWorkOrderDao.getAmendedFrom(),
                eWorkOrderDao.getUserTags(),
                eWorkOrderDao.getComments(),
                eWorkOrderDao.getAssign(),
                eWorkOrderDao.getLikedBy(),
                eWorkOrderDao.getSeen());
    }

    public static void fromDTO(WorkOrderDto vWorkOrderDto, WorkOrderDao eWorkOrderDao) {
        eWorkOrderDao.setName(vWorkOrderDto.name());
        eWorkOrderDao.setCreation(vWorkOrderDto.creation());
        eWorkOrderDao.setModified(vWorkOrderDto.modified());
        eWorkOrderDao.setModifiedBy(vWorkOrderDto.modifiedBy());
        eWorkOrderDao.setOwner(vWorkOrderDto.owner());
        eWorkOrderDao.setIsDocStatus(vWorkOrderDto.isDocStatus());
        eWorkOrderDao.setIdx(vWorkOrderDto.idx());
        eWorkOrderDao.setNamingSeries(vWorkOrderDto.namingSeries());
        eWorkOrderDao.setStatus(vWorkOrderDto.status());
        eWorkOrderDao.setProductionItem(vWorkOrderDto.productionItem());
        eWorkOrderDao.setItemName(vWorkOrderDto.itemName());
        eWorkOrderDao.setImage(vWorkOrderDto.image());
        eWorkOrderDao.setBomNo(vWorkOrderDto.bomNo());
        eWorkOrderDao.setSalesOrder(vWorkOrderDto.salesOrder());
        eWorkOrderDao.setCompany(vWorkOrderDto.company());
        eWorkOrderDao.setQty(vWorkOrderDto.qty());
        eWorkOrderDao.setMaterialTransferredForManufacturing(vWorkOrderDto.materialTransferredForManufacturing());
        eWorkOrderDao.setProducedQty(vWorkOrderDto.producedQty());
        eWorkOrderDao.setProcessLossQty(vWorkOrderDto.processLossQty());
        eWorkOrderDao.setProject(vWorkOrderDto.project());
        eWorkOrderDao.setAllowAlternativeItem(vWorkOrderDto.allowAlternativeItem());
        eWorkOrderDao.setUseMultiLevelBom(vWorkOrderDto.useMultiLevelBom());
        eWorkOrderDao.setSkipTransfer(vWorkOrderDto.skipTransfer());
        eWorkOrderDao.setFromWipWarehouse(vWorkOrderDto.fromWipWarehouse());
        eWorkOrderDao.setUpdateConsumedMaterialCostInProject(vWorkOrderDto.updateConsumedMaterialCostInProject());
        eWorkOrderDao.setSourceWarehouse(vWorkOrderDto.sourceWarehouse());
        eWorkOrderDao.setWipWarehouse(vWorkOrderDto.wipWarehouse());
        eWorkOrderDao.setFgWarehouse(vWorkOrderDto.fgWarehouse());
        eWorkOrderDao.setScrapWarehouse(vWorkOrderDto.scrapWarehouse());
        eWorkOrderDao.setHasSerialNo(vWorkOrderDto.hasSerialNo());
        eWorkOrderDao.setHasBatchNo(vWorkOrderDto.hasBatchNo());
        eWorkOrderDao.setBatchSize(vWorkOrderDto.batchSize());
        eWorkOrderDao.setTransferMaterialAgainst(vWorkOrderDto.transferMaterialAgainst());
        eWorkOrderDao.setPlannedStartDate(vWorkOrderDto.plannedStartDate());
        eWorkOrderDao.setPlannedEndDate(vWorkOrderDto.plannedEndDate());
        eWorkOrderDao.setExpectedDeliveryDate(vWorkOrderDto.expectedDeliveryDate());
        eWorkOrderDao.setActualStartDate(vWorkOrderDto.actualStartDate());
        eWorkOrderDao.setActualEndDate(vWorkOrderDto.actualEndDate());
        eWorkOrderDao.setLeadTime(vWorkOrderDto.leadTime());
        eWorkOrderDao.setPlannedOperatingCost(vWorkOrderDto.plannedOperatingCost());
        eWorkOrderDao.setActualOperatingCost(vWorkOrderDto.actualOperatingCost());
        eWorkOrderDao.setAdditionalOperatingCost(vWorkOrderDto.additionalOperatingCost());
        eWorkOrderDao.setCorrectiveOperationCost(vWorkOrderDto.correctiveOperationCost());
        eWorkOrderDao.setTotalOperatingCost(vWorkOrderDto.totalOperatingCost());
        eWorkOrderDao.setDescription(vWorkOrderDto.description());
        eWorkOrderDao.setStockUom(vWorkOrderDto.stockUom());
        eWorkOrderDao.setMaterialRequest(vWorkOrderDto.materialRequest());
        eWorkOrderDao.setMaterialRequestItem(vWorkOrderDto.materialRequestItem());
        eWorkOrderDao.setSalesOrderItem(vWorkOrderDto.salesOrderItem());
        eWorkOrderDao.setProductionPlan(vWorkOrderDto.productionPlan());
        eWorkOrderDao.setProductionPlanItem(vWorkOrderDto.productionPlanItem());
        eWorkOrderDao.setProductionPlanSubAssemblyItem(vWorkOrderDto.productionPlanSubAssemblyItem());
        eWorkOrderDao.setProductBundleItem(vWorkOrderDto.productBundleItem());
        eWorkOrderDao.setAmendedFrom(vWorkOrderDto.amendedFrom());
        eWorkOrderDao.setUserTags(vWorkOrderDto.userTags());
        eWorkOrderDao.setComments(vWorkOrderDto.comments());
        eWorkOrderDao.setAssign(vWorkOrderDto.assign());
        eWorkOrderDao.setLikedBy(vWorkOrderDto.likedBy());
        eWorkOrderDao.setSeen(vWorkOrderDto.seen());
    }
}