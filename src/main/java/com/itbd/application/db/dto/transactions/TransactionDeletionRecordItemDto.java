package com.itbd.application.db.dto.transactions;

import com.itbd.application.db.dao.transactions.TransactionDeletionRecordItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TransactionDeletionRecordItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String docTypeName,
        String noOfDocs,
        String parent,
        String parentField,
        String parentType
) {
    public static TransactionDeletionRecordItemDto fromEntity(TransactionDeletionRecordItemDao eTransactionDeletionRecordItemDao) {
        return new TransactionDeletionRecordItemDto(
                eTransactionDeletionRecordItemDao.getName(),
                eTransactionDeletionRecordItemDao.getCreation(),
                eTransactionDeletionRecordItemDao.getModified(),
                eTransactionDeletionRecordItemDao.getModifiedBy(),
                eTransactionDeletionRecordItemDao.getOwner(),
                eTransactionDeletionRecordItemDao.getIsDocStatus(),
                eTransactionDeletionRecordItemDao.getIdx(),
                eTransactionDeletionRecordItemDao.getDocTypeName(),
                eTransactionDeletionRecordItemDao.getNoOfDocs(),
                eTransactionDeletionRecordItemDao.getParent(),
                eTransactionDeletionRecordItemDao.getParentField(),
                eTransactionDeletionRecordItemDao.getParentType());
    }

    public static void fromDTO(TransactionDeletionRecordItemDto vTransactionDeletionRecordItemDto, TransactionDeletionRecordItemDao eTransactionDeletionRecordItemDao) {
        eTransactionDeletionRecordItemDao.setName(vTransactionDeletionRecordItemDto.name());
        eTransactionDeletionRecordItemDao.setCreation(vTransactionDeletionRecordItemDto.creation());
        eTransactionDeletionRecordItemDao.setModified(vTransactionDeletionRecordItemDto.modified());
        eTransactionDeletionRecordItemDao.setModifiedBy(vTransactionDeletionRecordItemDto.modifiedBy());
        eTransactionDeletionRecordItemDao.setOwner(vTransactionDeletionRecordItemDto.owner());
        eTransactionDeletionRecordItemDao.setIsDocStatus(vTransactionDeletionRecordItemDto.isDocStatus());
        eTransactionDeletionRecordItemDao.setIdx(vTransactionDeletionRecordItemDto.idx());
        eTransactionDeletionRecordItemDao.setDocTypeName(vTransactionDeletionRecordItemDto.docTypeName());
        eTransactionDeletionRecordItemDao.setNoOfDocs(vTransactionDeletionRecordItemDto.noOfDocs());
        eTransactionDeletionRecordItemDao.setParent(vTransactionDeletionRecordItemDto.parent());
        eTransactionDeletionRecordItemDao.setParentField(vTransactionDeletionRecordItemDto.parentField());
        eTransactionDeletionRecordItemDao.setParentType(vTransactionDeletionRecordItemDto.parentType());
    }
}