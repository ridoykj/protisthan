package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseOrderItemSuppliedDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseOrderItemSuppliedDto(
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
        String stockUom,
        String reserveWarehouse,
        BigDecimal conversionFactor,
        String bomDetailNo,
        String referenceName,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal requiredQty,
        BigDecimal suppliedQty,
        BigDecimal consumedQty,
        BigDecimal returnedQty,
        BigDecimal totalSuppliedQty,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseOrderItemSuppliedDto fromEntity(PurchaseOrderItemSuppliedDao ePurchaseOrderItemSuppliedDao) {
        return new PurchaseOrderItemSuppliedDto(
                ePurchaseOrderItemSuppliedDao.getName(),
                ePurchaseOrderItemSuppliedDao.getCreation(),
                ePurchaseOrderItemSuppliedDao.getModified(),
                ePurchaseOrderItemSuppliedDao.getModifiedBy(),
                ePurchaseOrderItemSuppliedDao.getOwner(),
                ePurchaseOrderItemSuppliedDao.getIsDocStatus(),
                ePurchaseOrderItemSuppliedDao.getIdx(),
                ePurchaseOrderItemSuppliedDao.getMainItemCode(),
                ePurchaseOrderItemSuppliedDao.getRmItemCode(),
                ePurchaseOrderItemSuppliedDao.getStockUom(),
                ePurchaseOrderItemSuppliedDao.getReserveWarehouse(),
                ePurchaseOrderItemSuppliedDao.getConversionFactor(),
                ePurchaseOrderItemSuppliedDao.getBomDetailNo(),
                ePurchaseOrderItemSuppliedDao.getReferenceName(),
                ePurchaseOrderItemSuppliedDao.getRate(),
                ePurchaseOrderItemSuppliedDao.getAmount(),
                ePurchaseOrderItemSuppliedDao.getRequiredQty(),
                ePurchaseOrderItemSuppliedDao.getSuppliedQty(),
                ePurchaseOrderItemSuppliedDao.getConsumedQty(),
                ePurchaseOrderItemSuppliedDao.getReturnedQty(),
                ePurchaseOrderItemSuppliedDao.getTotalSuppliedQty(),
                ePurchaseOrderItemSuppliedDao.getParent(),
                ePurchaseOrderItemSuppliedDao.getParentField(),
                ePurchaseOrderItemSuppliedDao.getParentType());
    }

    public static void fromDTO(PurchaseOrderItemSuppliedDto vPurchaseOrderItemSuppliedDto, PurchaseOrderItemSuppliedDao ePurchaseOrderItemSuppliedDao) {
        ePurchaseOrderItemSuppliedDao.setName(vPurchaseOrderItemSuppliedDto.name());
        ePurchaseOrderItemSuppliedDao.setCreation(vPurchaseOrderItemSuppliedDto.creation());
        ePurchaseOrderItemSuppliedDao.setModified(vPurchaseOrderItemSuppliedDto.modified());
        ePurchaseOrderItemSuppliedDao.setModifiedBy(vPurchaseOrderItemSuppliedDto.modifiedBy());
        ePurchaseOrderItemSuppliedDao.setOwner(vPurchaseOrderItemSuppliedDto.owner());
        ePurchaseOrderItemSuppliedDao.setIsDocStatus(vPurchaseOrderItemSuppliedDto.isDocStatus());
        ePurchaseOrderItemSuppliedDao.setIdx(vPurchaseOrderItemSuppliedDto.idx());
        ePurchaseOrderItemSuppliedDao.setMainItemCode(vPurchaseOrderItemSuppliedDto.mainItemCode());
        ePurchaseOrderItemSuppliedDao.setRmItemCode(vPurchaseOrderItemSuppliedDto.rmItemCode());
        ePurchaseOrderItemSuppliedDao.setStockUom(vPurchaseOrderItemSuppliedDto.stockUom());
        ePurchaseOrderItemSuppliedDao.setReserveWarehouse(vPurchaseOrderItemSuppliedDto.reserveWarehouse());
        ePurchaseOrderItemSuppliedDao.setConversionFactor(vPurchaseOrderItemSuppliedDto.conversionFactor());
        ePurchaseOrderItemSuppliedDao.setBomDetailNo(vPurchaseOrderItemSuppliedDto.bomDetailNo());
        ePurchaseOrderItemSuppliedDao.setReferenceName(vPurchaseOrderItemSuppliedDto.referenceName());
        ePurchaseOrderItemSuppliedDao.setRate(vPurchaseOrderItemSuppliedDto.rate());
        ePurchaseOrderItemSuppliedDao.setAmount(vPurchaseOrderItemSuppliedDto.amount());
        ePurchaseOrderItemSuppliedDao.setRequiredQty(vPurchaseOrderItemSuppliedDto.requiredQty());
        ePurchaseOrderItemSuppliedDao.setSuppliedQty(vPurchaseOrderItemSuppliedDto.suppliedQty());
        ePurchaseOrderItemSuppliedDao.setConsumedQty(vPurchaseOrderItemSuppliedDto.consumedQty());
        ePurchaseOrderItemSuppliedDao.setReturnedQty(vPurchaseOrderItemSuppliedDto.returnedQty());
        ePurchaseOrderItemSuppliedDao.setTotalSuppliedQty(vPurchaseOrderItemSuppliedDto.totalSuppliedQty());
        ePurchaseOrderItemSuppliedDao.setParent(vPurchaseOrderItemSuppliedDto.parent());
        ePurchaseOrderItemSuppliedDao.setParentField(vPurchaseOrderItemSuppliedDto.parentField());
        ePurchaseOrderItemSuppliedDao.setParentType(vPurchaseOrderItemSuppliedDto.parentType());
    }
}