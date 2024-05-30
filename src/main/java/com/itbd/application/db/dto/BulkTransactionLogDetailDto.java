package com.itbd.application.db.dto;

import com.itbd.application.db.dao.bulk_transaction.BulkTransactionLogDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record BulkTransactionLogDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fromDocType,
        String transactionName,
        LocalDate date,
        LocalTime time,
        String transactionStatus,
        String errorDescription,
        String toDocType,
        Integer retried,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BulkTransactionLogDetailDto fromEntity(BulkTransactionLogDetailDao eBulkTransactionLogDetailDao) {
        return new BulkTransactionLogDetailDto(
                eBulkTransactionLogDetailDao.getName(),
                eBulkTransactionLogDetailDao.getCreation(),
                eBulkTransactionLogDetailDao.getModified(),
                eBulkTransactionLogDetailDao.getModifiedBy(),
                eBulkTransactionLogDetailDao.getOwner(),
                eBulkTransactionLogDetailDao.getIsDocStatus(),
                eBulkTransactionLogDetailDao.getIdx(),
                eBulkTransactionLogDetailDao.getFromDocType(),
                eBulkTransactionLogDetailDao.getTransactionName(),
                eBulkTransactionLogDetailDao.getDate(),
                eBulkTransactionLogDetailDao.getTime(),
                eBulkTransactionLogDetailDao.getTransactionStatus(),
                eBulkTransactionLogDetailDao.getErrorDescription(),
                eBulkTransactionLogDetailDao.getToDocType(),
                eBulkTransactionLogDetailDao.getRetried(),
                eBulkTransactionLogDetailDao.getUserTags(),
                eBulkTransactionLogDetailDao.getComments(),
                eBulkTransactionLogDetailDao.getAssign(),
                eBulkTransactionLogDetailDao.getLikedBy());
    }

    public static void fromDTO(BulkTransactionLogDetailDto vBulkTransactionLogDetailDto, BulkTransactionLogDetailDao eBulkTransactionLogDetailDao) {
        eBulkTransactionLogDetailDao.setName(vBulkTransactionLogDetailDto.name());
        eBulkTransactionLogDetailDao.setCreation(vBulkTransactionLogDetailDto.creation());
        eBulkTransactionLogDetailDao.setModified(vBulkTransactionLogDetailDto.modified());
        eBulkTransactionLogDetailDao.setModifiedBy(vBulkTransactionLogDetailDto.modifiedBy());
        eBulkTransactionLogDetailDao.setOwner(vBulkTransactionLogDetailDto.owner());
        eBulkTransactionLogDetailDao.setIsDocStatus(vBulkTransactionLogDetailDto.isDocStatus());
        eBulkTransactionLogDetailDao.setIdx(vBulkTransactionLogDetailDto.idx());
        eBulkTransactionLogDetailDao.setFromDocType(vBulkTransactionLogDetailDto.fromDocType());
        eBulkTransactionLogDetailDao.setTransactionName(vBulkTransactionLogDetailDto.transactionName());
        eBulkTransactionLogDetailDao.setDate(vBulkTransactionLogDetailDto.date());
        eBulkTransactionLogDetailDao.setTime(vBulkTransactionLogDetailDto.time());
        eBulkTransactionLogDetailDao.setTransactionStatus(vBulkTransactionLogDetailDto.transactionStatus());
        eBulkTransactionLogDetailDao.setErrorDescription(vBulkTransactionLogDetailDto.errorDescription());
        eBulkTransactionLogDetailDao.setToDocType(vBulkTransactionLogDetailDto.toDocType());
        eBulkTransactionLogDetailDao.setRetried(vBulkTransactionLogDetailDto.retried());
        eBulkTransactionLogDetailDao.setUserTags(vBulkTransactionLogDetailDto.userTags());
        eBulkTransactionLogDetailDao.setComments(vBulkTransactionLogDetailDto.comments());
        eBulkTransactionLogDetailDao.setAssign(vBulkTransactionLogDetailDto.assign());
        eBulkTransactionLogDetailDao.setLikedBy(vBulkTransactionLogDetailDto.likedBy());
    }
}