package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.accounts.pos.PosInvoiceItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PosInvoiceItemDto(
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
        String itemTaxRate,
        BigDecimal actualBatchQty,
        BigDecimal actualQty,
        String serialNo,
        String batchNo,
        String salesOrder,
        String soDetail,
        String posInvoiceItem,
        String deliveryNote,
        String dnDetail,
        BigDecimal deliveredQty,
        String costCenter,
        String project,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static PosInvoiceItemDto fromEntity(PosInvoiceItemDao ePosInvoiceItemDao) {
        return new PosInvoiceItemDto(
                ePosInvoiceItemDao.getName(),
                ePosInvoiceItemDao.getCreation(),
                ePosInvoiceItemDao.getModified(),
                ePosInvoiceItemDao.getModifiedBy(),
                ePosInvoiceItemDao.getOwner(),
                ePosInvoiceItemDao.getIsDocStatus(),
                ePosInvoiceItemDao.getIdx(),
                ePosInvoiceItemDao.getBarcode(),
                ePosInvoiceItemDao.getHasItemScanned(),
                ePosInvoiceItemDao.getItemCode(),
                ePosInvoiceItemDao.getItemName(),
                ePosInvoiceItemDao.getCustomerItemCode(),
                ePosInvoiceItemDao.getDescription(),
                ePosInvoiceItemDao.getItemGroup(),
                ePosInvoiceItemDao.getBrand(),
                ePosInvoiceItemDao.getImage(),
                ePosInvoiceItemDao.getQty(),
                ePosInvoiceItemDao.getStockUom(),
                ePosInvoiceItemDao.getUom(),
                ePosInvoiceItemDao.getConversionFactor(),
                ePosInvoiceItemDao.getStockQty(),
                ePosInvoiceItemDao.getPriceListRate(),
                ePosInvoiceItemDao.getBasePriceListRate(),
                ePosInvoiceItemDao.getMarginType(),
                ePosInvoiceItemDao.getMarginRateOrAmount(),
                ePosInvoiceItemDao.getRateWithMargin(),
                ePosInvoiceItemDao.getDiscountPercentage(),
                ePosInvoiceItemDao.getDiscountAmount(),
                ePosInvoiceItemDao.getBaseRateWithMargin(),
                ePosInvoiceItemDao.getRate(),
                ePosInvoiceItemDao.getAmount(),
                ePosInvoiceItemDao.getItemTaxTemplate(),
                ePosInvoiceItemDao.getBaseRate(),
                ePosInvoiceItemDao.getBaseAmount(),
                ePosInvoiceItemDao.getPricingRules(),
                ePosInvoiceItemDao.getIsFreeItem(),
                ePosInvoiceItemDao.getGrantCommission(),
                ePosInvoiceItemDao.getNetRate(),
                ePosInvoiceItemDao.getNetAmount(),
                ePosInvoiceItemDao.getBaseNetRate(),
                ePosInvoiceItemDao.getBaseNetAmount(),
                ePosInvoiceItemDao.getDeliveredBySupplier(),
                ePosInvoiceItemDao.getIncomeAccount(),
                ePosInvoiceItemDao.getIsFixedAsset(),
                ePosInvoiceItemDao.getAsset(),
                ePosInvoiceItemDao.getFinanceBook(),
                ePosInvoiceItemDao.getExpenseAccount(),
                ePosInvoiceItemDao.getDeferredRevenueAccount(),
                ePosInvoiceItemDao.getServiceStopDate(),
                ePosInvoiceItemDao.getEnableDeferredRevenue(),
                ePosInvoiceItemDao.getServiceStartDate(),
                ePosInvoiceItemDao.getServiceEndDate(),
                ePosInvoiceItemDao.getWeightPerUnit(),
                ePosInvoiceItemDao.getTotalWeight(),
                ePosInvoiceItemDao.getWeightUom(),
                ePosInvoiceItemDao.getWarehouse(),
                ePosInvoiceItemDao.getTargetWarehouse(),
                ePosInvoiceItemDao.getQualityInspection(),
                ePosInvoiceItemDao.getSerialAndBatchBundle(),
                ePosInvoiceItemDao.getUseSerialBatchFields(),
                ePosInvoiceItemDao.getAllowZeroValuationRate(),
                ePosInvoiceItemDao.getItemTaxRate(),
                ePosInvoiceItemDao.getActualBatchQty(),
                ePosInvoiceItemDao.getActualQty(),
                ePosInvoiceItemDao.getSerialNo(),
                ePosInvoiceItemDao.getBatchNo(),
                ePosInvoiceItemDao.getSalesOrder(),
                ePosInvoiceItemDao.getSoDetail(),
                ePosInvoiceItemDao.getPosInvoiceItem(),
                ePosInvoiceItemDao.getDeliveryNote(),
                ePosInvoiceItemDao.getDnDetail(),
                ePosInvoiceItemDao.getDeliveredQty(),
                ePosInvoiceItemDao.getCostCenter(),
                ePosInvoiceItemDao.getProject(),
                ePosInvoiceItemDao.getPageBreak(),
                ePosInvoiceItemDao.getParent(),
                ePosInvoiceItemDao.getParentField(),
                ePosInvoiceItemDao.getParentType());
    }

    public static void fromDTO(PosInvoiceItemDto vPosInvoiceItemDto, PosInvoiceItemDao ePosInvoiceItemDao) {
        ePosInvoiceItemDao.setName(vPosInvoiceItemDto.name());
        ePosInvoiceItemDao.setCreation(vPosInvoiceItemDto.creation());
        ePosInvoiceItemDao.setModified(vPosInvoiceItemDto.modified());
        ePosInvoiceItemDao.setModifiedBy(vPosInvoiceItemDto.modifiedBy());
        ePosInvoiceItemDao.setOwner(vPosInvoiceItemDto.owner());
        ePosInvoiceItemDao.setIsDocStatus(vPosInvoiceItemDto.isDocStatus());
        ePosInvoiceItemDao.setIdx(vPosInvoiceItemDto.idx());
        ePosInvoiceItemDao.setBarcode(vPosInvoiceItemDto.barcode());
        ePosInvoiceItemDao.setHasItemScanned(vPosInvoiceItemDto.hasItemScanned());
        ePosInvoiceItemDao.setItemCode(vPosInvoiceItemDto.itemCode());
        ePosInvoiceItemDao.setItemName(vPosInvoiceItemDto.itemName());
        ePosInvoiceItemDao.setCustomerItemCode(vPosInvoiceItemDto.customerItemCode());
        ePosInvoiceItemDao.setDescription(vPosInvoiceItemDto.description());
        ePosInvoiceItemDao.setItemGroup(vPosInvoiceItemDto.itemGroup());
        ePosInvoiceItemDao.setBrand(vPosInvoiceItemDto.brand());
        ePosInvoiceItemDao.setImage(vPosInvoiceItemDto.image());
        ePosInvoiceItemDao.setQty(vPosInvoiceItemDto.qty());
        ePosInvoiceItemDao.setStockUom(vPosInvoiceItemDto.stockUom());
        ePosInvoiceItemDao.setUom(vPosInvoiceItemDto.uom());
        ePosInvoiceItemDao.setConversionFactor(vPosInvoiceItemDto.conversionFactor());
        ePosInvoiceItemDao.setStockQty(vPosInvoiceItemDto.stockQty());
        ePosInvoiceItemDao.setPriceListRate(vPosInvoiceItemDto.priceListRate());
        ePosInvoiceItemDao.setBasePriceListRate(vPosInvoiceItemDto.basePriceListRate());
        ePosInvoiceItemDao.setMarginType(vPosInvoiceItemDto.marginType());
        ePosInvoiceItemDao.setMarginRateOrAmount(vPosInvoiceItemDto.marginRateOrAmount());
        ePosInvoiceItemDao.setRateWithMargin(vPosInvoiceItemDto.rateWithMargin());
        ePosInvoiceItemDao.setDiscountPercentage(vPosInvoiceItemDto.discountPercentage());
        ePosInvoiceItemDao.setDiscountAmount(vPosInvoiceItemDto.discountAmount());
        ePosInvoiceItemDao.setBaseRateWithMargin(vPosInvoiceItemDto.baseRateWithMargin());
        ePosInvoiceItemDao.setRate(vPosInvoiceItemDto.rate());
        ePosInvoiceItemDao.setAmount(vPosInvoiceItemDto.amount());
        ePosInvoiceItemDao.setItemTaxTemplate(vPosInvoiceItemDto.itemTaxTemplate());
        ePosInvoiceItemDao.setBaseRate(vPosInvoiceItemDto.baseRate());
        ePosInvoiceItemDao.setBaseAmount(vPosInvoiceItemDto.baseAmount());
        ePosInvoiceItemDao.setPricingRules(vPosInvoiceItemDto.pricingRules());
        ePosInvoiceItemDao.setIsFreeItem(vPosInvoiceItemDto.isFreeItem());
        ePosInvoiceItemDao.setGrantCommission(vPosInvoiceItemDto.grantCommission());
        ePosInvoiceItemDao.setNetRate(vPosInvoiceItemDto.netRate());
        ePosInvoiceItemDao.setNetAmount(vPosInvoiceItemDto.netAmount());
        ePosInvoiceItemDao.setBaseNetRate(vPosInvoiceItemDto.baseNetRate());
        ePosInvoiceItemDao.setBaseNetAmount(vPosInvoiceItemDto.baseNetAmount());
        ePosInvoiceItemDao.setDeliveredBySupplier(vPosInvoiceItemDto.deliveredBySupplier());
        ePosInvoiceItemDao.setIncomeAccount(vPosInvoiceItemDto.incomeAccount());
        ePosInvoiceItemDao.setIsFixedAsset(vPosInvoiceItemDto.isFixedAsset());
        ePosInvoiceItemDao.setAsset(vPosInvoiceItemDto.asset());
        ePosInvoiceItemDao.setFinanceBook(vPosInvoiceItemDto.financeBook());
        ePosInvoiceItemDao.setExpenseAccount(vPosInvoiceItemDto.expenseAccount());
        ePosInvoiceItemDao.setDeferredRevenueAccount(vPosInvoiceItemDto.deferredRevenueAccount());
        ePosInvoiceItemDao.setServiceStopDate(vPosInvoiceItemDto.serviceStopDate());
        ePosInvoiceItemDao.setEnableDeferredRevenue(vPosInvoiceItemDto.enableDeferredRevenue());
        ePosInvoiceItemDao.setServiceStartDate(vPosInvoiceItemDto.serviceStartDate());
        ePosInvoiceItemDao.setServiceEndDate(vPosInvoiceItemDto.serviceEndDate());
        ePosInvoiceItemDao.setWeightPerUnit(vPosInvoiceItemDto.weightPerUnit());
        ePosInvoiceItemDao.setTotalWeight(vPosInvoiceItemDto.totalWeight());
        ePosInvoiceItemDao.setWeightUom(vPosInvoiceItemDto.weightUom());
        ePosInvoiceItemDao.setWarehouse(vPosInvoiceItemDto.warehouse());
        ePosInvoiceItemDao.setTargetWarehouse(vPosInvoiceItemDto.targetWarehouse());
        ePosInvoiceItemDao.setQualityInspection(vPosInvoiceItemDto.qualityInspection());
        ePosInvoiceItemDao.setSerialAndBatchBundle(vPosInvoiceItemDto.serialAndBatchBundle());
        ePosInvoiceItemDao.setUseSerialBatchFields(vPosInvoiceItemDto.useSerialBatchFields());
        ePosInvoiceItemDao.setAllowZeroValuationRate(vPosInvoiceItemDto.allowZeroValuationRate());
        ePosInvoiceItemDao.setItemTaxRate(vPosInvoiceItemDto.itemTaxRate());
        ePosInvoiceItemDao.setActualBatchQty(vPosInvoiceItemDto.actualBatchQty());
        ePosInvoiceItemDao.setActualQty(vPosInvoiceItemDto.actualQty());
        ePosInvoiceItemDao.setSerialNo(vPosInvoiceItemDto.serialNo());
        ePosInvoiceItemDao.setBatchNo(vPosInvoiceItemDto.batchNo());
        ePosInvoiceItemDao.setSalesOrder(vPosInvoiceItemDto.salesOrder());
        ePosInvoiceItemDao.setSoDetail(vPosInvoiceItemDto.soDetail());
        ePosInvoiceItemDao.setPosInvoiceItem(vPosInvoiceItemDto.posInvoiceItem());
        ePosInvoiceItemDao.setDeliveryNote(vPosInvoiceItemDto.deliveryNote());
        ePosInvoiceItemDao.setDnDetail(vPosInvoiceItemDto.dnDetail());
        ePosInvoiceItemDao.setDeliveredQty(vPosInvoiceItemDto.deliveredQty());
        ePosInvoiceItemDao.setCostCenter(vPosInvoiceItemDto.costCenter());
        ePosInvoiceItemDao.setProject(vPosInvoiceItemDto.project());
        ePosInvoiceItemDao.setPageBreak(vPosInvoiceItemDto.pageBreak());
        ePosInvoiceItemDao.setParent(vPosInvoiceItemDto.parent());
        ePosInvoiceItemDao.setParentField(vPosInvoiceItemDto.parentField());
        ePosInvoiceItemDao.setParentType(vPosInvoiceItemDto.parentType());
    }
}