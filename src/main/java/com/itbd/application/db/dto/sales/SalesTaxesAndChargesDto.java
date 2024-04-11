package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesTaxesAndChargesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SalesTaxesAndChargesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String chargeType,
        String rowId,
        String accountHead,
        String description,
        Boolean includedInPrintRate,
        Boolean includedInPaidAmount,
        String costCenter,
        BigDecimal rate,
        String accountCurrency,
        BigDecimal taxAmount,
        BigDecimal total,
        BigDecimal taxAmountAfterDiscountAmount,
        BigDecimal baseTaxAmount,
        BigDecimal baseTotal,
        BigDecimal baseTaxAmountAfterDiscountAmount,
        String itemWiseTaxDetail,
        Boolean dontRecomputeTax,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesTaxesAndChargesDto fromEntity(SalesTaxesAndChargesDao eSalesTaxesAndChargesDao) {
        return new SalesTaxesAndChargesDto(
                eSalesTaxesAndChargesDao.getName(),
                eSalesTaxesAndChargesDao.getCreation(),
                eSalesTaxesAndChargesDao.getModified(),
                eSalesTaxesAndChargesDao.getModifiedBy(),
                eSalesTaxesAndChargesDao.getOwner(),
                eSalesTaxesAndChargesDao.getIsDocStatus(),
                eSalesTaxesAndChargesDao.getIdx(),
                eSalesTaxesAndChargesDao.getChargeType(),
                eSalesTaxesAndChargesDao.getRowId(),
                eSalesTaxesAndChargesDao.getAccountHead(),
                eSalesTaxesAndChargesDao.getDescription(),
                eSalesTaxesAndChargesDao.getIncludedInPrintRate(),
                eSalesTaxesAndChargesDao.getIncludedInPaidAmount(),
                eSalesTaxesAndChargesDao.getCostCenter(),
                eSalesTaxesAndChargesDao.getRate(),
                eSalesTaxesAndChargesDao.getAccountCurrency(),
                eSalesTaxesAndChargesDao.getTaxAmount(),
                eSalesTaxesAndChargesDao.getTotal(),
                eSalesTaxesAndChargesDao.getTaxAmountAfterDiscountAmount(),
                eSalesTaxesAndChargesDao.getBaseTaxAmount(),
                eSalesTaxesAndChargesDao.getBaseTotal(),
                eSalesTaxesAndChargesDao.getBaseTaxAmountAfterDiscountAmount(),
                eSalesTaxesAndChargesDao.getItemWiseTaxDetail(),
                eSalesTaxesAndChargesDao.getDontRecomputeTax(),
                eSalesTaxesAndChargesDao.getParent(),
                eSalesTaxesAndChargesDao.getParentField(),
                eSalesTaxesAndChargesDao.getParentType());
    }

    public static void fromDTO(SalesTaxesAndChargesDto vSalesTaxesAndChargesDto, SalesTaxesAndChargesDao eSalesTaxesAndChargesDao) {
        eSalesTaxesAndChargesDao.setName(vSalesTaxesAndChargesDto.name());
        eSalesTaxesAndChargesDao.setCreation(vSalesTaxesAndChargesDto.creation());
        eSalesTaxesAndChargesDao.setModified(vSalesTaxesAndChargesDto.modified());
        eSalesTaxesAndChargesDao.setModifiedBy(vSalesTaxesAndChargesDto.modifiedBy());
        eSalesTaxesAndChargesDao.setOwner(vSalesTaxesAndChargesDto.owner());
        eSalesTaxesAndChargesDao.setIsDocStatus(vSalesTaxesAndChargesDto.isDocStatus());
        eSalesTaxesAndChargesDao.setIdx(vSalesTaxesAndChargesDto.idx());
        eSalesTaxesAndChargesDao.setChargeType(vSalesTaxesAndChargesDto.chargeType());
        eSalesTaxesAndChargesDao.setRowId(vSalesTaxesAndChargesDto.rowId());
        eSalesTaxesAndChargesDao.setAccountHead(vSalesTaxesAndChargesDto.accountHead());
        eSalesTaxesAndChargesDao.setDescription(vSalesTaxesAndChargesDto.description());
        eSalesTaxesAndChargesDao.setIncludedInPrintRate(vSalesTaxesAndChargesDto.includedInPrintRate());
        eSalesTaxesAndChargesDao.setIncludedInPaidAmount(vSalesTaxesAndChargesDto.includedInPaidAmount());
        eSalesTaxesAndChargesDao.setCostCenter(vSalesTaxesAndChargesDto.costCenter());
        eSalesTaxesAndChargesDao.setRate(vSalesTaxesAndChargesDto.rate());
        eSalesTaxesAndChargesDao.setAccountCurrency(vSalesTaxesAndChargesDto.accountCurrency());
        eSalesTaxesAndChargesDao.setTaxAmount(vSalesTaxesAndChargesDto.taxAmount());
        eSalesTaxesAndChargesDao.setTotal(vSalesTaxesAndChargesDto.total());
        eSalesTaxesAndChargesDao.setTaxAmountAfterDiscountAmount(vSalesTaxesAndChargesDto.taxAmountAfterDiscountAmount());
        eSalesTaxesAndChargesDao.setBaseTaxAmount(vSalesTaxesAndChargesDto.baseTaxAmount());
        eSalesTaxesAndChargesDao.setBaseTotal(vSalesTaxesAndChargesDto.baseTotal());
        eSalesTaxesAndChargesDao.setBaseTaxAmountAfterDiscountAmount(vSalesTaxesAndChargesDto.baseTaxAmountAfterDiscountAmount());
        eSalesTaxesAndChargesDao.setItemWiseTaxDetail(vSalesTaxesAndChargesDto.itemWiseTaxDetail());
        eSalesTaxesAndChargesDao.setDontRecomputeTax(vSalesTaxesAndChargesDto.dontRecomputeTax());
        eSalesTaxesAndChargesDao.setParent(vSalesTaxesAndChargesDto.parent());
        eSalesTaxesAndChargesDao.setParentField(vSalesTaxesAndChargesDto.parentField());
        eSalesTaxesAndChargesDao.setParentType(vSalesTaxesAndChargesDto.parentType());
    }
}