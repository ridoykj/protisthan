package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.manufacturing.production.ProductionPlanItemReferenceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProductionPlanItemReferenceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemReference,
        String salesOrder,
        String salesOrderItem,
        String qty,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanItemReferenceDto fromEntity(ProductionPlanItemReferenceDao eProductionPlanItemReferenceDao) {
        return new ProductionPlanItemReferenceDto(
                eProductionPlanItemReferenceDao.getName(),
                eProductionPlanItemReferenceDao.getCreation(),
                eProductionPlanItemReferenceDao.getModified(),
                eProductionPlanItemReferenceDao.getModifiedBy(),
                eProductionPlanItemReferenceDao.getOwner(),
                eProductionPlanItemReferenceDao.getIsDocStatus(),
                eProductionPlanItemReferenceDao.getIdx(),
                eProductionPlanItemReferenceDao.getItemReference(),
                eProductionPlanItemReferenceDao.getSalesOrder(),
                eProductionPlanItemReferenceDao.getSalesOrderItem(),
                eProductionPlanItemReferenceDao.getQty(),
                eProductionPlanItemReferenceDao.getParent(),
                eProductionPlanItemReferenceDao.getParentField(),
                eProductionPlanItemReferenceDao.getParentType());
    }

    public static void fromDTO(ProductionPlanItemReferenceDto vProductionPlanItemReferenceDto, ProductionPlanItemReferenceDao eProductionPlanItemReferenceDao) {
        eProductionPlanItemReferenceDao.setName(vProductionPlanItemReferenceDto.name());
        eProductionPlanItemReferenceDao.setCreation(vProductionPlanItemReferenceDto.creation());
        eProductionPlanItemReferenceDao.setModified(vProductionPlanItemReferenceDto.modified());
        eProductionPlanItemReferenceDao.setModifiedBy(vProductionPlanItemReferenceDto.modifiedBy());
        eProductionPlanItemReferenceDao.setOwner(vProductionPlanItemReferenceDto.owner());
        eProductionPlanItemReferenceDao.setIsDocStatus(vProductionPlanItemReferenceDto.isDocStatus());
        eProductionPlanItemReferenceDao.setIdx(vProductionPlanItemReferenceDto.idx());
        eProductionPlanItemReferenceDao.setItemReference(vProductionPlanItemReferenceDto.itemReference());
        eProductionPlanItemReferenceDao.setSalesOrder(vProductionPlanItemReferenceDto.salesOrder());
        eProductionPlanItemReferenceDao.setSalesOrderItem(vProductionPlanItemReferenceDto.salesOrderItem());
        eProductionPlanItemReferenceDao.setQty(vProductionPlanItemReferenceDto.qty());
        eProductionPlanItemReferenceDao.setParent(vProductionPlanItemReferenceDto.parent());
        eProductionPlanItemReferenceDao.setParentField(vProductionPlanItemReferenceDto.parentField());
        eProductionPlanItemReferenceDao.setParentType(vProductionPlanItemReferenceDto.parentType());
    }
}