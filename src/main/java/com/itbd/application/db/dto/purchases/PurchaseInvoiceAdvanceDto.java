package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseInvoiceAdvanceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseInvoiceAdvanceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceType,
        String referenceName,
        String remarks,
        String referenceRow,
        BigDecimal advanceAmount,
        BigDecimal allocatedAmount,
        BigDecimal exchangeGainLoss,
        BigDecimal refExchangeRate,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseInvoiceAdvanceDto fromEntity(PurchaseInvoiceAdvanceDao ePurchaseInvoiceAdvanceDao) {
        return new PurchaseInvoiceAdvanceDto(
                ePurchaseInvoiceAdvanceDao.getName(),
                ePurchaseInvoiceAdvanceDao.getCreation(),
                ePurchaseInvoiceAdvanceDao.getModified(),
                ePurchaseInvoiceAdvanceDao.getModifiedBy(),
                ePurchaseInvoiceAdvanceDao.getOwner(),
                ePurchaseInvoiceAdvanceDao.getIsDocStatus(),
                ePurchaseInvoiceAdvanceDao.getIdx(),
                ePurchaseInvoiceAdvanceDao.getReferenceType(),
                ePurchaseInvoiceAdvanceDao.getReferenceName(),
                ePurchaseInvoiceAdvanceDao.getRemarks(),
                ePurchaseInvoiceAdvanceDao.getReferenceRow(),
                ePurchaseInvoiceAdvanceDao.getAdvanceAmount(),
                ePurchaseInvoiceAdvanceDao.getAllocatedAmount(),
                ePurchaseInvoiceAdvanceDao.getExchangeGainLoss(),
                ePurchaseInvoiceAdvanceDao.getRefExchangeRate(),
                ePurchaseInvoiceAdvanceDao.getParent(),
                ePurchaseInvoiceAdvanceDao.getParentField(),
                ePurchaseInvoiceAdvanceDao.getParentType());
    }

    public static void fromDTO(PurchaseInvoiceAdvanceDto vPurchaseInvoiceAdvanceDto, PurchaseInvoiceAdvanceDao ePurchaseInvoiceAdvanceDao) {
        ePurchaseInvoiceAdvanceDao.setName(vPurchaseInvoiceAdvanceDto.name());
        ePurchaseInvoiceAdvanceDao.setCreation(vPurchaseInvoiceAdvanceDto.creation());
        ePurchaseInvoiceAdvanceDao.setModified(vPurchaseInvoiceAdvanceDto.modified());
        ePurchaseInvoiceAdvanceDao.setModifiedBy(vPurchaseInvoiceAdvanceDto.modifiedBy());
        ePurchaseInvoiceAdvanceDao.setOwner(vPurchaseInvoiceAdvanceDto.owner());
        ePurchaseInvoiceAdvanceDao.setIsDocStatus(vPurchaseInvoiceAdvanceDto.isDocStatus());
        ePurchaseInvoiceAdvanceDao.setIdx(vPurchaseInvoiceAdvanceDto.idx());
        ePurchaseInvoiceAdvanceDao.setReferenceType(vPurchaseInvoiceAdvanceDto.referenceType());
        ePurchaseInvoiceAdvanceDao.setReferenceName(vPurchaseInvoiceAdvanceDto.referenceName());
        ePurchaseInvoiceAdvanceDao.setRemarks(vPurchaseInvoiceAdvanceDto.remarks());
        ePurchaseInvoiceAdvanceDao.setReferenceRow(vPurchaseInvoiceAdvanceDto.referenceRow());
        ePurchaseInvoiceAdvanceDao.setAdvanceAmount(vPurchaseInvoiceAdvanceDto.advanceAmount());
        ePurchaseInvoiceAdvanceDao.setAllocatedAmount(vPurchaseInvoiceAdvanceDto.allocatedAmount());
        ePurchaseInvoiceAdvanceDao.setExchangeGainLoss(vPurchaseInvoiceAdvanceDto.exchangeGainLoss());
        ePurchaseInvoiceAdvanceDao.setRefExchangeRate(vPurchaseInvoiceAdvanceDto.refExchangeRate());
        ePurchaseInvoiceAdvanceDao.setParent(vPurchaseInvoiceAdvanceDto.parent());
        ePurchaseInvoiceAdvanceDao.setParentField(vPurchaseInvoiceAdvanceDto.parentField());
        ePurchaseInvoiceAdvanceDao.setParentType(vPurchaseInvoiceAdvanceDto.parentType());
    }
}