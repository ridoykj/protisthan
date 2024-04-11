package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stocks.StockReconciliationItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record StockReconciliationItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String barcode,
        String hasItemScanned,
        String itemCode,
        String itemName,
        String itemGroup,
        String warehouse,
        BigDecimal qty,
        BigDecimal valuationRate,
        BigDecimal amount,
        Boolean allowZeroValuationRate,
        Boolean useSerialBatchFields,
        String serialAndBatchBundle,
        String currentSerialAndBatchBundle,
        String serialNo,
        String batchNo,
        BigDecimal currentQty,
        BigDecimal currentAmount,
        BigDecimal currentValuationRate,
        String currentSerialNo,
        String quantityDifference,
        BigDecimal amountDifference,
        String parent,
        String parentField,
        String parentType
) {
    public static StockReconciliationItemDto fromEntity(StockReconciliationItemDao eStockReconciliationItemDao) {
        return new StockReconciliationItemDto(
                eStockReconciliationItemDao.getName(),
                eStockReconciliationItemDao.getCreation(),
                eStockReconciliationItemDao.getModified(),
                eStockReconciliationItemDao.getModifiedBy(),
                eStockReconciliationItemDao.getOwner(),
                eStockReconciliationItemDao.getIsDocStatus(),
                eStockReconciliationItemDao.getIdx(),
                eStockReconciliationItemDao.getBarcode(),
                eStockReconciliationItemDao.getHasItemScanned(),
                eStockReconciliationItemDao.getItemCode(),
                eStockReconciliationItemDao.getItemName(),
                eStockReconciliationItemDao.getItemGroup(),
                eStockReconciliationItemDao.getWarehouse(),
                eStockReconciliationItemDao.getQty(),
                eStockReconciliationItemDao.getValuationRate(),
                eStockReconciliationItemDao.getAmount(),
                eStockReconciliationItemDao.getAllowZeroValuationRate(),
                eStockReconciliationItemDao.getUseSerialBatchFields(),
                eStockReconciliationItemDao.getSerialAndBatchBundle(),
                eStockReconciliationItemDao.getCurrentSerialAndBatchBundle(),
                eStockReconciliationItemDao.getSerialNo(),
                eStockReconciliationItemDao.getBatchNo(),
                eStockReconciliationItemDao.getCurrentQty(),
                eStockReconciliationItemDao.getCurrentAmount(),
                eStockReconciliationItemDao.getCurrentValuationRate(),
                eStockReconciliationItemDao.getCurrentSerialNo(),
                eStockReconciliationItemDao.getQuantityDifference(),
                eStockReconciliationItemDao.getAmountDifference(),
                eStockReconciliationItemDao.getParent(),
                eStockReconciliationItemDao.getParentField(),
                eStockReconciliationItemDao.getParentType());
    }

    public static void fromDTO(StockReconciliationItemDto vStockReconciliationItemDto, StockReconciliationItemDao eStockReconciliationItemDao) {
        eStockReconciliationItemDao.setName(vStockReconciliationItemDto.name());
        eStockReconciliationItemDao.setCreation(vStockReconciliationItemDto.creation());
        eStockReconciliationItemDao.setModified(vStockReconciliationItemDto.modified());
        eStockReconciliationItemDao.setModifiedBy(vStockReconciliationItemDto.modifiedBy());
        eStockReconciliationItemDao.setOwner(vStockReconciliationItemDto.owner());
        eStockReconciliationItemDao.setIsDocStatus(vStockReconciliationItemDto.isDocStatus());
        eStockReconciliationItemDao.setIdx(vStockReconciliationItemDto.idx());
        eStockReconciliationItemDao.setBarcode(vStockReconciliationItemDto.barcode());
        eStockReconciliationItemDao.setHasItemScanned(vStockReconciliationItemDto.hasItemScanned());
        eStockReconciliationItemDao.setItemCode(vStockReconciliationItemDto.itemCode());
        eStockReconciliationItemDao.setItemName(vStockReconciliationItemDto.itemName());
        eStockReconciliationItemDao.setItemGroup(vStockReconciliationItemDto.itemGroup());
        eStockReconciliationItemDao.setWarehouse(vStockReconciliationItemDto.warehouse());
        eStockReconciliationItemDao.setQty(vStockReconciliationItemDto.qty());
        eStockReconciliationItemDao.setValuationRate(vStockReconciliationItemDto.valuationRate());
        eStockReconciliationItemDao.setAmount(vStockReconciliationItemDto.amount());
        eStockReconciliationItemDao.setAllowZeroValuationRate(vStockReconciliationItemDto.allowZeroValuationRate());
        eStockReconciliationItemDao.setUseSerialBatchFields(vStockReconciliationItemDto.useSerialBatchFields());
        eStockReconciliationItemDao.setSerialAndBatchBundle(vStockReconciliationItemDto.serialAndBatchBundle());
        eStockReconciliationItemDao.setCurrentSerialAndBatchBundle(vStockReconciliationItemDto.currentSerialAndBatchBundle());
        eStockReconciliationItemDao.setSerialNo(vStockReconciliationItemDto.serialNo());
        eStockReconciliationItemDao.setBatchNo(vStockReconciliationItemDto.batchNo());
        eStockReconciliationItemDao.setCurrentQty(vStockReconciliationItemDto.currentQty());
        eStockReconciliationItemDao.setCurrentAmount(vStockReconciliationItemDto.currentAmount());
        eStockReconciliationItemDao.setCurrentValuationRate(vStockReconciliationItemDto.currentValuationRate());
        eStockReconciliationItemDao.setCurrentSerialNo(vStockReconciliationItemDto.currentSerialNo());
        eStockReconciliationItemDao.setQuantityDifference(vStockReconciliationItemDto.quantityDifference());
        eStockReconciliationItemDao.setAmountDifference(vStockReconciliationItemDto.amountDifference());
        eStockReconciliationItemDao.setParent(vStockReconciliationItemDto.parent());
        eStockReconciliationItemDao.setParentField(vStockReconciliationItemDto.parentField());
        eStockReconciliationItemDao.setParentType(vStockReconciliationItemDto.parentType());
    }
}