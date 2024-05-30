package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.accounts.pos.PosInvoiceMergeLogDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record PosInvoiceMergeLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        LocalTime postingTime,
        String mergeInvoicesBasedOn,
        String posClosingEntry,
        String customer,
        String customerGroup,
        String consolidatedInvoice,
        String consolidatedCreditNote,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PosInvoiceMergeLogDto fromEntity(PosInvoiceMergeLogDao ePosInvoiceMergeLogDao) {
        return new PosInvoiceMergeLogDto(
                ePosInvoiceMergeLogDao.getName(),
                ePosInvoiceMergeLogDao.getCreation(),
                ePosInvoiceMergeLogDao.getModified(),
                ePosInvoiceMergeLogDao.getModifiedBy(),
                ePosInvoiceMergeLogDao.getOwner(),
                ePosInvoiceMergeLogDao.getIsDocStatus(),
                ePosInvoiceMergeLogDao.getIdx(),
                ePosInvoiceMergeLogDao.getPostingDate(),
                ePosInvoiceMergeLogDao.getPostingTime(),
                ePosInvoiceMergeLogDao.getMergeInvoicesBasedOn(),
                ePosInvoiceMergeLogDao.getPosClosingEntry(),
                ePosInvoiceMergeLogDao.getCustomer(),
                ePosInvoiceMergeLogDao.getCustomerGroup(),
                ePosInvoiceMergeLogDao.getConsolidatedInvoice(),
                ePosInvoiceMergeLogDao.getConsolidatedCreditNote(),
                ePosInvoiceMergeLogDao.getAmendedFrom(),
                ePosInvoiceMergeLogDao.getUserTags(),
                ePosInvoiceMergeLogDao.getComments(),
                ePosInvoiceMergeLogDao.getAssign(),
                ePosInvoiceMergeLogDao.getLikedBy());
    }

    public static void fromDTO(PosInvoiceMergeLogDto vPosInvoiceMergeLogDto, PosInvoiceMergeLogDao ePosInvoiceMergeLogDao) {
        ePosInvoiceMergeLogDao.setName(vPosInvoiceMergeLogDto.name());
        ePosInvoiceMergeLogDao.setCreation(vPosInvoiceMergeLogDto.creation());
        ePosInvoiceMergeLogDao.setModified(vPosInvoiceMergeLogDto.modified());
        ePosInvoiceMergeLogDao.setModifiedBy(vPosInvoiceMergeLogDto.modifiedBy());
        ePosInvoiceMergeLogDao.setOwner(vPosInvoiceMergeLogDto.owner());
        ePosInvoiceMergeLogDao.setIsDocStatus(vPosInvoiceMergeLogDto.isDocStatus());
        ePosInvoiceMergeLogDao.setIdx(vPosInvoiceMergeLogDto.idx());
        ePosInvoiceMergeLogDao.setPostingDate(vPosInvoiceMergeLogDto.postingDate());
        ePosInvoiceMergeLogDao.setPostingTime(vPosInvoiceMergeLogDto.postingTime());
        ePosInvoiceMergeLogDao.setMergeInvoicesBasedOn(vPosInvoiceMergeLogDto.mergeInvoicesBasedOn());
        ePosInvoiceMergeLogDao.setPosClosingEntry(vPosInvoiceMergeLogDto.posClosingEntry());
        ePosInvoiceMergeLogDao.setCustomer(vPosInvoiceMergeLogDto.customer());
        ePosInvoiceMergeLogDao.setCustomerGroup(vPosInvoiceMergeLogDto.customerGroup());
        ePosInvoiceMergeLogDao.setConsolidatedInvoice(vPosInvoiceMergeLogDto.consolidatedInvoice());
        ePosInvoiceMergeLogDao.setConsolidatedCreditNote(vPosInvoiceMergeLogDto.consolidatedCreditNote());
        ePosInvoiceMergeLogDao.setAmendedFrom(vPosInvoiceMergeLogDto.amendedFrom());
        ePosInvoiceMergeLogDao.setUserTags(vPosInvoiceMergeLogDto.userTags());
        ePosInvoiceMergeLogDao.setComments(vPosInvoiceMergeLogDto.comments());
        ePosInvoiceMergeLogDao.setAssign(vPosInvoiceMergeLogDto.assign());
        ePosInvoiceMergeLogDao.setLikedBy(vPosInvoiceMergeLogDto.likedBy());
    }
}