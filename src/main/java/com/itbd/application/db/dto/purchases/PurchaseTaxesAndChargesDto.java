package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseTaxesAndChargesDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String category,
        String addDeductTax,
        String chargeType,
        String rowId,
        Boolean includedInPrintRate,
        Boolean includedInPaidAmount,
        String accountHead,
        String description,
        BigDecimal rate,
        String costCenter,
        String accountCurrency,
        BigDecimal taxAmount,
        BigDecimal taxAmountAfterDiscountAmount,
        BigDecimal total,
        BigDecimal baseTaxAmount,
        BigDecimal baseTotal,
        BigDecimal baseTaxAmountAfterDiscountAmount,
        String itemWiseTaxDetail,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseTaxesAndChargesDto fromEntity(PurchaseTaxesAndChargesDao ePurchaseTaxesAndChargesDao) {
        return new PurchaseTaxesAndChargesDto(
                ePurchaseTaxesAndChargesDao.getName(),
                ePurchaseTaxesAndChargesDao.getCreation(),
                ePurchaseTaxesAndChargesDao.getModified(),
                ePurchaseTaxesAndChargesDao.getModifiedBy(),
                ePurchaseTaxesAndChargesDao.getOwner(),
                ePurchaseTaxesAndChargesDao.getIsDocStatus(),
                ePurchaseTaxesAndChargesDao.getIdx(),
                ePurchaseTaxesAndChargesDao.getCategory(),
                ePurchaseTaxesAndChargesDao.getAddDeductTax(),
                ePurchaseTaxesAndChargesDao.getChargeType(),
                ePurchaseTaxesAndChargesDao.getRowId(),
                ePurchaseTaxesAndChargesDao.getIncludedInPrintRate(),
                ePurchaseTaxesAndChargesDao.getIncludedInPaidAmount(),
                ePurchaseTaxesAndChargesDao.getAccountHead(),
                ePurchaseTaxesAndChargesDao.getDescription(),
                ePurchaseTaxesAndChargesDao.getRate(),
                ePurchaseTaxesAndChargesDao.getCostCenter(),
                ePurchaseTaxesAndChargesDao.getAccountCurrency(),
                ePurchaseTaxesAndChargesDao.getTaxAmount(),
                ePurchaseTaxesAndChargesDao.getTaxAmountAfterDiscountAmount(),
                ePurchaseTaxesAndChargesDao.getTotal(),
                ePurchaseTaxesAndChargesDao.getBaseTaxAmount(),
                ePurchaseTaxesAndChargesDao.getBaseTotal(),
                ePurchaseTaxesAndChargesDao.getBaseTaxAmountAfterDiscountAmount(),
                ePurchaseTaxesAndChargesDao.getItemWiseTaxDetail(),
                ePurchaseTaxesAndChargesDao.getParent(),
                ePurchaseTaxesAndChargesDao.getParentField(),
                ePurchaseTaxesAndChargesDao.getParentType());
    }

    public static void fromDTO(PurchaseTaxesAndChargesDto vPurchaseTaxesAndChargesDto, PurchaseTaxesAndChargesDao ePurchaseTaxesAndChargesDao) {
        ePurchaseTaxesAndChargesDao.setName(vPurchaseTaxesAndChargesDto.name());
        ePurchaseTaxesAndChargesDao.setCreation(vPurchaseTaxesAndChargesDto.creation());
        ePurchaseTaxesAndChargesDao.setModified(vPurchaseTaxesAndChargesDto.modified());
        ePurchaseTaxesAndChargesDao.setModifiedBy(vPurchaseTaxesAndChargesDto.modifiedBy());
        ePurchaseTaxesAndChargesDao.setOwner(vPurchaseTaxesAndChargesDto.owner());
        ePurchaseTaxesAndChargesDao.setIsDocStatus(vPurchaseTaxesAndChargesDto.isDocStatus());
        ePurchaseTaxesAndChargesDao.setIdx(vPurchaseTaxesAndChargesDto.idx());
        ePurchaseTaxesAndChargesDao.setCategory(vPurchaseTaxesAndChargesDto.category());
        ePurchaseTaxesAndChargesDao.setAddDeductTax(vPurchaseTaxesAndChargesDto.addDeductTax());
        ePurchaseTaxesAndChargesDao.setChargeType(vPurchaseTaxesAndChargesDto.chargeType());
        ePurchaseTaxesAndChargesDao.setRowId(vPurchaseTaxesAndChargesDto.rowId());
        ePurchaseTaxesAndChargesDao.setIncludedInPrintRate(vPurchaseTaxesAndChargesDto.includedInPrintRate());
        ePurchaseTaxesAndChargesDao.setIncludedInPaidAmount(vPurchaseTaxesAndChargesDto.includedInPaidAmount());
        ePurchaseTaxesAndChargesDao.setAccountHead(vPurchaseTaxesAndChargesDto.accountHead());
        ePurchaseTaxesAndChargesDao.setDescription(vPurchaseTaxesAndChargesDto.description());
        ePurchaseTaxesAndChargesDao.setRate(vPurchaseTaxesAndChargesDto.rate());
        ePurchaseTaxesAndChargesDao.setCostCenter(vPurchaseTaxesAndChargesDto.costCenter());
        ePurchaseTaxesAndChargesDao.setAccountCurrency(vPurchaseTaxesAndChargesDto.accountCurrency());
        ePurchaseTaxesAndChargesDao.setTaxAmount(vPurchaseTaxesAndChargesDto.taxAmount());
        ePurchaseTaxesAndChargesDao.setTaxAmountAfterDiscountAmount(vPurchaseTaxesAndChargesDto.taxAmountAfterDiscountAmount());
        ePurchaseTaxesAndChargesDao.setTotal(vPurchaseTaxesAndChargesDto.total());
        ePurchaseTaxesAndChargesDao.setBaseTaxAmount(vPurchaseTaxesAndChargesDto.baseTaxAmount());
        ePurchaseTaxesAndChargesDao.setBaseTotal(vPurchaseTaxesAndChargesDto.baseTotal());
        ePurchaseTaxesAndChargesDao.setBaseTaxAmountAfterDiscountAmount(vPurchaseTaxesAndChargesDto.baseTaxAmountAfterDiscountAmount());
        ePurchaseTaxesAndChargesDao.setItemWiseTaxDetail(vPurchaseTaxesAndChargesDto.itemWiseTaxDetail());
        ePurchaseTaxesAndChargesDao.setParent(vPurchaseTaxesAndChargesDto.parent());
        ePurchaseTaxesAndChargesDao.setParentField(vPurchaseTaxesAndChargesDto.parentField());
        ePurchaseTaxesAndChargesDao.setParentType(vPurchaseTaxesAndChargesDto.parentType());
    }
}