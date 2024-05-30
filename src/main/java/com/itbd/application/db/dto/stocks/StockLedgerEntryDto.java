package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stock.stock.StockLedgerEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record StockLedgerEntryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String warehouse,
        LocalDate postingDate,
        LocalTime postingTime,
        LocalDateTime postingDatetime,
        Boolean isAdjustmentEntry,
        Boolean autoCreatedSerialAndBatchBundle,
        String voucherType,
        String voucherNo,
        String voucherDetailNo,
        String serialAndBatchBundle,
        String dependantSleVoucherDetailNo,
        Boolean recalculateRate,
        BigDecimal actualQty,
        BigDecimal qtyAfterTransaction,
        BigDecimal incomingRate,
        BigDecimal outgoingRate,
        BigDecimal valuationRate,
        BigDecimal stockValue,
        BigDecimal stockValueDifference,
        String stockQueue,
        String company,
        String stockUom,
        String project,
        String fiscalYear,
        Boolean hasBatchNo,
        Boolean hasSerialNo,
        Boolean isCancelled,
        Boolean toRename,
        String serialNo,
        String batchNo,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static StockLedgerEntryDto fromEntity(StockLedgerEntryDao eStockLedgerEntryDao) {
        return new StockLedgerEntryDto(
                eStockLedgerEntryDao.getName(),
                eStockLedgerEntryDao.getCreation(),
                eStockLedgerEntryDao.getModified(),
                eStockLedgerEntryDao.getModifiedBy(),
                eStockLedgerEntryDao.getOwner(),
                eStockLedgerEntryDao.getIsDocStatus(),
                eStockLedgerEntryDao.getIdx(),
                eStockLedgerEntryDao.getItemCode(),
                eStockLedgerEntryDao.getWarehouse(),
                eStockLedgerEntryDao.getPostingDate(),
                eStockLedgerEntryDao.getPostingTime(),
                eStockLedgerEntryDao.getPostingDatetime(),
                eStockLedgerEntryDao.getIsAdjustmentEntry(),
                eStockLedgerEntryDao.getAutoCreatedSerialAndBatchBundle(),
                eStockLedgerEntryDao.getVoucherType(),
                eStockLedgerEntryDao.getVoucherNo(),
                eStockLedgerEntryDao.getVoucherDetailNo(),
                eStockLedgerEntryDao.getSerialAndBatchBundle(),
                eStockLedgerEntryDao.getDependantSleVoucherDetailNo(),
                eStockLedgerEntryDao.getRecalculateRate(),
                eStockLedgerEntryDao.getActualQty(),
                eStockLedgerEntryDao.getQtyAfterTransaction(),
                eStockLedgerEntryDao.getIncomingRate(),
                eStockLedgerEntryDao.getOutgoingRate(),
                eStockLedgerEntryDao.getValuationRate(),
                eStockLedgerEntryDao.getStockValue(),
                eStockLedgerEntryDao.getStockValueDifference(),
                eStockLedgerEntryDao.getStockQueue(),
                eStockLedgerEntryDao.getCompany(),
                eStockLedgerEntryDao.getStockUom(),
                eStockLedgerEntryDao.getProject(),
                eStockLedgerEntryDao.getFiscalYear(),
                eStockLedgerEntryDao.getHasBatchNo(),
                eStockLedgerEntryDao.getHasSerialNo(),
                eStockLedgerEntryDao.getIsCancelled(),
                eStockLedgerEntryDao.getToRename(),
                eStockLedgerEntryDao.getSerialNo(),
                eStockLedgerEntryDao.getBatchNo(),
                eStockLedgerEntryDao.getUserTags(),
                eStockLedgerEntryDao.getComments(),
                eStockLedgerEntryDao.getAssign(),
                eStockLedgerEntryDao.getLikedBy());
    }

    public static void fromDTO(StockLedgerEntryDto vStockLedgerEntryDto, StockLedgerEntryDao eStockLedgerEntryDao) {
        eStockLedgerEntryDao.setName(vStockLedgerEntryDto.name());
        eStockLedgerEntryDao.setCreation(vStockLedgerEntryDto.creation());
        eStockLedgerEntryDao.setModified(vStockLedgerEntryDto.modified());
        eStockLedgerEntryDao.setModifiedBy(vStockLedgerEntryDto.modifiedBy());
        eStockLedgerEntryDao.setOwner(vStockLedgerEntryDto.owner());
        eStockLedgerEntryDao.setIsDocStatus(vStockLedgerEntryDto.isDocStatus());
        eStockLedgerEntryDao.setIdx(vStockLedgerEntryDto.idx());
        eStockLedgerEntryDao.setItemCode(vStockLedgerEntryDto.itemCode());
        eStockLedgerEntryDao.setWarehouse(vStockLedgerEntryDto.warehouse());
        eStockLedgerEntryDao.setPostingDate(vStockLedgerEntryDto.postingDate());
        eStockLedgerEntryDao.setPostingTime(vStockLedgerEntryDto.postingTime());
        eStockLedgerEntryDao.setPostingDatetime(vStockLedgerEntryDto.postingDatetime());
        eStockLedgerEntryDao.setIsAdjustmentEntry(vStockLedgerEntryDto.isAdjustmentEntry());
        eStockLedgerEntryDao.setAutoCreatedSerialAndBatchBundle(vStockLedgerEntryDto.autoCreatedSerialAndBatchBundle());
        eStockLedgerEntryDao.setVoucherType(vStockLedgerEntryDto.voucherType());
        eStockLedgerEntryDao.setVoucherNo(vStockLedgerEntryDto.voucherNo());
        eStockLedgerEntryDao.setVoucherDetailNo(vStockLedgerEntryDto.voucherDetailNo());
        eStockLedgerEntryDao.setSerialAndBatchBundle(vStockLedgerEntryDto.serialAndBatchBundle());
        eStockLedgerEntryDao.setDependantSleVoucherDetailNo(vStockLedgerEntryDto.dependantSleVoucherDetailNo());
        eStockLedgerEntryDao.setRecalculateRate(vStockLedgerEntryDto.recalculateRate());
        eStockLedgerEntryDao.setActualQty(vStockLedgerEntryDto.actualQty());
        eStockLedgerEntryDao.setQtyAfterTransaction(vStockLedgerEntryDto.qtyAfterTransaction());
        eStockLedgerEntryDao.setIncomingRate(vStockLedgerEntryDto.incomingRate());
        eStockLedgerEntryDao.setOutgoingRate(vStockLedgerEntryDto.outgoingRate());
        eStockLedgerEntryDao.setValuationRate(vStockLedgerEntryDto.valuationRate());
        eStockLedgerEntryDao.setStockValue(vStockLedgerEntryDto.stockValue());
        eStockLedgerEntryDao.setStockValueDifference(vStockLedgerEntryDto.stockValueDifference());
        eStockLedgerEntryDao.setStockQueue(vStockLedgerEntryDto.stockQueue());
        eStockLedgerEntryDao.setCompany(vStockLedgerEntryDto.company());
        eStockLedgerEntryDao.setStockUom(vStockLedgerEntryDto.stockUom());
        eStockLedgerEntryDao.setProject(vStockLedgerEntryDto.project());
        eStockLedgerEntryDao.setFiscalYear(vStockLedgerEntryDto.fiscalYear());
        eStockLedgerEntryDao.setHasBatchNo(vStockLedgerEntryDto.hasBatchNo());
        eStockLedgerEntryDao.setHasSerialNo(vStockLedgerEntryDto.hasSerialNo());
        eStockLedgerEntryDao.setIsCancelled(vStockLedgerEntryDto.isCancelled());
        eStockLedgerEntryDao.setToRename(vStockLedgerEntryDto.toRename());
        eStockLedgerEntryDao.setSerialNo(vStockLedgerEntryDto.serialNo());
        eStockLedgerEntryDao.setBatchNo(vStockLedgerEntryDto.batchNo());
        eStockLedgerEntryDao.setUserTags(vStockLedgerEntryDto.userTags());
        eStockLedgerEntryDao.setComments(vStockLedgerEntryDto.comments());
        eStockLedgerEntryDao.setAssign(vStockLedgerEntryDto.assign());
        eStockLedgerEntryDao.setLikedBy(vStockLedgerEntryDto.likedBy());
    }
}