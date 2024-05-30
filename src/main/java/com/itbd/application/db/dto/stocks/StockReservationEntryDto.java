package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stock.stock.StockReservationEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record StockReservationEntryDto(
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
        Boolean hasSerialNo,
        Boolean hasBatchNo,
        String voucherType,
        String voucherNo,
        String voucherDetailNo,
        String fromVoucherType,
        String fromVoucherNo,
        String fromVoucherDetailNo,
        String stockUom,
        BigDecimal availableQty,
        BigDecimal voucherQty,
        BigDecimal reservedQty,
        BigDecimal deliveredQty,
        String reservationBasedOn,
        String company,
        String project,
        String status,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static StockReservationEntryDto fromEntity(StockReservationEntryDao eStockReservationEntryDao) {
        return new StockReservationEntryDto(
                eStockReservationEntryDao.getName(),
                eStockReservationEntryDao.getCreation(),
                eStockReservationEntryDao.getModified(),
                eStockReservationEntryDao.getModifiedBy(),
                eStockReservationEntryDao.getOwner(),
                eStockReservationEntryDao.getIsDocStatus(),
                eStockReservationEntryDao.getIdx(),
                eStockReservationEntryDao.getItemCode(),
                eStockReservationEntryDao.getWarehouse(),
                eStockReservationEntryDao.getHasSerialNo(),
                eStockReservationEntryDao.getHasBatchNo(),
                eStockReservationEntryDao.getVoucherType(),
                eStockReservationEntryDao.getVoucherNo(),
                eStockReservationEntryDao.getVoucherDetailNo(),
                eStockReservationEntryDao.getFromVoucherType(),
                eStockReservationEntryDao.getFromVoucherNo(),
                eStockReservationEntryDao.getFromVoucherDetailNo(),
                eStockReservationEntryDao.getStockUom(),
                eStockReservationEntryDao.getAvailableQty(),
                eStockReservationEntryDao.getVoucherQty(),
                eStockReservationEntryDao.getReservedQty(),
                eStockReservationEntryDao.getDeliveredQty(),
                eStockReservationEntryDao.getReservationBasedOn(),
                eStockReservationEntryDao.getCompany(),
                eStockReservationEntryDao.getProject(),
                eStockReservationEntryDao.getStatus(),
                eStockReservationEntryDao.getAmendedFrom(),
                eStockReservationEntryDao.getUserTags(),
                eStockReservationEntryDao.getComments(),
                eStockReservationEntryDao.getAssign(),
                eStockReservationEntryDao.getLikedBy());
    }

    public static void fromDTO(StockReservationEntryDto vStockReservationEntryDto, StockReservationEntryDao eStockReservationEntryDao) {
        eStockReservationEntryDao.setName(vStockReservationEntryDto.name());
        eStockReservationEntryDao.setCreation(vStockReservationEntryDto.creation());
        eStockReservationEntryDao.setModified(vStockReservationEntryDto.modified());
        eStockReservationEntryDao.setModifiedBy(vStockReservationEntryDto.modifiedBy());
        eStockReservationEntryDao.setOwner(vStockReservationEntryDto.owner());
        eStockReservationEntryDao.setIsDocStatus(vStockReservationEntryDto.isDocStatus());
        eStockReservationEntryDao.setIdx(vStockReservationEntryDto.idx());
        eStockReservationEntryDao.setItemCode(vStockReservationEntryDto.itemCode());
        eStockReservationEntryDao.setWarehouse(vStockReservationEntryDto.warehouse());
        eStockReservationEntryDao.setHasSerialNo(vStockReservationEntryDto.hasSerialNo());
        eStockReservationEntryDao.setHasBatchNo(vStockReservationEntryDto.hasBatchNo());
        eStockReservationEntryDao.setVoucherType(vStockReservationEntryDto.voucherType());
        eStockReservationEntryDao.setVoucherNo(vStockReservationEntryDto.voucherNo());
        eStockReservationEntryDao.setVoucherDetailNo(vStockReservationEntryDto.voucherDetailNo());
        eStockReservationEntryDao.setFromVoucherType(vStockReservationEntryDto.fromVoucherType());
        eStockReservationEntryDao.setFromVoucherNo(vStockReservationEntryDto.fromVoucherNo());
        eStockReservationEntryDao.setFromVoucherDetailNo(vStockReservationEntryDto.fromVoucherDetailNo());
        eStockReservationEntryDao.setStockUom(vStockReservationEntryDto.stockUom());
        eStockReservationEntryDao.setAvailableQty(vStockReservationEntryDto.availableQty());
        eStockReservationEntryDao.setVoucherQty(vStockReservationEntryDto.voucherQty());
        eStockReservationEntryDao.setReservedQty(vStockReservationEntryDto.reservedQty());
        eStockReservationEntryDao.setDeliveredQty(vStockReservationEntryDto.deliveredQty());
        eStockReservationEntryDao.setReservationBasedOn(vStockReservationEntryDto.reservationBasedOn());
        eStockReservationEntryDao.setCompany(vStockReservationEntryDto.company());
        eStockReservationEntryDao.setProject(vStockReservationEntryDto.project());
        eStockReservationEntryDao.setStatus(vStockReservationEntryDto.status());
        eStockReservationEntryDao.setAmendedFrom(vStockReservationEntryDto.amendedFrom());
        eStockReservationEntryDao.setUserTags(vStockReservationEntryDto.userTags());
        eStockReservationEntryDao.setComments(vStockReservationEntryDto.comments());
        eStockReservationEntryDao.setAssign(vStockReservationEntryDto.assign());
        eStockReservationEntryDao.setLikedBy(vStockReservationEntryDto.likedBy());
    }
}