package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseOrderItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PurchaseOrderItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fgItem,
        BigDecimal fgItemQty,
        String itemCode,
        String supplierPartNo,
        String itemName,
        String brand,
        String productBundle,
        LocalDate scheduleDate,
        LocalDate expectedDeliveryDate,
        String itemGroup,
        String description,
        String image,
        BigDecimal qty,
        String stockUom,
        String uom,
        BigDecimal conversionFactor,
        BigDecimal stockQty,
        BigDecimal priceListRate,
        BigDecimal lastPurchaseRate,
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
        Boolean applyTds,
        BigDecimal netRate,
        BigDecimal netAmount,
        BigDecimal baseNetRate,
        BigDecimal baseNetAmount,
        String fromWarehouse,
        String warehouse,
        BigDecimal actualQty,
        BigDecimal companyTotalStock,
        String materialRequest,
        String materialRequestItem,
        String salesOrder,
        String salesOrderItem,
        String salesOrderPackedItem,
        String supplierQuotation,
        String supplierQuotationItem,
        Boolean deliveredBySupplier,
        Boolean againstBlanketOrder,
        String blanketOrder,
        BigDecimal blanketOrderRate,
        BigDecimal receivedQty,
        BigDecimal returnedQty,
        BigDecimal billedAmt,
        String expenseAccount,
        String wipCompositeAsset,
        String manufacturer,
        String manufacturerPartNo,
        String bom,
        Boolean includeExplodedItems,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String project,
        String costCenter,
        Boolean isFixedAsset,
        String itemTaxRate,
        String productionPlan,
        String productionPlanItem,
        String productionPlanSubAssemblyItem,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseOrderItemDto fromEntity(PurchaseOrderItemDao ePurchaseOrderItemDao) {
        return new PurchaseOrderItemDto(
                ePurchaseOrderItemDao.getName(),
                ePurchaseOrderItemDao.getCreation(),
                ePurchaseOrderItemDao.getModified(),
                ePurchaseOrderItemDao.getModifiedBy(),
                ePurchaseOrderItemDao.getOwner(),
                ePurchaseOrderItemDao.getIsDocStatus(),
                ePurchaseOrderItemDao.getIdx(),
                ePurchaseOrderItemDao.getFgItem(),
                ePurchaseOrderItemDao.getFgItemQty(),
                ePurchaseOrderItemDao.getItemCode(),
                ePurchaseOrderItemDao.getSupplierPartNo(),
                ePurchaseOrderItemDao.getItemName(),
                ePurchaseOrderItemDao.getBrand(),
                ePurchaseOrderItemDao.getProductBundle(),
                ePurchaseOrderItemDao.getScheduleDate(),
                ePurchaseOrderItemDao.getExpectedDeliveryDate(),
                ePurchaseOrderItemDao.getItemGroup(),
                ePurchaseOrderItemDao.getDescription(),
                ePurchaseOrderItemDao.getImage(),
                ePurchaseOrderItemDao.getQty(),
                ePurchaseOrderItemDao.getStockUom(),
                ePurchaseOrderItemDao.getUom(),
                ePurchaseOrderItemDao.getConversionFactor(),
                ePurchaseOrderItemDao.getStockQty(),
                ePurchaseOrderItemDao.getPriceListRate(),
                ePurchaseOrderItemDao.getLastPurchaseRate(),
                ePurchaseOrderItemDao.getBasePriceListRate(),
                ePurchaseOrderItemDao.getMarginType(),
                ePurchaseOrderItemDao.getMarginRateOrAmount(),
                ePurchaseOrderItemDao.getRateWithMargin(),
                ePurchaseOrderItemDao.getDiscountPercentage(),
                ePurchaseOrderItemDao.getDiscountAmount(),
                ePurchaseOrderItemDao.getBaseRateWithMargin(),
                ePurchaseOrderItemDao.getRate(),
                ePurchaseOrderItemDao.getAmount(),
                ePurchaseOrderItemDao.getItemTaxTemplate(),
                ePurchaseOrderItemDao.getBaseRate(),
                ePurchaseOrderItemDao.getBaseAmount(),
                ePurchaseOrderItemDao.getPricingRules(),
                ePurchaseOrderItemDao.getStockUomRate(),
                ePurchaseOrderItemDao.getIsFreeItem(),
                ePurchaseOrderItemDao.getApplyTds(),
                ePurchaseOrderItemDao.getNetRate(),
                ePurchaseOrderItemDao.getNetAmount(),
                ePurchaseOrderItemDao.getBaseNetRate(),
                ePurchaseOrderItemDao.getBaseNetAmount(),
                ePurchaseOrderItemDao.getFromWarehouse(),
                ePurchaseOrderItemDao.getWarehouse(),
                ePurchaseOrderItemDao.getActualQty(),
                ePurchaseOrderItemDao.getCompanyTotalStock(),
                ePurchaseOrderItemDao.getMaterialRequest(),
                ePurchaseOrderItemDao.getMaterialRequestItem(),
                ePurchaseOrderItemDao.getSalesOrder(),
                ePurchaseOrderItemDao.getSalesOrderItem(),
                ePurchaseOrderItemDao.getSalesOrderPackedItem(),
                ePurchaseOrderItemDao.getSupplierQuotation(),
                ePurchaseOrderItemDao.getSupplierQuotationItem(),
                ePurchaseOrderItemDao.getDeliveredBySupplier(),
                ePurchaseOrderItemDao.getAgainstBlanketOrder(),
                ePurchaseOrderItemDao.getBlanketOrder(),
                ePurchaseOrderItemDao.getBlanketOrderRate(),
                ePurchaseOrderItemDao.getReceivedQty(),
                ePurchaseOrderItemDao.getReturnedQty(),
                ePurchaseOrderItemDao.getBilledAmt(),
                ePurchaseOrderItemDao.getExpenseAccount(),
                ePurchaseOrderItemDao.getWipCompositeAsset(),
                ePurchaseOrderItemDao.getManufacturer(),
                ePurchaseOrderItemDao.getManufacturerPartNo(),
                ePurchaseOrderItemDao.getBom(),
                ePurchaseOrderItemDao.getIncludeExplodedItems(),
                ePurchaseOrderItemDao.getWeightPerUnit(),
                ePurchaseOrderItemDao.getTotalWeight(),
                ePurchaseOrderItemDao.getWeightUom(),
                ePurchaseOrderItemDao.getProject(),
                ePurchaseOrderItemDao.getCostCenter(),
                ePurchaseOrderItemDao.getIsFixedAsset(),
                ePurchaseOrderItemDao.getItemTaxRate(),
                ePurchaseOrderItemDao.getProductionPlan(),
                ePurchaseOrderItemDao.getProductionPlanItem(),
                ePurchaseOrderItemDao.getProductionPlanSubAssemblyItem(),
                ePurchaseOrderItemDao.getPageBreak(),
                ePurchaseOrderItemDao.getParent(),
                ePurchaseOrderItemDao.getParentField(),
                ePurchaseOrderItemDao.getParentType());
    }

    public static void fromDTO(PurchaseOrderItemDto vPurchaseOrderItemDto, PurchaseOrderItemDao ePurchaseOrderItemDao) {
        ePurchaseOrderItemDao.setName(vPurchaseOrderItemDto.name());
        ePurchaseOrderItemDao.setCreation(vPurchaseOrderItemDto.creation());
        ePurchaseOrderItemDao.setModified(vPurchaseOrderItemDto.modified());
        ePurchaseOrderItemDao.setModifiedBy(vPurchaseOrderItemDto.modifiedBy());
        ePurchaseOrderItemDao.setOwner(vPurchaseOrderItemDto.owner());
        ePurchaseOrderItemDao.setIsDocStatus(vPurchaseOrderItemDto.isDocStatus());
        ePurchaseOrderItemDao.setIdx(vPurchaseOrderItemDto.idx());
        ePurchaseOrderItemDao.setFgItem(vPurchaseOrderItemDto.fgItem());
        ePurchaseOrderItemDao.setFgItemQty(vPurchaseOrderItemDto.fgItemQty());
        ePurchaseOrderItemDao.setItemCode(vPurchaseOrderItemDto.itemCode());
        ePurchaseOrderItemDao.setSupplierPartNo(vPurchaseOrderItemDto.supplierPartNo());
        ePurchaseOrderItemDao.setItemName(vPurchaseOrderItemDto.itemName());
        ePurchaseOrderItemDao.setBrand(vPurchaseOrderItemDto.brand());
        ePurchaseOrderItemDao.setProductBundle(vPurchaseOrderItemDto.productBundle());
        ePurchaseOrderItemDao.setScheduleDate(vPurchaseOrderItemDto.scheduleDate());
        ePurchaseOrderItemDao.setExpectedDeliveryDate(vPurchaseOrderItemDto.expectedDeliveryDate());
        ePurchaseOrderItemDao.setItemGroup(vPurchaseOrderItemDto.itemGroup());
        ePurchaseOrderItemDao.setDescription(vPurchaseOrderItemDto.description());
        ePurchaseOrderItemDao.setImage(vPurchaseOrderItemDto.image());
        ePurchaseOrderItemDao.setQty(vPurchaseOrderItemDto.qty());
        ePurchaseOrderItemDao.setStockUom(vPurchaseOrderItemDto.stockUom());
        ePurchaseOrderItemDao.setUom(vPurchaseOrderItemDto.uom());
        ePurchaseOrderItemDao.setConversionFactor(vPurchaseOrderItemDto.conversionFactor());
        ePurchaseOrderItemDao.setStockQty(vPurchaseOrderItemDto.stockQty());
        ePurchaseOrderItemDao.setPriceListRate(vPurchaseOrderItemDto.priceListRate());
        ePurchaseOrderItemDao.setLastPurchaseRate(vPurchaseOrderItemDto.lastPurchaseRate());
        ePurchaseOrderItemDao.setBasePriceListRate(vPurchaseOrderItemDto.basePriceListRate());
        ePurchaseOrderItemDao.setMarginType(vPurchaseOrderItemDto.marginType());
        ePurchaseOrderItemDao.setMarginRateOrAmount(vPurchaseOrderItemDto.marginRateOrAmount());
        ePurchaseOrderItemDao.setRateWithMargin(vPurchaseOrderItemDto.rateWithMargin());
        ePurchaseOrderItemDao.setDiscountPercentage(vPurchaseOrderItemDto.discountPercentage());
        ePurchaseOrderItemDao.setDiscountAmount(vPurchaseOrderItemDto.discountAmount());
        ePurchaseOrderItemDao.setBaseRateWithMargin(vPurchaseOrderItemDto.baseRateWithMargin());
        ePurchaseOrderItemDao.setRate(vPurchaseOrderItemDto.rate());
        ePurchaseOrderItemDao.setAmount(vPurchaseOrderItemDto.amount());
        ePurchaseOrderItemDao.setItemTaxTemplate(vPurchaseOrderItemDto.itemTaxTemplate());
        ePurchaseOrderItemDao.setBaseRate(vPurchaseOrderItemDto.baseRate());
        ePurchaseOrderItemDao.setBaseAmount(vPurchaseOrderItemDto.baseAmount());
        ePurchaseOrderItemDao.setPricingRules(vPurchaseOrderItemDto.pricingRules());
        ePurchaseOrderItemDao.setStockUomRate(vPurchaseOrderItemDto.stockUomRate());
        ePurchaseOrderItemDao.setIsFreeItem(vPurchaseOrderItemDto.isFreeItem());
        ePurchaseOrderItemDao.setApplyTds(vPurchaseOrderItemDto.applyTds());
        ePurchaseOrderItemDao.setNetRate(vPurchaseOrderItemDto.netRate());
        ePurchaseOrderItemDao.setNetAmount(vPurchaseOrderItemDto.netAmount());
        ePurchaseOrderItemDao.setBaseNetRate(vPurchaseOrderItemDto.baseNetRate());
        ePurchaseOrderItemDao.setBaseNetAmount(vPurchaseOrderItemDto.baseNetAmount());
        ePurchaseOrderItemDao.setFromWarehouse(vPurchaseOrderItemDto.fromWarehouse());
        ePurchaseOrderItemDao.setWarehouse(vPurchaseOrderItemDto.warehouse());
        ePurchaseOrderItemDao.setActualQty(vPurchaseOrderItemDto.actualQty());
        ePurchaseOrderItemDao.setCompanyTotalStock(vPurchaseOrderItemDto.companyTotalStock());
        ePurchaseOrderItemDao.setMaterialRequest(vPurchaseOrderItemDto.materialRequest());
        ePurchaseOrderItemDao.setMaterialRequestItem(vPurchaseOrderItemDto.materialRequestItem());
        ePurchaseOrderItemDao.setSalesOrder(vPurchaseOrderItemDto.salesOrder());
        ePurchaseOrderItemDao.setSalesOrderItem(vPurchaseOrderItemDto.salesOrderItem());
        ePurchaseOrderItemDao.setSalesOrderPackedItem(vPurchaseOrderItemDto.salesOrderPackedItem());
        ePurchaseOrderItemDao.setSupplierQuotation(vPurchaseOrderItemDto.supplierQuotation());
        ePurchaseOrderItemDao.setSupplierQuotationItem(vPurchaseOrderItemDto.supplierQuotationItem());
        ePurchaseOrderItemDao.setDeliveredBySupplier(vPurchaseOrderItemDto.deliveredBySupplier());
        ePurchaseOrderItemDao.setAgainstBlanketOrder(vPurchaseOrderItemDto.againstBlanketOrder());
        ePurchaseOrderItemDao.setBlanketOrder(vPurchaseOrderItemDto.blanketOrder());
        ePurchaseOrderItemDao.setBlanketOrderRate(vPurchaseOrderItemDto.blanketOrderRate());
        ePurchaseOrderItemDao.setReceivedQty(vPurchaseOrderItemDto.receivedQty());
        ePurchaseOrderItemDao.setReturnedQty(vPurchaseOrderItemDto.returnedQty());
        ePurchaseOrderItemDao.setBilledAmt(vPurchaseOrderItemDto.billedAmt());
        ePurchaseOrderItemDao.setExpenseAccount(vPurchaseOrderItemDto.expenseAccount());
        ePurchaseOrderItemDao.setWipCompositeAsset(vPurchaseOrderItemDto.wipCompositeAsset());
        ePurchaseOrderItemDao.setManufacturer(vPurchaseOrderItemDto.manufacturer());
        ePurchaseOrderItemDao.setManufacturerPartNo(vPurchaseOrderItemDto.manufacturerPartNo());
        ePurchaseOrderItemDao.setBom(vPurchaseOrderItemDto.bom());
        ePurchaseOrderItemDao.setIncludeExplodedItems(vPurchaseOrderItemDto.includeExplodedItems());
        ePurchaseOrderItemDao.setWeightPerUnit(vPurchaseOrderItemDto.weightPerUnit());
        ePurchaseOrderItemDao.setTotalWeight(vPurchaseOrderItemDto.totalWeight());
        ePurchaseOrderItemDao.setWeightUom(vPurchaseOrderItemDto.weightUom());
        ePurchaseOrderItemDao.setProject(vPurchaseOrderItemDto.project());
        ePurchaseOrderItemDao.setCostCenter(vPurchaseOrderItemDto.costCenter());
        ePurchaseOrderItemDao.setIsFixedAsset(vPurchaseOrderItemDto.isFixedAsset());
        ePurchaseOrderItemDao.setItemTaxRate(vPurchaseOrderItemDto.itemTaxRate());
        ePurchaseOrderItemDao.setProductionPlan(vPurchaseOrderItemDto.productionPlan());
        ePurchaseOrderItemDao.setProductionPlanItem(vPurchaseOrderItemDto.productionPlanItem());
        ePurchaseOrderItemDao.setProductionPlanSubAssemblyItem(vPurchaseOrderItemDto.productionPlanSubAssemblyItem());
        ePurchaseOrderItemDao.setPageBreak(vPurchaseOrderItemDto.pageBreak());
        ePurchaseOrderItemDao.setParent(vPurchaseOrderItemDto.parent());
        ePurchaseOrderItemDao.setParentField(vPurchaseOrderItemDto.parentField());
        ePurchaseOrderItemDao.setParentType(vPurchaseOrderItemDto.parentType());
    }
}