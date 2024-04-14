package com.itbd.application.db.dto.quotations;

import com.itbd.application.db.dao.quotations.QuotationItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record QuotationItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String customerItemCode,
        String itemName,
        String description,
        String itemGroup,
        String brand,
        String image,
        BigDecimal qty,
        String stockUom,
        String uom,
        BigDecimal conversionFactor,
        BigDecimal stockQty,
        BigDecimal priceListRate,
        BigDecimal basePriceListRate,
        String marginType,
        BigDecimal marginRateOrAmount,
        BigDecimal rateWithMargin,
        BigDecimal discountPercentage,
        BigDecimal discountAmount,
        BigDecimal baseRateWithMargin,
        BigDecimal rate,
        BigDecimal netRate,
        BigDecimal amount,
        BigDecimal netAmount,
        String itemTaxTemplate,
        BigDecimal baseRate,
        BigDecimal baseNetRate,
        BigDecimal baseAmount,
        BigDecimal baseNetAmount,
        String pricingRules,
        BigDecimal stockUomRate,
        Boolean isFreeItem,
        Boolean isAlternative,
        Boolean hasAlternativeItem,
        BigDecimal valuationRate,
        BigDecimal grossProfit,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String warehouse,
        Boolean againstBlanketOrder,
        String blanketOrder,
        BigDecimal blanketOrderRate,
        String prevDocumentDocType,
        String prevDocumentDocName,
        BigDecimal projectedQty,
        BigDecimal actualQty,
        String itemTaxRate,
        String additionalNotes,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static QuotationItemDto fromEntity(QuotationItemDao eQuotationItemDao) {
        return new QuotationItemDto(
                eQuotationItemDao.getName(),
                eQuotationItemDao.getCreation(),
                eQuotationItemDao.getModified(),
                eQuotationItemDao.getModifiedBy(),
                eQuotationItemDao.getOwner(),
                eQuotationItemDao.getIsDocStatus(),
                eQuotationItemDao.getIdx(),
                eQuotationItemDao.getItemCode(),
                eQuotationItemDao.getCustomerItemCode(),
                eQuotationItemDao.getItemName(),
                eQuotationItemDao.getDescription(),
                eQuotationItemDao.getItemGroup(),
                eQuotationItemDao.getBrand(),
                eQuotationItemDao.getImage(),
                eQuotationItemDao.getQty(),
                eQuotationItemDao.getStockUom(),
                eQuotationItemDao.getUom(),
                eQuotationItemDao.getConversionFactor(),
                eQuotationItemDao.getStockQty(),
                eQuotationItemDao.getPriceListRate(),
                eQuotationItemDao.getBasePriceListRate(),
                eQuotationItemDao.getMarginType(),
                eQuotationItemDao.getMarginRateOrAmount(),
                eQuotationItemDao.getRateWithMargin(),
                eQuotationItemDao.getDiscountPercentage(),
                eQuotationItemDao.getDiscountAmount(),
                eQuotationItemDao.getBaseRateWithMargin(),
                eQuotationItemDao.getRate(),
                eQuotationItemDao.getNetRate(),
                eQuotationItemDao.getAmount(),
                eQuotationItemDao.getNetAmount(),
                eQuotationItemDao.getItemTaxTemplate(),
                eQuotationItemDao.getBaseRate(),
                eQuotationItemDao.getBaseNetRate(),
                eQuotationItemDao.getBaseAmount(),
                eQuotationItemDao.getBaseNetAmount(),
                eQuotationItemDao.getPricingRules(),
                eQuotationItemDao.getStockUomRate(),
                eQuotationItemDao.getIsFreeItem(),
                eQuotationItemDao.getIsAlternative(),
                eQuotationItemDao.getHasAlternativeItem(),
                eQuotationItemDao.getValuationRate(),
                eQuotationItemDao.getGrossProfit(),
                eQuotationItemDao.getWeightPerUnit(),
                eQuotationItemDao.getTotalWeight(),
                eQuotationItemDao.getWeightUom(),
                eQuotationItemDao.getWarehouse(),
                eQuotationItemDao.getAgainstBlanketOrder(),
                eQuotationItemDao.getBlanketOrder(),
                eQuotationItemDao.getBlanketOrderRate(),
                eQuotationItemDao.getPrevDocumentDocType(),
                eQuotationItemDao.getPrevDocumentDocName(),
                eQuotationItemDao.getProjectedQty(),
                eQuotationItemDao.getActualQty(),
                eQuotationItemDao.getItemTaxRate(),
                eQuotationItemDao.getAdditionalNotes(),
                eQuotationItemDao.getPageBreak(),
                eQuotationItemDao.getParent(),
                eQuotationItemDao.getParentField(),
                eQuotationItemDao.getParentType());
    }

    public static void fromDTO(QuotationItemDto vQuotationItemDto, QuotationItemDao eQuotationItemDao) {
        eQuotationItemDao.setName(vQuotationItemDto.name());
        eQuotationItemDao.setCreation(vQuotationItemDto.creation());
        eQuotationItemDao.setModified(vQuotationItemDto.modified());
        eQuotationItemDao.setModifiedBy(vQuotationItemDto.modifiedBy());
        eQuotationItemDao.setOwner(vQuotationItemDto.owner());
        eQuotationItemDao.setIsDocStatus(vQuotationItemDto.isDocStatus());
        eQuotationItemDao.setIdx(vQuotationItemDto.idx());
        eQuotationItemDao.setItemCode(vQuotationItemDto.itemCode());
        eQuotationItemDao.setCustomerItemCode(vQuotationItemDto.customerItemCode());
        eQuotationItemDao.setItemName(vQuotationItemDto.itemName());
        eQuotationItemDao.setDescription(vQuotationItemDto.description());
        eQuotationItemDao.setItemGroup(vQuotationItemDto.itemGroup());
        eQuotationItemDao.setBrand(vQuotationItemDto.brand());
        eQuotationItemDao.setImage(vQuotationItemDto.image());
        eQuotationItemDao.setQty(vQuotationItemDto.qty());
        eQuotationItemDao.setStockUom(vQuotationItemDto.stockUom());
        eQuotationItemDao.setUom(vQuotationItemDto.uom());
        eQuotationItemDao.setConversionFactor(vQuotationItemDto.conversionFactor());
        eQuotationItemDao.setStockQty(vQuotationItemDto.stockQty());
        eQuotationItemDao.setPriceListRate(vQuotationItemDto.priceListRate());
        eQuotationItemDao.setBasePriceListRate(vQuotationItemDto.basePriceListRate());
        eQuotationItemDao.setMarginType(vQuotationItemDto.marginType());
        eQuotationItemDao.setMarginRateOrAmount(vQuotationItemDto.marginRateOrAmount());
        eQuotationItemDao.setRateWithMargin(vQuotationItemDto.rateWithMargin());
        eQuotationItemDao.setDiscountPercentage(vQuotationItemDto.discountPercentage());
        eQuotationItemDao.setDiscountAmount(vQuotationItemDto.discountAmount());
        eQuotationItemDao.setBaseRateWithMargin(vQuotationItemDto.baseRateWithMargin());
        eQuotationItemDao.setRate(vQuotationItemDto.rate());
        eQuotationItemDao.setNetRate(vQuotationItemDto.netRate());
        eQuotationItemDao.setAmount(vQuotationItemDto.amount());
        eQuotationItemDao.setNetAmount(vQuotationItemDto.netAmount());
        eQuotationItemDao.setItemTaxTemplate(vQuotationItemDto.itemTaxTemplate());
        eQuotationItemDao.setBaseRate(vQuotationItemDto.baseRate());
        eQuotationItemDao.setBaseNetRate(vQuotationItemDto.baseNetRate());
        eQuotationItemDao.setBaseAmount(vQuotationItemDto.baseAmount());
        eQuotationItemDao.setBaseNetAmount(vQuotationItemDto.baseNetAmount());
        eQuotationItemDao.setPricingRules(vQuotationItemDto.pricingRules());
        eQuotationItemDao.setStockUomRate(vQuotationItemDto.stockUomRate());
        eQuotationItemDao.setIsFreeItem(vQuotationItemDto.isFreeItem());
        eQuotationItemDao.setIsAlternative(vQuotationItemDto.isAlternative());
        eQuotationItemDao.setHasAlternativeItem(vQuotationItemDto.hasAlternativeItem());
        eQuotationItemDao.setValuationRate(vQuotationItemDto.valuationRate());
        eQuotationItemDao.setGrossProfit(vQuotationItemDto.grossProfit());
        eQuotationItemDao.setWeightPerUnit(vQuotationItemDto.weightPerUnit());
        eQuotationItemDao.setTotalWeight(vQuotationItemDto.totalWeight());
        eQuotationItemDao.setWeightUom(vQuotationItemDto.weightUom());
        eQuotationItemDao.setWarehouse(vQuotationItemDto.warehouse());
        eQuotationItemDao.setAgainstBlanketOrder(vQuotationItemDto.againstBlanketOrder());
        eQuotationItemDao.setBlanketOrder(vQuotationItemDto.blanketOrder());
        eQuotationItemDao.setBlanketOrderRate(vQuotationItemDto.blanketOrderRate());
        eQuotationItemDao.setPrevDocumentDocType(vQuotationItemDto.prevDocumentDocType());
        eQuotationItemDao.setPrevDocumentDocName(vQuotationItemDto.prevDocumentDocName());
        eQuotationItemDao.setProjectedQty(vQuotationItemDto.projectedQty());
        eQuotationItemDao.setActualQty(vQuotationItemDto.actualQty());
        eQuotationItemDao.setItemTaxRate(vQuotationItemDto.itemTaxRate());
        eQuotationItemDao.setAdditionalNotes(vQuotationItemDto.additionalNotes());
        eQuotationItemDao.setPageBreak(vQuotationItemDto.pageBreak());
        eQuotationItemDao.setParent(vQuotationItemDto.parent());
        eQuotationItemDao.setParentField(vQuotationItemDto.parentField());
        eQuotationItemDao.setParentType(vQuotationItemDto.parentType());
    }
}