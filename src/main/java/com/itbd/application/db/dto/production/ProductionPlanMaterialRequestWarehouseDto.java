package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.production.ProductionPlanMaterialRequestWarehouseDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProductionPlanMaterialRequestWarehouseDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String warehouse,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanMaterialRequestWarehouseDto fromEntity(ProductionPlanMaterialRequestWarehouseDao eProductionPlanMaterialRequestWarehouseDao) {
        return new ProductionPlanMaterialRequestWarehouseDto(
                eProductionPlanMaterialRequestWarehouseDao.getName(),
                eProductionPlanMaterialRequestWarehouseDao.getCreation(),
                eProductionPlanMaterialRequestWarehouseDao.getModified(),
                eProductionPlanMaterialRequestWarehouseDao.getModifiedBy(),
                eProductionPlanMaterialRequestWarehouseDao.getOwner(),
                eProductionPlanMaterialRequestWarehouseDao.getIsDocStatus(),
                eProductionPlanMaterialRequestWarehouseDao.getIdx(),
                eProductionPlanMaterialRequestWarehouseDao.getWarehouse(),
                eProductionPlanMaterialRequestWarehouseDao.getParent(),
                eProductionPlanMaterialRequestWarehouseDao.getParentField(),
                eProductionPlanMaterialRequestWarehouseDao.getParentType());
    }

    public static void fromDTO(ProductionPlanMaterialRequestWarehouseDto vProductionPlanMaterialRequestWarehouseDto, ProductionPlanMaterialRequestWarehouseDao eProductionPlanMaterialRequestWarehouseDao) {
        eProductionPlanMaterialRequestWarehouseDao.setName(vProductionPlanMaterialRequestWarehouseDto.name());
        eProductionPlanMaterialRequestWarehouseDao.setCreation(vProductionPlanMaterialRequestWarehouseDto.creation());
        eProductionPlanMaterialRequestWarehouseDao.setModified(vProductionPlanMaterialRequestWarehouseDto.modified());
        eProductionPlanMaterialRequestWarehouseDao.setModifiedBy(vProductionPlanMaterialRequestWarehouseDto.modifiedBy());
        eProductionPlanMaterialRequestWarehouseDao.setOwner(vProductionPlanMaterialRequestWarehouseDto.owner());
        eProductionPlanMaterialRequestWarehouseDao.setIsDocStatus(vProductionPlanMaterialRequestWarehouseDto.isDocStatus());
        eProductionPlanMaterialRequestWarehouseDao.setIdx(vProductionPlanMaterialRequestWarehouseDto.idx());
        eProductionPlanMaterialRequestWarehouseDao.setWarehouse(vProductionPlanMaterialRequestWarehouseDto.warehouse());
        eProductionPlanMaterialRequestWarehouseDao.setParent(vProductionPlanMaterialRequestWarehouseDto.parent());
        eProductionPlanMaterialRequestWarehouseDao.setParentField(vProductionPlanMaterialRequestWarehouseDto.parentField());
        eProductionPlanMaterialRequestWarehouseDao.setParentType(vProductionPlanMaterialRequestWarehouseDto.parentType());
    }
}