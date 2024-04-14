package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesInvoiceItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SalesInvoiceItemDto(
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
        String itemName,
        String customerItemCode,
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
        Boolean deliveredBySupplier,
        String incomeAccount,
        Boolean isFixedAsset,
        String asset,
        String financeBook,
        String expenseAccount,
        String discountAccount,
        String deferredRevenueAccount,
        LocalDate serviceStopDate,
        Boolean enableDeferredRevenue,
        LocalDate serviceStartDate,
        LocalDate serviceEndDate,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String warehouse,
        String targetWarehouse,
        String qualityInspection,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        Boolean allowZeroValuationRate,
        BigDecimal incomingRate,
        String itemTaxRate,
        BigDecimal actualBatchQty,
        BigDecimal actualQty,
        String serialNo,
        String batchNo,
        String salesOrder,
        String soDetail,
        String salesInvoiceItem,
        String deliveryNote,
        String dnDetail,
        BigDecimal deliveredQty,
        String purchaseOrder,
        String purchaseOrderItem,
        String costCenter,
        String project,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesInvoiceItemDto fromEntity(SalesInvoiceItemDao eSalesInvoiceItemDao) {
        return new SalesInvoiceItemDto(
                eSalesInvoiceItemDao.getName(),
                eSalesInvoiceItemDao.getCreation(),
                eSalesInvoiceItemDao.getModified(),
                eSalesInvoiceItemDao.getModifiedBy(),
                eSalesInvoiceItemDao.getOwner(),
                eSalesInvoiceItemDao.getIsDocStatus(),
                eSalesInvoiceItemDao.getIdx(),
                eSalesInvoiceItemDao.getBarcode(),
                eSalesInvoiceItemDao.getHasItemScanned(),
                eSalesInvoiceItemDao.getItemCode(),
                eSalesInvoiceItemDao.getItemName(),
                eSalesInvoiceItemDao.getCustomerItemCode(),
                eSalesInvoiceItemDao.getDescription(),
                eSalesInvoiceItemDao.getItemGroup(),
                eSalesInvoiceItemDao.getBrand(),
                eSalesInvoiceItemDao.getImage(),
                eSalesInvoiceItemDao.getQty(),
                eSalesInvoiceItemDao.getStockUom(),
                eSalesInvoiceItemDao.getUom(),
                eSalesInvoiceItemDao.getConversionFactor(),
                eSalesInvoiceItemDao.getStockQty(),
                eSalesInvoiceItemDao.getPriceListRate(),
                eSalesInvoiceItemDao.getBasePriceListRate(),
                eSalesInvoiceItemDao.getMarginType(),
                eSalesInvoiceItemDao.getMarginRateOrAmount(),
                eSalesInvoiceItemDao.getRateWithMargin(),
                eSalesInvoiceItemDao.getDiscountPercentage(),
                eSalesInvoiceItemDao.getDiscountAmount(),
                eSalesInvoiceItemDao.getBaseRateWithMargin(),
                eSalesInvoiceItemDao.getRate(),
                eSalesInvoiceItemDao.getAmount(),
                eSalesInvoiceItemDao.getItemTaxTemplate(),
                eSalesInvoiceItemDao.getBaseRate(),
                eSalesInvoiceItemDao.getBaseAmount(),
                eSalesInvoiceItemDao.getPricingRules(),
                eSalesInvoiceItemDao.getStockUomRate(),
                eSalesInvoiceItemDao.getIsFreeItem(),
                eSalesInvoiceItemDao.getGrantCommission(),
                eSalesInvoiceItemDao.getNetRate(),
                eSalesInvoiceItemDao.getNetAmount(),
                eSalesInvoiceItemDao.getBaseNetRate(),
                eSalesInvoiceItemDao.getBaseNetAmount(),
                eSalesInvoiceItemDao.getDeliveredBySupplier(),
                eSalesInvoiceItemDao.getIncomeAccount(),
                eSalesInvoiceItemDao.getIsFixedAsset(),
                eSalesInvoiceItemDao.getAsset(),
                eSalesInvoiceItemDao.getFinanceBook(),
                eSalesInvoiceItemDao.getExpenseAccount(),
                eSalesInvoiceItemDao.getDiscountAccount(),
                eSalesInvoiceItemDao.getDeferredRevenueAccount(),
                eSalesInvoiceItemDao.getServiceStopDate(),
                eSalesInvoiceItemDao.getEnableDeferredRevenue(),
                eSalesInvoiceItemDao.getServiceStartDate(),
                eSalesInvoiceItemDao.getServiceEndDate(),
                eSalesInvoiceItemDao.getWeightPerUnit(),
                eSalesInvoiceItemDao.getTotalWeight(),
                eSalesInvoiceItemDao.getWeightUom(),
                eSalesInvoiceItemDao.getWarehouse(),
                eSalesInvoiceItemDao.getTargetWarehouse(),
                eSalesInvoiceItemDao.getQualityInspection(),
                eSalesInvoiceItemDao.getSerialAndBatchBundle(),
                eSalesInvoiceItemDao.getUseSerialBatchFields(),
                eSalesInvoiceItemDao.getAllowZeroValuationRate(),
                eSalesInvoiceItemDao.getIncomingRate(),
                eSalesInvoiceItemDao.getItemTaxRate(),
                eSalesInvoiceItemDao.getActualBatchQty(),
                eSalesInvoiceItemDao.getActualQty(),
                eSalesInvoiceItemDao.getSerialNo(),
                eSalesInvoiceItemDao.getBatchNo(),
                eSalesInvoiceItemDao.getSalesOrder(),
                eSalesInvoiceItemDao.getSoDetail(),
                eSalesInvoiceItemDao.getSalesInvoiceItem(),
                eSalesInvoiceItemDao.getDeliveryNote(),
                eSalesInvoiceItemDao.getDnDetail(),
                eSalesInvoiceItemDao.getDeliveredQty(),
                eSalesInvoiceItemDao.getPurchaseOrder(),
                eSalesInvoiceItemDao.getPurchaseOrderItem(),
                eSalesInvoiceItemDao.getCostCenter(),
                eSalesInvoiceItemDao.getProject(),
                eSalesInvoiceItemDao.getPageBreak(),
                eSalesInvoiceItemDao.getParent(),
                eSalesInvoiceItemDao.getParentField(),
                eSalesInvoiceItemDao.getParentType());
    }

    public static void fromDTO(SalesInvoiceItemDto vSalesInvoiceItemDto, SalesInvoiceItemDao eSalesInvoiceItemDao) {
        eSalesInvoiceItemDao.setName(vSalesInvoiceItemDto.name());
        eSalesInvoiceItemDao.setCreation(vSalesInvoiceItemDto.creation());
        eSalesInvoiceItemDao.setModified(vSalesInvoiceItemDto.modified());
        eSalesInvoiceItemDao.setModifiedBy(vSalesInvoiceItemDto.modifiedBy());
        eSalesInvoiceItemDao.setOwner(vSalesInvoiceItemDto.owner());
        eSalesInvoiceItemDao.setIsDocStatus(vSalesInvoiceItemDto.isDocStatus());
        eSalesInvoiceItemDao.setIdx(vSalesInvoiceItemDto.idx());
        eSalesInvoiceItemDao.setBarcode(vSalesInvoiceItemDto.barcode());
        eSalesInvoiceItemDao.setHasItemScanned(vSalesInvoiceItemDto.hasItemScanned());
        eSalesInvoiceItemDao.setItemCode(vSalesInvoiceItemDto.itemCode());
        eSalesInvoiceItemDao.setItemName(vSalesInvoiceItemDto.itemName());
        eSalesInvoiceItemDao.setCustomerItemCode(vSalesInvoiceItemDto.customerItemCode());
        eSalesInvoiceItemDao.setDescription(vSalesInvoiceItemDto.description());
        eSalesInvoiceItemDao.setItemGroup(vSalesInvoiceItemDto.itemGroup());
        eSalesInvoiceItemDao.setBrand(vSalesInvoiceItemDto.brand());
        eSalesInvoiceItemDao.setImage(vSalesInvoiceItemDto.image());
        eSalesInvoiceItemDao.setQty(vSalesInvoiceItemDto.qty());
        eSalesInvoiceItemDao.setStockUom(vSalesInvoiceItemDto.stockUom());
        eSalesInvoiceItemDao.setUom(vSalesInvoiceItemDto.uom());
        eSalesInvoiceItemDao.setConversionFactor(vSalesInvoiceItemDto.conversionFactor());
        eSalesInvoiceItemDao.setStockQty(vSalesInvoiceItemDto.stockQty());
        eSalesInvoiceItemDao.setPriceListRate(vSalesInvoiceItemDto.priceListRate());
        eSalesInvoiceItemDao.setBasePriceListRate(vSalesInvoiceItemDto.basePriceListRate());
        eSalesInvoiceItemDao.setMarginType(vSalesInvoiceItemDto.marginType());
        eSalesInvoiceItemDao.setMarginRateOrAmount(vSalesInvoiceItemDto.marginRateOrAmount());
        eSalesInvoiceItemDao.setRateWithMargin(vSalesInvoiceItemDto.rateWithMargin());
        eSalesInvoiceItemDao.setDiscountPercentage(vSalesInvoiceItemDto.discountPercentage());
        eSalesInvoiceItemDao.setDiscountAmount(vSalesInvoiceItemDto.discountAmount());
        eSalesInvoiceItemDao.setBaseRateWithMargin(vSalesInvoiceItemDto.baseRateWithMargin());
        eSalesInvoiceItemDao.setRate(vSalesInvoiceItemDto.rate());
        eSalesInvoiceItemDao.setAmount(vSalesInvoiceItemDto.amount());
        eSalesInvoiceItemDao.setItemTaxTemplate(vSalesInvoiceItemDto.itemTaxTemplate());
        eSalesInvoiceItemDao.setBaseRate(vSalesInvoiceItemDto.baseRate());
        eSalesInvoiceItemDao.setBaseAmount(vSalesInvoiceItemDto.baseAmount());
        eSalesInvoiceItemDao.setPricingRules(vSalesInvoiceItemDto.pricingRules());
        eSalesInvoiceItemDao.setStockUomRate(vSalesInvoiceItemDto.stockUomRate());
        eSalesInvoiceItemDao.setIsFreeItem(vSalesInvoiceItemDto.isFreeItem());
        eSalesInvoiceItemDao.setGrantCommission(vSalesInvoiceItemDto.grantCommission());
        eSalesInvoiceItemDao.setNetRate(vSalesInvoiceItemDto.netRate());
        eSalesInvoiceItemDao.setNetAmount(vSalesInvoiceItemDto.netAmount());
        eSalesInvoiceItemDao.setBaseNetRate(vSalesInvoiceItemDto.baseNetRate());
        eSalesInvoiceItemDao.setBaseNetAmount(vSalesInvoiceItemDto.baseNetAmount());
        eSalesInvoiceItemDao.setDeliveredBySupplier(vSalesInvoiceItemDto.deliveredBySupplier());
        eSalesInvoiceItemDao.setIncomeAccount(vSalesInvoiceItemDto.incomeAccount());
        eSalesInvoiceItemDao.setIsFixedAsset(vSalesInvoiceItemDto.isFixedAsset());
        eSalesInvoiceItemDao.setAsset(vSalesInvoiceItemDto.asset());
        eSalesInvoiceItemDao.setFinanceBook(vSalesInvoiceItemDto.financeBook());
        eSalesInvoiceItemDao.setExpenseAccount(vSalesInvoiceItemDto.expenseAccount());
        eSalesInvoiceItemDao.setDiscountAccount(vSalesInvoiceItemDto.discountAccount());
        eSalesInvoiceItemDao.setDeferredRevenueAccount(vSalesInvoiceItemDto.deferredRevenueAccount());
        eSalesInvoiceItemDao.setServiceStopDate(vSalesInvoiceItemDto.serviceStopDate());
        eSalesInvoiceItemDao.setEnableDeferredRevenue(vSalesInvoiceItemDto.enableDeferredRevenue());
        eSalesInvoiceItemDao.setServiceStartDate(vSalesInvoiceItemDto.serviceStartDate());
        eSalesInvoiceItemDao.setServiceEndDate(vSalesInvoiceItemDto.serviceEndDate());
        eSalesInvoiceItemDao.setWeightPerUnit(vSalesInvoiceItemDto.weightPerUnit());
        eSalesInvoiceItemDao.setTotalWeight(vSalesInvoiceItemDto.totalWeight());
        eSalesInvoiceItemDao.setWeightUom(vSalesInvoiceItemDto.weightUom());
        eSalesInvoiceItemDao.setWarehouse(vSalesInvoiceItemDto.warehouse());
        eSalesInvoiceItemDao.setTargetWarehouse(vSalesInvoiceItemDto.targetWarehouse());
        eSalesInvoiceItemDao.setQualityInspection(vSalesInvoiceItemDto.qualityInspection());
        eSalesInvoiceItemDao.setSerialAndBatchBundle(vSalesInvoiceItemDto.serialAndBatchBundle());
        eSalesInvoiceItemDao.setUseSerialBatchFields(vSalesInvoiceItemDto.useSerialBatchFields());
        eSalesInvoiceItemDao.setAllowZeroValuationRate(vSalesInvoiceItemDto.allowZeroValuationRate());
        eSalesInvoiceItemDao.setIncomingRate(vSalesInvoiceItemDto.incomingRate());
        eSalesInvoiceItemDao.setItemTaxRate(vSalesInvoiceItemDto.itemTaxRate());
        eSalesInvoiceItemDao.setActualBatchQty(vSalesInvoiceItemDto.actualBatchQty());
        eSalesInvoiceItemDao.setActualQty(vSalesInvoiceItemDto.actualQty());
        eSalesInvoiceItemDao.setSerialNo(vSalesInvoiceItemDto.serialNo());
        eSalesInvoiceItemDao.setBatchNo(vSalesInvoiceItemDto.batchNo());
        eSalesInvoiceItemDao.setSalesOrder(vSalesInvoiceItemDto.salesOrder());
        eSalesInvoiceItemDao.setSoDetail(vSalesInvoiceItemDto.soDetail());
        eSalesInvoiceItemDao.setSalesInvoiceItem(vSalesInvoiceItemDto.salesInvoiceItem());
        eSalesInvoiceItemDao.setDeliveryNote(vSalesInvoiceItemDto.deliveryNote());
        eSalesInvoiceItemDao.setDnDetail(vSalesInvoiceItemDto.dnDetail());
        eSalesInvoiceItemDao.setDeliveredQty(vSalesInvoiceItemDto.deliveredQty());
        eSalesInvoiceItemDao.setPurchaseOrder(vSalesInvoiceItemDto.purchaseOrder());
        eSalesInvoiceItemDao.setPurchaseOrderItem(vSalesInvoiceItemDto.purchaseOrderItem());
        eSalesInvoiceItemDao.setCostCenter(vSalesInvoiceItemDto.costCenter());
        eSalesInvoiceItemDao.setProject(vSalesInvoiceItemDto.project());
        eSalesInvoiceItemDao.setPageBreak(vSalesInvoiceItemDto.pageBreak());
        eSalesInvoiceItemDao.setParent(vSalesInvoiceItemDto.parent());
        eSalesInvoiceItemDao.setParentField(vSalesInvoiceItemDto.parentField());
        eSalesInvoiceItemDao.setParentType(vSalesInvoiceItemDto.parentType());
    }
}