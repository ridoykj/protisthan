package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stocks.StockEntryDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record StockEntryDetailDto(
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
        String sWarehouse,
        String tWarehouse,
        String itemCode,
        String itemName,
        Boolean isFinishedItem,
        Boolean isScrapItem,
        String qualityInspection,
        String subcontractedItem,
        String description,
        String itemGroup,
        String image,
        BigDecimal qty,
        BigDecimal transferQty,
        Boolean retainSample,
        String uom,
        String stockUom,
        BigDecimal conversionFactor,
        Integer sampleQuantity,
        BigDecimal basicRate,
        BigDecimal additionalCost,
        BigDecimal valuationRate,
        Boolean allowZeroValuationRate,
        Boolean setBasicRateManually,
        BigDecimal basicAmount,
        BigDecimal amount,
        Boolean useSerialBatchFields,
        String serialAndBatchBundle,
        String serialNo,
        String batchNo,
        String expenseAccount,
        String costCenter,
        String project,
        BigDecimal actualQty,
        BigDecimal transferredQty,
        String bomNo,
        Boolean allowAlternativeItem,
        String materialRequest,
        String materialRequestItem,
        String originalItem,
        String againstStockEntry,
        String steDetail,
        String poDetail,
        String scoRmDetail,
        String putawayRule,
        String referencePurchaseReceipt,
        String jobCardItem,
        String parent,
        String parentField,
        String parentType
) {
    public static StockEntryDetailDto fromEntity(StockEntryDetailDao eStockEntryDetailDao) {
        return new StockEntryDetailDto(
                eStockEntryDetailDao.getName(),
                eStockEntryDetailDao.getCreation(),
                eStockEntryDetailDao.getModified(),
                eStockEntryDetailDao.getModifiedBy(),
                eStockEntryDetailDao.getOwner(),
                eStockEntryDetailDao.getIsDocStatus(),
                eStockEntryDetailDao.getIdx(),
                eStockEntryDetailDao.getBarcode(),
                eStockEntryDetailDao.getHasItemScanned(),
                eStockEntryDetailDao.getSWarehouse(),
                eStockEntryDetailDao.getTWarehouse(),
                eStockEntryDetailDao.getItemCode(),
                eStockEntryDetailDao.getItemName(),
                eStockEntryDetailDao.getIsFinishedItem(),
                eStockEntryDetailDao.getIsScrapItem(),
                eStockEntryDetailDao.getQualityInspection(),
                eStockEntryDetailDao.getSubcontractedItem(),
                eStockEntryDetailDao.getDescription(),
                eStockEntryDetailDao.getItemGroup(),
                eStockEntryDetailDao.getImage(),
                eStockEntryDetailDao.getQty(),
                eStockEntryDetailDao.getTransferQty(),
                eStockEntryDetailDao.getRetainSample(),
                eStockEntryDetailDao.getUom(),
                eStockEntryDetailDao.getStockUom(),
                eStockEntryDetailDao.getConversionFactor(),
                eStockEntryDetailDao.getSampleQuantity(),
                eStockEntryDetailDao.getBasicRate(),
                eStockEntryDetailDao.getAdditionalCost(),
                eStockEntryDetailDao.getValuationRate(),
                eStockEntryDetailDao.getAllowZeroValuationRate(),
                eStockEntryDetailDao.getSetBasicRateManually(),
                eStockEntryDetailDao.getBasicAmount(),
                eStockEntryDetailDao.getAmount(),
                eStockEntryDetailDao.getUseSerialBatchFields(),
                eStockEntryDetailDao.getSerialAndBatchBundle(),
                eStockEntryDetailDao.getSerialNo(),
                eStockEntryDetailDao.getBatchNo(),
                eStockEntryDetailDao.getExpenseAccount(),
                eStockEntryDetailDao.getCostCenter(),
                eStockEntryDetailDao.getProject(),
                eStockEntryDetailDao.getActualQty(),
                eStockEntryDetailDao.getTransferredQty(),
                eStockEntryDetailDao.getBomNo(),
                eStockEntryDetailDao.getAllowAlternativeItem(),
                eStockEntryDetailDao.getMaterialRequest(),
                eStockEntryDetailDao.getMaterialRequestItem(),
                eStockEntryDetailDao.getOriginalItem(),
                eStockEntryDetailDao.getAgainstStockEntry(),
                eStockEntryDetailDao.getSteDetail(),
                eStockEntryDetailDao.getPoDetail(),
                eStockEntryDetailDao.getScoRmDetail(),
                eStockEntryDetailDao.getPutawayRule(),
                eStockEntryDetailDao.getReferencePurchaseReceipt(),
                eStockEntryDetailDao.getJobCardItem(),
                eStockEntryDetailDao.getParent(),
                eStockEntryDetailDao.getParentField(),
                eStockEntryDetailDao.getParentType());
    }

    public static void fromDTO(StockEntryDetailDto vStockEntryDetailDto, StockEntryDetailDao eStockEntryDetailDao) {
        eStockEntryDetailDao.setName(vStockEntryDetailDto.name());
        eStockEntryDetailDao.setCreation(vStockEntryDetailDto.creation());
        eStockEntryDetailDao.setModified(vStockEntryDetailDto.modified());
        eStockEntryDetailDao.setModifiedBy(vStockEntryDetailDto.modifiedBy());
        eStockEntryDetailDao.setOwner(vStockEntryDetailDto.owner());
        eStockEntryDetailDao.setIsDocStatus(vStockEntryDetailDto.isDocStatus());
        eStockEntryDetailDao.setIdx(vStockEntryDetailDto.idx());
        eStockEntryDetailDao.setBarcode(vStockEntryDetailDto.barcode());
        eStockEntryDetailDao.setHasItemScanned(vStockEntryDetailDto.hasItemScanned());
        eStockEntryDetailDao.setSWarehouse(vStockEntryDetailDto.sWarehouse());
        eStockEntryDetailDao.setTWarehouse(vStockEntryDetailDto.tWarehouse());
        eStockEntryDetailDao.setItemCode(vStockEntryDetailDto.itemCode());
        eStockEntryDetailDao.setItemName(vStockEntryDetailDto.itemName());
        eStockEntryDetailDao.setIsFinishedItem(vStockEntryDetailDto.isFinishedItem());
        eStockEntryDetailDao.setIsScrapItem(vStockEntryDetailDto.isScrapItem());
        eStockEntryDetailDao.setQualityInspection(vStockEntryDetailDto.qualityInspection());
        eStockEntryDetailDao.setSubcontractedItem(vStockEntryDetailDto.subcontractedItem());
        eStockEntryDetailDao.setDescription(vStockEntryDetailDto.description());
        eStockEntryDetailDao.setItemGroup(vStockEntryDetailDto.itemGroup());
        eStockEntryDetailDao.setImage(vStockEntryDetailDto.image());
        eStockEntryDetailDao.setQty(vStockEntryDetailDto.qty());
        eStockEntryDetailDao.setTransferQty(vStockEntryDetailDto.transferQty());
        eStockEntryDetailDao.setRetainSample(vStockEntryDetailDto.retainSample());
        eStockEntryDetailDao.setUom(vStockEntryDetailDto.uom());
        eStockEntryDetailDao.setStockUom(vStockEntryDetailDto.stockUom());
        eStockEntryDetailDao.setConversionFactor(vStockEntryDetailDto.conversionFactor());
        eStockEntryDetailDao.setSampleQuantity(vStockEntryDetailDto.sampleQuantity());
        eStockEntryDetailDao.setBasicRate(vStockEntryDetailDto.basicRate());
        eStockEntryDetailDao.setAdditionalCost(vStockEntryDetailDto.additionalCost());
        eStockEntryDetailDao.setValuationRate(vStockEntryDetailDto.valuationRate());
        eStockEntryDetailDao.setAllowZeroValuationRate(vStockEntryDetailDto.allowZeroValuationRate());
        eStockEntryDetailDao.setSetBasicRateManually(vStockEntryDetailDto.setBasicRateManually());
        eStockEntryDetailDao.setBasicAmount(vStockEntryDetailDto.basicAmount());
        eStockEntryDetailDao.setAmount(vStockEntryDetailDto.amount());
        eStockEntryDetailDao.setUseSerialBatchFields(vStockEntryDetailDto.useSerialBatchFields());
        eStockEntryDetailDao.setSerialAndBatchBundle(vStockEntryDetailDto.serialAndBatchBundle());
        eStockEntryDetailDao.setSerialNo(vStockEntryDetailDto.serialNo());
        eStockEntryDetailDao.setBatchNo(vStockEntryDetailDto.batchNo());
        eStockEntryDetailDao.setExpenseAccount(vStockEntryDetailDto.expenseAccount());
        eStockEntryDetailDao.setCostCenter(vStockEntryDetailDto.costCenter());
        eStockEntryDetailDao.setProject(vStockEntryDetailDto.project());
        eStockEntryDetailDao.setActualQty(vStockEntryDetailDto.actualQty());
        eStockEntryDetailDao.setTransferredQty(vStockEntryDetailDto.transferredQty());
        eStockEntryDetailDao.setBomNo(vStockEntryDetailDto.bomNo());
        eStockEntryDetailDao.setAllowAlternativeItem(vStockEntryDetailDto.allowAlternativeItem());
        eStockEntryDetailDao.setMaterialRequest(vStockEntryDetailDto.materialRequest());
        eStockEntryDetailDao.setMaterialRequestItem(vStockEntryDetailDto.materialRequestItem());
        eStockEntryDetailDao.setOriginalItem(vStockEntryDetailDto.originalItem());
        eStockEntryDetailDao.setAgainstStockEntry(vStockEntryDetailDto.againstStockEntry());
        eStockEntryDetailDao.setSteDetail(vStockEntryDetailDto.steDetail());
        eStockEntryDetailDao.setPoDetail(vStockEntryDetailDto.poDetail());
        eStockEntryDetailDao.setScoRmDetail(vStockEntryDetailDto.scoRmDetail());
        eStockEntryDetailDao.setPutawayRule(vStockEntryDetailDto.putawayRule());
        eStockEntryDetailDao.setReferencePurchaseReceipt(vStockEntryDetailDto.referencePurchaseReceipt());
        eStockEntryDetailDao.setJobCardItem(vStockEntryDetailDto.jobCardItem());
        eStockEntryDetailDao.setParent(vStockEntryDetailDto.parent());
        eStockEntryDetailDao.setParentField(vStockEntryDetailDto.parentField());
        eStockEntryDetailDao.setParentType(vStockEntryDetailDto.parentType());
    }
}