package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.manufacturing.production.ProductionPlanSubAssemblyItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductionPlanSubAssemblyItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String productionItem,
        String itemName,
        String fgWarehouse,
        String parentItemCode,
        LocalDateTime scheduleDate,
        BigDecimal qty,
        String bomNo,
        Integer bomLevel,
        String typeOfManufacturing,
        String supplier,
        BigDecimal woProducedQty,
        String purchaseOrder,
        String productionPlanItem,
        BigDecimal receivedQty,
        Integer indent,
        String uom,
        String stockUom,
        String description,
        BigDecimal actualQty,
        BigDecimal projectedQty,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanSubAssemblyItemDto fromEntity(ProductionPlanSubAssemblyItemDao eProductionPlanSubAssemblyItemDao) {
        return new ProductionPlanSubAssemblyItemDto(
                eProductionPlanSubAssemblyItemDao.getName(),
                eProductionPlanSubAssemblyItemDao.getCreation(),
                eProductionPlanSubAssemblyItemDao.getModified(),
                eProductionPlanSubAssemblyItemDao.getModifiedBy(),
                eProductionPlanSubAssemblyItemDao.getOwner(),
                eProductionPlanSubAssemblyItemDao.getIsDocStatus(),
                eProductionPlanSubAssemblyItemDao.getIdx(),
                eProductionPlanSubAssemblyItemDao.getProductionItem(),
                eProductionPlanSubAssemblyItemDao.getItemName(),
                eProductionPlanSubAssemblyItemDao.getFgWarehouse(),
                eProductionPlanSubAssemblyItemDao.getParentItemCode(),
                eProductionPlanSubAssemblyItemDao.getScheduleDate(),
                eProductionPlanSubAssemblyItemDao.getQty(),
                eProductionPlanSubAssemblyItemDao.getBomNo(),
                eProductionPlanSubAssemblyItemDao.getBomLevel(),
                eProductionPlanSubAssemblyItemDao.getTypeOfManufacturing(),
                eProductionPlanSubAssemblyItemDao.getSupplier(),
                eProductionPlanSubAssemblyItemDao.getWoProducedQty(),
                eProductionPlanSubAssemblyItemDao.getPurchaseOrder(),
                eProductionPlanSubAssemblyItemDao.getProductionPlanItem(),
                eProductionPlanSubAssemblyItemDao.getReceivedQty(),
                eProductionPlanSubAssemblyItemDao.getIndent(),
                eProductionPlanSubAssemblyItemDao.getUom(),
                eProductionPlanSubAssemblyItemDao.getStockUom(),
                eProductionPlanSubAssemblyItemDao.getDescription(),
                eProductionPlanSubAssemblyItemDao.getActualQty(),
                eProductionPlanSubAssemblyItemDao.getProjectedQty(),
                eProductionPlanSubAssemblyItemDao.getParent(),
                eProductionPlanSubAssemblyItemDao.getParentField(),
                eProductionPlanSubAssemblyItemDao.getParentType());
    }

    public static void fromDTO(ProductionPlanSubAssemblyItemDto vProductionPlanSubAssemblyItemDto, ProductionPlanSubAssemblyItemDao eProductionPlanSubAssemblyItemDao) {
        eProductionPlanSubAssemblyItemDao.setName(vProductionPlanSubAssemblyItemDto.name());
        eProductionPlanSubAssemblyItemDao.setCreation(vProductionPlanSubAssemblyItemDto.creation());
        eProductionPlanSubAssemblyItemDao.setModified(vProductionPlanSubAssemblyItemDto.modified());
        eProductionPlanSubAssemblyItemDao.setModifiedBy(vProductionPlanSubAssemblyItemDto.modifiedBy());
        eProductionPlanSubAssemblyItemDao.setOwner(vProductionPlanSubAssemblyItemDto.owner());
        eProductionPlanSubAssemblyItemDao.setIsDocStatus(vProductionPlanSubAssemblyItemDto.isDocStatus());
        eProductionPlanSubAssemblyItemDao.setIdx(vProductionPlanSubAssemblyItemDto.idx());
        eProductionPlanSubAssemblyItemDao.setProductionItem(vProductionPlanSubAssemblyItemDto.productionItem());
        eProductionPlanSubAssemblyItemDao.setItemName(vProductionPlanSubAssemblyItemDto.itemName());
        eProductionPlanSubAssemblyItemDao.setFgWarehouse(vProductionPlanSubAssemblyItemDto.fgWarehouse());
        eProductionPlanSubAssemblyItemDao.setParentItemCode(vProductionPlanSubAssemblyItemDto.parentItemCode());
        eProductionPlanSubAssemblyItemDao.setScheduleDate(vProductionPlanSubAssemblyItemDto.scheduleDate());
        eProductionPlanSubAssemblyItemDao.setQty(vProductionPlanSubAssemblyItemDto.qty());
        eProductionPlanSubAssemblyItemDao.setBomNo(vProductionPlanSubAssemblyItemDto.bomNo());
        eProductionPlanSubAssemblyItemDao.setBomLevel(vProductionPlanSubAssemblyItemDto.bomLevel());
        eProductionPlanSubAssemblyItemDao.setTypeOfManufacturing(vProductionPlanSubAssemblyItemDto.typeOfManufacturing());
        eProductionPlanSubAssemblyItemDao.setSupplier(vProductionPlanSubAssemblyItemDto.supplier());
        eProductionPlanSubAssemblyItemDao.setWoProducedQty(vProductionPlanSubAssemblyItemDto.woProducedQty());
        eProductionPlanSubAssemblyItemDao.setPurchaseOrder(vProductionPlanSubAssemblyItemDto.purchaseOrder());
        eProductionPlanSubAssemblyItemDao.setProductionPlanItem(vProductionPlanSubAssemblyItemDto.productionPlanItem());
        eProductionPlanSubAssemblyItemDao.setReceivedQty(vProductionPlanSubAssemblyItemDto.receivedQty());
        eProductionPlanSubAssemblyItemDao.setIndent(vProductionPlanSubAssemblyItemDto.indent());
        eProductionPlanSubAssemblyItemDao.setUom(vProductionPlanSubAssemblyItemDto.uom());
        eProductionPlanSubAssemblyItemDao.setStockUom(vProductionPlanSubAssemblyItemDto.stockUom());
        eProductionPlanSubAssemblyItemDao.setDescription(vProductionPlanSubAssemblyItemDto.description());
        eProductionPlanSubAssemblyItemDao.setActualQty(vProductionPlanSubAssemblyItemDto.actualQty());
        eProductionPlanSubAssemblyItemDao.setProjectedQty(vProductionPlanSubAssemblyItemDto.projectedQty());
        eProductionPlanSubAssemblyItemDao.setParent(vProductionPlanSubAssemblyItemDto.parent());
        eProductionPlanSubAssemblyItemDao.setParentField(vProductionPlanSubAssemblyItemDto.parentField());
        eProductionPlanSubAssemblyItemDao.setParentType(vProductionPlanSubAssemblyItemDto.parentType());
    }
}