package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SerialAndBatchBundleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record SerialAndBatchBundleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        String itemName,
        Boolean hasSerialNo,
        Boolean hasBatchNo,
        String itemCode,
        String warehouse,
        String typeOfTransaction,
        BigDecimal totalQty,
        String itemGroup,
        BigDecimal avgRate,
        BigDecimal totalAmount,
        String voucherType,
        String voucherNo,
        String voucherDetailNo,
        LocalDate postingDate,
        LocalTime postingTime,
        String returnedAgainst,
        Boolean isCancelled,
        Boolean isRejected,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SerialAndBatchBundleDto fromEntity(SerialAndBatchBundleDao eSerialAndBatchBundleDao) {
        return new SerialAndBatchBundleDto(
                eSerialAndBatchBundleDao.getName(),
                eSerialAndBatchBundleDao.getCreation(),
                eSerialAndBatchBundleDao.getModified(),
                eSerialAndBatchBundleDao.getModifiedBy(),
                eSerialAndBatchBundleDao.getOwner(),
                eSerialAndBatchBundleDao.getIsDocStatus(),
                eSerialAndBatchBundleDao.getIdx(),
                eSerialAndBatchBundleDao.getNamingSeries(),
                eSerialAndBatchBundleDao.getCompany(),
                eSerialAndBatchBundleDao.getItemName(),
                eSerialAndBatchBundleDao.getHasSerialNo(),
                eSerialAndBatchBundleDao.getHasBatchNo(),
                eSerialAndBatchBundleDao.getItemCode(),
                eSerialAndBatchBundleDao.getWarehouse(),
                eSerialAndBatchBundleDao.getTypeOfTransaction(),
                eSerialAndBatchBundleDao.getTotalQty(),
                eSerialAndBatchBundleDao.getItemGroup(),
                eSerialAndBatchBundleDao.getAvgRate(),
                eSerialAndBatchBundleDao.getTotalAmount(),
                eSerialAndBatchBundleDao.getVoucherType(),
                eSerialAndBatchBundleDao.getVoucherNo(),
                eSerialAndBatchBundleDao.getVoucherDetailNo(),
                eSerialAndBatchBundleDao.getPostingDate(),
                eSerialAndBatchBundleDao.getPostingTime(),
                eSerialAndBatchBundleDao.getReturnedAgainst(),
                eSerialAndBatchBundleDao.getIsCancelled(),
                eSerialAndBatchBundleDao.getIsRejected(),
                eSerialAndBatchBundleDao.getAmendedFrom(),
                eSerialAndBatchBundleDao.getUserTags(),
                eSerialAndBatchBundleDao.getComments(),
                eSerialAndBatchBundleDao.getAssign(),
                eSerialAndBatchBundleDao.getLikedBy());
    }

    public static void fromDTO(SerialAndBatchBundleDto vSerialAndBatchBundleDto, SerialAndBatchBundleDao eSerialAndBatchBundleDao) {
        eSerialAndBatchBundleDao.setName(vSerialAndBatchBundleDto.name());
        eSerialAndBatchBundleDao.setCreation(vSerialAndBatchBundleDto.creation());
        eSerialAndBatchBundleDao.setModified(vSerialAndBatchBundleDto.modified());
        eSerialAndBatchBundleDao.setModifiedBy(vSerialAndBatchBundleDto.modifiedBy());
        eSerialAndBatchBundleDao.setOwner(vSerialAndBatchBundleDto.owner());
        eSerialAndBatchBundleDao.setIsDocStatus(vSerialAndBatchBundleDto.isDocStatus());
        eSerialAndBatchBundleDao.setIdx(vSerialAndBatchBundleDto.idx());
        eSerialAndBatchBundleDao.setNamingSeries(vSerialAndBatchBundleDto.namingSeries());
        eSerialAndBatchBundleDao.setCompany(vSerialAndBatchBundleDto.company());
        eSerialAndBatchBundleDao.setItemName(vSerialAndBatchBundleDto.itemName());
        eSerialAndBatchBundleDao.setHasSerialNo(vSerialAndBatchBundleDto.hasSerialNo());
        eSerialAndBatchBundleDao.setHasBatchNo(vSerialAndBatchBundleDto.hasBatchNo());
        eSerialAndBatchBundleDao.setItemCode(vSerialAndBatchBundleDto.itemCode());
        eSerialAndBatchBundleDao.setWarehouse(vSerialAndBatchBundleDto.warehouse());
        eSerialAndBatchBundleDao.setTypeOfTransaction(vSerialAndBatchBundleDto.typeOfTransaction());
        eSerialAndBatchBundleDao.setTotalQty(vSerialAndBatchBundleDto.totalQty());
        eSerialAndBatchBundleDao.setItemGroup(vSerialAndBatchBundleDto.itemGroup());
        eSerialAndBatchBundleDao.setAvgRate(vSerialAndBatchBundleDto.avgRate());
        eSerialAndBatchBundleDao.setTotalAmount(vSerialAndBatchBundleDto.totalAmount());
        eSerialAndBatchBundleDao.setVoucherType(vSerialAndBatchBundleDto.voucherType());
        eSerialAndBatchBundleDao.setVoucherNo(vSerialAndBatchBundleDto.voucherNo());
        eSerialAndBatchBundleDao.setVoucherDetailNo(vSerialAndBatchBundleDto.voucherDetailNo());
        eSerialAndBatchBundleDao.setPostingDate(vSerialAndBatchBundleDto.postingDate());
        eSerialAndBatchBundleDao.setPostingTime(vSerialAndBatchBundleDto.postingTime());
        eSerialAndBatchBundleDao.setReturnedAgainst(vSerialAndBatchBundleDto.returnedAgainst());
        eSerialAndBatchBundleDao.setIsCancelled(vSerialAndBatchBundleDto.isCancelled());
        eSerialAndBatchBundleDao.setIsRejected(vSerialAndBatchBundleDto.isRejected());
        eSerialAndBatchBundleDao.setAmendedFrom(vSerialAndBatchBundleDto.amendedFrom());
        eSerialAndBatchBundleDao.setUserTags(vSerialAndBatchBundleDto.userTags());
        eSerialAndBatchBundleDao.setComments(vSerialAndBatchBundleDto.comments());
        eSerialAndBatchBundleDao.setAssign(vSerialAndBatchBundleDto.assign());
        eSerialAndBatchBundleDao.setLikedBy(vSerialAndBatchBundleDto.likedBy());
    }
}