package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingOrderServiceItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubcontractingOrderServiceItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        BigDecimal qty,
        BigDecimal rate,
        BigDecimal amount,
        String fgItem,
        BigDecimal fgItemQty,
        String purchaseOrderItem,
        String materialRequest,
        String materialRequestItem,
        String parent,
        String parentField,
        String parentType
) {
    public static SubcontractingOrderServiceItemDto fromEntity(SubcontractingOrderServiceItemDao eSubcontractingOrderServiceItemDao) {
        return new SubcontractingOrderServiceItemDto(
                eSubcontractingOrderServiceItemDao.getName(),
                eSubcontractingOrderServiceItemDao.getCreation(),
                eSubcontractingOrderServiceItemDao.getModified(),
                eSubcontractingOrderServiceItemDao.getModifiedBy(),
                eSubcontractingOrderServiceItemDao.getOwner(),
                eSubcontractingOrderServiceItemDao.getIsDocStatus(),
                eSubcontractingOrderServiceItemDao.getIdx(),
                eSubcontractingOrderServiceItemDao.getItemCode(),
                eSubcontractingOrderServiceItemDao.getItemName(),
                eSubcontractingOrderServiceItemDao.getQty(),
                eSubcontractingOrderServiceItemDao.getRate(),
                eSubcontractingOrderServiceItemDao.getAmount(),
                eSubcontractingOrderServiceItemDao.getFgItem(),
                eSubcontractingOrderServiceItemDao.getFgItemQty(),
                eSubcontractingOrderServiceItemDao.getPurchaseOrderItem(),
                eSubcontractingOrderServiceItemDao.getMaterialRequest(),
                eSubcontractingOrderServiceItemDao.getMaterialRequestItem(),
                eSubcontractingOrderServiceItemDao.getParent(),
                eSubcontractingOrderServiceItemDao.getParentField(),
                eSubcontractingOrderServiceItemDao.getParentType());
    }

    public static void fromDTO(SubcontractingOrderServiceItemDto vSubcontractingOrderServiceItemDto, SubcontractingOrderServiceItemDao eSubcontractingOrderServiceItemDao) {
        eSubcontractingOrderServiceItemDao.setName(vSubcontractingOrderServiceItemDto.name());
        eSubcontractingOrderServiceItemDao.setCreation(vSubcontractingOrderServiceItemDto.creation());
        eSubcontractingOrderServiceItemDao.setModified(vSubcontractingOrderServiceItemDto.modified());
        eSubcontractingOrderServiceItemDao.setModifiedBy(vSubcontractingOrderServiceItemDto.modifiedBy());
        eSubcontractingOrderServiceItemDao.setOwner(vSubcontractingOrderServiceItemDto.owner());
        eSubcontractingOrderServiceItemDao.setIsDocStatus(vSubcontractingOrderServiceItemDto.isDocStatus());
        eSubcontractingOrderServiceItemDao.setIdx(vSubcontractingOrderServiceItemDto.idx());
        eSubcontractingOrderServiceItemDao.setItemCode(vSubcontractingOrderServiceItemDto.itemCode());
        eSubcontractingOrderServiceItemDao.setItemName(vSubcontractingOrderServiceItemDto.itemName());
        eSubcontractingOrderServiceItemDao.setQty(vSubcontractingOrderServiceItemDto.qty());
        eSubcontractingOrderServiceItemDao.setRate(vSubcontractingOrderServiceItemDto.rate());
        eSubcontractingOrderServiceItemDao.setAmount(vSubcontractingOrderServiceItemDto.amount());
        eSubcontractingOrderServiceItemDao.setFgItem(vSubcontractingOrderServiceItemDto.fgItem());
        eSubcontractingOrderServiceItemDao.setFgItemQty(vSubcontractingOrderServiceItemDto.fgItemQty());
        eSubcontractingOrderServiceItemDao.setPurchaseOrderItem(vSubcontractingOrderServiceItemDto.purchaseOrderItem());
        eSubcontractingOrderServiceItemDao.setMaterialRequest(vSubcontractingOrderServiceItemDto.materialRequest());
        eSubcontractingOrderServiceItemDao.setMaterialRequestItem(vSubcontractingOrderServiceItemDto.materialRequestItem());
        eSubcontractingOrderServiceItemDao.setParent(vSubcontractingOrderServiceItemDto.parent());
        eSubcontractingOrderServiceItemDao.setParentField(vSubcontractingOrderServiceItemDto.parentField());
        eSubcontractingOrderServiceItemDao.setParentType(vSubcontractingOrderServiceItemDto.parentType());
    }
}