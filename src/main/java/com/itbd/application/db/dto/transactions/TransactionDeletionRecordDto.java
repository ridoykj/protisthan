package com.itbd.application.db.dto.transactions;

import com.itbd.application.db.dao.setup.TransactionDeletionRecordDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TransactionDeletionRecordDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String amendedFrom,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TransactionDeletionRecordDto fromEntity(TransactionDeletionRecordDao eTransactionDeletionRecordDao) {
        return new TransactionDeletionRecordDto(
                eTransactionDeletionRecordDao.getName(),
                eTransactionDeletionRecordDao.getCreation(),
                eTransactionDeletionRecordDao.getModified(),
                eTransactionDeletionRecordDao.getModifiedBy(),
                eTransactionDeletionRecordDao.getOwner(),
                eTransactionDeletionRecordDao.getIsDocStatus(),
                eTransactionDeletionRecordDao.getIdx(),
                eTransactionDeletionRecordDao.getCompany(),
                eTransactionDeletionRecordDao.getAmendedFrom(),
                eTransactionDeletionRecordDao.getStatus(),
                eTransactionDeletionRecordDao.getUserTags(),
                eTransactionDeletionRecordDao.getComments(),
                eTransactionDeletionRecordDao.getAssign(),
                eTransactionDeletionRecordDao.getLikedBy());
    }

    public static void fromDTO(TransactionDeletionRecordDto vTransactionDeletionRecordDto, TransactionDeletionRecordDao eTransactionDeletionRecordDao) {
        eTransactionDeletionRecordDao.setName(vTransactionDeletionRecordDto.name());
        eTransactionDeletionRecordDao.setCreation(vTransactionDeletionRecordDto.creation());
        eTransactionDeletionRecordDao.setModified(vTransactionDeletionRecordDto.modified());
        eTransactionDeletionRecordDao.setModifiedBy(vTransactionDeletionRecordDto.modifiedBy());
        eTransactionDeletionRecordDao.setOwner(vTransactionDeletionRecordDto.owner());
        eTransactionDeletionRecordDao.setIsDocStatus(vTransactionDeletionRecordDto.isDocStatus());
        eTransactionDeletionRecordDao.setIdx(vTransactionDeletionRecordDto.idx());
        eTransactionDeletionRecordDao.setCompany(vTransactionDeletionRecordDto.company());
        eTransactionDeletionRecordDao.setAmendedFrom(vTransactionDeletionRecordDto.amendedFrom());
        eTransactionDeletionRecordDao.setStatus(vTransactionDeletionRecordDto.status());
        eTransactionDeletionRecordDao.setUserTags(vTransactionDeletionRecordDto.userTags());
        eTransactionDeletionRecordDao.setComments(vTransactionDeletionRecordDto.comments());
        eTransactionDeletionRecordDao.setAssign(vTransactionDeletionRecordDto.assign());
        eTransactionDeletionRecordDao.setLikedBy(vTransactionDeletionRecordDto.likedBy());
    }
}