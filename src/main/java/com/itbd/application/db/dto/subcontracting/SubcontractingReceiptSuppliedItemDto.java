package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingReceiptSuppliedItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubcontractingReceiptSuppliedItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String mainItemCode,
        String rmItemCode,
        String itemName,
        String bomDetailNo,
        String description,
        String stockUom,
        BigDecimal conversionFactor,
        String referenceName,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal availableQtyForConsumption,
        BigDecimal requiredQty,
        BigDecimal consumedQty,
        BigDecimal currentStock,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String subcontractingOrder,
        String serialNo,
        String batchNo,
        String parent,
        String parentField,
        String parentType
) {
    public static SubcontractingReceiptSuppliedItemDto fromEntity(SubcontractingReceiptSuppliedItemDao eSubcontractingReceiptSuppliedItemDao) {
        return new SubcontractingReceiptSuppliedItemDto(
                eSubcontractingReceiptSuppliedItemDao.getName(),
                eSubcontractingReceiptSuppliedItemDao.getCreation(),
                eSubcontractingReceiptSuppliedItemDao.getModified(),
                eSubcontractingReceiptSuppliedItemDao.getModifiedBy(),
                eSubcontractingReceiptSuppliedItemDao.getOwner(),
                eSubcontractingReceiptSuppliedItemDao.getIsDocStatus(),
                eSubcontractingReceiptSuppliedItemDao.getIdx(),
                eSubcontractingReceiptSuppliedItemDao.getMainItemCode(),
                eSubcontractingReceiptSuppliedItemDao.getRmItemCode(),
                eSubcontractingReceiptSuppliedItemDao.getItemName(),
                eSubcontractingReceiptSuppliedItemDao.getBomDetailNo(),
                eSubcontractingReceiptSuppliedItemDao.getDescription(),
                eSubcontractingReceiptSuppliedItemDao.getStockUom(),
                eSubcontractingReceiptSuppliedItemDao.getConversionFactor(),
                eSubcontractingReceiptSuppliedItemDao.getReferenceName(),
                eSubcontractingReceiptSuppliedItemDao.getRate(),
                eSubcontractingReceiptSuppliedItemDao.getAmount(),
                eSubcontractingReceiptSuppliedItemDao.getAvailableQtyForConsumption(),
                eSubcontractingReceiptSuppliedItemDao.getRequiredQty(),
                eSubcontractingReceiptSuppliedItemDao.getConsumedQty(),
                eSubcontractingReceiptSuppliedItemDao.getCurrentStock(),
                eSubcontractingReceiptSuppliedItemDao.getSerialAndBatchBundle(),
                eSubcontractingReceiptSuppliedItemDao.getUseSerialBatchFields(),
                eSubcontractingReceiptSuppliedItemDao.getSubcontractingOrder(),
                eSubcontractingReceiptSuppliedItemDao.getSerialNo(),
                eSubcontractingReceiptSuppliedItemDao.getBatchNo(),
                eSubcontractingReceiptSuppliedItemDao.getParent(),
                eSubcontractingReceiptSuppliedItemDao.getParentField(),
                eSubcontractingReceiptSuppliedItemDao.getParentType());
    }

    public static void fromDTO(SubcontractingReceiptSuppliedItemDto vSubcontractingReceiptSuppliedItemDto, SubcontractingReceiptSuppliedItemDao eSubcontractingReceiptSuppliedItemDao) {
        eSubcontractingReceiptSuppliedItemDao.setName(vSubcontractingReceiptSuppliedItemDto.name());
        eSubcontractingReceiptSuppliedItemDao.setCreation(vSubcontractingReceiptSuppliedItemDto.creation());
        eSubcontractingReceiptSuppliedItemDao.setModified(vSubcontractingReceiptSuppliedItemDto.modified());
        eSubcontractingReceiptSuppliedItemDao.setModifiedBy(vSubcontractingReceiptSuppliedItemDto.modifiedBy());
        eSubcontractingReceiptSuppliedItemDao.setOwner(vSubcontractingReceiptSuppliedItemDto.owner());
        eSubcontractingReceiptSuppliedItemDao.setIsDocStatus(vSubcontractingReceiptSuppliedItemDto.isDocStatus());
        eSubcontractingReceiptSuppliedItemDao.setIdx(vSubcontractingReceiptSuppliedItemDto.idx());
        eSubcontractingReceiptSuppliedItemDao.setMainItemCode(vSubcontractingReceiptSuppliedItemDto.mainItemCode());
        eSubcontractingReceiptSuppliedItemDao.setRmItemCode(vSubcontractingReceiptSuppliedItemDto.rmItemCode());
        eSubcontractingReceiptSuppliedItemDao.setItemName(vSubcontractingReceiptSuppliedItemDto.itemName());
        eSubcontractingReceiptSuppliedItemDao.setBomDetailNo(vSubcontractingReceiptSuppliedItemDto.bomDetailNo());
        eSubcontractingReceiptSuppliedItemDao.setDescription(vSubcontractingReceiptSuppliedItemDto.description());
        eSubcontractingReceiptSuppliedItemDao.setStockUom(vSubcontractingReceiptSuppliedItemDto.stockUom());
        eSubcontractingReceiptSuppliedItemDao.setConversionFactor(vSubcontractingReceiptSuppliedItemDto.conversionFactor());
        eSubcontractingReceiptSuppliedItemDao.setReferenceName(vSubcontractingReceiptSuppliedItemDto.referenceName());
        eSubcontractingReceiptSuppliedItemDao.setRate(vSubcontractingReceiptSuppliedItemDto.rate());
        eSubcontractingReceiptSuppliedItemDao.setAmount(vSubcontractingReceiptSuppliedItemDto.amount());
        eSubcontractingReceiptSuppliedItemDao.setAvailableQtyForConsumption(vSubcontractingReceiptSuppliedItemDto.availableQtyForConsumption());
        eSubcontractingReceiptSuppliedItemDao.setRequiredQty(vSubcontractingReceiptSuppliedItemDto.requiredQty());
        eSubcontractingReceiptSuppliedItemDao.setConsumedQty(vSubcontractingReceiptSuppliedItemDto.consumedQty());
        eSubcontractingReceiptSuppliedItemDao.setCurrentStock(vSubcontractingReceiptSuppliedItemDto.currentStock());
        eSubcontractingReceiptSuppliedItemDao.setSerialAndBatchBundle(vSubcontractingReceiptSuppliedItemDto.serialAndBatchBundle());
        eSubcontractingReceiptSuppliedItemDao.setUseSerialBatchFields(vSubcontractingReceiptSuppliedItemDto.useSerialBatchFields());
        eSubcontractingReceiptSuppliedItemDao.setSubcontractingOrder(vSubcontractingReceiptSuppliedItemDto.subcontractingOrder());
        eSubcontractingReceiptSuppliedItemDao.setSerialNo(vSubcontractingReceiptSuppliedItemDto.serialNo());
        eSubcontractingReceiptSuppliedItemDao.setBatchNo(vSubcontractingReceiptSuppliedItemDto.batchNo());
        eSubcontractingReceiptSuppliedItemDao.setParent(vSubcontractingReceiptSuppliedItemDto.parent());
        eSubcontractingReceiptSuppliedItemDao.setParentField(vSubcontractingReceiptSuppliedItemDto.parentField());
        eSubcontractingReceiptSuppliedItemDao.setParentType(vSubcontractingReceiptSuppliedItemDto.parentType());
    }
}