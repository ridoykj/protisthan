package com.itbd.application.db.dto.landedcost;

import com.itbd.application.db.dao.landedcost.LandedCostPurchaseReceiptDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LandedCostPurchaseReceiptDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String receiptDocumentType,
        String receiptDocument,
        String supplier,
        LocalDate postingDate,
        BigDecimal grandTotal,
        String parent,
        String parentField,
        String parentType
) {
    public static LandedCostPurchaseReceiptDto fromEntity(LandedCostPurchaseReceiptDao eLandedCostPurchaseReceiptDao) {
        return new LandedCostPurchaseReceiptDto(
                eLandedCostPurchaseReceiptDao.getName(),
                eLandedCostPurchaseReceiptDao.getCreation(),
                eLandedCostPurchaseReceiptDao.getModified(),
                eLandedCostPurchaseReceiptDao.getModifiedBy(),
                eLandedCostPurchaseReceiptDao.getOwner(),
                eLandedCostPurchaseReceiptDao.getIsDocStatus(),
                eLandedCostPurchaseReceiptDao.getIdx(),
                eLandedCostPurchaseReceiptDao.getReceiptDocumentType(),
                eLandedCostPurchaseReceiptDao.getReceiptDocument(),
                eLandedCostPurchaseReceiptDao.getSupplier(),
                eLandedCostPurchaseReceiptDao.getPostingDate(),
                eLandedCostPurchaseReceiptDao.getGrandTotal(),
                eLandedCostPurchaseReceiptDao.getParent(),
                eLandedCostPurchaseReceiptDao.getParentField(),
                eLandedCostPurchaseReceiptDao.getParentType());
    }

    public static void fromDTO(LandedCostPurchaseReceiptDto vLandedCostPurchaseReceiptDto, LandedCostPurchaseReceiptDao eLandedCostPurchaseReceiptDao) {
        eLandedCostPurchaseReceiptDao.setName(vLandedCostPurchaseReceiptDto.name());
        eLandedCostPurchaseReceiptDao.setCreation(vLandedCostPurchaseReceiptDto.creation());
        eLandedCostPurchaseReceiptDao.setModified(vLandedCostPurchaseReceiptDto.modified());
        eLandedCostPurchaseReceiptDao.setModifiedBy(vLandedCostPurchaseReceiptDto.modifiedBy());
        eLandedCostPurchaseReceiptDao.setOwner(vLandedCostPurchaseReceiptDto.owner());
        eLandedCostPurchaseReceiptDao.setIsDocStatus(vLandedCostPurchaseReceiptDto.isDocStatus());
        eLandedCostPurchaseReceiptDao.setIdx(vLandedCostPurchaseReceiptDto.idx());
        eLandedCostPurchaseReceiptDao.setReceiptDocumentType(vLandedCostPurchaseReceiptDto.receiptDocumentType());
        eLandedCostPurchaseReceiptDao.setReceiptDocument(vLandedCostPurchaseReceiptDto.receiptDocument());
        eLandedCostPurchaseReceiptDao.setSupplier(vLandedCostPurchaseReceiptDto.supplier());
        eLandedCostPurchaseReceiptDao.setPostingDate(vLandedCostPurchaseReceiptDto.postingDate());
        eLandedCostPurchaseReceiptDao.setGrandTotal(vLandedCostPurchaseReceiptDto.grandTotal());
        eLandedCostPurchaseReceiptDao.setParent(vLandedCostPurchaseReceiptDto.parent());
        eLandedCostPurchaseReceiptDao.setParentField(vLandedCostPurchaseReceiptDto.parentField());
        eLandedCostPurchaseReceiptDao.setParentType(vLandedCostPurchaseReceiptDto.parentType());
    }
}