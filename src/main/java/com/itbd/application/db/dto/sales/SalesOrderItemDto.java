package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesOrderItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SalesOrderItemDto(
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
        Boolean ensureDeliveryBasedOnProducedSerialNo,
        Boolean isStockItem,
        Boolean reserveStock,
        LocalDate deliveryDate,
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
        BigDecimal stockReservedQty,
        BigDecimal priceListRate,
        BigDecimal basePriceListRate,
        String marginType,
        BigDecimal marginRateOrAmount,
        BigDecimal rateWithMargin,
        BigDecimal discountPercentage,
        BigDecimal discountAmount,
        BigDecimal baseRateWithMargin,
        BigDecimal rate,
        BigDecimal amount,
        String itemTaxTemplate,
        BigDecimal baseRate,
        BigDecimal baseAmount,
        String pricingRules,
        BigDecimal stockUomRate,
        Boolean isFreeItem,
        Boolean grantCommission,
        BigDecimal netRate,
        BigDecimal netAmount,
        BigDecimal baseNetRate,
        BigDecimal baseNetAmount,
        BigDecimal billedAmt,
        BigDecimal valuationRate,
        BigDecimal grossProfit,
        Boolean deliveredBySupplier,
        String supplier,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String warehouse,
        String targetWarehouse,
        String prevDocumentDocName,
        String quotationItem,
        Boolean againstBlanketOrder,
        String blanketOrder,
        BigDecimal blanketOrderRate,
        String bomNo,
        BigDecimal projectedQty,
        BigDecimal actualQty,
        BigDecimal orderedQty,
        BigDecimal plannedQty,
        BigDecimal productionPlanQty,
        BigDecimal workOrderQty,
        BigDecimal deliveredQty,
        BigDecimal producedQty,
        BigDecimal returnedQty,
        BigDecimal pickedQty,
        String additionalNotes,
        Boolean pageBreak,
        String itemTaxRate,
        LocalDate transactionDate,
        String materialRequest,
        String purchaseOrder,
        String materialRequestItem,
        String purchaseOrderItem,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesOrderItemDto fromEntity(SalesOrderItemDao eSalesOrderItemDao) {
        return new SalesOrderItemDto(
                eSalesOrderItemDao.getName(),
                eSalesOrderItemDao.getCreation(),
                eSalesOrderItemDao.getModified(),
                eSalesOrderItemDao.getModifiedBy(),
                eSalesOrderItemDao.getOwner(),
                eSalesOrderItemDao.getIsDocStatus(),
                eSalesOrderItemDao.getIdx(),
                eSalesOrderItemDao.getItemCode(),
                eSalesOrderItemDao.getCustomerItemCode(),
                eSalesOrderItemDao.getEnsureDeliveryBasedOnProducedSerialNo(),
                eSalesOrderItemDao.getIsStockItem(),
                eSalesOrderItemDao.getReserveStock(),
                eSalesOrderItemDao.getDeliveryDate(),
                eSalesOrderItemDao.getItemName(),
                eSalesOrderItemDao.getDescription(),
                eSalesOrderItemDao.getItemGroup(),
                eSalesOrderItemDao.getBrand(),
                eSalesOrderItemDao.getImage(),
                eSalesOrderItemDao.getQty(),
                eSalesOrderItemDao.getStockUom(),
                eSalesOrderItemDao.getUom(),
                eSalesOrderItemDao.getConversionFactor(),
                eSalesOrderItemDao.getStockQty(),
                eSalesOrderItemDao.getStockReservedQty(),
                eSalesOrderItemDao.getPriceListRate(),
                eSalesOrderItemDao.getBasePriceListRate(),
                eSalesOrderItemDao.getMarginType(),
                eSalesOrderItemDao.getMarginRateOrAmount(),
                eSalesOrderItemDao.getRateWithMargin(),
                eSalesOrderItemDao.getDiscountPercentage(),
                eSalesOrderItemDao.getDiscountAmount(),
                eSalesOrderItemDao.getBaseRateWithMargin(),
                eSalesOrderItemDao.getRate(),
                eSalesOrderItemDao.getAmount(),
                eSalesOrderItemDao.getItemTaxTemplate(),
                eSalesOrderItemDao.getBaseRate(),
                eSalesOrderItemDao.getBaseAmount(),
                eSalesOrderItemDao.getPricingRules(),
                eSalesOrderItemDao.getStockUomRate(),
                eSalesOrderItemDao.getIsFreeItem(),
                eSalesOrderItemDao.getGrantCommission(),
                eSalesOrderItemDao.getNetRate(),
                eSalesOrderItemDao.getNetAmount(),
                eSalesOrderItemDao.getBaseNetRate(),
                eSalesOrderItemDao.getBaseNetAmount(),
                eSalesOrderItemDao.getBilledAmt(),
                eSalesOrderItemDao.getValuationRate(),
                eSalesOrderItemDao.getGrossProfit(),
                eSalesOrderItemDao.getDeliveredBySupplier(),
                eSalesOrderItemDao.getSupplier(),
                eSalesOrderItemDao.getWeightPerUnit(),
                eSalesOrderItemDao.getTotalWeight(),
                eSalesOrderItemDao.getWeightUom(),
                eSalesOrderItemDao.getWarehouse(),
                eSalesOrderItemDao.getTargetWarehouse(),
                eSalesOrderItemDao.getPrevDocumentDocName(),
                eSalesOrderItemDao.getQuotationItem(),
                eSalesOrderItemDao.getAgainstBlanketOrder(),
                eSalesOrderItemDao.getBlanketOrder(),
                eSalesOrderItemDao.getBlanketOrderRate(),
                eSalesOrderItemDao.getBomNo(),
                eSalesOrderItemDao.getProjectedQty(),
                eSalesOrderItemDao.getActualQty(),
                eSalesOrderItemDao.getOrderedQty(),
                eSalesOrderItemDao.getPlannedQty(),
                eSalesOrderItemDao.getProductionPlanQty(),
                eSalesOrderItemDao.getWorkOrderQty(),
                eSalesOrderItemDao.getDeliveredQty(),
                eSalesOrderItemDao.getProducedQty(),
                eSalesOrderItemDao.getReturnedQty(),
                eSalesOrderItemDao.getPickedQty(),
                eSalesOrderItemDao.getAdditionalNotes(),
                eSalesOrderItemDao.getPageBreak(),
                eSalesOrderItemDao.getItemTaxRate(),
                eSalesOrderItemDao.getTransactionDate(),
                eSalesOrderItemDao.getMaterialRequest(),
                eSalesOrderItemDao.getPurchaseOrder(),
                eSalesOrderItemDao.getMaterialRequestItem(),
                eSalesOrderItemDao.getPurchaseOrderItem(),
                eSalesOrderItemDao.getParent(),
                eSalesOrderItemDao.getParentField(),
                eSalesOrderItemDao.getParentType());
    }

    public static void fromDTO(SalesOrderItemDto vSalesOrderItemDto, SalesOrderItemDao eSalesOrderItemDao) {
        eSalesOrderItemDao.setName(vSalesOrderItemDto.name());
        eSalesOrderItemDao.setCreation(vSalesOrderItemDto.creation());
        eSalesOrderItemDao.setModified(vSalesOrderItemDto.modified());
        eSalesOrderItemDao.setModifiedBy(vSalesOrderItemDto.modifiedBy());
        eSalesOrderItemDao.setOwner(vSalesOrderItemDto.owner());
        eSalesOrderItemDao.setIsDocStatus(vSalesOrderItemDto.isDocStatus());
        eSalesOrderItemDao.setIdx(vSalesOrderItemDto.idx());
        eSalesOrderItemDao.setItemCode(vSalesOrderItemDto.itemCode());
        eSalesOrderItemDao.setCustomerItemCode(vSalesOrderItemDto.customerItemCode());
        eSalesOrderItemDao.setEnsureDeliveryBasedOnProducedSerialNo(vSalesOrderItemDto.ensureDeliveryBasedOnProducedSerialNo());
        eSalesOrderItemDao.setIsStockItem(vSalesOrderItemDto.isStockItem());
        eSalesOrderItemDao.setReserveStock(vSalesOrderItemDto.reserveStock());
        eSalesOrderItemDao.setDeliveryDate(vSalesOrderItemDto.deliveryDate());
        eSalesOrderItemDao.setItemName(vSalesOrderItemDto.itemName());
        eSalesOrderItemDao.setDescription(vSalesOrderItemDto.description());
        eSalesOrderItemDao.setItemGroup(vSalesOrderItemDto.itemGroup());
        eSalesOrderItemDao.setBrand(vSalesOrderItemDto.brand());
        eSalesOrderItemDao.setImage(vSalesOrderItemDto.image());
        eSalesOrderItemDao.setQty(vSalesOrderItemDto.qty());
        eSalesOrderItemDao.setStockUom(vSalesOrderItemDto.stockUom());
        eSalesOrderItemDao.setUom(vSalesOrderItemDto.uom());
        eSalesOrderItemDao.setConversionFactor(vSalesOrderItemDto.conversionFactor());
        eSalesOrderItemDao.setStockQty(vSalesOrderItemDto.stockQty());
        eSalesOrderItemDao.setStockReservedQty(vSalesOrderItemDto.stockReservedQty());
        eSalesOrderItemDao.setPriceListRate(vSalesOrderItemDto.priceListRate());
        eSalesOrderItemDao.setBasePriceListRate(vSalesOrderItemDto.basePriceListRate());
        eSalesOrderItemDao.setMarginType(vSalesOrderItemDto.marginType());
        eSalesOrderItemDao.setMarginRateOrAmount(vSalesOrderItemDto.marginRateOrAmount());
        eSalesOrderItemDao.setRateWithMargin(vSalesOrderItemDto.rateWithMargin());
        eSalesOrderItemDao.setDiscountPercentage(vSalesOrderItemDto.discountPercentage());
        eSalesOrderItemDao.setDiscountAmount(vSalesOrderItemDto.discountAmount());
        eSalesOrderItemDao.setBaseRateWithMargin(vSalesOrderItemDto.baseRateWithMargin());
        eSalesOrderItemDao.setRate(vSalesOrderItemDto.rate());
        eSalesOrderItemDao.setAmount(vSalesOrderItemDto.amount());
        eSalesOrderItemDao.setItemTaxTemplate(vSalesOrderItemDto.itemTaxTemplate());
        eSalesOrderItemDao.setBaseRate(vSalesOrderItemDto.baseRate());
        eSalesOrderItemDao.setBaseAmount(vSalesOrderItemDto.baseAmount());
        eSalesOrderItemDao.setPricingRules(vSalesOrderItemDto.pricingRules());
        eSalesOrderItemDao.setStockUomRate(vSalesOrderItemDto.stockUomRate());
        eSalesOrderItemDao.setIsFreeItem(vSalesOrderItemDto.isFreeItem());
        eSalesOrderItemDao.setGrantCommission(vSalesOrderItemDto.grantCommission());
        eSalesOrderItemDao.setNetRate(vSalesOrderItemDto.netRate());
        eSalesOrderItemDao.setNetAmount(vSalesOrderItemDto.netAmount());
        eSalesOrderItemDao.setBaseNetRate(vSalesOrderItemDto.baseNetRate());
        eSalesOrderItemDao.setBaseNetAmount(vSalesOrderItemDto.baseNetAmount());
        eSalesOrderItemDao.setBilledAmt(vSalesOrderItemDto.billedAmt());
        eSalesOrderItemDao.setValuationRate(vSalesOrderItemDto.valuationRate());
        eSalesOrderItemDao.setGrossProfit(vSalesOrderItemDto.grossProfit());
        eSalesOrderItemDao.setDeliveredBySupplier(vSalesOrderItemDto.deliveredBySupplier());
        eSalesOrderItemDao.setSupplier(vSalesOrderItemDto.supplier());
        eSalesOrderItemDao.setWeightPerUnit(vSalesOrderItemDto.weightPerUnit());
        eSalesOrderItemDao.setTotalWeight(vSalesOrderItemDto.totalWeight());
        eSalesOrderItemDao.setWeightUom(vSalesOrderItemDto.weightUom());
        eSalesOrderItemDao.setWarehouse(vSalesOrderItemDto.warehouse());
        eSalesOrderItemDao.setTargetWarehouse(vSalesOrderItemDto.targetWarehouse());
        eSalesOrderItemDao.setPrevDocumentDocName(vSalesOrderItemDto.prevDocumentDocName());
        eSalesOrderItemDao.setQuotationItem(vSalesOrderItemDto.quotationItem());
        eSalesOrderItemDao.setAgainstBlanketOrder(vSalesOrderItemDto.againstBlanketOrder());
        eSalesOrderItemDao.setBlanketOrder(vSalesOrderItemDto.blanketOrder());
        eSalesOrderItemDao.setBlanketOrderRate(vSalesOrderItemDto.blanketOrderRate());
        eSalesOrderItemDao.setBomNo(vSalesOrderItemDto.bomNo());
        eSalesOrderItemDao.setProjectedQty(vSalesOrderItemDto.projectedQty());
        eSalesOrderItemDao.setActualQty(vSalesOrderItemDto.actualQty());
        eSalesOrderItemDao.setOrderedQty(vSalesOrderItemDto.orderedQty());
        eSalesOrderItemDao.setPlannedQty(vSalesOrderItemDto.plannedQty());
        eSalesOrderItemDao.setProductionPlanQty(vSalesOrderItemDto.productionPlanQty());
        eSalesOrderItemDao.setWorkOrderQty(vSalesOrderItemDto.workOrderQty());
        eSalesOrderItemDao.setDeliveredQty(vSalesOrderItemDto.deliveredQty());
        eSalesOrderItemDao.setProducedQty(vSalesOrderItemDto.producedQty());
        eSalesOrderItemDao.setReturnedQty(vSalesOrderItemDto.returnedQty());
        eSalesOrderItemDao.setPickedQty(vSalesOrderItemDto.pickedQty());
        eSalesOrderItemDao.setAdditionalNotes(vSalesOrderItemDto.additionalNotes());
        eSalesOrderItemDao.setPageBreak(vSalesOrderItemDto.pageBreak());
        eSalesOrderItemDao.setItemTaxRate(vSalesOrderItemDto.itemTaxRate());
        eSalesOrderItemDao.setTransactionDate(vSalesOrderItemDto.transactionDate());
        eSalesOrderItemDao.setMaterialRequest(vSalesOrderItemDto.materialRequest());
        eSalesOrderItemDao.setPurchaseOrder(vSalesOrderItemDto.purchaseOrder());
        eSalesOrderItemDao.setMaterialRequestItem(vSalesOrderItemDto.materialRequestItem());
        eSalesOrderItemDao.setPurchaseOrderItem(vSalesOrderItemDto.purchaseOrderItem());
        eSalesOrderItemDao.setParent(vSalesOrderItemDto.parent());
        eSalesOrderItemDao.setParentField(vSalesOrderItemDto.parentField());
        eSalesOrderItemDao.setParentType(vSalesOrderItemDto.parentType());
    }
}