package com.itbd.application.db.dto.workorder;

import com.itbd.application.db.dao.manufacturing.workorder.WorkOrderItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record WorkOrderItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String operation,
        String itemCode,
        String sourceWarehouse,
        String itemName,
        String description,
        Boolean allowAlternativeItem,
        Boolean includeItemInManufacturing,
        BigDecimal requiredQty,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal transferredQty,
        BigDecimal consumedQty,
        BigDecimal returnedQty,
        BigDecimal availableQtyAtSourceWarehouse,
        BigDecimal availableQtyAtWipWarehouse,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkOrderItemDto fromEntity(WorkOrderItemDao eWorkOrderItemDao) {
        return new WorkOrderItemDto(
                eWorkOrderItemDao.getName(),
                eWorkOrderItemDao.getCreation(),
                eWorkOrderItemDao.getModified(),
                eWorkOrderItemDao.getModifiedBy(),
                eWorkOrderItemDao.getOwner(),
                eWorkOrderItemDao.getIsDocStatus(),
                eWorkOrderItemDao.getIdx(),
                eWorkOrderItemDao.getOperation(),
                eWorkOrderItemDao.getItemCode(),
                eWorkOrderItemDao.getSourceWarehouse(),
                eWorkOrderItemDao.getItemName(),
                eWorkOrderItemDao.getDescription(),
                eWorkOrderItemDao.getAllowAlternativeItem(),
                eWorkOrderItemDao.getIncludeItemInManufacturing(),
                eWorkOrderItemDao.getRequiredQty(),
                eWorkOrderItemDao.getRate(),
                eWorkOrderItemDao.getAmount(),
                eWorkOrderItemDao.getTransferredQty(),
                eWorkOrderItemDao.getConsumedQty(),
                eWorkOrderItemDao.getReturnedQty(),
                eWorkOrderItemDao.getAvailableQtyAtSourceWarehouse(),
                eWorkOrderItemDao.getAvailableQtyAtWipWarehouse(),
                eWorkOrderItemDao.getParent(),
                eWorkOrderItemDao.getParentField(),
                eWorkOrderItemDao.getParentType());
    }

    public static void fromDTO(WorkOrderItemDto vWorkOrderItemDto, WorkOrderItemDao eWorkOrderItemDao) {
        eWorkOrderItemDao.setName(vWorkOrderItemDto.name());
        eWorkOrderItemDao.setCreation(vWorkOrderItemDto.creation());
        eWorkOrderItemDao.setModified(vWorkOrderItemDto.modified());
        eWorkOrderItemDao.setModifiedBy(vWorkOrderItemDto.modifiedBy());
        eWorkOrderItemDao.setOwner(vWorkOrderItemDto.owner());
        eWorkOrderItemDao.setIsDocStatus(vWorkOrderItemDto.isDocStatus());
        eWorkOrderItemDao.setIdx(vWorkOrderItemDto.idx());
        eWorkOrderItemDao.setOperation(vWorkOrderItemDto.operation());
        eWorkOrderItemDao.setItemCode(vWorkOrderItemDto.itemCode());
        eWorkOrderItemDao.setSourceWarehouse(vWorkOrderItemDto.sourceWarehouse());
        eWorkOrderItemDao.setItemName(vWorkOrderItemDto.itemName());
        eWorkOrderItemDao.setDescription(vWorkOrderItemDto.description());
        eWorkOrderItemDao.setAllowAlternativeItem(vWorkOrderItemDto.allowAlternativeItem());
        eWorkOrderItemDao.setIncludeItemInManufacturing(vWorkOrderItemDto.includeItemInManufacturing());
        eWorkOrderItemDao.setRequiredQty(vWorkOrderItemDto.requiredQty());
        eWorkOrderItemDao.setRate(vWorkOrderItemDto.rate());
        eWorkOrderItemDao.setAmount(vWorkOrderItemDto.amount());
        eWorkOrderItemDao.setTransferredQty(vWorkOrderItemDto.transferredQty());
        eWorkOrderItemDao.setConsumedQty(vWorkOrderItemDto.consumedQty());
        eWorkOrderItemDao.setReturnedQty(vWorkOrderItemDto.returnedQty());
        eWorkOrderItemDao.setAvailableQtyAtSourceWarehouse(vWorkOrderItemDto.availableQtyAtSourceWarehouse());
        eWorkOrderItemDao.setAvailableQtyAtWipWarehouse(vWorkOrderItemDto.availableQtyAtWipWarehouse());
        eWorkOrderItemDao.setParent(vWorkOrderItemDto.parent());
        eWorkOrderItemDao.setParentField(vWorkOrderItemDto.parentField());
        eWorkOrderItemDao.setParentType(vWorkOrderItemDto.parentType());
    }
}