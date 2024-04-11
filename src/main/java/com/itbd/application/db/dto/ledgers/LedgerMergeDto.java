package com.itbd.application.db.dto.ledgers;

import com.itbd.application.db.dao.ledgers.LedgerMergeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LedgerMergeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String rootType,
        String account,
        String accountName,
        String company,
        String status,
        Boolean isGroup,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LedgerMergeDto fromEntity(LedgerMergeDao eLedgerMergeDao) {
        return new LedgerMergeDto(
                eLedgerMergeDao.getName(),
                eLedgerMergeDao.getCreation(),
                eLedgerMergeDao.getModified(),
                eLedgerMergeDao.getModifiedBy(),
                eLedgerMergeDao.getOwner(),
                eLedgerMergeDao.getIsDocStatus(),
                eLedgerMergeDao.getIdx(),
                eLedgerMergeDao.getRootType(),
                eLedgerMergeDao.getAccount(),
                eLedgerMergeDao.getAccountName(),
                eLedgerMergeDao.getCompany(),
                eLedgerMergeDao.getStatus(),
                eLedgerMergeDao.getIsGroup(),
                eLedgerMergeDao.getUserTags(),
                eLedgerMergeDao.getComments(),
                eLedgerMergeDao.getAssign(),
                eLedgerMergeDao.getLikedBy());
    }

    public static void fromDTO(LedgerMergeDto vLedgerMergeDto, LedgerMergeDao eLedgerMergeDao) {
        eLedgerMergeDao.setName(vLedgerMergeDto.name());
        eLedgerMergeDao.setCreation(vLedgerMergeDto.creation());
        eLedgerMergeDao.setModified(vLedgerMergeDto.modified());
        eLedgerMergeDao.setModifiedBy(vLedgerMergeDto.modifiedBy());
        eLedgerMergeDao.setOwner(vLedgerMergeDto.owner());
        eLedgerMergeDao.setIsDocStatus(vLedgerMergeDto.isDocStatus());
        eLedgerMergeDao.setIdx(vLedgerMergeDto.idx());
        eLedgerMergeDao.setRootType(vLedgerMergeDto.rootType());
        eLedgerMergeDao.setAccount(vLedgerMergeDto.account());
        eLedgerMergeDao.setAccountName(vLedgerMergeDto.accountName());
        eLedgerMergeDao.setCompany(vLedgerMergeDto.company());
        eLedgerMergeDao.setStatus(vLedgerMergeDto.status());
        eLedgerMergeDao.setIsGroup(vLedgerMergeDto.isGroup());
        eLedgerMergeDao.setUserTags(vLedgerMergeDto.userTags());
        eLedgerMergeDao.setComments(vLedgerMergeDto.comments());
        eLedgerMergeDao.setAssign(vLedgerMergeDto.assign());
        eLedgerMergeDao.setLikedBy(vLedgerMergeDto.likedBy());
    }
}