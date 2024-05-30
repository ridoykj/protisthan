package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.accounts.repost.RepostAccountingLedgerItemsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RepostAccountingLedgerItemsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String voucherType,
        String voucherNo,
        String parent,
        String parentField,
        String parentType
) {
    public static RepostAccountingLedgerItemsDto fromEntity(RepostAccountingLedgerItemsDao eRepostAccountingLedgerItemsDao) {
        return new RepostAccountingLedgerItemsDto(
                eRepostAccountingLedgerItemsDao.getName(),
                eRepostAccountingLedgerItemsDao.getCreation(),
                eRepostAccountingLedgerItemsDao.getModified(),
                eRepostAccountingLedgerItemsDao.getModifiedBy(),
                eRepostAccountingLedgerItemsDao.getOwner(),
                eRepostAccountingLedgerItemsDao.getIsDocStatus(),
                eRepostAccountingLedgerItemsDao.getIdx(),
                eRepostAccountingLedgerItemsDao.getVoucherType(),
                eRepostAccountingLedgerItemsDao.getVoucherNo(),
                eRepostAccountingLedgerItemsDao.getParent(),
                eRepostAccountingLedgerItemsDao.getParentField(),
                eRepostAccountingLedgerItemsDao.getParentType());
    }

    public static void fromDTO(RepostAccountingLedgerItemsDto vRepostAccountingLedgerItemsDto, RepostAccountingLedgerItemsDao eRepostAccountingLedgerItemsDao) {
        eRepostAccountingLedgerItemsDao.setName(vRepostAccountingLedgerItemsDto.name());
        eRepostAccountingLedgerItemsDao.setCreation(vRepostAccountingLedgerItemsDto.creation());
        eRepostAccountingLedgerItemsDao.setModified(vRepostAccountingLedgerItemsDto.modified());
        eRepostAccountingLedgerItemsDao.setModifiedBy(vRepostAccountingLedgerItemsDto.modifiedBy());
        eRepostAccountingLedgerItemsDao.setOwner(vRepostAccountingLedgerItemsDto.owner());
        eRepostAccountingLedgerItemsDao.setIsDocStatus(vRepostAccountingLedgerItemsDto.isDocStatus());
        eRepostAccountingLedgerItemsDao.setIdx(vRepostAccountingLedgerItemsDto.idx());
        eRepostAccountingLedgerItemsDao.setVoucherType(vRepostAccountingLedgerItemsDto.voucherType());
        eRepostAccountingLedgerItemsDao.setVoucherNo(vRepostAccountingLedgerItemsDto.voucherNo());
        eRepostAccountingLedgerItemsDao.setParent(vRepostAccountingLedgerItemsDto.parent());
        eRepostAccountingLedgerItemsDao.setParentField(vRepostAccountingLedgerItemsDto.parentField());
        eRepostAccountingLedgerItemsDao.setParentType(vRepostAccountingLedgerItemsDto.parentType());
    }
}