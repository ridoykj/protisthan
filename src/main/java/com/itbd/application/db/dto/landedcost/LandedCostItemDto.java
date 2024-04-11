package com.itbd.application.db.dto.landedcost;

import com.itbd.application.db.dao.landedcost.LandedCostItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LandedCostItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String description,
        String receiptDocumentType,
        String receiptDocument,
        BigDecimal qty,
        BigDecimal rate,
        BigDecimal amount,
        Boolean isFixedAsset,
        BigDecimal applicableCharges,
        String purchaseReceiptItem,
        String costCenter,
        String parent,
        String parentField,
        String parentType
) {
    public static LandedCostItemDto fromEntity(LandedCostItemDao eLandedCostItemDao) {
        return new LandedCostItemDto(
                eLandedCostItemDao.getName(),
                eLandedCostItemDao.getCreation(),
                eLandedCostItemDao.getModified(),
                eLandedCostItemDao.getModifiedBy(),
                eLandedCostItemDao.getOwner(),
                eLandedCostItemDao.getIsDocStatus(),
                eLandedCostItemDao.getIdx(),
                eLandedCostItemDao.getItemCode(),
                eLandedCostItemDao.getDescription(),
                eLandedCostItemDao.getReceiptDocumentType(),
                eLandedCostItemDao.getReceiptDocument(),
                eLandedCostItemDao.getQty(),
                eLandedCostItemDao.getRate(),
                eLandedCostItemDao.getAmount(),
                eLandedCostItemDao.getIsFixedAsset(),
                eLandedCostItemDao.getApplicableCharges(),
                eLandedCostItemDao.getPurchaseReceiptItem(),
                eLandedCostItemDao.getCostCenter(),
                eLandedCostItemDao.getParent(),
                eLandedCostItemDao.getParentField(),
                eLandedCostItemDao.getParentType());
    }

    public static void fromDTO(LandedCostItemDto vLandedCostItemDto, LandedCostItemDao eLandedCostItemDao) {
        eLandedCostItemDao.setName(vLandedCostItemDto.name());
        eLandedCostItemDao.setCreation(vLandedCostItemDto.creation());
        eLandedCostItemDao.setModified(vLandedCostItemDto.modified());
        eLandedCostItemDao.setModifiedBy(vLandedCostItemDto.modifiedBy());
        eLandedCostItemDao.setOwner(vLandedCostItemDto.owner());
        eLandedCostItemDao.setIsDocStatus(vLandedCostItemDto.isDocStatus());
        eLandedCostItemDao.setIdx(vLandedCostItemDto.idx());
        eLandedCostItemDao.setItemCode(vLandedCostItemDto.itemCode());
        eLandedCostItemDao.setDescription(vLandedCostItemDto.description());
        eLandedCostItemDao.setReceiptDocumentType(vLandedCostItemDto.receiptDocumentType());
        eLandedCostItemDao.setReceiptDocument(vLandedCostItemDto.receiptDocument());
        eLandedCostItemDao.setQty(vLandedCostItemDto.qty());
        eLandedCostItemDao.setRate(vLandedCostItemDto.rate());
        eLandedCostItemDao.setAmount(vLandedCostItemDto.amount());
        eLandedCostItemDao.setIsFixedAsset(vLandedCostItemDto.isFixedAsset());
        eLandedCostItemDao.setApplicableCharges(vLandedCostItemDto.applicableCharges());
        eLandedCostItemDao.setPurchaseReceiptItem(vLandedCostItemDto.purchaseReceiptItem());
        eLandedCostItemDao.setCostCenter(vLandedCostItemDto.costCenter());
        eLandedCostItemDao.setParent(vLandedCostItemDto.parent());
        eLandedCostItemDao.setParentField(vLandedCostItemDto.parentField());
        eLandedCostItemDao.setParentType(vLandedCostItemDto.parentType());
    }
}