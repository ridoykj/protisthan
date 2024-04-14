package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingReceiptItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SubcontractingReceiptItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        Boolean isScrapItem,
        String description,
        String brand,
        String image,
        BigDecimal receivedQty,
        BigDecimal qty,
        BigDecimal rejectedQty,
        BigDecimal returnedQty,
        String stockUom,
        BigDecimal conversionFactor,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal rmCostPerQty,
        BigDecimal serviceCostPerQty,
        BigDecimal additionalCostPerQty,
        BigDecimal scrapCostPerQty,
        BigDecimal rmSuppCost,
        String warehouse,
        String subcontractingOrder,
        String subcontractingOrderItem,
        String subcontractingReceiptItem,
        String rejectedWarehouse,
        String bom,
        Boolean includeExplodedItems,
        String qualityInspection,
        LocalDate scheduleDate,
        String referenceName,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String rejectedSerialAndBatchBundle,
        String serialNo,
        String rejectedSerialNo,
        String batchNo,
        String manufacturer,
        String manufacturerPartNo,
        String expenseAccount,
        String costCenter,
        String project,
        Boolean pageBreak,
        String purchaseOrder,
        String purchaseOrderItem,
        String parent,
        String parentField,
        String parentType
) {
    public static SubcontractingReceiptItemDto fromEntity(SubcontractingReceiptItemDao eSubcontractingReceiptItemDao) {
        return new SubcontractingReceiptItemDto(
                eSubcontractingReceiptItemDao.getName(),
                eSubcontractingReceiptItemDao.getCreation(),
                eSubcontractingReceiptItemDao.getModified(),
                eSubcontractingReceiptItemDao.getModifiedBy(),
                eSubcontractingReceiptItemDao.getOwner(),
                eSubcontractingReceiptItemDao.getIsDocStatus(),
                eSubcontractingReceiptItemDao.getIdx(),
                eSubcontractingReceiptItemDao.getItemCode(),
                eSubcontractingReceiptItemDao.getItemName(),
                eSubcontractingReceiptItemDao.getIsScrapItem(),
                eSubcontractingReceiptItemDao.getDescription(),
                eSubcontractingReceiptItemDao.getBrand(),
                eSubcontractingReceiptItemDao.getImage(),
                eSubcontractingReceiptItemDao.getReceivedQty(),
                eSubcontractingReceiptItemDao.getQty(),
                eSubcontractingReceiptItemDao.getRejectedQty(),
                eSubcontractingReceiptItemDao.getReturnedQty(),
                eSubcontractingReceiptItemDao.getStockUom(),
                eSubcontractingReceiptItemDao.getConversionFactor(),
                eSubcontractingReceiptItemDao.getRate(),
                eSubcontractingReceiptItemDao.getAmount(),
                eSubcontractingReceiptItemDao.getRmCostPerQty(),
                eSubcontractingReceiptItemDao.getServiceCostPerQty(),
                eSubcontractingReceiptItemDao.getAdditionalCostPerQty(),
                eSubcontractingReceiptItemDao.getScrapCostPerQty(),
                eSubcontractingReceiptItemDao.getRmSuppCost(),
                eSubcontractingReceiptItemDao.getWarehouse(),
                eSubcontractingReceiptItemDao.getSubcontractingOrder(),
                eSubcontractingReceiptItemDao.getSubcontractingOrderItem(),
                eSubcontractingReceiptItemDao.getSubcontractingReceiptItem(),
                eSubcontractingReceiptItemDao.getRejectedWarehouse(),
                eSubcontractingReceiptItemDao.getBom(),
                eSubcontractingReceiptItemDao.getIncludeExplodedItems(),
                eSubcontractingReceiptItemDao.getQualityInspection(),
                eSubcontractingReceiptItemDao.getScheduleDate(),
                eSubcontractingReceiptItemDao.getReferenceName(),
                eSubcontractingReceiptItemDao.getSerialAndBatchBundle(),
                eSubcontractingReceiptItemDao.getUseSerialBatchFields(),
                eSubcontractingReceiptItemDao.getRejectedSerialAndBatchBundle(),
                eSubcontractingReceiptItemDao.getSerialNo(),
                eSubcontractingReceiptItemDao.getRejectedSerialNo(),
                eSubcontractingReceiptItemDao.getBatchNo(),
                eSubcontractingReceiptItemDao.getManufacturer(),
                eSubcontractingReceiptItemDao.getManufacturerPartNo(),
                eSubcontractingReceiptItemDao.getExpenseAccount(),
                eSubcontractingReceiptItemDao.getCostCenter(),
                eSubcontractingReceiptItemDao.getProject(),
                eSubcontractingReceiptItemDao.getPageBreak(),
                eSubcontractingReceiptItemDao.getPurchaseOrder(),
                eSubcontractingReceiptItemDao.getPurchaseOrderItem(),
                eSubcontractingReceiptItemDao.getParent(),
                eSubcontractingReceiptItemDao.getParentField(),
                eSubcontractingReceiptItemDao.getParentType());
    }

    public static void fromDTO(SubcontractingReceiptItemDto vSubcontractingReceiptItemDto, SubcontractingReceiptItemDao eSubcontractingReceiptItemDao) {
        eSubcontractingReceiptItemDao.setName(vSubcontractingReceiptItemDto.name());
        eSubcontractingReceiptItemDao.setCreation(vSubcontractingReceiptItemDto.creation());
        eSubcontractingReceiptItemDao.setModified(vSubcontractingReceiptItemDto.modified());
        eSubcontractingReceiptItemDao.setModifiedBy(vSubcontractingReceiptItemDto.modifiedBy());
        eSubcontractingReceiptItemDao.setOwner(vSubcontractingReceiptItemDto.owner());
        eSubcontractingReceiptItemDao.setIsDocStatus(vSubcontractingReceiptItemDto.isDocStatus());
        eSubcontractingReceiptItemDao.setIdx(vSubcontractingReceiptItemDto.idx());
        eSubcontractingReceiptItemDao.setItemCode(vSubcontractingReceiptItemDto.itemCode());
        eSubcontractingReceiptItemDao.setItemName(vSubcontractingReceiptItemDto.itemName());
        eSubcontractingReceiptItemDao.setIsScrapItem(vSubcontractingReceiptItemDto.isScrapItem());
        eSubcontractingReceiptItemDao.setDescription(vSubcontractingReceiptItemDto.description());
        eSubcontractingReceiptItemDao.setBrand(vSubcontractingReceiptItemDto.brand());
        eSubcontractingReceiptItemDao.setImage(vSubcontractingReceiptItemDto.image());
        eSubcontractingReceiptItemDao.setReceivedQty(vSubcontractingReceiptItemDto.receivedQty());
        eSubcontractingReceiptItemDao.setQty(vSubcontractingReceiptItemDto.qty());
        eSubcontractingReceiptItemDao.setRejectedQty(vSubcontractingReceiptItemDto.rejectedQty());
        eSubcontractingReceiptItemDao.setReturnedQty(vSubcontractingReceiptItemDto.returnedQty());
        eSubcontractingReceiptItemDao.setStockUom(vSubcontractingReceiptItemDto.stockUom());
        eSubcontractingReceiptItemDao.setConversionFactor(vSubcontractingReceiptItemDto.conversionFactor());
        eSubcontractingReceiptItemDao.setRate(vSubcontractingReceiptItemDto.rate());
        eSubcontractingReceiptItemDao.setAmount(vSubcontractingReceiptItemDto.amount());
        eSubcontractingReceiptItemDao.setRmCostPerQty(vSubcontractingReceiptItemDto.rmCostPerQty());
        eSubcontractingReceiptItemDao.setServiceCostPerQty(vSubcontractingReceiptItemDto.serviceCostPerQty());
        eSubcontractingReceiptItemDao.setAdditionalCostPerQty(vSubcontractingReceiptItemDto.additionalCostPerQty());
        eSubcontractingReceiptItemDao.setScrapCostPerQty(vSubcontractingReceiptItemDto.scrapCostPerQty());
        eSubcontractingReceiptItemDao.setRmSuppCost(vSubcontractingReceiptItemDto.rmSuppCost());
        eSubcontractingReceiptItemDao.setWarehouse(vSubcontractingReceiptItemDto.warehouse());
        eSubcontractingReceiptItemDao.setSubcontractingOrder(vSubcontractingReceiptItemDto.subcontractingOrder());
        eSubcontractingReceiptItemDao.setSubcontractingOrderItem(vSubcontractingReceiptItemDto.subcontractingOrderItem());
        eSubcontractingReceiptItemDao.setSubcontractingReceiptItem(vSubcontractingReceiptItemDto.subcontractingReceiptItem());
        eSubcontractingReceiptItemDao.setRejectedWarehouse(vSubcontractingReceiptItemDto.rejectedWarehouse());
        eSubcontractingReceiptItemDao.setBom(vSubcontractingReceiptItemDto.bom());
        eSubcontractingReceiptItemDao.setIncludeExplodedItems(vSubcontractingReceiptItemDto.includeExplodedItems());
        eSubcontractingReceiptItemDao.setQualityInspection(vSubcontractingReceiptItemDto.qualityInspection());
        eSubcontractingReceiptItemDao.setScheduleDate(vSubcontractingReceiptItemDto.scheduleDate());
        eSubcontractingReceiptItemDao.setReferenceName(vSubcontractingReceiptItemDto.referenceName());
        eSubcontractingReceiptItemDao.setSerialAndBatchBundle(vSubcontractingReceiptItemDto.serialAndBatchBundle());
        eSubcontractingReceiptItemDao.setUseSerialBatchFields(vSubcontractingReceiptItemDto.useSerialBatchFields());
        eSubcontractingReceiptItemDao.setRejectedSerialAndBatchBundle(vSubcontractingReceiptItemDto.rejectedSerialAndBatchBundle());
        eSubcontractingReceiptItemDao.setSerialNo(vSubcontractingReceiptItemDto.serialNo());
        eSubcontractingReceiptItemDao.setRejectedSerialNo(vSubcontractingReceiptItemDto.rejectedSerialNo());
        eSubcontractingReceiptItemDao.setBatchNo(vSubcontractingReceiptItemDto.batchNo());
        eSubcontractingReceiptItemDao.setManufacturer(vSubcontractingReceiptItemDto.manufacturer());
        eSubcontractingReceiptItemDao.setManufacturerPartNo(vSubcontractingReceiptItemDto.manufacturerPartNo());
        eSubcontractingReceiptItemDao.setExpenseAccount(vSubcontractingReceiptItemDto.expenseAccount());
        eSubcontractingReceiptItemDao.setCostCenter(vSubcontractingReceiptItemDto.costCenter());
        eSubcontractingReceiptItemDao.setProject(vSubcontractingReceiptItemDto.project());
        eSubcontractingReceiptItemDao.setPageBreak(vSubcontractingReceiptItemDto.pageBreak());
        eSubcontractingReceiptItemDao.setPurchaseOrder(vSubcontractingReceiptItemDto.purchaseOrder());
        eSubcontractingReceiptItemDao.setPurchaseOrderItem(vSubcontractingReceiptItemDto.purchaseOrderItem());
        eSubcontractingReceiptItemDao.setParent(vSubcontractingReceiptItemDto.parent());
        eSubcontractingReceiptItemDao.setParentField(vSubcontractingReceiptItemDto.parentField());
        eSubcontractingReceiptItemDao.setParentType(vSubcontractingReceiptItemDto.parentType());
    }
}