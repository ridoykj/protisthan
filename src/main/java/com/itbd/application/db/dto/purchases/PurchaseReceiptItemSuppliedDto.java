package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseReceiptItemSuppliedDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseReceiptItemSuppliedDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String mainItemCode,
        String rmItemCode,
        String itemName,
        String bomDetailNo,
        String description,
        String stockUom,
        BigDecimal conversionFactor,
        String referenceName,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal requiredQty,
        BigDecimal consumedQty,
        BigDecimal currentStock,
        String batchNo,
        String serialNo,
        String purchaseOrder,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseReceiptItemSuppliedDto fromEntity(PurchaseReceiptItemSuppliedDao ePurchaseReceiptItemSuppliedDao) {
        return new PurchaseReceiptItemSuppliedDto(
                ePurchaseReceiptItemSuppliedDao.getName(),
                ePurchaseReceiptItemSuppliedDao.getCreation(),
                ePurchaseReceiptItemSuppliedDao.getModified(),
                ePurchaseReceiptItemSuppliedDao.getModifiedBy(),
                ePurchaseReceiptItemSuppliedDao.getOwner(),
                ePurchaseReceiptItemSuppliedDao.getIsDocStatus(),
                ePurchaseReceiptItemSuppliedDao.getIdx(),
                ePurchaseReceiptItemSuppliedDao.getMainItemCode(),
                ePurchaseReceiptItemSuppliedDao.getRmItemCode(),
                ePurchaseReceiptItemSuppliedDao.getItemName(),
                ePurchaseReceiptItemSuppliedDao.getBomDetailNo(),
                ePurchaseReceiptItemSuppliedDao.getDescription(),
                ePurchaseReceiptItemSuppliedDao.getStockUom(),
                ePurchaseReceiptItemSuppliedDao.getConversionFactor(),
                ePurchaseReceiptItemSuppliedDao.getReferenceName(),
                ePurchaseReceiptItemSuppliedDao.getRate(),
                ePurchaseReceiptItemSuppliedDao.getAmount(),
                ePurchaseReceiptItemSuppliedDao.getRequiredQty(),
                ePurchaseReceiptItemSuppliedDao.getConsumedQty(),
                ePurchaseReceiptItemSuppliedDao.getCurrentStock(),
                ePurchaseReceiptItemSuppliedDao.getBatchNo(),
                ePurchaseReceiptItemSuppliedDao.getSerialNo(),
                ePurchaseReceiptItemSuppliedDao.getPurchaseOrder(),
                ePurchaseReceiptItemSuppliedDao.getParent(),
                ePurchaseReceiptItemSuppliedDao.getParentField(),
                ePurchaseReceiptItemSuppliedDao.getParentType());
    }

    public static void fromDTO(PurchaseReceiptItemSuppliedDto vPurchaseReceiptItemSuppliedDto, PurchaseReceiptItemSuppliedDao ePurchaseReceiptItemSuppliedDao) {
        ePurchaseReceiptItemSuppliedDao.setName(vPurchaseReceiptItemSuppliedDto.name());
        ePurchaseReceiptItemSuppliedDao.setCreation(vPurchaseReceiptItemSuppliedDto.creation());
        ePurchaseReceiptItemSuppliedDao.setModified(vPurchaseReceiptItemSuppliedDto.modified());
        ePurchaseReceiptItemSuppliedDao.setModifiedBy(vPurchaseReceiptItemSuppliedDto.modifiedBy());
        ePurchaseReceiptItemSuppliedDao.setOwner(vPurchaseReceiptItemSuppliedDto.owner());
        ePurchaseReceiptItemSuppliedDao.setIsDocStatus(vPurchaseReceiptItemSuppliedDto.isDocStatus());
        ePurchaseReceiptItemSuppliedDao.setIdx(vPurchaseReceiptItemSuppliedDto.idx());
        ePurchaseReceiptItemSuppliedDao.setMainItemCode(vPurchaseReceiptItemSuppliedDto.mainItemCode());
        ePurchaseReceiptItemSuppliedDao.setRmItemCode(vPurchaseReceiptItemSuppliedDto.rmItemCode());
        ePurchaseReceiptItemSuppliedDao.setItemName(vPurchaseReceiptItemSuppliedDto.itemName());
        ePurchaseReceiptItemSuppliedDao.setBomDetailNo(vPurchaseReceiptItemSuppliedDto.bomDetailNo());
        ePurchaseReceiptItemSuppliedDao.setDescription(vPurchaseReceiptItemSuppliedDto.description());
        ePurchaseReceiptItemSuppliedDao.setStockUom(vPurchaseReceiptItemSuppliedDto.stockUom());
        ePurchaseReceiptItemSuppliedDao.setConversionFactor(vPurchaseReceiptItemSuppliedDto.conversionFactor());
        ePurchaseReceiptItemSuppliedDao.setReferenceName(vPurchaseReceiptItemSuppliedDto.referenceName());
        ePurchaseReceiptItemSuppliedDao.setRate(vPurchaseReceiptItemSuppliedDto.rate());
        ePurchaseReceiptItemSuppliedDao.setAmount(vPurchaseReceiptItemSuppliedDto.amount());
        ePurchaseReceiptItemSuppliedDao.setRequiredQty(vPurchaseReceiptItemSuppliedDto.requiredQty());
        ePurchaseReceiptItemSuppliedDao.setConsumedQty(vPurchaseReceiptItemSuppliedDto.consumedQty());
        ePurchaseReceiptItemSuppliedDao.setCurrentStock(vPurchaseReceiptItemSuppliedDto.currentStock());
        ePurchaseReceiptItemSuppliedDao.setBatchNo(vPurchaseReceiptItemSuppliedDto.batchNo());
        ePurchaseReceiptItemSuppliedDao.setSerialNo(vPurchaseReceiptItemSuppliedDto.serialNo());
        ePurchaseReceiptItemSuppliedDao.setPurchaseOrder(vPurchaseReceiptItemSuppliedDto.purchaseOrder());
        ePurchaseReceiptItemSuppliedDao.setParent(vPurchaseReceiptItemSuppliedDto.parent());
        ePurchaseReceiptItemSuppliedDao.setParentField(vPurchaseReceiptItemSuppliedDto.parentField());
        ePurchaseReceiptItemSuppliedDao.setParentType(vPurchaseReceiptItemSuppliedDto.parentType());
    }
}