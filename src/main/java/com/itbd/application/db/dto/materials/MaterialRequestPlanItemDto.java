package com.itbd.application.db.dto.materials;

import com.itbd.application.db.dao.materials.MaterialRequestPlanItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaterialRequestPlanItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String fromWarehouse,
        String warehouse,
        String itemName,
        String materialRequestType,
        BigDecimal quantity,
        BigDecimal requiredBomQty,
        LocalDate scheduleDate,
        String uom,
        BigDecimal conversionFactor,
        String description,
        BigDecimal minOrderQty,
        String salesOrder,
        BigDecimal actualQty,
        BigDecimal requestedQty,
        BigDecimal reservedQtyForProduction,
        BigDecimal orderedQty,
        BigDecimal projectedQty,
        BigDecimal safetyStock,
        String parent,
        String parentField,
        String parentType
) {
    public static MaterialRequestPlanItemDto fromEntity(MaterialRequestPlanItemDao eMaterialRequestPlanItemDao) {
        return new MaterialRequestPlanItemDto(
                eMaterialRequestPlanItemDao.getName(),
                eMaterialRequestPlanItemDao.getCreation(),
                eMaterialRequestPlanItemDao.getModified(),
                eMaterialRequestPlanItemDao.getModifiedBy(),
                eMaterialRequestPlanItemDao.getOwner(),
                eMaterialRequestPlanItemDao.getIsDocStatus(),
                eMaterialRequestPlanItemDao.getIdx(),
                eMaterialRequestPlanItemDao.getItemCode(),
                eMaterialRequestPlanItemDao.getFromWarehouse(),
                eMaterialRequestPlanItemDao.getWarehouse(),
                eMaterialRequestPlanItemDao.getItemName(),
                eMaterialRequestPlanItemDao.getMaterialRequestType(),
                eMaterialRequestPlanItemDao.getQuantity(),
                eMaterialRequestPlanItemDao.getRequiredBomQty(),
                eMaterialRequestPlanItemDao.getScheduleDate(),
                eMaterialRequestPlanItemDao.getUom(),
                eMaterialRequestPlanItemDao.getConversionFactor(),
                eMaterialRequestPlanItemDao.getDescription(),
                eMaterialRequestPlanItemDao.getMinOrderQty(),
                eMaterialRequestPlanItemDao.getSalesOrder(),
                eMaterialRequestPlanItemDao.getActualQty(),
                eMaterialRequestPlanItemDao.getRequestedQty(),
                eMaterialRequestPlanItemDao.getReservedQtyForProduction(),
                eMaterialRequestPlanItemDao.getOrderedQty(),
                eMaterialRequestPlanItemDao.getProjectedQty(),
                eMaterialRequestPlanItemDao.getSafetyStock(),
                eMaterialRequestPlanItemDao.getParent(),
                eMaterialRequestPlanItemDao.getParentField(),
                eMaterialRequestPlanItemDao.getParentType());
    }

    public static void fromDTO(MaterialRequestPlanItemDto vMaterialRequestPlanItemDto, MaterialRequestPlanItemDao eMaterialRequestPlanItemDao) {
        eMaterialRequestPlanItemDao.setName(vMaterialRequestPlanItemDto.name());
        eMaterialRequestPlanItemDao.setCreation(vMaterialRequestPlanItemDto.creation());
        eMaterialRequestPlanItemDao.setModified(vMaterialRequestPlanItemDto.modified());
        eMaterialRequestPlanItemDao.setModifiedBy(vMaterialRequestPlanItemDto.modifiedBy());
        eMaterialRequestPlanItemDao.setOwner(vMaterialRequestPlanItemDto.owner());
        eMaterialRequestPlanItemDao.setIsDocStatus(vMaterialRequestPlanItemDto.isDocStatus());
        eMaterialRequestPlanItemDao.setIdx(vMaterialRequestPlanItemDto.idx());
        eMaterialRequestPlanItemDao.setItemCode(vMaterialRequestPlanItemDto.itemCode());
        eMaterialRequestPlanItemDao.setFromWarehouse(vMaterialRequestPlanItemDto.fromWarehouse());
        eMaterialRequestPlanItemDao.setWarehouse(vMaterialRequestPlanItemDto.warehouse());
        eMaterialRequestPlanItemDao.setItemName(vMaterialRequestPlanItemDto.itemName());
        eMaterialRequestPlanItemDao.setMaterialRequestType(vMaterialRequestPlanItemDto.materialRequestType());
        eMaterialRequestPlanItemDao.setQuantity(vMaterialRequestPlanItemDto.quantity());
        eMaterialRequestPlanItemDao.setRequiredBomQty(vMaterialRequestPlanItemDto.requiredBomQty());
        eMaterialRequestPlanItemDao.setScheduleDate(vMaterialRequestPlanItemDto.scheduleDate());
        eMaterialRequestPlanItemDao.setUom(vMaterialRequestPlanItemDto.uom());
        eMaterialRequestPlanItemDao.setConversionFactor(vMaterialRequestPlanItemDto.conversionFactor());
        eMaterialRequestPlanItemDao.setDescription(vMaterialRequestPlanItemDto.description());
        eMaterialRequestPlanItemDao.setMinOrderQty(vMaterialRequestPlanItemDto.minOrderQty());
        eMaterialRequestPlanItemDao.setSalesOrder(vMaterialRequestPlanItemDto.salesOrder());
        eMaterialRequestPlanItemDao.setActualQty(vMaterialRequestPlanItemDto.actualQty());
        eMaterialRequestPlanItemDao.setRequestedQty(vMaterialRequestPlanItemDto.requestedQty());
        eMaterialRequestPlanItemDao.setReservedQtyForProduction(vMaterialRequestPlanItemDto.reservedQtyForProduction());
        eMaterialRequestPlanItemDao.setOrderedQty(vMaterialRequestPlanItemDto.orderedQty());
        eMaterialRequestPlanItemDao.setProjectedQty(vMaterialRequestPlanItemDto.projectedQty());
        eMaterialRequestPlanItemDao.setSafetyStock(vMaterialRequestPlanItemDto.safetyStock());
        eMaterialRequestPlanItemDao.setParent(vMaterialRequestPlanItemDto.parent());
        eMaterialRequestPlanItemDao.setParentField(vMaterialRequestPlanItemDto.parentField());
        eMaterialRequestPlanItemDao.setParentType(vMaterialRequestPlanItemDto.parentType());
    }
}