package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseReceiptItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PurchaseReceiptItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String barcode,
        Boolean hasItemScanned,
        String itemCode,
        String productBundle,
        String supplierPartNo,
        String itemName,
        String description,
        String brand,
        String itemGroup,
        String image,
        BigDecimal receivedQty,
        BigDecimal qty,
        BigDecimal rejectedQty,
        String uom,
        String stockUom,
        BigDecimal conversionFactor,
        Boolean retainSample,
        Integer sampleQuantity,
        BigDecimal receivedStockQty,
        BigDecimal stockQty,
        BigDecimal returnedQty,
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
        BigDecimal baseRate,
        BigDecimal baseAmount,
        String pricingRules,
        BigDecimal stockUomRate,
        Boolean isFreeItem,
        BigDecimal netRate,
        BigDecimal netAmount,
        String itemTaxTemplate,
        BigDecimal baseNetRate,
        BigDecimal baseNetAmount,
        BigDecimal valuationRate,
        BigDecimal itemTaxAmount,
        BigDecimal rmSuppCost,
        BigDecimal landedCostVoucherAmount,
        BigDecimal rateDifferenceWithPurchaseInvoice,
        BigDecimal billedAmt,
        String warehouse,
        String rejectedWarehouse,
        String fromWarehouse,
        String materialRequest,
        String purchaseOrder,
        String purchaseInvoice,
        Boolean allowZeroValuationRate,
        Boolean isFixedAsset,
        String assetLocation,
        String assetCategory,
        LocalDate scheduleDate,
        String qualityInspection,
        String materialRequestItem,
        String purchaseOrderItem,
        String purchaseInvoiceItem,
        String purchaseReceiptItem,
        String deliveryNoteItem,
        String putawayRule,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String rejectedSerialAndBatchBundle,
        String serialNo,
        String rejectedSerialNo,
        String batchNo,
        Boolean includeExplodedItems,
        String bom,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String manufacturer,
        String manufacturerPartNo,
        String expenseAccount,
        String itemTaxRate,
        String wipCompositeAsset,
        String provisionalExpenseAccount,
        String project,
        String costCenter,
        Boolean pageBreak,
        String salesOrder,
        String salesOrderItem,
        String subcontractingReceiptItem,
        String parent,
        String parentField,
        String parentType
) {
    public static PurchaseReceiptItemDto fromEntity(PurchaseReceiptItemDao ePurchaseReceiptItemDao) {
        return new PurchaseReceiptItemDto(
                ePurchaseReceiptItemDao.getName(),
                ePurchaseReceiptItemDao.getCreation(),
                ePurchaseReceiptItemDao.getModified(),
                ePurchaseReceiptItemDao.getModifiedBy(),
                ePurchaseReceiptItemDao.getOwner(),
                ePurchaseReceiptItemDao.getIsDocStatus(),
                ePurchaseReceiptItemDao.getIdx(),
                ePurchaseReceiptItemDao.getBarcode(),
                ePurchaseReceiptItemDao.getHasItemScanned(),
                ePurchaseReceiptItemDao.getItemCode(),
                ePurchaseReceiptItemDao.getProductBundle(),
                ePurchaseReceiptItemDao.getSupplierPartNo(),
                ePurchaseReceiptItemDao.getItemName(),
                ePurchaseReceiptItemDao.getDescription(),
                ePurchaseReceiptItemDao.getBrand(),
                ePurchaseReceiptItemDao.getItemGroup(),
                ePurchaseReceiptItemDao.getImage(),
                ePurchaseReceiptItemDao.getReceivedQty(),
                ePurchaseReceiptItemDao.getQty(),
                ePurchaseReceiptItemDao.getRejectedQty(),
                ePurchaseReceiptItemDao.getUom(),
                ePurchaseReceiptItemDao.getStockUom(),
                ePurchaseReceiptItemDao.getConversionFactor(),
                ePurchaseReceiptItemDao.getRetainSample(),
                ePurchaseReceiptItemDao.getSampleQuantity(),
                ePurchaseReceiptItemDao.getReceivedStockQty(),
                ePurchaseReceiptItemDao.getStockQty(),
                ePurchaseReceiptItemDao.getReturnedQty(),
                ePurchaseReceiptItemDao.getPriceListRate(),
                ePurchaseReceiptItemDao.getBasePriceListRate(),
                ePurchaseReceiptItemDao.getMarginType(),
                ePurchaseReceiptItemDao.getMarginRateOrAmount(),
                ePurchaseReceiptItemDao.getRateWithMargin(),
                ePurchaseReceiptItemDao.getDiscountPercentage(),
                ePurchaseReceiptItemDao.getDiscountAmount(),
                ePurchaseReceiptItemDao.getBaseRateWithMargin(),
                ePurchaseReceiptItemDao.getRate(),
                ePurchaseReceiptItemDao.getAmount(),
                ePurchaseReceiptItemDao.getBaseRate(),
                ePurchaseReceiptItemDao.getBaseAmount(),
                ePurchaseReceiptItemDao.getPricingRules(),
                ePurchaseReceiptItemDao.getStockUomRate(),
                ePurchaseReceiptItemDao.getIsFreeItem(),
                ePurchaseReceiptItemDao.getNetRate(),
                ePurchaseReceiptItemDao.getNetAmount(),
                ePurchaseReceiptItemDao.getItemTaxTemplate(),
                ePurchaseReceiptItemDao.getBaseNetRate(),
                ePurchaseReceiptItemDao.getBaseNetAmount(),
                ePurchaseReceiptItemDao.getValuationRate(),
                ePurchaseReceiptItemDao.getItemTaxAmount(),
                ePurchaseReceiptItemDao.getRmSuppCost(),
                ePurchaseReceiptItemDao.getLandedCostVoucherAmount(),
                ePurchaseReceiptItemDao.getRateDifferenceWithPurchaseInvoice(),
                ePurchaseReceiptItemDao.getBilledAmt(),
                ePurchaseReceiptItemDao.getWarehouse(),
                ePurchaseReceiptItemDao.getRejectedWarehouse(),
                ePurchaseReceiptItemDao.getFromWarehouse(),
                ePurchaseReceiptItemDao.getMaterialRequest(),
                ePurchaseReceiptItemDao.getPurchaseOrder(),
                ePurchaseReceiptItemDao.getPurchaseInvoice(),
                ePurchaseReceiptItemDao.getAllowZeroValuationRate(),
                ePurchaseReceiptItemDao.getIsFixedAsset(),
                ePurchaseReceiptItemDao.getAssetLocation(),
                ePurchaseReceiptItemDao.getAssetCategory(),
                ePurchaseReceiptItemDao.getScheduleDate(),
                ePurchaseReceiptItemDao.getQualityInspection(),
                ePurchaseReceiptItemDao.getMaterialRequestItem(),
                ePurchaseReceiptItemDao.getPurchaseOrderItem(),
                ePurchaseReceiptItemDao.getPurchaseInvoiceItem(),
                ePurchaseReceiptItemDao.getPurchaseReceiptItem(),
                ePurchaseReceiptItemDao.getDeliveryNoteItem(),
                ePurchaseReceiptItemDao.getPutawayRule(),
                ePurchaseReceiptItemDao.getSerialAndBatchBundle(),
                ePurchaseReceiptItemDao.getUseSerialBatchFields(),
                ePurchaseReceiptItemDao.getRejectedSerialAndBatchBundle(),
                ePurchaseReceiptItemDao.getSerialNo(),
                ePurchaseReceiptItemDao.getRejectedSerialNo(),
                ePurchaseReceiptItemDao.getBatchNo(),
                ePurchaseReceiptItemDao.getIncludeExplodedItems(),
                ePurchaseReceiptItemDao.getBom(),
                ePurchaseReceiptItemDao.getWeightPerUnit(),
                ePurchaseReceiptItemDao.getTotalWeight(),
                ePurchaseReceiptItemDao.getWeightUom(),
                ePurchaseReceiptItemDao.getManufacturer(),
                ePurchaseReceiptItemDao.getManufacturerPartNo(),
                ePurchaseReceiptItemDao.getExpenseAccount(),
                ePurchaseReceiptItemDao.getItemTaxRate(),
                ePurchaseReceiptItemDao.getWipCompositeAsset(),
                ePurchaseReceiptItemDao.getProvisionalExpenseAccount(),
                ePurchaseReceiptItemDao.getProject(),
                ePurchaseReceiptItemDao.getCostCenter(),
                ePurchaseReceiptItemDao.getPageBreak(),
                ePurchaseReceiptItemDao.getSalesOrder(),
                ePurchaseReceiptItemDao.getSalesOrderItem(),
                ePurchaseReceiptItemDao.getSubcontractingReceiptItem(),
                ePurchaseReceiptItemDao.getParent(),
                ePurchaseReceiptItemDao.getParentField(),
                ePurchaseReceiptItemDao.getParentType());
    }

    public static void fromDTO(PurchaseReceiptItemDto vPurchaseReceiptItemDto, PurchaseReceiptItemDao ePurchaseReceiptItemDao) {
        ePurchaseReceiptItemDao.setName(vPurchaseReceiptItemDto.name());
        ePurchaseReceiptItemDao.setCreation(vPurchaseReceiptItemDto.creation());
        ePurchaseReceiptItemDao.setModified(vPurchaseReceiptItemDto.modified());
        ePurchaseReceiptItemDao.setModifiedBy(vPurchaseReceiptItemDto.modifiedBy());
        ePurchaseReceiptItemDao.setOwner(vPurchaseReceiptItemDto.owner());
        ePurchaseReceiptItemDao.setIsDocStatus(vPurchaseReceiptItemDto.isDocStatus());
        ePurchaseReceiptItemDao.setIdx(vPurchaseReceiptItemDto.idx());
        ePurchaseReceiptItemDao.setBarcode(vPurchaseReceiptItemDto.barcode());
        ePurchaseReceiptItemDao.setHasItemScanned(vPurchaseReceiptItemDto.hasItemScanned());
        ePurchaseReceiptItemDao.setItemCode(vPurchaseReceiptItemDto.itemCode());
        ePurchaseReceiptItemDao.setProductBundle(vPurchaseReceiptItemDto.productBundle());
        ePurchaseReceiptItemDao.setSupplierPartNo(vPurchaseReceiptItemDto.supplierPartNo());
        ePurchaseReceiptItemDao.setItemName(vPurchaseReceiptItemDto.itemName());
        ePurchaseReceiptItemDao.setDescription(vPurchaseReceiptItemDto.description());
        ePurchaseReceiptItemDao.setBrand(vPurchaseReceiptItemDto.brand());
        ePurchaseReceiptItemDao.setItemGroup(vPurchaseReceiptItemDto.itemGroup());
        ePurchaseReceiptItemDao.setImage(vPurchaseReceiptItemDto.image());
        ePurchaseReceiptItemDao.setReceivedQty(vPurchaseReceiptItemDto.receivedQty());
        ePurchaseReceiptItemDao.setQty(vPurchaseReceiptItemDto.qty());
        ePurchaseReceiptItemDao.setRejectedQty(vPurchaseReceiptItemDto.rejectedQty());
        ePurchaseReceiptItemDao.setUom(vPurchaseReceiptItemDto.uom());
        ePurchaseReceiptItemDao.setStockUom(vPurchaseReceiptItemDto.stockUom());
        ePurchaseReceiptItemDao.setConversionFactor(vPurchaseReceiptItemDto.conversionFactor());
        ePurchaseReceiptItemDao.setRetainSample(vPurchaseReceiptItemDto.retainSample());
        ePurchaseReceiptItemDao.setSampleQuantity(vPurchaseReceiptItemDto.sampleQuantity());
        ePurchaseReceiptItemDao.setReceivedStockQty(vPurchaseReceiptItemDto.receivedStockQty());
        ePurchaseReceiptItemDao.setStockQty(vPurchaseReceiptItemDto.stockQty());
        ePurchaseReceiptItemDao.setReturnedQty(vPurchaseReceiptItemDto.returnedQty());
        ePurchaseReceiptItemDao.setPriceListRate(vPurchaseReceiptItemDto.priceListRate());
        ePurchaseReceiptItemDao.setBasePriceListRate(vPurchaseReceiptItemDto.basePriceListRate());
        ePurchaseReceiptItemDao.setMarginType(vPurchaseReceiptItemDto.marginType());
        ePurchaseReceiptItemDao.setMarginRateOrAmount(vPurchaseReceiptItemDto.marginRateOrAmount());
        ePurchaseReceiptItemDao.setRateWithMargin(vPurchaseReceiptItemDto.rateWithMargin());
        ePurchaseReceiptItemDao.setDiscountPercentage(vPurchaseReceiptItemDto.discountPercentage());
        ePurchaseReceiptItemDao.setDiscountAmount(vPurchaseReceiptItemDto.discountAmount());
        ePurchaseReceiptItemDao.setBaseRateWithMargin(vPurchaseReceiptItemDto.baseRateWithMargin());
        ePurchaseReceiptItemDao.setRate(vPurchaseReceiptItemDto.rate());
        ePurchaseReceiptItemDao.setAmount(vPurchaseReceiptItemDto.amount());
        ePurchaseReceiptItemDao.setBaseRate(vPurchaseReceiptItemDto.baseRate());
        ePurchaseReceiptItemDao.setBaseAmount(vPurchaseReceiptItemDto.baseAmount());
        ePurchaseReceiptItemDao.setPricingRules(vPurchaseReceiptItemDto.pricingRules());
        ePurchaseReceiptItemDao.setStockUomRate(vPurchaseReceiptItemDto.stockUomRate());
        ePurchaseReceiptItemDao.setIsFreeItem(vPurchaseReceiptItemDto.isFreeItem());
        ePurchaseReceiptItemDao.setNetRate(vPurchaseReceiptItemDto.netRate());
        ePurchaseReceiptItemDao.setNetAmount(vPurchaseReceiptItemDto.netAmount());
        ePurchaseReceiptItemDao.setItemTaxTemplate(vPurchaseReceiptItemDto.itemTaxTemplate());
        ePurchaseReceiptItemDao.setBaseNetRate(vPurchaseReceiptItemDto.baseNetRate());
        ePurchaseReceiptItemDao.setBaseNetAmount(vPurchaseReceiptItemDto.baseNetAmount());
        ePurchaseReceiptItemDao.setValuationRate(vPurchaseReceiptItemDto.valuationRate());
        ePurchaseReceiptItemDao.setItemTaxAmount(vPurchaseReceiptItemDto.itemTaxAmount());
        ePurchaseReceiptItemDao.setRmSuppCost(vPurchaseReceiptItemDto.rmSuppCost());
        ePurchaseReceiptItemDao.setLandedCostVoucherAmount(vPurchaseReceiptItemDto.landedCostVoucherAmount());
        ePurchaseReceiptItemDao.setRateDifferenceWithPurchaseInvoice(vPurchaseReceiptItemDto.rateDifferenceWithPurchaseInvoice());
        ePurchaseReceiptItemDao.setBilledAmt(vPurchaseReceiptItemDto.billedAmt());
        ePurchaseReceiptItemDao.setWarehouse(vPurchaseReceiptItemDto.warehouse());
        ePurchaseReceiptItemDao.setRejectedWarehouse(vPurchaseReceiptItemDto.rejectedWarehouse());
        ePurchaseReceiptItemDao.setFromWarehouse(vPurchaseReceiptItemDto.fromWarehouse());
        ePurchaseReceiptItemDao.setMaterialRequest(vPurchaseReceiptItemDto.materialRequest());
        ePurchaseReceiptItemDao.setPurchaseOrder(vPurchaseReceiptItemDto.purchaseOrder());
        ePurchaseReceiptItemDao.setPurchaseInvoice(vPurchaseReceiptItemDto.purchaseInvoice());
        ePurchaseReceiptItemDao.setAllowZeroValuationRate(vPurchaseReceiptItemDto.allowZeroValuationRate());
        ePurchaseReceiptItemDao.setIsFixedAsset(vPurchaseReceiptItemDto.isFixedAsset());
        ePurchaseReceiptItemDao.setAssetLocation(vPurchaseReceiptItemDto.assetLocation());
        ePurchaseReceiptItemDao.setAssetCategory(vPurchaseReceiptItemDto.assetCategory());
        ePurchaseReceiptItemDao.setScheduleDate(vPurchaseReceiptItemDto.scheduleDate());
        ePurchaseReceiptItemDao.setQualityInspection(vPurchaseReceiptItemDto.qualityInspection());
        ePurchaseReceiptItemDao.setMaterialRequestItem(vPurchaseReceiptItemDto.materialRequestItem());
        ePurchaseReceiptItemDao.setPurchaseOrderItem(vPurchaseReceiptItemDto.purchaseOrderItem());
        ePurchaseReceiptItemDao.setPurchaseInvoiceItem(vPurchaseReceiptItemDto.purchaseInvoiceItem());
        ePurchaseReceiptItemDao.setPurchaseReceiptItem(vPurchaseReceiptItemDto.purchaseReceiptItem());
        ePurchaseReceiptItemDao.setDeliveryNoteItem(vPurchaseReceiptItemDto.deliveryNoteItem());
        ePurchaseReceiptItemDao.setPutawayRule(vPurchaseReceiptItemDto.putawayRule());
        ePurchaseReceiptItemDao.setSerialAndBatchBundle(vPurchaseReceiptItemDto.serialAndBatchBundle());
        ePurchaseReceiptItemDao.setUseSerialBatchFields(vPurchaseReceiptItemDto.useSerialBatchFields());
        ePurchaseReceiptItemDao.setRejectedSerialAndBatchBundle(vPurchaseReceiptItemDto.rejectedSerialAndBatchBundle());
        ePurchaseReceiptItemDao.setSerialNo(vPurchaseReceiptItemDto.serialNo());
        ePurchaseReceiptItemDao.setRejectedSerialNo(vPurchaseReceiptItemDto.rejectedSerialNo());
        ePurchaseReceiptItemDao.setBatchNo(vPurchaseReceiptItemDto.batchNo());
        ePurchaseReceiptItemDao.setIncludeExplodedItems(vPurchaseReceiptItemDto.includeExplodedItems());
        ePurchaseReceiptItemDao.setBom(vPurchaseReceiptItemDto.bom());
        ePurchaseReceiptItemDao.setWeightPerUnit(vPurchaseReceiptItemDto.weightPerUnit());
        ePurchaseReceiptItemDao.setTotalWeight(vPurchaseReceiptItemDto.totalWeight());
        ePurchaseReceiptItemDao.setWeightUom(vPurchaseReceiptItemDto.weightUom());
        ePurchaseReceiptItemDao.setManufacturer(vPurchaseReceiptItemDto.manufacturer());
        ePurchaseReceiptItemDao.setManufacturerPartNo(vPurchaseReceiptItemDto.manufacturerPartNo());
        ePurchaseReceiptItemDao.setExpenseAccount(vPurchaseReceiptItemDto.expenseAccount());
        ePurchaseReceiptItemDao.setItemTaxRate(vPurchaseReceiptItemDto.itemTaxRate());
        ePurchaseReceiptItemDao.setWipCompositeAsset(vPurchaseReceiptItemDto.wipCompositeAsset());
        ePurchaseReceiptItemDao.setProvisionalExpenseAccount(vPurchaseReceiptItemDto.provisionalExpenseAccount());
        ePurchaseReceiptItemDao.setProject(vPurchaseReceiptItemDto.project());
        ePurchaseReceiptItemDao.setCostCenter(vPurchaseReceiptItemDto.costCenter());
        ePurchaseReceiptItemDao.setPageBreak(vPurchaseReceiptItemDto.pageBreak());
        ePurchaseReceiptItemDao.setSalesOrder(vPurchaseReceiptItemDto.salesOrder());
        ePurchaseReceiptItemDao.setSalesOrderItem(vPurchaseReceiptItemDto.salesOrderItem());
        ePurchaseReceiptItemDao.setSubcontractingReceiptItem(vPurchaseReceiptItemDto.subcontractingReceiptItem());
        ePurchaseReceiptItemDao.setParent(vPurchaseReceiptItemDto.parent());
        ePurchaseReceiptItemDao.setParentField(vPurchaseReceiptItemDto.parentField());
        ePurchaseReceiptItemDao.setParentType(vPurchaseReceiptItemDto.parentType());
    }
}