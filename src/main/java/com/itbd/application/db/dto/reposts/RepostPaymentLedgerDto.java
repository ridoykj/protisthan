package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.reposts.RepostPaymentLedgerDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RepostPaymentLedgerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        LocalDate postingDate,
        String voucherType,
        Boolean addManually,
        String repostStatus,
        String repostErrorLog,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RepostPaymentLedgerDto fromEntity(RepostPaymentLedgerDao eRepostPaymentLedgerDao) {
        return new RepostPaymentLedgerDto(
                eRepostPaymentLedgerDao.getName(),
                eRepostPaymentLedgerDao.getCreation(),
                eRepostPaymentLedgerDao.getModified(),
                eRepostPaymentLedgerDao.getModifiedBy(),
                eRepostPaymentLedgerDao.getOwner(),
                eRepostPaymentLedgerDao.getIsDocStatus(),
                eRepostPaymentLedgerDao.getIdx(),
                eRepostPaymentLedgerDao.getCompany(),
                eRepostPaymentLedgerDao.getPostingDate(),
                eRepostPaymentLedgerDao.getVoucherType(),
                eRepostPaymentLedgerDao.getAddManually(),
                eRepostPaymentLedgerDao.getRepostStatus(),
                eRepostPaymentLedgerDao.getRepostErrorLog(),
                eRepostPaymentLedgerDao.getAmendedFrom(),
                eRepostPaymentLedgerDao.getUserTags(),
                eRepostPaymentLedgerDao.getComments(),
                eRepostPaymentLedgerDao.getAssign(),
                eRepostPaymentLedgerDao.getLikedBy());
    }

    public static void fromDTO(RepostPaymentLedgerDto vRepostPaymentLedgerDto, RepostPaymentLedgerDao eRepostPaymentLedgerDao) {
        eRepostPaymentLedgerDao.setName(vRepostPaymentLedgerDto.name());
        eRepostPaymentLedgerDao.setCreation(vRepostPaymentLedgerDto.creation());
        eRepostPaymentLedgerDao.setModified(vRepostPaymentLedgerDto.modified());
        eRepostPaymentLedgerDao.setModifiedBy(vRepostPaymentLedgerDto.modifiedBy());
        eRepostPaymentLedgerDao.setOwner(vRepostPaymentLedgerDto.owner());
        eRepostPaymentLedgerDao.setIsDocStatus(vRepostPaymentLedgerDto.isDocStatus());
        eRepostPaymentLedgerDao.setIdx(vRepostPaymentLedgerDto.idx());
        eRepostPaymentLedgerDao.setCompany(vRepostPaymentLedgerDto.company());
        eRepostPaymentLedgerDao.setPostingDate(vRepostPaymentLedgerDto.postingDate());
        eRepostPaymentLedgerDao.setVoucherType(vRepostPaymentLedgerDto.voucherType());
        eRepostPaymentLedgerDao.setAddManually(vRepostPaymentLedgerDto.addManually());
        eRepostPaymentLedgerDao.setRepostStatus(vRepostPaymentLedgerDto.repostStatus());
        eRepostPaymentLedgerDao.setRepostErrorLog(vRepostPaymentLedgerDto.repostErrorLog());
        eRepostPaymentLedgerDao.setAmendedFrom(vRepostPaymentLedgerDto.amendedFrom());
        eRepostPaymentLedgerDao.setUserTags(vRepostPaymentLedgerDto.userTags());
        eRepostPaymentLedgerDao.setComments(vRepostPaymentLedgerDto.comments());
        eRepostPaymentLedgerDao.setAssign(vRepostPaymentLedgerDto.assign());
        eRepostPaymentLedgerDao.setLikedBy(vRepostPaymentLedgerDto.likedBy());
    }
}