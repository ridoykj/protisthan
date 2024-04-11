package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseInvoiceItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PurchaseInvoiceItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String productBundle,
        String itemName,
        String description,
        String brand,
        String itemGroup,
        String image,
        BigDecimal receivedQty,
        BigDecimal qty,
        BigDecimal rejectedQty,
        String uom,
        BigDecimal conversionFactor,
        String stockUom,
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
        BigDecimal valuationRate,
        BigDecimal itemTaxAmount,
        BigDecimal landedCostVoucherAmount,
        BigDecimal rmSuppCost,
        String warehouse,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String fromWarehouse,
        String qualityInspection,
        String rejectedWarehouse,
        String rejectedSerialAndBatchBundle,
        String serialNo,
        String rejectedSerialNo,
        String batchNo,
        String manufacturer,
        String manufacturerPartNo,
        String expenseAccount,
        String wipCompositeAsset,
        Boolean isFixedAsset,
        String assetLocation,
        String assetCategory,
        String deferredExpenseAccount,
        LocalDate serviceStopDate,
        Boolean enableDeferredExpense,
        LocalDate serviceStartDate,
        LocalDate serviceEndDate,
        Boolean allowZeroValuationRate,
        String itemTaxRate,
        String bom,
        Boolean includeExplodedItems,
        String purchaseInvoiceItem,
        String purchaseOrder,
        String poDetail,
        String purchaseReceipt,
        String prDetail,
        String salesInvoiceItem,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String project,
        String costCenter,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseInvoiceItemDto fromEntity(PurchaseInvoiceItemDao ePurchaseInvoiceItemDao) {
        return new PurchaseInvoiceItemDto(
                ePurchaseInvoiceItemDao.getName(),
                ePurchaseInvoiceItemDao.getCreation(),
                ePurchaseInvoiceItemDao.getModified(),
                ePurchaseInvoiceItemDao.getModifiedBy(),
                ePurchaseInvoiceItemDao.getOwner(),
                ePurchaseInvoiceItemDao.getIsDocStatus(),
                ePurchaseInvoiceItemDao.getIdx(),
                ePurchaseInvoiceItemDao.getItemCode(),
                ePurchaseInvoiceItemDao.getProductBundle(),
                ePurchaseInvoiceItemDao.getItemName(),
                ePurchaseInvoiceItemDao.getDescription(),
                ePurchaseInvoiceItemDao.getBrand(),
                ePurchaseInvoiceItemDao.getItemGroup(),
                ePurchaseInvoiceItemDao.getImage(),
                ePurchaseInvoiceItemDao.getReceivedQty(),
                ePurchaseInvoiceItemDao.getQty(),
                ePurchaseInvoiceItemDao.getRejectedQty(),
                ePurchaseInvoiceItemDao.getUom(),
                ePurchaseInvoiceItemDao.getConversionFactor(),
                ePurchaseInvoiceItemDao.getStockUom(),
                ePurchaseInvoiceItemDao.getStockQty(),
                ePurchaseInvoiceItemDao.getPriceListRate(),
                ePurchaseInvoiceItemDao.getBasePriceListRate(),
                ePurchaseInvoiceItemDao.getMarginType(),
                ePurchaseInvoiceItemDao.getMarginRateOrAmount(),
                ePurchaseInvoiceItemDao.getRateWithMargin(),
                ePurchaseInvoiceItemDao.getDiscountPercentage(),
                ePurchaseInvoiceItemDao.getDiscountAmount(),
                ePurchaseInvoiceItemDao.getBaseRateWithMargin(),
                ePurchaseInvoiceItemDao.getRate(),
                ePurchaseInvoiceItemDao.getAmount(),
                ePurchaseInvoiceItemDao.getItemTaxTemplate(),
                ePurchaseInvoiceItemDao.getBaseRate(),
                ePurchaseInvoiceItemDao.getBaseAmount(),
                ePurchaseInvoiceItemDao.getPricingRules(),
                ePurchaseInvoiceItemDao.getStockUomRate(),
                ePurchaseInvoiceItemDao.getIsFreeItem(),
                ePurchaseInvoiceItemDao.getApplyTds(),
                ePurchaseInvoiceItemDao.getNetRate(),
                ePurchaseInvoiceItemDao.getNetAmount(),
                ePurchaseInvoiceItemDao.getBaseNetRate(),
                ePurchaseInvoiceItemDao.getBaseNetAmount(),
                ePurchaseInvoiceItemDao.getValuationRate(),
                ePurchaseInvoiceItemDao.getItemTaxAmount(),
                ePurchaseInvoiceItemDao.getLandedCostVoucherAmount(),
                ePurchaseInvoiceItemDao.getRmSuppCost(),
                ePurchaseInvoiceItemDao.getWarehouse(),
                ePurchaseInvoiceItemDao.getSerialAndBatchBundle(),
                ePurchaseInvoiceItemDao.getUseSerialBatchFields(),
                ePurchaseInvoiceItemDao.getFromWarehouse(),
                ePurchaseInvoiceItemDao.getQualityInspection(),
                ePurchaseInvoiceItemDao.getRejectedWarehouse(),
                ePurchaseInvoiceItemDao.getRejectedSerialAndBatchBundle(),
                ePurchaseInvoiceItemDao.getSerialNo(),
                ePurchaseInvoiceItemDao.getRejectedSerialNo(),
                ePurchaseInvoiceItemDao.getBatchNo(),
                ePurchaseInvoiceItemDao.getManufacturer(),
                ePurchaseInvoiceItemDao.getManufacturerPartNo(),
                ePurchaseInvoiceItemDao.getExpenseAccount(),
                ePurchaseInvoiceItemDao.getWipCompositeAsset(),
                ePurchaseInvoiceItemDao.getIsFixedAsset(),
                ePurchaseInvoiceItemDao.getAssetLocation(),
                ePurchaseInvoiceItemDao.getAssetCategory(),
                ePurchaseInvoiceItemDao.getDeferredExpenseAccount(),
                ePurchaseInvoiceItemDao.getServiceStopDate(),
                ePurchaseInvoiceItemDao.getEnableDeferredExpense(),
                ePurchaseInvoiceItemDao.getServiceStartDate(),
                ePurchaseInvoiceItemDao.getServiceEndDate(),
                ePurchaseInvoiceItemDao.getAllowZeroValuationRate(),
                ePurchaseInvoiceItemDao.getItemTaxRate(),
                ePurchaseInvoiceItemDao.getBom(),
                ePurchaseInvoiceItemDao.getIncludeExplodedItems(),
                ePurchaseInvoiceItemDao.getPurchaseInvoiceItem(),
                ePurchaseInvoiceItemDao.getPurchaseOrder(),
                ePurchaseInvoiceItemDao.getPoDetail(),
                ePurchaseInvoiceItemDao.getPurchaseReceipt(),
                ePurchaseInvoiceItemDao.getPrDetail(),
                ePurchaseInvoiceItemDao.getSalesInvoiceItem(),
                ePurchaseInvoiceItemDao.getWeightPerUnit(),
                ePurchaseInvoiceItemDao.getTotalWeight(),
                ePurchaseInvoiceItemDao.getWeightUom(),
                ePurchaseInvoiceItemDao.getProject(),
                ePurchaseInvoiceItemDao.getCostCenter(),
                ePurchaseInvoiceItemDao.getPageBreak(),
                ePurchaseInvoiceItemDao.getParent(),
                ePurchaseInvoiceItemDao.getParentField(),
                ePurchaseInvoiceItemDao.getParentType());
    }

    public static void fromDTO(PurchaseInvoiceItemDto vPurchaseInvoiceItemDto, PurchaseInvoiceItemDao ePurchaseInvoiceItemDao) {
        ePurchaseInvoiceItemDao.setName(vPurchaseInvoiceItemDto.name());
        ePurchaseInvoiceItemDao.setCreation(vPurchaseInvoiceItemDto.creation());
        ePurchaseInvoiceItemDao.setModified(vPurchaseInvoiceItemDto.modified());
        ePurchaseInvoiceItemDao.setModifiedBy(vPurchaseInvoiceItemDto.modifiedBy());
        ePurchaseInvoiceItemDao.setOwner(vPurchaseInvoiceItemDto.owner());
        ePurchaseInvoiceItemDao.setIsDocStatus(vPurchaseInvoiceItemDto.isDocStatus());
        ePurchaseInvoiceItemDao.setIdx(vPurchaseInvoiceItemDto.idx());
        ePurchaseInvoiceItemDao.setItemCode(vPurchaseInvoiceItemDto.itemCode());
        ePurchaseInvoiceItemDao.setProductBundle(vPurchaseInvoiceItemDto.productBundle());
        ePurchaseInvoiceItemDao.setItemName(vPurchaseInvoiceItemDto.itemName());
        ePurchaseInvoiceItemDao.setDescription(vPurchaseInvoiceItemDto.description());
        ePurchaseInvoiceItemDao.setBrand(vPurchaseInvoiceItemDto.brand());
        ePurchaseInvoiceItemDao.setItemGroup(vPurchaseInvoiceItemDto.itemGroup());
        ePurchaseInvoiceItemDao.setImage(vPurchaseInvoiceItemDto.image());
        ePurchaseInvoiceItemDao.setReceivedQty(vPurchaseInvoiceItemDto.receivedQty());
        ePurchaseInvoiceItemDao.setQty(vPurchaseInvoiceItemDto.qty());
        ePurchaseInvoiceItemDao.setRejectedQty(vPurchaseInvoiceItemDto.rejectedQty());
        ePurchaseInvoiceItemDao.setUom(vPurchaseInvoiceItemDto.uom());
        ePurchaseInvoiceItemDao.setConversionFactor(vPurchaseInvoiceItemDto.conversionFactor());
        ePurchaseInvoiceItemDao.setStockUom(vPurchaseInvoiceItemDto.stockUom());
        ePurchaseInvoiceItemDao.setStockQty(vPurchaseInvoiceItemDto.stockQty());
        ePurchaseInvoiceItemDao.setPriceListRate(vPurchaseInvoiceItemDto.priceListRate());
        ePurchaseInvoiceItemDao.setBasePriceListRate(vPurchaseInvoiceItemDto.basePriceListRate());
        ePurchaseInvoiceItemDao.setMarginType(vPurchaseInvoiceItemDto.marginType());
        ePurchaseInvoiceItemDao.setMarginRateOrAmount(vPurchaseInvoiceItemDto.marginRateOrAmount());
        ePurchaseInvoiceItemDao.setRateWithMargin(vPurchaseInvoiceItemDto.rateWithMargin());
        ePurchaseInvoiceItemDao.setDiscountPercentage(vPurchaseInvoiceItemDto.discountPercentage());
        ePurchaseInvoiceItemDao.setDiscountAmount(vPurchaseInvoiceItemDto.discountAmount());
        ePurchaseInvoiceItemDao.setBaseRateWithMargin(vPurchaseInvoiceItemDto.baseRateWithMargin());
        ePurchaseInvoiceItemDao.setRate(vPurchaseInvoiceItemDto.rate());
        ePurchaseInvoiceItemDao.setAmount(vPurchaseInvoiceItemDto.amount());
        ePurchaseInvoiceItemDao.setItemTaxTemplate(vPurchaseInvoiceItemDto.itemTaxTemplate());
        ePurchaseInvoiceItemDao.setBaseRate(vPurchaseInvoiceItemDto.baseRate());
        ePurchaseInvoiceItemDao.setBaseAmount(vPurchaseInvoiceItemDto.baseAmount());
        ePurchaseInvoiceItemDao.setPricingRules(vPurchaseInvoiceItemDto.pricingRules());
        ePurchaseInvoiceItemDao.setStockUomRate(vPurchaseInvoiceItemDto.stockUomRate());
        ePurchaseInvoiceItemDao.setIsFreeItem(vPurchaseInvoiceItemDto.isFreeItem());
        ePurchaseInvoiceItemDao.setApplyTds(vPurchaseInvoiceItemDto.applyTds());
        ePurchaseInvoiceItemDao.setNetRate(vPurchaseInvoiceItemDto.netRate());
        ePurchaseInvoiceItemDao.setNetAmount(vPurchaseInvoiceItemDto.netAmount());
        ePurchaseInvoiceItemDao.setBaseNetRate(vPurchaseInvoiceItemDto.baseNetRate());
        ePurchaseInvoiceItemDao.setBaseNetAmount(vPurchaseInvoiceItemDto.baseNetAmount());
        ePurchaseInvoiceItemDao.setValuationRate(vPurchaseInvoiceItemDto.valuationRate());
        ePurchaseInvoiceItemDao.setItemTaxAmount(vPurchaseInvoiceItemDto.itemTaxAmount());
        ePurchaseInvoiceItemDao.setLandedCostVoucherAmount(vPurchaseInvoiceItemDto.landedCostVoucherAmount());
        ePurchaseInvoiceItemDao.setRmSuppCost(vPurchaseInvoiceItemDto.rmSuppCost());
        ePurchaseInvoiceItemDao.setWarehouse(vPurchaseInvoiceItemDto.warehouse());
        ePurchaseInvoiceItemDao.setSerialAndBatchBundle(vPurchaseInvoiceItemDto.serialAndBatchBundle());
        ePurchaseInvoiceItemDao.setUseSerialBatchFields(vPurchaseInvoiceItemDto.useSerialBatchFields());
        ePurchaseInvoiceItemDao.setFromWarehouse(vPurchaseInvoiceItemDto.fromWarehouse());
        ePurchaseInvoiceItemDao.setQualityInspection(vPurchaseInvoiceItemDto.qualityInspection());
        ePurchaseInvoiceItemDao.setRejectedWarehouse(vPurchaseInvoiceItemDto.rejectedWarehouse());
        ePurchaseInvoiceItemDao.setRejectedSerialAndBatchBundle(vPurchaseInvoiceItemDto.rejectedSerialAndBatchBundle());
        ePurchaseInvoiceItemDao.setSerialNo(vPurchaseInvoiceItemDto.serialNo());
        ePurchaseInvoiceItemDao.setRejectedSerialNo(vPurchaseInvoiceItemDto.rejectedSerialNo());
        ePurchaseInvoiceItemDao.setBatchNo(vPurchaseInvoiceItemDto.batchNo());
        ePurchaseInvoiceItemDao.setManufacturer(vPurchaseInvoiceItemDto.manufacturer());
        ePurchaseInvoiceItemDao.setManufacturerPartNo(vPurchaseInvoiceItemDto.manufacturerPartNo());
        ePurchaseInvoiceItemDao.setExpenseAccount(vPurchaseInvoiceItemDto.expenseAccount());
        ePurchaseInvoiceItemDao.setWipCompositeAsset(vPurchaseInvoiceItemDto.wipCompositeAsset());
        ePurchaseInvoiceItemDao.setIsFixedAsset(vPurchaseInvoiceItemDto.isFixedAsset());
        ePurchaseInvoiceItemDao.setAssetLocation(vPurchaseInvoiceItemDto.assetLocation());
        ePurchaseInvoiceItemDao.setAssetCategory(vPurchaseInvoiceItemDto.assetCategory());
        ePurchaseInvoiceItemDao.setDeferredExpenseAccount(vPurchaseInvoiceItemDto.deferredExpenseAccount());
        ePurchaseInvoiceItemDao.setServiceStopDate(vPurchaseInvoiceItemDto.serviceStopDate());
        ePurchaseInvoiceItemDao.setEnableDeferredExpense(vPurchaseInvoiceItemDto.enableDeferredExpense());
        ePurchaseInvoiceItemDao.setServiceStartDate(vPurchaseInvoiceItemDto.serviceStartDate());
        ePurchaseInvoiceItemDao.setServiceEndDate(vPurchaseInvoiceItemDto.serviceEndDate());
        ePurchaseInvoiceItemDao.setAllowZeroValuationRate(vPurchaseInvoiceItemDto.allowZeroValuationRate());
        ePurchaseInvoiceItemDao.setItemTaxRate(vPurchaseInvoiceItemDto.itemTaxRate());
        ePurchaseInvoiceItemDao.setBom(vPurchaseInvoiceItemDto.bom());
        ePurchaseInvoiceItemDao.setIncludeExplodedItems(vPurchaseInvoiceItemDto.includeExplodedItems());
        ePurchaseInvoiceItemDao.setPurchaseInvoiceItem(vPurchaseInvoiceItemDto.purchaseInvoiceItem());
        ePurchaseInvoiceItemDao.setPurchaseOrder(vPurchaseInvoiceItemDto.purchaseOrder());
        ePurchaseInvoiceItemDao.setPoDetail(vPurchaseInvoiceItemDto.poDetail());
        ePurchaseInvoiceItemDao.setPurchaseReceipt(vPurchaseInvoiceItemDto.purchaseReceipt());
        ePurchaseInvoiceItemDao.setPrDetail(vPurchaseInvoiceItemDto.prDetail());
        ePurchaseInvoiceItemDao.setSalesInvoiceItem(vPurchaseInvoiceItemDto.salesInvoiceItem());
        ePurchaseInvoiceItemDao.setWeightPerUnit(vPurchaseInvoiceItemDto.weightPerUnit());
        ePurchaseInvoiceItemDao.setTotalWeight(vPurchaseInvoiceItemDto.totalWeight());
        ePurchaseInvoiceItemDao.setWeightUom(vPurchaseInvoiceItemDto.weightUom());
        ePurchaseInvoiceItemDao.setProject(vPurchaseInvoiceItemDto.project());
        ePurchaseInvoiceItemDao.setCostCenter(vPurchaseInvoiceItemDto.costCenter());
        ePurchaseInvoiceItemDao.setPageBreak(vPurchaseInvoiceItemDto.pageBreak());
        ePurchaseInvoiceItemDao.setParent(vPurchaseInvoiceItemDto.parent());
        ePurchaseInvoiceItemDao.setParentField(vPurchaseInvoiceItemDto.parentField());
        ePurchaseInvoiceItemDao.setParentType(vPurchaseInvoiceItemDto.parentType());
    }
}