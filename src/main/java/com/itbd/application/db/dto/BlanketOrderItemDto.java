package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BlanketOrderItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BlanketOrderItemDto(
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
        String partyItemCode,
        BigDecimal qty,
        BigDecimal rate,
        BigDecimal orderedQty,
        String termsAndConditions,
        String parent,
        String parentField,
        String parentType
) {
    public static BlanketOrderItemDto fromEntity(BlanketOrderItemDao eBlanketOrderItemDao) {
        return new BlanketOrderItemDto(
                eBlanketOrderItemDao.getName(),
                eBlanketOrderItemDao.getCreation(),
                eBlanketOrderItemDao.getModified(),
                eBlanketOrderItemDao.getModifiedBy(),
                eBlanketOrderItemDao.getOwner(),
                eBlanketOrderItemDao.getIsDocStatus(),
                eBlanketOrderItemDao.getIdx(),
                eBlanketOrderItemDao.getItemCode(),
                eBlanketOrderItemDao.getItemName(),
                eBlanketOrderItemDao.getPartyItemCode(),
                eBlanketOrderItemDao.getQty(),
                eBlanketOrderItemDao.getRate(),
                eBlanketOrderItemDao.getOrderedQty(),
                eBlanketOrderItemDao.getTermsAndConditions(),
                eBlanketOrderItemDao.getParent(),
                eBlanketOrderItemDao.getParentField(),
                eBlanketOrderItemDao.getParentType());
    }

    public static void fromDTO(BlanketOrderItemDto vBlanketOrderItemDto, BlanketOrderItemDao eBlanketOrderItemDao) {
        eBlanketOrderItemDao.setName(vBlanketOrderItemDto.name());
        eBlanketOrderItemDao.setCreation(vBlanketOrderItemDto.creation());
        eBlanketOrderItemDao.setModified(vBlanketOrderItemDto.modified());
        eBlanketOrderItemDao.setModifiedBy(vBlanketOrderItemDto.modifiedBy());
        eBlanketOrderItemDao.setOwner(vBlanketOrderItemDto.owner());
        eBlanketOrderItemDao.setIsDocStatus(vBlanketOrderItemDto.isDocStatus());
        eBlanketOrderItemDao.setIdx(vBlanketOrderItemDto.idx());
        eBlanketOrderItemDao.setItemCode(vBlanketOrderItemDto.itemCode());
        eBlanketOrderItemDao.setItemName(vBlanketOrderItemDto.itemName());
        eBlanketOrderItemDao.setPartyItemCode(vBlanketOrderItemDto.partyItemCode());
        eBlanketOrderItemDao.setQty(vBlanketOrderItemDto.qty());
        eBlanketOrderItemDao.setRate(vBlanketOrderItemDto.rate());
        eBlanketOrderItemDao.setOrderedQty(vBlanketOrderItemDto.orderedQty());
        eBlanketOrderItemDao.setTermsAndConditions(vBlanketOrderItemDto.termsAndConditions());
        eBlanketOrderItemDao.setParent(vBlanketOrderItemDto.parent());
        eBlanketOrderItemDao.setParentField(vBlanketOrderItemDto.parentField());
        eBlanketOrderItemDao.setParentType(vBlanketOrderItemDto.parentType());
    }
}