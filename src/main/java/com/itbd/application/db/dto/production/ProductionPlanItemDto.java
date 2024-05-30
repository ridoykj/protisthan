package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.manufacturing.production.ProductionPlanItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductionPlanItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean includeExplodedItems,
        String itemCode,
        String bomNo,
        BigDecimal plannedQty,
        String stockUom,
        String warehouse,
        LocalDateTime plannedStartDate,
        BigDecimal pendingQty,
        BigDecimal orderedQty,
        String description,
        BigDecimal producedQty,
        String salesOrder,
        String salesOrderItem,
        String materialRequest,
        String materialRequestItem,
        String productBundleItem,
        String itemReference,
        String temporaryName,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanItemDto fromEntity(ProductionPlanItemDao eProductionPlanItemDao) {
        return new ProductionPlanItemDto(
                eProductionPlanItemDao.getName(),
                eProductionPlanItemDao.getCreation(),
                eProductionPlanItemDao.getModified(),
                eProductionPlanItemDao.getModifiedBy(),
                eProductionPlanItemDao.getOwner(),
                eProductionPlanItemDao.getIsDocStatus(),
                eProductionPlanItemDao.getIdx(),
                eProductionPlanItemDao.getIncludeExplodedItems(),
                eProductionPlanItemDao.getItemCode(),
                eProductionPlanItemDao.getBomNo(),
                eProductionPlanItemDao.getPlannedQty(),
                eProductionPlanItemDao.getStockUom(),
                eProductionPlanItemDao.getWarehouse(),
                eProductionPlanItemDao.getPlannedStartDate(),
                eProductionPlanItemDao.getPendingQty(),
                eProductionPlanItemDao.getOrderedQty(),
                eProductionPlanItemDao.getDescription(),
                eProductionPlanItemDao.getProducedQty(),
                eProductionPlanItemDao.getSalesOrder(),
                eProductionPlanItemDao.getSalesOrderItem(),
                eProductionPlanItemDao.getMaterialRequest(),
                eProductionPlanItemDao.getMaterialRequestItem(),
                eProductionPlanItemDao.getProductBundleItem(),
                eProductionPlanItemDao.getItemReference(),
                eProductionPlanItemDao.getTemporaryName(),
                eProductionPlanItemDao.getParent(),
                eProductionPlanItemDao.getParentField(),
                eProductionPlanItemDao.getParentType());
    }

    public static void fromDTO(ProductionPlanItemDto vProductionPlanItemDto, ProductionPlanItemDao eProductionPlanItemDao) {
        eProductionPlanItemDao.setName(vProductionPlanItemDto.name());
        eProductionPlanItemDao.setCreation(vProductionPlanItemDto.creation());
        eProductionPlanItemDao.setModified(vProductionPlanItemDto.modified());
        eProductionPlanItemDao.setModifiedBy(vProductionPlanItemDto.modifiedBy());
        eProductionPlanItemDao.setOwner(vProductionPlanItemDto.owner());
        eProductionPlanItemDao.setIsDocStatus(vProductionPlanItemDto.isDocStatus());
        eProductionPlanItemDao.setIdx(vProductionPlanItemDto.idx());
        eProductionPlanItemDao.setIncludeExplodedItems(vProductionPlanItemDto.includeExplodedItems());
        eProductionPlanItemDao.setItemCode(vProductionPlanItemDto.itemCode());
        eProductionPlanItemDao.setBomNo(vProductionPlanItemDto.bomNo());
        eProductionPlanItemDao.setPlannedQty(vProductionPlanItemDto.plannedQty());
        eProductionPlanItemDao.setStockUom(vProductionPlanItemDto.stockUom());
        eProductionPlanItemDao.setWarehouse(vProductionPlanItemDto.warehouse());
        eProductionPlanItemDao.setPlannedStartDate(vProductionPlanItemDto.plannedStartDate());
        eProductionPlanItemDao.setPendingQty(vProductionPlanItemDto.pendingQty());
        eProductionPlanItemDao.setOrderedQty(vProductionPlanItemDto.orderedQty());
        eProductionPlanItemDao.setDescription(vProductionPlanItemDto.description());
        eProductionPlanItemDao.setProducedQty(vProductionPlanItemDto.producedQty());
        eProductionPlanItemDao.setSalesOrder(vProductionPlanItemDto.salesOrder());
        eProductionPlanItemDao.setSalesOrderItem(vProductionPlanItemDto.salesOrderItem());
        eProductionPlanItemDao.setMaterialRequest(vProductionPlanItemDto.materialRequest());
        eProductionPlanItemDao.setMaterialRequestItem(vProductionPlanItemDto.materialRequestItem());
        eProductionPlanItemDao.setProductBundleItem(vProductionPlanItemDto.productBundleItem());
        eProductionPlanItemDao.setItemReference(vProductionPlanItemDto.itemReference());
        eProductionPlanItemDao.setTemporaryName(vProductionPlanItemDto.temporaryName());
        eProductionPlanItemDao.setParent(vProductionPlanItemDto.parent());
        eProductionPlanItemDao.setParentField(vProductionPlanItemDto.parentField());
        eProductionPlanItemDao.setParentType(vProductionPlanItemDto.parentType());
    }
}