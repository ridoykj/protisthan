package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemReorderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ItemReorderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String warehouseGroup,
        String warehouse,
        BigDecimal warehouseReorderLevel,
        BigDecimal warehouseReorderQty,
        String materialRequestType,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemReorderDto fromEntity(ItemReorderDao eItemReorderDao) {
        return new ItemReorderDto(
                eItemReorderDao.getName(),
                eItemReorderDao.getCreation(),
                eItemReorderDao.getModified(),
                eItemReorderDao.getModifiedBy(),
                eItemReorderDao.getOwner(),
                eItemReorderDao.getIsDocStatus(),
                eItemReorderDao.getIdx(),
                eItemReorderDao.getWarehouseGroup(),
                eItemReorderDao.getWarehouse(),
                eItemReorderDao.getWarehouseReorderLevel(),
                eItemReorderDao.getWarehouseReorderQty(),
                eItemReorderDao.getMaterialRequestType(),
                eItemReorderDao.getParent(),
                eItemReorderDao.getParentField(),
                eItemReorderDao.getParentType());
    }

    public static void fromDTO(ItemReorderDto vItemReorderDto, ItemReorderDao eItemReorderDao) {
        eItemReorderDao.setName(vItemReorderDto.name());
        eItemReorderDao.setCreation(vItemReorderDto.creation());
        eItemReorderDao.setModified(vItemReorderDto.modified());
        eItemReorderDao.setModifiedBy(vItemReorderDto.modifiedBy());
        eItemReorderDao.setOwner(vItemReorderDto.owner());
        eItemReorderDao.setIsDocStatus(vItemReorderDto.isDocStatus());
        eItemReorderDao.setIdx(vItemReorderDto.idx());
        eItemReorderDao.setWarehouseGroup(vItemReorderDto.warehouseGroup());
        eItemReorderDao.setWarehouse(vItemReorderDto.warehouse());
        eItemReorderDao.setWarehouseReorderLevel(vItemReorderDto.warehouseReorderLevel());
        eItemReorderDao.setWarehouseReorderQty(vItemReorderDto.warehouseReorderQty());
        eItemReorderDao.setMaterialRequestType(vItemReorderDto.materialRequestType());
        eItemReorderDao.setParent(vItemReorderDto.parent());
        eItemReorderDao.setParentField(vItemReorderDto.parentField());
        eItemReorderDao.setParentType(vItemReorderDto.parentType());
    }
}