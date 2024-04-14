package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.reposts.RepostPaymentLedgerItemsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RepostPaymentLedgerItemsDto(
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
    public static RepostPaymentLedgerItemsDto fromEntity(RepostPaymentLedgerItemsDao eRepostPaymentLedgerItemsDao) {
        return new RepostPaymentLedgerItemsDto(
                eRepostPaymentLedgerItemsDao.getName(),
                eRepostPaymentLedgerItemsDao.getCreation(),
                eRepostPaymentLedgerItemsDao.getModified(),
                eRepostPaymentLedgerItemsDao.getModifiedBy(),
                eRepostPaymentLedgerItemsDao.getOwner(),
                eRepostPaymentLedgerItemsDao.getIsDocStatus(),
                eRepostPaymentLedgerItemsDao.getIdx(),
                eRepostPaymentLedgerItemsDao.getVoucherType(),
                eRepostPaymentLedgerItemsDao.getVoucherNo(),
                eRepostPaymentLedgerItemsDao.getParent(),
                eRepostPaymentLedgerItemsDao.getParentField(),
                eRepostPaymentLedgerItemsDao.getParentType());
    }

    public static void fromDTO(RepostPaymentLedgerItemsDto vRepostPaymentLedgerItemsDto, RepostPaymentLedgerItemsDao eRepostPaymentLedgerItemsDao) {
        eRepostPaymentLedgerItemsDao.setName(vRepostPaymentLedgerItemsDto.name());
        eRepostPaymentLedgerItemsDao.setCreation(vRepostPaymentLedgerItemsDto.creation());
        eRepostPaymentLedgerItemsDao.setModified(vRepostPaymentLedgerItemsDto.modified());
        eRepostPaymentLedgerItemsDao.setModifiedBy(vRepostPaymentLedgerItemsDto.modifiedBy());
        eRepostPaymentLedgerItemsDao.setOwner(vRepostPaymentLedgerItemsDto.owner());
        eRepostPaymentLedgerItemsDao.setIsDocStatus(vRepostPaymentLedgerItemsDto.isDocStatus());
        eRepostPaymentLedgerItemsDao.setIdx(vRepostPaymentLedgerItemsDto.idx());
        eRepostPaymentLedgerItemsDao.setVoucherType(vRepostPaymentLedgerItemsDto.voucherType());
        eRepostPaymentLedgerItemsDao.setVoucherNo(vRepostPaymentLedgerItemsDto.voucherNo());
        eRepostPaymentLedgerItemsDao.setParent(vRepostPaymentLedgerItemsDto.parent());
        eRepostPaymentLedgerItemsDao.setParentField(vRepostPaymentLedgerItemsDto.parentField());
        eRepostPaymentLedgerItemsDao.setParentType(vRepostPaymentLedgerItemsDto.parentType());
    }
}