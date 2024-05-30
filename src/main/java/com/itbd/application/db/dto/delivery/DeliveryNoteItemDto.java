package com.itbd.application.db.dto.delivery;

import com.itbd.application.db.dao.stock.delivery.DeliveryNoteItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DeliveryNoteItemDto(
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
        String brand,
        String itemGroup,
        String image,
        BigDecimal qty,
        String stockUom,
        String uom,
        BigDecimal conversionFactor,
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
        Boolean grantCommission,
        BigDecimal netRate,
        BigDecimal netAmount,
        String itemTaxTemplate,
        BigDecimal baseNetRate,
        BigDecimal baseNetAmount,
        BigDecimal billedAmt,
        BigDecimal incomingRate,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String warehouse,
        String targetWarehouse,
        String qualityInspection,
        Boolean allowZeroValuationRate,
        String againstSalesOrder,
        String soDetail,
        String againstSalesInvoice,
        String siDetail,
        String dnDetail,
        String pickListItem,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String serialNo,
        String batchNo,
        BigDecimal actualBatchQty,
        BigDecimal actualQty,
        BigDecimal installedQty,
        String itemTaxRate,
        BigDecimal packedQty,
        BigDecimal receivedQty,
        String expenseAccount,
        String materialRequest,
        String purchaseOrder,
        String purchaseOrderItem,
        String materialRequestItem,
        String costCenter,
        String project,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static DeliveryNoteItemDto fromEntity(DeliveryNoteItemDao eDeliveryNoteItemDao) {
        return new DeliveryNoteItemDto(
                eDeliveryNoteItemDao.getName(),
                eDeliveryNoteItemDao.getCreation(),
                eDeliveryNoteItemDao.getModified(),
                eDeliveryNoteItemDao.getModifiedBy(),
                eDeliveryNoteItemDao.getOwner(),
                eDeliveryNoteItemDao.getIsDocStatus(),
                eDeliveryNoteItemDao.getIdx(),
                eDeliveryNoteItemDao.getBarcode(),
                eDeliveryNoteItemDao.getHasItemScanned(),
                eDeliveryNoteItemDao.getItemCode(),
                eDeliveryNoteItemDao.getItemName(),
                eDeliveryNoteItemDao.getCustomerItemCode(),
                eDeliveryNoteItemDao.getDescription(),
                eDeliveryNoteItemDao.getBrand(),
                eDeliveryNoteItemDao.getItemGroup(),
                eDeliveryNoteItemDao.getImage(),
                eDeliveryNoteItemDao.getQty(),
                eDeliveryNoteItemDao.getStockUom(),
                eDeliveryNoteItemDao.getUom(),
                eDeliveryNoteItemDao.getConversionFactor(),
                eDeliveryNoteItemDao.getStockQty(),
                eDeliveryNoteItemDao.getReturnedQty(),
                eDeliveryNoteItemDao.getPriceListRate(),
                eDeliveryNoteItemDao.getBasePriceListRate(),
                eDeliveryNoteItemDao.getMarginType(),
                eDeliveryNoteItemDao.getMarginRateOrAmount(),
                eDeliveryNoteItemDao.getRateWithMargin(),
                eDeliveryNoteItemDao.getDiscountPercentage(),
                eDeliveryNoteItemDao.getDiscountAmount(),
                eDeliveryNoteItemDao.getBaseRateWithMargin(),
                eDeliveryNoteItemDao.getRate(),
                eDeliveryNoteItemDao.getAmount(),
                eDeliveryNoteItemDao.getBaseRate(),
                eDeliveryNoteItemDao.getBaseAmount(),
                eDeliveryNoteItemDao.getPricingRules(),
                eDeliveryNoteItemDao.getStockUomRate(),
                eDeliveryNoteItemDao.getIsFreeItem(),
                eDeliveryNoteItemDao.getGrantCommission(),
                eDeliveryNoteItemDao.getNetRate(),
                eDeliveryNoteItemDao.getNetAmount(),
                eDeliveryNoteItemDao.getItemTaxTemplate(),
                eDeliveryNoteItemDao.getBaseNetRate(),
                eDeliveryNoteItemDao.getBaseNetAmount(),
                eDeliveryNoteItemDao.getBilledAmt(),
                eDeliveryNoteItemDao.getIncomingRate(),
                eDeliveryNoteItemDao.getWeightPerUnit(),
                eDeliveryNoteItemDao.getTotalWeight(),
                eDeliveryNoteItemDao.getWeightUom(),
                eDeliveryNoteItemDao.getWarehouse(),
                eDeliveryNoteItemDao.getTargetWarehouse(),
                eDeliveryNoteItemDao.getQualityInspection(),
                eDeliveryNoteItemDao.getAllowZeroValuationRate(),
                eDeliveryNoteItemDao.getAgainstSalesOrder(),
                eDeliveryNoteItemDao.getSoDetail(),
                eDeliveryNoteItemDao.getAgainstSalesInvoice(),
                eDeliveryNoteItemDao.getSiDetail(),
                eDeliveryNoteItemDao.getDnDetail(),
                eDeliveryNoteItemDao.getPickListItem(),
                eDeliveryNoteItemDao.getSerialAndBatchBundle(),
                eDeliveryNoteItemDao.getUseSerialBatchFields(),
                eDeliveryNoteItemDao.getSerialNo(),
                eDeliveryNoteItemDao.getBatchNo(),
                eDeliveryNoteItemDao.getActualBatchQty(),
                eDeliveryNoteItemDao.getActualQty(),
                eDeliveryNoteItemDao.getInstalledQty(),
                eDeliveryNoteItemDao.getItemTaxRate(),
                eDeliveryNoteItemDao.getPackedQty(),
                eDeliveryNoteItemDao.getReceivedQty(),
                eDeliveryNoteItemDao.getExpenseAccount(),
                eDeliveryNoteItemDao.getMaterialRequest(),
                eDeliveryNoteItemDao.getPurchaseOrder(),
                eDeliveryNoteItemDao.getPurchaseOrderItem(),
                eDeliveryNoteItemDao.getMaterialRequestItem(),
                eDeliveryNoteItemDao.getCostCenter(),
                eDeliveryNoteItemDao.getProject(),
                eDeliveryNoteItemDao.getPageBreak(),
                eDeliveryNoteItemDao.getParent(),
                eDeliveryNoteItemDao.getParentField(),
                eDeliveryNoteItemDao.getParentType());
    }

    public static void fromDTO(DeliveryNoteItemDto vDeliveryNoteItemDto, DeliveryNoteItemDao eDeliveryNoteItemDao) {
        eDeliveryNoteItemDao.setName(vDeliveryNoteItemDto.name());
        eDeliveryNoteItemDao.setCreation(vDeliveryNoteItemDto.creation());
        eDeliveryNoteItemDao.setModified(vDeliveryNoteItemDto.modified());
        eDeliveryNoteItemDao.setModifiedBy(vDeliveryNoteItemDto.modifiedBy());
        eDeliveryNoteItemDao.setOwner(vDeliveryNoteItemDto.owner());
        eDeliveryNoteItemDao.setIsDocStatus(vDeliveryNoteItemDto.isDocStatus());
        eDeliveryNoteItemDao.setIdx(vDeliveryNoteItemDto.idx());
        eDeliveryNoteItemDao.setBarcode(vDeliveryNoteItemDto.barcode());
        eDeliveryNoteItemDao.setHasItemScanned(vDeliveryNoteItemDto.hasItemScanned());
        eDeliveryNoteItemDao.setItemCode(vDeliveryNoteItemDto.itemCode());
        eDeliveryNoteItemDao.setItemName(vDeliveryNoteItemDto.itemName());
        eDeliveryNoteItemDao.setCustomerItemCode(vDeliveryNoteItemDto.customerItemCode());
        eDeliveryNoteItemDao.setDescription(vDeliveryNoteItemDto.description());
        eDeliveryNoteItemDao.setBrand(vDeliveryNoteItemDto.brand());
        eDeliveryNoteItemDao.setItemGroup(vDeliveryNoteItemDto.itemGroup());
        eDeliveryNoteItemDao.setImage(vDeliveryNoteItemDto.image());
        eDeliveryNoteItemDao.setQty(vDeliveryNoteItemDto.qty());
        eDeliveryNoteItemDao.setStockUom(vDeliveryNoteItemDto.stockUom());
        eDeliveryNoteItemDao.setUom(vDeliveryNoteItemDto.uom());
        eDeliveryNoteItemDao.setConversionFactor(vDeliveryNoteItemDto.conversionFactor());
        eDeliveryNoteItemDao.setStockQty(vDeliveryNoteItemDto.stockQty());
        eDeliveryNoteItemDao.setReturnedQty(vDeliveryNoteItemDto.returnedQty());
        eDeliveryNoteItemDao.setPriceListRate(vDeliveryNoteItemDto.priceListRate());
        eDeliveryNoteItemDao.setBasePriceListRate(vDeliveryNoteItemDto.basePriceListRate());
        eDeliveryNoteItemDao.setMarginType(vDeliveryNoteItemDto.marginType());
        eDeliveryNoteItemDao.setMarginRateOrAmount(vDeliveryNoteItemDto.marginRateOrAmount());
        eDeliveryNoteItemDao.setRateWithMargin(vDeliveryNoteItemDto.rateWithMargin());
        eDeliveryNoteItemDao.setDiscountPercentage(vDeliveryNoteItemDto.discountPercentage());
        eDeliveryNoteItemDao.setDiscountAmount(vDeliveryNoteItemDto.discountAmount());
        eDeliveryNoteItemDao.setBaseRateWithMargin(vDeliveryNoteItemDto.baseRateWithMargin());
        eDeliveryNoteItemDao.setRate(vDeliveryNoteItemDto.rate());
        eDeliveryNoteItemDao.setAmount(vDeliveryNoteItemDto.amount());
        eDeliveryNoteItemDao.setBaseRate(vDeliveryNoteItemDto.baseRate());
        eDeliveryNoteItemDao.setBaseAmount(vDeliveryNoteItemDto.baseAmount());
        eDeliveryNoteItemDao.setPricingRules(vDeliveryNoteItemDto.pricingRules());
        eDeliveryNoteItemDao.setStockUomRate(vDeliveryNoteItemDto.stockUomRate());
        eDeliveryNoteItemDao.setIsFreeItem(vDeliveryNoteItemDto.isFreeItem());
        eDeliveryNoteItemDao.setGrantCommission(vDeliveryNoteItemDto.grantCommission());
        eDeliveryNoteItemDao.setNetRate(vDeliveryNoteItemDto.netRate());
        eDeliveryNoteItemDao.setNetAmount(vDeliveryNoteItemDto.netAmount());
        eDeliveryNoteItemDao.setItemTaxTemplate(vDeliveryNoteItemDto.itemTaxTemplate());
        eDeliveryNoteItemDao.setBaseNetRate(vDeliveryNoteItemDto.baseNetRate());
        eDeliveryNoteItemDao.setBaseNetAmount(vDeliveryNoteItemDto.baseNetAmount());
        eDeliveryNoteItemDao.setBilledAmt(vDeliveryNoteItemDto.billedAmt());
        eDeliveryNoteItemDao.setIncomingRate(vDeliveryNoteItemDto.incomingRate());
        eDeliveryNoteItemDao.setWeightPerUnit(vDeliveryNoteItemDto.weightPerUnit());
        eDeliveryNoteItemDao.setTotalWeight(vDeliveryNoteItemDto.totalWeight());
        eDeliveryNoteItemDao.setWeightUom(vDeliveryNoteItemDto.weightUom());
        eDeliveryNoteItemDao.setWarehouse(vDeliveryNoteItemDto.warehouse());
        eDeliveryNoteItemDao.setTargetWarehouse(vDeliveryNoteItemDto.targetWarehouse());
        eDeliveryNoteItemDao.setQualityInspection(vDeliveryNoteItemDto.qualityInspection());
        eDeliveryNoteItemDao.setAllowZeroValuationRate(vDeliveryNoteItemDto.allowZeroValuationRate());
        eDeliveryNoteItemDao.setAgainstSalesOrder(vDeliveryNoteItemDto.againstSalesOrder());
        eDeliveryNoteItemDao.setSoDetail(vDeliveryNoteItemDto.soDetail());
        eDeliveryNoteItemDao.setAgainstSalesInvoice(vDeliveryNoteItemDto.againstSalesInvoice());
        eDeliveryNoteItemDao.setSiDetail(vDeliveryNoteItemDto.siDetail());
        eDeliveryNoteItemDao.setDnDetail(vDeliveryNoteItemDto.dnDetail());
        eDeliveryNoteItemDao.setPickListItem(vDeliveryNoteItemDto.pickListItem());
        eDeliveryNoteItemDao.setSerialAndBatchBundle(vDeliveryNoteItemDto.serialAndBatchBundle());
        eDeliveryNoteItemDao.setUseSerialBatchFields(vDeliveryNoteItemDto.useSerialBatchFields());
        eDeliveryNoteItemDao.setSerialNo(vDeliveryNoteItemDto.serialNo());
        eDeliveryNoteItemDao.setBatchNo(vDeliveryNoteItemDto.batchNo());
        eDeliveryNoteItemDao.setActualBatchQty(vDeliveryNoteItemDto.actualBatchQty());
        eDeliveryNoteItemDao.setActualQty(vDeliveryNoteItemDto.actualQty());
        eDeliveryNoteItemDao.setInstalledQty(vDeliveryNoteItemDto.installedQty());
        eDeliveryNoteItemDao.setItemTaxRate(vDeliveryNoteItemDto.itemTaxRate());
        eDeliveryNoteItemDao.setPackedQty(vDeliveryNoteItemDto.packedQty());
        eDeliveryNoteItemDao.setReceivedQty(vDeliveryNoteItemDto.receivedQty());
        eDeliveryNoteItemDao.setExpenseAccount(vDeliveryNoteItemDto.expenseAccount());
        eDeliveryNoteItemDao.setMaterialRequest(vDeliveryNoteItemDto.materialRequest());
        eDeliveryNoteItemDao.setPurchaseOrder(vDeliveryNoteItemDto.purchaseOrder());
        eDeliveryNoteItemDao.setPurchaseOrderItem(vDeliveryNoteItemDto.purchaseOrderItem());
        eDeliveryNoteItemDao.setMaterialRequestItem(vDeliveryNoteItemDto.materialRequestItem());
        eDeliveryNoteItemDao.setCostCenter(vDeliveryNoteItemDto.costCenter());
        eDeliveryNoteItemDao.setProject(vDeliveryNoteItemDto.project());
        eDeliveryNoteItemDao.setPageBreak(vDeliveryNoteItemDto.pageBreak());
        eDeliveryNoteItemDao.setParent(vDeliveryNoteItemDto.parent());
        eDeliveryNoteItemDao.setParentField(vDeliveryNoteItemDto.parentField());
        eDeliveryNoteItemDao.setParentType(vDeliveryNoteItemDto.parentType());
    }
}