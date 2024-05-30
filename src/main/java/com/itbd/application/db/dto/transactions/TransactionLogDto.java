package com.itbd.application.db.dto.transactions;

import com.itbd.application.db.dao.core.TransactionLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TransactionLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String rowIndex,
        String referenceDocType,
        String documentName,
        LocalDateTime timestamp,
        String checksumVersion,
        String previousHash,
        String transactionHash,
        String chainingHash,
        String data,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TransactionLogDto fromEntity(TransactionLogDao eTransactionLogDao) {
        return new TransactionLogDto(
                eTransactionLogDao.getName(),
                eTransactionLogDao.getCreation(),
                eTransactionLogDao.getModified(),
                eTransactionLogDao.getModifiedBy(),
                eTransactionLogDao.getOwner(),
                eTransactionLogDao.getIsDocStatus(),
                eTransactionLogDao.getIdx(),
                eTransactionLogDao.getRowIndex(),
                eTransactionLogDao.getReferenceDocType(),
                eTransactionLogDao.getDocumentName(),
                eTransactionLogDao.getTimestamp(),
                eTransactionLogDao.getChecksumVersion(),
                eTransactionLogDao.getPreviousHash(),
                eTransactionLogDao.getTransactionHash(),
                eTransactionLogDao.getChainingHash(),
                eTransactionLogDao.getData(),
                eTransactionLogDao.getAmendedFrom(),
                eTransactionLogDao.getUserTags(),
                eTransactionLogDao.getComments(),
                eTransactionLogDao.getAssign(),
                eTransactionLogDao.getLikedBy());
    }

    public static void fromDTO(TransactionLogDto vTransactionLogDto, TransactionLogDao eTransactionLogDao) {
        eTransactionLogDao.setName(vTransactionLogDto.name());
        eTransactionLogDao.setCreation(vTransactionLogDto.creation());
        eTransactionLogDao.setModified(vTransactionLogDto.modified());
        eTransactionLogDao.setModifiedBy(vTransactionLogDto.modifiedBy());
        eTransactionLogDao.setOwner(vTransactionLogDto.owner());
        eTransactionLogDao.setIsDocStatus(vTransactionLogDto.isDocStatus());
        eTransactionLogDao.setIdx(vTransactionLogDto.idx());
        eTransactionLogDao.setRowIndex(vTransactionLogDto.rowIndex());
        eTransactionLogDao.setReferenceDocType(vTransactionLogDto.referenceDocType());
        eTransactionLogDao.setDocumentName(vTransactionLogDto.documentName());
        eTransactionLogDao.setTimestamp(vTransactionLogDto.timestamp());
        eTransactionLogDao.setChecksumVersion(vTransactionLogDto.checksumVersion());
        eTransactionLogDao.setPreviousHash(vTransactionLogDto.previousHash());
        eTransactionLogDao.setTransactionHash(vTransactionLogDto.transactionHash());
        eTransactionLogDao.setChainingHash(vTransactionLogDto.chainingHash());
        eTransactionLogDao.setData(vTransactionLogDto.data());
        eTransactionLogDao.setAmendedFrom(vTransactionLogDto.amendedFrom());
        eTransactionLogDao.setUserTags(vTransactionLogDto.userTags());
        eTransactionLogDao.setComments(vTransactionLogDto.comments());
        eTransactionLogDao.setAssign(vTransactionLogDto.assign());
        eTransactionLogDao.setLikedBy(vTransactionLogDto.likedBy());
    }
}