package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.reposts.RepostAccountingLedgerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RepostAccountingLedgerDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        Boolean deleteCancelledEntries,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RepostAccountingLedgerDto fromEntity(RepostAccountingLedgerDao eRepostAccountingLedgerDao) {
        return new RepostAccountingLedgerDto(
                eRepostAccountingLedgerDao.getName(),
                eRepostAccountingLedgerDao.getCreation(),
                eRepostAccountingLedgerDao.getModified(),
                eRepostAccountingLedgerDao.getModifiedBy(),
                eRepostAccountingLedgerDao.getOwner(),
                eRepostAccountingLedgerDao.getIsDocStatus(),
                eRepostAccountingLedgerDao.getIdx(),
                eRepostAccountingLedgerDao.getCompany(),
                eRepostAccountingLedgerDao.getDeleteCancelledEntries(),
                eRepostAccountingLedgerDao.getAmendedFrom(),
                eRepostAccountingLedgerDao.getUserTags(),
                eRepostAccountingLedgerDao.getComments(),
                eRepostAccountingLedgerDao.getAssign(),
                eRepostAccountingLedgerDao.getLikedBy());
    }

    public static void fromDTO(RepostAccountingLedgerDto vRepostAccountingLedgerDto, RepostAccountingLedgerDao eRepostAccountingLedgerDao) {
        eRepostAccountingLedgerDao.setName(vRepostAccountingLedgerDto.name());
        eRepostAccountingLedgerDao.setCreation(vRepostAccountingLedgerDto.creation());
        eRepostAccountingLedgerDao.setModified(vRepostAccountingLedgerDto.modified());
        eRepostAccountingLedgerDao.setModifiedBy(vRepostAccountingLedgerDto.modifiedBy());
        eRepostAccountingLedgerDao.setOwner(vRepostAccountingLedgerDto.owner());
        eRepostAccountingLedgerDao.setIsDocStatus(vRepostAccountingLedgerDto.isDocStatus());
        eRepostAccountingLedgerDao.setIdx(vRepostAccountingLedgerDto.idx());
        eRepostAccountingLedgerDao.setCompany(vRepostAccountingLedgerDto.company());
        eRepostAccountingLedgerDao.setDeleteCancelledEntries(vRepostAccountingLedgerDto.deleteCancelledEntries());
        eRepostAccountingLedgerDao.setAmendedFrom(vRepostAccountingLedgerDto.amendedFrom());
        eRepostAccountingLedgerDao.setUserTags(vRepostAccountingLedgerDto.userTags());
        eRepostAccountingLedgerDao.setComments(vRepostAccountingLedgerDto.comments());
        eRepostAccountingLedgerDao.setAssign(vRepostAccountingLedgerDto.assign());
        eRepostAccountingLedgerDao.setLikedBy(vRepostAccountingLedgerDto.likedBy());
    }
}