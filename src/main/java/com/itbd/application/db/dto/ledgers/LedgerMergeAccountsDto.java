package com.itbd.application.db.dto.ledgers;

import com.itbd.application.db.dao.ledgers.LedgerMergeAccountsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LedgerMergeAccountsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String accountName,
        Boolean merged,
        String parent,
        String parentField,
        String parentType
) {
    public static LedgerMergeAccountsDto fromEntity(LedgerMergeAccountsDao eLedgerMergeAccountsDao) {
        return new LedgerMergeAccountsDto(
                eLedgerMergeAccountsDao.getName(),
                eLedgerMergeAccountsDao.getCreation(),
                eLedgerMergeAccountsDao.getModified(),
                eLedgerMergeAccountsDao.getModifiedBy(),
                eLedgerMergeAccountsDao.getOwner(),
                eLedgerMergeAccountsDao.getIsDocStatus(),
                eLedgerMergeAccountsDao.getIdx(),
                eLedgerMergeAccountsDao.getAccount(),
                eLedgerMergeAccountsDao.getAccountName(),
                eLedgerMergeAccountsDao.getMerged(),
                eLedgerMergeAccountsDao.getParent(),
                eLedgerMergeAccountsDao.getParentField(),
                eLedgerMergeAccountsDao.getParentType());
    }

    public static void fromDTO(LedgerMergeAccountsDto vLedgerMergeAccountsDto, LedgerMergeAccountsDao eLedgerMergeAccountsDao) {
        eLedgerMergeAccountsDao.setName(vLedgerMergeAccountsDto.name());
        eLedgerMergeAccountsDao.setCreation(vLedgerMergeAccountsDto.creation());
        eLedgerMergeAccountsDao.setModified(vLedgerMergeAccountsDto.modified());
        eLedgerMergeAccountsDao.setModifiedBy(vLedgerMergeAccountsDto.modifiedBy());
        eLedgerMergeAccountsDao.setOwner(vLedgerMergeAccountsDto.owner());
        eLedgerMergeAccountsDao.setIsDocStatus(vLedgerMergeAccountsDto.isDocStatus());
        eLedgerMergeAccountsDao.setIdx(vLedgerMergeAccountsDto.idx());
        eLedgerMergeAccountsDao.setAccount(vLedgerMergeAccountsDto.account());
        eLedgerMergeAccountsDao.setAccountName(vLedgerMergeAccountsDto.accountName());
        eLedgerMergeAccountsDao.setMerged(vLedgerMergeAccountsDto.merged());
        eLedgerMergeAccountsDao.setParent(vLedgerMergeAccountsDto.parent());
        eLedgerMergeAccountsDao.setParentField(vLedgerMergeAccountsDto.parentField());
        eLedgerMergeAccountsDao.setParentType(vLedgerMergeAccountsDto.parentType());
    }
}