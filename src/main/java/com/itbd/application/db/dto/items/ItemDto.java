package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String itemCode,
        String itemName,
        String itemGroup,
        String stockUom,
        Boolean disabled,
        Boolean allowAlternativeItem,
        Boolean isStockItem,
        Boolean hasVariants,
        BigDecimal openingStock,
        BigDecimal valuationRate,
        BigDecimal standardRate,
        Boolean isFixedAsset,
        Boolean autoCreateAssets,
        Boolean isGroupedAsset,
        String assetCategory,
        String assetNamingSeries,
        BigDecimal overDeliveryReceiptAllowance,
        BigDecimal overBillingAllowance,
        String image,
        String description,
        String brand,
        Integer shelfLifeInDays,
        LocalDate endOfLife,
        String defaultMaterialRequestType,
        String valuationMethod,
        String warrantyPeriod,
        BigDecimal weightPerUnit,
        String weightUom,
        Boolean allowNegativeStock,
        Boolean hasBatchNo,
        Boolean createNewBatch,
        String batchNumberSeries,
        Boolean hasExpiryDate,
        Boolean retainSample,
        Integer sampleQuantity,
        Boolean hasSerialNo,
        String serialNoSeries,
        String variantOf,
        String variantBasedOn,
        Boolean enableDeferredExpense,
        Integer noOfMonthsExp,
        Boolean enableDeferredRevenue,
        Integer noOfMonths,
        String purchaseUom,
        BigDecimal minOrderQty,
        BigDecimal safetyStock,
        Boolean isPurchaseItem,
        Integer leadTimeDays,
        BigDecimal lastPurchaseRate,
        Boolean isCustomerProvidedItem,
        String customer,
        Boolean deliveredBySupplier,
        String countryOfOrigin,
        String customsTariffNumber,
        String salesUom,
        Boolean grantCommission,
        Boolean isSalesItem,
        BigDecimal maxDiscount,
        Boolean inspectionRequiredBeforePurchase,
        String qualityInspectionTemplate,
        Boolean inspectionRequiredBeforeDelivery,
        Boolean includeItemInManufacturing,
        Boolean isSubContractedItem,
        String defaultBom,
        String customerCode,
        String defaultItemManufacturer,
        String defaultManufacturerPartNo,
        BigDecimal totalProjectedQty,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemDto fromEntity(ItemDao eItemDao) {
        return new ItemDto(
                eItemDao.getName(),
                eItemDao.getCreation(),
                eItemDao.getModified(),
                eItemDao.getModifiedBy(),
                eItemDao.getOwner(),
                eItemDao.getIsDocStatus(),
                eItemDao.getIdx(),
                eItemDao.getNamingSeries(),
                eItemDao.getItemCode(),
                eItemDao.getItemName(),
                eItemDao.getItemGroup(),
                eItemDao.getStockUom(),
                eItemDao.getDisabled(),
                eItemDao.getAllowAlternativeItem(),
                eItemDao.getIsStockItem(),
                eItemDao.getHasVariants(),
                eItemDao.getOpeningStock(),
                eItemDao.getValuationRate(),
                eItemDao.getStandardRate(),
                eItemDao.getIsFixedAsset(),
                eItemDao.getAutoCreateAssets(),
                eItemDao.getIsGroupedAsset(),
                eItemDao.getAssetCategory(),
                eItemDao.getAssetNamingSeries(),
                eItemDao.getOverDeliveryReceiptAllowance(),
                eItemDao.getOverBillingAllowance(),
                eItemDao.getImage(),
                eItemDao.getDescription(),
                eItemDao.getBrand(),
                eItemDao.getShelfLifeInDays(),
                eItemDao.getEndOfLife(),
                eItemDao.getDefaultMaterialRequestType(),
                eItemDao.getValuationMethod(),
                eItemDao.getWarrantyPeriod(),
                eItemDao.getWeightPerUnit(),
                eItemDao.getWeightUom(),
                eItemDao.getAllowNegativeStock(),
                eItemDao.getHasBatchNo(),
                eItemDao.getCreateNewBatch(),
                eItemDao.getBatchNumberSeries(),
                eItemDao.getHasExpiryDate(),
                eItemDao.getRetainSample(),
                eItemDao.getSampleQuantity(),
                eItemDao.getHasSerialNo(),
                eItemDao.getSerialNoSeries(),
                eItemDao.getVariantOf(),
                eItemDao.getVariantBasedOn(),
                eItemDao.getEnableDeferredExpense(),
                eItemDao.getNoOfMonthsExp(),
                eItemDao.getEnableDeferredRevenue(),
                eItemDao.getNoOfMonths(),
                eItemDao.getPurchaseUom(),
                eItemDao.getMinOrderQty(),
                eItemDao.getSafetyStock(),
                eItemDao.getIsPurchaseItem(),
                eItemDao.getLeadTimeDays(),
                eItemDao.getLastPurchaseRate(),
                eItemDao.getIsCustomerProvidedItem(),
                eItemDao.getCustomer(),
                eItemDao.getDeliveredBySupplier(),
                eItemDao.getCountryOfOrigin(),
                eItemDao.getCustomsTariffNumber(),
                eItemDao.getSalesUom(),
                eItemDao.getGrantCommission(),
                eItemDao.getIsSalesItem(),
                eItemDao.getMaxDiscount(),
                eItemDao.getInspectionRequiredBeforePurchase(),
                eItemDao.getQualityInspectionTemplate(),
                eItemDao.getInspectionRequiredBeforeDelivery(),
                eItemDao.getIncludeItemInManufacturing(),
                eItemDao.getIsSubContractedItem(),
                eItemDao.getDefaultBom(),
                eItemDao.getCustomerCode(),
                eItemDao.getDefaultItemManufacturer(),
                eItemDao.getDefaultManufacturerPartNo(),
                eItemDao.getTotalProjectedQty(),
                eItemDao.getUserTags(),
                eItemDao.getComments(),
                eItemDao.getAssign(),
                eItemDao.getLikedBy());
    }

    public static void fromDTO(ItemDto vItemDto, ItemDao eItemDao) {
        eItemDao.setName(vItemDto.name() != null ? vItemDto.name() : (vItemDto.itemGroup()+"_"+vItemDto.itemCode()  +"_"+vItemDto.salesUom()) .toLowerCase().replaceAll("\\s","_"));
        eItemDao.setCreation(vItemDto.creation());
        eItemDao.setModified(vItemDto.modified());
        eItemDao.setModifiedBy(vItemDto.modifiedBy());
        eItemDao.setOwner(vItemDto.owner());
        eItemDao.setIsDocStatus(vItemDto.isDocStatus());
        eItemDao.setIdx(vItemDto.idx());
        eItemDao.setNamingSeries(vItemDto.namingSeries());
        eItemDao.setItemCode(vItemDto.itemCode());
        eItemDao.setItemName(vItemDto.itemName());
        eItemDao.setItemGroup(vItemDto.itemGroup());
        eItemDao.setStockUom(vItemDto.stockUom());
        eItemDao.setDisabled(vItemDto.disabled());
        eItemDao.setAllowAlternativeItem(vItemDto.allowAlternativeItem());
        eItemDao.setIsStockItem(vItemDto.isStockItem());
        eItemDao.setHasVariants(vItemDto.hasVariants());
        eItemDao.setOpeningStock(vItemDto.openingStock());
        eItemDao.setValuationRate(vItemDto.valuationRate());
        eItemDao.setStandardRate(vItemDto.standardRate());
        eItemDao.setIsFixedAsset(vItemDto.isFixedAsset());
        eItemDao.setAutoCreateAssets(vItemDto.autoCreateAssets());
        eItemDao.setIsGroupedAsset(vItemDto.isGroupedAsset());
        eItemDao.setAssetCategory(vItemDto.assetCategory());
        eItemDao.setAssetNamingSeries(vItemDto.assetNamingSeries());
        eItemDao.setOverDeliveryReceiptAllowance(vItemDto.overDeliveryReceiptAllowance());
        eItemDao.setOverBillingAllowance(vItemDto.overBillingAllowance());
        eItemDao.setImage(vItemDto.image());
        eItemDao.setDescription(vItemDto.description());
        eItemDao.setBrand(vItemDto.brand());
        eItemDao.setShelfLifeInDays(vItemDto.shelfLifeInDays());
        eItemDao.setEndOfLife(vItemDto.endOfLife());
        eItemDao.setDefaultMaterialRequestType(vItemDto.defaultMaterialRequestType());
        eItemDao.setValuationMethod(vItemDto.valuationMethod());
        eItemDao.setWarrantyPeriod(vItemDto.warrantyPeriod());
        eItemDao.setWeightPerUnit(vItemDto.weightPerUnit());
        eItemDao.setWeightUom(vItemDto.weightUom());
        eItemDao.setAllowNegativeStock(vItemDto.allowNegativeStock());
        eItemDao.setHasBatchNo(vItemDto.hasBatchNo());
        eItemDao.setCreateNewBatch(vItemDto.createNewBatch());
        eItemDao.setBatchNumberSeries(vItemDto.batchNumberSeries());
        eItemDao.setHasExpiryDate(vItemDto.hasExpiryDate());
        eItemDao.setRetainSample(vItemDto.retainSample());
        eItemDao.setSampleQuantity(vItemDto.sampleQuantity());
        eItemDao.setHasSerialNo(vItemDto.hasSerialNo());
        eItemDao.setSerialNoSeries(vItemDto.serialNoSeries());
        eItemDao.setVariantOf(vItemDto.variantOf());
        eItemDao.setVariantBasedOn(vItemDto.variantBasedOn());
        eItemDao.setEnableDeferredExpense(vItemDto.enableDeferredExpense());
        eItemDao.setNoOfMonthsExp(vItemDto.noOfMonthsExp());
        eItemDao.setEnableDeferredRevenue(vItemDto.enableDeferredRevenue());
        eItemDao.setNoOfMonths(vItemDto.noOfMonths());
        eItemDao.setPurchaseUom(vItemDto.purchaseUom());
        eItemDao.setMinOrderQty(vItemDto.minOrderQty());
        eItemDao.setSafetyStock(vItemDto.safetyStock());
        eItemDao.setIsPurchaseItem(vItemDto.isPurchaseItem());
        eItemDao.setLeadTimeDays(vItemDto.leadTimeDays());
        eItemDao.setLastPurchaseRate(vItemDto.lastPurchaseRate());
        eItemDao.setIsCustomerProvidedItem(vItemDto.isCustomerProvidedItem());
        eItemDao.setCustomer(vItemDto.customer());
        eItemDao.setDeliveredBySupplier(vItemDto.deliveredBySupplier());
        eItemDao.setCountryOfOrigin(vItemDto.countryOfOrigin());
        eItemDao.setCustomsTariffNumber(vItemDto.customsTariffNumber());
        eItemDao.setSalesUom(vItemDto.salesUom());
        eItemDao.setGrantCommission(vItemDto.grantCommission());
        eItemDao.setIsSalesItem(vItemDto.isSalesItem());
        eItemDao.setMaxDiscount(vItemDto.maxDiscount());
        eItemDao.setInspectionRequiredBeforePurchase(vItemDto.inspectionRequiredBeforePurchase());
        eItemDao.setQualityInspectionTemplate(vItemDto.qualityInspectionTemplate());
        eItemDao.setInspectionRequiredBeforeDelivery(vItemDto.inspectionRequiredBeforeDelivery());
        eItemDao.setIncludeItemInManufacturing(vItemDto.includeItemInManufacturing());
        eItemDao.setIsSubContractedItem(vItemDto.isSubContractedItem());
        eItemDao.setDefaultBom(vItemDto.defaultBom());
        eItemDao.setCustomerCode(vItemDto.customerCode());
        eItemDao.setDefaultItemManufacturer(vItemDto.defaultItemManufacturer());
        eItemDao.setDefaultManufacturerPartNo(vItemDto.defaultManufacturerPartNo());
        eItemDao.setTotalProjectedQty(vItemDto.totalProjectedQty());
        eItemDao.setUserTags(vItemDto.userTags());
        eItemDao.setComments(vItemDto.comments());
        eItemDao.setAssign(vItemDto.assign());
        eItemDao.setLikedBy(vItemDto.likedBy());
    }
}